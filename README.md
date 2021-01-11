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

time (for i in {1..10}; do ./baseline/build/install/baseline/bin/baseline; done)
time (for i in {1..10}; do ./bootique2/build/install/bootique2/bin/bootique2; done)
time (for i in {1..10}; do ./cayennedi/build/install/cayennedi/bin/cayennedi; done)
time (for i in {1..10}; do ./dagger/build/install/dagger/bin/dagger; done)
time (for i in {1..10}; do ./guice/build/install/guice/bin/guice; done)
time (for i in {1..10}; do ./komodo/build/install/komodo/bin/komodo; done)
time (for i in {1..10}; do ./owb/build/install/owb/bin/owb; done)
time (for i in {1..10}; do ./spring/build/install/spring/bin/spring; done)
time (for i in {1..10}; do ./springboot/build/install/springboot/bin/springboot; done)
time (for i in {1..10}; do ./koin/build/install/koin/bin/koin; done)
time (for i in {1..10}; do ./koin/build/install/koin/bin/koin; done)
time (for i in {1..10}; do ./springboot/build/install/springboot/bin/springboot; done)
time (for i in {1..10}; do ./spring/build/install/spring/bin/spring; done)
time (for i in {1..10}; do ./owb/build/install/owb/bin/owb; done)
time (for i in {1..10}; do ./komodo/build/install/komodo/bin/komodo; done)
time (for i in {1..10}; do ./guice/build/install/guice/bin/guice; done)
time (for i in {1..10}; do ./dagger/build/install/dagger/bin/dagger; done)
time (for i in {1..10}; do ./cayennedi/build/install/cayennedi/bin/cayennedi; done)
time (for i in {1..10}; do ./bootique2/build/install/bootique2/bin/bootique2; done)
time (for i in {1..10}; do ./baseline/build/install/baseline/bin/baseline; done)
```

```
# Lines of code
cloc ./baseline/src
cloc ./bootique2/src
cloc ./cayennedi/src
cloc ./dagger/src
cloc ./guice/src
cloc ./komodo/src
cloc ./owb/src
cloc ./spring/src
cloc ./springboot/src
cloc ./koin/src
```

## Results (JDK 11)

|DI|Jar w/Deps Size, Mb|:arrow_down: Exec time, s|LoC|
|----|----|----|----|
|Baseline|1.7|1.35|7|
|Dagger|1.7|1.41|37|
|Cayenne DI|1.8|2.05|37|
|Koin|1.8|2.56|16|
|Bootique 2|4.2|4.31|52|
|Guice|5.4|6.22|33|
|Komodo|6.4|7.56|17|
|Spring|5.5|8.36|23|
|OpenWebBeans|3.0|10.02|35|
|Spring Boot|9.2|26.94|42|
