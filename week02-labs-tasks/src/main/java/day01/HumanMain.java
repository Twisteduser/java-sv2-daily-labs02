package day01;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Jack",70);

        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.introduction());

        human.introduce();
    }
}
