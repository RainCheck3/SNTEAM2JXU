var para = document.createElement("p"); //creates new HTML paragraph element

var node = document.createTextNode("This is new."); //creates a text node

para.appendChild(node); //appends text node to paragraph element created

var element = document.getElementById("div1"); 

//append paragraph element to div targeted in previous statement
element.appendChild(para);

var myCar = new Object();
myCar.make="Ford";
myCar.model = "Mustang";
myCar.year = 1969;

myCar["make"] = "Ford";
myCar["model"] = "Mustang";
myCar["year"] = 1969;

var btnRef = document.getElementById('btn');

btnRef.style.color = 'blue';

btnRef.style.backgroundColor = 'yellow';

