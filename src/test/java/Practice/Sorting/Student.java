package Practice.Sorting;


 class Student  {
    private String surname;
    private String name;
    private int age;
    private int course;
    private double avgGrade;
    private char sex;

    public Student(String surname, String name, int age, int course, double avgGrade, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "StudentT{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                ", sex=" + sex +
                '}';
    }
    protected static void printStudents(Student[] student){
        for (Student s: student){
            System.out.println(s);
        }
    }

}