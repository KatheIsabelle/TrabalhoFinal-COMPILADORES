package ast;

public class ParamFormalFun {
    private String var;
    private String tipo;

    public ParamFormalFun(String var, String tipo) {
        this.var = var;
        this.tipo = tipo;
    }

    public String getVar() {
        return var;
    }

    // NOVO MÉTODO: Retorna o tipo pronto para o Java
    public String getTipo() {
        if (this.tipo.equals("bool")) {
            return "boolean";
        }
        return this.tipo;
    }
}