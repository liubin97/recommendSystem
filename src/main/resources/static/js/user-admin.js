$(document).ready(function () {
    var dataSet = [];
    $.ajax({
        url: "/adminUser/getUserList",
        async: false,
        type: "GET",
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        success: function (result) {
            console.log(result);
            if (result.success) {
                if (result.data) {

                    result.data.forEach(function (item) {
                        var user = [];
                        user.push(item.userId);
                        user.push(item.username);
                        user.push(item.gender === "M" ? "男" : "女");
                        user.push(item.age);
                        dataSet.push(user);
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

    var table = $('#user-table').DataTable({
        data: dataSet,
        columns: [
            {title: "id"},
            {title: "用户名"},
            {title: "性别"},
            {title: "年龄"}
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
    });

    $("#del-btn").click(function () {

        var selectedData = table.rows(['.selected']).data();
        var id ={
            userid:selectedData[0][0]
        };
        if (selectedData.length > 0) {
            if(selectedData.length>1){
                console.log("请选择单个用户")
                return;
            }
            $.ajax({
                url: "/adminUser/deleteUser",
                async: false,
                type: "POST",
                dataType: "json",
                contentType: "application/json;charset=utf-8",
                data: JSON.stringify(id),
                success: function (result) {
                    table.rows('.selected').remove().draw(false);

                },
                error: function (error) {
                    console.log("error");
                }
            })

        } else {
            console.log("请选择要删除的数据");
        }

    })


});
