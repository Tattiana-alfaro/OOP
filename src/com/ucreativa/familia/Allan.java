package com.ucreativa.familia;

public class Allan {

    private String id;
    private int age;
    private String hobby;
    private String name;

    public  Allan (String greetings, int age, String hobby)
    {
        this.age = age;
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setBirthday(){
        this.age = this.age +1;
    }
    public int getBirthday()
    {
        return age;
    }
}
