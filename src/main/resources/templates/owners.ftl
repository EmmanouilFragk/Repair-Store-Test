<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">
    <title>Admin|Owners</title>
</head>

<body>

<#include "partials/navbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <div id="searchResults" class="hidden">
                <h1 class="page-header">Search results</h1>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Tax Registration Number</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>Car Brand</th>
                        <th>Car Plate</th>
                        <th>User Type</th>
                    </tr>
                    </thead>
                    <tbody>


                    </tbody>
                </table>
            </div>

            <h1 class="page-header">Fetching owners via API (Ajax)</h1>

            <table id="owners" class="table table-striped">
                <thead>
                <tr>
                    <th>Tax Registration Number</th>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>Address</th>
                    <th>Email</th>
                    <th>Car Brand</th>
                    <th>Car Plate</th>
                    <th>User Type</th>
                </tr>
                </thead>
                <tbody>


                </tbody>
            </table>

            <#include "content/owners.ftl">
        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>
