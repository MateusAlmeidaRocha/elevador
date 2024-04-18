public class elevador{
  int andarAtual;
  int totalAndares;
  int capacidade;
  int pessoas;

  public elevador(int capacidade, int totalAndares){
    this.capacidade = capacidade;
    this.totalAndares = totalAndares;
    this.andarAtual = 0;
    this.pessoas = 0;
  }

  public void entra(){
    if(pessoas < capacidade){
      pessoas++;
    }else if(pessoas > capacidade){
      System.out.println("Elevador cheio!");
    }
  }

  public void sai(){
    if(pessoas > 0){
      pessoas--;
    }
  }

  public void sobe(){
    if(andarAtual < totalAndares){
      andarAtual++;
    }else if(andarAtual > totalAndares){
      System.out.println("nao é mais possivel subir");
    }
  }

  public void desce(){
    if(andarAtual > 0){
      andarAtual--;
    }else if(andarAtual < 0){
      System.out.println("nao e possivel decer mais");
    }
  }

 
}