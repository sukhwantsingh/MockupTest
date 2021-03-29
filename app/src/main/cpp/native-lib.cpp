//
// Created by sukh on 12/31/20.
//


#include <jni.h>
#include <string>



// Base url for the web services
extern "C"
jstring Java_ssc_appname_whitelabel_data_network_ApiPreferences_baseUrlFromJNI(JNIEnv *env,  jclass clazz) {
    std::string baseURL = "https://abcweb.com/";
    return env->NewStringUTF(baseURL.c_str());
}
