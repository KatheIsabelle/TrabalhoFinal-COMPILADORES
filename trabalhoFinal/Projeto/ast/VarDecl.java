package ast;
import java.io.*;

public class VarDecl {
    private String tipo;
    private String var;

    public VarDecl(String tipo, String var) {
        this.tipo = tipo;
        this.var = var;
    }

    public void gerarCodigo(PrintWriter out) {
        out.println(tipo + " " + var + ";");
    }
}
