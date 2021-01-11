plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.springboot.Main")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.springframework.boot:spring-boot-starter:2.2.6.RELEASE")
}
