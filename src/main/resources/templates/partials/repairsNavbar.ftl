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
            <a class="navbar-brand" href="/">Admin Home</a>
        </div>
        <div class="navbar-collapse collapse" id="navbar">

            <ul class="nav navbar-nav navbar-right">
                <li><a href="/">Home</a></li>
                <li><a href="/owners">Owners</a></li>
                <li><a href="/repairs">Repairs</a></li>
                <#include "repairSearch.ftl">
            </ul>



        </div>
    </div>
</nav>