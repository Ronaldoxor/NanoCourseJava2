package br.com.fiap.model;

public class App {
    public static void main(String[] args){

        Computador note = new Computador();
        note.modelo = "Macbook Pro";
        note.marca = "Apple";
        note.placaVideoDedicada = false;
        note.espacoHd = 512;
        note.memoriaRam = 8;
        note.processador = "i5";
        note.preco = 5000.00;

        //Calcular 10% de desconto
        double valorComDesconto = note.calcularDesconto(0.1);
        System.out.println("Valor do Desconto: " + valorComDesconto);

        //Adicionar 8 GB
        boolean sucesso = note.adicionarMemoriaRam(8);
        if (sucesso){
            System.out.println("Memória RAM adicionada");
            System.out.println("Quantidade de memória RAM: " + note.memoriaRam);
            System.out.println("Novo valor do note: " + note.preco);
        }else{
            System.out.println("Não foi possível adicionar a memória");
        }
    }
}
