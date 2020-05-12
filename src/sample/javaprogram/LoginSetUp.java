package sample.javaprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginSetUp {
	private String user;
	private String pswd;
	private String email;
	private boolean validcheck;
//set User Name
	public void setUser(String user) {
		valuser(user);
		if (validcheck) {
			this.user = user;
		} else {
			System.out.println("Invalid user entered :" + user);
		}
	}
//set Password
	public void setpswd(String pswd) {
		valpswd(pswd);
		if (validcheck) {
			if (pswd.length() >= 8) {
				this.pswd = pswd;
			} else {
				System.out.println("Invalid password entered ,password length less than 8:" + pswd);
			}

		} else {
			System.out.println("Invalid password entered , first letter needs to be upper case:" + pswd);
		}

	}
//set Email
	public void setemail(String email) {
		valemail(email);
		if (validcheck) {
			this.email = email;
		} else {
			System.out.println("Invalid email entered :" + email);
		}

	}
//get Username
	public String getUser() {
		return user;
	}
//get Password
	public String getpswd() {
		return pswd;
	}
//get Email
	public String getemail() {
		return email;

	}
//Validate Username
	public void valuser(String user) {
		Pattern p = Pattern.compile("^[A-Za-z0-9]+$");
		Matcher m = p.matcher(user);
		boolean b = m.matches();
		if (b) {
			validcheck = true;
		} else {
			validcheck = false;
		}

	}
//Validate Password
	public void valpswd(String pswd) {
		Pattern p = Pattern.compile("^[A-Z].*+$");
		Matcher m = p.matcher(pswd);
		boolean b = m.matches();
		if (b) {
			validcheck = true;
		} else {
			validcheck = false;
		}

	}
//Validate Email
	public void valemail(String email) {
		Pattern p = Pattern.compile("^[^@].*@.*[^@]+$");
		Matcher m = p.matcher(email);
		boolean b = m.matches();
		if (b) {
			validcheck = true;
		} else {
			validcheck = false;
		}

	}
//Display Username,Password,Email
	public void display() {
		System.out.println("User Name :" + getUser());
		System.out.println("Password :" + getpswd());
		System.out.println("Email :" + getemail());
	}
}
