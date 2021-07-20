package org.apache.dubbo.demo.consumer.执行流程.服务调用过程;

/**
 * desc:
 *

 总结式调用:

 首先客户端调用接口的某个方法,实际调用的是代理类
 代理类会通过 cluster 从 directory 中获取一堆 invokers(如果有一堆的话)，
 然后进行 router 的过滤（其中看配置也会添加 mockInvoker 用于服务降级），
 然后再通过 SPI 得到 loadBalance 进行一波负载均衡

 这里要强调一下默认的 cluster 是 FailoverCluster ，会进行容错重试处理


 现在我们已经得到要调用的远程服务对应的 invoker 了，此时根据具体的协议构造请求头，
 然后将参数根据具体的序列化协议序列化之后构造塞入请求体中，再通过 NettyClient 发起远程调用


 服务端 NettyServer 收到请求之后，根据协议得到信息并且反序列化成对象，再按照派发策略派发消息，默认是 All，扔给业务线程池。
 业务线程会根据消息类型判断然后得到 serviceKey 从之前服务暴露生成的 exporterMap 中得到对应的 Invoker ，然后调用真实的实现类。
 最终将结果返回，因为请求和响应都有一个统一的 ID， 客户端根据响应的 ID 找到存储起来的 Future， 然后塞入响应再唤醒等待 future 的线程，完成一次远程调用全过程



 *
 * @author James
 * @since 2021-03-29 15:05
 */
public class A_调用的大致流程 {
}
