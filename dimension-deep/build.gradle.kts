plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.dimension.MainKt"
}

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.akardapolov:dimension-di:25.11.1")
}
