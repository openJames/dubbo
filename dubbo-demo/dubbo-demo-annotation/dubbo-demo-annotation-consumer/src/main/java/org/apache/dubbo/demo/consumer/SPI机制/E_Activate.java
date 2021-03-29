package org.apache.dubbo.demo.consumer.SPI机制;

/**
 * desc:
 *

 Filter : {@link org.apache.dubbo.rpc.Filter}

 Filter 有很多实现类,在有些场景下需要其中的几个实现类,而在某些场景需要另外几个
 而 Active 注解就是标记这个用


 它有三个属性，group 表示修饰在哪个端，是 provider 还是 consumer，value 表示在 URL参数中出现才会被激活，order 表示实现类的顺序



 *
 * @author James
 * @since 2021-03-27 12:13
 */
public class E_Activate {
}
