function createList(id) {
    var resultDiv = document.getElementById(id);
    var items = getListItems();

    /* items 배열에 있는 데이터를 사용하여 ul, li 태그 문자열로 만드는 로직 작성 */
    var ulTag = "<ul>";
    for(let item of items) {
        ulTag += "<li>" + item + "</li>"
    }
    ulTag += "</ul>";

    resultDiv.innerHTML = ulTag;                                                                                                                                                 ;
}

// 프롬프트로 입력받은 문자열을 배열로 만들어서 반환하는 함수
function getListItems() {
    var items = prompt("쉼표를 구분자로 하는 목록을 작성하세요.");
    return items.split(",");
}

// 1월 ~ 12월 까지 생성. 현재 월이 select 태그에 초기 선택되어 나와야 함.
function createMonth(id) {
    var selectTag = document.getElementById(id);
    var date = new Date();
    var currentMonth = date.getMonth();

    var optionTag;
    for(var i = 1; i <= 12; i++) {
        optionTag += i == currentMonth + 1 ? "<option selected>" : "<option>";
        optionTag += i + "월</option>";
    }
    selectTag.innerHTML = optionTag;
}