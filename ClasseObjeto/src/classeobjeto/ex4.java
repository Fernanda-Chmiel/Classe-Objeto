package classeobjeto;

public class ex4 {
    
    String titulo;
    String autor;
    int numerodepagina;
    int emprestado;
    int devolvido;
    int exemplares = 0;

    public ex4(String titulo, String autor, int numerodepagina, int emprestado, int devolvido) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepagina = numerodepagina;
        this.emprestado = emprestado;
        this.devolvido = devolvido;
        this.exemplares = exemplares + emprestado - devolvido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodepagina() {
        return numerodepagina;
    }

    public void setNumerodepagina(int numerodepagina) {
        this.numerodepagina = numerodepagina;
    }

    public int getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(int emprestado) {
        this.emprestado = emprestado;
    }

    public int getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(int devolvido) {
        this.devolvido = devolvido;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    
    
}
