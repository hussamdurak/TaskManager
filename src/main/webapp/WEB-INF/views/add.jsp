<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
  <title>Task Manager | Task Add Page</title>
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
						<a href='<s:url value="/home"></s:url>'
							class="btn btn-app pull-right"> <i class="fa fa-arrow-left"></i>Back
						</a>
					</div>


					<div class="col-md-12">
						<div class="box box-info">
							<div class="box-header with-border">
								<h3 class="box-title">Task Add Form</h3>
								
							</div>
							<!-- /.box-header -->
							<!-- form start -->
							<form class="form-horizontal"
								action='<s:url value="/add"></s:url>'
								method="post">
								<div class="box-body">

									<div class="col-md-12">
										<div class="form-group">
											<label for="taskTitle" class="col-sm-2 control-label">Task Title</label>

											<div class="col-sm-10">
												<input name="taskTitle" type="text"
													class="form-control" id="taskTitle"
													placeholder="Task Title">
											</div>
										</div>
										
										<div class="form-group">
											<label for="taskStatusId" class="col-sm-2 control-label">Task Status</label>
											<div class="col-sm-10">
												<select class="form-control" id="taskStatusId"
													name="taskStatusId" >
													<option value="1">To Do</option>
													<option value="2">Postponed</option>
													<option value="3">Cancelled</option>
													<option value="4">Finished</option>
												</select>
											</div>
										</div>
										
										<!-- Date -->									
										<div class="form-group">
											<label for="datepicker" class="col-sm-2 control-label">Task Due Date</label>
											<div class="col-sm-10">
												<div class="input-group date">
													<div class="input-group-addon">
														<i class="fa fa-calendar"></i>
													</div>
													<input type="text" class="form-control pull-right"
														id="datepicker" name="taskDueDate">
												</div>
											</div>
											<!-- /.input group -->
										</div>
										<div class="form-group">

											<label for="editor1" class="col-sm-2 control-label">Task Detail</label>
											<div class="col-sm-10">
												<textarea id="editor1" name="taskDetail" rows="10"
													cols="80">
                                            Task details...
                    </textarea>
											</div>
										</div>
										<!-- /.form group -->
									</div>
								</div>
								<!-- /.box-body -->

								<div class="box-footer">
									<button type="reset" class="btn btn-default">Reset</button>
									<button type="submit" class="btn btn-info pull-right">Save
									</button>
								</div>
							</form>
							<!-- /.box-footer -->
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

