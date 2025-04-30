package Lab82DataStructures;

import java.util.Objects;

public class Auto {

    private String name;
    private String marca;
    private int anno;
    private float kmPercorsi;


    public Auto(String name, String marca, int anno, float kmPercorsi) {
        this.name = name;
        this.marca = marca;
        this.anno = anno;
        this.kmPercorsi = kmPercorsi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public float getKmPercorsi() {
        return kmPercorsi;
    }

    public void setKmPercorsi(float kmPercorsi) {
        this.kmPercorsi = kmPercorsi;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return anno == auto.anno && Float.compare(kmPercorsi, auto.kmPercorsi) == 0 && Objects.equals(name, auto.name) && Objects.equals(marca, auto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marca, anno, kmPercorsi);
    }


    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", anno=" + anno +
                ", kmPercorsi=" + kmPercorsi +
                '}';
    }
}
