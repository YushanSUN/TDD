package customer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exception.InvalidPasswordException;

public class CustomerTest {
	
	Customer customer;	
    
	@Before
	public void setUp(){ 
    	customer = new Customer("id","password");
    }
    
    @After
    public void tearDown(){
    	customer = null;
    }
	
    @Test(expected = InvalidPasswordException.class)
	public void verifyNullPasswordReturnException() throws InvalidPasswordException
	{
		
		customer.matchPassword(null);
	}
    
    @Test(expected = InvalidPasswordException.class)
	public void verifyVidePasswordReturnException() throws InvalidPasswordException
	{
		
		customer.matchPassword("");
	}
    
    @Test
	public void verifyFauxPasswordReturnException() throws InvalidPasswordException
	{
		
    	assertEquals(false,customer.matchPassword("1"));
	}
    
    @Test
   	public void verifyVraiPasswordReturnException() throws InvalidPasswordException
   	{
   		
       	assertEquals(true,customer.matchPassword("password"));
   	}
    
    
}
