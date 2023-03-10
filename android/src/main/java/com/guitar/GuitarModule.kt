package com.guitar

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

import com.guitar.metronome.Metronome;

class GuitarModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  val metronome = Metronome();

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun multiply(a: Double, b: Double, promise: Promise) {
    promise.resolve(a + b)
  }

  @ReactMethod
  fun metronomePlay(bpm: Int) {
    metronome.play(bpm)
  }

  @ReactMethod
  fun metronomeStop() {
    metronome.stop();
  }

  companion object {
    const val NAME = "Guitar"
  }
}
