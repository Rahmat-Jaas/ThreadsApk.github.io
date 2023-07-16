package com.facebook.redex;

import X.AnonymousClass3IQ;
import X.C04220Ms;
import X.C18180wK;
import X.C19080z7;
import X.C35682Ok;
import X.C58613Gl;
import X.C81154nF;
import X.C81174nH;
import X.C83464rQ;
import android.view.Window;
import androidx.fragment.app.Fragment;

public class IDxACallbackShape855S0100000_1_I2 implements C83464rQ {
    public Object A00;
    public final int A01;

    public IDxACallbackShape855S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFailure(Throwable th) {
        String str;
        String str2;
        if (this.A01 != 0) {
            C81174nH r3 = (C81174nH) this.A00;
            if (th == null || (str2 = th.getLocalizedMessage()) == null) {
                str2 = "async controller launch failed";
            }
            r3.A03(str2);
            C81154nF r32 = (C81154nF) r3;
            r32.A00.markerPoint(444800256, "hide_loading_state");
            C58613Gl A002 = C35682Ok.A00();
            Window window = r32.A01;
            if (window != null) {
                A002.A01(window);
            } else {
                C04220Ms.A0E("window");
                throw null;
            }
        } else {
            if (th != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            Fragment fragment = (Fragment) this.A00;
            if (fragment.getContext() != null) {
                C19080z7.A00(fragment.getContext(), C18180wK.A0j("An error occurred during the call: %s", new Object[]{str}), 1).show();
            }
        }
    }

    public final void onSuccess() {
        if (this.A01 != 0) {
            ((AnonymousClass3IQ) this.A00).A02();
            return;
        }
        Fragment fragment = (Fragment) this.A00;
        if (fragment.getContext() != null) {
            C19080z7.A00(fragment.getContext(), C18180wK.A0j("The Async controller has been invoked!", new Object[0]), 1).show();
        }
    }
}
