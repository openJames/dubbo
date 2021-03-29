package org.apache.dubbo.demo.consumer.SPI机制;

/**
 * desc:
 *

 为什么有包装类,共同逻辑提取

 包装类是因为一个拓展接口可能有多个拓展实现类,而这些拓展实现类会有一个相同或者公共的逻辑
 如果每个实现类都写一遍代码就重复了,并且比较不好维护
 因此搞了个包装类
 Dubbo 里帮你自动包装，
 只需要某个扩展类的构造函数只有一个参数，并且是扩展接口类型，就会被判定为包装类，
 然后记录下来，用来包装别的实现类

 判断方法: {@link org.apache.dubbo.common.extension.ExtensionLoader#isWrapperClass(java.lang.Class)}



 *
 * @author James
 * @since 2021-03-27 12:07
 */
public class C_保证类_AOP {
}
