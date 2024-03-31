package com.lzixuan.overrideExercise;

/**
 * @author 李子煊
 * @version 1.0
 */
public class Exercise {
    public static void main(String[] args) {
        Person person = new Person("李子煊",20,99);
        System.out.println(person.say());
        Student student = new Student("方安琪",19,80,"lizixuan");
        System.out.println(student.say());
    }
}
class  Person{
    String name;
    int age;
    private int score;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String say(){        //方法重写
        return (name+age+score);
    }

    public int getScore() {
        return score;
    }
}
class Student extends Person{
    String id;
    public Student(String name, int age, int score,String id) {
        super(name, age, score);
        this.id=id;
    }
    public String say(){        //方法重写
        return (name+age+getScore()+id);
    }
}