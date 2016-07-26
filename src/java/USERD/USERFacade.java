package USERD;

import Comment.Comments;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote(UserWork.class)
@Stateless
public class USERFacade implements UserWork{  // describes all the works of user
    
    @PersistenceContext(unitName="WebApplication6PU2")
    private EntityManager em ;
    
    public EntityManager getEntityManager() {
        return this.em ;
    }
    
    @Override
    public void createPost(String head , String paragraph , String Userr , String emaill , String isuue) {
        USERPOsts p = new USERPOsts() ;
        List<Comments> c = new ArrayList() ;
        String d = new Date().toString() ;
        
        p.setDate(d);
        p.setId(emaill+d);
        p.setComments(c); 
        p.setEmaill(emaill);
        p.setHead(head);
        p.setParaDetail(paragraph);
        p.setUserr(Userr);
        p.setisuue(isuue);
        
        p.setViews(0);
        getEntityManager().persist(p);
    }
    
    @Override
    public List getPostWUser(String emaill) {
        String query = "SELECT p FROM USERPOsts p WHERE p.emaill LIKE :emaill" ;
        return getEntityManager().createQuery(query).setParameter("emaill", emaill).getResultList() ;
    }
    
    @Override
    public List getPostWisuue(String isuue) {
        String query = "SELECT p FROM USERPOsts p WHERE p.isuue LIKE :isuue" ;
        return getEntityManager().createQuery(query).setParameter("isuue", isuue).getResultList() ;
    }
    
    @Override
    public List getPostWUserLength(String emaill , int length) {
        String query = "SELECT p FROM USERPOsts p WHERE p.emaill LIKE :emaill" ;
        List<USERPOsts> listr = getEntityManager().createQuery(query).setParameter("emaill", emaill).getResultList() ;
        
        return listr.subList(0, length) ;
    }
    
    @Override
    public void addComment() {
        
    }
    
}
