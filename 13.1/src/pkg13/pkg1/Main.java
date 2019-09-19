/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.pkg1;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int waitTime=12;
        
        try
        {
            System.out.println("Try block of code. ");
            if (waitTime>30)
                throw new Exception ("over 30. ");
            else if (waitTime <30)
                throw new Exception("Under 30. ");
            else 
                System.out.println("No exception. ");
            
            System.out.println("Leaving try block. ");
                        
        }
        
        catch (Exception thrownObject)
        {
            System.out.println(thrownObject.getMessage());
        
        }
        System.out.println("After catch block ");
    }
    
}
