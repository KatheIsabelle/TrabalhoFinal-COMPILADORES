package ast;
import java.io.*;
import java.util.*;

public class CIf extends Comando {
    private Exp cond;
    private ArrayList<Comando> bloco;

    public CIf(Exp cond, ArrayList<Comando> bloco) {
        this.cond = cond;
        this.bloco = bloco;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print("if (");
        cond.gerarCodigo(out);
        out.println(") {");
        for (Comando c : bloco) {
            c.gerarCodigo(out);
        }
        out.println("}");
    }
}
