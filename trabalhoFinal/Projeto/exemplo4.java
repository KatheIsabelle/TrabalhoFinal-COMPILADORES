public class exemplo4 {
static boolean numeroValido(float num, float fator) {
float resultado;
resultado = (num * fator);
if (((resultado > 20.0f) && ((resultado < 50.0f) || (resultado == 77.0f)))) {
return true;
}
return false;
}
static void imprimirStatus(boolean status, float valor) {
if (status) {
System.out.println(valor);
}
}
    public static void main(String[] args) {
float numero_lido;
float fator_secreto;
boolean eh_valido;
fator_secreto = 7.0f;
eh_valido = false;
java.util.Scanner sc = new java.util.Scanner(System.in);
numero_lido = sc.nextFloat();
eh_valido = numeroValido(numero_lido, fator_secreto);
imprimirStatus(eh_valido, (numero_lido * fator_secreto));
    }
}
