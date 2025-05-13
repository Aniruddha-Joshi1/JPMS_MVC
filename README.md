# JPMS and Spring Example
Basic MVC app using spring boot and modules to see how modules work.

## To Run the app -

```bash
mvn clean install
```
```bash
cd web
```
```bash
java --add-modules java.instrument --module-path=target/modules --module example.web/com.example.web.ExampleApp
```

Please don't run the app using IntelliJ's default run button at top right. Need to do some configurations to run via that button. This is the error -


java.lang.IllegalStateException: Cannot load configuration class: com.example.web.ExampleApp
	at spring.context@5.1.4.RELEASE/org.springframework.context.annotation.ConfigurationClassPostProcessor.enhanceConfigurationClasses(ConfigurationClassPostProcessor.java:413) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.context@5.1.4.RELEASE/org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanFactory(ConfigurationClassPostProcessor.java:253) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.context@5.1.4.RELEASE/org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:286) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.context@5.1.4.RELEASE/org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:130) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.context@5.1.4.RELEASE/org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:691) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.context@5.1.4.RELEASE/org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:528) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.boot@2.1.2.RELEASE/org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:142) ~[spring-boot-2.1.2.RELEASE.jar:na]
	at spring.boot@2.1.2.RELEASE/org.springframework.boot.SpringApplication.refresh(SpringApplication.java:775) ~[spring-boot-2.1.2.RELEASE.jar:na]
	at spring.boot@2.1.2.RELEASE/org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.1.2.RELEASE.jar:na]
	at spring.boot@2.1.2.RELEASE/org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-2.1.2.RELEASE.jar:na]
	at spring.boot@2.1.2.RELEASE/org.springframework.boot.SpringApplication.run(SpringApplication.java:1260) ~[spring-boot-2.1.2.RELEASE.jar:na]
	at spring.boot@2.1.2.RELEASE/org.springframework.boot.SpringApplication.run(SpringApplication.java:1248) ~[spring-boot-2.1.2.RELEASE.jar:na]
	at example.web/com.example.web.ExampleApp.main(ExampleApp.java:13) ~[classes/:na]
Caused by: org.springframework.cglib.core.CodeGenerationException: java.lang.IllegalAccessException-->module example.web does not open com.example.web to unnamed module @117e949d
	at org.springframework.cglib.core.ReflectUtils.defineClass(ReflectUtils.java:503) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.core.AbstractClassGenerator.generate(AbstractClassGenerator.java:363) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.proxy.Enhancer.generate(Enhancer.java:582) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.core.AbstractClassGenerator$ClassLoaderData$3.apply(AbstractClassGenerator.java:110) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.core.AbstractClassGenerator$ClassLoaderData$3.apply(AbstractClassGenerator.java:108) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.core.internal.LoadingCache$2.call(LoadingCache.java:54) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) ~[na:na]
	at org.springframework.cglib.core.internal.LoadingCache.createEntry(LoadingCache.java:61) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.core.internal.LoadingCache.get(LoadingCache.java:34) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.core.AbstractClassGenerator$ClassLoaderData.get(AbstractClassGenerator.java:134) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.core.AbstractClassGenerator.create(AbstractClassGenerator.java:319) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.proxy.Enhancer.createHelper(Enhancer.java:569) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at org.springframework.cglib.proxy.Enhancer.createClass(Enhancer.java:416) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	at spring.context@5.1.4.RELEASE/org.springframework.context.annotation.ConfigurationClassEnhancer.createClass(ConfigurationClassEnhancer.java:137) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.context@5.1.4.RELEASE/org.springframework.context.annotation.ConfigurationClassEnhancer.enhance(ConfigurationClassEnhancer.java:109) ~[spring-context-5.1.4.RELEASE.jar:na]
	at spring.context@5.1.4.RELEASE/org.springframework.context.annotation.ConfigurationClassPostProcessor.enhanceConfigurationClasses(ConfigurationClassPostProcessor.java:402) ~[spring-context-5.1.4.RELEASE.jar:na]
	... 12 common frames omitted
Caused by: java.lang.IllegalAccessException: module example.web does not open com.example.web to unnamed module @117e949d
	at java.base/java.lang.invoke.MethodHandles.privateLookupIn(MethodHandles.java:202) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
	at org.springframework.cglib.core.ReflectUtils.defineClass(ReflectUtils.java:497) ~[spring-core-5.1.4.RELEASE.jar:5.1.4.RELEASE]
	... 27 common frames omitted
