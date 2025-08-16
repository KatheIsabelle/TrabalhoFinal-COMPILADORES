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

    // CORREÇÃO 1: A assinatura do método foi alterada para aceitar o nome da classe.
    public void gerarCodigo(PrintWriter out, String nomeClasse) {
        // CORREÇÃO 2: A variável nomeClasse é usada para gerar o nome correto.
        out.println("public class " + nomeClasse + " {");
        
        for (Fun f : funs)
            f.gerarCodigo(out);
            
        out.println("    public static void main(String[] args) {");
        
        main.gerarCodigo(out);
        
        out.println("    }");
        out.println("}");
    }
}