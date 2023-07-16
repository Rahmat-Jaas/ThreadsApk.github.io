package com.facebook.mobileconfig;

import X.AnonymousClass0qM;
import android.content.res.AssetManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import java.util.Map;

public class MobileConfigUsingPureJavaDependencies {
    public final HybridData mHybridData;

    public MobileConfigUsingPureJavaDependencies(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, MobileConfigFetcher mobileConfigFetcher, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger) {
        this.mHybridData = initHybrid((AndroidAsyncExecutorFactory) null, mobileConfigFetcher, z, mobileConfigCxxLogger);
    }

    private native MobileConfigManagerHolderImpl createManagerInternal(String str, String str2, String str3, String str4, int i, String str5, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map map, MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, MobileConfigFetcher mobileConfigFetcher, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger);

    public static native void setNetworkService(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, MobileConfigFetcher mobileConfigFetcher, boolean z);

    static {
        AnonymousClass0qM.A02("mobileconfig-jni");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r5.isEmpty() != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.mobileconfig.MobileConfigManagerHolderImpl createManager(java.io.File r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, android.content.res.AssetManager r20, boolean r21, com.facebook.mobileconfig.MobileConfigManagerParamsHolder r22, java.util.Map r23, com.facebook.mobileconfig.MobileConfigManagerHolderImpl r24, X.AnonymousClass35F r25, java.util.concurrent.ScheduledExecutorService r26) {
        /*
            r13 = this;
            java.lang.String r7 = ""
            r9 = 0
            java.lang.String r2 = r14.getPath()
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            com.facebook.mobileconfig.MobileConfigManagerHolderImpl r4 = r1.createManagerInternal(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = 1
            if (r4 == 0) goto L_0x0036
            boolean r0 = r4.isValid()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r14.getAbsolutePath()
            r4.mDataDirPath = r0
            if (r17 == 0) goto L_0x0033
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r4.mHasSessionId = r0
        L_0x0036:
            if (r6 != r2) goto L_0x005c
            java.lang.String r1 = r10.getFamilyDeviceId()
            java.lang.String r0 = "EMPTY_FAMILY_DEVICE_ID"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            if (r4 == 0) goto L_0x005c
            r1 = r25
            r4.mFamilyDeviceIdProvider = r1
            r5 = r26
            r4.mScheduledExecutor = r5
            r0 = 30
            X.4Sm r3 = new X.4Sm
            r3.<init>(r4, r1, r5, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 100
            r5.schedule(r3, r0, r2)
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mobileconfig.MobileConfigUsingPureJavaDependencies.createManager(java.io.File, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, android.content.res.AssetManager, boolean, com.facebook.mobileconfig.MobileConfigManagerParamsHolder, java.util.Map, com.facebook.mobileconfig.MobileConfigManagerHolderImpl, X.35F, java.util.concurrent.ScheduledExecutorService):com.facebook.mobileconfig.MobileConfigManagerHolderImpl");
    }
}
