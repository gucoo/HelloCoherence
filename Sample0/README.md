## This is the sample code from https://github.com/oracle/coherence

However, there are issue with [ERROR] Failed to execute goal org.codehaus.mojo:exec-maven-plugin:3.0.0:java (default-cli) on project Sample0: An exception occured while executing the Java class. HelloCoherence -> [Help 1].

## Alternative way to run I found is:

1.In terminal: Cd to Sample folder and then DO C:\Users\gwcho\eclipse-workspace\Sample0>mvn exec:java -Dexec.mainClass="com.tangosol.net.DefaultCacheServer"

2.In Eclipse: do mvn clean and insatll then run the HelloCoherence as java application then the following will show:

TcpRing{Connections=[1]}
IpMonitor{Addresses=0, Timeout=15s}

2021-10-19 21:59:11.073/5.673 Oracle Coherence CE 21.06 <Info> (thread=Invocation:Management, member=2): Service Management joined the cluster with senior service member 1
2021-10-19 21:59:11.095/5.696 Oracle Coherence CE 21.06 <Info> (thread=main, member=2): Loaded Reporter configuration from "jar:file:/C:/Users/gwcho/.m2/repository/com/oracle/coherence/ce/coherence/21.06/coherence-21.06.jar!/reports/report-group.xml"
2021-10-19 21:59:11.448/6.049 Oracle Coherence CE 21.06 <Info> (thread=DistributedCache:PartitionedCache, member=2): Service PartitionedCache joined the cluster with senior service member 1
Accessing the map "welcomes to in-memory app" containing 0 entries
ConverterEntry{Key="item_1", Value="{'item':'egg'}'amount':1"}
ConverterEntry{Key="item_2", Value="{'itam':'oil','amount':1}"}
ConverterEntry{Key="item_0", Value="{'item':'milk','amount':1}"}
  
## Other setting reference:
  
1. mvn environment variable: https://www.youtube.com/watch?v=X0h0Gbiupgg
2. https://maven.apache.org/download.cgi
3. using java 8  
