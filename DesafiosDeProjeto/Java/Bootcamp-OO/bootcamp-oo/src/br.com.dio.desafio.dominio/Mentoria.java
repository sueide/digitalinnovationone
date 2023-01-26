import java.time.LocalDate;

public class Mentoria extends Conteudo{
    LocalDate data;

    public Mentoria(){

    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + getTitulo() + '\'' + 
                ", Descrição= '" + getDescricao() + '\'' +
                ", Data=" + data +
                '}';
    
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
   
}
