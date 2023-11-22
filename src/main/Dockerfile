FROM bellsoft/liberica-openjdk-alpine
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/gb/program/Main.java
CMD java -classpath /out ru.gb.program.Main
