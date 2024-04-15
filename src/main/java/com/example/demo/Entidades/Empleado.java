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
public class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    //Falta el atributo perfil (Enum)
}
