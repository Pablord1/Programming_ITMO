mkdir build
javac -d build -cp "src:lib/Pokemon.jar" src/lab2/Program.java

cp -r lib/build/

cd build
jar cfm MyJar.jar mf.txt·lab2 mymoves - mypokemons
java -jar MyJar.jar

// Manifest
Manifest-Version: 1.0
Created-By: Pablo
Main-Class: program.Program
Class-Path: lib/Pokemon.jar