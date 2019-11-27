export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/; export PATH=$JAVA_HOME/bin:$PATH
mvn compile
mvn org.pavelreich.saaremaa:plugin:metrics
mvn -Drat.skip=true -DseqTestMethods=false -DshuffleTests=true -DinterceptorEnabled=false -Dtimeout=165 org.pavelreich.saaremaa:plugin:ctest
mvn org.pavelreich.saaremaa:plugin:analyse-testcases
mvn org.pavelreich.saaremaa:plugin:combine-metrics
