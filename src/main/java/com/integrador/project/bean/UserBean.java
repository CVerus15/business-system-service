package com.integrador.project.bean;

import com.google.gson.annotations.Expose;
import com.integrador.project.converter.StatusConverter;
import com.integrador.project.enums.StatusEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Convert;
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
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserBean implements Serializable {
    @Expose
    private Long id;

    @Expose
    private String name;

    @Expose
    private String firstLastName;

    @Expose
    private String secondLastName;

    @Expose
    private String email;

    @Expose
    private String address;

    @Expose
    private StatusEnum state;
}
