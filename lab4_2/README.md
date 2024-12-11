1. 设置环境变量
export ANTLR_JAR=/home/aster/antlr-4.9.1-complete.jar
2. 编译时包含类路径
javac -cp .:$ANTLR_JAR *.java
3. 运行时包含类路径：
java -cp .:$ANTLR_JAR Main example.sy

运行前先下载antlr4包，下载后把makefile中的路径换成你下载的antlr4的位置