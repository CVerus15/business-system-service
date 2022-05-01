package com.integrador.project.model;

import com.google.gson.annotations.Expose;
import com.integrador.project.converter.StatusConverter;
import com.integrador.project.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Cristian J. Valqui Cabrera
 * @version 30/04/2022
 * <p>
 * Copyright (c) 2022 CValqui, S.A. Todos los derechos reservados.
 * <p>
 * Este software constituye información confidencial y propietaria de CValqui,
 * ("Información Confidencial"). Usted no debe develar dicha Información
 * Confidencial y debe usarla de acuerdo con los términos de aceptación de
 * licencia de uso que firmó con Byte.
 */
@Entity
@Table(name = "FSS_USER")
@Getter
@Setter
@ToString
public class User implements Serializable {
    @Id
    @Expose
    @Column(name = "FFSU_ID")
    @TableGenerator(name = "FFS_USER_GENERATOR", table ="SEQUENCE_TABLE", pkColumnName = "SEQ_NAME",
    valueColumnName = "SEQ_COUNT", pkColumnValue = "FSS_USER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "FSS_USER_GENERATOR")
    private Long id;

    @Expose
    @Column(name="FFSU_NAME")
    private String name;

    @Expose
    @Column(name="FFSU_FIRST_LNAME")
    private String firstLastName;

    @Expose
    @Column(name="FFSU_SECOND_SNAME")
    private String secondLastName;

    @Expose
    @Column(name="FFSU_EMAIL")
    private String email;

    @Expose
    @Column(name="FFSU_ADDRESS")
    private String address;

    @Expose
    @Column(name="FFSU_STATE")
    @Convert(converter = StatusConverter.class)
    private StatusEnum state;
}
