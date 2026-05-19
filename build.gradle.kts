plugins {
    kotlin("jvm") version "1.9.22" 
    application 
}

repositories {
    mavenCentral()
}

dependencies {

    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("org.example.physics.MainKt")
}