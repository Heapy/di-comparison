plugins {
    java
    application
}

application {
    mainClass.set("org.objectstyle.bootique2.Main")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.objectstyle.org/nexus/content/repositories/bootique-snapshots/")
    }
}

dependencies {
    implementation(project(":common-deep"))

    implementation("io.bootique:bootique:2.0-SNAPSHOT")
}
