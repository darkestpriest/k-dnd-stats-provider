plugins {
    val kotlinVersion = "1.8.0"
    kotlin("jvm") version kotlinVersion apply false
}

subprojects {
    repositories {
        mavenCentral()
    }
}