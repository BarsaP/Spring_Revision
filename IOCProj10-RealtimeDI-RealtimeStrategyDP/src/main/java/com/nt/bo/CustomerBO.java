package com.nt.bo;

public class CustomerBO {
	// bean properties
	private String custName;
	private String custAddrs;
	private Float pamt;
	private Float ratre;
	private Float time;
	private Float interestAmount;
    // setter/getter (alt+shift+s, r -> select all)
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddrs() {
		return custAddrs;
	}

	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}

	public Float getPamt() {
		return pamt;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public Float getRatre() {
		return ratre;
	}

	public void setRatre(Float ratre) {
		this.ratre = ratre;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public Float getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(Float interestAmount) {
		this.interestAmount = interestAmount;
	}
	
	//toString
	@Override
	public String toString() {
		return "CustomerBO [custName=" + custName + ", custAddrs=" + custAddrs + ", pamt=" + pamt + ", ratre=" + ratre
				+ ", time=" + time + ", interestAmount=" + interestAmount + "]";
	}
	
}
