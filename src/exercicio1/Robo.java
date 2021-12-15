package exercicio1;

class Pai {
    public CharSequence sobrescrita() {
        System.out.println("metodo pai");
        return "";
    }
}

class Filho extends Pai {
    @Override
    public String sobrescrita() {
        System.out.println("metodo filho");
        return "";
    }
}

public class Robo {
    public int unidades;

    public void move() {
        this.unidades += 1;
    }

    public int move(int movimentos) {
        this.unidades += movimentos;
        return this.unidades;
    }



    public static void main(String[] args) {
        Robo robo = new Robo();

        robo.move();
        robo.move(10);
        System.out.println(robo.unidades);
    }
}
