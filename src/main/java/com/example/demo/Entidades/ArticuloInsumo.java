package com.example.demo.Entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloInsumo {
    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private boolean esParaElaborar;
}