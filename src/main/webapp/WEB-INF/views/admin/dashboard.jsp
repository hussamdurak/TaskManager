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
    
    
    <div class="row">
					<div class="col-xs-12">
						<a href='<s:url value="/admin/taskAdd"></s:url>'
							class="btn btn-app pull-right"> <i class="fa fa-plus"></i>
							Task Add
						</a>
					</div>

					<div class="col-xs-12">
						<div class="box">
							<div class="box-header">
								<h3 class="box-title">Tasks List</h3>

							</div>
							<!-- /.box-header -->
							<div class="box-body table-responsive no-padding">
								<table class="table table-hover">
									<tbody>
										<tr id="rowsTask">
											<th style="width: 40px">ID</th>
											<th>UserID</th>
											<th>Title</th>
											<th>Detail</th>
											<th>Start Date</th>
											<th>Due Date</th>
											<th>Status</th>
											<th style="width: 160px;">Transactions</th>
										</tr>
										
										<c:if test="${ not empty lst }">
										
											<c:forEach items="${ lst }" var="item">
												<tr id="${ item.getTaskId() }" >
													<td>${ item.getTaskId() }</td>
													<td>${ item.getTaskUserId() }</td>
													<td>${ item.getTaskTitle() }</td>
													<td>${ item.getTaskDetail() }</td>
													<td>${ item.getTaskStartDate() }</td>
													<td>${ item.getTaskDueDate() }</td>
													<td>${ item.getTaskStatusId() }</td>
													<td>
														<a class="btn btn-success btn-sm" href='<s:url value="/admin/taskAdd/${ item.getTaskId() }"></s:url>' role="button">Add</a>
														<a class="btn btn-primary btn-sm" href='<s:url value="/admin/taskEdit/${ item.getTaskId() }"></s:url>' role="button">Edit</a>
														<button type="button" class="btn btn-danger btn-sm">Delete</button>
													</td>
												</tr>
											</c:forEach>
											
										</c:if>
										
									</tbody>
								</table>
							</div>
							<!-- /.box-body -->

							<c:if test="${ empty lst }">
									<div style="text-align: center; padding: 10px;">Burada Data Yok !</div>
							</c:if>
						</div>
						<!-- /.box -->
					</div>
				</div>
     
     
     <div class="row">

					<div class="col-xs-12">
						<a href='<s:url value="/admin/userAdd"></s:url>'
							class="btn btn-app pull-right"> <i class="fa fa-plus"></i>
							User Add
						</a>
					</div>

					<div class="col-xs-12">
						<div class="box">
							<div class="box-header">
								<h3 class="box-title">Users List</h3>

							</div>
							<!-- /.box-header -->
							<div class="box-body table-responsive no-padding">
								<table class="table table-hover">
									<tbody>
										<tr id="rowsUser">
											<th style="width: 40px">ID</th>
											<th>Name</th>
											<th>Surname</th>
											<th>Mail</th>
											<th>Password</th>
											<th>Role</th>
											<th style="width: 160px;">Transactions</th>
										</tr>
										
										<c:if test="${ not empty lsu }">
										
											<c:forEach items="${ lsu }" var="item">
												<tr id="${ item.getUserId() }" role="sil">
													<td>${ item.getUserId() }</td>
													<td>${ item.getUserName() }</td>
													<td>${ item.getUserSurname() }</td>
													<td>${ item.getUserMail() }</td>
													<td>${ item.getUserPassword() }</td>
													<td>${ item.getUserRoleId() }</td>
													<td>
														<a class="btn btn-success btn-sm" href='<s:url value="/admin/userAdd/${ item.getUserId() }"></s:url>' role="button">Add</a>
														<a class="btn btn-primary btn-sm" href='<s:url value="/admin/userEdit/${ item.getUserId() }"></s:url>' role="button">Edit</a>
														<button type="button" class="btn btn-danger btn-sm">Delete</button>
													</td>
												</tr>
											</c:forEach>
											
										</c:if>
										
									</tbody>
								</table>
							</div>
							<!-- /.box-body -->

							<c:if test="${ empty lsu }">
									<div style="text-align: center; padding: 10px;">Burada Data Yok !</div>
							</c:if>
						</div>
						<!-- /.box -->
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

