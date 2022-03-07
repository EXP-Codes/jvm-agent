package exp.libs.jvm;

import java.lang.instrument.Instrumentation;

/**
 * <PRE>
 * JVM 实例代理类.
 * </PRE>
 * <br/><B>PROJECT : </B> exp-libs
 * <br/><B>SUPPORT : </B> <a href="https://exp-blog.com" target="_blank">https://exp-blog.com</a>
 * @version   2022-03-07
 * @author    EXP: exp.lqb@foxmail.com
 * @since     JDK 1.8+
 */
public class JVMAgent {
	
	/** JVM 实例代理 */
	private static Instrumentation instrumentation;

	/**
	 * 代理程序入口，在 main 方法执行前执行.
	 * @param agentArgs 代理程序参数（类比于 main 参数）
	 * @param inst JVM 实例代理（由 JVM 自动提供）
	 */
	public static void premain(String agentArgs, Instrumentation inst) {
		instrumentation = inst;
	}
	
	/**
	 * 获取 JVM 代理对象
	 * @return JVM 代理对象
	 */
	public static Instrumentation getInstn() {
		return instrumentation;
	}
	
}