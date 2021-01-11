plugins {
    java
    application
}

application {
    mainClass.set("org.objectstyle.dagger.Main")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))

    implementation("com.google.dagger:dagger:2.30.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.30.1")
}
