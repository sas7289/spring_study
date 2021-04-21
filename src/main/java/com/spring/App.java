package com.spring;

import com.spring.config.ConfigApp;
import com.spring.model.ICart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);
        ICart cart = applicationContext.getBean("cart", ICart.class);
        int tempId = 0;
        int tempAction = 0;
        do {
            System.out.println("Введите id необходимого продукта (0 - 7) или -1 для выхода");
            tempId = Integer.parseInt(scanner.nextLine());
            if(tempId < 0 || tempId > 7) {
                System.out.println("Неверный id");
                continue;
            };
            System.out.println("0 - добавить в корзину\n1 - удалить из корзины");
            tempAction = Integer.parseInt(scanner.nextLine());
            if(tempAction != 0 && tempAction != 1) {
                System.out.println("Неверная команда");
                continue;
            }
            if (tempAction == 0) {
                cart.add(tempId);
            } else {
                cart.remove(tempId);
            }
        } while (tempId != -1);
    }
}
