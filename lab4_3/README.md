使用语言: Java(jdk-11)

使用工具: ANTLR(ANTLR-4.9.1-jar)

使用方法（linux）：

```bash
curl -O https://www.antlr.org/download/antlr-4.9.1-complete.jar
```

```bash
echo 'export CLASSPATH=".:/path/antlr-4.9.1-complete.jar:$CLASSPATH"' >> ~/.zshrc

echo 'export ANTLR_JAR=/path/antlr-4.9.1-complete.jar' >> ~/.zshrc
```

输入
```bash
java org.antlr.v4.Tool

ls -l $ANTLR_JAR
```

来检查环境