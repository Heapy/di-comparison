plugins {
    kotlin("jvm").version("1.4.30-M1")
    application
}

application {
    mainClass.set("org.objectstyle.baseline.MainKt")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
}
