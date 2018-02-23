<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel='stylesheet' href='<c:url value="/Resources/css/style.css" />' type='text/css' media='all'/>
    <script type="text/javascript" src="/Resources/js/app.js"></script>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<h1>Add items to your Todo App</h1>

<form action="/submit" method="post">
    <input type="text" name="listItem"/>
    <input type="submit" value="Submit" name="submitted"/>
    <ul>
        <%--the outer for each is to loop over the map of todoItems to display value of each--%>
        <c:forEach items="${map1}" var="element" varStatus="loop">

            <li><input id="a${element.key}" onClick="check('${element.key}')" type="checkbox"
                       value='${element.key}' name="checkedItems"/>
                <input id='${element.key}' class="changeDefault" value="${element.value}"/>
            </li>

            <%--the innner forEach is to re-strike the texts that were marked but not deleted--%>
            <%--the innner forEach is to re-strike the texts that were marked but not deleted--%>
            <c:forEach items="${checkedItems}" var="checkedElementId">
                <c:set var="elementKey" value="${element.key}"/>
                <c:set var="checkedElementId" value="${checkedElementId}"/>

                <c:if test="${checkedElementId.equals(elementKey)}">
                    <script>
                        var y = 'a' + '${element.key}';
                        document.getElementById(y).click();
                    </script>
                </c:if>

            </c:forEach>
            <%--the inner forEach ends--%>

            <%--the inner forEach ends--%>
        </c:forEach>

    </ul>
    <input type="submit" value="delete" name="submitted"/>

    <%--${checkedItems}--%>
</form>

</body>
</html>