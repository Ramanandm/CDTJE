package model;

 public class Condition {
	String uname;
	String psw;
	public String getUsername() {
		return uname;
	}
	public void setUsername(String username) {
		this.uname = uname;
	}
	public String getPassword() {
		return psw;
	}
	public void setPassword(String password) {
		this.psw = psw;
	}
	public boolean check()
	{
	if((uname.equals("ram")) && (psw.equals("ram")))
	{
			return true;
	
	}
	else
	{
		return false;
	}
	}}
