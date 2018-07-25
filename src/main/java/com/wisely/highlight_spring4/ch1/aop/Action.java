/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Action
 * Author:   陈方正
 * Date:     2018/7/12 11:35
 * Description: 拦截规则
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈拦截规则〉
 *
 * @author 陈方正
 * @create 2018/7/12
 * @since 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
