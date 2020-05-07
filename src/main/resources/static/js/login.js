
$(document).ready(function(){

    $("#login").click(function(){
        var data = {
            "username": $("#name").val(),
            "password":$("#pass").val()
        };

        $.ajax({
            url:"/login",
            async:false,
            type:"POST",
            data: JSON.stringify(data) ,
            dataType:"json",
            contentType: "application/json;charset=utf-8",
            success: function(result){
                console.log(result);
                if(result.success){
                    var id = result.data;
                    window.location.href="index.html?id="+id;
                }
                else{
                    alert(result.msg);
                }

                //alert(result);
                //window.location.href="index.html";
            },
            error:function(error){
                console.log("error");
            }
        })
    });

});
