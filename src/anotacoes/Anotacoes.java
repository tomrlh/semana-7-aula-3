package anotacoes;

@interface Marcador {}

@Marcador
class MinhaClasse {}

@Marcador
class ClasseSemMarcador {}

public class Anotacoes {
    @Marcador
    public String v1;

    @Marcador
    public void m1() {}

    public static void main(String[] args) {
        @Marcador
        MinhaClasse mc = new MinhaClasse();
        ClasseSemMarcador csm = new ClasseSemMarcador();

        marker(mc);
        // marker(csm);
    }

    static void marker(MinhaClasse obj) {
        if(obj.getClass().isAnnotationPresent(Marcador.class)) {
            System.out.println("objeto é um Marcador");
        }
        System.out.println("objeto não é´um Marcador");
    }
}
