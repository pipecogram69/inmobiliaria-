   package dto;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @FELIPE
 */
public class Cliente {
    


    public String nombre;
    public  int identificacion;
    public int valor_pagado;
    public  int saldoApto;
    private int saldo;
    
    public String obtenerNombre() {
        return this.nombre;
    }
    
    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int obtenerIdentificacion() {
        return this.identificacion;
    }
    
    public void modificarIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    public int obtenerValor_pagado() {
        return this.valor_pagado;
    }
    
    public void modificarValor_pagado(int valor_pagado) {
        this.valor_pagado = valor_pagado;
    }
    
    public int obtenerSaldo() {
        return this.saldo;
    }
    
    public void calcularSaldo(int valor_pagado, int valor_apatarmento, int compra_realizada) {
        int valor_apartamento = 0;
        this.saldo = valor_apartamento - valor_pagado- compra_realizada;
    }
}
    
}
