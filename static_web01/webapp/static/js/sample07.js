/**
 * 아이디, 패스워드를 검사 후 오류가 발생하는 경우
 * 사용자 입력 폼에 에러 메세지가 담긴 span 태그를 
 * 추가하고 입력 양식에는 테두리를 붉게 설정하여
 * 사용자가 잘못된 입력이라는 것을 알 수 있게 하세요.
 * 
 * 아이디는 6자리 미만인 경우 오류 발생
 * 패스워드는 패스워드 확인과 동일하지 않을 때 오류 발생
 * 패스워드 4자리 미만인 경우 오류 발생
 */

function validCheck(form) {
    var isValid = true;
    if(form.username.nextElementSibling !== null) {
        form.username.nextElementSibling.remove();
    }
    if(form.username.value.length < 6) {
        var error = createErrorMessage("아이디는 6자리 이상 입력하십시오.");
        form.username.after(error);
        errorInput(form.username);
        isValid = false;
    }
    if(form.password.nextElementSibling !== null) {
        form.password.nextElementSibling.remove();
    }
    if(form.password.value.length < 4) {
        var error = createErrorMessage("패스워드는 4자리 이상 입력하십시오.");
        form.password.after(error);
        errorInput(form.password);
        isValid = false;
    }
    if(form.passwordCheck.nextElementSibling !== null) {
        form.passwordCheck.nextElementSibling.remove();
    }
    if(form.password.value !== form.passwordCheck.value) {
        var error = createErrorMessage("패스워드를 확인하십시오.");
        form.passwordCheck.after(error);
        errorInput(form.passwordCheck);
        isValid = false;
    }
    return isValid;
}
function errorInput(element) {
    element.value = "";
    // element.style.borderColor = "red";
    // element.style.borderStyle = "solid";
    element.classList.add("is-invalid");
}
function createErrorMessage(message) {
    var div = document.createElement("div");
    div.className = "invalid-feedback";
    div.innerText = message;
    return div;
}