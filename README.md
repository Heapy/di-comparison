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

|DI|Jar w/Deps Size, Mb|:arrow_down: Wall, ms|User, ms|Sys, ms|Max RSS, Mb|Allocated, Mb|Alloc Count|LoC|
|----|----|----|----|----|----|----|----|----|
|jvm|1.75|20.00|10.00|6.00|40.33|0.25|6|2|

|DI|Jar w/Deps Size, Mb|:arrow_down: Wall, ms|User, ms|Sys, ms|Max RSS, Mb|Allocated, Mb|Alloc Count|LoC|
|----|----|----|----|----|----|----|----|----|
|dagger|1.82|30.00|20.00|10.00|43.03|0.25|7|51|
|kotlin-lazy|1.75|30.00|20.00|10.00|42.92|0.25|7|31|
|baseline|1.75|36.00|20.00|10.00|42.81|0.25|6|24|
|cayennedi|1.82|46.00|40.00|10.00|46.11|0.25|8|49|
|dimension|1.78|50.00|50.00|10.00|53.52|0.28|12|37|
|kodein|3.43|60.00|68.00|10.00|53.50|2.41|33|32|
|koin|2.22|60.00|70.00|10.00|55.13|2.44|43|31|
|komok-to-be-injected|2.48|60.00|60.00|10.00|53.63|2.53|37|33|
|koin-reflect|2.22|64.00|70.00|10.00|55.22|2.35|41|33|
|bootique|4.69|96.00|150.00|10.00|64.89|0.37|38|63|
|guice|5.62|118.00|170.00|14.00|69.23|0.71|65|47|
|spring|6.78|132.00|202.00|16.00|70.25|1.00|82|38|
|spring-xml|6.78|132.00|190.00|12.00|71.33|1.04|73|37|
|spring-scan|6.78|148.00|234.00|20.00|71.59|0.96|99|34|
|spring-index|6.78|148.00|238.00|14.00|71.36|1.15|106|34|
|owb|3.30|150.00|250.00|20.00|72.92|0.81|79|49|
|springboot-index|10.33|376.00|796.00|36.00|105.66|2.47|349|45|
|springboot|10.33|388.00|836.00|32.00|107.08|2.58|370|56|

|DI|Jar w/Deps Size, Mb|:arrow_down: Wall, ms|User, ms|Sys, ms|Max RSS, Mb|Allocated, Mb|Alloc Count|LoC|
|----|----|----|----|----|----|----|----|----|
|baseline-deep|1.88|40.00|40.00|10.00|44.88|0.26|11|719|
|dagger-deep|2.05|52.00|50.00|10.00|46.67|0.26|13|1145|
|kotlin-lazy-deep|1.89|68.00|86.00|12.00|55.91|0.38|25|925|
|cayennedi-deep|2.00|70.00|100.00|10.00|51.94|0.27|20|1953|
|koin-reflect-deep|2.52|80.00|100.00|10.00|60.81|2.69|54|727|
|komok-to-be-injected-deep|2.62|80.00|114.00|10.00|65.27|2.50|52|927|
|dimension-deep|1.91|88.00|150.00|10.00|64.06|0.65|51|831|
|koin-deep|2.37|90.00|124.00|10.00|66.89|2.46|53|725|
|kodein-deep|3.86|100.00|150.00|10.00|66.69|2.60|60|726|
|bootique-deep|4.82|112.00|172.00|14.00|67.16|0.52|49|1057|
|guice-deep|5.75|152.00|238.00|20.00|71.20|0.62|72|1141|
|spring-xml-deep|6.90|160.00|250.00|20.00|74.52|1.06|85|931|
|spring-deep|6.91|180.00|324.00|20.00|74.22|1.06|124|1032|
|owb-deep|3.42|218.00|424.00|22.00|77.67|0.96|129|1143|
|spring-scan-deep|6.91|230.00|464.00|20.00|80.81|1.83|221|728|
|spring-index-deep|6.91|234.00|466.00|20.00|80.69|1.58|208|729|
|springboot-index-deep|10.46|452.00|1,036.00|40.00|102.63|2.62|438|739|
|springboot-deep|10.46|484.00|1,084.00|40.00|111.45|3.06|466|1050|
