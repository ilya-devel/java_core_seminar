package org.example;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Integer[] lstInt = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        try (FileWriter fw = new FileWriter("./seminarFile1")){
            fw.write(Arrays.toString(lstInt));
        } catch (IOException e) {
            System.out.println(e);
        }

//        try (BufferedReader reader = new BufferedReader(new FileReader("./seminarFile1"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("seminarFile2"))) {
//            Scanner console = new Scanner(System.in);
//            System.out.println("Введите символ для замены: ");
//            char original = console.next().charAt(0);
//            System.out.println("Введите символ на который нужно провести замену: ");
//            char replace = console.next().charAt(0);
//            while (reader.ready()) {
//                char c = (char) reader.read();
//                if (c == original) {
//                    writer.write(replace);
//                } else {
//                    writer.write(original);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }

//        File directory = new File(".");
//        printDirectory(directory, new StringBuilder().append("- "));


        Cat cat = new Cat("Tom", 11, "grey", 'M', "British");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(cat);
        ByteArrayInputStream bis = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        Cat anotherCat = (Cat) in.readObject();
        System.out.println(cat.equals(anotherCat));
        cat.setName("Jack");
        System.out.println(cat.getName());
        System.out.println(anotherCat.getName());
        System.out.println(baos);




//        for (Integer num: lstInt) {
//            writerToFile(num);
//            writerToFileWithBuffer(num);
//        }
    }

    public static void printDirectory(File directory, StringBuilder sign) {
        if (!directory.isDirectory()) return;
        File[] files = directory.listFiles();
        for (File file: files) {
            if (file.isDirectory()) {
                System.out.println(sign.toString() + " DIR " + file.getPath());
                StringBuilder newSign = new StringBuilder();
                newSign.append("- ");
                newSign.append(sign);
                printDirectory(file, newSign);
            } else {
                System.out.println(sign.toString() + " FILE " + file);
            }
        }
    }

    public static void writerToFile(Integer num) {
        try (
                FileWriter fw = new FileWriter("./txtFile", true)
                ) {
            fw.write(num + "\n");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writerToFileWithBuffer (Integer num) {
        try (FileOutputStream fos = new FileOutputStream("./bufTxtFile")) {
            fos.write(num);
        } catch (IOException e ) {
            System.out.println(e);
        }
    }
}