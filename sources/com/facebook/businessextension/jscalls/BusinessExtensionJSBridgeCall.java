package com.facebook.businessextension.jscalls;

import X.C18180wK;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;

public abstract class BusinessExtensionJSBridgeCall extends BrowserLiteJSBridgeCall {
    public BusinessExtensionJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessExtensionJSBridgeCall(Context context, Bundle bundle, Bundle bundle2, String str, String str2, String str3) {
        super(context, bundle == null ? C18180wK.A06() : bundle, bundle2, str, str2, str3);
    }
}
