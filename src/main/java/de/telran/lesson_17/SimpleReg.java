package de.telran.lesson_17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleReg {
    public static void main(String[] args) {
       // String reg1 = ".*\\d+.*"; //почтовый индекс
        String reg2 = ".*[^0-9]{1}\\d{5}[^0-9]{1}.*"; //почтовый индекс должен встречаться в тексте только раз

        Pattern pattern = Pattern.compile(reg2);

        String verifyText = "Наш 2-й почтовый индекс 85557, наш 1-й почтовый индекс 23456.";
        //String verifyText = "85557";

        Matcher matcher = pattern.matcher(verifyText);

        System.out.println("Есть ли в этом тексте почтовый индекс = "+matcher.matches());
        if(matcher.matches()) { // проверяет наличия, хотя бы один раз
            System.out.println("В тексте есть индекс");
        }

        // ---- паттерн встречается ли у нас в тексте почтовый индекс многократно
        String reg3 = "\\d{5}";

        Pattern pattern2 = Pattern.compile(reg3);
        Matcher matcher2 = pattern2.matcher(verifyText);
        // многократный анализ
        while (matcher2.find()) {
            System.out.println(matcher2.start()+ "---" + matcher2.end());
            System.out.println(verifyText.substring(matcher2.start(), matcher2.end()));
        }
        // Методы автозамены
        System.out.println(verifyText);
        System.out.println(matcher2.replaceAll("***"));
        System.out.println(matcher2.replaceFirst("***"));
    }
}
