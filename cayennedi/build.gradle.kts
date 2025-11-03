plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.cayenne.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.cayenne:cayenne-di:5.0-M1")
}
