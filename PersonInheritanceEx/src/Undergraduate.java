import javax.swing.*;

public class Undergraduate extends Student {
    protected String prog;
    protected int year;

    public Undergraduate() {
        super();
    }
    public Undergraduate(String nameInput, int ageInput, int markInput, String progInput, int yearInput) {
        this.year = yearInput;
        this.prog = progInput;
        super.age = ageInput;
        super.name = nameInput;
        super.avgMark = markInput;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setProg(String prog) {
        this.prog = prog;
    }
    //display the output
    @Override
    public void register(){
        JOptionPane.showMessageDialog(null,"name: " +
                super.name + "\n Age: " + super.age +
                "\n Average mark is: " + avgMark + "\n" +
                "Study Program is : " + prog + "\n year is: " + year);
    }
    //change year by adding get year plus 1
    public void changeYear(){
        year = getYear() + 1;
    }

    //change the average mark
    @Override
    public void study(int hours){
        avgMark = avgMark + (hours * 2) - 5;
    }
}
