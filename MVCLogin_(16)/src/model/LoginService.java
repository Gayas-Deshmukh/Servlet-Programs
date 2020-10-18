package model;
// Model layer==>Service Class====>Business Logic
public class LoginService 
{
	public boolean validation(String user,String password)
	{
		if(user.equals("admin")&&password.equals("root"))
		{
			return true;
		
		}
		else
		{
			return false;
		}
	}
}
