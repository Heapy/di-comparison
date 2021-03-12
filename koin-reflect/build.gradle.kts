plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("org.objectstyle.koin.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("io.insert-koin:koin-core:3.0.1-beta-1")
    implementation("io.insert-koin:koin-core-ext:3.0.1-beta-1")
}
