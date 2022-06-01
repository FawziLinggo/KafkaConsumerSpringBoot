package tes.example.KafkaConsumer.model;

public class User {
    private String type;
    private String name;
    private String dept;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public User() {
    }

    public User(String type, String name, String dept) {
        this.type = type;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
