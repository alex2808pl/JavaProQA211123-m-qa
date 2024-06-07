package de.telran.lesson_15;

import java.io.File;
import java.io.IOException;

public class SimpleFileSystem {
    public static void main(String[] args) throws IOException {
        //Подключаем файл
        File file = new File("file.txt");

        //проверка существование
        boolean isExists = file.exists();
        System.out.println("file exists " + isExists);

        //Подключаем папку
        File fileDir = new File("1");
        //проверка существование
        isExists = fileDir.exists();
        System.out.println("directory exists " + isExists);

        // создание файла
        boolean wasCreatedFile = file.createNewFile();
        System.out.println("created file " + wasCreatedFile);

        File filePath = new File("d:/3/file.txt");
        wasCreatedFile = filePath.createNewFile();
        System.out.println("created filePath " + wasCreatedFile);

        // Размер файла
        long length = file.length();
        System.out.println("size file " +length);

        // Удаление файла
        boolean success = file.delete();
        System.out.println("delete file - "+success);

        //создание папки
        File dir = new File("new_dir");
        boolean wasCreated = dir.mkdir();
        System.out.println("created dir " + wasCreated);

        // создание вложенного файла или директория
        File file1 = new File(dir, "file1.txt");
        if(!file1.exists()) {
            System.out.println("created file " + file1.createNewFile());
        }

        // удаление папки
        success = dir.delete(); // только пустые каталоги можно удалить
        System.out.println("delete dir - "+success);

//        success = file1.delete(); // удаляем сразу файл из папки
//        System.out.println("delete file - "+success);
//        if(success) {
//            success = dir.delete(); // потом удаляем папку, она должна быть пустая
//            System.out.println("delete dir - "+success);
//        }


        // удаление папки с вложенными объектами
        success = deleteDir(dir);
        System.out.println("delete dir included - "+success);

    }

    public static boolean deleteDir(File dir){
        File[] files = dir.listFiles(); //возвращаем дочерние объекты
        if(files != null){
            for(File file : files){
                if(file.isDirectory()){ //это папка
                    deleteDir(file);
                } else {
                    file.delete(); // удаляем файл
                }
            }
        }
        return dir.delete(); //удаление уже пустой папки
    }
}
