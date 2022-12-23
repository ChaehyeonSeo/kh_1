function validForm() {
    /* 
        패스워드가 동일하면 서버에 전송 허용 / 동일하지 않으면 전송 불허 
        패스워드가 동일하지 않아서 서버에 전송을 하지 못한다고 폼 화면에 출력
    */
   var form = document.forms[0];
   var pass1 = form.password.value;
   var pass2 = form.passwordCheck.value;

   if(pass1 !== pass2) {
    form.passwordCheck.value = "";
    document.getElementById("passwordCheckError").innerText = "패스워드가 일치하지 않습니다. 다시 확인하세요."
    return false;   // 전송하지 않음
   }
}