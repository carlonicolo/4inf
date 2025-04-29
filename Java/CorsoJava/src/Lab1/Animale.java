package Lab1;

import java.util.Objects;

public class Animale {
    private String nome;
    private int eta;
    private float peso; // kg
    private boolean zampe;

    public Animale(String anome){
        this.nome = anome;
        this.eta = 5;
        this.peso = 2;
        this.zampe = true;
    }

    public Animale(String nome, int eta, float peso, boolean zampe){
        this.nome = nome;
        this.eta = eta;
        this.peso = peso;
        this.zampe = zampe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isZampe() {
        return zampe;
    }

    public void setZampe(boolean zampe) {
        this.zampe = zampe;
    }

    /**
     * Aumenta il peso in base alla quantità di cibo
     *
     * @param quantitaCibo quantità di cibo espressa in grammi
     */
    public void eatFood(float quantitaCibo){
        System.out.println("GNAM GNAM");
        this.peso = (((this.peso)*1000) + (quantitaCibo/10))/1000;
    }

    /**
     * Diminuisce il peso in relazione alla distanza percorsa
     * peso in grammi
     * Diminuisce di 1 gramm0 ogni 1 Km
     *
     * @param distance distanza espressa in km
     */
    public void goToWalk(float distance){
        System.out.println("COME ON!!!");
        this.peso = (((this.peso)*1000 - (distance)))/1000;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", peso=" + peso +
                ", zampe=" + zampe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animale animale = (Animale) o;
        return eta == animale.eta && Float.compare(peso, animale.peso) == 0 && zampe == animale.zampe && Objects.equals(nome, animale.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, eta, peso, zampe);
    }
}
