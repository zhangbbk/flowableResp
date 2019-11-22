package com.ultimatech.entity;

import lombok.Data;

/**
 * @author zhangbbk
 * @date 2019/11/14 9:17
 */
@Data
public class VacTask {
    private String id;
    private String name;
    private Vacation vac;
}
