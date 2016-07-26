package User;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class USERRinn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;  // emaill

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    @Lob
    private byte[] image ;
    
    public void setImage(byte[] image) {
        this.image = image ;
    }
    public byte[] getImage() {
        return this.image ;
    }
    
    private String NameUser ;
    
    public void setName(String name) {
        this.NameUser = name ;
    }
    public String getName() {
        return this.NameUser ;
    }
    
    private String Password ;
    
    public void setPassword(String password) {
        this.Password = password ;
    }
    public String getPassword() {
        return this.Password ;
    }
    
    private long phoneNu ;
    
    public void setPhoneNu(long phone) {
        this.phoneNu = phone ;
    }
    public long getPhoneNu() {
        return this.phoneNu ;
    }
    
    private String aboutYou ;
    
    public void setAboutYu(String about) {
        this.aboutYou = about ;
    }
    public String getAboutYu() {
        return this.aboutYou ;
    }
    
    private String details ;
    
    public void setDeta(String detau) {
        this.details = detau ;
    }
    public String getDeta() {
        return this.details ;
    }
    
    private String UserLikk ;
    
    public void setUserLike(String likes) {
        this.UserLikk = likes ;
    }
    public String getUserLike() {
        return this.UserLikk ;
    }
    
    private String UserDislikk ;
    
    public void setUserDislikk(String dislike) {
        this.UserDislikk = dislike ;
    }
    public String getUserDislikk() {
        return this.UserDislikk ;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof USERRinn)) {
            return false;
        }
        USERRinn other = (USERRinn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User.USERRInn[ id=" + id + " ]";
    }
    
}
