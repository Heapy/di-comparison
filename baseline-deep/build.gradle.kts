plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("io.heapy.baseline.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation(kotlin("stdlib-jdk8"))
}
