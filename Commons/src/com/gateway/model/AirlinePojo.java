package com.gateway.model;

public class AirlinePojo {

	//FIN_TYPE	SUB_TYPE	TIER	VENDOR	RATING	WTX	SOX	AMOUNT
private int id;
	private String finType;
	private String	subType;
	private String	tier;
	private String	vendor;
	private String	rating;
	private float	wtx;
	private int	sox;
	private float amount;
	
	
	
	public AirlinePojo(String finType, String subType, String tier,
			String vendor, String rating, float wtx, int sox, float f) {
		super();
		this.finType = finType;
		this.subType = subType;
		this.tier = tier;
		this.vendor = vendor;
		this.rating = rating;
		this.wtx = wtx;
		this.sox = sox;
		this.amount = f;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFinType() {
		return finType;
	}



	public void setFinType(String finType) {
		this.finType = finType;
	}



	public String getSubType() {
		return subType;
	}



	public void setSubType(String subType) {
		this.subType = subType;
	}



	public String getTier() {
		return tier;
	}



	public void setTier(String tier) {
		this.tier = tier;
	}



	public String getVendor() {
		return vendor;
	}



	public void setVendor(String vendor) {
		this.vendor = vendor;
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



	public int getSox() {
		return sox;
	}



	public void setSox(int sox) {
		this.sox = sox;
	}



	public float getAmount() {
		return amount;
	}



	public void setAmount(float amount) {
		this.amount = amount;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + ((finType == null) ? 0 : finType.hashCode());
		result = prime * result + id;
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + sox;
		result = prime * result + ((subType == null) ? 0 : subType.hashCode());
		result = prime * result + ((tier == null) ? 0 : tier.hashCode());
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
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
		AirlinePojo other = (AirlinePojo) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (finType == null) {
			if (other.finType != null)
				return false;
		} else if (!finType.equals(other.finType))
			return false;
		if (id != other.id)
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (sox != other.sox)
			return false;
		if (subType == null) {
			if (other.subType != null)
				return false;
		} else if (!subType.equals(other.subType))
			return false;
		if (tier == null) {
			if (other.tier != null)
				return false;
		} else if (!tier.equals(other.tier))
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		if (Float.floatToIntBits(wtx) != Float.floatToIntBits(other.wtx))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "AirlinePojo [id=" + id + ", finType=" + finType + ", subType="
				+ subType + ", tier=" + tier + ", vendor=" + vendor
				+ ", rating=" + rating + ", wtx=" + wtx + ", sox=" + sox
				+ ", amount=" + amount + "]";
	}
	
	
	


}
