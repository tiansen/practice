function fillWithWords() {
	var content = document.getElementById("defaultContent").value;
	document.getElementById("show").value = content;
	$.ajax({
        url:"loadAllStudent",
        type:"POST",
        dataType:"html",
        async: false,
        success:function(data) {  
        	$("#showStudent").html(data);//对应ID用#，对应CLASS用.
        },   
        error: function(XMLHttpRequest, textStatus, errorThrown) {
        	alert(textStatus);
        	},
        complete:function(data) {  
        },
	   });	
	
}