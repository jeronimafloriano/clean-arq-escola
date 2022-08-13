package escola.dominio.aluno;

import escola.dominio.dadospessoais.Cpf;
import escola.dominio.dadospessoais.Email;
import escola.dominio.dadospessoais.Telefone;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Cpf cpf;
    private String nome;
    private Email email;
    private String senha;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(Cpf cpf, String nome, Email email){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd,numero));
    }

    public String getNome() {
        return this.nome;
    }

    public String getNumeroCpf(){
        return this.cpf.getCpf();
    }

    public Email getEmail() {
        return this.email;
    }

    public List<Telefone> getTelefones(){
        return this.telefones;
    }

    public void getDdd(){
        this.getTelefones().stream().forEach(a -> a.getDdd().toString());
    }
}
