package Repeticao;

/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.
 */

import java.util.Objects;
import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.println("Usuário: ");
        usuario = scan.next();
        System.out.println("Senha: ");
        senha = scan.next();

        while (Objects.equals(usuario, senha)) {
            System.out.println("A senha não pode ser igual ao usuário! Tente novamente: ");
            System.out.println("Usuário: ");
            usuario = scan.next();
            System.out.println("Senha: ");
            senha = scan.next();
        }
    }
}
