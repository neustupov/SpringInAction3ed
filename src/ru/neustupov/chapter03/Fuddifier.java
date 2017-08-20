package ru.neustupov.chapter03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class Fuddifier  implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {

        Field[] fields = bean.getClass().getDeclaredFields();

        try{
            for(int i = 0; i < fields.length; i++){
                if(fields[i].getType().equals(String.class)){
                    fields[i].setAccessible(true);
                    String original = (String) fields[i].get(bean);
                    fields[i].set(bean,fuddify(original));
                }
            }
        }catch (IllegalAccessException e){e.printStackTrace();}

        return bean;
    }

    private String fuddify(String orig){
        if(orig == null) return orig;
        return orig.replaceAll("(r|l)", "w").replaceAll("(R|L)","W");
    }
}
