package acorn;

public class LoginService {

	
     LoginDAO  DAO = new LoginDAO();

	public LoginService() {
        this.DAO = new LoginDAO();
    }

    public boolean loginUser(String inputId, String inputPw) {
        // DAO를 통해 로그인 처리를 수행하고 결과를 반환합니다.
        return DAO.login(inputId, inputPw);
    }
    
    public static void main(String[] args) {
    	LoginService s = new LoginService();
    	boolean result  = s.loginUser("dy", "4482");
    	System.out.println( result);
    	
	}
}