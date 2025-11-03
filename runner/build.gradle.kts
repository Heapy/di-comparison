plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib-jdk8"))
    implementation("tools.jackson.module:jackson-module-kotlin:3.0.1")
}

application {
    mainClass = "TestRunnerKt"
}
