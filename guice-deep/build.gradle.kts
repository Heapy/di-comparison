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
    implementation(project(":common-deep"))

    implementation("com.google.inject:guice:5.0.1")
}
