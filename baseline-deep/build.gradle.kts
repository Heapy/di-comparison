plugins {
    kotlin("jvm").version("1.4.30-M1")
    application
}

application {
    mainClass.set("io.heapy.baseline.MainKt")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common-deep"))

    implementation(kotlin("stdlib-jdk8"))
}
