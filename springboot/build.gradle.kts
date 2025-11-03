plugins {
    java
    application
}

application {
    mainClass = "io.heapy.springboot.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation("org.springframework.boot:spring-boot-starter:4.0.0-RC1")
}
