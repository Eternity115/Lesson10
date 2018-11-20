
package insertremovearraylist;


public class Person implements Comparable<Person>{
    private String name, gender;
    private int age;
    
    public Person(String nm, int ag, String gen){
        name=nm;
        age=ag;
        gender=gen;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        age =a;
    }

    public int getAge() {
        return age;
    }
    
    public void setGen(String gen){
        gender=gen;
    }
    
    public String getGen() {
        return gender;
    }
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}' + "\n";
    }
    
    @Override
    public int compareTo(Person t) {
        return name.compareTo(t.getName());
    }
    
}
