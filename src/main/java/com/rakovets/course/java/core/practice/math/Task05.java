package com.rakovets.course.java.core.practice.math;

/**
 * Разработать программу для NASA:
 * который определит растояние которое проехал робот. Показания энкодера сбрасываются в начале поездки. Известно:
 *
 * @param encoderDegrees - показания энкодера после поездки
 * @param tireRadius     - радиус колеса
 */
class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int encoderDegrees = 258;
        int tireRadius = 3;

        // Код необходимый для тестирования, не изменять
        encoderDegrees = (args.length == 2) ? Integer.parseInt(args[0]) : encoderDegrees;
        tireRadius = (args.length == 2) ? Integer.parseInt(args[1]) : tireRadius;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}
