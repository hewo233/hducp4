# Makefile

# 项目名称
PROJECT_NAME := lab4_4

# 环境变量
VENV := .venv
PYTHON_EXEC := ${VENV}/bin/python

# 目标：创建虚拟环境并激活
initG4: SysYLexer.g4 SysYParser.g4
	java -jar $(ANTLR_JAR) -Dlanguage=Python3 -listener -visitor -o src/generated SysYLexer.g4 SysYParser.g4

env:
	pdm venv create

# 目标：安装依赖
install:
	pdm install

# 目标：运行项目
run: initG4 env install 
	 pdm run python src/__init__.py ./tests/input_file.sy 

# 目标：清理 
clean:
	rm -rf ${VENV} .pdm state.toml *.pyc __pycache__ src/generated

# 默认目标
default: run
