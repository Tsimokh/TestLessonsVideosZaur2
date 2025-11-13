package Lesson3_Generics.example_generics.game2;

public class TestGame2 {
    public static void main(String[] args) {
        Schoolar2 sch1 = new Schoolar2("Adam", 14);
        Schoolar2 sch2 = new Schoolar2("Milla", 16);

        Student2 st1 = new Student2("Kate", 19);
        Student2 st2 = new Student2("Mike", 21);

        Employee2 emp1 = new Employee2("Lucie", 26);
        Employee2 emp2 = new Employee2("Amanda", 31);

        Team2<Schoolar2> schoolarTeam = new Team2<>("Dragons");
        schoolarTeam.addParticipant(sch1);
        schoolarTeam.addParticipant(sch2);
//        schoolarTeam.addParticipant(st1);
//        schoolarTeam.addParticipant(emp2);

        Team2<Student2> studentTeam = new Team2<>("HardStudent");
        studentTeam.addParticipant(st1);
        studentTeam.addParticipant(st2);
//        studentTeam.addParticipant(sch2);
//        studentTeam.addParticipant(emp1);

        Team2<Employee2> employeeTeam = new Team2<>("HardWorker");
        employeeTeam.addParticipant(emp1);
        employeeTeam.addParticipant(emp2);
//        employeeTeam.addParticipant(sch1);
//        employeeTeam.addParticipant(st2);

        schoolarTeam.playWith(studentTeam);
        schoolarTeam.playWith(employeeTeam);
        studentTeam.playWith(employeeTeam);
    }
}
