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
    implementation(project(":common"))

    implementation("org.springframework:spring-context:7.0.0-RC3")
}
