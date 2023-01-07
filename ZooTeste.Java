import java.util.Scanner;

import animal.Cachorro;


public class zooTeste {

  public static void main(String[] args) {
   Cachorro dog=new Cachorro();
   Scanner tec=new Scanner(System.in);
   
   System.out.println("Nome do cachorro: ");
   dog.nome_c=tec.next();
   
   System.out.println("Cor do Cachorro: ");
   dog.cor_c=tec.next();
   
   System.out.println("Raça do cachorro: ");
   dog.raca_c=tec.next();
   
   System.out.println("idade do cachorro: ");
   dog.idade_c=tec.nextInt();
   
   System.out.println("Altura do cachorro: ");
   dog.altura_c=tec.nextDouble();
   
   System.out.println("Cadastro do seu cachorro feito com sucesso ");
   
   
   dog.setadd_som("latindo");
   dog.setadd_som(" auauauau");
   
   System.out.println("O seu cachorro está "+dog.getaddSom());
  
  
  
  }
  

}
