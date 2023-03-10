import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';
import { Metronome } from 'react-native-guitar';

export default function App() {
  const { play, stop } = Metronome;

  const [bpm, setBpm] = React.useState(60);
  return (
    <View style={styles.container}>
      <Text
        onPress={() => {
          setBpm(bpm + 10);
        }}
      >
        +
      </Text>
      <Text
        onPress={() => {
          setBpm(bpm - 10);
        }}
      >
        -
      </Text>
      <Text>--------</Text>
      <Text
        onPress={() => {
          play(bpm);
        }}
      >
        {bpm}
      </Text>
      <Text>--------</Text>
      <Text
        onPress={() => {
          stop();
        }}
      >
        Stop
      </Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
