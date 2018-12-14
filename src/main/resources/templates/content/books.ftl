<h1 class="page-header">Books</h1>

<table class="table table-striped">
    <thead>
    <tr>

        <th>Title</th>
        <th>Author</th>
        <th>Year</th>
        <th></th>
    </tr>
    </thead>
    <tbody>

    <#list books as book>
        <tr>

        <td> ${book.title}</td>
        <td> ${book.author}</td>
        <td> ${book.year}</td>


        <td class="text-right">
            <button class="btn btn-danger button-delete-confirmation" type="submit" value="Delete">Delete
            </button>
            <button class="btn btn-success" type="submit" value="Edit">Edit</button>
        </td>
        </tr>
    </#list>

    </tbody>
</table>