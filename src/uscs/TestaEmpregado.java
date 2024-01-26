package uscs;

public class TestaEmpregado {

   
    public static void main(String[] args) {
        
        //objetos
       Empregado e1 = new Empregado();
       Empregado e2 = new Empregado();
       
       
       e1.codEmp = 1232;
       e1.nome = "Paulo Silva";
       e1.cargo = "Gerente Financeiro";
       e1.sal =  15400;
       
       
       e2.codEmp = 4567;
       e2.nome = "Ana Paula";
       e2.cargo = "Analista de Sistemas Senior";
       e2.sal = 10700;
      
       
       //metodos de impressão
      e1.ImprimeEmpregado();
      e2.ImprimeEmpregado();
      e1.TotalEmpregados();
      e2.TotalEmpregados();
      
      //após a implemenação do encapsulamento pelo ''private'', 
      //o codigo não executa pois não tem acesso aos parametros.
       
       
    }
    }
    

