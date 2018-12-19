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
                <#if repairs??>
                    <h1 class="page-header">List of Repairs</h1>

                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Description</th>
                            <th>Registration Day</th>
                            <th>Finish Day</th>
                            <th>Repair Status</th>
                            <th>Repair Type</th>
                            <th>Service Cost</th>
                            <th>Plate Number</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>


    <#list repairs as repair>
    <td> ${repair.repairID}</td>
          <td> ${repair.description}</td>
    <td> ${repair.registrationDayOfRepair}</td>
    <td> ${repair.finishDayOfRepair}</td>
    <td> ${repair.repairStatus}</td>
    <td> ${repair.repairType}</td>
    <td> ${repair.serviceCost}</td>
    <td> ${repair.plateNumber}</td>



                        <td class="text-right">
                            <a class="btn btn-danger button-delete-confirmation" href="/repairs/${repair.repairID}/delete">Delete
                            </a>
                            <button class="btn btn-success" type="submit" value="Edit">Edit</button>
                        </td>
                    </tr>
                    </#list>
                        </tbody>
                    </table>
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <a class="btn pull-right" href="">Create New Repair</a>
                    </div>
                <#else>
                        <p>No Repairs Found.</p>
                </#if>

        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>
