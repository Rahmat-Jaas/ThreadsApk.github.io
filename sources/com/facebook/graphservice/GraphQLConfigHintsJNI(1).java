package com.facebook.graphservice;

import X.AnonymousClass0qM;
import com.facebook.jni.HybridData;
import java.util.Map;

public class GraphQLConfigHintsJNI {
    public HybridData mHybridData;

    public static native HybridData initHybridData(int i, int i2, Map map, int i3, boolean z, String str, String str2, String str3, boolean z2, String[] strArr, int i4, boolean z3, boolean z4, boolean z5, boolean z6, Map map2, String str4, String str5, int i5);

    static {
        AnonymousClass0qM.A02("graphservice-jni");
    }
}
