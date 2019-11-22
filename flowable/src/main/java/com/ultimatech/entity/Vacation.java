package com.ultimatech.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * @author zhangbbk
 * @date 2019/11/14 9:12
 */
@Data
public class Vacation {
    /**
     * 申请人
     */
    private String applyUser;
    private int days;
    private String reason;
    private String applyStatus;

    /**
     * 审核人
     */
    private String auditor;
    private String result;
}
