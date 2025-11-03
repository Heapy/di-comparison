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
|jvm|1.75|55|2|

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|baseline|1.76|38|7|
|dagger|1.83|43|37|
|komok-to-be-injected|2.48|46|18|
|kodein|3.44|55|17|
|kotlin-lazy|1.76|56|16|
|cayennedi|1.82|63|37|
|koin|2.22|80|16|
|koin-reflect|2.23|82|18|
|bootique|4.69|91|49|
|owb|3.11|109|35|
|guice|5.63|118|33|
|spring-xml|6.78|150|19|
|spring|6.78|151|23|
|spring-index|6.78|158|13|
|spring-scan|6.78|163|13|
|springboot|10.33|396|42|

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, ms|LoC|
|----|----|----|----|
|komok-to-be-injected-deep|2.63|51|315|
|kodein-deep|3.87|51|114|
|kotlin-lazy-deep|1.90|61|313|
|dagger-deep|2.06|63|534|
|baseline-deep|1.89|67|107|
|cayennedi-deep|2.01|98|1444|
|koin-reflect-deep|2.53|101|115|
|koin-deep|2.38|108|113|
|owb-deep|3.25|110|532|
|bootique-deep|4.82|128|446|
|guice-deep|5.76|148|530|
|spring-xml-deep|6.91|189|319|
|spring-deep|6.92|198|420|
|spring-scan-deep|6.92|237|13|
|spring-index-deep|6.92|238|14|
|springboot-deep|10.46|464|439|