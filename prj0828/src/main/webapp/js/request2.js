
alert("hi");

function hi() {
	//alert(hi);

	let userNameTag = document.getElementById("userName")
	//alert(userNameTag);
	let userName = userNameTag.value;
	alert(userName);

	//
	window.location.href = "/prj0828/hi?name=" + userName;

}