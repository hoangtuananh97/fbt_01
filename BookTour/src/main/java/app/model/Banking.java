package app.model;

import java.io.Serializable;

public class Banking implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Typepayment typepayments;
	private String namebanking;

	public Banking(Integer id, Typepayment typepayments, String namebanking) {
		this.id = id;
		this.typepayments = typepayments;
		this.namebanking = namebanking;
	}

	public Banking() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Typepayment getTypepayments() {
		return typepayments;
	}

	public void setTypepayments(Typepayment typepayments) {
		this.typepayments = typepayments;
	}

	public String getNamebanking() {
		return namebanking;
	}

	public void setNamebanking(String namebanking) {
		this.namebanking = namebanking;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
