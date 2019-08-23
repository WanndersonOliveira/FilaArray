public class FilaArray<E> implements Fila<E>{
    private int size;
    private int i = 1; //Fila começa no índice 1 do array
    private int f;
    private E Q[];
    private int capacidade; //Quantidade de índices do array

    public FilaArray(int tam){
      this.capacidade = tam;
      f = i;
      Q = (E[]) new Object[this.capacidade];
    }

    public FilaArray(){
      this.capacidade = 5;
      f = i;
      Q = (E[]) new Object[this.capacidade];
    }

    public void enqueue(E elemento){

      if(size() == this.capacidade-1){ //Algo errado aqui: Não consegue redimensionar o array circular
        int capacidadeVelha = this.capacidade;
        this.capacidade = this.capacidade*2; //Estratégia de duplicação;

        E substituto[] = (E[]) new Object[this.capacidade];

        for(int x = 0; x <= capacidadeVelha;x++){
          int w = x%capacidadeVelha;
          substituto[x] = Q[w];
          System.out.print(" i="+x+"w="+w);
        }

        Q = substituto;
      }

      Q[f] = elemento;
      f = (f+1)%this.capacidade;
    }

    public E dequeue(){
      E elemento;

      if(isEmpty()){
        throw new EFilaVazia("dequeue() -> A fila está vazia!");
      } else {
        elemento = Q[i];
        i = (i+1)%this.capacidade;
      }

      return elemento;
    }

    public E inicio(){
      return this.Q[i];
    }

    public int size(){ //Quantidade de elementos da fila
      return (this.capacidade - i + f)%this.capacidade;
    }

    public boolean isEmpty(){
      return (i == f);
    }

    public void mostrarTudo(){
      System.out.print("\n");
      System.out.print("Fila: ");
      for(int x = 0; x < this.capacidade; x++){
        System.out.print(" "+Q[x]);
      }
    }

}
