package entidades.empleados;

public class Salario {

    private double horasTrabajadas;
    private double valorHora;

    public double getHorasTrabajadas(){
       return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }

    public double getValorHora(){
        return valorHora;
    }
    public void setValorHora(double valorHora){
        this.valorHora=valorHora;
    }

    public double calcularSalario(){
        return (this.getHorasTrabajadas()*this.valorHora);
    }

    @Override
    public String toString() {
        return "Salario{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}' + "total horas " + (this.getHorasTrabajadas()*this.valorHora) ;
    }
}
