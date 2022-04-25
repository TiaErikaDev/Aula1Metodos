package Arrays;

import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.println("Usuário: ");
        usuario = scan.next();
        System.out.println("Senha: ");
        senha = scan.next();

        while (senha.equalsIgnoreCase(usuario)){
            System.out.println("Senha não pode ser igual ao usuário! Tente novamente: ");
            System.out.println("Usuário: ");
            usuario = scan.next();
            System.out.println("Senha: ");
            senha = scan.next();
        }
    }
}
