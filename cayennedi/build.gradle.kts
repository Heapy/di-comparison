plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.cayenne.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation("org.apache.cayenne:cayenne-di:5.0-M1")
}
