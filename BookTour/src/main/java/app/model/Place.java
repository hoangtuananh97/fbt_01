package app.model;

import java.io.Serializable;
import java.util.List;

public class Place implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private City citys;
	private String name;
	private List<Toursplace> toursplaceses;
	private List<Placeimage> placeimages;

	public Place(Integer id, City citys, String name) {
		super();
		this.id = id;
		this.citys = citys;
		this.name = name;
	}

	public Place(Integer id, City citys, String name, List<Toursplace> toursplaceses,
			List<Placeimage> placeimages) {
		super();
		this.id = id;
		this.citys = citys;
		this.name = name;
		this.toursplaceses = toursplaceses;
		this.placeimages = placeimages;
	}

	public Place() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCitys() {
		return citys;
	}

	public void setCitys(City citys) {
		this.citys = citys;
	}

	public List<Toursplace> getToursplaceses() {
		return toursplaceses;
	}

	public void setToursplaceses(List<Toursplace> toursplaceses) {
		this.toursplaceses = toursplaceses;
	}

	public List<Placeimage> getPlaceimages() {
		return placeimages;
	}

	public void setPlaceimages(List<Placeimage> placeimages) {
		this.placeimages = placeimages;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
