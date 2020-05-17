$(document).ready(function(){
    var dataSet = [];
    $.ajax({
        url:"/adminUser/getUserList",
        async:false,
        type:"GET",
        dataType:"json",
        contentType: "application/json;charset=utf-8",
        success: function(result){
            console.log(result);
            if(result.success){
                if(result.data){

                    result.data.forEach(function (item) {
                        var user = [];
                        user.push(item.userId);
                        user.push(item.username);
                        user.push(item.gender==="male" ? "男" : "女");
                        user.push(item.age);
                        dataSet.push(user);
                    });
                }else{
                    alert("没有找到数据");
                }
            }
            else{
                alert(result.msg);
            }

        },
        error:function(error){
            console.log("error");
        }
    })

    $('#user-table').DataTable( {
        data: dataSet,
        columns: [
            { title: "id" },
            { title: "用户名" },
            { title: "性别" },
            { title: "年龄" }
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
});
