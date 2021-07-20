package org.apache.dubbo.demo.consumer.执行流程.服务调用过程;

/**
 * desc:
 *

 oneway、异步、同步。
 oneway还是很常见的，就是当你不关心你的请求是否发送成功的情况下，就用 oneway 的方式发送，这种方式消耗最小，啥都不用记，啥都不用管。
 异步调用，其实 Dubbo 天然就是异步的，可以看到 client 发送请求之后会得到一个 ResponseFuture，然后把 future 包装一下塞到上下文中，这样用户就可以从上下文中拿到这个 future，然后用户可以做了一波操作之后再调用 future.get 等待结果。
 同步调用，这是我们最常用的，也就是 Dubbo 框架帮助我们异步转同步了，从代码可以看到在 Dubbo 源码中就调用了 future.get，所以给用户的感觉就是我调用了这个接口的方法之后就阻塞住了，必须要等待结果到了之后才能返回，所以就是同步的。
 可以看到 Dubbo 本质上就是异步的，为什么有同步就是因为框架帮我们转了一下，而同步和异步的区别其实就是future.get 在用户代码被调用还是在框架代码被调用。




 *
 * @author James
 * @since 2021-03-29 15:18
 */
public class G_调用的三种方式 {
}
