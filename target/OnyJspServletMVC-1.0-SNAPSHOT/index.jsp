
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript">
            function first(){
                var p=document.sample.pass.value;
                var p1=document.sample.pass1.value;
                if(p==p1){
                    return true;
                }
                else{
                    alert("password are not equal!");
                    return false;
                }
            }
		</script>
	</head>
	<body>
		<form name="sample" action="WelcomeJSP.jsp" onsubmit="return first()">
			Password:<input type="password" name="pass"/><br/>
			Confirmation Password:<input type="password" name="pass1"/><br/>
			<input type="submit">
		</form>
	</body>
</html>2