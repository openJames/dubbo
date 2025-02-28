package org.apache.dubbo.demo.consumer.执行流程.服务引入过程;

/**
 * desc:
 *

 本地 + 远程(直接+中心):
 服务的引入又分为了三种，
 第一种是本地引入、
 第二种是直接连接引入远程服务、
 第三种是通过注册中心引入远程服务


 本地引入不知道大家是否还有印象，之前服务暴露的流程每个服务都会通过搞一个本地暴露，走 injvm 协议（当然你要是 scope = remote 就没本地引用了），
 因为存在一个服务端既是 Provider 又是 Consumer 的情况，然后有可能自己会调用自己的服务，
 因此就弄了一个本地引入，这样就避免了远程网络调用的开销。
 所以服务引入会先去本地缓存找找看有没有本地服务


 直连远程引入服务，这个其实就是平日测试的情况下用用，不需要启动注册中心，由 Consumer 直接配置写死 Provider 的地址，然后直连即可


 注册中心引入远程服务，这个就是重点了，Consumer 通过注册中心得知 Provider 的相关信息，然后进行服务的引入，这
 里还包括多注册中心，同一个服务多个提供者的情况，
 如何抉择如何封装，如何进行负载均衡、容错并且让使用者无感知，这就是个技术活


 *
 * @author James
 * @since 2021-03-27 17:28
 */
public class D_服务引入的三种方式 {
}
