<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">
    <title>authors</title>
</head>

<body>

<#include "partials/navbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <h1 class="page-header">Fetching books via API (Ajax)</h1>

            <table id="authors" class="table table-striped">
                <thead>
                <tr>
                    <th>Firstname</th>
                    <th>Lastname</th>
                </tr>
                </thead>
                <tbody>


                </tbody>
            </table>

            <#include "content/authors.ftl">
        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>
