public class Tosa implements Servicos {
    private int Tipo;
    private TamanhoAnimal tamanhoAnimal;
    private double preco;

    public Tosa(int Tipo, String tamanhoAnimal) {
        this.Tipo = Tipo;
        this.tamanhoAnimal = TamanhoAnimal.valueOf(tamanhoAnimal);
        calculaPrecoFinal();
    }

    private void calculaPrecoFinal() {
        switch (tamanhoAnimal) {
            case p:
                this.preco = 22.0;
                break;
            case m:
                this.preco = 30.0;
                break;
            case g:
                this.preco = 40.0;
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
