package org.apache.dubbo.demo.consumer.执行流程.dubbo服务暴露过程;

/**
 * desc:
 *

 URL: 一般指统一资源定位符,在网络上一般指代地址,本质就是一串包特殊格式的字符串

 如下图: protocol://username:password@host:port/path?key=value&key=value

 Dubbo 就是采用 URL 的方式来作为约定的参数类型，被称为公共契约，就是我们都通过 URL 来交互，来交流。

             你想一下如果没有一个约束，没有指定一个都公共的契约那么不同的接口就会以不同的参数来传递信息，
             一会儿用 Map、一会儿用特定分隔的字符串，这就是导致整体很乱，并且解析不能统一。

             而用了一个统一的契约之后，那么代码就更加的规范化、形成一种统一的格式，所有人对参数就一目了然，不用去揣测一些参数的格式等等。
             而且用 URL 作为一个公共约束充分的利用了我们对已有概念的印象，通俗易懂并且容易扩展，我们知道 URL 要加参数只管往后面拼接就完事儿了。



 因此 Dubbo 用 URL 作为配置总线，贯穿整个体系，源码中 URL 的身影无处不在


 URL 具体的参数如下：

 protocol：指的是 dubbo 中的各种协议，如：dubbo thrift http
 username/password：用户名/密码
 host/port：主机/端口
 path：接口的名称
 parameters：参数键值对





 *
 * @author James
 * @since 2021-03-27 14:25
 */
public class B_URL和Dubbo的关系 {
}
