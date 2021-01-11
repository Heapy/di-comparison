plugins {
    kotlin("jvm").version("1.4.30-M1")
    application
}

application {
    mainClass.set("org.objectstyle.koin.MainKt")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("org.koin:koin-core:2.2.1")
}
