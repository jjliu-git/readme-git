<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>企业列表</title>
</head>

<body>
    <!--数据列表-->
    <table id="dataList">
        <thead>
            <tr>
                <th class="sorting">企业名称</th>
                <th class="sorting">所在地</th>
                <th class="sorting">地址</th>
                <th class="sorting">企业法人</th>
                <th class="sorting">联系方式</th>
                <th class="sorting">所属行业</th>
                <th class="sorting">状态</th>
                <th class="sorting">余额</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="company">
            <tr>
                <td class="sorting">${company.name}</td>
                <td class="sorting">${company.city}</td>
                <td class="sorting">${company.address}</td>
                <td class="sorting">${company.representative}</td>
                <td class="sorting">${company.phone}</td>
                <td class="sorting">${company.industry}</td>
                <td class="sorting">${company.state}</td>
                <td class="sorting">${company.balance}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</body>

</html>