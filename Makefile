SUB-1	=	./lab4_1
SUB-2	=	./lab4_2
SUB-3	=	./lab4_3

FILE	?=	err-3.sy

run-3:
	@make -C $(SUB-3) run FILE=$(FILE)


.PHONY: run-3