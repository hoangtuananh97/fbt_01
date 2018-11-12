package app.model;

public class Rating implements java.io.Serializable {

	private static final long serialVersionUID = 3428821928493594345L;
	private Integer id;
	private Tour tours;
	private User users;
	private String numberRank;

	public Rating() {
	}

	public Rating(Integer id, Tour tours, User users, String numberRank) {
		this.id = id;
		this.tours = tours;
		this.users = users;
		this.numberRank = numberRank;
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

	public String getNumberRank() {
		return numberRank;
	}

	public void setNumberRank(String numberRank) {
		this.numberRank = numberRank;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
