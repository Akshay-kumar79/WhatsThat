pluginManagement {
    repositories{
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.google.cloud.tools.appengine"){
                useModule("com.google.cloud.tools:appengine-gradle-plugin:${requested.version}")
            } else if (requested.id.id == "org.gretty"){
                useModule("org.gretty:gretty:${requested.version}")
            }
        }
    }
}

rootProject.name = "WhatsThat"