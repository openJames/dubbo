package org.apache.dubbo.demo.consumer.SPI机制;

/**
 * desc:
 *

 {@link org.apache.dubbo.common.extension.Adaptive}


 目的: 不想在启动的时候拓展被加载,而是我们根据请求的时候的参数来动态选择对应的拓展


  实现: (代理类 -> 实例 -> SPI类加载 ->获取真正的实例调用)

 通过一个代理机制实现自适应扩展
 简单来说就是为你想扩展的接口生成一个代理类,可以通过JDK或者javassist编译你生成的代理类代码,然后通过反射创建实例

 这个实例里面的实现会根据本来方法的请求参数得知需要的扩展类，
 然后通过 ExtensionLoader.getExtensionLoader(type.class).getExtension(从参数得来的name)，来获取真正的实例来调用


 注解的使用:
 1.可以使用在类上,可以使用在方法上
 2.在修饰类的时候不会生成代理类,因为这个类就是代理类; 修饰在方法上的时候会生成代理类

 举例:

 注解在类上:
         下面接口有三个实现类
         {@link org.apache.dubbo.common.extension.ExtensionFactory}

         在 ExtensionLoader 构造的时候就会去通过getAdaptiveExtension 获取指定的扩展类的 ExtensionFactory
         {@link org.apache.dubbo.common.extension.ExtensionLoader#ExtensionLoader(java.lang.Class)}
                看看getAdaptiveExtension: 有则返回没有则创建(字节码动态创建)
                {@link org.apache.dubbo.common.extension.ExtensionLoader#getAdaptiveExtension()}


         AdaptiveExtensionFactory 的实现
         {@link org.apache.dubbo.common.extension.factory.AdaptiveExtensionFactory}
         先缓存了所有实现类，然后在获取的时候通过遍历找到对应的 Extension

 注解在方法上:
 注解在方法上则需要动态拼接代码,然后动态生成类
 举例: Protocol
 走这个逻辑: {@link org.apache.dubbo.common.extension.ExtensionLoader#createAdaptiveExtensionClass()}

 *
 * @author James
 * @since 2021-03-27 11:27
 */
public class B_自适应拓展 {
}
