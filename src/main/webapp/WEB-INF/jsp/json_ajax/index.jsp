<%--
  Created by IntelliJ IDEA.
  User: zhangxu
  Date: 2017/6/20
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
JSON和Ajax的测试
</head>
<body>


<button onclick="json()">发送一个json请求</button>

<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script>

function json() {
            $.ajax({
                type:"post",
                url:"/json/test",
                success:function(data){
                    alert("json内容显示："+data.id+"---"+data.name);
                },
                dataType:"json"
            });
}
</script>
</body>
</html>
