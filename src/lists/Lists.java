/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author Andrey
 */
public class Lists {

    public static void main(String[] args) {
        // TODO code application logic here
        MyList ml = new MyList();
        ml.add("some text");
        ml.add(5);
        ml.add(1);  
        
        ml.printContentsList();
        
        System.out.println("");
        
        ml.printContentByIndex(5);
    }
    
}
