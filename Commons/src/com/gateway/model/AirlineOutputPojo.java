package com.gateway.model;

public class AirlineOutputPojo {
	
	private int id;

	private String	rating;
	private float	wtx;
	private float	sox;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public float getWtx() {
		return wtx;
	}
	public void setWtx(float wtx) {
		this.wtx = wtx;
	}
	public float getSox() {
		return sox;
	}
	public void setSox(float sox) {
		this.sox = sox;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + Float.floatToIntBits(sox);
		result = prime * result + Float.floatToIntBits(wtx);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineOutputPojo other = (AirlineOutputPojo) obj;
		if (id != other.id)
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (Float.floatToIntBits(sox) != Float.floatToIntBits(other.sox))
			return false;
		if (Float.floatToIntBits(wtx) != Float.floatToIntBits(other.wtx))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AirlineOutputPojo [Rating=" + rating + ", WTX="
				+ wtx + ", SOX=" + sox + "]";
	}
	
	
}
