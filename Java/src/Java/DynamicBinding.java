package Java;

public class DynamicBinding {

    public static void main(String[] args) {
        Test(new GraduateStudent());
        Test(new Student());
        Test(new Person());
        Test(new Object());
    }

    public static void Test(Object object) {
        System.out.println(object.toString());
    }

    static class GraduateStudent extends Student {
    }

    static class Student extends Person {
        public String toString() {
            return "Student";
        }
    }

    static class Person extends Object {
        public String toString() {
            return "Person";
        }
    }
}
