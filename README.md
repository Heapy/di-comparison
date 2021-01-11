# DI Containers Comparision

Comparing a simple app varieties on different DI containers.

## IntelliJ IDEA Setup

Go to "Preferences > Annotation Processors", and check "Enable Annotation
Processing".

## "Benchmark"

```
# Build
./gradlew clean build installDist distTar
```

```
# Get the file sizes
find . -name '*.tar' |xargs ls -lh |grep -v original |grep -v common
```

```
# Execution time

# 2 classes

time (for i in {1..10}; do ./baseline/build/install/baseline/bin/baseline; done)
time (for i in {1..10}; do ./bootique/build/install/bootique/bin/bootique; done)
time (for i in {1..10}; do ./cayennedi/build/install/cayennedi/bin/cayennedi; done)
time (for i in {1..10}; do ./dagger/build/install/dagger/bin/dagger; done)
time (for i in {1..10}; do ./guice/build/install/guice/bin/guice; done)
time (for i in {1..10}; do ./komodo/build/install/komodo/bin/komodo; done)
time (for i in {1..10}; do ./owb/build/install/owb/bin/owb; done)
time (for i in {1..10}; do ./spring/build/install/spring/bin/spring; done)
time (for i in {1..10}; do ./springboot/build/install/springboot/bin/springboot; done)
time (for i in {1..10}; do ./koin/build/install/koin/bin/koin; done)
time (for i in {1..10}; do ./kodein/build/install/kodein/bin/kodein; done)

# 100 classes

time (for i in {1..10}; do ./baseline-deep/build/install/baseline-deep/bin/baseline-deep; done)
time (for i in {1..10}; do ./bootique-deep/build/install/bootique-deep/bin/bootique-deep; done)
time (for i in {1..10}; do ./cayennedi-deep/build/install/cayennedi-deep/bin/cayennedi-deep; done)
time (for i in {1..10}; do ./dagger-deep/build/install/dagger-deep/bin/dagger-deep; done)
time (for i in {1..10}; do ./guice-deep/build/install/guice-deep/bin/guice-deep; done)
time (for i in {1..10}; do ./komodo-deep/build/install/komodo-deep/bin/komodo-deep; done)
time (for i in {1..10}; do ./owb-deep/build/install/owb-deep/bin/owb-deep; done)
time (for i in {1..10}; do ./spring-deep/build/install/spring-deep/bin/spring-deep; done)
time (for i in {1..10}; do ./springboot-deep/build/install/springboot-deep/bin/springboot-deep; done)
time (for i in {1..10}; do ./koin-deep/build/install/koin-deep/bin/koin-deep; done)
time (for i in {1..10}; do ./kodein-deep/build/install/kodein-deep/bin/kodein-deep; done)
```

```
# Lines of code for 2 classes

cloc ./baseline/src
cloc ./bootique/src
cloc ./cayennedi/src
cloc ./dagger/src/main/java
cloc ./guice/src
cloc ./komodo/src
cloc ./owb/src
cloc ./spring/src
cloc ./springboot/src
cloc ./koin/src
cloc ./kodein/src

# Lines of code for 100 classes

cloc ./baseline-deep/src
cloc ./bootique-deep/src
cloc ./cayennedi-deep/src
cloc ./dagger-deep/src/main/java
cloc ./guice-deep/src
cloc ./komodo-deep/src
cloc ./owb-deep/src
cloc ./spring-deep/src
cloc ./springboot-deep/src
cloc ./koin-deep/src
cloc ./kodein-deep/src
```

## Results for 2 classes (JDK 11)

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, s|LoC|
|----|----|----|----|
|Baseline|1.7|1.35|7|
|Dagger|1.7|1.41|37|
|Cayenne DI|1.8|2.05|37|
|Koin|1.8|2.56|16|
|Kodein|2.4|2.93|17|
|Bootique|4.2|4.31|52|
|Guice|5.3|6.51|33|
|Komodo|6.4|7.56|17|
|Spring|5.5|8.36|23|
|OpenWebBeans|3.0|10.02|35|
|Spring Boot|9.2|26.94|42|

## Results for 100 classes (JDK 11)
|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, s|LoC|
|----|----|----|----|
|Baseline|1.8|2.28|107|
|Dagger|2.0|2.70|534|
|Cayenne DI|2.0|3.70|1444|
|Koin|2.1|3.92|113|
|Kodein|2.9|5.58|114|
|Bootique|4.3|5.79|549|
|Guice|5.4|8.70|530|
|Spring|5.5|12.81|420|
|Komodo|6.6|12.87|114|
|OpenWebBeans|3.2|16.16|532|
|Spring Boot|9.4|30.42|439|
