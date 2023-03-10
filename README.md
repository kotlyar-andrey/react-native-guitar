# react-native-guitar

Library for playing guitar sounds (metronome, chords, beats, etc)

# NOTE: so far only for Android!

## Installation

```sh
npm install react-native-guitar
```

## Usage

### Metronome:

```js
import { Metronome } from 'react-native-guitar';

// ...

onPress = () => {
  Metronome.play(100); // play with bpm=100
};

// ...

onPress = () => {
  Metronome.stop(); // stop playing
};
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
