package org.apache.dubbo.demo.consumer.执行流程.dubbo服务暴露过程;

import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.config.spring.context.DubboBootstrapApplicationListener;

/**
 * desc:
 *

 代码的流程(本文默认都需要暴露服务到注册中心)

         第一步:检测配置,如果有些配置为空会默认创建,并且组装成URL
         第二步:暴露服务,包括暴露到本地的服务和远程的服务
         第三步是注册服务至注册中心

 从对象构建转换的角度(参考图片)
         第一步是将服务实现类转成Invoker
         第二部是将Invoker通过具体的协议转换成Exporter


        export:187, ServiceConfig (org.apache.dubbo.config)  {@link ServiceConfig#export()}
        lambda$exportServices$14:1092, DubboBootstrap (org.apache.dubbo.config.bootstrap)  {@link DubboBootstrap#exportServices()}
        exportServices:1079, DubboBootstrap (org.apache.dubbo.config.bootstrap)  {@link DubboBootstrap#exportServices()}
        start:893, DubboBootstrap (org.apache.dubbo.config.bootstrap)  {@link DubboBootstrap#start()}
        onContextRefreshedEvent:62, DubboBootstrapApplicationListener (org.apache.dubbo.config.spring.context)  {@link DubboBootstrapApplicationListener#onContextRefreshedEvent(org.springframework.context.event.ContextRefreshedEvent)}
        onApplicationContextEvent:55, DubboBootstrapApplicationListener (org.apache.dubbo.config.spring.context)  {@link DubboBootstrapApplicationListener#onApplicationContextEvent(org.springframework.context.event.ApplicationContextEvent)}
        main:30, Annotation_Provider_Application (org.apache.dubbo.demo.provider) {@link org.apache.dubbo.demo.provider.Annotation_Provider_Application}


 服务暴露的准备:

 服务暴露的起点:
 {@link org.apache.dubbo.config.ServiceConfig#export()}
 获取配置
 如果不允许暴露直接返回
 如果需要延迟暴露,则延迟暴露
 直接暴露
        {@link org.apache.dubbo.config.ServiceConfig#doExport()}
        {@link org.apache.dubbo.config.ServiceConfig#doExportUrls()}
                :{@link org.apache.dubbo.config.ServiceConfig#doExportUrlsFor1Protocol(org.apache.dubbo.config.ProtocolConfig, java.util.List)}
                 根据配置往map里面塞值,然后构建URL
                 然后就是根据URL来进行服务暴露

                        本地暴露: {@link org.apache.dubbo.config.ServiceConfig#exportLocal(org.apache.dubbo.common.URL)}
                            走的是 injvm 协议,可以看到搞了个新的URL修改协议
                             Protocol 的 export 方法是标注了 @ Adaptive 注解的，因此会生成代理类，然后代理类会根据 Invoker 里面的 URL 参数得知具体的协议，
                             然后通过 Dubbo SPI 机制选择对应的实现类进行 export，而这个方法就会调用 InjvmProtocol#export 方法
                              (至于 dubbo 为什么用 javassist 而不用 jdk 动态代理是因为 javassist 快)

                        远程暴露:
                             {@link org.apache.dubbo.rpc.protocol.ProtocolFilterWrapper#export(org.apache.dubbo.rpc.Invoker)}
                             {@link org.apache.dubbo.rpc.protocol.ProtocolListenerWrapper#export(org.apache.dubbo.rpc.Invoker)}
                             {@link org.apache.dubbo.registry.integration.RegistryProtocol#export(org.apache.dubbo.rpc.Invoker)}
                             {@link org.apache.dubbo.registry.integration.RegistryProtocol#doLocalExport(org.apache.dubbo.rpc.Invoker, org.apache.dubbo.common.URL)}

        {@link org.apache.dubbo.config.utils.ConfigValidationUtils#loadRegistries(org.apache.dubbo.config.AbstractInterfaceConfig, boolean)}
         可以看到 Dubbo 支持多注册中心，并且支持多个协议，一个服务如果有多个协议那么就都需要暴露，
         比如同时支持 dubbo 协议和 hessian 协议，
         那么需要将这个服务用两种协议分别向多个注册中心（如果有多个的话）暴露注册。

         loadRegistries 方法我就不做分析了，就是根据配置组装成注册中心相关的 URL ，我就给大家看下拼接成的 URL的样子
         registry://127.0.0.1:2181/com.alibaba.dubbo.registry.RegistryService?application=demo-provider&dubbo=2.0.2&pid=7960&qos.port=22222&registry=zookeeper&timestamp=1598624821286
         registry://127.0.0.1:2181/org.apache.dubbo.registry.RegistryService?application=dubbo-demo-annotation-provider&dubbo=2.0.2&id=registryConfig&pid=8404&registry=zookeeper&timestamp=1626848701040



 本地暴露和远程暴露之间区别?
 本地暴露参考远程暴露,远程暴露是把调用的方式注册到zookeeper上


 *
 *
 *
 * @author James
 * @since 2021-03-27 14:30
 */
public class D_服务暴露全流程 {
}
