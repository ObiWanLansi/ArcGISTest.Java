#!/bin/bash

#java -cp . -jar ./lib/lansiinformationcenter.jar lansi.lic.application.LansiInformationCenter

#java.exe -Djava.ext.dirs=.\lib; -jar .\lib\lansiinformationcenter.jar %*

#java -classpath ./lib/fluent-hc-4.5.2.jar:./lib/httpclient-4.5.2.jar -jar ./lib/lansiinformationcenter.jar &&


#java -cp ./lib/commons-logging-1.2.jar:./lib/fluent-hc-4.5.2.jar:./lib/httpclient-4.5.2.jar:./lib/httpcore-4.4.4.jar  -jar ./lib/lansiinformationcenter.jar &

export JDK_HOME=""
export JAVAS_HOME=""
export PATH="/opt/jdk8/bin:/opt/jdk8/jre/bin:$PATH"
java -Djava.ext.dirs=./lib -jar ./lib/lansiinformationcenter.jar &
