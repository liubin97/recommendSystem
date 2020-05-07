var urlheader = "http://localhost:8080/RecommendSystem";

$(document).ready(function(){
    $("#mybutton").click(function(){
        $.ajax({
            url:"/adminMovie/selectAllMovies",
            async:false,
            type:"GET",
            dataType:"json",
            success: function(result){
                console.log(result);
                window.location.href="index.html";
            },
            error:function(error){
                console.log("error");
            }
        })
    });
  });
