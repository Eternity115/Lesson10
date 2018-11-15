
package Sorting;


public class ISSStudent implements Comparable<ISSStudent>{
    private String name;
    private String address;
    private int id;
    
    ISSStudent (String n, String a, int ii){
        name = n;
        address=a;
        id=ii;
    }
    
    public String toString(){
        return "Name:\t" + name + "\nAddress:\t" + address + "\nID:\t" +id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getID(){
        return id;
    }
    
    @Override
    public int compareTo(ISSStudent o) {
        //this version uses name as the sorting and comparing field
        //vs. student id in other version
        return name.compareTo(o.name);
    }
    
}
