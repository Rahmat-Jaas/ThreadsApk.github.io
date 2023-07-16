package com.facebook.nativeutil;

import X.AnonymousClass0qM;
import X.AnonymousClass0wJ;
import X.AnonymousClass6HK;
import X.C18190wL;
import X.C18200wM;
import X.C86124wJ;
import com.facebook.jni.HybridData;
import java.util.List;

public class NativeList {
    public final HybridData mHybridData;

    private native void addBoolean(boolean z);

    private native void addDouble(double d);

    private native void addInt(int i);

    private native void addNativeList(NativeList nativeList);

    private native void addNativeMap(NativeMap nativeMap);

    private native void addNull();

    private native void addString(String str);

    public static native HybridData initHybridData();

    public native List consumeList();

    static {
        AnonymousClass0qM.A02("nativeutil-jni");
    }

    public NativeList(List list) {
        this.mHybridData = initHybridData();
        if (list != null) {
            for (Object A00 : list) {
                Object A002 = AnonymousClass6HK.A00(A00);
                if (A002 == null) {
                    addNull();
                } else if (A002 instanceof Boolean) {
                    addBoolean(AnonymousClass0wJ.A1X(A002));
                } else if (A002 instanceof Integer) {
                    addInt(AnonymousClass0wJ.A04(A002));
                } else if (A002 instanceof Number) {
                    addDouble(C86124wJ.A00(A002));
                } else if (A002 instanceof String) {
                    addString((String) A002);
                } else if (A002 instanceof NativeMap) {
                    addNativeMap((NativeMap) A002);
                } else if (A002 instanceof NativeList) {
                    addNativeList((NativeList) A002);
                } else {
                    throw C18190wL.A0a(C18200wM.A0m(A002.getClass(), C18190wL.A0s("Could not convert ")));
                }
            }
        }
    }

    public NativeList(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
