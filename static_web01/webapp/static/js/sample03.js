/*
    document.getElementById             id 속성값을 사용하여 엘리먼트 선택
    document.getElementsByName          name 속성값 사용하여 엘리먼트 선택
    document.getElementsByTagName       태그명을 사용하여 엘리먼트 선택
    document.getElementsByClassName     class 속성값 사용하여 엘리먼트 선택

    document.querySelector              CSS의 선택자 활용하여 1개의 엘리먼트 선택
    document.querySelectorAll           CSS의 선택자 활용하여 다수의 엘리먼트 선택 
*/
function changeUpper() {
    var listItems = document.getElementsByClassName("menu-item");
    // var listItems = document.querySelectorAll(".menu-item");

    for(let item of listItems) {
        item.innerText = item.innerText.toUpperCase();
    }
}