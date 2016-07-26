package USERD;

import Comment.Comments;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class USERPOsts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id ;
    
    public void setId(String id) {
        this.id = id ;
    }
    public String getId() {
        return this.id ;
    }
    
    private String dateP ;
    
    public void setDate(String date) {
        this.dateP = date ;
    }
    public String getDate() {
        return this.dateP ;
    }
    
    @OneToMany(cascade={CascadeType.ALL} , fetch=FetchType.LAZY)
    private List<Comments> comments ;
    
    public void setComments(List<Comments> comments) {
        this.comments = comments ;
    }
    public List<Comments> getComments() {
        return this.comments ;
    }
            
    private String headingT ;
    
    public void setHead(String head) {
        this.headingT = head ;
    }
    public String getHead() {
        return this.headingT ;
    }
    
    private String paraDetail ;
    
    public void setParaDetail(String paraDetail) {
        this.paraDetail = paraDetail ;
    }
    public String getParaDetail() {
        return this.paraDetail ;
    }
    
    private String emaill ;
    
    public void setEmaill(String emaill) {
        this.emaill = emaill ;
    }
    public String getEmaill() {
        return this.emaill ;
    }
    
    private String Userr ;
    
    public void setUserr(String userr) {
        this.Userr = userr ;
    }
    public String getUserr() {
        return this.Userr ;
    }
    
    private String isuue ;
    
    public void setisuue(String topi) {
        this.isuue = topi ;
    }
    public String getisuue() {
        return this.isuue ;
    }
    
    private long viewss ;
    
    public void setViews(long viewws) {
        this.viewss = viewws ;
    }
    public long getViews() {
        return this.viewss ;
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
        if (!(object instanceof USERPOsts)) {
            return false;
        }
        USERPOsts other = (USERPOsts) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "USERD.USERPOsts[ id=" + id + " ]";
    }
    
}
