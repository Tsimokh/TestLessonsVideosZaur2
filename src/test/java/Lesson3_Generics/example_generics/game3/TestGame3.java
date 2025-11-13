package Lesson3_Generics.example_generics.game3;

public class TestGame3 {
    public static void main(String[] args) {
        Schoolar3 sch1 = new Schoolar3("Adam", 14);
        Schoolar3 sch2 = new Schoolar3("Milla", 16);

        Student3 st1 = new Student3("Kate", 19);
        Student3 st2 = new Student3("Mike", 21);

        Employee3 emp1 = new Employee3("Lucie", 26);
        Employee3 emp2 = new Employee3("Amanda", 31);

        Team3<Schoolar3> schollarTeam = new Team3<>("Dragons");
        schollarTeam.addParticipant(sch1);
        schollarTeam.addParticipant(sch2);


        Team3<Student3> studentTeam = new Team3<>("HardStudent");
        studentTeam.addParticipant(st1);
        studentTeam.addParticipant(st2);


        Team3<Employee3> employeeTeam = new Team3<>("HardWorker");
        employeeTeam.addParticipant(emp1);
        employeeTeam.addParticipant(emp2);

//        Team3<String> t = new Team3<>("Winner");

        schollarTeam.playWith(studentTeam);
        schollarTeam.playWith(employeeTeam);
        studentTeam.playWith(employeeTeam);
//        schollarTeam.playWith(t);
    }
}
