package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String DedName = reader.readLine();
        Cat catDed = new Cat(DedName);

        String BabaName = reader.readLine();
        Cat catBaba = new Cat(BabaName);

        String PapaName = reader.readLine();
        Cat catPapa = new Cat(PapaName, catDed, null);

        String MamaName = reader.readLine();
        Cat catMama = new Cat(MamaName, null, catBaba);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catPapa, catMama);

        String DaughterName = reader.readLine();
        Cat catDaughter = new Cat(DaughterName, catPapa, catMama);
        System.out.println(catDed);
        System.out.println(catBaba);
        System.out.println(catPapa);
        System.out.println(catMama);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "Cat name is " + name + ", no mother" + ", no father";
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else if (mother == null)
                return "Cat name is " + name + ", no mother" + ", father is " + father.name;
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                        }
    }

}