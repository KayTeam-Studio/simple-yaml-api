package org.kayteam.simpleyamlapi;

import java.util.Arrays;
import java.util.Random;

public class SimpleYamlTest {

    public SimpleYamlTest() {
        SimpleYaml prueba = new SimpleYaml("simpleyaml-test", "prueba");
        prueba.registerYamlFile();
        System.out.println(" -- GET TEST 1 --");
        System.out.println("STRING GET "+prueba.getString("string"));
        System.out.println("INT GET "+prueba.getInt("integer"));
        System.out.println("DOUBLE GET "+prueba.getDouble("double"));
        System.out.println("LIST GET "+prueba.getList("stringList"));
        System.out.println("SUB-PATH STRING GET "+prueba.getString("subPath.string"));
        System.out.println("SUB-PATH INT GET "+prueba.getInt("subPath.integer"));
        System.out.println("SUB-PATH DOUBLE GET "+prueba.getDouble("subPath.double"));
        System.out.println("SUB-PATH LIST GET "+prueba.getList("subPath.stringList"));
        System.out.println("STRING GET "+prueba.getString("string"));
        System.out.println("INT GET "+prueba.getInt("integer"));
        System.out.println("DOUBLE GET "+prueba.getDouble("double"));
        System.out.println("LIST GET "+prueba.getList("stringList"));
        System.out.println("SUB-PATH STRING GET "+prueba.getString("subPath.string"));
        System.out.println("SUB-PATH INT GET "+prueba.getInt("subPath.integer"));
        System.out.println("SUB-PATH DOUBLE GET "+prueba.getDouble("subPath.double"));
        System.out.println("SUB-PATH LIST GET "+prueba.getList("subPath.stringList"));
        System.out.println(" -- END GET TEST 1 --");
        System.out.println(" -- SET TEST 1 --");
        String string = generateRandomWords(1)[0];
        int integer = new Random().nextInt(100);
        double doubleValue = new Random().nextDouble();
        String[] stringList = generateRandomWords(5);
        prueba.set("string2", string);
        prueba.set("integer2", integer);
        prueba.set("double2", doubleValue);
        prueba.set("stringList2", Arrays.asList(stringList));
        prueba.set("subPath.string2", string);
        prueba.set("subPath.integer2", integer);
        prueba.set("subPath.double2", doubleValue);
        prueba.set("subPath.stringList2", Arrays.asList(stringList));
        System.out.println("STRING SET "+prueba.getString("string2"));
        System.out.println("INT SET "+prueba.getInt("integer2"));
        System.out.println("DOUBLE SET "+prueba.getDouble("double2"));
        System.out.println("LIST SET "+prueba.getList("stringList2"));
        System.out.println("SUB-PATH STRING SET "+prueba.getString("subPath.string2"));
        System.out.println("SUB-PATH INT SET "+prueba.getInt("subPath.integer2"));
        System.out.println("SUB-PATH DOUBLE SET "+prueba.getDouble("subPath.double2"));
        System.out.println("SUB-PATH LIST SET "+prueba.getList("subPath.stringList2"));
        prueba.saveYamlFile();
    }

    public static String[] generateRandomWords(int numberOfWords){
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }
}