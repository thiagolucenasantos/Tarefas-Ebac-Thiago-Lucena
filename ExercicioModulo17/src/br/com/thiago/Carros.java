package br.com.thiago;

public abstract class Carros {
    private String marca;
    private String modelo;

public Carros(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
}
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
