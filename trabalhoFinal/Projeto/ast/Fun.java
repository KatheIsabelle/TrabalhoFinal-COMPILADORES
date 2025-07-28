package ast;
import java.io.*;
import java.util.*;

public class Fun {
    private String nome;
    private ArrayList<ParamFormalFun> params;
    private String retorno;
    private ArrayList<VarDecl> vars;
    private ArrayList<Comando> body;

    public Fun(String nome, ArrayList<ParamFormalFun> params, String retorno, ArrayList<VarDecl> vars, ArrayList<Comando> body) {
        this.nome = nome;
        this.params = params;
        this.retorno = retorno;
        this.vars = vars;
        this.body = body;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print(retorno + " " + nome + "(");
        for (int i = 0; i < params.size(); i++) {
            out.print(params.get(i).getTipo() + " " + params.get(i).getVar());
            if (i < params.size() - 1) out.print(", ");
        }
        out.println(") {");
        for (VarDecl v : vars)
            v.gerarCodigo(out);
        for (Comando c : body)
            c.gerarCodigo(out);
        out.println("}");
    }
}
