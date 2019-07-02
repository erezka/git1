package TestingGit;
//даже не знаю, зачем тут нужен этот класс
//этот класс тут точно нужен

public class human {

    public human() {
    }

    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private  int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //добавили Weight
}
