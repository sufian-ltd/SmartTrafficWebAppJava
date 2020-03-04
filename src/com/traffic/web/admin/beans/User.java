package com.traffic.web.admin.beans;

public class User {

	private int id;
    private String userName;
    private String password;
    private String contact;
    private String nid;
    private String address;
    private String drivingLicense;
    private String vehicleLicense;
    private String qrCode;
    private String vehicle;
    private String userNotice;
    private String policeNotice;
    private String punishment;
    private String requset;
    public User(){
    	
    }
	public User(int id, String userName, String password, String contact, String nid, String address,
			String drivingLicense, String vehicleLicense, String qrCode, String vehicle, String userNotice,
			String policeNotice,String punishment,String requset) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.contact = contact;
		this.nid = nid;
		this.address = address;
		this.drivingLicense = drivingLicense;
		this.vehicleLicense = vehicleLicense;
		this.qrCode = qrCode;
		this.vehicle = vehicle;
		this.userNotice = userNotice;
		this.policeNotice = policeNotice;
		this.requset=requset;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getUserNotice() {
		return userNotice;
	}
	public void setUserNotice(String userNotice) {
		this.userNotice = userNotice;
	}
	public String getPoliceNotice() {
		return policeNotice;
	}
	public void setPoliceNotice(String policeNotice) {
		this.policeNotice = policeNotice;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", contact=" + contact
				+ ", nid=" + nid + ", address=" + address + ", drivingLicense=" + drivingLicense + ", vehicleLicense="
				+ vehicleLicense + ", qrCode=" + qrCode + ", vehicle=" + vehicle + ", userNotice=" + userNotice
				+ ", policeNotice=" + policeNotice + "]";
	}
	public String getRequset() {
		return requset;
	}
	public void setRequset(String requset) {
		this.requset = requset;
	}
	public User(int id, String userName, String password, String contact, String nid, String address,
			String drivingLicense, String vehicleLicense, String vehicle, String requset) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.contact = contact;
		this.nid = nid;
		this.address = address;
		this.drivingLicense = drivingLicense;
		this.vehicleLicense = vehicleLicense;
		this.vehicle = vehicle;
		this.requset = requset;
	}
	public String getPunishment() {
		return punishment;
	}
	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}
	public User(int id, String contact, String nid, String address, String drivingLicense, String vehicleLicense,
			String vehicle, String policeNotice, String punishment) {
		super();
		this.id = id;
		this.contact = contact;
		this.nid = nid;
		this.address = address;
		this.drivingLicense = drivingLicense;
		this.vehicleLicense = vehicleLicense;
		this.vehicle = vehicle;
		this.policeNotice = policeNotice;
		this.punishment = punishment;
	}
	public User(int id, String contact, String nid, String address, String drivingLicense, String vehicleLicense,
			String vehicle, String userNotice) {
		super();
		this.id = id;
		this.contact = contact;
		this.nid = nid;
		this.address = address;
		this.drivingLicense = drivingLicense;
		this.vehicleLicense = vehicleLicense;
		this.vehicle = vehicle;
		this.userNotice = userNotice;
	}
	public User(int id, String nid, String drivingLicense, String vehicleLicense) {
		super();
		this.id = id;
		this.nid = nid;
		this.drivingLicense = drivingLicense;
		this.vehicleLicense = vehicleLicense;
	}
}
