public class ListaEstatica {

    private int[] info;
    private int tamanho;

    public ListaEstatica(){
        this.info = new int[10];
        this.tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }
    public void exibir() {
        for (i=0; i< tamanho; i++) {
            System.out.println(this.info[i]);
        }
        
    }

}
