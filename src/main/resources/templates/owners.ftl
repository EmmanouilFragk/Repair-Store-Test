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
                <#if owners??>
                <h1 class="page-header">List of Owners</h1>

                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Tax Registration Number</th>
                        <th>FirstName</th>
                        <th>LastName;</th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>Car Brand</th>
                        <th>Car Plate</th>
                        <th>User Type</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>

                    <#list owners as owner>
                        <tr>
                        <td> ${owner.id}</td>
                        <td> ${owner.taxRegistrationNumber}</td>
                        <td> ${owner.firstName}</td>
                        <td> ${owner.lastName}</td>
                        <td> ${owner.address}</td>
                        <td> ${owner.email}</td>
                        <td> ${owner.carBrand}</td>
                        <td> ${owner.carPlate}</td>
                        <td> ${owner.userType}</td>


                        <td class="text-right">
                    <a class="btn btn-danger button-delete-confirmation" href="/owners/${owner.id}/delete">Delete
                        </a>
                        <button class="btn btn-success" type="submit" value="Edit">Edit</button>
                        </td>
                        </tr>
                    </#list>
                    </tbody>
                    </table>
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <a class="btn pull-right" href="/owners/create">Create New Owner</a>
                    </div>
                    <#else>
                        <p>No Owners Found.</p>
                    </#if>

            </div>
        </div>
    </div>

<#include "partials/scripts.ftl">

</body>
</html>
