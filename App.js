import React from 'react';
import {Text, View, NativeModules, Button} from 'react-native';
const {TestNativeModule, WireguardNativeModule} = NativeModules;

const App = () => {
  const testNativeModule = () => {
    TestNativeModule.testFunctionality('variable1', 'variable2');
  };
  const wireguardGoVersion = () => {
    WireguardNativeModule.version();
  };
  return (
    <View
      style={{
        flex: 1,
        padding: 20,
        alignItems: 'center',
        justifyContent: 'space-around',
      }}>
      <Text>React Native Wireguard App</Text>
      <Button
        title="Click to test your native module!"
        color="#841584"
        onPress={testNativeModule}
      />
      <Button
        title="Click to see wireguard-go version!"
        color="#841584"
        onPress={wireguardGoVersion}
      />
    </View>
  );
};

export default App;
