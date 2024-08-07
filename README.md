1. 设置主类：`org.apache.catalina.startup.Bootstrap`
2. 设置VM参数

   ```properties
   -Dcatalina.home=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home
   -Dcatalina.base=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home
   -Djava.io.tmpdir=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home/temp
   -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager
   -Djava.util.logging.config.file=/Users/stevenobelia/Documents/project_idea_test/tomcat-analysis/apache-tomcat-8.5.35-src/home/conf/logging.properties
   ```
3. 特殊处理目录

   > 如果没有examples目录的话，忽略这一步即可。
   <br>如果需要将examples目录也生效，则需要将`examples/WEB-INF/classess`标记为source code，近而参与编译。不然会报ClassNotFoundException异常。

   ![](./.asserts/examples-exception-01.png)

4. 制作 servlet-demo01.war

   1. 添加tomcat类库依赖，以至于编译当前`servlet-demo01`不至于报错，选择`Modules`->`servlet-demo01`->`Dependencies +`->`2 Library`->`Application Server Libraries`->`选择一个tomcat`
   2. 制作 artifacts，别且设置输出路径到源码下/home/webapps(直接一步到位，省去复制的步骤)
      
      ![](./.asserts/artifact-01.png)
   
   3. idea主菜单`Build -> Build Artifacts -> Build` 执行后可以看到`apache-tomcat-8.5.35-src/home/webapps/servlet-demo01.war`.


> [!CAUTION] 
<br>源代码中修改过 `org.apache.catalina.startup.ContextConfig.configureStart`，
<br>添加了一句 `context.addServletContainerInitializer(new JasperInitializer() ,null);`