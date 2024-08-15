public class FilaEstatica {

    private int[] dados; // Array que armazena os elementos da fila
    private int inicio;  // Indice do primeiro elemento da fila
    private int fim;    // Índice do próximo espaço vazio na fila
    private int tamanho; // Tamanho máximo da fila

    // Construtor da classe FilaEstatica
    public FilaEstatica(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.inicio = 0;
        this.fim = 0;
    }

    // Método para verificar se a fila está vazia
    public boolean vazia() {
        return inicio == fim;
    }

    // Método para verificar se a fila está cheia
    public boolean cheia() {
        return fim == tamanho;
    }

    // Método para enfileirar um elemento na fila
    public void enfileirar(int valor) {
        if (cheia()) {
            System.out.println("Fila cheia!");
            return;
        }
        dados[fim] = valor;
        fim++;
        System.out.println(valor + " enfileirado na fila.");
    }

    // Método para desenfileirar um elemento da fila
    public int desenfileirar() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return -1; // Valor para indicar erro
        }
        int valor = dados[inicio];
        inicio++;
        System.out.println(valor + " desenfileirado da fila.");
        return valor;
    }

    // Método para imprimir a fila
    public void imprimir() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Fila: ");
        for (int i = inicio; i < fim; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Criando uma fila com tamanho 5
        FilaEstatica fila = new FilaEstatica(5);

        // Enfileirando elementos
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.imprimir();

        // Desenfileirando um elemento
        fila.desenfileirar();
        fila.imprimir();

        // Enfileirando mais elementos
        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.imprimir();

        // Tentando enfileirar em uma fila cheia
        fila.enfileirar(60);
        fila.imprimir();
    }
}