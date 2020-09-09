package Atividades;

public class LivroDeNotas {
    private String getNomeDoCurso;

    public String getGetNomeDoCurso() {
        return getNomeDoCurso;
    }

    public void setNomeDoCurso(String getNomeDoCurso) {
        this.getNomeDoCurso = getNomeDoCurso;
    }

    public void exibirMensagem(){
        System.out.println("O nome do curso é :  " + getNomeDoCurso);


    }
}
