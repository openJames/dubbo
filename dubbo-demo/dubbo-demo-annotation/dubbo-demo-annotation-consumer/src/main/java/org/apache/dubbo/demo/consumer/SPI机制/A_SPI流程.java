package org.apache.dubbo.demo.consumer.SPI机制;

import org.apache.dubbo.config.AbstractConfig;

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





 通过栈获取调用的开始:
spring的内容不放出来


 {@link org.apache.dubbo.demo.provider.Annotation_Provider_Application.ProviderConfiguration#registryConfig()}
        获取一个配置对象,这个对象的父类先初始化,就是下面这个类
 {@link AbstractConfig#addIntoConfigManager()}

 加载的配置:
 C:\var\mySource\dubbo\dubbo-config\dubbo-config-api\src\main\resources\META-INF\dubbo\internal









 SPI 全称为 Service Provider Interface，是一种服务发现机制。SPI 的本质是将接口实现类的全限定名配置在文件中，
 并由服务加载器读取配置文件，加载实现类。这样可以在运行时，动态为接口替换实现类。
 正因此特性，我们可以很容易的通过 SPI 机制为我们的程序提供拓展功能。

 SPI 机制在第三方框架中也有所应用，比如 Dubbo 就是通过 SPI 机制加载所有的组件。
 不过，Dubbo 并未使用 Java 原生的 SPI 机制，而是对其进行了增强，使其能够更好的满足需求。
 在 Dubbo 中，SPI 是一个非常重要的模块。基于 SPI，我们可以很容易的对 Dubbo 进行拓展


 Dubbo 并未使用 Java SPI，而是重新实现了一套功能更强的 SPI 机制。Dubbo SPI 的相关逻辑被封装在了 ExtensionLoader 类中，
 通过 ExtensionLoader，我们可以加载指定的实现类


 *
 * @author James
 * @since 2021-03-27 10:07
 */
public class A_SPI流程 {
}
