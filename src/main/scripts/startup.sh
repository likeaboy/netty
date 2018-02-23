#!/bin/sh
nohup java -Xms2048m -Xmx2048m -XX:+PrintGCDateStamps -XX:+PrintGCDetails -Xloggc:gc/gc.log -jar netty.jar > /dev/null 2>&1 &