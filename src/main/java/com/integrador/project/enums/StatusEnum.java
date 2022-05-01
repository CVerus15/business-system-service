package com.integrador.project.enums;

import java.util.HashMap;
import java.util.Map;

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
public enum StatusEnum {

    ACTIVE("AC"), INACTIVE("IN"), DELETED("DE");

    private final String name;

    private static final Map<String, StatusEnum> map = new HashMap<>();

    static {
        for (StatusEnum type : StatusEnum.values()) {
            map.put(type.name, type);
        }
    }

    StatusEnum(String name) {this.name = name;}

    public String getName() {return name;}

    public static StatusEnum fromString(String name) {return map.get(name);}
}
