import javax.swing.*;

public class Person {

    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void register(){
        JOptionPane.showMessageDialog(null,"Name is: " + name + " \n age is: " + age);
    }


}
