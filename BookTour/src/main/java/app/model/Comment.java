package app.model;

import java.util.Date;

public class Comment implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Tour tours;
	private User users;
	private String context;
	private Date time;
	private byte status;

	public Comment(Integer id, Tour tours, User users, String context, Date time, byte status) {
		this.id = id;
		this.tours = tours;
		this.users = users;
		this.context = context;
		this.time = time;
		this.status = status;
	}

	public Comment() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tour getTours() {
		return tours;
	}

	public void setTours(Tour tours) {
		this.tours = tours;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
