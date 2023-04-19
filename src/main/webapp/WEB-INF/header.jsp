<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="mb-4">
    <nav class="navbar navbar-expand-md navbar-#1ed3a6 bg-#7a7a7a">
        <div class="container-fluid">

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="car-list.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="car-list.jsp">Category List</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                </form>

                <c:choose>
                    <c:when test="${empty sessionScope.username}">
                        <ul>
                            <li class="d-flex m-0">
                                <button><a class="nav-link active" aria-current="page" href="login">Login</a></button>
                            </li>
                        </ul>
                    </c:when>
                </c:choose>
                </ul>
            </div>
        </div>
        <c:if test="${not empty sessionScope.username}">
            <ul>
                <form class="d-flex m-0" action="${pageContext.request.contextPath}/user/logout" method="get">
                    <button class="nav-link active" aria-current="page" type="submit">Logout</button>
                </form>
            </ul>
        </c:if>

    </nav>
</header>