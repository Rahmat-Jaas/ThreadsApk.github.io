package org.pytorch;

import X.AnonymousClass0qM;
import X.C145668kt;
import com.facebook.jni.HybridData;
import java.util.Map;

public class NativePeer implements C145668kt {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str, Map map, int i);

    public static native HybridData initHybridAndroidAsset(String str, Object obj, int i);

    public native IValue forward(IValue... iValueArr);

    public native IValue runMethod(String str, IValue... iValueArr);

    static {
        AnonymousClass0qM.A02("pytorch_jni");
        try {
            AnonymousClass0qM.A02("torch-code-gen");
        } catch (Throwable unused) {
        }
    }
}
