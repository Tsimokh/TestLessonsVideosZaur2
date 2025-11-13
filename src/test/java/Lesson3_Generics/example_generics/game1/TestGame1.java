package Lesson3_Generics.example_generics.game1;

public class TestGame1 {
    public static void main(String[] args) {
        Schoolar1 sch1 = new Schoolar1("Adam", 14);
        Schoolar1 sch2 = new Schoolar1("Milla", 16);

        Student1 st1 = new Student1("Kate", 19);
        Student1 st2 = new Student1("Mike", 21);

        Employee1 emp1 = new Employee1("Lucie", 26);
        Employee1 emp2 = new Employee1("Amanda", 31);

        Team1 schoolarTeam = new Team1("Dragons");
        schoolarTeam.addParticipant(sch1);
        schoolarTeam.addParticipant(sch2);
        schoolarTeam.addParticipant(st1);
        schoolarTeam.addParticipant(emp2);

        Team1 studentTeam = new Team1("HardStudent");
        studentTeam.addParticipant(st1);
        studentTeam.addParticipant(st2);
        studentTeam.addParticipant(sch2);
        studentTeam.addParticipant(emp1);

        Team1 employeeTeam = new Team1("HardWorker");
        employeeTeam.addParticipant(emp1);
        employeeTeam.addParticipant(emp2);
        employeeTeam.addParticipant(sch1);
        employeeTeam.addParticipant(st2);

        schoolarTeam.playWith(studentTeam);
        schoolarTeam.playWith(employeeTeam);
        studentTeam.playWith(employeeTeam);
    }
}
