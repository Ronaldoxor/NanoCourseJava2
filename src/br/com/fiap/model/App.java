package br.com.fiap.model;

public class App {
    public static void main(String[] args){

        Computador note = new Computador();

        System.out.println("Processador: " + note.processador);
        System.out.println("Espaço Hd: " + note.espacoHd);
        System.out.println("Preço: " + note.preco);
        System.out.println("Marca: " + note.marca);
        System.out.println("Modelo: " + note.modelo);
        System.out.println("Memória RAM: " + note.memoriaRam);
        System.out.println("Placa de vídeo dedicada: " + note.placaVideoDedicada);
        System.out.println("Fabricante: " + note.fabricante);
    }
}
