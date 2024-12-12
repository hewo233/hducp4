ANTLR_FLAG := -listener -visitor -long-messages

ANTLR_CP := ./output:$(ANTLR_JAR)

initG4: SysYLexer.g4 SysYParser.g4
	java -jar $(ANTLR_JAR) $(ANTLR_FLAG) -o output SysYParser.g4 SysYLexer.g4

JAVA_FILES := $(shell find output -name "*.java")
JAVA_FILES += Main.java

compile: initG4
	mkdir -p classes
	javac -classpath $(ANTLR_CP) $(JAVA_FILES) -d classes

FILE	?=	err-3.sy

FILE_FULL = ../lab4-1/tests/$(FILE)

run: compile
	java -classpath ./classes:$(ANTLR_CP) Main $(FILE_FULL)

clean:
	rm -rf output
	rm -rf classes

.PHONY: compile run clean