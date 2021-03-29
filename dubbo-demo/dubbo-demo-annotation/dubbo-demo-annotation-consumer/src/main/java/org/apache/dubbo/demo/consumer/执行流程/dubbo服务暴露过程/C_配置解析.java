package org.apache.dubbo.demo.consumer.执行流程.dubbo服务暴露过程;

/**
 * desc:
 *

 一般常用 XML 或者注解来进行 Dubbo 的配置，我稍微说一下 XML 的，这块其实是属于 Spring 的内容，
 我不做过多的分析，就稍微讲一下大概的原理。
 Dubbo 利用了 Spring 配置文件扩展了自定义的解析，
 像 dubbo.xsd 就是用来约束 XML 配置时候的标签和对应的属性用的，
 然后 Spring 在解析到自定义的标签的时候会查找 spring.schemas 和 spring.handlers



 spring.schemas 就是指明了约束文件的路径，而 spring.handlers 指明了利用该 handler 来解析标签，
 你看好的框架都是会预留扩展点的，讲白了就是去固定路径的固定文件名去找你扩展的东西，
 这样才能让用户灵活的使用。
 我们再来看一下 DubboNamespaceHandler 都干了啥
 {@link org.apache.dubbo.config.spring.schema.DubboNamespaceHandler}

 讲白了就是将标签对应的解析类关联起来，这样在解析到标签的时候就知道委托给对应的解析类解析，
 本质就是为了生成 Spring 的 BeanDefinition，然后利用 Spring 最终创建对应的对象






 *
 * @author James
 * @since 2021-03-27 14:28
 */
public class C_配置解析 {
}
