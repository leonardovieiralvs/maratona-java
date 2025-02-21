package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Comparator;

public class Smartphone implements Comparable<Smartphone>{
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        if(serialNumber != null  && serialNumber.equals(smartphone.serialNumber));
        return marca != null  && marca.equals(smartphone.marca);
    }

    @Override
    public int hashCode() {
        return this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int compareTo(Smartphone smartphone) {
        return this.getMarca().compareTo(smartphone.getMarca());
    }
}
