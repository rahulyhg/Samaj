package UserB;

import User.remot1;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

@Named(value = "login")
@SessionScoped
public class LoginB implements Serializable {

    /**
     * Creates a new instance of LogiS
     */
    public LoginB() {
    }
    
    private String emaill ;
    
    public void setEmaill(String emaill) {
        this.emaill = emaill ;
    }
    public String getEmaill() {
        return this.emaill ;
    }
                             /////////////////////
    private String password ;
    
    public void setPassword(String password) {
        this.password = password ;
    }
    public String getPassword() {
        return this.password ;
    }
                             /////////////////////
    private String nameUser ;
    
    public void setName(String name) {
        this.nameUser = name ;
    }
    public String getName() {
        return this.nameUser ;
    }
                             /////////////////////
    private long phoneNu ;
    
    public void setPhoneNu(long phoneNu) {
        this.phoneNu = phoneNu ;
    }
    public long getPhoneNu() {
        return this.phoneNu ;
    }
                             /////////////////////
    private String likes ;
    
    public void setLikes(String likes) {
        this.likes = likes ;
    }
    public String getLikes() {
        return this.likes ;
    }
                             /////////////////////
    private String dislikes ;
    
    public void setDislikes(String dislikes) {
        this.dislikes = dislikes ;
    }
    public String getDislikes() {
        return this.dislikes ;
    }
                             /////////////////////
    private String details ;
    
    public void setDetails(String details) {
        this.details = details ;
    }
    public String getDetails() {
        return this.details ;
    }
                             /////////////////////
    private String aboutYu ;
    
    public void setAboutYu(String aboutyu) {
        this.aboutYu = aboutyu ;
    }
    public String getAboutYu() {
        return this.aboutYu ;
    }
                             /////////////////////
    private byte[] image ;
    
    public void setImage(byte[] image) {
        this.image = image ;
    }
    public byte[] getImage() {
        return this.image ;
    }
    
    private boolean in ;
    public void setIn(boolean in) {
        this.in = in ;
    }
    public boolean getIn() {
        return this.in ;
    }
                             ////////////////////
    @EJB
    private remot1 r ;
    
    public String loginn() {
        if(r.getPassword(getEmaill()).equals(getPassword())) {
            this.setName(r.getName(getEmaill()));
            this.setIn(true);
            this.setDetails(r.getDetaill(getEmaill()));
            this.setAboutYu(r.getAboutYu(getEmaill()));
            this.setEmaill(getEmaill());
            this.setImage(r.getImage(getEmaill()));
            this.setLikes(r.getUserLike(getEmaill()));
            this.setDislikes(r.getUserDislikk(getEmaill()));
            this.setPassword("");
            this.setPhoneNu(r.getPhoneNu(getEmaill()));
            return "loggedin" ;
        }
        else {
            this.setEmaill("");
            this.setPassword("");
            
            return "logNot" ;
        }
    }
    
    public String logout() {
        this.setName(null);
        this.setDetails(null);
        this.setAboutYu(null);
        this.setEmaill(null);
        this.setImage(null);
        this.setLikes(null);
        this.setDislikes(null);
        this.setPassword("");
        this.setPhoneNu(0);
        this.setIn(false);
            
        return "index" ;
    }
    
}
