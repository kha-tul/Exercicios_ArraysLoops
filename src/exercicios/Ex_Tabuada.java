package exercicios;

import java.util.Scanner;

public class Ex_Tabuada {
    public static void main(String[] args) {
        //1º: Conforme problema, é necessario pedir ao usuário que digite um número, com a classe Scanner:
        Scanner scan = new Scanner(System.in);

        //2º: Imprimir a solicitação de digitacao ao usuário:
        System.out.println();
        //3º: criar a váriavel para armanezar o que foi digitado, via Scanner, pelo usuário, na variavel
        //int tabuada.
        int tabuada = scan.nextInt(); //nextInt pq é inteiro.

        //4º: vamos imprimir no console qual tabuada foi solicitada pelo usuawrio:
        System.out.println("Tabuada de " + tabuada);

        //5º: vamos criar a repeticao da tabuada foi solicitada. Ou seja, exemp: 5 x 1 = 5, 5 x 2 = 10,... até x 10;
        for (int i = 1; i <= 10; i++) { //* Parte 1 do 'for': aqui o int i = 1 será equivalente ao 'count', utilizado
            // para contagem nos exercicios anteriores.
            //o 'for' permite a criação da varíavel em seu interior.
            //E o int i = 1 está iniciando com 1, ao invés do 0, por se tratar de uma tabuada (5x1=5)
            //* Parte 2 do for: no meio do for, seria o limite do contador (int = 1), sera determinado quando o laco
            //devera ser repetido. Ou seja, no caso da tabuada, até 10. Então: i <= 10.
            //* Parte 3 do for: será a soma +1 ou ++ do int, porque a cada repeticao do laco, queremos que some +1 unidade
            //ao valor do meu count(i). Entao, i++

            //6º: Conforme o problema, é solicitado que cada interacao seja impresso "x numero" que quero multiplicado
            //e o resultado. Entao, imprimimos a variável tabuada conforme abaixo:
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));// por que i? Porque o i é a repeticao do laço
            // e responsável por determinar quando será vezes um numero, até o i ser <= 10.

        }

    }
}
