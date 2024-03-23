package naveen;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String group;
		System.out.println("enter group");
		Scanner sc=new Scanner(System.in);
		group=sc.next();
		switch(group)
		{
		case "It":System.out.println("information techonolgy");
		break;
		case "mech":System.out.println("mechinal");
		break;
		case "civil":System.out.println("civil");
		break;
		default :System.out.println("invaild");
		}
	}

}
