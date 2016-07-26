/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface remot {
    public void createNewUser(String Name , String emaill , String Password);
    public USERRinn getUser(String emaill) ;
    public List<USERRinn> findAllUsers() ;
    public boolean checkUser(String emaill) ;
}
