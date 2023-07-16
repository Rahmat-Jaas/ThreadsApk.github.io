package com.facebook.papaya.fb.client.executor.generic;

import X.C04220Ms;
import X.C15020qa;
import com.facebook.jni.HybridClassBase;
import java.util.Map;

public final class GenericDatasetFactory extends HybridClassBase {
    public GenericDatasetFactory(long j, String str, boolean z, long[] jArr, Map map, String str2) {
        C04220Ms.A0B(str, 2);
        C15020qa.A0A("papaya-fb-generic-executor");
        initHybrid(j, str, z, jArr, map, str2);
    }

    private final native void initHybrid(long j, String str, boolean z, long[] jArr, Map map, String str2);
}
