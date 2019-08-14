package adopib;

public class PIB {

    private float valor;
    private float porcentagem;

    private String estado;
    private String regiao;

        public PIB(float pib, String estado) {
        this.valor = pib;
        this.estado = estado;

    }
        
    public PIB(float pib, String estado, String regiao) {
        this.valor = pib;
        this.estado = estado;
        this.regiao = regiao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

}
