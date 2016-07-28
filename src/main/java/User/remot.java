package User;

import java.util.List;

public interface remot {
    public void createNewUser(String Name , String emaill , String Password);
    public USERRinn getUser(String emaill) ;
    public List<USERRinn> findAllUsers() ;
    public boolean checkUser(String emaill) ;
}
