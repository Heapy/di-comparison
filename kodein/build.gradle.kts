plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("io.heapy.kodein.MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("org.kodein.di:kodein-di-jvm:7.2.0")
}
