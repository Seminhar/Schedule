package com.sk.beans;

public class User {
	private int Uid;
	private String Uname;
	private String Upassword;
	private String Unickname;
	private String Urealname;
	private String Usex;
	private String Uaddress;
	private String Uimage;
	private String Uemail;

	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		Uid = uid;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getUpassword() {
		return Upassword;
	}

	public void setUpassword(String upassword) {
		Upassword = upassword;
	}

	public String getUnickname() {
		return Unickname;
	}

	public void setUnickname(String unickname) {
		Unickname = unickname;
	}

	public String getUrealname() {
		return Urealname;
	}

	public void setUrealname(String urealname) {
		Urealname = urealname;
	}

	public String getUsex() {
		return Usex;
	}

	public void setUsex(String usex) {
		Usex = usex;
	}

	public String getUaddress() {
		return Uaddress;
	}

	public void setUaddress(String uaddress) {
		Uaddress = uaddress;
	}

	public String getUimage() {
		return Uimage;
	}

	public void setUimage(String uimage) {
		Uimage = uimage;
	}

	public String getUemail() {
		return Uemail;
	}

	public void setUemail(String uemail) {
		Uemail = uemail;
	}

	@Override
	public String toString() {
		return "User [Uid=" + Uid + ", Uname=" + Uname + ", Upassword="
				+ Upassword + ", Unickname=" + Unickname + ", Urealname="
				+ Urealname + ", Usex=" + Usex + ", Uaddress=" + Uaddress
				+ ", Uimage=" + Uimage + ", Uemail=" + Uemail + "]";
	}

}
