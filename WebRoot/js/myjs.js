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
		var objS = document.getElementById("selectSId");
	    var selectedSId = objS.options[objS.selectedIndex].value;
		$.ajax({
	        url:"updateStudentBySId",
	        type:"POST",
	        dataType:"html",
	        async: false,
	        data:{"SId":SId,"someValue":someValue,"typeName":typeName,"selectedSId":selectedSId},
	        success:function(data) {  
	        	$("#showStudent").html(data);//对应ID用#，对应CLASS用.
	        },   
	        error: function(XMLHttpRequest, textStatus, errorThrown) {
	        	alert(textStatus);
	        	alert("here");
	        	},
	        complete:function(data) {  
	        },
		   });	
	
	}
function selectChange(){
	var objS = document.getElementById("selectSId");
    var SId = objS.options[objS.selectedIndex].value;
    if("0"==SId) fillWithWords();
    else
    $.ajax({
        url:"selectStudentBySId",
        type:"POST",
        dataType:"html",
        async: false,
        data:{"SId":SId},
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
//暂时不用，逻辑有点问题
function selectDivChange(){
    $.ajax({
        url:"loadSelectStudent",
        type:"POST",
        dataType:"html",
        async: false,
        success:function(data) {  
        	$("#selectDiv").html(data);
        },   
        error: function(XMLHttpRequest, textStatus, errorThrown) {
        	alert(textStatus);
        	},
        complete:function(data) {  
        },
	   });	
}