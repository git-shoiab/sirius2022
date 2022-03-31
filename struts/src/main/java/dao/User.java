package dao;

import java.io.Serializable;

public class User implements Serializable,Comparable<User>{
	private int uid;
	private String uname;
	private String upass;
	private int flag;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
@Override
	public int compareTo(User o) {
		return o.uid-this.uid;
	}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", flag=" + flag + "]";
}	

}
