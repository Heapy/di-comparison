import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.owb.Main"
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_24
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_24
    targetCompatibility = JavaVersion.VERSION_24
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("jakarta.enterprise:jakarta.enterprise.cdi-api:4.0.1")
    implementation("org.apache.openwebbeans:openwebbeans-se:4.0.3")
}
