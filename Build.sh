#!/bin/bash

#java -cp . -jar ./lib/lansiinformationcenter.jar lansi.lic.application.LansiInformationCenter

#java.exe -Djava.ext.dirs=.\lib; -jar .\lib\lansiinformationcenter.jar %*

#java -classpath ./lib/fluent-hc-4.5.2.jar:./lib/httpclient-4.5.2.jar -jar ./lib/lansiinformationcenter.jar &&


#java -cp ./lib/commons-logging-1.2.jar:./lib/fluent-hc-4.5.2.jar:./lib/httpclient-4.5.2.jar:./lib/httpcore-4.4.4.jar  -jar ./lib/lansiinformationcenter.jar &

export JDK_HOME=/opt/jdk1.8.0_181
export JAVA_HOME=/opt/jdk1.8.0_181
export PATH=/opt/jdk1.8.0_181/bin:/opt/jdk1.8.0_181/jre/bin:$PATH

ant run
