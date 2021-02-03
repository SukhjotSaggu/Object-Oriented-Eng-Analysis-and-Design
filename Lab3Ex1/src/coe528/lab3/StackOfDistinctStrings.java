package coe528.lab3;
import java.util.ArrayList;
/**
 * @author Sukhjot Saggu
 */

public class StackOfDistinctStrings {
 // Overview: StacksOfDistinctStrings are mutable, bounded
 // collection of distinct strings that operate in
 // LIFO (Last-In-First-Out) order.
 //
 // The abstraction function is:
 // a) F(s) = String(0), String(1),..., String(s)
 // The String(s) much contain a value, meaning it cannot equal null, and
 // it must fullow the rep invarient
 //
 //
 // The rep invariant is:
 // b) String(s) != null
 // String(s) != any value of String(0 to s-1), meaning the value of String(s) 
 // cannot be the same as any String() before it
 //
 //
 //the rep
 private ArrayList<String> items;
 // constructor
 public StackOfDistinctStrings() {
 // EFFECTS: Creates a new StackOfDistinctStrings object
 items = new ArrayList<String>();
 }
 public void push(String element) throws Exception {
 // MODIFIES: this
 // EFFECTS: Appends the element at the top of the stack
 // if the element is not in the stack, otherwise
 // does nothing.
    if(element == null) throw new Exception();
    if(false == items.contains(element))
     items.add(element);
 }
 public String pop() throws Exception {
 // MODIFIES: this
 // EFFECTS: Removes an element from the top of the stack
    if (items.size() == 0) throw new Exception();
    return items.remove(items.size()-1);
 }
 public boolean repOK() {
 // EFFECTS: Returns true if the rep invariant holds for this
 // object; otherwise returns false
 // c) Write the code for the repOK() here
 
    for(String temp:items){
        for(int i=0; i<items.size(); i++){
            if(items.contains(temp)){
                return false;
            }
        }
    }
    return true;
 }

 public String toString() {
 // EFFECTS: Returns a string that contains the strings in the
 // stack and the top element. Implements the
 // abstraction function.
 // d) Write the code for the toString() here
    String display = "The number of elements in the stack are: " + items.size() + System.lineSeparator();
    
    for(int i=items.size(); i>=0; i++){
        display = display + " " + items.get(i) + System.lineSeparator();
    }
    
    return display;
 }
}