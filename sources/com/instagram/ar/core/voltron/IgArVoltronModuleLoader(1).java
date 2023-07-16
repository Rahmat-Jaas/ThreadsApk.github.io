package com.instagram.ar.core.voltron;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C109106jT;
import X.C1189272v;
import X.C125597da;
import X.C145178k0;
import X.C18190wL;
import X.C28979FfK;
import X.C86134wK;
import java.util.Map;

public class IgArVoltronModuleLoader {
    public static final String CAFFE2_VOLTRON_MODULE_NAME = "caffe2";
    public static final String TAG = "IgArVoltronModuleLoader";
    public static IgArVoltronModuleLoader sInstance;
    public final Map mLoaderMap = AnonymousClass0wJ.A0y();
    public final C10300i6 mSession;

    public synchronized C109106jT getModuleLoader(C28979FfK ffK) {
        C109106jT r1;
        r1 = (C109106jT) this.mLoaderMap.get(ffK);
        if (r1 == null) {
            r1 = new C109106jT(this.mSession);
            this.mLoaderMap.put(ffK, r1);
        }
        return r1;
    }

    public static synchronized IgArVoltronModuleLoader getInstance(C10300i6 r2) {
        IgArVoltronModuleLoader igArVoltronModuleLoader;
        Class<IgArVoltronModuleLoader> cls = IgArVoltronModuleLoader.class;
        synchronized (cls) {
            igArVoltronModuleLoader = (IgArVoltronModuleLoader) C86134wK.A0f(r2, cls, 4);
            sInstance = igArVoltronModuleLoader;
        }
        return igArVoltronModuleLoader;
    }

    public static /* synthetic */ IgArVoltronModuleLoader lambda$getInstance$0(C10300i6 r1) {
        return new IgArVoltronModuleLoader(r1);
    }

    public IgArVoltronModuleLoader(C10300i6 r2) {
        this.mSession = r2;
    }

    public void loadModule(String str, C145178k0 r7) {
        for (C28979FfK ffK : C28979FfK.values()) {
            if (ffK.A01.equals(str)) {
                C109106jT moduleLoader = getModuleLoader(ffK);
                C125597da r1 = new C125597da(r7, this, ffK);
                synchronized (moduleLoader) {
                    r1.onSuccess(C1189272v.A00);
                }
                return;
            }
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid module name: ", str));
    }
}
