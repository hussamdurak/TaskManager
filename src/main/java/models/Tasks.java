package models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tasks database table.
 * 
 */
@Entity
@NamedQuery(name="Tasks.findAll", query="SELECT t FROM Tasks t")
public class Tasks implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="task_id")
	private int taskId;

	@Column(name="task_detail")
	private String taskDetail;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="task_due_date")
	private Date taskDueDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="task_start_date")
	private Date taskStartDate;

	@Column(name="task_status_id")
	private int taskStatusId;

	@Column(name="task_title")
	private String taskTitle;

	@Column(name="task_user_id")
	private int taskUserId;

	public Tasks() {
	}

	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskDetail() {
		return this.taskDetail;
	}

	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}

	public Date getTaskDueDate() {
		return this.taskDueDate;
	}

	public void setTaskDueDate(Date taskDueDate) {
		this.taskDueDate = taskDueDate;
	}

	public Date getTaskStartDate() {
		return this.taskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	public int getTaskStatusId() {
		return this.taskStatusId;
	}

	public void setTaskStatusId(int taskStatusId) {
		this.taskStatusId = taskStatusId;
	}

	public String getTaskTitle() {
		return this.taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public int getTaskUserId() {
		return this.taskUserId;
	}

	public void setTaskUserId(int taskUserId) {
		this.taskUserId = taskUserId;
	}

}