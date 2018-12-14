<#import "/spring.ftl" as spring />
<h1 class="page-header">Register</h1>


<form action="/register" name="registerForm" id="registerForm" method="POST" class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-1 control-label" for="email">Email</label>
        <div class="col-sm-11">
            <@spring.bind "registerForm.email"/>
                <input class="form-control" type="email" name="email" id="email" placeholder="email">
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-1 control-label" for="username">Username</label>
        <div class="col-sm-11">
            <@spring.bind "registerForm.username"/>
                <input class="form-control" type="text" name="username" id="username" placeholder="username">
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-1 control-label" for="password">Password</label>
        <div class="col-sm-11">
            <@spring.bind "registerForm.password"/>
                <input class="form-control" type="password" name="password" id="password" placeholder="password">
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-11">
            <button class="btn btn-default" type="reset">Reset</button>
            <button class="btn btn-primary" type="submit">Register</button>
        </div>
    </div>
</form>

