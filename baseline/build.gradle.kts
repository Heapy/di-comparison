plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass.set("io.heapy.baseline.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
}
