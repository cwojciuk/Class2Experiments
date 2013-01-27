/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Chuck Wojciuk
 */
public class TestSessionBeanTest {
    

    public TestSessionBeanTest() {
    }
    

    @BeforeClass
    public static void setUpClass() {
    }
    

    @AfterClass
    public static void tearDownClass() {
    }
    

    @Before
    public void setUp() {
    }
    

    @After
    public void tearDown() {
    }
    /**
     * Test of testBusinessMethod method, of class TestSessionBean.
     */
    @Test
    public void testTestBusinessMethod() throws Exception {
        System.out.println( "testBusinessMethod" );
        String name = "Chuck";
        EJBContainer container =
                     javax.ejb.embeddable.EJBContainer.createEJBContainer();
        TestSessionBean instance =
                        (TestSessionBean)container.getContext().
                lookup( "java:global/classes/TestSessionBean" );
        String expResult = "Hello Chuck";
        String result = instance.testBusinessMethod( name );
        assertEquals( expResult, result );

    }
}

