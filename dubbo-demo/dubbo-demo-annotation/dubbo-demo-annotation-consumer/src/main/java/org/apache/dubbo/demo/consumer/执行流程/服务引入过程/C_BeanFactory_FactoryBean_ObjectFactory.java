package org.apache.dubbo.demo.consumer.执行流程.服务引入过程;

/**
 * desc:
 *

 总结的说
 BeanFactory 就是 IOC 容器，
 FactoryBean 是特殊的 Bean, 用来封装创建比较复杂的对象，
 ObjectFactory 主要用于延迟查找的场景，延迟实例化对象


 就是这三个玩意，我单独拿出来说一下，从字面上来看其实可以得知 BeanFactory、ObjectFactory 是个工厂而FactoryBean是个 Bean。
 BeanFactory 其实就是 IOC 容器，有多种实现类我就不分析了，简单的说就是 Spring 里面的 Bean 都归它管，
 而FactoryBean也是 Bean 所以说也是归 BeanFactory 管理的。

 那 FactoryBean 到底是个什么 Bean 呢？它其实就是把你真实想要的 Bean 封装了一层，
 在真正要获取这个 Bean 的时候容器会调用 FactoryBean#getObject() 方法，而在这个方法里面你可以进行一些复杂的组装操作。
 这个方法就封装了真实想要的对象复杂的创建过程
 到这里其实就很清楚了，就是在真实想要的 Bean 创建比较复杂的情况下，
 或者是一些第三方 Bean 难以修改的情形，使用 FactoryBean 封装了一层，屏蔽了底层创建的细节，便于 Bean 的使用

 而 ObjectFactory 这个是用于延迟查找的场景，它就是一个普通工厂，当得到 ObjectFactory 对象时，
 相当于 Bean 没有被创建，只有当 getObject() 方法时，才会触发 Bean 实例化等生命周期。
 主要用于暂时性地获取某个 Bean Holder 对象，如果过早的加载，可能会引起一些意外的情况，
 比如当  Bean A 依赖 Bean B 时，如果过早地初始化 A，那么 B 里面的状态可能是中间状态，这时候使用 A 容易导致一些错误





 *
 * @author James
 * @since 2021-03-28 8:31
 */
public class C_BeanFactory_FactoryBean_ObjectFactory {
}
