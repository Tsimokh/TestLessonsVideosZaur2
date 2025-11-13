package Lesson3_Generics.example_generics.game4;

public class TestGame4 {
    public static void main(String[] args) {
        Schoolar4 sch1 = new Schoolar4("Adam", 14);
        Schoolar4 sch2 = new Schoolar4("Milla", 16);

        Student4 st1 = new Student4("Kate", 19);
        Student4 st2 = new Student4("Mike", 21);

        Employee4 emp1 = new Employee4("Lucie", 26);
        Employee4 emp2 = new Employee4("Amanda", 31);

        Team4<Schoolar4> schollarTeam1 = new Team4<>("Dragons");
        schollarTeam1.addParticipant(sch1);
        schollarTeam1.addParticipant(sch2);

        Team4<Schoolar4> schollarTeam2 = new Team4<>("Avatars");
        schollarTeam2.addParticipant(new Schoolar4("Olha", 13));
        schollarTeam2.addParticipant(new Schoolar4("Maria", 12));

        Team4<Student4> studentTeam1 = new Team4<>("HardStudent");
        studentTeam1.addParticipant(st1);
        studentTeam1.addParticipant(st2);

        Team4<Student4> studentTeam2 = new Team4<>("JustStudent");
        studentTeam2.addParticipant(new Student4("Mark", 18));
        studentTeam2.addParticipant(new Student4("Alice", 22));

        Team4<Employee4> employeeTeam1 = new Team4<>("HardWorker");
        employeeTeam1.addParticipant(emp1);
        employeeTeam1.addParticipant(emp2);

        Team4<Employee4> employeeTeam2 = new Team4<>("JustWorker");
        employeeTeam2.addParticipant(new Employee4("Lary",52));
        employeeTeam2.addParticipant(new Employee4("Jesica",36));

        schollarTeam1.playWith(schollarTeam2);
        studentTeam1.playWith(studentTeam2);
        employeeTeam1.playWith(employeeTeam2);
    }
}
