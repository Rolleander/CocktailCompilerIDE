
###################################################################
#SETTINGS
CC		 = gcc
COCKTAIL = E:\Cocktail-0810
PATH    := $(PATH):$(COCKTAIL)\bin:..\rPrepro:..\..\rPrepro:\etc\alternatives\
X_DEBUG	 = -g -Wall -ansi -pedantic
C_FLAGS	 = -I.. -DYYDEBUG -L$(COCKTAIL)\lib -I$(COCKTAIL)\lib\include $(X_DEBUG)
LD_FLAGS = -L$(COCKTAIL)\lib -Ireuse  

##################################################################
#executable
MAIN     = prog

# Source files
REX_SRC     = test.rex

SRC_C	= main.c
SRC_H	=
SRC		= $(REX)

# Generated files
GEN_C	= l_scan.c l_scanSource.c
GEN_H	= l_scan.h l_scanSource.h
GEN		=

##################################################################
include default_rules.mk

clean:
	rm -f *.o $(GEN_C) $(GEN_H) $(GEN) $(MAIN)
	rm -f l_scanDrv.c