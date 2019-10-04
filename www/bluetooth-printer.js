var exec = require('cordova/exec');

exports.listPrinters = function (success, error) {
    exec(success, error, "BluetoothPrinterPlugin", "listPrinters", []);
  };