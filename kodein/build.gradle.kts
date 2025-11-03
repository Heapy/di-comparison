plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass.set("io.heapy.kodein.MainKt")
}

kotlin {
    jvmToolchain(25)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("org.kodein.di:kodein-di-jvm:7.28.0")
}
