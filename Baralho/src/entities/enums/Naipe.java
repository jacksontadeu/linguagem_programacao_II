package entities.enums;

public enum Naipe {
    OURO("Ouro"),
    PAUS("Paus"),
    COPAS("Copas"),
    ESPADAS("Espadas"),
    CORINGA("Coringa");

    private final String descricao;

    Naipe(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
