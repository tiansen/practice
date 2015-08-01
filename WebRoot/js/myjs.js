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
function changeReadOnly(typeName){
		document.getElementById(typeName).readOnly=false;
	}

function saveChange(typeName,id){
	    var SId = document.getElementById("SId"+id).value;
		document.getElementById(typeName+id).readOnly=true;
		var someValue = document.getElementById(typeName+id).value;
		$.ajax({
	        url:"updateStudentBySId",
	        type:"POST",
	        dataType:"html",
	        async: false,
	        data:{"SId":SId,"someValue":someValue,"typeName":typeName},
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