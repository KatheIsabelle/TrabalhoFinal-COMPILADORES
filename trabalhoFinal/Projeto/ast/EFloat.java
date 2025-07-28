package ast;
import java.io.*;

public class EFloat extends Exp {
    private float value;

    public EFloat(float value) {
        this.value = value;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print(value);
    }
}
