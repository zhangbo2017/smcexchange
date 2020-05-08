package com.smc.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Enumeration;

public class FullStackBeanUtils {

    public static <T> T request2Bean(HttpServletRequest request, Class<T> bean) {
        T t = null;
        try {
            t = bean.newInstance();
            Enumeration parameterNames = request.getParameterNames();
            while (parameterNames.hasMoreElements()) {
                String name = (String) parameterNames.nextElement();
                String value = request.getParameter(name);

                BeanUtils.setProperty(t, name, value);
            }
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        return t;

    }
}
