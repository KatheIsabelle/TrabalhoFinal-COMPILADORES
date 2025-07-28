package ast;
import java.io.*;

public class CPrint extends Comando {
    private Exp exp;

    public CPrint(Exp exp) {
        this.exp = exp;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print("System.out.println(");
        exp.gerarCodigo(out);
        out.println(");");
    }
}
