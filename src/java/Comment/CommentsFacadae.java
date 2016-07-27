package Comment;

import User.remot1;
import java.util.Date;
import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote(remotC.class)
@Stateless
public class CommentsFacadae implements remotC {
    
    @PersistenceContext(unitName="WebApplication6PU2")
    private EntityManager em ;
    
    @Resource
    private remot1 userr ;
    
    public EntityManager getEntityManager() {
        return this.em ;
    }
    
    @Override
    public void createComment(String emaill ,  String Userr ,String message) {
        Comments c = new Comments() ;
        String datee = new Date().toString() ;
        
        c.setMessage(message);
        c.setId(emaill+datee);
        c.setDate(datee);
        c.setUserr(emaill); 
        c.setEmaill(Userr); 
        getEntityManager().persist(c);
    }
    
    @Override
    public String getUser(String emaill) {
        return userr.getName(emaill) ;
    }
    
}
