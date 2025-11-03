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
|jvm|1.75|31|2|

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|kotlin-lazy|1.75|38|31|
|dagger|1.82|39|51|
|baseline|1.75|40|24|
|cayennedi|1.82|51|49|
|dimension|1.78|56|37|
|komok-to-be-injected|2.48|62|33|
|kodein|3.43|65|32|
|koin|2.22|69|31|
|koin-reflect|2.22|70|33|
|bootique|4.69|99|63|
|guice|5.62|121|47|
|spring|6.78|138|38|
|spring-xml|6.78|140|37|
|spring-scan|6.78|156|34|
|spring-index|6.78|159|34|
|springboot-index|10.33|362|45|
|springboot|10.33|386|56|

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|baseline-deep|1.88|52|719|
|dagger-deep|2.05|56|1145|
|kotlin-lazy-deep|1.89|68|925|
|cayennedi-deep|2.00|80|1953|
|koin-reflect-deep|2.52|85|727|
|komok-to-be-injected-deep|2.62|89|927|
|dimension-deep|1.91|93|831|
|koin-deep|2.37|97|725|
|kodein-deep|3.86|107|726|
|bootique-deep|4.82|116|1057|
|guice-deep|5.75|146|1141|
|spring-xml-deep|6.90|165|931|
|spring-deep|6.91|188|1032|
|spring-scan-deep|6.91|242|728|
|spring-index-deep|6.91|245|729|
|springboot-index-deep|10.46|451|739|
|springboot-deep|10.46|473|1050|
