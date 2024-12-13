CC	:=	gcc

CFLAGS	:=	-x c -o

SRCS	:=	func.sy inc.sy logic.sy number.sy while.sy

func: func.sy
	$(CC) $(CFLAGS) func func.sy

inc: inc.sy
	$(CC) $(CFLAGS) inc inc.sy

logic: logic.sy
	$(CC) $(CFLAGS) logic logic.sy

number: number.sy
	$(CC) $(CFLAGS) number number.sy

while: while.sy
	$(CC) $(CFLAGS) while while.sy

all: $(SRCS)
	make func
	make inc
	make logic
	make number
	make while

clean:
	rm -f func inc logic number while