package Something;

import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void test() {
        Numbers numbers = new Numbers(); //Всегда положительный
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
        System.out.println("Ожидалось " + expected);
        System.out.println("наше число " + actual);
    }
    @org.junit.Test
    public void test2() {
        Numbers numbers = new Numbers(); //Сумма у рандомного числа должна совпасть с выбраным числом
        double i = Math.random()*10;    //В данном случае число 21
        int l = (int) i;
        int actual = numbers.sum(l);
        int expected = 21;
        assertEquals(expected, actual);
        System.out.println("Ожидалось " + expected);
        System.out.println("наше число " + actual);
    }
    @org.junit.Test
    public void test3() {
        Numbers numbers = new Numbers();//Всегда положительный Expected = actual
        int actual = numbers.sum(4);
        int expected = actual;
        assertEquals(expected, actual);
        System.out.println("Ожидалось " + expected);
        System.out.println("наше число " + actual);
    }
    @org.junit.Test
    public void test4() { // Всегда провальный
        Numbers numbers = new Numbers();
        int actual = numbers.sum(4);
        int expected = 20;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void test5() {
        Numbers numbers = new Numbers(); //Краевое, грань
        int actual = numbers.sum(4);
        if (actual > 0 && actual <= 10) {
            boolean man = true; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до 10" );
        }else {boolean man = false; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до 10"); fail("Не попадает в диапозон");}
    }

    @org.junit.Test
    public void test6() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(3);//Краевое, в диапозоне
        if (actual > 0 && actual <= 10) {
            boolean man = true; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до 10" );
        }else {boolean man = false; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до 10"); fail("Не попадает в диапозон");}
    }

    @org.junit.Test
    public void test7() {
        Numbers numbers = new Numbers();//Краевое, за диапозоном
        int actual = numbers.sum(5);
        if (actual > 0 && actual <= 10) {
            boolean man = true; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до 10" );
        }else {boolean man = false; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до 10"); fail("Не попадает в диапозон");}
    }

    @org.junit.Test
    public void test8() {
        double d = Math.random()*50; //Рандомный диапозон
        Numbers numbers = new Numbers();
        int actual = numbers.sum(7);
        if (actual > 0 && actual <= d) {
            boolean man = true; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d);
        }else {boolean man = false; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d); fail("Не попадает в диапозон");}
    }

    @org.junit.Test
    public void test9() {
        double d = Math.random()*100; //Увеличение диапозона
        Numbers numbers = new Numbers();
        int actual = numbers.sum(7);
        if (actual > 0 && actual <= d) {
            boolean man = true; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d);
        }else {boolean man = false; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d); fail("Не попадает в диапозон");}
    }

    @org.junit.Test
    public void test10() {
        double d = Math.random()*40; //Уменьшение диапозона
        Numbers numbers = new Numbers();
        int actual = numbers.sum(7);
        if (actual > 0 && actual <= d) {
            boolean man = true; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d);
        }else {boolean man = false; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d); fail("Не попадает в диапозон");}
    }

    @org.junit.Test
    public void test11() {
        double d = Math.random()*50; //Рандомный диапозон рандомное число
        double i = Math.random()*10;
        int l = (int) i;
        Numbers numbers = new Numbers();
        int actual = numbers.sum(l);
        if (actual > 0 && actual <= d) {
            boolean man = true; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d);
        }else {boolean man = false; System.out.println("наше число " + actual);System.out.println("Диапозон от 0 до " +d); fail("Не попадает в диапозон");}
    }
}