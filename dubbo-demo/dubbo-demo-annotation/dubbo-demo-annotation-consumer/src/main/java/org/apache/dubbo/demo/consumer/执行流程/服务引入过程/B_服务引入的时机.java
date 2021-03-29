package org.apache.dubbo.demo.consumer.执行流程.服务引入过程;

/**
 * desc:
 *

 服务的引入和服务的暴露一样，也是通过 spring 自定义标签机制解析生成对应的 Bean，
 Provider Service 对应解析的是 ServiceBean 而 Consumer Reference 对应的是 ReferenceBean



 前面服务暴露的时机我们上篇文章分析过了，在 Spring 容器刷新完成之后开始暴露，而服务的引入时机有两种，第一种是饿汉式，第二种是懒汉式。
 饿汉式是通过实现 Spring 的InitializingBean接口中的 afterPropertiesSet 方法，容器通过调用 ReferenceBean 的 afterPropertiesSet 方法时引入服务。
 懒汉式是只有当这个服务被注入到其他类中时启动引入流程，也就是说用到了才会开始服务引入。

 默认情况下，Dubbo 使用懒汉式引入服务，如果需要使用饿汉式，可通过配置 dubbo:reference 的 init 属性开启。
 我们可以看到 ReferenceBean 还实现了FactoryBean接口，这里有个关于 Spring 的面试点我带大家分析一波



 *
 * @author James
 * @since 2021-03-27 17:27
 */
public class B_服务引入的时机 {
}
