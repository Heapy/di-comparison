plugins {
    kotlin("jvm").version("2.3.0-Beta2")
}

repositories {
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib-jdk8"))
    implementation("org.springframework:spring-context:7.0.0-RC3")
}
