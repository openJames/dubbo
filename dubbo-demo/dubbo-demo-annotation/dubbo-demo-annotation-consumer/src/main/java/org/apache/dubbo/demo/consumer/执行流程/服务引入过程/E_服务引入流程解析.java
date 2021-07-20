package org.apache.dubbo.demo.consumer.执行流程.服务引入过程;

/**
 * desc:
 *

 流程要点:
 先检查配置,通过配置构建一个map,然后利用map来构建URL,
 再通过URL上的协议利用自适应拓展机制调用对一个的 protocol.refer 得到相应的 Invoker

 在有多个URL的时候,先遍历构建出 Invoker 然后再由 StaticDirectory 封装一下,然后通过cluster进行合并,只暴露出一个 Invoker

 然后再构建代理,封装 Invoker 返回服务引用,之后 consumer 调用的就是这个代理类

 默认是懒汉式的，所以服务引入的入口就是 ReferenceBean 的 getObject 方法




 refer(Class, URL):-1, Protocol$Adaptive (org.apache.dubbo.rpc), Protocol$Adaptive.java [2]
 toInvokers(List):344, RegistryDirectory (org.apache.dubbo.registry.integration), RegistryDirectory.java
 refreshInvoker(List):199, RegistryDirectory (org.apache.dubbo.registry.integration), RegistryDirectory.java
 refreshOverrideAndInvoker(List):159, RegistryDirectory (org.apache.dubbo.registry.integration), RegistryDirectory.java
 notify(List):142, RegistryDirectory (org.apache.dubbo.registry.integration), RegistryDirectory.java
 notify(URL, NotifyListener, List):429, AbstractRegistry (org.apache.dubbo.registry.support), AbstractRegistry.java
 doNotify(URL, NotifyListener, List):372, FailbackRegistry (org.apache.dubbo.registry.support), FailbackRegistry.java
 notify(URL, NotifyListener, List):364, FailbackRegistry (org.apache.dubbo.registry.support), FailbackRegistry.java
 doSubscribe(URL, NotifyListener):177, ZookeeperRegistry (org.apache.dubbo.registry.zookeeper), ZookeeperRegistry.java
 subscribe(URL, NotifyListener):299, FailbackRegistry (org.apache.dubbo.registry.support), FailbackRegistry.java
 subscribe(URL, NotifyListener):105, ListenerRegistryWrapper (org.apache.dubbo.registry), ListenerRegistryWrapper.java
 subscribe(URL):104, RegistryDirectory (org.apache.dubbo.registry.integration), RegistryDirectory.java
 doCreateInvoker(DynamicDirectory, Cluster, Registry, Class):502, RegistryProtocol (org.apache.dubbo.registry.integration), RegistryProtocol.java
 getInvoker(Cluster, Registry, Class, URL):58, InterfaceCompatibleRegistryProtocol (org.apache.dubbo.registry.integration), InterfaceCompatibleRegistryProtocol.java
 refreshInterfaceInvoker():329, MigrationInvoker (org.apache.dubbo.registry.client.migration), MigrationInvoker.java
 migrateToServiceDiscoveryInvoker(boolean):113, MigrationInvoker (org.apache.dubbo.registry.client.migration), MigrationInvoker.java
 doMigrate(String):60, MigrationRuleHandler (org.apache.dubbo.registry.client.migration), MigrationRuleHandler.java
 onRefer(RegistryProtocol, ClusterInvoker, URL):103, MigrationRuleListener (org.apache.dubbo.registry.client.migration), MigrationRuleListener.java
 interceptInvoker(ClusterInvoker, URL, URL):475, RegistryProtocol (org.apache.dubbo.registry.integration), RegistryProtocol.java
 doRefer(Cluster, Registry, Class, URL, Map):461, RegistryProtocol (org.apache.dubbo.registry.integration), RegistryProtocol.java
 refer(Class, URL):454, RegistryProtocol (org.apache.dubbo.registry.integration), RegistryProtocol.java
 refer(Class, URL):72, ProtocolListenerWrapper (org.apache.dubbo.rpc.protocol), ProtocolListenerWrapper.java
 refer(Class, URL):81, ProtocolFilterWrapper (org.apache.dubbo.rpc.protocol), ProtocolFilterWrapper.java
 refer(Class, URL):-1, Protocol$Adaptive (org.apache.dubbo.rpc), Protocol$Adaptive.java [1]
 createProxy(Map):374, ReferenceConfig (org.apache.dubbo.config), ReferenceConfig.java
 init():311, ReferenceConfig (org.apache.dubbo.config), ReferenceConfig.java
 get():209, ReferenceConfig (org.apache.dubbo.config), ReferenceConfig.java
 doGetInjectedBean(AnnotationAttributes, Object, String, Class, InjectionMetadata$InjectedElement):146, ReferenceAnnotationBeanPostProcessor (org.apache.dubbo.config.spring.beans.factory.annotation), ReferenceAnnotationBeanPostProcessor.java
 main(String[]):35, Annotation_Consumer_Application (org.apache.dubbo.demo.consumer), Annotation_Consumer_Application.java

 *
 * @author James
 * @since 2021-03-28 8:42
 */
public class E_服务引入流程解析 {
}
