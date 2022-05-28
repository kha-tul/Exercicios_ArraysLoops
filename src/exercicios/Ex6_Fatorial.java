package exercicios;
/*
Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuário.
ex: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        //1º: solicitar a digitação do numero pelo método Scanner
        Scanner scan = new Scanner(System.in);

        //2º Solicitar o número para o usuário e criar a variável para armazenar o número informado:
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        //** Obs: *** para entender quando usar while ou for: for é utilizado quanto é necessário criar
        //uma variável para contagem. While é melhor em casos de true ou false

        int multiplicacao = 1; //ver etapa 4.

        System.out.println(fatorial + "! = "); //ver etapa 6

        //3º: como decompor o número informado em forma fatorial e criar a repetição:
        for(int i = fatorial; i >= 1; i --) { //int i = é o controle, a contagem de vezes que o laço será repetido.
            //i >= 1 - é o limite da repetição, quero que o laço realize a repetição até o número informado
            //ser maior ou igual a 1 (i >= 1).
            // i = i - 1 ou i-- porque a cada volta do laço, é necessário diminuir um. Então, vai ajudar a determinar
            //quando encerrar.

            //4º: Como pegar cada valor e multiplicar por cada numero? É necessário criar uma variável fora
            //do laço. Por isso adicionamos a variavel 'int multiplicacao = 1'. E é necessário iniciar com 1
            //por se tratar de uma multiplicacao. Se colocasse = 0, todos os laços seriam = 0. (por sr multiplicacao)

            //5º criar variável para multiplicar cada número dentro do laço:
            multiplicacao = multiplicacao * i; //ou seja, vai multiplicar pelo numero que está mudando.

            //6º: criar um sout para organizar a impressão conforme o exemplo (fatorial + "! = ")

        }
        //7º exibir valor da multiplicacao
        System.out.println(multiplicacao);


    }

}
