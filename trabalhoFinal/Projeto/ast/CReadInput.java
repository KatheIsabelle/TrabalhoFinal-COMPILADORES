package ast;
import java.io.*;

public class CReadInput extends Comando {
    private String var;

    public CReadInput(String var) {
        this.var = var;
    }

    public void gerarCodigo(PrintWriter out) {
        out.println("java.util.Scanner sc = new java.util.Scanner(System.in);");
        out.println(var + " = sc.nextFloat();");
    }
}
