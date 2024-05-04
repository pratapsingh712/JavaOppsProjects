package multipleInheritance;

import java.util.ArrayList;

import java.util.Scanner;

public class InstituteDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//String name,int totalClasses,int classAttended, int totalMarks, int totalSubject
		
		ArrayList<MVJCE> list = new ArrayList<MVJCE>();
		
		MVJCE mvj = new MVJCE("Kunga",121,78,879,12);
		MVJCE mvj1 = new MVJCE("Tarun",121,55,989,12);
		MVJCE mvj2 = new MVJCE("Aridum",121,48,758,12);
		MVJCE mvj3 = new MVJCE("Satyam",121,38,956,12);
		MVJCE mvj4 = new MVJCE("Abhishek",121,18,989,12);
		MVJCE mvj5 = new MVJCE("Raghav",121,58,1150,12);
		
		list.add(mvj);
		list.add(mvj1);
		list.add(mvj2);
		list.add(mvj3);
		list.add(mvj4);
		list.add(mvj5);
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		
		System.out.println("Do you want to display student with least attendace yes/no");
		String opt = sc.next();
		
		switch(opt)
		{
			case "yes" : int maxAttendace = 100;
						 MVJCE student_with_shortage = list.get(0);
							for(int i=0;i<list.size();i++)
							{
								MVJCE attendaceInstance = list.get(i);
								
								if(attendaceInstance.getAttendance()<maxAttendace)
								{
									maxAttendace = (int) attendaceInstance.getAttendance();
									student_with_shortage = attendaceInstance;
								}
							}
							System.out.println("Student with least attendace percentage : \n"+student_with_shortage);
			break;
			
			case "no": System.out.println("Thank you !");
			break;
			
			default: System.out.println("Invalid input !");
		}
		
		sc.close();
	}
}
