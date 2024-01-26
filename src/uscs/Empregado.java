
    
package uscs;

// informaçoes das classes
    public class Empregado {

    static void imprimeTotalEmpregados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    int codEmp;
    String nome;
    String cargo;
    double sal;
    public int totalEmpregados;
    
    
    //encapsulamento
    public String getnome(){
        return nome;
    }
    public int getcodEmp(){
        return codEmp;
    }
    public String getcargo(){
        return cargo;
    }
    public double getsal(){
        return sal;
    }
    
    public void setnome (String nome){
        this.nome = nome;
    }
    public void setcodEmp (int codEmp){
        this.codEmp = codEmp;
    }
    public void setcargo (String cargo){
        this.cargo = cargo;
    }
    public void setsal (double sal){
        this.sal = sal;
    }
    
    
    
    
    //construtor1 com parametros
    public Empregado(int codEmp, String nome,String cargo, double sal){
        this.codEmp = codEmp;
        this.nome = nome;
        this.cargo = cargo;
        this.sal = sal;
}
    //construtor2 sem parametros
    public Empregado(){
        totalEmpregados++;
    }
    
    //metodos de impressão
    void ImprimeEmpregado(){
        System.out.println(" aqui estão as informaçoes do empregado:  " +  nome  +  codEmp  +  cargo  +  sal);
    }
    
    void TotalEmpregados() {
        System.out.println("Quantidade de empregados " + totalEmpregados);
    }
    
    
    
    
}

