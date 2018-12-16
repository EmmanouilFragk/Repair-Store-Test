<#if owners??>
<h1 class="page-header">List of Owners</h1>

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
        <th></th>
    </tr>
    </thead>
    <tbody>

    <#list owners as owner>
    <tr>

        <td> ${owner.taxRegistrationNumber}</td>
        <td> ${owner.firstName}</td>
        <td> ${owner.lastName}</td>
        <td> ${owner.address}</td>
        <td> ${owner.email}</td>
        <td> ${owner.carBrand}</td>
        <td> ${owner.carPlate}</td>
        <td> ${owner.userType}</td>


        <td class="text-right">
          <!--  <button class="btn btn-danger button-delete-confirmation" type="submit" value="Delete">Delete
            </button>
            <button class="btn btn-success" type="submit" value="Edit">Edit</button> -->
            <a class="btn" href="/example/owners/${owner.id}">Edit</a>
        </td>
    </tr>
    </#list>

    </tbody>
</table>
</#if>