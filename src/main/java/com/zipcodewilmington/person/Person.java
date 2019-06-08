package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private Boolean hasDentures;
    private int weight;
    private String eyeColor;
    private String hairColor;
    private Boolean isMale;

    public Person(String name, int age, Boolean hasDentures, int weight, String eyeColor, String hairColor, Boolean isMale) {
        this.name = name;
        this.age = age;
        this.hasDentures = hasDentures;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.isMale = isMale;
    }

    public Person(){
        name = "";
        age = Integer.MAX_VALUE;
        hasDentures = false;
        weight = 130;
        eyeColor = "brown";
        hairColor = "brown";
        isMale = false;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasDentures(Boolean hasDentures){
        this.hasDentures = hasDentures;
    }

    public Boolean getHasDentures() {
        return hasDentures;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public String getHairColor(){
        return hairColor;
    }

    public void setIsMale(Boolean isMale){
        this.isMale = isMale;
    }

    public Boolean getIsMale(){
        return isMale;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }
}
