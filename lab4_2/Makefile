ANTLR       = java -jar $(ANTLR_JAR)

BUILD_DIR   = build
GEN_DIR     = $(BUILD_DIR)/gen
CLASS_DIR   = $(BUILD_DIR)/classes
OUT_DIR     = $(BUILD_DIR)/output

ANTLR_CP    = $(GEN_DIR):$(ANTLR_JAR)

TEST_DIR    = ../lab4_1/tests
TEST_FILES  = $(wildcard $(TEST_DIR)/*.sy)
OUT_FILES   = $(patsubst $(TEST_DIR)/%.sy,$(OUT_DIR)/%.out,$(TEST_FILES))

.PHONY: all run clean compile initG4 prepare test

all: test

prepare:
	mkdir -p $(GEN_DIR) $(CLASS_DIR) $(OUT_DIR)

initG4: prepare
	$(ANTLR) -o $(GEN_DIR) SysYLexer.g4

compile: initG4
	$(eval JAVA_FILES := $(shell find $(GEN_DIR) -name "*.java" 2>/dev/null))
	$(eval JAVA_FILES += Main.java)
	javac -classpath $(ANTLR_CP) $(JAVA_FILES) -d $(CLASS_DIR)

run: compile
	java -classpath $(CLASS_DIR):$(ANTLR_CP) Main $(FILE)

test: compile $(OUT_FILES)

$(OUT_DIR)/%.out: $(TEST_DIR)/%.sy
	@echo "Testing $<..."
	@java -classpath $(CLASS_DIR):$(ANTLR_CP) Main $< > $@ 2>&1

clean:
	rm -rf $(BUILD_DIR)