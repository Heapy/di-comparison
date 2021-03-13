plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("io.heapy.klazy.MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
}
