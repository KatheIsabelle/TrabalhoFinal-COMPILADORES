package ast;
import java.io.*;

public class EFalse extends Exp {
    public void gerarCodigo(PrintWriter out) {
        out.print("false");
    }
}
