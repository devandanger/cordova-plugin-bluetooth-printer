var exec = require('cordova/exec');

var PLUGIN_NAME = 'BluetoothPrinterPlugin';
var BluetoothPrinterPlugin = {
  listPrinters: (success, error) => {
    exec(success, error, PLUGIN_NAME, "listPrinters", []);
  }
}

module.exports = BluetoothPrinterPlugin