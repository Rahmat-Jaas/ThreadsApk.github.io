package com.instagram.react.modules.product;

import X.AnonymousClass7CL;
import X.C10300i6;
import X.C1362081v;
import X.C145858lE;
import X.C60053Nl;
import X.IPD;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeIGReactCountryCodeRouteSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGReactCountryCodeRoute")
public class IgReactCountryCodeRoute extends NativeIGReactCountryCodeRouteSpec {
    public static final String MODULE_NAME = "IGReactCountryCodeRoute";
    public final C10300i6 mSession;

    public String getName() {
        return "IGReactCountryCodeRoute";
    }

    public IgReactCountryCodeRoute(IPD ipd, C10300i6 r2) {
        super(ipd);
        this.mSession = r2;
    }

    public void extractCountryCodeAndNumber(String str, C145858lE r7) {
        String str2;
        int length;
        IPD reactApplicationContext = getReactApplicationContext();
        String str3 = C60053Nl.A00(reactApplicationContext).A00;
        String str4 = C60053Nl.A00(reactApplicationContext).A01;
        String A00 = C60053Nl.A00(reactApplicationContext).A00();
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(str4)) {
                length = str4.length();
            } else if (str.startsWith(A00)) {
                length = A00.length();
            }
            str2 = str.substring(length);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("country", str3);
            writableNativeMap.putString("countryCode", str4);
            writableNativeMap.putString("phoneNumber", str2);
            r7.resolve(writableNativeMap);
        }
        str2 = "";
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("country", str3);
        writableNativeMap2.putString("countryCode", str4);
        writableNativeMap2.putString("phoneNumber", str2);
        r7.resolve(writableNativeMap2);
    }

    public void presentCountryCodeSelector(String str, Callback callback) {
        if (getCurrentActivity() != null) {
            AnonymousClass7CL.A00(new C1362081v(callback, this));
        }
    }
}
