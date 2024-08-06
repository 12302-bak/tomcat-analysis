1. 设置主类：`org.apache.catalina.startup.Bootstrap`
2. 设置VM参数

   ```properties
   -Dcatalina.home=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home
   -Dcatalina.base=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home
   -Djava.io.tmpdir=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home/temp
   -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager
   -Djava.util.logging.config.file=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home/conf/logging.properties
   ```

3. 制作 servlet-demo-01.war


> [!CAUTION] 源代码中修改过 `org.apache.catalina.startup.ContextConfig.configureStart`，添加了一句 `context.addServletContainerInitializer(new JasperInitializer() ,null);`