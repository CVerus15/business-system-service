package com.integrador.project.converter;

import com.integrador.project.enums.StatusEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;

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
@Converter
public class StatusConverter implements AttributeConverter<StatusEnum, String> {

    @Override
    public String convertToDatabaseColumn(StatusEnum value) {
        if (Objects.isNull(value)) return null;
        return value.getName();
    }

    @Override
    public StatusEnum convertToEntityAttribute(String value) {
        return StatusEnum.fromString(value);
    }
}
