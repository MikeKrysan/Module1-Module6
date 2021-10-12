/*
Давайте попробуем написать классическую игру «Угадай число». В этой игре программа будет генерировать случайное число,
 а игрок будет пытаться его угадать. В случае успеха игрока программа должна выводить какое-либо поздравительное сообщение
 («Совершенно верно! Это и есть загаданное мною число!»). При неудачной же попытке должно выдаваться сообщение с указанием того,
  в какую сторону нужно «копать» игроку («Загаданное мною число больше» или «Загаданное мною число меньше»). Игра продолжается до тех пор, пока игрок не введёт загаданное число.

Предположим, что программа выбрала случайное число «5». Теперь, если пользователь введёт «1», то программа выдаст сообщение
«Загаданное мною число больше», а если же пользователь введет «6», то программа выдаст сообщение «Загаданное мною число меньше».
В случае ввода числа «5» программа выдаст сообщение «Совершенно верно! Это и есть загаданное мною число!», после чего программа будет завершена.
 */

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber2_8_4 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();               //Создаем экземпляр класса Random()
        int randomInt;                              //Создаем переменную типа int
        randomInt = random.nextInt(10) + 1;   //Сохраняем случайное число в переменную randomInt

        Scanner console = new Scanner(System.in);
        while(true){
            System.out.println("Введите число, которое, как вы думаете, загадал пк: ");
             int iThinkNumber = console.nextInt();
            if( iThinkNumber== randomInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число ");
            } else if(iThinkNumber < randomInt) {
                System.out.println("Загаданное мною число меньше ");
            } else if(iThinkNumber > randomInt) {
                System.out.println("Загаданное мною число больше ");
            }
        }
    }
}
