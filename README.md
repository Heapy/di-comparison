# DI Containers Comparison

Comparing a simple app varieties on different DI containers.

## IntelliJ IDEA Setup

Go to "Preferences > Annotation Processors", and check "Enable Annotation
Processing".

## "Benchmark"

```
# Build
./gradlew clean build installDist distTar

# Run
TestRunner in common-deep/src/test/kotlin
```

## Test machine

```
MacBook Pro (16-inch, 2019)
Processor: 2,6 GHz 6-Core Intel Core i7
Memory: 32 GB 2667 MHz DDR4

openjdk 11.0.10 2021-01-19 LTS
OpenJDK Runtime Environment Corretto-11.0.10.9.1 (build 11.0.10+9-LTS)
OpenJDK 64-Bit Server VM Corretto-11.0.10.9.1 (build 11.0.10+9-LTS, mixed mode)
```

## Results for JVM (JDK 11)

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, s|LoC|
|----|----|----|----|
|jvm|1.69|111|2|

## Results for 2 classes (JDK 11)
|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|kotlin-lazy|1.69|118|16|
|baseline|1.69|130|7|
|dagger|1.73|130|37|
|cayennedi|1.76|158|37|
|koin|1.85|160|16|
|koin-reflect|1.88|170|17|
|kodein|2.36|180|17|
|bootique|4.18|229|52|
|guice|5.42|331|33|
|spring|5.60|356|23|
|komodo|6.41|392|17|
|owb|3.05|421|35|
|springboot|9.73|916|42|

## Results for 100 classes (JDK 11)
|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|baseline-deep|1.83|142|107|
|kotlin-lazy-deep|1.91|158|313|
|dagger-deep|1.96|163|534|
|cayennedi-deep|1.95|212|1444|
|koin-deep|2.13|216|113|
|koin-reflect-deep|2.51|241|114|
|bootique-deep|4.31|280|549|
|kodein-deep|2.92|284|114|
|guice-deep|5.56|407|530|
|spring-deep|5.73|469|420|
|komodo-deep|6.64|531|114|
|owb-deep|3.18|584|532|
|springboot-deep|9.85|1054|439|
