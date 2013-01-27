/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import javax.ejb.Stateless;


/**
 *
 * @author Chuck Wojciuk
 */
@Stateless
public class TestSessionBean {
    public String testBusinessMethod( String name ) {
        return "Hello "+ name;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    
}

