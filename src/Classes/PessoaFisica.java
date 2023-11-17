package Classes;

public class PessoaFisica {

    private int id_pessoa_fisica;
    private int id_cliente;
    private String nome_pessoa_fisica;
    private String sobrenome_pessoa_fisica;
    private String cpf_pessoa_fisica;
    private String rg_pessoa_fisica;
    private String data_nascimento_pessoa_fisica;

    public PessoaFisica() {
    }

    public PessoaFisica(int id_pessoa_fisica, int id_cliente, String nome_pessoa_fisica, String sobrenome_pessoa_fisica, String cpf_pessoa_fisica, String rg_pessoa_fisica, String data_nascimento_pessoa_fisica) {
        this.id_pessoa_fisica = id_pessoa_fisica;
        this.id_cliente = id_cliente;
        this.nome_pessoa_fisica = nome_pessoa_fisica;
        this.sobrenome_pessoa_fisica = sobrenome_pessoa_fisica;
        this.cpf_pessoa_fisica = cpf_pessoa_fisica;
        this.rg_pessoa_fisica = rg_pessoa_fisica;
        this.data_nascimento_pessoa_fisica = data_nascimento_pessoa_fisica;
    }

    public int getId_pessoa_fisica() {
        return id_pessoa_fisica;
    }

    public void setId_pessoa_fisica(int id_pessoa_fisica) {
        this.id_pessoa_fisica = id_pessoa_fisica;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_pessoa_fisica() {
        return nome_pessoa_fisica;
    }

    public void setNome_pessoa_fisica(String nome_pessoa_fisica) {
        this.nome_pessoa_fisica = nome_pessoa_fisica;
    }

    public String getSobrenome_pessoa_fisica() {
        return sobrenome_pessoa_fisica;
    }

    public void setSobrenome_pessoa_fisica(String sobrenome_pessoa_fisica) {
        this.sobrenome_pessoa_fisica = sobrenome_pessoa_fisica;
    }

    public String getCpf_pessoa_fisica() {
        return cpf_pessoa_fisica;
    }

    public void setCpf_pessoa_fisica(String cpf_pessoa_fisica) {
        this.cpf_pessoa_fisica = cpf_pessoa_fisica;
    }

    public String getRg_pessoa_fisica() {
        return rg_pessoa_fisica;
    }

    public void setRg_pessoa_fisica(String rg_pessoa_fisica) {
        this.rg_pessoa_fisica = rg_pessoa_fisica;
    }

    public String getData_nascimento_pessoa_fisica() {
        return data_nascimento_pessoa_fisica;
    }

    public void setData_nascimento_pessoa_fisica(String data_nascimento_pessoa_fisica) {
        this.data_nascimento_pessoa_fisica = data_nascimento_pessoa_fisica;
    }

}
