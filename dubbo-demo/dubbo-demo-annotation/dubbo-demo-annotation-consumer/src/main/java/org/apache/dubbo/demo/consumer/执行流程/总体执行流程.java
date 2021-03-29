package org.apache.dubbo.demo.consumer.执行流程;

/**
 * desc:
 *

 启动客户端:

 注册对象定义(实现这两个接口的方法: ImportBeanDefinitionRegistrar, ApplicationContextAware):
 {@link org.apache.dubbo.config.spring.context.annotation.DubboConfigConfigurationRegistrar#registerBeanDefinitions(org.springframework.core.type.AnnotationMetadata, org.springframework.beans.factory.support.BeanDefinitionRegistry)}

 注册共同对象:
 {@link org.apache.dubbo.config.spring.util.DubboBeanUtils#registerCommonBeans(org.springframework.beans.factory.support.BeanDefinitionRegistry)}

 注入对象:
 {@link com.alibaba.spring.util.BeanRegistrar#registerInfrastructureBean(org.springframework.beans.factory.support.BeanDefinitionRegistry, java.lang.String, java.lang.Class)}


 行动注册对象:
 {@link org.apache.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor#doGetInjectedBean(org.springframework.core.annotation.AnnotationAttributes, java.lang.Object, java.lang.String, java.lang.Class, org.springframework.beans.factory.annotation.InjectionMetadata.InjectedElement)}


 获取代理对象:
 {@link org.apache.dubbo.config.ReferenceConfig#get()}




 监控 Monitor: {@link org.apache.dubbo.monitor.support.MonitorFilter#invoke(org.apache.dubbo.rpc.Invoker, org.apache.dubbo.rpc.Invocation)}
 协议 Protocol:
 {@link org.apache.dubbo.rpc.protocol.dubbo.DubboInvoker#doInvoke(org.apache.dubbo.rpc.Invocation)}
 provider 暴露服务: {@link org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol#export(org.apache.dubbo.rpc.Invoker)}



 *
 * @author James
 * @since 2021-03-25 9:31
 */
public class 总体执行流程 {
}
