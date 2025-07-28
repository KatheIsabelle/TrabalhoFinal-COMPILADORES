package ast;
import java.io.*;
import java.util.*;

public class Prog {
    private Main main;
    private ArrayList<Fun> funs;

    public Prog(Main main, ArrayList<Fun> funs) {
        this.main = main;
        this.funs = funs;
    }

    public void gerarCodigo(PrintWriter out) {
        out.println("public class Gerado {");
        for (Fun f : funs)
            f.gerarCodigo(out);
        out.println("public static void main(String[] args) {");
        main.gerarCodigo(out);
        out.println("}");
        out.println("}");
    }
}
