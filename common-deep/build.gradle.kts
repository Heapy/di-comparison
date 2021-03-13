plugins {
    kotlin("jvm").version("1.4.31")
}

repositories {
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib-jdk8"))
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.2")
}
