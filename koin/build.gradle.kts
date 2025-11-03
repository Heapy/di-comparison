plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.koin.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("io.insert-koin:koin-core:4.1.1")
}
