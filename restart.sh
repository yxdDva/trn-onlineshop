
mvn clean
mvn install

rm -rf /Users/dva/java/Tomcat/apache-tomcat-9.0.16/webapps/trn-onlineshop*

cp target/trn-onlineshop-1.0-SNAPSHOT.war /Users/dva/java/Tomcat/apache-tomcat-9.0.16/webapps/

cd /Users/dva/java/Tomcat/apache-tomcat-9.0.16/bin/
./catalina.sh run