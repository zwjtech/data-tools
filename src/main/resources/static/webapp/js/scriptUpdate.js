$(function () {

    $("body").on("click",".serverSet",function () {
        if ($(this).text() === "编辑") {
            $(this).text("保存");
            $(this).parent().find(".serverName").hide();
            $(this).parent().find(".username").hide();
            $(this).parent().find(".password").hide();
            $(this).parent().find(".url").hide();
            $(this).parent().find(".serverNameHide").show();
            $(this).parent().find(".usernameHide").show();
            $(this).parent().find(".passwordHide").show();
            $(this).parent().find(".urlHide").show();
        } else {
            $(this).text("编辑");
            $(this).parent().find(".serverName").text($(this).parent().find(".serverNameHide").val().trim()).show();
            $(this).parent().find(".username").text($(this).parent().find(".usernameHide").val().trim()).show();
            $(this).parent().find(".password").text($(this).parent().find(".passwordHide").val().trim()).show();
            $(this).parent().find(".url").text($(this).parent().find(".urlHide").val()).show();
            $(this).parent().find(".serverNameHide").hide();
            $(this).parent().find(".usernameHide").hide();
            $(this).parent().find(".passwordHide").hide();
            $(this).parent().find(".urlHide").hide();
        }
    });

    $(".moreSever").click(function () {
        $(".serverList").append(
            '<div class="server">\n' +
            '<p><span>服务器名:</span><span class="serverName">服务器名</span><span><input type="text" class="serverNameHide hideInput"></span></p>\n' +
            '<p><span>url:</span><span class="url">url</span><span><input type="text" class="urlHide hideInput"></span></p>\n' +
            '<p><span>username:</span><span class="username">username</span><span><input type="text" class="usernameHide hideInput"></span></p>\n' +
            '<p><span>password:</span><span class="password">password</span><span><input type="text" class="passwordHide hideInput"></span></p>\n' +
            '<button class="btn serverSet">编辑</button>\n' +
            '<button class="btn serverDel" onclick="$(this).parent().remove()">删除</button>\n' +
            '</div>')
    });


    var websocket = null;
    var wsUri = "ws://127.0.0.1:8089";
    webSocketInit();
    /**
     * websocket连接 开启，处理函数
     */
    function webSocketInit(){
        if(websocket!=null){
            websocket.close();
            websocket=null;
        }
        websocket= new WebSocket(wsUri);
        //建立连接时触发
        websocket.onopen=function(evt){//接收到的数据
        };
        //接收到后台数据时触发
        websocket.onmessage = function (evt) {
            var data = eval('(' + evt.data + ')');
            if (data.type == "true") {
                $(".consoleMsg").append("<pre>" + data.result + "</pre>")
            } else if(data.type == "false") {
                $(".consoleMsg").append("<pre style='color: #ff0000;'>" + data.result + "</pre>")
            } else if(data.type == "comments"){
                $(".consoleMsg").append("<pre style='color: #00CD00;'>" + data.result + "</pre>")
            }
        };
        //发送错误时，触发
        websocket.onerror=function(evt){

        };
        //关闭连接时触发
        websocket.onclose=function(evt){

        }
    }

    $("#execute").click(function () {
        var data = {};
        for(var i = 0; i < $(".value").length; i++){
            var _this = $(".value").eq(i);
            var id = _this.attr("id");
            data[id] = _this.val();
        }
        $.ajax({
            type: "post",
            dataType: "json",
            url: "http://localhost:8086/script/sqlExecute",
            data: data,
            success: function (result) {
                if(result.result == "success"){
                    alert("操作成功");
                }else {
                    alert("操作失败");
                }
            },
            error: function () {
                alert("操作失败");
            }
        })
    })

    // function listAllDatasourceConfig() {
    //     $.ajax({
    //         type: "get",
    //         dataType: "json",
    //         url: "http://localhost:8086/datasourceconfig/listAllDatasourceConfig",
    //         success: function (result) {
    //             var serverListStr = "";
    //             var serverSelectStr = "";
    //             for(var i=0;i<result.length;i++){
    //                 serverListStr = serverListStr+"<div class=\"server\">\n" +
    //                     "                <p><span>服务器名称:</span><span class=\"name\">"+result[i].name+"</span><span><input type=\"text\" class=\"nameHide\"></span></p>\n" +
    //                     "                <p><span>url:</span><span class=\"url\">"+result[i].address+"</span><span><input type=\"text\" class=\"urlHide\"></span></p>\n" +
    //                     "                <p><span>username:</span><span class=\"username\">"+result[i].account+"</span><span><input type=\"text\" class=\"usernameHide\"></span></p>\n" +
    //                     "                <p><span>password:</span><span class=\"password\">"+result[i].password+"</span><span><input type=\"text\" class=\"passwordHide\"></span></p>\n" +
    //                     "                <button class=\"btn serverSet\">编辑</button>\n" +
    //                     "            </div>";
    //                 serverSelectStr = serverSelectStr + " <option value="+result[i].name+">"+result[i].name+"</option>";
    //             }
    //             $('#serverList').append(serverListStr);
    //             $('#serverName').append(serverSelectStr);
    //         },
    //         error: function () {
    //             alert("操作失败");
    //         }
    //     })
    // }
    // listAllDatasourceConfig();
});