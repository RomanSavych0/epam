let buyTicketButtons = document.querySelectorAll(".buy-ticket-btn");
let forms = document.querySelectorAll(".passenger-form ");
for (let i = 0; i <buyTicketButtons.length ; i++) {
    buyTicketButtons[i].onclick = function () {
        forms[i].style.display ='flex';
    }

}