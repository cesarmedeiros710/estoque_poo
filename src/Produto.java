class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public boolean vender(int quantidadeVendida) {
        if (quantidadeVendida > quantidade) {
            return false;
        }

        int estoqueAntes = quantidade;
        quantidade -= quantidadeVendida;

        exibirResumo(estoqueAntes, quantidadeVendida);
        return true;
    }

    private void exibirResumo(int estoqueAntes, int quantidadeVendida) {
        System.out.println("Produto: " + getNome());
        System.out.printf("Preço: R$ %.2f%n", getPreco());
        System.out.println("Estoque antes da venda: " + estoqueAntes + " unidades");
        System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
        System.out.println("Estoque atualizado: " + getQuantidade() + " unidades");
    }
}