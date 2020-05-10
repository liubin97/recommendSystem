
$(document).ready(function(){

    $("#loginButton").click(function(){
        var data = {
            "username": $("#username").val(),
            "password":$("#password").val()
        };

        $.ajax({
            url:"/adminUser/adminLogin",
            async:false,
            type:"POST",
            data: JSON.stringify(data) ,
            dataType:"json",
            contentType: "application/json;charset=utf-8",
            success: function(result){
                console.log(result);
                if(result.success){
                    var id = result.data;
                    window.location.href="movie-admin.html";
                }
                else{
                    alert(result.errMsg);
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
