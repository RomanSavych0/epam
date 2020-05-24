<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26.03.2020
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="/content.css" rel="stylesheet">
    <link href="/footerStyle.css" rel="stylesheet">
    <link href="/headerStyle.css" rel="stylesheet">
    <link href="/hiddenDivs.css" rel="stylesheet">
    <link href="/popularDirections.css" rel="stylesheet">
    <link href="/visibleContent.css" rel="stylesheet">
    <title>index</title>
    <script src="http://code.jquery.com/jquery-2.2.4.js"
            type="text/javascript"></script>
</head>

<body>

<header>
    <div class="logo"><img src="images/Logo.png" alt="" id="logo"></div>
    <nav>
        <a href="#" class="nav-item">Reference1</a>
        <a href="#" class="nav-item">Reference2</a>
        <a href="#" class="nav-item">Reference3</a>
    </nav>
</header>
<div class="content">
    <div class="buyTicketsText">
        <h1>Купити квитки </h1>
    </div>


    <div class="aboutTicket">
        <form class="findTicketForm" action="mainServlet" method="get">
            <input type="hidden" name="command" value="findTicket">
            <input type="text" placeholder="Звідки?" class="cityInput" id="firstCity" name="firstCity">
            <img src="images/arrow.png" alt="#" id="arrow">
            <input type="text" placeholder="Куди?" class="cityInput" id="secondCity" name="secondCity">
            <input type="submit" value="Знайти квиток" id="findTicketBtn">

        </form>

    </div>


    <div class="ticket-items">

        <c:forEach var="ticketList" items="${List}">
            <div class="ticket-item" style="color:#ffff99" >
                <div class="info-ticket">
                    Відправляється з
                        ${ticketList.from}
                </div>
                <div class="info-ticket">
                    Прибуває в
                        ${ticketList.to}
                </div>

                <div class="info-ticket">
                    Ціна
                        ${ticketList.price}
                </div>

                <div class="info-ticket">
                    Дата

                        ${ticketList.date}
                </div>

                <div class="info-ticket">
                    Час
                        ${ticketList.time}
                </div>

                <div class="ticket-content">
                    <input type="submit" value="Купити квиток" class="buy-ticket-btn">
                </div>
                <div class="passenger-form">
                    <form action="mainServlet" method="post">
                        <input type="hidden" name="command" value="addPassenger">
                        <input type="text" placeholder="input Name" class="passenger-dynamic-input" name="firstName">
                        <input type="text" placeholder="input Surname" class="passenger-dynamic-input" name="surname">
                        <input type="checkbox" placeholder="have privill?" name="privilege"> is you have any priviligue?
                        <input type="submit" value="Купити" class="insert-passenger-into-bd">

                    </form>
                </div>
            </div>
        </c:forEach>


    </div>

</div>


<div class="visibleContent">
    <div class="text"><h2>Чому варто купляти квитки саме в нас</h2></div>
    <div class="row">
        <div class="row-image">
            <img src="images/light.png" alt="" class="row-img">
            <div class="description">
                <p>Простота</p>
            </div>
            <div class="additional-description" id="additionalDesk1">Ніяких зайвих дій - нам важливо<br> зберегти
                Ваш час
            </div>
        </div>
        <div class="row-image">
            <img src="images/security.png" alt="" class="row-img">
            <div class="description">
                <p>Надійність</p>
            </div>
            <div class="additional-description" id="additionalDesk2">Купувати квитки в нас не менш <br>надійно, ніж
                у касі
            </div>
        </div>
        <div class="row-image">
            <img src="images/community.png" alt="" class="row-img">
            <div class="description">
                <p>Підтримка</p>
                <div class="additional-description" id="additionalDesk3"> Служба підтримки відповість на <br>всі
                    Ваші питання в будь-який
                    час
                </div>
            </div>
        </div>

    </div>

</div>
<div class="popular-directions">
    <h2 id="popular-directions-main-text">Популярні напрямки</h2>
</div>
<div class="popular-directions-row row">
    <div class="city">
        <img src="images/kyiv.jpg" alt="" class="cityImage">

        <div class="popular-direction-text">
            <div class="city-direct">
                Київ-Львів
            </div>
            <button type="submit" class="price"><span>від 188 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Київ-Харків
            </div>
            <button type="submit" class="price"><span>від 85 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Київ-Одеса
            </div>
            <button type="submit" class="price"><span>від 111 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Київ-Маріуполь
            </div>

            <button type="submit" class="price"><span> від 123 грн</span></button>
        </div>

    </div>

    <div class="city"><img src="images/Lviv.jpg" alt="" class="cityImage">
        <div class="popular-direction-text">
            <div class="city-direct">
                Львів-Київ
            </div>
            <button type="submit" class="price"><span>від 188 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Львів-Харків
            </div>
            <button type="submit" class="price"><span>від 85 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Львів-Одеса
            </div>
            <button type="submit" class="price"><span>від 111 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Львів-Маріуполь
            </div>

            <button type="submit" class="price"><span> від 123 грн</span></button>
        </div>


    </div>
    <div class="city"><img src="images/harkiv.jpg" alt="" class="cityImage">
        <div class="popular-direction-text">
            <div class="city-direct">
                Харків-Львів
            </div>
            <button type="submit" class="price"><span>від 188 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Харків-Київ
            </div>
            <button type="submit" class="price"><span>від 85 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Харків-Одеса
            </div>
            <button type="submit" class="price"><span>від 111 грн</span></button>
        </div>
        <div class="popular-direction-text">
            <div class="city-direct">
                Харків-Маріуполь
            </div>

            <button type="submit" class="price"><span> від 123 грн</span></button>
        </div>
    </div>


</div>


<div>
    <c:forEach var="ticketList" items="${List}">
        ${ticketList.from}

    </c:forEach>
</div>
</div>
<script src="scripts/footerScript.js"></script>
<script src="scripts/ticketScript.js"></script>

</body>
</html>
