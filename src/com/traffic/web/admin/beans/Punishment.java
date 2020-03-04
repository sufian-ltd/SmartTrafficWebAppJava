package com.traffic.web.admin.beans;

public class Punishment {

	private int id;
	private String policeNotice;
	private String reasonOne;
	private String reasonTwo;
	private String reasonThree;
	private String reasonFour;
	private String reasonFive;
	private String reasonSix;
	private String fine;
	private String punish;
	private int userId;
	public Punishment(int id, String policeNotice, String reasonOne, String reasonTwo, String reasonThree,
			String reasonFour, String reasonFive, String reasonSix, String fine, String punish, int userId) {
		super();
		this.id = id;
		this.policeNotice = policeNotice;
		this.reasonOne = reasonOne;
		this.reasonTwo = reasonTwo;
		this.reasonThree = reasonThree;
		this.reasonFour = reasonFour;
		this.reasonFive = reasonFive;
		this.reasonSix = reasonSix;
		this.fine = fine;
		this.punish = punish;
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPoliceNotice() {
		return policeNotice;
	}
	public void setPoliceNotice(String policeNotice) {
		this.policeNotice = policeNotice;
	}
	public String getReasonOne() {
		return reasonOne;
	}
	public void setReasonOne(String reasonOne) {
		this.reasonOne = reasonOne;
	}
	public String getReasonTwo() {
		return reasonTwo;
	}
	public void setReasonTwo(String reasonTwo) {
		this.reasonTwo = reasonTwo;
	}
	public String getReasonThree() {
		return reasonThree;
	}
	public void setReasonThree(String reasonThree) {
		this.reasonThree = reasonThree;
	}
	public String getReasonFour() {
		return reasonFour;
	}
	public void setReasonFour(String reasonFour) {
		this.reasonFour = reasonFour;
	}
	public String getReasonFive() {
		return reasonFive;
	}
	public void setReasonFive(String reasonFive) {
		this.reasonFive = reasonFive;
	}
	public String getReasonSix() {
		return reasonSix;
	}
	public void setReasonSix(String reasonSix) {
		this.reasonSix = reasonSix;
	}
	public String getFine() {
		return fine;
	}
	public void setFine(String fine) {
		this.fine = fine;
	}
	public String getPunish() {
		return punish;
	}
	public void setPunish(String punish) {
		this.punish = punish;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
