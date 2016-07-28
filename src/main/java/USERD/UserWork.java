package USERD;

import java.util.List;

public interface UserWork {
    public void createPost(String head , String paragraph , String Userr , String emaill , String isuue);
    public List getPostWUser(String emaill) ;
    public List getPostWisuue(String isuue) ;
    public List getPostWUserLength(String emaill , int length) ;
    public void addComment() ;
}
