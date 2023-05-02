public class Veiculo {
    private String Marca;
    private String modelo;
    private String Cor;
    private int Ano;

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public String getCor() {
        return this.Cor;
    }

    public void setAno(int ano) {
        this.Ano = ano;
    }

    public int getAno() {
        return this.Ano;
    }

    public Veiculo(String marca, String modelo, String cor, int ano) {
        this.Marca = marca;
        this.modelo = modelo;
        this.Cor = cor;
        this.Ano = ano;
    }

    public Veiculo() {

    }
}
