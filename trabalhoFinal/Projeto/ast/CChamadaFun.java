package ast;
import java.io.*;
import java.util.*;

public class CChamadaFun extends Comando {
    private String nomeFun;
    private ArrayList<Exp> args;

    public CChamadaFun(String nomeFun, ArrayList<Exp> args) {
        this.nomeFun = nomeFun;
        this.args = args;
    }

    public void gerarCodigo(PrintWriter out) {
        out.print(nomeFun + "(");
        for (int i = 0; i < args.size(); i++) {
            args.get(i).gerarCodigo(out);
            if (i < args.size() - 1) out.print(", ");
        }
        out.println(");");
    }
}
