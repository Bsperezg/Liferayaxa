<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />
<c:set var="portletNamespace" value="<portlet:namespace />" />

<form action="${submitFormURL}" method="post">
    <label for="${portletNamespace}name">Name:</label>
    <input type="text" id="${portletNamespace}name" name="${portletNamespace}name" required />
    <br>
    <label for="${portletNamespace}age">Age:</label>
    <input type="number" id="${portletNamespace}age" name="${portletNamespace}age" required />
    <br>
    <label for="${portletNamespace}phoneNumber">Phone Number:</label>
    <input type="text" id="${portletNamespace}phoneNumber" name="${portletNamespace}phoneNumber" required />
    <br>
    <label for="${portletNamespace}address">Address:</label>
    <input type="text" id="${portletNamespace}address" name="${portletNamespace}address" required />
    <br>
    <button type="submit">Add Liferay Customer</button>
</form>

