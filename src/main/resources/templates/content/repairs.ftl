<#if repairs??>
<h1 class="page-header">List of Repairs</h1>

<table class="table table-striped">
    <thead>
    <tr>

        <th>Description</th>
        <th>Date of Repair</th>
        <th>Repair Status</th>
        <th>Repair Type</th>
        <th>Service Cost</th>
        <th>Plate Number</th>
        <th></th>
    </tr>
    </thead>
    <tbody>

    <#list repairs as repair>
        <tr>

        <td> ${repair.description}</td>
        <td> ${repair.dayOfRepair}</td>
        <td> ${repair.repairStatus}</td>
        <td> ${repair.repairType}</td>
        <td> ${repair.serviceCost}</td>
        <td> ${repair.plateNumber}</td>

        <td class="text-right">
          <!--  <button class="btn btn-danger button-delete-confirmation" type="submit" value="Delete">Delete
            </button>
            <button class="btn btn-success" type="submit" value="Edit">Edit</button> -->
            <a class="btn" href="/repair/repairs/${repair.repairID}">Edit</a>
        </td>
        </tr>
    </#list>

    </tbody>
</table>
</#if>