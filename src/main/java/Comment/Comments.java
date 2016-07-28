package Comment;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    /* 
     * Username of the user who created the comment 
     */
    private String userr ;
    public void setUserr(String userr) {
        this.userr = userr ;
    }
    public String getUserr() {
        return this.userr ;
    }
    
    /*
     * email of the user who created the comment 
     */
    private String emaill ;  
    
    public void setEmaill(String emaill) {
        this.emaill = emaill ;
    }
    public String getEmaill() {
        return this.emaill ;
    }
    
    /*
     * Date and time of creation of comment
     */
    private String dateC ;
    
    public void setDate(String date) {
        this.dateC = date ;
    }
    public String getDate() {
        return this.dateC ;
    }
    
    /*
     * Content of the comment
     */
    private String message ;
    
    public void setMessage(String message) {
        this.message = message ;
    }
    public String getMessage() {
        return this.message ;
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
        if (!(object instanceof Comments)) {
            return false;
        }
        Comments other = (Comments) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Comment.Comments[ id=" + id + " ]";
    }
    
}
