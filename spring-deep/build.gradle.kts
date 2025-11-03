plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.spring.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.springframework:spring-context:7.0.0-RC3")
}
