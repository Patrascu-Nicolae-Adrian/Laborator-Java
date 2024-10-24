package clase;

public class Persoana {
    private String name;
    private Integer age;

    public Persoana(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Persoana() {
        this.name = null;
        this.age = null;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
