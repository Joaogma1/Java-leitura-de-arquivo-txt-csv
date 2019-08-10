package adopib;

public class PIB {

    private float pib;
    private float porcentagem;

    private String estado;
    private String regiao;

    public PIB(float pib, String estado) {
        this.pib = pib;
        this.estado = estado;
    }

    public float getPib() {
        return pib;
    }

    public void setPib(float pib) {
        this.pib = pib;
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
