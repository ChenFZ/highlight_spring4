/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: AopConfig
 * Author:   陈方正
 * Date:     2018/7/12 14:15
 * Description: 配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * 〈一句话功能简述〉<br> 
 * 〈配置类〉
 *
 * @author 陈方正
 * @create 2018/7/12
 * @since 1.0.0
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy
/*使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持。*/
public class AopConfig {
}
