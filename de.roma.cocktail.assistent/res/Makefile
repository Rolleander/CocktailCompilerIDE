
###################################################################
#SETTINGS
CC		 = gcc
COCKTAIL = $REPLACE$
X_DEBUG	 = -g -Wall -ansi -pedantic
C_FLAGS	 = -I.. -DYYDEBUG -L$(COCKTAIL)\lib -I$(COCKTAIL)\lib\include $(X_DEBUG)
LD_FLAGS =  

##################################################################
#executable
BIN     = prog

# Source files
REX     = test.rex

SRC_C	= main.c
SRC_H	=
SRC		= $(REX)

# Generated files
GEN_C	= l_scan.c l_scanSource.c
GEN_H	= l_scan.h l_scanSource.h
GEN		=

##################################################################
include default_rules.mk

