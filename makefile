#
# A simple parser for map directions v1.0
# Yue Jia @ CREST, UCL - yue.jia@ucl.ac.uk
#
# Adapted from the cup minimal example at
# http://www2.cs.tum.edu/projects/cup/minimal.tar.gz
# 


all: scanner parser qc

qc: QC.java
	javac -cp java-cup-11a.jar Parser.java Scanner.java sym.java QC.java

scanner: Scanner.jflex
	java -jar JFlex.jar Scanner.jflex 

parser: Parser.cup
	java -jar java-cup-11a.jar -parser Parser Parser.cup
  
clean:
	rm -f *.class Parser.java sym.java Scanner.java Scanner.java~



