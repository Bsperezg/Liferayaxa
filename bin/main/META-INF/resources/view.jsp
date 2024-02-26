<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />
<c:set var="portletNamespace" value="<portlet:namespace />" />

<h2>Clientes</h2>
<table class="table table-striped">
    <thead>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Phone Number</th>
            <th>Address</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="liferayCustomer" items="${liferayCustomers}">
            <tr>
                <td>${liferayCustomer.name}</td>
                <td>${liferayCustomer.age}</td>
                <td>${liferayCustomer.phoneNumber}</td>
                <td>${liferayCustomer.address}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

