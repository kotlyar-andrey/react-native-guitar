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

  @ReactMethod
  fun metronomePlay(bpm: Int) {
    metronome.play(bpm)
  }

  @ReactMethod
  fun metronomeStop() {
    metronome.stop();
  }

  @ReactMethod
  fun metronomeInit() {
    metronome.playerInitialize();
  }

  @ReactMethod
  fun metronomeRelease() {
    metronome.playerRelease();
  }

  companion object {
    const val NAME = "Guitar"
  }
}
