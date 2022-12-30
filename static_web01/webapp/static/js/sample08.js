window.onload = function() {
    var div = document.getElementById("id_div");
    var input = document.getElementById("id_input");
    var select = document.getElementById("id_select")

    input.addEventListener("focus", eventHandler);
    // input.onfocus = function() {console.log("focus 이벤트 발생!!")};

    //입력창에서 빠져나오면 blur
    input.addEventListener("blur", eventHandler);
    input.addEventListener("input", eventHandler);

    div.addEventListener("mouseenter", eventHandler);
    input.addEventListener("mouseenter", eventHandler);

    div.addEventListener("mouseleave", eventHandler);
    input.addEventListener("mouseleave", eventHandler);

    div.addEventListener("click", eventHandler);
    input.addEventListener("click", eventHandler);

    div.addEventListener("dblclick", eventHandler);
    input.addEventListener("dblclick", eventHandler);

    input.addEventListener("change", eventHandler);
    select.addEventListener("change", eventHandler);
}

function eventHandler(e) {
    switch(e.type) {
        case "click":
            console.log("클릭 이벤트 발생!!"); break;
        case "dblclick":
            console.log("더블 클릭 이벤트 발생!!"); break;
        case "focus":
            console.log("포커스 이벤트 발생!!"); break;
        case "blur":
            console.log("블러 이벤트 발생!!"); break;
        case "input":
            console.log("입력 이벤트 발생!!"); break;
        case "change":
            console.log("값 변경 이벤트 발생!!"); break;
        case "mouseenter":
            console.log("마우스엔터 이벤트 발생"); break;
        case "mouseleave":
            console.log("마우스리브 이벤트 발생"); break;
    }
    console.log(e.target);
}