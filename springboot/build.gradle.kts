plugins {
    java
    application
}

application {
    mainClass.set("org.objectstyle.springboot.Main")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))

    implementation("org.springframework.boot:spring-boot-starter:2.2.6.RELEASE")
}
