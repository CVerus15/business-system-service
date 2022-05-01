package com.integrador.project.service;

import com.integrador.project.bean.UserBean;
import com.integrador.project.enums.StatusEnum;
import com.integrador.project.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Cristian J. Valqui Cabrera
 * @version 01/05/2022
 * <p>
 * Copyright (c) 2022 CValqui, S.A. Todos los derechos reservados.
 * <p>
 * Este software constituye información confidencial y propietaria de CValqui,
 * ("Información Confidencial"). Usted no debe develar dicha Información
 * Confidencial y debe usarla de acuerdo con los términos de aceptación de
 * licencia de uso que firmó con Byte.
 */
@Service
@Transactional
public class UserService {

    protected User toModel(User user, UserBean bean){
        user = new User();
        BeanUtils.copyProperties(bean, user);

        if(user.getState() == null){
            user.setState(StatusEnum.ACTIVE);
        }

        return user;
    }

    protected UserBean toBean(User model) {
        UserBean bean = new UserBean();
        BeanUtils.copyProperties(model, bean);
        // bean.setRol(rolService.toBean(model.getRol);
        return bean;
    }
}
