package entidades;

public enum Mensajes {

    MENSAJE_PETICION_HORAS("INGRESAR HORAS TRABAJADAS"),
    MENSAJE_PETICION_VALOR_HORA("INGRESAR EL VALOR DE LA HORA"),
    MENSAJE_SALARIO_PAGAR("EL SALARIO A PAGAR ES: $ ");
    private String mensaje;

    Mensajes(String s) {
        this.mensaje=s;
    }

    public String getMensajes() {
        return mensaje;
    }
}
