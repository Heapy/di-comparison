plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.guice.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation("com.google.inject:guice:7.0.0")
}
