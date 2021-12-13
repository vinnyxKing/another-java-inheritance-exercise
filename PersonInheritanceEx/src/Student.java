import javax.swing.*;

public class Student extends Person{
    protected int avgMark;

    public Student(){
        super();

    }
    public Student(String nameInput, int ageInput, int markInput){
        this.avgMark = markInput;
        super.name = nameInput; // i dunno how but this works lol
        super.age = ageInput; //set super age to ageinput of this class
    }

    public void setMark(int markIn){
        this.avgMark = markIn;
    }
    public void study(int hours){
        avgMark = avgMark + (hours*2); // hours for calculation
    }
    @Override
    public void register(){
        JOptionPane.showMessageDialog(null,"name: " +
                super.name + "\n Age: " + super.age +
                "\n Average mark is: " + avgMark);
    }


}
