package ast;
import java.io.*;

public class CReturn extends Comando {
    private Exp exp;

    public CReturn(Exp exp) {
        this.exp = exp;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print("return ");
        exp.gerarCodigo(out);
        out.println(";");
    }
}
