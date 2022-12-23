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
    var inputTitle = form.title.value;
    var inputWriter = form.writer.value;
    var today = new Date();
    var year = today.getFullYear();
    var month = parseInt(today.getMonth())+1;
    var day = today.getDate();

    var tbody = document.getElementById("table");
    var tr = document.createElement("tr");
    var td1 = document.createElement("td");
    var td2 = document.createElement("td");
    var td3 = document.createElement("td");
    var td4 = document.createElement("td");
    var td5 = document.createElement("td");
    td1.innerText = tbody.rows.length;
    td2.innerText = inputTitle;
    td3.innerText = inputWriter;
    td4.innerText = year + "-" + month + "-" + day;
    td5.innerText = 0;
    tr.append(td1);
    tr.append(td2);
    tr.append(td3);
    tr.append(td4);
    tr.append(td5);
    tbody.append(tr);

    form.title.value = "";
    form.writer.value = "";
}