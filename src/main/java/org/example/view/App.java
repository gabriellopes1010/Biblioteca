package org.example.view;

import org.example.controller.Controller;

public class App {
    private static final Controller controller = new Controller();

        public static void main(String[] arguments) {
            controller.registryBook("Crescendo em fé e coragem","Gabriel Lopes","cristã",2020);
            controller.registryBook("Crescendo em fé e coragem vol2","Gabriel Lopes","cristã",2021);
            controller.registryBook("Crescendo em fé e coragem vol3","Gabriel Lopes","cristã",2022);
            System.out.println(controller.getLisBook().size());
            controller.printBook();
    }

}
