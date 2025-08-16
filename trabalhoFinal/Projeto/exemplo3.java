public class exemplo3 {
static float soma(float a, float b) {
float c;
c = (a + b);
return c;
}
static float div(float a, float b) {
float c;
c = (a / b);
return c;
}
static void printaZebra(float zebra) {
System.out.println(zebra);
}
    public static void main(String[] args) {
float var_a;
float var_b;
float result;
boolean flag;
var_a = 666.0f;
var_b = 777.0f;
result = soma(var_a, var_b);
System.out.println(result);
result = div(var_a, var_b);
if ((result < 10.0f)) {
flag = true;
}
printaZebra(result);
    }
}
