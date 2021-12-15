package revisao;

interface Passaro {
    void voar();
}

class Papagaio implements Passaro {
    @Override
    public void voar() {
        System.out.println("Papagaio voando");
    }
    public void comerSementes() {
        System.out.println("Comendo sementes");
    }
}

class Coruja implements Passaro {
    @Override
    public void voar() {
        System.out.println("Coruja voando");
    }
}

public class Polimorfismo {

    public static void fazPassaroVoar(Passaro passaro) {
        passaro.voar();
    }

    public static void main(String[] args) {
        Passaro passaro = new Coruja();

        fazPassaroVoar(passaro);
    }
}
