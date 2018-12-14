<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">
    <title>Admin|Repairs</title>
</head>

<body>

<#include "partials/navbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <#include "content/repairs.ftl">
        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>