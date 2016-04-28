###############################################################################
# list of all object files, based on the variables $(GEN_C) and $(SRC_C)
OBJ		= $(addsuffix .o, $(basename  $(notdir $(GEN_C) $(SRC_C))))

all: $(MAIN)

$(MAIN): gen $(OBJ)
	$(CC) -lm $(C_FLAGS) -o $(MAIN) $(OBJ) $(LD_FLAGS)
	
# create all generated sources
gen: $(GEN) $(GEN_C)

# compile the stuff
.SUFFIXES:	.c .o
.c.o:
	$(CC) $(C_FLAGS) -c $<

.SUFFIXES:	.java .class
.java.class:
	$(JAVAC)  $<
	
# Generate the scanner
l_scan.c: $(REX_SRC)
	rex -cdis -y  $(REX_SRC)	
	
###############################################################################

