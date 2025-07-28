package ast;
import java.io.*;
import java.util.*;

public class Main {
    private ArrayList<VarDecl> vars;
    private ArrayList<Comando> coms;

    public Main(ArrayList<VarDecl> vars, ArrayList<Comando> coms) {
        this.vars = vars;
        this.coms = coms;
    }

    public void gerarCodigo(PrintWriter out) {
        for (VarDecl v : vars)
            v.gerarCodigo(out);
        for (Comando c : coms)
            c.gerarCodigo(out);
    }
}
