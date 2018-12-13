<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1" name="viewport">

    <meta content="Short website description" name="description">
    <link href="./assets/favicon.png" rel="icon">

    <title>Add Owner</title>

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
            <h1 class="page-header">Add Owner</h1>

            <form id="create-user" action="/create-user" class="form-horizontal">

                <div class="form-group">
                    <label class="col-sm-1 control-label" for="specialId">Special ID</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="specialId" name="specialId" placeholder="Special ID number"
                               type="number"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="firstName">First name</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="firstName" name="firstName" placeholder="First name"
                               type="text"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="lastName">Last name</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="lastName" name="lastName" placeholder="Last name" type="text"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="address">Address</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="address" name="address" placeholder="Address" type="text"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="email">Email</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="email" name="email" placeholder="Email" type="email"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="password">Password</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="password" name="password" placeholder="Password"
                               type="password"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="username">Username</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="username" name="username" placeholder="Username" type="text"/>
                    </div>
                </div>
                <div class="form-group">
                <label class="col-sm-1 control-label" for="vatid">VAT ID</label>
                <div class="col-sm-11">
                    <input class="form-control" id="vatid" name="vatid" placeholder="Vat Id" type="text">
                </div>
        </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="userRole">Role</label>
                    <div class="col-sm-11">
                        <select class="form-control" id="userRole" name="userRole">
                            <option value="" disabled selected>Select your option</option>
                            <option value="author">Owner</option>
                            <option value="admin">Admin</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-1 col-sm-11">
                        <button class="btn btn-default" type="reset">Reset</button>
                        <button class="btn btn-primary" type="submit">Create</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>

<script src="./assets/js/bootstrap.min.js"></script>
<script src="./assets/js/app.js"></script>
</body>
</html>
