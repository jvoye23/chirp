plugins {
    id("java-library")
    id("chirp.kotlin-common")
}

group = "com.jvcodingsolutions"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}