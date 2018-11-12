package app.model;

public class Booktour implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Bill bills;
	private Tour tours;
	private User users;
	private String primeTour;
	private int adults;
	private int children;
	private String status;
	private String notel;

	public Booktour() {
	}

	public Booktour(Integer id, Bill bills, Tour tours, User users, String primeTour, int adults, int children,
			String status, String notel) {
		this.id = id;
		this.bills = bills;
		this.tours = tours;
		this.users = users;
		this.primeTour = primeTour;
		this.adults = adults;
		this.children = children;
		this.status = status;
		this.notel = notel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Bill getBills() {
		return bills;
	}

	public void setBills(Bill bills) {
		this.bills = bills;
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

	public String getPrimeTour() {
		return primeTour;
	}

	public void setPrimeTour(String primeTour) {
		this.primeTour = primeTour;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotel() {
		return notel;
	}

	public void setNotel(String notel) {
		this.notel = notel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
