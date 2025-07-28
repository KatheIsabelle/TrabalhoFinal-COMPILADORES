package ast;
import java.io.*;

public class EVar extends Exp {
    private String var;

    public EVar(String var) {
        this.var = var;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print(var);
    }
}
