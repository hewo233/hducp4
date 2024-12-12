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
