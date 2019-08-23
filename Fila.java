public interface Fila <E>{
  public void enqueue(E elemento);
  public E dequeue();
  public E inicio();
  public int size();
  public boolean isEmpty();
}
