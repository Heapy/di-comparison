plugins {
    java
    application
}

application {
    mainClass.set("org.objectstyle.spring.Main")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))

    implementation("org.springframework:spring-context:5.2.5.RELEASE")
}
