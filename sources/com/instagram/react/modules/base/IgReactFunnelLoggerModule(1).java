package com.instagram.react.modules.base;

import X.AnonymousClass14Y;
import X.AnonymousClass3S1;
import X.C10300i6;
import X.C131607sT;
import X.C81194nK;
import X.C86114wI;
import X.IPD;
import com.facebook.fbreact.specs.NativeAnalyticsFunnelLoggerSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "AnalyticsFunnelLogger")
public class IgReactFunnelLoggerModule extends NativeAnalyticsFunnelLoggerSpec {
    public static final String MODULE_NAME = "AnalyticsFunnelLogger";
    public static final String PREFIX = "IG_ANDROID_";
    public C81194nK mFunnelLogger;

    public String getName() {
        return "AnalyticsFunnelLogger";
    }

    private void addActionToFunnelWithTag(AnonymousClass3S1 r2, double d, String str, String str2) {
        synchronized (this.mFunnelLogger) {
        }
    }

    public void addActionToFunnel(String str, double d, String str2, String str3, ReadableMap readableMap) {
        Object A0j;
        if (str.equals("IG_SETTINGS_FUNNEL")) {
            A0j = AnonymousClass14Y.A00.get(str);
        } else {
            A0j = C86114wI.A0j(str);
        }
        if (A0j != null) {
            synchronized (this.mFunnelLogger) {
            }
        }
    }

    public IgReactFunnelLoggerModule(IPD ipd, C10300i6 r3) {
        super(ipd);
        this.mFunnelLogger = C131607sT.A00(r3).A00;
    }

    public void addFunnelTag(String str, double d, String str2) {
        if (C86114wI.A0j(str) != null) {
            synchronized (this.mFunnelLogger) {
            }
        }
    }

    public void cancelFunnel(String str, double d) {
        if (C86114wI.A0j(str) != null) {
            synchronized (this.mFunnelLogger) {
            }
        }
    }

    public void endFunnel(String str, double d) {
        if (C86114wI.A0j(str) != null) {
            synchronized (this.mFunnelLogger) {
            }
        }
    }

    public void startFunnel(String str, double d) {
        if (C86114wI.A0j(str) != null) {
            synchronized (this.mFunnelLogger) {
            }
        }
    }
}
