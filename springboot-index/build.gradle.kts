plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    kotlin("kapt").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.springboot.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:4.0.0-RC1")
    annotationProcessor("org.springframework:spring-context-indexer:7.0.0-RC3")
}
