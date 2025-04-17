package chap_09;

import java.util.ArrayList;
import java.util.HashMap;

public class _Quiz_09 {
    public static void main(String[] args) {
        Student student1 = new Student("유재석", "파이썬");
        Student student2 = new Student("박명수", "자바");
        Student student3 = new Student("김종국", "자바");
        Student student4 = new Student("조세호", "C");
        Student student5 = new Student("서장훈", "파이썬");

        HashMap<String, String> map = new HashMap<>();

        map.put(student1.name, student1.certificate);
        map.put(student2.name, student2.certificate);
        map.put(student3.name, student3.certificate);
        map.put(student4.name, student4.certificate);
        map.put(student5.name, student5.certificate);

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("-------------------");
        for (String key : map.keySet()) {
            if (map.get(key) == "자바") {
                System.out.println(key);
        }
    }

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        for (Student s : list) {
            if (s.certificate.equals("자바")) {
                System.out.println(s.name);
            }
        }
}

static class Student {
    public String name;
    public String certificate;

    public Student(String name, String certificate) {
        this.name = name;
        this.certificate = certificate;
    }
}

}
