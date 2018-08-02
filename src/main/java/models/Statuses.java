package models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the statuses database table.
 * 
 */
@Entity
@NamedQuery(name="Statuses.findAll", query="SELECT s FROM Statuses s")
public class Statuses implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="status_id")
	private int statusId;

	@Column(name="status_name")
	private String statusName;

	public Statuses() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}