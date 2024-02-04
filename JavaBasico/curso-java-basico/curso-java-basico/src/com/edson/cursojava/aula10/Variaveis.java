package com.edson.cursojava.aula10;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class Variaveis {
    public static void main(String[] args) {
        //A String não e um tipo primitivo e sim uma classe!
        //Aceito, dentro da conveção Java
        int idade = 17;
        String nome = "Edson Sales Souza";
        int anoNascimento = 1994;

        //Aceito, mas não utilzado
        int _idade;
        int $idade;

        //não é convenção Java
        String nome_do_meio; //Correto seria -> nomeDoMeio
        String NomeDoMeio; // -> nomeDoMeio
        String NomeMeuCachorro; // -> nomeMeuCachorro

        System.out.println("Nome ********* = " + nome );
        System.out.println("Ano nascimento = " + anoNascimento );
        if (idade > 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        //Má pratica
        int a = 10; //num10
        String b = "Edson"; //nomePessoa
        //-> deve criar nomes que tenha significado, para saber para que serve a variavel ou classe
    }
}

