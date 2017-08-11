package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("ded1",true,67);
        Human ded2 = new Human("ded2",true,67);
        Human bab1 = new Human("bab1",false,67);
        Human bab2 = new Human("bab2",false,67);
        Human papa = new Human("papa",true,45,ded1,bab1);
        Human mama = new Human("mama",false,44,ded2,bab2);
        Human son1 = new Human("son1",true,21,papa,mama);
        Human son2 = new Human("son2",true,20,papa,mama);
        Human son3 = new Human("son3",true,19,papa,mama);
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public  Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















