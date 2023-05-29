<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>
<h2>
    Dear Employee, You are WELCOME!!!
</h2>
<br>
<%--Your name is: ${param.employeeName}--%>
<%--Your name is: ${proceededEmpName} &lt;%&ndash;${description}&ndash;%&gt;--%>
Your name is: ${employee.name}
<br>
Your surname is: ${employee.surname}
<br>
Your salary is: ${employee.salary}
<br>
Your department is: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
    <li>
        ${lang}
    </li>
    </c:forEach>
</ul>
Your Phone Number is: ${employee.phoneNumber}
<br>
Your email: ${employee.email}
</body>
</html>
