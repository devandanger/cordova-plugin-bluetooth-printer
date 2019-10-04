package org.apache.cordova.bluetoothprinter;

   
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;

public class BluetoothPrinterPlugin extends CordovaPlugin {
    @Override
    protected void pluginInitialize() {

    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Context context = cordova.getActivity().getApplicationContext();
        if(action.equals("listPrinters")) {
            this.listPrinters(context);
        }
        return true;
    }

    private void listPrinters(Context context) {
        Log.d("List Printers", "List Printers");
    }

}