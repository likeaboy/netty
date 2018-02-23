#!/bin/bash

NETTY=/app/netty
INSTALL_NETTY=netty-bin.zip
ES_SEARCH_SERVICE=es-search
ES_SEARCH_SERVICE_HOME=$NETTY/$ES_SEARCH_SERVICE

cd $ES_SEARCH_SERVICE_HOME && sh startup.sh
echo "start $ES_SEARCH_SERVICE"
