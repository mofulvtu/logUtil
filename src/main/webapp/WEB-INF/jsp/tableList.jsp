<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<div class="billDetail border" style="text-align:center">
<table border="1" cellpadding="3" cellspacing="0" style="width: 60%;margin:auto">
    <thead>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>电话</td>
        <td>兑换次数上限值</td>
    </tr>
    </thead>
        <tbody>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.userpwd}</td>
            <td>${user.user_phone}</td>
            <td>${user.user_email}</td>
        </tr>
        </tbody>
</table>
</div>