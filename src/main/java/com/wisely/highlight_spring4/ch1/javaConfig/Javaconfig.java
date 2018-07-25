/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: Diconfig
 * Author:   陈方正
 * Date:     2018/7/12 10:40
 * Description: 配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wisely.highlight_spring4.ch1.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈配置类〉
 *
 * @author 陈方正
 * @create 2018/7/12
 * @since 1.0.0
 */
@Configuration
public class Javaconfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

}
