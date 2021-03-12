plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.spring.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.springframework:spring-context:5.3.4")
    annotationProcessor("org.springframework:spring-context-indexer:5.3.4")
}
