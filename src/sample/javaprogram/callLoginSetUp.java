package sample.javaprogram;

import java.util.Scanner;

public class callLoginSetUp {

	public static void main(String[] args) {
		LoginSetUp login=new LoginSetUp();
		Scanner sc=new Scanner(System.in);
		//Enter Username
        System.out.println("User Name:");
        String user=sc.nextLine();
        //Enter Password
        System.out.println("Password:");
        String pswd=sc.nextLine();
       // Enter Email
        System.out.println("Email:");
        String email=sc.nextLine();
        //Setter and display functions
        login.setUser(user);
        login.setpswd(pswd);
        login.setemail(email);
        login.display();
        //Close scanner
        sc.close();
	}

}
