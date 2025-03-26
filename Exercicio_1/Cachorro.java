package Exercicio_1;

public class Cachorro extends Animal{

        public Cachorro(String nome) {
            super(nome);
        }

        @Override
        public void fazerSom() {
            System.out.println("O cachorro late");
        }
    }