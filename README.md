# netty

基于netty-4的一个demo，作为server，可以直接run

源码运行：

启动入口类：jrocky.netty.server.HttpServer
配置文件：netty.conf

打包部署运行：

采用maven编译打包，执行mvn install后会生成zip包：netty-bin.zip，
将zip包发布部署到运行环境，并将zip包解压，执行startup.sh脚本即可