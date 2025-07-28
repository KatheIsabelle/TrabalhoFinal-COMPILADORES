package ast;
import java.io.*;

public abstract class Comando {
    public abstract void gerarCodigo(PrintWriter out);
}
