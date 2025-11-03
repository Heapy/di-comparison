plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.jvm.MainKt"
}

kotlin {
    jvmToolchain(25)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
