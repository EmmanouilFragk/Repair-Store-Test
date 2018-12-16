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

            <div id="searchResults" class="hidden">
                <h1 class="page-header">Search results</h1>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Description</th>
                        <th>Date of Repair</th>
                        <th>Repair Status</th>
                        <th>Repair Type</th>
                        <th>Service Cost</th>
                        <th>Plate Number</th>
                    </tr>
                    </thead>
                    <tbody>


                    </tbody>
                </table>
            </div>

            <h1 class="page-header">Fetching repairs via API (Ajax)</h1>

            <table id="repairs" class="table table-striped">
                <thead>
                <tr>
                    <th>Description</th>
                    <th>Date of Repair</th>
                    <th>Repair Status</th>
                    <th>Repair Type</th>
                    <th>Service Cost</th>
                    <th>Plate Number</th>
                </tr>
                </thead>
                <tbody>


                </tbody>
            </table>

            <#include "content/repairs.ftl">
        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>