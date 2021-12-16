package sobrescrita.revisao;

class Passaro {
    public void voar() {
        System.out.printf("Pássaro voando");
    }

    public void comer() {
        System.out.println("Pássaro comento");
    }
}

class Aguia extends Passaro {
    public int voar(int metros) {
        System.out.println("Águia voando à " + metros + " metros de altura");
        return metros;
    }

    @Override
    public void comer() {
        System.out.println("Águia comendo feliz");
    }
}

public class SobrecargaESobrescrita {
}
