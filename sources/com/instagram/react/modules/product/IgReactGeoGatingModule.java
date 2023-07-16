package com.instagram.react.modules.product;

import X.AnonymousClass00U;
import X.AnonymousClass3LY;
import X.AnonymousClass3WS;
import X.C04220Ms;
import X.C131087rO;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C28161tl;
import X.IPD;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.service.session.UserSession;
import java.util.HashSet;

@ReactModule(name = "IGGeoGatingReactModule")
public class IgReactGeoGatingModule extends NativeIGGeoGatingReactModuleSpec {
    public static final String FRAGMENT_ARGUMENTS = "fragment_arguments";
    public static final String MODULE_NAME = "IGGeoGatingReactModule";
    public UserSession mUserSession;

    public String getName() {
        return "IGGeoGatingReactModule";
    }

    public void updateGeoGatingSettings(boolean z, ReadableArray readableArray, String str) {
        UserSession userSession = this.mUserSession;
        if (userSession != null) {
            C28161tl A01 = AnonymousClass3WS.A01(userSession);
            A01.A0M(str, z);
            HashSet A0u = C18200wM.A0u();
            for (int i = 0; i < readableArray.size(); i++) {
                A0u.add(readableArray.getString(i));
            }
            C04220Ms.A0B(str, 0);
            SharedPreferences sharedPreferences = A01.A00;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String A00 = C18170wI.A00(773);
            C18180wK.A0u(edit, AnonymousClass00U.A0L(str, A00));
            sharedPreferences.edit().putStringSet(AnonymousClass00U.A0L(str, A00), A0u).apply();
            if (str.equals("feed")) {
                AnonymousClass3LY.A00(this.mUserSession).A04(new C131087rO());
            }
        }
    }

    public void setupNativeModule() {
        UserSession userSession;
        if (getCurrentActivity() == null || getCurrentActivity().getIntent() == null) {
            userSession = null;
        } else {
            Bundle A0C = C18190wL.A0C(getCurrentActivity());
            A0C.getClass();
            if (A0C.getBundle(FRAGMENT_ARGUMENTS) != null) {
                A0C = A0C.getBundle(FRAGMENT_ARGUMENTS);
            }
            userSession = C18180wK.A0V(A0C);
        }
        this.mUserSession = userSession;
    }

    public IgReactGeoGatingModule(IPD ipd) {
        super(ipd);
    }
}
