plugins {
}

    android {
    namespace = "ru.mirea.tuzovavr.intentapp"

    defaultConfig {
      applicationId = "ru.mirea.tuzovavr.intentapp"
    minSdk = 24
    targetSdk = 36
    versionCode = 1
    versionName = "1.0"

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
       release {
           isMinifyEnabled = false
           proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
       }
    }
    }

  dependencies {
  }