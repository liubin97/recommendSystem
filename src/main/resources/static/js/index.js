$(document).ready(function(){
    (function ($) {
        $.getUrlParam = function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return decodeURI(r[2]); return null;
        }
    })(jQuery);

    var id = $.getUrlParam('id');
    console.log(id);

    var data = [
        {
          moviename:"电影3",
          imgurl : "app-assets/img/photos/3.jpeg" ,
          level:"8.8"
        },
        {
            moviename:"电影2",
            imgurl : "app-assets/img/photos/3.jpeg" ,
            level:"8.8"
        }
        ];
    var count = 0;
    data.forEach(function(e) {
        console.log(e);
        $("#movie-list").append("<div class=\"card col-3\">\n" +
            "                <img class=\"card-img-top\" alt=\"Card image cap\" src="+ e.imgurl +">\n" +
            "                <div class=\"film-body\">\n" +
            "                  <div class=\"film-block  \">\n" +
            "\n" +
            "                    <label class=\"film-title  col-6 \"><a href=\"rating-page.html\">" + e.moviename + "</a></label>\n" +
            "                    <label class=\"film-title\"><a href=\"rating-page.html\">评分： " + e.level + "</a></label>\n" +
            "\n" +
            "                  </div>\n" +
            "\n" +
            "                </div>\n" +
            "\n" +
            "              </div>")
        count++;
        if(count>8){
            return;
        }
    });

});
