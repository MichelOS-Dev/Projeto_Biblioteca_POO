package modeloBeans;

public class BeansAluno { 

    private int codigo;
    private int matricula;
    private String nome;
    private String  turma;
    private String curso;
    private int LivrosLidos;
    private String pesquisa;
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getLivrosLidos() {
        return LivrosLidos;
    }

    public void setLivrosLidos(int LivrosLidos) {
        this.LivrosLidos = LivrosLidos;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
