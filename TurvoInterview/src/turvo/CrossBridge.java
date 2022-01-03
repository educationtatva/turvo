package turvo;

import java.util.*;

public class CrossBridge {
	static List<Person> otherSideOfBridge  = new ArrayList<Person>();
	static List<Person> listOfPerson = new ArrayList<Person>();
	static int totalTimeTook =0;
	public static void main(String args[]) {

		listOfPerson.add(new Person("A",1));
		listOfPerson.add(new Person("B",75));
		listOfPerson.add(new Person("C",50));
		listOfPerson.add(new Person("D",150));
		listOfPerson.add(new Person("E",100));
		listOfPerson.add(new Person("F",2));
		listOfPerson.add(new Person("G",200));
		Collections.sort(listOfPerson, new SortByTimeUnit());
//		for(int i=0;i< listOfPerson.size();i++) {
//			System.out.println(listOfPerson.get(i).getName());
//		}
		
		int count  =1;
		int numberOfIterations = listOfPerson.size();
		while(count <= numberOfIterations) {
			if (listOfPerson.size() ==0)
				break;

//			System.out.println("================================================Iteration Number "+count);
//			System.out.println(" OtherSideOfTheBridge :::::: ");
//			for(int i=0;i< otherSideOfBridge.size();i++) {
//				System.out.print(" "+otherSideOfBridge.get(i).getName());
//			}
			
//			System.out.println("");
//			System.out.println(" listOfPerson :::::: ");
//			for(int i=0;i< listOfPerson .size();i++) {
//				System.out.print(" "+listOfPerson.get(i).getName());
//			}
			
			if (count%2!=0) {
			
				System.out.println("");
				sendFastestTogether();
				Collections.sort(listOfPerson, new SortByTimeUnit());
				Collections.sort(otherSideOfBridge, new SortByTimeUnit());
	
//				System.out.println("after sendFastestTogether OtherSideOfTheBridge :::::: ");
//				for(int i=0;i< otherSideOfBridge.size();i++) {
//					System.out.print(" "+otherSideOfBridge.get(i).getName());
//				}
//				System.out.println("");
//				System.out.println("after sendFastestTogether listOfPerson :::::: ");
//				for(int i=0;i< listOfPerson .size();i++) {
//					System.out.print(" "+listOfPerson.get(i).getName());
//				}
			}else {
				
				sendSlowestTogether();
				Collections.sort(listOfPerson, new SortByTimeUnit());
				Collections.sort(otherSideOfBridge, new SortByTimeUnit());
				
//				System.out.println("after sendLowestTogether OtherSideOfTheBridge :::::: ");
//				for(int i=0;i< otherSideOfBridge.size();i++) {
//					System.out.print(" "+otherSideOfBridge.get(i).getName());
//				}
//				System.out.println("");
//				System.out.println("after sendLowestTogether listOfPerson :::::: ");
//				for(int i=0;i< listOfPerson .size();i++) {
//					System.out.print(" "+listOfPerson.get(i).getName());
//				}
//				System.out.println("");
				
			}
			
			if(listOfPerson.size()>0) {
			returnFastest();
			Collections.sort(listOfPerson, new SortByTimeUnit());
			Collections.sort(otherSideOfBridge, new SortByTimeUnit());
			}
//			System.out.println("");
//			System.out.println("after returnFastest OtherSideOfTheBridge :::::: ");
//			for(int i=0;i< otherSideOfBridge.size();i++) {
//				System.out.print(" "+otherSideOfBridge.get(i).getName());
//			}
//			System.out.println("");
//			System.out.println("after returnFastest listOfPerson :::::: ");
//			for(int i=0;i< listOfPerson .size();i++) {
//				System.out.print(" "+listOfPerson.get(i).getName());
//			}
			
			

			
			System.out.println("Number of Iteration "+count+" total Time took "+totalTimeTook);
			System.out.println("OtherSideOfTheBridge :::::: ");
			for(int i=0;i< otherSideOfBridge.size();i++) {
				System.out.print(" "+otherSideOfBridge.get(i).getName());
			}
			System.out.println("");
			System.out.println("listOfPerson :::::: ");
			for(int i=0;i< listOfPerson .size();i++) {
				System.out.print(" "+listOfPerson.get(i).getName());
			}			
			
			count ++;
	
		}
		
		//System.out.print("Number of Iteration "+count+" total Time took "+totalTimeTook);
		
		
	}
	
 public static void sendFastestTogether() {
	 for(int i=0;i<2;i++) {
		 if(i==1) {
			 totalTimeTook += listOfPerson.get(0).timeUnit;
		 }
		 otherSideOfBridge.add(listOfPerson.get(0));
		 //System.out.println("sendFastest>>> "+listOfPerson.get(0).name);
		 listOfPerson.remove(0);
	 }
 }
 public static void sendSlowestTogether() {
	 for(int i=0;i<2;i++) {
		 if(i==0) {
			 totalTimeTook += listOfPerson.get(listOfPerson.size()-1).timeUnit;
		 }
		 otherSideOfBridge.add(listOfPerson.get(listOfPerson.size()-1));
		 //System.out.println("sendSlowest>>> "+listOfPerson.get(listOfPerson.size()-1).name);
		 listOfPerson.remove(listOfPerson.size()-1);
	 }
 }
 public static void returnFastest() {
	 //System.out.println("returnFastest>>> "+otherSideOfBridge.get(0).name);
	 totalTimeTook += otherSideOfBridge.get(0).timeUnit;
	 listOfPerson.add(otherSideOfBridge.get(0));
	 otherSideOfBridge.remove(0);
 }

}
