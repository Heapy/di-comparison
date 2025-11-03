plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.springboot.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.springframework.boot:spring-boot-starter:4.0.0-RC1")
    annotationProcessor("org.springframework:spring-context-indexer:7.0.0-RC3")
}
