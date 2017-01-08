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
public class Element<Ob> {
    private Element next;
    private Element previous;
    private Ob data;
    
//    Element(Ob data, Element<Ob> next, Element<Ob> previous){
//        this.data = data;
//        this.next = next;
//        this.previous = previous;
//    }

    Element(Ob data){
        this.data = data;
    };
    
    public Ob getData(){
        return data;
    }

    public Element getNext() {
        return next;
    }

    public Element getPrevious() {
        return previous;
    }
    
    public void setNext(Element<Ob> next) {
        this.next = next;
    }
    
    public void setPrevious(Element<Ob> previous) {
        this.previous = previous;
    }
}
