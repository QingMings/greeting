#include <jni.h>
#include <stdio.h>

JNIEXPORT void JNICALL Java_Greeting_greeting(JNIEnv * jenv, jclass jcls) {
    printf("Goodbye World!\n");
}
