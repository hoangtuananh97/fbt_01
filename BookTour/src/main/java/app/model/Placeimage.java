package app.model;

public class Placeimage implements java.io.Serializable {

	private static final long serialVersionUID = 7146035672896975879L;
	private Integer id;
	private Place places;
	private String urlImage;

	public Placeimage() {
	}

	public Placeimage(Integer id, Place places, String urlImage) {
		this.id = id;
		this.places = places;
		this.urlImage = urlImage;
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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
