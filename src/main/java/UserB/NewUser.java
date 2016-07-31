package UserB;

import User.remot;
import javax.inject.Named;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "newUser")
@SessionScoped
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
    
/*    @ManagedProperty(value="#{login}")
    private LoginB loginb ;
    
    public LoginB getLoginb() {
        return this.loginb ;
    }
    
    public void setLoginb(LoginB loginb) {
        this.loginb = loginb ;
    }
    */
    @Inject LoginB loginb ;
    
    public String createUser() {
        if(r.checkUser(getEmaill())) {
            return /*"notCreated"*/"" ;
        }
        r.createNewUser(getUser(), getEmaill(), getPasswordUser());
        /*getLoginb()*/loginb.setEmaill(getEmaill());
        /*getLoginb()*/loginb.setName(getUser());
        
        this.setEmaill("");
        this.setPasswordUser("");
        this.setUser(""); 
        /*getLoginb()*/loginb.setIn(true);
        return /*"created"*/"profill" ;
    }
    
}
