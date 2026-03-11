package br.com.fiap.model;

public class Computador {
    String modelo;
    String marca;
    double preco;
    int memoriaRam;
    int espacoHd;
    String processador;
    boolean placaVideoDedicada;

    Fabricante fabricante;

    //Construtor

    public Computador(String modelo, String marca, double preco, int memoriaRam, int espacoHd, String processador, boolean placaVideoDedicada, Fabricante fabricante){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.memoriaRam = memoriaRam;
        this.espacoHd = espacoHd;
        this.processador = processador;
        this.placaVideoDedicada = placaVideoDedicada;
        this.fabricante = fabricante;
    }

    public Computador(){};

    public Computador(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }
    //Métodos

    double calcularDesconto(double desconto){
        return preco * desconto;
    }

    //Valida se é possível adicionar a memória e ajusta o preço do computador
    boolean adicionarMemoriaRam(int quantidade){
        //valida se é possível adicionar essa quantidade de memória(múltiplos de 2)
        if (quantidade % 2 == 1){
            return false;
        }
        memoriaRam += quantidade;
        preco += quantidade*150;
        return true;
    }

    void trocarProcessador(String novoProcessador){
        processador = novoProcessador;
    }

    void trocarHdeProcessador(String novoProcessador, int novoHd){
        processador = novoProcessador;
        espacoHd = novoHd;
    }

    void aumentarPreco(){
        preco = preco + 100;
    }
}
