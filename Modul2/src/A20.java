/*
    Попробуем стать настоящими компьютерными художниками и, как все уважающие себя художники, будем учиться рисовать прямоугольник. Да, задача не из простых, ну а что делать.

Реализуйте метод drawRectangle(), в который передают 3 параметра:

целое число n — высота прямоугольника,
целое число m — ширина прямоугольника,
строка s — символ, которым мы хотим нарисовать треугольник.
Метод должен печатать на экран прямоугольник n на m из символов s.

Пример:
n = 6, m = 10, s = "+"
Вывод:

++++++++++
+        +
+        +
+        +
+        +
++++++++++
 */

public class A20 {
    public static void drawRectangle(int n, int m, String s) {
        // write your code here
        for (int i = 0; i < n; i++) {
                String string = "";
                if (i == 0 || i == n - 1) { // если первая или последняя строчки
                    for (int j = 0; j < m; j++) {
                        string += s; // строим строку из m символов
                    }
                } else {
                    // иначе строим строку вида {символ s + m - 2 пробела + символ s}
                    string += s;
                    for (int j = 1; j < m - 1; j++) {
                        string += " ";
                    }
                    if (m != 1) string += s; // проверяем, что прямоугольник не 1 в ширину
                }
                System.out.println(string);
        }
    }

    public static void main(String[] args) {

        drawRectangle(6, 8, "+");
    }
}
