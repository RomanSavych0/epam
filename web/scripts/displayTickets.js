firstCityForm = document.querySelector("#firstCity");
secondCityForm = document.querySelector("#secondCity");
seachTicketButton = document.querySelector("#findTicketBtn");
ticketFirstCity = document.querySelectorAll(".ticket-first-city");
ticketList = document.querySelectorAll(".ticket-list");
ticketSecondCity = document.querySelectorAll(".ticket-second-city");
ticket = document.querySelectorAll(".ticket");

seachTicketButton.onclick = function () {
    // alert(firstCityForm.value);
    // alert(secondCityForm.value);


    // alert(firstCityForm.value === ticketFirstCity[0].innerText.trim());
    // alert(firstCityForm.value);
    // let str =ticketFirstCity[0].textContent;
    // console.log(str.trim())

    for (let i = 0; i < ticket.length; i++) {
        if (firstCityForm.value === ticketFirstCity[i].innerText.trim()) {
            ticketList[0].style.display = 'flex';
            ticket[i].style.display = 'flex';
        }


    }


};


