# jvm-agent

> JVM 实例代理

------

## 使用方式

maven 的 `settings.yml` 配置 sonatype 中央仓库：

```xml
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
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```
