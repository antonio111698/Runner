plugins {
    alias(libs.plugins.runner.android.feature.ui)
}

android {
    namespace = "com.tonio.auth.presentation"

}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
}