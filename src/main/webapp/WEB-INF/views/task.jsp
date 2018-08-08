<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
  <title>Task Manager | Task Page</title>
  <c:import url="/admin/css"></c:import>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
  <c:import url="/admin/header"></c:import>
  <c:import url="/admin/menu"></c:import>
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    
    <section class="content">
    
    
    <div class="row">
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
											<th style="width: 130px;">Transactions</th>
										</tr>
										
										<c:if test="${ not empty ls }">
										
											<c:forEach items="${ ls }" var="item">
												<tr id="${ item.getTaskId() }" >
													<td>${ item.getTaskId() }</td>
													<td>${ item.getTaskUserId() }</td>
													<td>${ item.getTaskTitle() }</td>
													<td>${ item.getTaskDetail() }</td>
													<td>${ item.getTaskStartDate() }</td>
													<td>${ item.getTaskDueDate() }</td>
													<td>${ item.getTaskStatusId() }</td>
													<td>
														<a class="btn btn-primary btn-sm" href='<s:url value="/userTaskEdit/${ item.getTaskId() }"></s:url>' role="button">Edit</a>
														
													</td>
												</tr>
											</c:forEach>
											
										</c:if>
										
									</tbody>
								</table>
							</div>
							<!-- /.box-body -->

							<c:if test="${ empty ls }">
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

