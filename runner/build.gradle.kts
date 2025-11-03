plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("tools.jackson.module:jackson-module-kotlin:3.0.1")
}

application {
    mainClass = "TestRunnerKt"
}
