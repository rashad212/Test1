package Practice.InfiniteStreamPractice;

public class Student {
    private String name;
    private String surnme;
    private Integer age;
    private Double mathNote;
    private Double sportNote;

    public Student(String name, String surnme, Integer age, Double mathNote, Double sportNote) {
        this.name = name;
        this.surnme = surnme;
        this.age = age;
        this.mathNote = mathNote;
        this.sportNote = sportNote;
    }

    public String getName() {
        return name;
    }

    public String getSurnme() {
        return surnme;
    }

    public Integer getAge() {
        return age;
    }

    public Double getMathNote() {
        return mathNote;
    }

    public Double getSportNote() {
        return sportNote;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surnme='" + surnme + '\'' +
                ", id=" + age +
                ", mathNote=" + mathNote +
                ", sportNote=" + sportNote +
                '}';
    }
}
