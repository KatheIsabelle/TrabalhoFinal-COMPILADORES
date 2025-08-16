package ast;
import java.io.*;

public class VarDecl {
    private String tipo;
    private String var;

    public VarDecl(String tipo, String var) {
        this.tipo = tipo;
        this.var = var;
    }

    public void gerarCodigo(PrintWriter out) {
        // Cria uma variável para armazenar o tipo traduzido
        String tipoJava = tipo;
        
        // Verifica se o tipo original é "bool" e o traduz para "boolean"
        if (tipo.equals("bool")) {
            tipoJava = "boolean";
        }
        
        // Usa o tipo traduzido para gerar o código
        out.println(tipoJava + " " + var + ";");
    }
}
