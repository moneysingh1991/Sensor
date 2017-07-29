#include <jni.h>
#include <string>

using namespace std;

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_maninderpal_sensor_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    string hello = "Hello C++";
    return env->NewStringUTF(hello.c_str());
}


