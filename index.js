let usernameInput = document.getElementById("usernameInput");
let passwordInput = document.getElementById("passwordInput");
let submitButton = document.getElementById("submitButton");
submitButton.addEventListener("click", postLoginRequest)


async function postLoginRequest(){
    console.log("starting login")
    let usernameValue = usernameInput.value;
    let passwordValue = passwordInput.value;
    let response = await fetch("https://dummyjson.com/auth/login",
    {
        mode:"cors",
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body:JSON.stringify({
            username:usernameValue,
            password:passwordValue
        })
    })
    console.log(response);
    if(response.status == 400){
        alert("incorrect login!")
    }else if(response.status == 200){
        console.log(await response.json());
        window.location.replace("profile.html");
    }else{
        alert("server error or other")
    }



}