SUB-1	=	./lab4_1
SUB-2	=	./lab4_2
SUB-3	=	./lab4_3
SUB-4   =   ./lab4_4
FILE	?=	err-3.sy

run-3:
	@make -C $(SUB-3) run FILE=$(FILE)

run-4:
	@make -C $(SUB-4) run 

.PHONY: run-3