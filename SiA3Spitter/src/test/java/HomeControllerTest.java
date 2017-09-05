import ru.neustupov.controller.HomeController;
import ru.neustupov.model.Spit;
import ru.neustupov.service.SpitterService;

import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static ru.neustupov.controller.HomeController.DEFAULT_SPITTLES_PER_PAGE;

public class HomeControllerTest {
    public void shouldDisplayRecentSpittles(){
        List<Spit> expectedSpittles = asList(new Spit(), new Spit(), new Spit());

        SpitterService spitterService = mock(SpitterService.class);

        when(spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE)).thenReturn(expectedSpittles);

        HomeController controller = new HomeController(spitterService);

        HashMap<String, Object> model = new HashMap<String, Object>();

        String viewName = controller.showHomePage(model);

        assertEquals("home", viewName);

        assertSame(expectedSpittles, model.get("spittles"));
        verify(spitterService).getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE);
    }
}
