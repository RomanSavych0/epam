let buttons = document.getElementsByClassName("price");
let  cities = document.getElementsByClassName("city-direct");

for (let i = 0; i < buttons.length; i++) {
    buttons[i].onclick = function () {
        let splitedArray = splitString(cities[i].innerText, "-");
        let firstCity = document.getElementById("firstCity");
        let secondCity = document.getElementById("secondCity");
        firstCity.value = splitedArray[0];
        secondCity.value = splitedArray[1];
        scrollTop();
    }
}

function splitString(stringToSplit, separator) {
    return stringToSplit.split(separator);

}

function scrollTop() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}