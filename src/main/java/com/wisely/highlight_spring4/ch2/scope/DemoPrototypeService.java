/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: DemoPrototypeService
 * Author:   陈方正
 * Date:     2018/7/12 14:50
 * Description: 多例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈多例〉
 *
 * @author 陈方正
 * @create 2018/7/12
 * @since 1.0.0
 */
@Service
@Scope("prototype")
/*声明*/
public class DemoPrototypeService {

}
