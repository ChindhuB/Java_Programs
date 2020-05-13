package sample.javaprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListIteration {
	
	//To get ArrayList 
	private static ArrayList<String> getlistArray() {
		Scanner sc=new Scanner(System.in);
		boolean cont=true;
		ArrayList <String> arrlist=new ArrayList <String>();
		while(cont){
			System.out.println("Enter the value to list");
		String list=sc.next();
		arrlist.add(list);
		System.out.println("If you want to continue type Y Else N");
		String contCh=sc.next();
		if (contCh.equalsIgnoreCase("Y")) {
			 cont=true;
		}
			else
			{
				cont=false;
			}
		
		};
		sc.close();
		return arrlist;
	}
	//List Iterator in Order
	private static void printListInorderIterator(ArrayList<String>printList) {
		System.out.println("List in Order : List Iterator");
		Iterator<String> listIt=printList.iterator();
				while(listIt.hasNext()) {
					String show=listIt.next();
					System.out.println(show);
				}
				System.out.println();
	}
	//For Each Loop
	private static void printListInorder(ArrayList<String>printList) {
		System.out.println("List in Order : For Each Loop");
		for(String show:printList)
		 {
           System.out.println(show);
       }
		System.out.println();
	}
	//Reverse Order using For Loop
	private static void printListReverse(ArrayList<String>printList) {
		System.out.println("List in Reverse Order: For Loop");
		int size=printList.size();
		for(int i=(size-1);i>=0;i--)
		 {
           System.out.println(printList.get(i));
       }
		System.out.println();
	}
	//List Iterator in Reverse Order
			private static void printListReverseIterator(ArrayList<String>printList) {
				System.out.println("List in Reverse Order : List Iterator");
				ListIterator<String> listIt=printList.listIterator(printList.size());
						while(listIt.hasPrevious()) {
							String show=listIt.previous();
							System.out.println(show);
						}
						System.out.println();
			}
	public static void main(String[] args) {
		
		//Calling list array function
		ArrayList<String> calllist=getlistArray();
		
		//Print the list
		//#1 Using For Each Loop
		printListInorder(calllist);
		//#2 Using List Iterator
		printListInorderIterator(calllist);
		//#3 Using For Loop in reverse order
		printListReverse(calllist);
		//#4 Using List Iterator in reverse order
		printListReverseIterator(calllist);
		

	}

}
