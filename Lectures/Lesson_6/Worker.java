package Lesson_6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
    }

    // public boolean equals(Object o) {
    //     var t = (Worker) o;
    //     return id = t.id && firstName = t.firstName;
    // }

    @Override
    public int hashCode() {
        return id;
    }
}
