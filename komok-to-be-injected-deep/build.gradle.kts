plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass.set("io.heapy.komodo.MainKt")
}

kotlin {
    jvmToolchain(25)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("io.heapy.komok:komok-tech-to-be-injected:1.0.13")
}
