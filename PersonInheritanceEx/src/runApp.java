public class runApp {
    public static void main(String[] args) {

        Person newPerson = new Person("Alex",30); // create the instance of class Person
        newPerson.register(); // call the register function that displays the output
        Student testStudent = new Student("Ben",22, 85); // create the instance of class Student
        testStudent.study(5); // add hour for calculation
        testStudent.register(); //call the overridden function in Student class
        Undergraduate testGrad = new Undergraduate("Matthew",20,78,"Engineering",2020);
        testGrad.changeYear(); // change year
        testGrad.study(3); // add number of hours for calculation
        testGrad.register(); // call the overridden function in undergraduate class
    }
}
