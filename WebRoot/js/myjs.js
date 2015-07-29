function fillWithWords() {
	var content = document.getElementById("defaultContent").value;
	document.getElementById("show").value = content;
	alert("here");
	$.ajax({
        url:"loadAllStudent",
        type:"POST",
        dataType:"html",
        async: false,
        success:function(data) {  
        	alert(data);
        	$("showStudent").html(data);
        },   
        error: function(XMLHttpRequest, textStatus, errorThrown) {
        	alert(textStatus);
        	},
        complete:function(data) {  
        },
	   });	
	
}