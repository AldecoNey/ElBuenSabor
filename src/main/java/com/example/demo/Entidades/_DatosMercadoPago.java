package com.example.demo.Entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class _DatosMercadoPago {
    private Date date_created;
    private Date date_approved;
    private Date date_updated;
    private Long payment_type_id;
    private Long payment_method_id;
    private String status;
    private String status_detail;

}
