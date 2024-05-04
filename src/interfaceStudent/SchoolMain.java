package interfaceStudent;

public class SchoolMain {

	public static void main(String[] args) {
		
		int pmarks[] = {89,98,79,90,78};
		int tmarks[] = {89,98,79,90,78};
		Class11 cl1 = new Class11("Kunga",pmarks,tmarks,89,78);
		
		
		int pmarks1[] = {75,95,68,78,82};
		int t2marks[] = {89,98,79,90,78};
		Class11 cl2 = new Class11("Satyam",pmarks1,t2marks,99,88);
		
		
		int pmarks2[] = {75,75,68,68,82};
		int t3marks[] = {89,98,79,90,78};
		Class11 cl3 = new Class11("Arindum",pmarks2,t3marks,79,78);
		
		
		int pmarks3[] = {65,75,68,68,72};
		int t4marks[] = {89,98,79,90,78};
		Class11 cl4 = new Class11("Tarun",pmarks3,t4marks,79,68);
		
		System.out.println(cl1.toString());
		System.out.println(cl2.toString());
		System.out.println(cl3.toString());
		System.out.println(cl4.toString());
	}
}
