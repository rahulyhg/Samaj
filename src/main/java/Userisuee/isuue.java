package Userisuee;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class isuue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nameisuue ;
    
    public void setName(String name) {
        this.nameisuue = name ;
    }
    public String getName() {
        return this.nameisuue ;
    }
    
    private String details ;
    
    public void setDetails(String details) {
        this.details = details ;
    }
    public String getDetails() {
        return this.details ;
    }
    
    private String createUser ;
    
    public void setUser(String user) {
        this.createUser = user ;
    }
    public String getUser() {
        return this.createUser ;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nameisuue != null ? nameisuue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof isuue)) {
            return false;
        }
        isuue other = (isuue) object;
        return !((this.nameisuue == null && other.nameisuue != null) || (this.nameisuue != null && !this.nameisuue.equals(other.nameisuue)));
    }

    @Override
    public String toString() {
        return "Userisuee.isuue[ id=" + nameisuue + " ]";
    }
    
}
