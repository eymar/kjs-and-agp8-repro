plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

group = "me.username"
version = "1.0-SNAPSHOT"


kotlin {
    android()
    js {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
            }
        }
        val jsMain by getting {

        }
        val androidMain by getting {

        }
    }
}

android {
    compileSdkVersion(33)
    namespace = "com.your.unique.package.name"
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(33)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
