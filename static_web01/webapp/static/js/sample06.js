/**
 *  document.createElement("tagName") : 엘리먼트 객체 생성
 * 
 *  부모 엘리먼트를 기준으로 자식 엘리먼트로 추가
 *      부모.prepend(추가할엘리먼트) : 첫번째 자식으로 추가
 *      부모.append(추가할엘리먼트) : 마지막 자식으로 추가
 * 
 *  형제 엘리먼트를 기준으로 같은 형제 엘리먼트로 추가
 *      형제.before(추가할엘리먼트) : 앞으로 추가
 *      형제.after(추가할엘리먼트) : 뒤로 추가
 */

/* 목록을 추가하는 함수 */
function addItem(form) {
    var item = form.item.value;
    var list = document.getElementById("list");

    var li = document.createElement("li");
    li.innerText = item;

    if(form.loc.value === 'first') {
        list.prepend(li);
    } else if(form.loc.value === 'last') {
        list.append(li);
    }

    form.item.value = "";
}

/* 
    테이블에 행을 추가하는 함수(5열) 
    제목/작성자 : 사용자 입력
    번호 : tbody의 행 수 + 1,
    작성일 : new Date() 객체 사용하여 현재 날짜
    조회수 : 기본값 0
*/
function addRow(form) {
    var tbody = document.getElementById("table").lastElementChild;
    var today = new Date();
    var year = today.getFullYear();
    var month = parseInt(today.getMonth())+1;
    var day = today.getDate();

    var tr = createTableRow(5);
    tr.children[0].innerText = tbody.children.length + 1;
    tr.children[1].innerText = setAndClear(form.title);
    tr.children[2].innerText = setAndClear(form.writer);
    tr.children[3].innerText = [year, month, day].join("-");
    tr.children[4].innerText = 0;
    tbody.append(tr);
}

function setAndClear(inputElement) {
    var value = inputElement.value;
    inputElement.value = "";
    return value;
}

function createTableRow(columnCount) {
    var row = document.createElement("tr");
    for(let idx = 0; idx < columnCount; idx++) {
        let column = document.createElement("td");
        row.append(column);
    }
    return row;
}

function validCheck(form) {
    /**
     * 동일한 패스워드를 사용하는지 검사 후 동일하지 않은 값을 입력한 경우
     * 패스워드 확인 입력 양식 옆에 "다시 입력하시오." 메시지 출력
     * username에서는 6자리 이상의 아이디가 아닌 경우 
     * 아이디 입력 양식 옆에 "6자리 이상 입력하시오." 메시지 출력
     */
    var isValid = true;
    if(form.username.nextElementSibling !== null) {
        form.username.nextElementSibling.remove();
    }
    if(form.username.value.length < 6) {
        spanErrorMessage(form.username, "6자리 이상 입력하시오.");
        form.username.value = "";
        isValid = false;
    }
    if(form.passwordCheck.nextElementSibling !== null) {
        form.passwordCheck.nextElementSibling.remove();
    }
    if(form.password.value !== form.passwordCheck.value) {
        spanErrorMessage(form.passwordCheck, "다시 입력하시오.");
        form.passwordCheck.value = "";
        isValid = false;
    }
    return isValid;
}

function spanErrorMessage(element, message) {
    let span = document.createElement("span");
    span.innerText = message;
    element.after(span);
    return span;
}