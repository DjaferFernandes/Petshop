    public class Hotel implements Servicos {
        private int Tipo;
        private TamanhoAnimal tamanhoAnimal;
        private int horas;
        private double preco;

        public Hotel(int Tipo, String tamanhoAnimal, int horas) {
            this.Tipo = Tipo;
            this.tamanhoAnimal = TamanhoAnimal.valueOf(tamanhoAnimal);
            this.horas = horas;
            CalculaPrecoFinal();
        }


        private void CalculaPrecoFinal() {
            double precoPorHora;
            switch (tamanhoAnimal) {
                case p:
                    precoPorHora = 12.0;
                    break;
                case m:
                    precoPorHora = 18.0;
                    break;
                case g:
                    precoPorHora = 25.0;
                    break;
                default:
                    precoPorHora = 0.0;
            }
            this.preco = precoPorHora * horas;
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


