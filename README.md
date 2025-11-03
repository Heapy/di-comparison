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
./runner/build/install/runner/bin/runner
```

## Test machine

```
MacBook Pro (16-inch, 2024)
Chip: Apple M4 Max (14-Core: 10 performance + 4 efficiency)
GPU: 32-Core GPU
Memory: 36 GB Unified Memory

openjdk 25.0.1 2025-10-21 LTS
OpenJDK Runtime Environment Corretto-25.0.1.8.1 (build 25.0.1+8-LTS)
OpenJDK 64-Bit Server VM Corretto-25.0.1.8.1 (build 25.0.1+8-LTS, mixed mode, sharing)
```
|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|jvm|1.75|269|2|

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|komok-to-be-injected|2.48|233|33|
|owb|3.11|235|49|
|kotlin-lazy|1.75|243|31|
|spring|6.78|246|38|
|koin-reflect|2.22|247|33|
|cayennedi|1.82|249|49|
|spring-scan|6.78|250|34|
|kodein|3.43|252|32|
|koin|2.22|252|31|
|springboot|10.33|253|56|
|dagger|1.82|254|51|
|baseline|1.75|256|24|
|guice|5.62|260|47|
|spring-xml|6.78|276|37|
|bootique|4.69|279|63|
|springboot-index|10.33|285|46|
|spring-index|6.78|333|34|

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|cayennedi-deep|2.00|231|1953|
|spring-deep|6.91|238|1032|
|koin-reflect-deep|2.52|241|727|
|owb-deep|3.23|245|1143|
|komok-to-be-injected-deep|2.62|248|927|
|spring-xml-deep|6.90|250|931|
|springboot-deep|10.46|251|1050|
|baseline-deep|1.88|253|719|
|kodein-deep|3.86|254|726|
|kotlin-lazy-deep|1.89|256|925|
|springboot-index-deep|10.46|257|739|
|koin-deep|2.37|264|725|
|guice-deep|5.75|266|1141|
|spring-scan-deep|6.91|267|728|
|bootique-deep|4.82|270|1057|
|spring-index-deep|6.91|274|729|
|dagger-deep|2.05|347|1145|