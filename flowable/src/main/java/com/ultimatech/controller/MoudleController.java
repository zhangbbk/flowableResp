package com.ultimatech.controller;

import org.flowable.idm.api.User;
import org.flowable.idm.engine.impl.persistence.entity.UserEntityImpl;
import org.flowable.ui.common.model.UserRepresentation;
import org.flowable.ui.common.security.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangbbk
 * @date 2019/11/14 11:38
 */
@RestController
@RequestMapping("/getMoudle")
public class MoudleController {

    @RequestMapping(value = "/rest/account", method = RequestMethod.GET, produces = "application/json")
    public UserRepresentation getAccount() {
        User user=new UserEntityImpl();
        user.setId("zhangbbk");
        SecurityUtils.assumeUser(user);
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setId("zhangbbk");
        userRepresentation.setFirstName("zhangbbk");
        List<String> privileges=new ArrayList<>();
        privileges.add("flowable-idm");
        privileges.add("flowable-modeler");
        privileges.add("flowable-task");
        userRepresentation.setPrivileges(privileges);
        return  userRepresentation;

    }


}
