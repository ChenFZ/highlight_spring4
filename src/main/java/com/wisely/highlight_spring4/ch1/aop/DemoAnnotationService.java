/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: DemoAnnotationServeice
 * Author:   陈方正
 * Date:     2018/7/12 13:29
 * Description: 被拦截类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈被拦截类〉
 *
 * @author 陈方正
 * @create 2018/7/12
 * @since 1.0.0
        */
@Service
public class DemoAnnotationService {
    /*使用注解的被拦截类*/
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
