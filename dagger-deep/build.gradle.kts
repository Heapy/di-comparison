plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.dagger.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("com.google.dagger:dagger:2.30.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.30.1")
}
