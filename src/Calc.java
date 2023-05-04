public class Calc {

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    int n1, n2;


    public int diferenca(int n1, int n2){
       // throw new java.lang.UnsupportedOperationException(" Falha sistemica de tagamandapio");
        return n1 - n2;
    }

    public int divisao(int n1, int n2){
       // throw new java.lang.UnsupportedOperationException(" Falha sistemica de tagamandapio");
        return n1/n2;
    }

    public int produto(int n1, int n2){
       // throw new java.lang.UnsupportedOperationException(" Falha sistemica de tagamandapio");
        return n1*n2;
    }

    public int soma(int n1, int n2){
       // throw new java.lang.UnsupportedOperationException(" Falha sistemica de tagamandapio");
         return n1+n2;
    }
}
