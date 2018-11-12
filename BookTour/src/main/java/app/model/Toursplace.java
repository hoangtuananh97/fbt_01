package app.model;

public class Toursplace implements java.io.Serializable {

	private static final long serialVersionUID = 3202937915064230357L;
	private Integer id;
	private Place places;
	private Tour tours;
	private Byte typeFromTo;

	public Toursplace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Toursplace(Integer id, Place places, Tour tours, Byte typeFromTo) {
		super();
		this.id = id;
		this.places = places;
		this.tours = tours;
		this.typeFromTo = typeFromTo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Place getPlaces() {
		return places;
	}

	public void setPlaces(Place places) {
		this.places = places;
	}

	public Tour getTours() {
		return tours;
	}

	public void setTours(Tour tours) {
		this.tours = tours;
	}

	public Byte getTypeFromTo() {
		return typeFromTo;
	}

	public void setTypeFromTo(Byte typeFromTo) {
		this.typeFromTo = typeFromTo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
