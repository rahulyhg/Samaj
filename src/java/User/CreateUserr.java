package User;

import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

@Remote(remot.class)
@Stateless
public class CreateUserr implements remot {
    
    @PersistenceContext(unitName="WebApplication6PU")
    private EntityManager em ;
    
    private String Queryy = "SELECT c FROM USERRinn c WHERE c.id LIKE :emaill" ;
    
    public EntityManager getEntityManager() {
        return this.em ;
    }
    
    @Override
    public void createNewUser(String Name , String emaill , String Password) {
        USERRinn user1 = new USERRinn() ;
        byte[] b = new byte[10000] ;
        user1.setName(Name);
        user1.setImage(b);
        user1.setId(emaill);
        user1.setPassword(Password);
        user1.setAboutYu("");
        user1.setDeta("");
        user1.setPhoneNu(0);
        user1.setUserDislikk("");
        user1.setUserLike("");
        
        getEntityManager().persist(user1);
    }
    
    @Override
    public USERRinn getUser(String emaill) {
        return (USERRinn) getEntityManager().createQuery(Queryy).setParameter("emaill", emaill).getResultList().get(0) ;
    }
    
    @Override
    public List<USERRinn> findAllUsers() {
        String query = "SELECT u FROM u" ;
        
        return getEntityManager().createQuery(query).getResultList() ;
    }
    
    @Override
    public boolean checkUser(String emaill) {
        List<USERRinn> list = findAllUsers() ;
        return list.stream().anyMatch((userr) -> (userr.getId().equalsIgnoreCase(emaill))) ;
    }
    
}
