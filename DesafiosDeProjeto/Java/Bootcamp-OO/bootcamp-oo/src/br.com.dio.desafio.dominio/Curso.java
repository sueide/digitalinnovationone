public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(){
        
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo() + '\'' + 
                ", Descrição= '" + getDescricao() + '\'' +
                ", Carga Horária=" + cargaHoraria +
                '}';
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
