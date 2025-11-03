plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass.set("io.heapy.spring.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation("org.springframework:spring-context:7.0.0-RC3")
}
