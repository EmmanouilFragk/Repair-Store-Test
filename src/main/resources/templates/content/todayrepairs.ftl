<table class="table table-striped">
    <thead>
    <tr>

        <th>Description</th>
        <th>Day Of Repair</th>
        <th>Repair Status;</th>
        <th>Repair Type</th>
        <th>Service Cost</th>
        <th>Plate Number</th>
        <th>Owner</th>
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
        <td> ${repair.owner}</td>

        <td class="text-right">
            <button class="btn btn-danger button-delete-confirmation" type="submit" value="Delete">Delete
            </button>
            <button class="btn btn-success" type="submit" value="Edit">Edit</button>
        </td>
        </tr>
    </#list>

    </tbody>
</table>