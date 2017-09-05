<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <h2>
        A global community...
    </h2>
    <h3>
        Look at...
    </h3>

    <ol class="spittle-list">
        <c:forEach var="spittle" items="${spittles}">
            <s:url value="/spitters/{spitterName}"
                   var="spitter_url">
                <s:param name="spitterName"
            </s:url>
        </c:forEach>
    </ol>
</div>