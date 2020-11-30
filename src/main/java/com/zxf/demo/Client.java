package com.zxf.demo;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client {

    private String name;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Game o = (Game) Class.forName("com.zxf.demo.Game").newInstance();
//        "com.zxf.demofortyro.Game".getClass().getSClassLoader().loadClass()
//        Class<?> aClass = System.class.getClassLoader().loadClass("com.zxf.demofortyro.Game");
//        Game o1 = (Game) aClass.newInstance();
//        o1.test();
//        o.test();

        Client integerClient = new Client();
//        integerClient.print(1);
//        Integer[] a = {1, 2, 3, 4};
//        List<String> strings = Client.fromArrayToList(a, Objects::toString);
//        System.out.println(strings);
//
//        integerClient.fromArrayToList(a);
//
//        Map<String, Integer> nameMap = new HashMap<>();
//        nameMap.computeIfAbsent("s", s -> s.length());
//        String abcdefg = integerClient.print("abcdefg", str -> {
//            System.out.println(str.toUpperCase());
//            return str.toUpperCase();
//        });
//        System.out.println(abcdefg);

        PO c = new PO();
        PO c2 = new PO();
        paintAllClients(Arrays.asList(c, c2));

        Set<?> set = new HashSet<String>();

        String s = "12345";
        print(s, s1 -> System.out.println(s1));

    }

    public <T, G, S> T print(T t) {
        return t;
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
    }

    public <T extends Number> List<T> fromArrayToList(T[] a) {
        return null;
    }

    public static <K> void print(K k, Consumer<? super K> computingFunction) {
        computingFunction.accept(k);
        System.out.println("Test");
    }

    public static void paintAllClients(List<? extends Client> clients) {
        for (Client c:clients) {
            System.out.println(c.name);
        }
    }
}

class PO extends Client {

}

