package interface_Authenticate;

public class AuthenticateMain {

	public static void main(String[] args) {
		
		GoogleAuthentication gl = new GoogleAuthentication("Raghav1234","Raghav@1234");
		
		System.out.println("Username "+gl.toString());
		
		GoogleAuthentication gl1 = new GoogleAuthentication("Raghav","Raghav@1234");
		
		gl1.Authenticate();
	}
}
