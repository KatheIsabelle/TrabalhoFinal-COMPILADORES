package ast;
import java.io.*;

public class ETrue extends Exp {
    public void gerarCodigo(PrintWriter out) {
        out.print("true");
    }
}
