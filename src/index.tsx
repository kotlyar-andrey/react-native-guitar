import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-guitar' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

const Guitar = NativeModules.Guitar
  ? NativeModules.Guitar
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export const Metronome = {
  play: Guitar.metronomePlay,
  stop: Guitar.metronomeStop,
  init: Guitar.metronomeInit,
  release: Guitar.metronomeRelease,
};
