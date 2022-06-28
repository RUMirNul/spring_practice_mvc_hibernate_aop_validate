<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>

    Name <form:input path="name"/> <form:errors path="name" cssStyle="color: red;"/>
    <br><br>
    Surname <form:input path="surname"/> <form:errors path="surname" cssStyle="color: red;"/>
    <br><br>
    Department <form:input path="department"/> <form:errors path="department" cssStyle="color: red;"/>
    <br><br>
    Salary <form:input type="number" path="salary"/> <form:errors path="salary" cssStyle="color: red;"/>
    <br><br>
    <input type="submit" value="Ok"/>
</form:form>

</body>

</html>