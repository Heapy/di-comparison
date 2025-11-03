plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.guice.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.inject:guice:7.0.0")
}
