<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1" name="viewport">

    <meta content="Short website description" name="description">
    <link href="./assets/favicon.png" rel="icon">

    <title>Owners</title>

    <!-- Bootstrap core CSS -->
    <link href="./assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="./assets/css/dashboard.css" rel="stylesheet">

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button aria-controls="navbar" aria-expanded="false" class="navbar-toggle collapsed" data-target="#navbar"
                    data-toggle="collapse" type="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.ftl">Project name</a>
        </div>
        <div class="navbar-collapse collapse" id="navbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index.ftl">Home</a></li>
                <li><a href="owners.ftl">Owners</a></li>
                <li><a href="listings.ftl">Repairs List</a></li>
                <li><a href="./login.html">Logout</a></li>
            </ul>

            <form action="/search" class="navbar-form navbar-right" id="search">
                <div class="form-group">
                    <input class="form-control" id="searchID" name="searchID" placeholder="search..." type="text">
                </div>
                <button class="btn btn-default" type="submit">Search</button>
            </form>

        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li><a href="owners.ftl">Owners</a></li>
                <li><a href="create-user.ftl">Add Owner</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="listings.ftl">Repairs List</a></li>
                <li><a href="create-listing.ftl">Add Repair</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">Owners</h1>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>User ID</th>
                    <th>Username</th>
                    <th>First Name</th>
                    <th>Last name</th>
                    <th>Email</th>
                    <th>Role</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>1</td>
                    <td>john</td>
                    <td>John</td>
                    <td>Doe</td>
                    <td>john@gmail.com</td>
                    <td>Owner</td>
                </tr>

                <tr>
                    <td>2</td>
                    <td>jane</td>
                    <td>Jane</td>
                    <td>Doe</td>
                    <td>jane@gmail.com</td>
                    <td>Admin</td>
                </tr>

                <tr>
                    <td>3</td>
                    <td>bob</td>
                    <td>Bob</td>
                    <td>Uncle</td>
                    <td>bob@gmail.com</td>
                    <td>Owner</td>
                </tr>

                </tbody>
            </table>

        </div>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

<script src="./assets/js/bootstrap.min.js"></script>
<script src="./assets/js/app.js"></script>

</body>
</html>
