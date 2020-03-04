package com.traffic.web.admin.beans;

public class Document {

	private int id;
	private String nid;
	private String drivingLicense;
	private String vehicleLicense;
	public Document(int id, String nid, String drivingLicense, String vehicleLicense) {
		super();
		this.id = id;
		this.nid = nid;
		this.drivingLicense = drivingLicense;
		this.vehicleLicense = vehicleLicense;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public String getVehicleLicense() {
		return vehicleLicense;
	}
	public void setVehicleLicense(String vehicleLicense) {
		this.vehicleLicense = vehicleLicense;
	}
	
}
