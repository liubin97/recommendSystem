$(document).ready(function () {
    var dataSet = [];
    $.ajax({
        url: "/adminMovie/selectAllMovies",
        async: false,
        type: "GET",
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        success: function (result) {
            console.log(result);
            if (result.success) {
                if (result.data) {

                    result.data.forEach(function (item) {
                        var movie = [];
                        movie.push(item.movieId);
                        movie.push(item.title);
                        movie.push(item.genres);
                        movie.push(item.introduction);
                        movie.push(item.imageurl);
                        movie.push(item.director);
                        movie.push(item.actors)
                        dataSet.push(movie);
                    });
                } else {
                    alert("没有找到数据");
                }
            } else {
                alert("加载失败");
            }

        },
        error: function (error) {
            console.log("error");
        }
    })

    var table = $('#movie-table').DataTable( {
        data: dataSet,
        columns: [
            {title: "电影id"},
            { title: "电影名称" },
            { title: "电影分类" }
        ],
        language: {
            "sProcessing": "处理中...",
            "sLengthMenu": "显示 _MENU_ 项结果",
            "sZeroRecords": "没有匹配结果",
            "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
            "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
            "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
            "sInfoPostFix": "",
            "sSearch": "搜索:",
            "sUrl": "",
            "sEmptyTable": "表中数据为空",
            "sLoadingRecords": "载入中...",
            "sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上页",
                "sNext": "下页",
                "sLast": "末页"
            },
            "oAria": {
                "sSortAscending": ": 以升序排列此列",
                "sSortDescending": ": 以降序排列此列"
            }
        },
        info: true,
        select: true
    } );


    $("#del-btn").click(function () {

        var selectedData = table.rows(['.selected']).data();

        if (selectedData.length > 0) {
            table.rows('.selected').remove().draw(false);
            // $.ajax({
            //     url: "/adminMovie/deleteMovie",
            //     async: false,
            //     type: "POST",
            //     dataType: "json",
            //     contentType: "application/json;charset=utf-8",
            //     data: JSON.stringify(selectedData),
            //     success: function (result) {
            //
            //
            //     },
            //     error: function (error) {
            //         console.log("error");
            //     }
            // })

        } else {
            console.log("请选择要删除的数据");
        }


        console.log();
    })

    $("#add-confirm").click(function () {
        var title = $("#name").val();
        var genres = $("#genres").val();
        var introduction = $("#introduction").val();
        var director = $("#director").val();
        var actors = $("#actors").val()
        var fromData  = {
            title: title,
            genres: genres,
            introduction: introduction,
            director: director,
            actors: actors
        }
        var ids = table.columns().data()[0];
        var id = Math.max.apply(null, ids)+1;
        var newRow = [id,title,genres];
        var rows = []
        rows.push(newRow);
        var allRows = table.rows().data();
        allRows.each(function (item) {
            rows.push(item);
        })
        // var newRows = rows.concat(allRows);

        table.clear();
        table.rows.add(rows).draw();
        // $.ajax({
        //     url: "/adminMovie/addMovie",
        //     async: false,
        //     type: "POST",
        //     dataType: "json",
        //     contentType: "application/json;charset=utf-8",
        //     data: JSON.stringify(fromData),
        //     success: function (result) {
        //
        //
        //     },
        //     error: function (error) {
        //         console.log("error");
        //     }
        // })

    });

    $("#edit-btn").click(function () {

        var selectedData = table.rows(['.selected']).data();

        if (selectedData.length > 0) {
            if(selectedData.length>1){
                console.log("请选择单个电影")
                return;
            }
            var row = selectedData[0];
            $("#movieid").val(row[0])
            $("#u-name").val(row[1]);
            $("#u-genres").val(row[2]);
            // var introduction = $("#u-introduction").val(row[]);
            // var director = $("#u-director").val(row[2]);
            // var actors = $("#u-actors").val(row[2])
            //table.rows('.selected').remove().draw(false);
            // $.ajax({
            //     url: "/adminMovie/updateMovie",
            //     async: false,
            //     type: "POST",
            //     dataType: "json",
            //     contentType: "application/json;charset=utf-8",
            //     data: JSON.stringify(id),
            //     success: function (result) {
            //
            //
            //     },
            //     error: function (error) {
            //         console.log("error");
            //     }
            // })

        } else {
            alert("请选择要删除的数据");
        }


        console.log();
    })

    $("#u-add-confirm").click(function () {
        var moveid = $("#movieid").val();
        var title = $("#u-name").val();
        var genres = $("#u-genres").val();
        var introduction = $("#u-introduction").val();
        var director = $("#u-director").val();
        var actors = $("#u-actors").val()
        table.rows('.selected').remove().draw(false);
        var newRow = [moveid,title,genres];
        var rows = []
        rows.push(newRow);
        var allRows = table.rows().data();
        allRows.each(function (item) {
            rows.push(item);
        })
        // var newRows = rows.concat(allRows);
        table.clear();
        table.rows.add(rows).draw();

    });

});
