package abstractStudentUsingArray;

public class School {

	public static void main(String[] args) {
		
		int marks[] = {89,98,79,90,78};
		CLSS8 c8 = new CLSS8("Rahav",marks);
		int marks1[] = {75,95,68,78,82};
		CLSS8 c81 = new CLSS8("Tarun",marks1);
		int marks2[] = {75,75,68,68,82};
		CLSS8 c82 = new CLSS8("Styam",marks2);
		int marks3[] = {65,75,68,68,72};
		CLSS8 c83 = new CLSS8("Arindum",marks3);
		
		System.out.println(c8.toString());
		System.out.println(c81.toString());
		System.out.println(c82.toString());
		System.out.println(c83.toString());
		
		System.out.println("================================================");
		
		

	}

}
