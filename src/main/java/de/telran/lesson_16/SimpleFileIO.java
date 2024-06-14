package de.telran.lesson_16;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class SimpleFileIO {
    public static void main(String[] args) {
        File testFile = new File("testFile.txt");
        if (!testFile.exists()) { // если файл не существует
            try {
                if (testFile.createNewFile()) { // создаем файл
                    System.out.println("Создан новый файл - " + testFile.getName());
                }
            } catch (IOException e) {
                System.out.println("Произошла ошибка при создании файла!");
                throw new RuntimeException(e);
            }
        }
        // запись в файл через байтовый поток
        FileOutputStream streamOut = null;
        try {
            streamOut = new FileOutputStream(testFile, false); // true - разрешает добавлять информацию
            String strOut = "Это строка, которую я хочу записать в файл!";
//            String strOut = "This string in file! New Line in file!";
            // Преобразовуем информацию в байты
            byte[] outputByte = strOut.getBytes(StandardCharsets.UTF_8);
            streamOut.write(outputByte);
        } catch (FileNotFoundException e) {
            System.out.println("Не смогли найти файл - " + testFile.getName());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл - " + testFile.getName());
            throw new RuntimeException(e);
        } finally {
            try {
                streamOut.close(); // закрыть доступ к файлу
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла - " + testFile.getName());
                throw new RuntimeException(e);
            }
        }

        //-------- Чтение данных из файла побайтово, используется для чтения в основном графических файлов
        //  есть проблемы с прочтением русских символов при чтении с текстовых файлов
        String strIn = "";
        FileInputStream streamInput = null;
        try {
            streamInput = new FileInputStream(testFile);
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); // посредник для сохранения информации, в т.ч. русские символы
            // читаем информацию побайтово
            int dataIn = streamInput.read();
            while (dataIn != -1) { // закончился ли файл?
                baos.write(dataIn); //Сохраняем в специальный байтовый массив, для работы с русскими сиволами
                // strIn+=(char)dataIn; // данный подход не видит русские символы
                dataIn = streamInput.read();
            }
            strIn = baos.toString();
            System.out.println();
            System.out.println("Получаю через InputStream ---> " + strIn);
        } catch (FileNotFoundException e) {
            System.out.println("Не смогли найти файл - " + testFile.getName());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла - " + testFile.getName());
            throw new RuntimeException(e);
        } finally {
            try {
                streamInput.close(); // закрыть доступ к файлу
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла - " + testFile.getName());
                throw new RuntimeException(e);
            }
        }

        //чтение файла с помощью буфера построчно (текстовых файлов)
        InputStream streamInBuf = null;
        BufferedReader bufferedReader = null;
        strIn = "";
        try {
            streamInBuf = new FileInputStream(testFile);
            // Буффер
            bufferedReader = new BufferedReader(new InputStreamReader(streamInBuf));
            String strLine = bufferedReader.readLine(); // вычитываем всю строку (нормально работает с русскими символами!!!)
            while (strLine != null) { // пока есть строки
                System.out.println(strLine);
                strIn += strLine;
                strLine = bufferedReader.readLine(); // вычитываем всю строку (нормально работает с русскими символами!!!)
            }
            System.out.println("Полученная строка -> " + strIn);
        } catch (FileNotFoundException e) {
            System.out.println("Не смогли найти файл - " + testFile.getName());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла - " + testFile.getName());
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                streamInBuf.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия - " + testFile.getName());
                throw new RuntimeException(e);
            }
        }
    }
}
