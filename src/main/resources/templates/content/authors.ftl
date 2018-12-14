<h1 class="page-header">Authors</h1>

<table class="table table-striped">
    <thead>
    <tr>

        <th>Firstname</th>
        <th>Lastname</th>
        <th></th>


    </tr>
    </thead>
    <tbody>

    <#list authors as author>
        <tr>

        <td> ${author.firstname}</td>
        <td> ${author.lastname}</td>

        <td class="text-right">
            <button class="btn btn-danger button-delete-confirmation" type="submit" value="Delete">Delete
            </button>
            <button class="btn btn-success" type="submit" value="Edit">Edit</button>
        </td>
        </tr>
    </#list>

    </tbody>
</table>