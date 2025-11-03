plugins {
    java
    application
}

application {
    mainClass = "io.heapy.spring.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.springframework:spring-context:7.0.0-RC3")
}
