<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
  <title>Admin Panel | Yönetim Sayfası</title>
  <c:import url="/admin/css"></c:import>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
  <c:import url="/admin/header"></c:import>
  <c:import url="/admin/menu"></c:import>
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Yönetim
        <small>Örnek Sayfa</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Anasayfa</a></li>
        <li class="active">Yönetim</li>
      </ol>
    </section>
    <section class="content">
     
     
     <div class="box box-widget widget-user-2">
            <!-- Add the bg color to the header using any of the bg-* classes -->
            <div class="widget-user-header bg-yellow">
              <div class="widget-user-image">
                <img class="img-circle" src='<s:url value="/resources/dist/img/user7-128x128.jpg"></s:url>' alt="User Avatar">
              </div>
              <!-- /.widget-user-image -->
              <h3 class="widget-user-username">Nadia Carmichael</h3>
              <h5 class="widget-user-desc">Lead Developer</h5>
            </div>
	</div>
	
	<div class="row">
	<div class="col-sm-8">
	
		<div class="register-box-body">
		<p class="login-box-msg">Register a new membership</p>
		    <form action="../../index.html" method="post">
		      <div class="form-group has-feedback">
		        <input type="text" class="form-control" placeholder="Name">
		        <span class="glyphicon glyphicon-user form-control-feedback"></span>
		      </div>
		      <div class="form-group has-feedback">
		        <input type="text" class="form-control" placeholder="Surname">
		        <span class="glyphicon glyphicon-user form-control-feedback"></span>
		      </div>
		      <div class="form-group has-feedback">
		        <input type="email" class="form-control" placeholder="Email">
		        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
		      </div>
		      <div class="form-group has-feedback">
		        <input type="password" class="form-control" placeholder="Password">
		        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
		      </div>
		      <div class="form-group has-feedback">
		        <input type="password" class="form-control" placeholder="Retype password">
		        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
		      </div>     
		      <div class="form-group has-feedback">  
		          <button type="submit" class="btn btn-primary btn-block btn-flat">Submit</button>
		      </div>
		    </form>

  		</div>
	</div>
	</div>
     
     
    </section>
  </div>
  <c:import url="/admin/footer"></c:import>
  <c:import url="/admin/sidebar"></c:import>
</div>
<c:import url="/admin/js"></c:import>
</body>
</html>

