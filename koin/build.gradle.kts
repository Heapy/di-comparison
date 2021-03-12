plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("io.heapy.koin.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("io.insert-koin:koin-core:3.0.1-beta-1")
}
