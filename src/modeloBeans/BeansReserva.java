package modeloBeans;

import java.util.Date;


public class BeansReserva {

    private int IdReserva;

    private String NomeALuno;
    private String Nomelivro;
    private Date dateReserva;
    private Date dateEntrega;
    private String Situacao;
    
    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int IdReserva) {
        this.IdReserva = IdReserva;
    }

//    public int getCodAluno() {
//        return CodAluno;
//    }
//
//    public void setCodAluno(int CodAluno) {
//        this.CodAluno = CodAluno;
//    }
//
//    public int getCodLivro() {
//        return CodLivro;
//    }
//
//    public void setCodLivro(int CodLivro) {
//        this.CodLivro = CodLivro;
//    }

    public String getNomeALuno() {
        return NomeALuno;
    }

    public void setNomeALuno(String NomeALuno) {
        this.NomeALuno = NomeALuno;
    }

    public String getNomelivro() {
        return Nomelivro;
    }

    public void setNomelivro(String Nomelivro) {
        this.Nomelivro = Nomelivro;
    }
    
    public Date getDateReserva() {
        return dateReserva;
    }

    public void setDateReserva(Date dateReserva) {
        this.dateReserva = dateReserva;
    }

    public Date getDateEntrega() {
        return dateEntrega;
    }

    public void setDateEntrega(Date dateEntrega) {
        this.dateEntrega = dateEntrega;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }
    
}
