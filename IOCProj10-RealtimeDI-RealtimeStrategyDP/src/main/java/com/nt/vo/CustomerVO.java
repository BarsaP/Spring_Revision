package com.nt.vo;

public class CustomerVO {
	private String custName;
	private String custAddrs;
	private Float pamt;
	private Float ratre;
	private Float time;
	
	//setter and getters
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
	
	@Override
	public String toString() {
		return "CustomerVO [custName=" + custName + ", custAddrs=" + custAddrs + ", pamt=" + pamt + ", ratre=" + ratre
				+ ", time=" + time + "]";
	}
	
}
