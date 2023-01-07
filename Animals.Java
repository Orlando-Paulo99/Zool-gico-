public abstract class Animals {
//atributos
String nome;
String cor;
String raca;
int idade;
double altura;
private String som;


//metodos

  public String getaddSom(){
   return this.som;
   
  }
  
  public void setadd_som(String barulho){
    this.som=this.som+barulho;
  }
 


}
