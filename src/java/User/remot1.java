/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author DELL
 */
public interface remot1 {
    public String changePassword(String emaill , String Password);
    public void setAboutYu(String emaill , String aboutt) ;
    public void setDeta(String emaill , String detaill) ;
    public void setPhoneNu(String emaill , long phone) ;
    public void setUserLikee(String emaill , String likeUser) ;
    public void setUserDislikee(String emaill , String dislikeUserr) ;
    public void setName(String emaill , String name);
    public String getName(String emaill) ;
    public String getEmaill(String emaill) ;
    public String getPassword(String emaill) ;
    public String getAboutYu(String emaill) ;
    public String getDetaill(String emaill) ;
    public long getPhoneNu(String emaill) ;
    public String getUserLike(String emaill) ;
    public String getUserDislikk(String emaill) ;
    public void setImage(String emaill , byte[] image) ;
    public byte[] getImage(String emaill) ;
}
