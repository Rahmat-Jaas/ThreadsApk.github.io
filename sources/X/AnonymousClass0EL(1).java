package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: X.0EL  reason: invalid class name */
public abstract class AnonymousClass0EL extends C16980u6 {
    public abstract boolean A0H(Context context, ComponentInfo componentInfo);

    public final Intent A09(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    public final List A0D(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean A0G(Context context, PackageInfo packageInfo) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass0EL(C16350su r1, C16250sj r2, C16240si r3) {
        super(r1, r2, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r2 == X.AnonymousClass006.A01) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent A00(android.content.Context r9, android.content.Intent r10, java.util.List r11) {
        /*
            r8 = this;
            int r0 = r11.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r7 = r11.iterator()
        L_0x000d:
            boolean r0 = r7.hasNext()
            java.lang.String r5 = "DifferentKeyIntentScope"
            r4 = 0
            if (r0 == 0) goto L_0x008a
            java.lang.Object r6 = r7.next()
            android.content.pm.ComponentInfo r6 = (android.content.pm.ComponentInfo) r6
            boolean r0 = r8.A0H(r9, r6)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r8.A0F()
            if (r0 == 0) goto L_0x0046
            r3.add(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Non-external/third-party component detected, but allowing because of fail-open: "
        L_0x0032:
            r1.append(r0)
            java.lang.String r0 = X.C16980u6.A03(r10)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.0si r0 = r8.A02
            r0.Ccw(r5, r1, r4)
            goto L_0x000d
        L_0x0046:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Removed non-external/third-party component: "
            goto L_0x0032
        L_0x004e:
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            if (r0 == 0) goto L_0x0083
            java.lang.String r1 = r0.className
            java.lang.String r0 = "com.android.internal.app.ResolverActivity"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0083
            boolean r0 = r8.A0F()
            if (r0 != 0) goto L_0x006d
            X.0su r1 = r8.A00
            monitor-enter(r1)
            java.lang.Integer r2 = r1.A00     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r0 = 0
            if (r2 != r1) goto L_0x006e
        L_0x006d:
            r0 = 1
        L_0x006e:
            if (r0 == 0) goto L_0x007b
            r3.add(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Found potentially dangerous resolver but not removing: "
            goto L_0x0032
        L_0x007b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Removed potentially dangerous resolver: "
            goto L_0x0032
        L_0x0083:
            r3.add(r6)
            goto L_0x000d
        L_0x0087:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x008a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00b9
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 30
            java.lang.String r3 = "No matching different-signature components for: "
            if (r1 < r0) goto L_0x00e9
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x00e9
            X.0si r2 = r8.A02
            java.lang.String r1 = X.C16980u6.A03(r10)
            java.lang.String r0 = " on API 30+ device. Intent target is not in any PackageFinder aware app, so it's probably a non-FB app. Attempting to proceed."
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r1, r0)
            r2.Ccw(r5, r0, r4)
        L_0x00b1:
            boolean r0 = r8.A0F()
            X.C16360sv.A00(r10, r2, r0)
            return r10
        L_0x00b9:
            int r1 = r3.size()
            int r0 = r11.size()
            if (r1 == r0) goto L_0x00d2
            int r1 = r3.size()
            r0 = 1
            if (r1 <= r0) goto L_0x00d5
            java.util.List r0 = X.C16980u6.A06(r10, r3)
            android.content.Intent r10 = X.C16980u6.A02(r0)
        L_0x00d2:
            X.0si r2 = r8.A02
            goto L_0x00b1
        L_0x00d5:
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            android.content.pm.ComponentInfo r0 = (android.content.pm.ComponentInfo) r0
            java.lang.String r2 = r0.packageName
            java.lang.String r1 = r0.name
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            r10.setComponent(r0)
            goto L_0x00d2
        L_0x00e9:
            X.0si r1 = r8.A02
            java.lang.String r0 = X.C16980u6.A03(r10)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r3, r0)
            r1.Ccw(r5, r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EL.A00(android.content.Context, android.content.Intent, java.util.List):android.content.Intent");
    }

    public final Intent A08(Context context, Intent intent, String str) {
        if (C16980u6.A07(context, intent)) {
            return null;
        }
        List A04 = C16980u6.A04(context, intent, 65600);
        if (A04.isEmpty()) {
            A04 = C16980u6.A04(context, intent, 0);
        }
        return A00(context, intent, A04);
    }

    public final Intent A0A(Context context, Intent intent, String str) {
        if (C16980u6.A07(context, intent)) {
            return null;
        }
        List A05 = C16980u6.A05(context, intent, 65600);
        if (A05.isEmpty()) {
            A05 = C16980u6.A05(context, intent, 0);
        }
        return A00(context, intent, A05);
    }
}
