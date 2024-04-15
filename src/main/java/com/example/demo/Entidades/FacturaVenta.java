package com.example.demo.Entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FacturaVenta {
    private Date fechaFacturacion;
    private Long numeroComprobante;
    private BigDecimal subTotal;
    private BigDecimal gastosEnvio;
    private BigDecimal totalVenta;
    //Falta el atributo forma de pago (Enum)
}
