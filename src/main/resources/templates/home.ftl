<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">
    <title>Home</title>
</head>

<body>

<#include "partials/navbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <#--Display a default message if the variable message is missing-->
            <h2>${message!"Default message"}</h2>
            <h2>${redirectMsg!""}</h2>

            <p>This is a message List </p>

            <#--Process list only if it exists.-->

            <#if messages??>
                <#list messages as msg>
                    <li>
                    <p> ${msg}</p>
                    </li>
                </#list>
            </#if>

            <h2>${errorMessage!""}</h2>
        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>
