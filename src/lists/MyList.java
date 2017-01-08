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
public class MyList<Ob> {
    private Element first;      
    private Element last; 
    private int size;
 
    public int getSize() {
        return size;
    }
    
    public void add(Ob data) {
        Element<Ob> newElement = new Element<Ob>(data);
        
        if (size>0) {
            newElement.setPrevious(last);       
            last.setNext(newElement);           
        }
        else {
            first = newElement;
        }
        last = newElement;
        size++;
    }
   
    public Element getElementByIndex(int index) {
        if (index < 0 || index >= size) { 
           throw new IndexOutOfBoundsException("There's not such kind element");
        }else{
            Element currElement = first;
            for (int i=1; i<index; i++) {
                currElement = currElement.getNext();
            }
            return currElement;          
        }
    }
    
    public Element getFirst() {
        return first;
    }
    
    public void printContentsList(){ 
        Element start = first;
        do {
            System.out.println(start.getData());
            start = start.getNext();
        } while (start != null);  
    }
    
    public void printContentByIndex(int index){ 
          Element element = getElementByIndex(index);
          System.out.println(element.getData());  
    }

}
