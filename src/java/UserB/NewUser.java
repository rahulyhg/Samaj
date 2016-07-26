package UserB;

import User.remot;
import javax.inject.Named;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

@Named(value = "newUser")
@RequestScoped
public class NewUser implements Serializable {

    /**
     * Creates a new instance of NewUser
     */
    public NewUser() {
    }
    
    private String NameUser ;
    
    public void setUser(String name) {
        this.NameUser = name ;
    }
    public String getUser() {
        return this.NameUser ;
    }
    
    private String emaill ;
    
    public void setEmaill(String emaill) {
        this.emaill = emaill ;
    }
    public String getEmaill() {
        return this.emaill ;
    }
    
    private String Password  ;
    
    public void setPasswordUser(String password) {
        this.Password = password ;
    }
    public String getPasswordUser() {
        return this.Password ;
    }
    
    @EJB
    private remot r ;
    
    public String createUser() {
        if(r.checkUser(getEmaill())) {
            return "notCreated" ;
        }
        r.createNewUser(getUser(), getEmaill(), getPasswordUser());
        this.setEmaill("");
        this.setPasswordUser("");
        this.setUser(""); 
        return "created" ;
    }
    
}
