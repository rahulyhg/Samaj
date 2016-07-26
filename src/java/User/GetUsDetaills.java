package User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote(remot1.class)
@Stateless
public class GetUsDetaills implements remot1 {
    
    @PersistenceContext(unitName="WebApplication6PU")
    private EntityManager em ;
    
    public EntityManager getEntityManager() {
        return this.em ;
    }
    
    @EJB
    private remot r ;
    
    @Override
    public String changePassword(String emaill , String Password) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setPassword(Password);
        
        getEntityManager().persist(userr);
        USERRinn user2 = r.getUser(emaill) ;
        
        return user2.getPassword() ;
    }
    
    @Override
    public void setAboutYu(String emaill , String aboutt) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setAboutYu(aboutt);
        
        getEntityManager().persist(userr);
    }
    
    @Override
    public void setDeta(String emaill , String detaill) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setDeta(detaill);
        
        getEntityManager().persist(userr);
    }
    
    @Override
    public void setPhoneNu(String emaill , long phone) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setPhoneNu(phone);
        
        getEntityManager().persist(userr);
    }
    
    @Override
    public void setUserLikee(String emaill , String likeUser) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setUserLike(likeUser);
        
        getEntityManager().persist(userr);
    }
    
    @Override
    public void setUserDislikee(String emaill , String dislikeUserr) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setUserDislikk(dislikeUserr);
        
        getEntityManager().persist(userr);
    }
    
    @Override
    public void setName(String emaill , String name) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setName(name);
        
        getEntityManager().persist(userr);
    }
    
    @Override
    public String getName(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getName() ;
        return "" ;
    }
    
    @Override
    public String getEmaill(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getId() ;
        return null ;
    }
    
    @Override
    public String getPassword(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getPassword() ;
        return "" ;
    }
    
    @Override
    public String getAboutYu(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getAboutYu() ;
        return null ;
    }
    
    @Override
    public String getDetaill(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getDeta() ;
        return null ;
    }
    
    @Override
    public long getPhoneNu(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getPhoneNu() ;
        return 0 ;
    }
    
    @Override
    public String getUserLike(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getUserLike() ;
        return null ;
    }
    
    @Override
    public String getUserDislikk(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getUserDislikk() ;
        return null ;
    }
    
    @Override
    public void setImage(String emaill , byte[] image) {
        USERRinn userr = r.getUser(emaill) ;
        userr.setImage(image);
        
        getEntityManager().persist(userr);
    }
    
    @Override
    public byte[] getImage(String emaill) {
        if(r.checkUser(emaill))
            return r.getUser(emaill).getImage() ;
        return null ;
    }
    
}
