package org.apache.dubbo.demo.consumer.执行流程.服务引入过程;

/**
 * desc:
 *

 我们已经知道 provider 将自己的服务暴露出来,注册到注册中心,而 consumer无非就是通过一波操作
 从注册中心得知 Provider 信息,然后封装一个调用类和Provider进入深入地交流

 Invoker + 代理
 而之前的文章我都已经提到在 Dubbo 中一个可执行体就是 Invoker，所有调用都要向 Invoker 靠拢，
 因此可以推断出应该要先生成一个 Invoker，然后又因为框架需要往不侵入业务代码的方向发展，
 那我们的 Consumer 需要无感知的调用远程接口，因此需要搞个代理类，包装一下屏蔽底层的细节



 ReferenceConfig: {@link org.apache.dubbo.config.ReferenceConfig#get()}
 ->

 Protocol
 ->

 Invoker
 ->

 ProxyFactory
 ->


 代理实现




 引入前准备:
 get():205, ReferenceConfig (org.apache.dubbo.config), ReferenceConfig.java
 doGetInjectedBean(AnnotationAttributes, Object, String, Class, InjectionMetadata$InjectedElement):146, ReferenceAnnotationBeanPostProcessor (org.apache.dubbo.config.spring.beans.factory.annotation), ReferenceAnnotationBeanPostProcessor.java
 main(String[]):35, Annotation_Consumer_Application (org.apache.dubbo.demo.consumer), Annotation_Consumer_Application.java


 *
 * @author James
 * @since 2021-03-27 17:19
 */
public class A_服务引用大致流程 {
}
