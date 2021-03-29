package org.apache.dubbo.demo.consumer.SPI机制;

/**
 * desc:
 *

 主要类
 {@link org.apache.dubbo.common.extension.ExtensionLoader}

 获取开始:
 {@link org.apache.dubbo.common.extension.ExtensionLoader#getExtension(java.lang.String)}
    去找定义名字的实现类,看缓存有没有,没有就去创建
    {@link org.apache.dubbo.common.extension.ExtensionLoader#createExtension(java.lang.String, boolean)}
        通过这个去得到class: {@link org.apache.dubbo.common.extension.ExtensionLoader#getExtensionClasses()}
                1.去缓存找  2.没有就扫描是三个约定的目录  3.分类记录 Adaptive /Wrapper 和 普通类
        反射创建:
        注入: {@link org.apache.dubbo.common.extension.ExtensionLoader#injectExtension(java.lang.Object)}
        如果有包装类再包装一下








 *
 * @author James
 * @since 2021-03-27 10:07
 */
public class A_SPI流程 {
}
