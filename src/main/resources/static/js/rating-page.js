$(document).ready(function() {
    (function ($) {
        $.getUrlParam = function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return decodeURI(r[2]);
            return null;
        }
    })(jQuery);

    var id = $.getUrlParam('id');
    var url = $.getUrlParam('url');
    console.log(id);
    console.log(url);
})
