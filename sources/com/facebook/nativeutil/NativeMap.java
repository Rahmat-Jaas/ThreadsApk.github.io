package com.facebook.nativeutil;

import X.AnonymousClass0qM;
import X.AnonymousClass0wJ;
import X.AnonymousClass6HK;
import X.C18190wL;
import X.C18200wM;
import X.C86124wJ;
import X.C86134wK;
import com.facebook.jni.HybridData;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class NativeMap extends AbstractMap<String, Object> {
    public final HybridData mHybridData = initHybridData();

    public static native HybridData initHybridData();

    private native void putBoolean(String str, boolean z);

    private native void putDouble(String str, double d);

    private native void putInt(String str, int i);

    private native void putNativeList(String str, NativeList nativeList);

    private native void putNativeMap(String str, NativeMap nativeMap);

    private native void putNull(String str);

    private native void putString(String str, String str2);

    public native Map consumeMap();

    static {
        AnonymousClass0qM.A02("nativeutil-jni");
    }

    public Set entrySet() {
        throw C86134wK.A0s("not implemented");
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        Object A00 = AnonymousClass6HK.A00(obj2);
        if (A00 == null) {
            putNull(str);
            return obj2;
        } else if (A00 instanceof Boolean) {
            putBoolean(str, AnonymousClass0wJ.A1X(A00));
            return obj2;
        } else if (A00 instanceof Integer) {
            putInt(str, AnonymousClass0wJ.A04(A00));
            return obj2;
        } else if (A00 instanceof Number) {
            putDouble(str, C86124wJ.A00(A00));
            return obj2;
        } else if (A00 instanceof String) {
            putString(str, (String) A00);
            return obj2;
        } else if (A00 instanceof NativeMap) {
            putNativeMap(str, (NativeMap) A00);
            return obj2;
        } else if (A00 instanceof NativeList) {
            putNativeList(str, (NativeList) A00);
            return obj2;
        } else {
            throw C18190wL.A0a(C18200wM.A0m(A00.getClass(), C18190wL.A0s("Could not convert ")));
        }
    }

    public NativeMap(Map map) {
        putAll(map);
    }

    public NativeMap() {
    }
}
