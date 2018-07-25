/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: Main
 * Author:   陈方正
 * Date:     2018/7/12 10:47
 * Description: 运行类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wisely.highlight_spring4.ch2.scope;

import com.wisely.highlight_spring4.ch1.javaConfig.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈运行类〉
 *
 * @author 陈方正
 * @create 2018/7/12
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoPrototypeService prototype_1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototype_2 = context.getBean(DemoPrototypeService.class);
        DemoSingletonService single_1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService single_2 = context.getBean(DemoSingletonService.class);

        System.out.println(prototype_1.equals(prototype_2));
        System.out.println(single_1.equals(single_2));
    }
}
