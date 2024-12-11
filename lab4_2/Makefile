
# ANTLR 的 JAR 文件路径
ANTLR_JAR=/home/aster/antlr-4.9.1-complete.jar

# 类路径，包含当前目录和 ANTLR JAR
CLASSPATH=.:$(ANTLR_JAR)

# 编译目标
Main.class: Main.java
	javac -cp $(CLASSPATH) Main.java

# 运行目标，使用 make run ARGS=<文件路径> 来指定参数
.PHONY: run
run: Main.class
	java -cp $(CLASSPATH) Main $(ARGS)

# 清理目标
.PHONY: clean
clean:
	rm -f *.class
	rm -f *.tokens
	rm -f *.interp
