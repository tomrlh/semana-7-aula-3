package sobrescrita;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.io.IOException;

class Pai {
    protected void metodo() throws IOException {}

    public CharSequence metodo2() {
        return "";
    }
}

class Filha extends Pai {
    @Override
    protected void metodo() throws IIOInvalidTreeException {}

    @Override
    public String metodo2() {
        return "";
    }
}

public class Sobrescrita {
}
