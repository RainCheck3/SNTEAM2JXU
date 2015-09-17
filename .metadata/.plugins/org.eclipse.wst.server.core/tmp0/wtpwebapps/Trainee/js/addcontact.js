function contact() {
	var firstName,
	var lastName,
	var phoneNumber
};

var submitRef = document.getElementById("submitbtn");

var eventHandler = function() {
	var newContact = new contact();
	newContact.firstName = document.firstname.value;
	//newContact.lastName= document.getElementById(lname).valueOf();
	//newContact.phoneNumber = $("#number");
	//Now post to server
	alert("Posting to server: " + newContact.firstName + '\n' + newContact.lastName + '\n' + newContact.phoneNumber);
};

submitRef.addEventListener("click", eventHandler);

//
