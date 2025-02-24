plugins {
    application
    kotlin("jvm") version "2.1.10"
}

group = "org.patchworkhealth"
version = "1.0-SNAPSHOT"

repositories { 
    mavenCentral() 
}

dependencies { 
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        lifecycle {
            showExceptions = true
            showCauses = true
            showStackTraces = true
            showStandardStreams = true
        }
        info.events = lifecycle.events
        info.exceptionFormat = lifecycle.exceptionFormat
        showStandardStreams = true
    }
}

application {
    mainClass = "MainKt"
}
