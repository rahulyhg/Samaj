/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserB;

import User.remot1;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author DELL
 */
@Named(value = "changeDetaill")
@RequestScoped
public class changeDetaill {

    /**
     * Creates a new instance of changeDetaill
     */
    public changeDetaill() {
    }
    
    private String passworddNew ;
    public void setPasswordNew(String password) {
        this.passworddNew = password ;
    }
    public String getPasswordNew() {
        return this.passworddNew ;
    }
    
    private byte[] image ;
    public void setImage(byte[] image) {
        this.image = image ;
    }
    public byte[] getImage() {
        return this.image ;
    }
    
    private long phoneNu ;
    public void setPhoneNu(long phoneNu) {
        this.phoneNu = phoneNu ;
    }
    public long getPhoneNu() {
        return this.phoneNu ;
    }
    
    private String likes ;
    public void setLikes(String likes) {
        this.likes = likes ;
    }
    public String getLikes() {
        return this.likes ;
    }
    
    private String dislikes ;
    public void setDislikes(String dislikes) {
        this.dislikes = dislikes ;
    }
    public String getDislikes() {
        return this.dislikes ;
    }
    private String password ;
    public void setPassword(String password) {
        this.password = password ;
    }
    public String getPassword() {
        return this.password ;
    }
    
    private String aboutYu ;
    public void setAboutYu(String aboutYu) {
        this.aboutYu = aboutYu ;
    }
    public String getAboutYu() {
        return this.aboutYu ;
    }
    
    private String detaills ;
    public void setDetaills(String detaills) {
        this.detaills = detaills ;
    }
    public String getDetaills() {
        return this.detaills ;
    }
    
    private String name ;
    public void setName(String name) {
        this.name = name ;
    }
    public String getName() {
        return this.name ;
    }
    
    @EJB
    private remot1 r ;
    
    @ManagedProperty(value="#{login}")
    private LoginB loginb ;
    
    public String changePassword() {
        if(loginb.getIn()) {
            if(r.getPassword(loginb.getEmaill()).equals(getPassword())) {
                r.changePassword(loginb.getEmaill(), getPasswordNew()) ;
                return "profile" ;
            }
            return "" ;
        }
        else return "" ;
    }
    
    public String changeName() {
        if(loginb.getIn()) {
            r.setName(loginb.getEmaill(), getName());
            return "profile" ;
        }
        else return "" ;
    }
    
    public String changeDetaills() {
        if(loginb.getIn()) {
            r.setDeta(loginb.getEmaill(), getDetaills());
            return "profile" ;
        }
        else return "" ;
    }
    
    public String changeAboutYu() {
        if(loginb.getIn()) {
            r.setAboutYu(loginb.getEmaill(), getAboutYu());
            return "profile" ;
        }
        else return "" ;
    }
    
    public String changeImage() {
        if(loginb.getIn()) {
            r.setImage(loginb.getEmaill(), getImage());
            return "profile" ;
        }
        else return "" ;
    }
    
    public String changeLikes() {
        if(loginb.getIn()) {
            r.setUserLikee(loginb.getEmaill(), getLikes());
            return "profile" ;
        }
        else return "" ;
    }
    
    public String changeDislikes() {
        if(loginb.getIn()) {
            r.setUserDislikee(loginb.getEmaill(), getDislikes());
            return "profile" ;
        }
        else return "" ;
    }
    
    public String changePhoneNu() {
        if(loginb.getIn()) {
            r.setPhoneNu(loginb.getEmaill(), getPhoneNu());
            return "profile" ;
        }
        else return "" ;
    }
}
