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

function addItem(form) {
    /* 목록을 추가하는 함수 */
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

function addRow(form) {
    /* 
        테이블에 행을 추가하는 함수(5열) 
        제목/작성자 : 사용자 입력
        번호 : tbody의 행 수 + 1,
        작성일 : new Date() 객체 사용하여 현재 날짜
        조회수 : 기본값 0
    */
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