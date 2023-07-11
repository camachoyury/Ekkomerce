import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

//TODO: Change group

group = "com.camachoyury"
version = "1.0-SNAPSHOT"


kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "17"
        }
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(compose.desktop.currentOs)
            }
            configurations.all {
                // some dependencies contains it, this causes an exception to initialize the Main dispatcher in desktop for image loader
                exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-android")
            }
        }
        val jvmTest by getting
    }
}

compose.desktop {
    application {
        mainClass = "desktop/src/jvmMain/kotlin/Main.kt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Ekkomerce"
            packageVersion = "1.0.0"
        }
    }
}
