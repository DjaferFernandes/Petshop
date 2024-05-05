public class Banho implements Servicos {
    private int Tipo;
    private TamanhoAnimal tamanhoAnimal;
    private TipoPelo tipoPelo;
    private double preco;

    public Banho(int Tipo, String tamanhoAnimal, String tipoPelo) {
        this.Tipo = Tipo;
        this.tamanhoAnimal = TamanhoAnimal.valueOf(tamanhoAnimal);
        this.tipoPelo = TipoPelo.valueOf(tipoPelo);
        CalculaPrecoFinal();
    }



    private void CalculaPrecoFinal() {
        double precofixo;
        switch (tamanhoAnimal) {
            case p:
                precofixo = 20.0;
                break;
            case m:
                precofixo = 30.0;
                break;
            case g:
                precofixo = 40.0;
                break;
            default:
                precofixo = 0.0;
        }

        switch (tipoPelo) {
            case curto:
                this.preco = precofixo;
                break;
            case medio:
                this.preco = precofixo + 10.0;
                break;
            case longo:
                this.preco = precofixo + 20.0;
                break;
            default:
                this.preco = 0.0;
        }
    }

    @Override
    public int getTipo() {
        return Tipo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

}