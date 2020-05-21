import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ControladorLogInUser {
    private Utilizadores users;

    public void run() {
        int o = Input.lerInt();
        if(o==1){
            String u = Input.lerString();
            String p = Input.lerString();
            if(verificaLogin(u,p)) ControladorUser.run();
            else System.out.println("Login errado");
        }
        else{
            String p = Input.lerString();
            String c = Input.lerString();
            String n = Input.lerString();
            double x = Input.lerDouble();
            double y = Input.lerDouble();
            GPS gps = new GPS(x,y);
            Utilizador novo = new Utilizador(p,c,n,gps);
            users.addUtilizador(novo);
        }
    }

    public boolean verificaLogin(String u, String p){
        return users.verificaLogin(u,p);
    }


}