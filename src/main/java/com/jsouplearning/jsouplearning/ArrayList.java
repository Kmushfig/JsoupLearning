package com.jsouplearning.jsouplearning;

public class ArrayList {
    public static void main(String[] args) {
//        String[] a = new String[3];
        String[] make = {"bm", "42", "96"};
//        String[] b = new String[3];
        String[] model = {"14", "22", "34"};
        String link1 = "https://turbo.az/autos?q[sort]=&q[make][]=";
        String link2 = "&q[model][]=&q[model][]=";
        for (int i = 0; i < make.length; i++) {
            String str = make[i];
            for (int j = 0; j < model.length; j++) {
                String str2 = model[j];
                System.out.println(link1 + "   " + str + "   " + link2 + str2);
//            System.out.println(str);

            }
        }
    }
}
