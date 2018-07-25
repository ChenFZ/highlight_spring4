/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: UseFunctionService
 * Author:   陈方正
 * Date:     2018/7/12 10:37
 * Description: 使用功能类的bean
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈使用功能类的bean〉
 *
 * @author 陈方正
 * @create 2018/7/12
 * @since 1.0.0
 */
@Service
public class UseFunctionService {

    @Autowired
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
