plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    kotlin("kapt").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.spring.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-spring-annotations-deep"))

    implementation("org.springframework:spring-context:7.0.0-RC3")
    annotationProcessor("org.springframework:spring-context-indexer:7.0.0-RC3")
}
