$(document).on("click" , "#findTicketBtn" , function () {
$.get("mainServlet" , function (responseXml) {
    $(".ticket").html($(responseXml).find("data").html());
    console.log("1");
    console.log($(responseXml).find("data"));
    console.log($(responseXml).find("List"));
    console.log($(responseXml).find("ticketList"));

});});