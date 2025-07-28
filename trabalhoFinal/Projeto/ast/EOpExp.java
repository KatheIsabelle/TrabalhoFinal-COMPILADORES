package ast;
import java.io.*;

public class EOpExp extends Exp {
    private String op;
    private Exp arg1, arg2;

    public EOpExp(String op, Exp arg1, Exp arg2) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print("(");
        arg1.gerarCodigo(out);
        out.print(" " + op + " ");
        arg2.gerarCodigo(out);
        out.print(")");
    }
}
