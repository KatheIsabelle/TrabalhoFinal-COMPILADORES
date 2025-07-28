package ast;
import java.io.*;
import java.util.*;

public class CWhile extends Comando {
    private Exp cond;
    private ArrayList<Comando> bloco;

    public CWhile(Exp cond, ArrayList<Comando> bloco) {
        this.cond = cond;
        this.bloco = bloco;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print("while (");
        cond.gerarCodigo(out);
        out.println(") {");
        for (Comando c : bloco) {
            c.gerarCodigo(out);
        }
        out.println("}");
    }
}
