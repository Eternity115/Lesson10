
package Searching;


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
        return "Name:\t\t" + name + "\nAddress:\t\t" + address + "\nID:\t\t" +id;
    }
    
    public int getID(){
        return id;
    }
    
    @Override
    public int compareTo(ISSStudent o) {
        if (this.id > o.getID()) return 1;
        else if (id< o.getID()) return -1;
        else return 0;
    }
    
}
