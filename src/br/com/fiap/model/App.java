package br.com.fiap.model;

public class App {
    public static void main(String[] args){
        Computador pc = new Computador();
        pc.modelo = "G5";
        pc.marca = "Dell";
        pc.espacoHd = 256;
        pc.memoriaRam = 8;
        pc.placaVideoDedicada = true;
        pc.processador = "i7";
        pc.preco = 5200.50;

        Fabricante fabricante = new Fabricante();
        fabricante.nome = "Dell";
        fabricante.endereco = "Av Paulista, 1100";

        pc.fabricante = fabricante;

        Computador note = new Computador();
        note.modelo = "Macbook Pro";
        note.marca = "Apple";
        note.placaVideoDedicada = false;
        note.espacoHd = 512;
        note.memoriaRam = 16;
        note.processador = "i5";
        note.preco = 15000.00;
    }
}
