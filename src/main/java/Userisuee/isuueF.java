package Userisuee;

import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote(remotisuue.class)
@Stateless
public class isuueF implements remotisuue {

    @PersistenceContext(unitName="WebApplication6PU2")
    private EntityManager em ;
    
    public EntityManager getEntityManager() {
        return this.em ;
    }
    
    @Override
    public void createIsuue(String name , String details , String user) {
        isuue e = new isuue() ;
        
        e.setName(name);
        e.setUser(user);
        e.setDetails(details);
        getEntityManager().persist(e);
    }
    
    @Override
    public List<isuue> getAllisuue() {
        String query = "SELECT i FROM isuue i" ;
        
        return getEntityManager().createQuery(query).getResultList() ;
    }
    
    @Override
    public String getUser(String nameisuue) {
        String query = "SELECT i FROM i WHERE i.nameisuue LIKE :nameisuue" ;
        isuue i = (isuue) getEntityManager().createQuery(query).setParameter("nameisuue", nameisuue).getResultList().get(0);
        
        return i.getUser() ;
    }
    
    @Override
    public String getDetails(String nameisuue) {
        String query = "SELECT i FROM i WHERE i.nameisuue LIKE :nameisuue" ;
        isuue i = (isuue) getEntityManager().createQuery(query).setParameter("nameisuue", nameisuue).getResultList().get(0) ;
        
        return i.getDetails() ;
    }
    
    @Override
    public List<isuue> getALLWuser(String userr) {
        String query = "SELECT i FROM i WHERE i.createUser LIKE :userr" ;
        
        return getEntityManager().createQuery(query).setParameter("userr", userr).getResultList() ;
    }
}
