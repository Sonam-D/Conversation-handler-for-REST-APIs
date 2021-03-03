var path1=0;
$(document).ready(function(){
	
$('#submit').click(function(){
var name =$("#Name").val();
var api_number= $("#myList").val();

console.log("Current Api");
console.log(api_number);

console.log(path1);
//if city first char = a-n, implement 1 ajax else implement other
//if path1== api_number
//var path1;
var data= 'http://localhost:8080/conversation_handler/webapi/api'+api_number+'/'+name;
//show(data);

if((path1==0) || (path1==api_number)){
//if(name != ''){

	$.ajax({
		
		url:data,
		type: "GET",
//		dataType: "xml",
		success: function(data1){//response returned in data1
			
			console.log(data1);
			var widget = show(data1);	
			$("#show").html(widget);
//			 $("#show").html(data1.name);
			path1= data1.path;
//			$("#show").html(data1.name);
//			 
	//		console.log(widget);
//	           $("#show").html(widget);

		}
	});



}
else{
$("#error").html('Field cannot be enmpty')
	
//	show(data);
}



});


//show(data);

});


	
	
	
function show(data1){
    
 //   $("#show").html(data1);
    return "<h3>{Name}: {"+data1.name+ "}"+"</h3>"+
    "<h3>{Date_time}: {"+data1.date+ "}"+"</h3>";
//    
}



 

