package pkg;

public class Student {
    private String name = "";
    private int id = 0;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    // if your method has the final keyword we can't override that function or prop
    // in the sub-classes or inherit
    public final void printStudentInfo() {
        System.out.println("Your name is: " + name + " and your id: " + id);
    }

    public int generateStudentScore(int score) {

        if (score <= 0) {
            throw new Error("We cant calculate your score");
        }
        return score;
    }

}