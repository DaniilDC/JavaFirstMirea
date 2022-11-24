package ru.mirea.task30.op1;

import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ip_test {
    static boolean checkIPTest = false;

    @Test
    public void checkIP() {
        assertTrue(ip.check_ip("127.0.0.1"));
        assertTrue(ip.check_ip("255.255.255.0"));
        assertFalse(ip.check_ip("1300.6.7.8"));
        assertFalse(ip.check_ip("abc.def.gha.bcd"));
        checkIPTest = true;
        writeCheckIPTestResults();
    }

    static void writeCheckIPTestResults() {
        try {
            FileWriter fw = new FileWriter("src\\ru\\mirea\\task31\\CheckIPTestsResults.md");

            fw.write("# Результаты тестирования \n");

            fw.write("## Тест checkIP()\n");
            if (ip_test.checkIPTest) {
                fw.write("Тесты прошли успешно\n");
            }
            else {
                fw.write("Тесты прошли неудачно\n");
            }

            System.out.println("Результаты успешно записаны");
            fw.flush();
        }
        catch (IOException e) {
            System.out.println("Ошибка: \n" + e.getMessage());
        }

    }
}
