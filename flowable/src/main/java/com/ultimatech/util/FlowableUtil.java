package com.ultimatech.util;

import org.flowable.variable.api.history.HistoricVariableInstance;

import java.lang.reflect.Field;
import java.util.List;


/**
 * Flowable中使用得到的工具方法
 * @author zhangbbk
 */
public class FlowableUtil {

    /**
     * 将历史参数列表设置到实体中去
     * @param entity 实体
     * @param varInstanceList 历史参数列表
     */
    public static <T> void setVars(T entity, List<HistoricVariableInstance> varInstanceList) {
        Class<?> tClass = entity.getClass();
        try {
            for (HistoricVariableInstance varInstance : varInstanceList) {
                Field field = tClass.getDeclaredField(varInstance.getVariableName());
                if (field == null) {
                    continue;
                }
                field.setAccessible(true);
                field.set(entity, varInstance.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
