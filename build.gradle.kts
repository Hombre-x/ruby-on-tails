plugins {
    kotlin("jvm") version "1.9.21"
    application
    antlr
}

version = "1.0.0"

application {
    mainClass.set("app.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    antlr("org.antlr:antlr4:4.13.1")
}

sourceSets {
    main {
        java {
            srcDir("src/main/antlr/grammar")
        }

        antlr {
            srcDir("src/main/antlr/")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks {

    generateGrammarSource {
        arguments = arguments + listOf("-visitor")
        outputDirectory = file("src/main/antlr/")
    }

    named("compileKotlin") {
        dependsOn(":generateGrammarSource")
    }

}

kotlin {
    jvmToolchain(20)
}