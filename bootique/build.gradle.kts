plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.bootique4.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation("io.bootique:bootique:4.0-M1")
}
