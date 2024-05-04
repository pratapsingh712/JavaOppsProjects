package classes_objects;

public class Student {

	//fields / instance variable
	
	int id; 
	String name;
	
	// 5 subject marks 
	int maths;
	int english;
	int hindi; 
	int physics;
	int chemistry;
	
	Student(){
		System.out.println("Constructor....");
	}
	
	Student(int i, String n, int m, int e, int h,int p, int c){
		id = i;
		name = n;
		maths = m;
		english = e;
		hindi = h;
		physics = p;// this is to show in whatever order the parameter is passed in constructor in that arrangment only it will be initialized 
		chemistry = c;
		
	}
	
	double percentage()
	{
		double total = maths+english+hindi+physics+chemistry;
		
		double percent = (total/500)*100;
		
		return percent;
	}
	
	public String toString() {
		return "id : "+id+"\nName : "+name+"\nMaths : "+maths+"\nEnsligh : "+
				+english+"\nHindi : "+hindi+"\nPhysics : "+physics+"\nChemistry : "+chemistry+"\nPercentage : "+percentage();
				
	}
	
}
