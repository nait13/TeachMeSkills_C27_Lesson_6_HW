package com.teachmeskills.lesson7_hw.Runner;

import com.teachmeskills.lesson7_hw.CreditCard.CreditCard;
import com.teachmeskills.lesson7_hw.Student.Student;

public class Runner {
    public static void main(String[] args) {
        // Task1
        CreditCard card1 = new CreditCard("AB12345", 300);
        CreditCard card2 = new CreditCard("CD23456", 8000);
        CreditCard card3 = new CreditCard("FG34563", 1000);

        card1.addMoneyToCard(50);
        card2.addMoneyToCard(80);
        card3.withdrawMoneyFromCard(1100);

        card1.checkCardInformation();
        card2.checkCardInformation();
        card3.checkCardInformation();

        //Task2
        System.out.println("****Task2****");
        Student st1 = new Student("Олег", "Манеев", "HB123", "C27");
        Student st2 = new Student("Артём", "Астапчик", "HB123", "C27");
        Student st3 = new Student("Анастасия", "Иргалиева", "HB123", "C27");
        Student st4 = new Student("Артем", "Каральчук", "HB123", "C27");
        Student st5 = new Student("Никита", "Крайко", "HB123", "C27");
        Student st6 = new Student("Иван", "Михновецкий ", "HB123", "C27");
        Student st7 = new Student("Кирилл", "Паляница", "HB123", "C27");
        Student st8 = new Student("Руслан", "Рябухин", "HB123", "C27");
        Student st9 = new Student("Евгений", "Саркисов", "HB123", "C27");
        Student st10 = new Student("Павел", "Свинко", "HB123", "C27");
        Student st11 = new Student("Руслан", "Семенчик", "HB123", "C27");
        Student st12 = new Student("Руслан", "Третяк", "HB123", "C27");
        Student st13 = new Student("Александр", "Хамицкий", "HB123", "C27");
        Student st14 = new Student("Даниил", "Чаботько", "HB123", "C27");
        Student st15 = new Student("Алексей", "Шубин", "HB123", "C27");
        Student st16 = new Student("Владислав", "Колос", "HB123", "C27");

        Student[] arr = new Student[]{st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16};

        for(Student student: arr){
            System.out.println(student.name + " " + student.surname + " " + student.numberPass + " " + student.nameGroup);
        }
    }
}
