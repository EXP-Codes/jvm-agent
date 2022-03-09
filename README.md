# jvm-agent

> JVM 实例代理

------

## 简介 

`-javaagent` 是 java 命令的一个参数。参数 `-javaagent` 可以用于指定一个 jar 包，并且对该 java 包有 2 个要求：

- 这个 jar 包的 `MANIFEST.MF` 文件必须指定 `Premain-Class` 项。
- `Premain-Class` 指定的那个类必须实现 `premain()` 方法。

`premain()` 方法，从字面上理解，就是运行在 `main()` 函数之前的的类。

当 Java 虚拟机启动时，在执行 `main()` 函数之前，JVM 会先运行 `-javaagent` 所指定 jar 包内 `Premain-Class` 这个类的 `premain()` 方法 。

该包提供了一些工具帮助开发人员在 Java 程序运行时，动态修改系统中的 Class 类型。


> 参考文章：《[JavaAgent 使用指南](https://www.cnblogs.com/rickiyang/p/11368932.html)》


## 使用方式

maven 的 `settings.yml` 配置 sonatype 中央仓库：

```xml
<mirror>
    <id>mvnrepository</id>
    <mirrorOf>mvnrepository</mirrorOf>
    <url>http://mvnrepository.com/</url>
</mirror>

<mirror>
    <id>sonatype</id>
    <mirrorOf>sonatype</mirrorOf>
    <url>https://s01.oss.sonatype.org/</url>
</mirror>
```

项目的 `pom.xml` 配置构件坐标：

```xml
<dependency>
    <groupId>com.exp-blog</groupId>
    <artifactId>jvm-agent</artifactId>
    <version>1.0.0</version>
</dependency>
```
