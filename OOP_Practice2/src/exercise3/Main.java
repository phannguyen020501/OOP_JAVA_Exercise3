package exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		Scanner sc5=new Scanner(System.in);
		Scanner sc6=new Scanner(System.in);
		ManagerCandidate managerCan= new ManagerCandidate();
		/*CandidateA a=new CandidateA("a", "An", "An hòa",1);
		CandidateB b=new CandidateB("b", "Bi", "Bảo lộc", 1);
		CandidateC c=new CandidateC("c", "Châu", "Cao bằng", 2);
		managerCan.addCan(a);
		managerCan.addCan(b);
		managerCan.addCan(c);*/
		while(true) {
			System.out.println("Enter 1: To insert Candidate");
			System.out.println("Enter 2: To show information of Candidate");
			System.out.println("Enter 3: To search candidate by id");
			System.out.println("Enter 4: To exit");
			int line1=sc1.nextInt();
			switch(line1) {
			case 1:{
				System.out.println("Enter 1: To insert candidate A");
				System.out.println("Enter 2: To insert candidate B");
				System.out.println("Enter 3: To insert candidate C");
				int line2=sc2.nextInt();
				switch(line2) {
				case 1:{
					System.out.println("Enter id");
					String id=sc3.nextLine();
					System.out.println("Enter name");
					String name=sc4.nextLine();
					System.out.println("Enter address");
					String address=sc5.nextLine();
					System.out.println("Enter priority");
					int priority=sc6.nextInt();
					CandidateA canA=new CandidateA(id, name, address, priority);
					managerCan.addCan(canA);
					System.out.println(canA.toString());
					break;
					
				}
				case 2:{
					System.out.println("Enter id");
					String id=sc3.nextLine();
					System.out.println("Enter name");
					String name=sc4.nextLine();
					System.out.println("Enter address");
					String address=sc5.nextLine();
					System.out.println("Enter priority");
					int priority=sc6.nextInt();
					CandidateB canB=new CandidateB(id, name, address, priority);
					managerCan.addCan(canB);
					System.out.println(canB.toString());
					break;
				}
				case 3:{
					System.out.println("Enter id");
					String id=sc3.nextLine();
					System.out.println("Enter name");
					String name=sc4.nextLine();
					System.out.println("Enter address");
					String address=sc5.nextLine();
					System.out.println("Enter priority");
					int priority=sc6.nextInt();
					CandidateC canC=new CandidateC(id, name, address, priority);
					managerCan.addCan(canC);
					System.out.println(canC.toString());
					break;
				}
				default:
					System.out.println("Invalid");
					break;
				}
				break;
			}
			case 2:{
				managerCan.showInforCandidate();
				break;
				
			}
			case 3:{
				System.out.println("Enter id: ");
				String id=sc3.nextLine();
				Candidate candidatesearch= managerCan.searchById(id);
				if(candidatesearch== null) {
					System.out.println("Cant find");
				}
				else {
					System.out.println(candidatesearch.toString());
				}
				break;
			}
			case 4:{
				return;
			}
			default:{
				System.out.println("invalid");
				break;
			}
			}
		}
		
		

	}
	
}
