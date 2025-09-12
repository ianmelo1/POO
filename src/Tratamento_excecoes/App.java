package Tratamento_excecoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {



        public static void main(String[] args) throws IOException {
            int x = 0;

            try{
                int y = 100/x;
                System.out.println("y: " + y);
            } catch(ArithmeticException e) {
                System.out.println("Tratamento de Exceção");
                System.out.println("Mensagem: " + e.getLocalizedMessage());
                e.printStackTrace();
            }

        }
    }

}
