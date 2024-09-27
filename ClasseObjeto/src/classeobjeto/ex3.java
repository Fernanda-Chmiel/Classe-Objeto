package classeobjeto;

public class ex3 {
    String marca;
    String modelo;
    int ano;
    int velocidade = 0;
    int aceleracao;
    int desacelerar;
    int velocidadefinal;

    public ex3(String marca, String modelo, int ano, int aceleracao, int desacelerar) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.aceleracao = aceleracao;
        this.desacelerar = desacelerar;
        this.velocidadefinal = velocidade + aceleracao - desacelerar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getDesacelerar() {
        return desacelerar;
    }

    public void setDesacelerar(int desacelerar) {
        this.desacelerar = desacelerar;
    }

    public int getVelocidadefinal() {
        return velocidadefinal;
    }

    public void setVelocidadefinal(int velocidadefinal) {
        this.velocidadefinal = velocidadefinal;
    }
    
    
    
}
