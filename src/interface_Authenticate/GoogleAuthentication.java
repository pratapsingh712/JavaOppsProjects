package interface_Authenticate;

public class GoogleAuthentication implements AuthenticateAccount{

	public String user_name;
	public String password;
	
	public GoogleAuthentication()
	{
		
	}
	
	public GoogleAuthentication(String user_name, String password)
	{
		this.user_name = user_name;
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void Authenticate()
	{
		if(validate(user_name) && validate(password))
		{
			System.out.println("Authentication successfull :");
		}
		else
		{
			System.out.println("Authentication unSuccessfull :");
		}
	}
	
	public boolean validate(String str) {
		
		int alphaCount = 0, digitCount = 0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isAlphabetic(ch))
			{
				alphaCount++;
			}
			else if(Character.isDigit(ch))
			{
				digitCount++;
			}
		}
		
		if(digitCount!=0 && alphaCount!=0)
		{
			return true;
		}
		
		return false;
		
	}

	
	
	
}
