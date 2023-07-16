package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3yQ  reason: invalid class name and case insensitive filesystem */
public final class C66843yQ implements C84814tu {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final SparseArray A04;
    public final C83284r8 A05;
    public final C83284r8 A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final HashMap A0A;
    public final List A0B;
    public final Map A0C;
    public final Map A0D;
    public final Map A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final String Ax4() {
        return "legacy_screen";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C66843yQ A01(android.os.Bundle r32) {
        /*
            r5 = r32
            java.lang.String r0 = "BloksSurfaceProps_isFlattenedBundle"
            r12 = 0
            boolean r0 = r5.getBoolean(r0, r12)
            r9 = 0
            java.lang.String r11 = "BloksSurfaceProps"
            if (r0 != 0) goto L_0x0015
            android.os.Bundle r5 = r5.getBundle(r11)
            if (r5 != 0) goto L_0x0015
            return r9
        L_0x0015:
            java.lang.String r0 = "BloksSurfaceProps_params"
            java.io.Serializable r4 = r5.getSerializable(r0)
            r1 = -1
            java.lang.String r0 = "BloksSurfaceProps_ttrcListener"
            int r7 = r5.getInt(r0, r1)
            java.lang.String r0 = "BloksSurfaceProps_clientTreeParameters"
            java.lang.Integer r0 = X.C18210wN.A0T(r5, r0)
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            java.lang.Object r3 = X.C62533aC.A02(r6, r0)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r0 = "BloksSurfaceProps_externalVariables"
            java.lang.Integer r0 = X.C18210wN.A0T(r5, r0)
            java.lang.Object r2 = X.C62533aC.A02(r6, r0)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r0 = "BloksSurfaceProps_objectSet"
            java.lang.Integer r1 = X.C18210wN.A0T(r5, r0)
            java.lang.Class<android.util.SparseArray> r0 = android.util.SparseArray.class
            java.lang.Object r14 = X.C62533aC.A02(r0, r1)
            android.util.SparseArray r14 = (android.util.SparseArray) r14
            java.lang.String r0 = "BloksSurfaceProps_screenModel"
            java.lang.Integer r1 = X.C18210wN.A0T(r5, r0)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r17 = X.C62533aC.A02(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Object r1 = X.C62533aC.A02(r0, r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "BloksSurfaceProps_analyticsExtras"
            java.lang.Integer r0 = X.C18210wN.A0T(r5, r0)
            java.lang.Object r0 = X.C62533aC.A02(r6, r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r6 = "BloksSurfaceProps_fromConfigChanges"
            boolean r10 = r5.getBoolean(r6)
            java.lang.String r6 = "BloksSurfaceProps_containsExternalVariables"
            boolean r7 = r5.getBoolean(r6)
            java.lang.String r6 = "BloksSurfaceProps_containsClientParameters"
            boolean r13 = r5.getBoolean(r6)
            java.lang.String r6 = "BloksSurfaceProps_appId"
            java.lang.String r8 = r5.getString(r6)
            if (r7 == 0) goto L_0x012d
            if (r2 == 0) goto L_0x0090
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x012d
        L_0x0090:
            r7 = 1
        L_0x0091:
            if (r13 == 0) goto L_0x0127
            if (r3 == 0) goto L_0x009b
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x0127
        L_0x009b:
            if (r7 == 0) goto L_0x0123
            java.lang.String r13 = "clientParams & external variables"
        L_0x009f:
            java.lang.String r6 = "Expected non empty "
            java.lang.StringBuilder r7 = X.C18190wL.A0s(r6)
            r7.append(r13)
            java.lang.String r6 = "for appId: "
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = " fromConfigChange: "
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r6 = 1
            X.C30967GcS.A01(r9, r11, r7, r9, r6)
        L_0x00c0:
            boolean r6 = r4 instanceof java.util.HashMap
            if (r6 == 0) goto L_0x0121
            java.util.HashMap r4 = (java.util.HashMap) r4
        L_0x00c6:
            if (r3 != 0) goto L_0x00cc
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
        L_0x00cc:
            if (r2 != 0) goto L_0x00d2
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
        L_0x00d2:
            java.lang.String r6 = "BloksSurfaceProps_markerId"
            int r26 = r5.getInt(r6)
            java.lang.String r6 = "BloksSurfaceProps_instanceId"
            int r25 = r5.getInt(r6)
            r6 = 86400(0x15180, double:4.26873E-319)
            java.lang.String r11 = "BloksSurfaceProps_preloadTtl"
            long r29 = r5.getLong(r11, r6)
            java.lang.String r6 = "BloksSurfaceProps_cacheKey"
            java.lang.String r19 = r5.getString(r6, r9)
            java.lang.String r6 = "BloksSurfaceProps_backupStartTimeStamp"
            long r27 = r5.getLong(r6)
            if (r1 != 0) goto L_0x00f9
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
        L_0x00f9:
            if (r0 != 0) goto L_0x00ff
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
        L_0x00ff:
            java.lang.String r6 = "BloksSurfaceProps_lifecycleOnNavigateTo"
            X.4r8 r16 = X.C122117Ki.A02(r5, r6)
            java.lang.String r6 = "BloksSurfaceProps_lifecycleOnNavigateFrom"
            X.4r8 r15 = X.C122117Ki.A02(r5, r6)
            X.3yQ r13 = new X.3yQ
            r24 = r2
            r31 = r12
            r32 = r10
            r21 = r1
            r22 = r0
            r23 = r3
            r18 = r8
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)
            return r13
        L_0x0121:
            r4 = r9
            goto L_0x00c6
        L_0x0123:
            java.lang.String r13 = "clientParams"
            goto L_0x009f
        L_0x0127:
            if (r7 == 0) goto L_0x00c0
            java.lang.String r13 = "external variables"
            goto L_0x009f
        L_0x012d:
            r7 = 0
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66843yQ.A01(android.os.Bundle):X.3yQ");
    }

    public static void A02(Bundle bundle, C63113bW r4, int i) {
        C66843yQ r2 = r4.A05;
        bundle.putString("__nav_data_type", "legacy_screen");
        if (i != 0) {
            bundle.putBoolean("BloksSurfaceProps_isFlattenedBundle", true);
            bundle.putAll(A00(r2, true));
            return;
        }
        bundle.putBundle("BloksSurfaceProps", A00(r2, true));
    }

    public static void A03(Bundle bundle, C66843yQ r4, boolean z) {
        if (r4 != null) {
            bundle.putString("__nav_data_type", "legacy_screen");
            if (z) {
                bundle.putBoolean("BloksSurfaceProps_isFlattenedBundle", true);
                bundle.putAll(A00(r4, false));
                return;
            }
            bundle.putBundle("BloksSurfaceProps", A00(r4, false));
        }
    }

    public final String AQz() {
        return this.A08;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C66843yQ)) {
            return false;
        }
        C66843yQ r5 = (C66843yQ) obj;
        String str = this.A08;
        String str2 = r5.A08;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.A0A.equals(r5.A0A)) {
            return false;
        }
        String str3 = this.A09;
        boolean isEmpty = TextUtils.isEmpty(str3);
        String str4 = r5.A09;
        if (isEmpty) {
            equals = TextUtils.isEmpty(str4);
        } else {
            equals = str3.equals(str4);
        }
        if (equals) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.A08;
        HashMap hashMap = this.A0A;
        String str2 = this.A09;
        int A062 = (AnonymousClass0wJ.A06(str) * 31) + C18200wM.A07(hashMap);
        if (!TextUtils.isEmpty(str2)) {
            return C18210wN.A05(str2, A062 * 31);
        }
        return A062;
    }

    public static Bundle A00(C66843yQ r4, boolean z) {
        long j;
        String str;
        String str2;
        Bundle A062 = C18180wK.A06();
        A062.putString("BloksSurfaceProps_appId", r4.A08);
        A062.putSerializable("BloksSurfaceProps_params", r4.A0A);
        A062.putInt("BloksSurfaceProps_markerId", r4.A01);
        A062.putInt("BloksSurfaceProps_instanceId", r4.A00);
        A062.putLong("BloksSurfaceProps_preloadTtl", r4.A03);
        Map map = r4.A0E;
        A062.putBoolean("BloksSurfaceProps_containsExternalVariables", !map.isEmpty());
        A062.putInt("BloksSurfaceProps_externalVariables", C62533aC.A00(map));
        Map map2 = r4.A0D;
        A062.putInt("BloksSurfaceProps_clientTreeParameters", C62533aC.A00(map2));
        A062.putBoolean("BloksSurfaceProps_containsClientParameters", !map2.isEmpty());
        A062.putString("BloksSurfaceProps_cacheKey", r4.A09);
        if (z) {
            j = -1;
        } else {
            j = r4.A02;
        }
        A062.putLong("BloksSurfaceProps_backupStartTimeStamp", j);
        A062.putInt("BloksSurfaceProps_ttrcListener", C62533aC.A00(r4.A0B));
        A062.putBoolean("BloksSurfaceProps_fromConfigChanges", z);
        SparseArray sparseArray = r4.A04;
        if (sparseArray != null) {
            A062.putInt("BloksSurfaceProps_objectSet", C62533aC.A00(sparseArray));
        }
        Object obj = r4.A07;
        if (obj != null) {
            A062.putInt("BloksSurfaceProps_screenModel", C62533aC.A00(obj));
        }
        A062.putInt("BloksSurfaceProps_analyticsExtras", C62533aC.A00(r4.A0C));
        C83284r8 r2 = r4.A06;
        if (r2 != null) {
            r2.CxA(A062, "BloksSurfaceProps_lifecycleOnNavigateTo");
            String A0L = AnonymousClass00U.A0L("CALLBACK_TYPE_PREFIX_", "BloksSurfaceProps_lifecycleOnNavigateTo");
            if (r2.BIw().intValue() != 0) {
                str2 = "NATIVE";
            } else {
                str2 = "BLOKS";
            }
            A062.putString(A0L, str2);
        }
        C83284r8 r22 = r4.A05;
        if (r22 != null) {
            r22.CxA(A062, "BloksSurfaceProps_lifecycleOnNavigateFrom");
            String A0L2 = AnonymousClass00U.A0L("CALLBACK_TYPE_PREFIX_", "BloksSurfaceProps_lifecycleOnNavigateFrom");
            if (r22.BIw().intValue() != 0) {
                str = "NATIVE";
            } else {
                str = "BLOKS";
            }
            A062.putString(A0L2, str);
        }
        A062.putBoolean("BloksSurfaceProps_syncScreen", r4.A0G);
        return A062;
    }

    public C66843yQ(SparseArray sparseArray, C83284r8 r13, C83284r8 r14, Object obj, String str, String str2, HashMap hashMap, List list, Map map, Map map2, Map map3, int i, int i2, long j, long j2, boolean z, boolean z2) {
        Map map4 = map;
        Map map5 = map3;
        Map map6 = map2;
        long j3 = j2;
        int i3 = i;
        long j4 = j;
        int i4 = i2;
        String str3 = str;
        this.A08 = str3;
        this.A0A = hashMap == null ? AnonymousClass0wJ.A0y() : hashMap;
        this.A0D = map2 == null ? AnonymousClass0wJ.A0y() : map6;
        this.A0E = map3 == null ? AnonymousClass0wJ.A0y() : map5;
        this.A01 = i2 <= 0 ? 719983200 : i4;
        String str4 = str2;
        if (i3 == -1) {
            i3 = (AnonymousClass0wJ.A06(str3) * 31) + C18200wM.A07(hashMap);
            i3 = !TextUtils.isEmpty(str4) ? C18210wN.A05(str4, i3 * 31) : i3;
            synchronized (AnonymousClass3QR.class) {
                LruCache lruCache = AnonymousClass3QR.A00;
                Integer valueOf = Integer.valueOf(i3);
                Integer num = (Integer) lruCache.get(valueOf);
                i3 = num != null ? (num.intValue() + 1) * 31 : i3;
                lruCache.put(valueOf, Integer.valueOf(i3));
            }
        }
        this.A00 = i3;
        this.A03 = j2 == -1 ? SandboxRepository.CACHE_TTL : j3;
        this.A09 = str4;
        this.A02 = j == -1 ? AwakeTimeSinceBootClock.INSTANCE.now() : j4;
        this.A0B = list;
        this.A0F = z2;
        this.A04 = sparseArray == null ? new SparseArray() : sparseArray;
        this.A07 = obj;
        this.A0C = map == null ? AnonymousClass0wJ.A0y() : map4;
        this.A06 = r14;
        this.A05 = r13;
        this.A0G = z;
    }
}
