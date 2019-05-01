<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Login Modal -->
<div class="modal fade signupLoging" id="login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content modalContentCustom">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Log in to your account</h4>
      </div>
      <div class="modal-body">
        <form method="post" action="/login">
          <div class="form-group">
          

            <input type="text" name="userid"  placeholder="Email"class="form-control bg-ash" id="exampleInputPassword1" >
          </div>
          <div class="form-group">
            <input type="password" name="userpw" class="form-control bg-ash" id="exampleInputPassword1" placeholder="Password" >
          </div>
          <div class="checkbox">
            <label>
              <input type="checkbox"> Remember me
            </label>
            <a class="forgotPass clerfix" href="">Fogot Password?</a>
          </div>
          <button type="submit" VALUE='로그인' class="btn btn-default">Login</button>
        </form>
        <div class="or">
          or
        </div>
        <a class="btn btn-default btnSocial"  href="#">Log in with facebook</a>
      </div>

      <div class="modal-footer">
          <div class="dontHaveAccount">
            <p>Don’t have an Account?<a href=""> Sign up</a></p>
          </div>
      </div>
    </div>
  </div>
</div>