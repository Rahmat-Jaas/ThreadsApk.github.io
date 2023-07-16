package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0EN  reason: invalid class name */
public final class AnonymousClass0EN extends C16980u6 {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if ((r2 & 16) != 16) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r4.A00 == X.AnonymousClass006.A01) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01(android.content.Context r15, android.content.Intent r16, android.content.pm.ComponentInfo r17, java.lang.String r18) {
        /*
            r14 = this;
            r5 = r17
            boolean r0 = r5.exported
            java.lang.String r3 = "AccessibleByAnyAppIntentScope"
            r4 = 2
            r6 = 0
            r7 = 1
            r11 = r18
            if (r0 == 0) goto L_0x0034
            if (r18 == 0) goto L_0x009b
            android.content.pm.PackageManager r0 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0020 }
            android.content.pm.PermissionInfo r0 = r0.getPermissionInfo(r11, r6)     // Catch:{ NameNotFoundException -> 0x0020 }
            int r2 = r0.protectionLevel     // Catch:{ NameNotFoundException -> 0x0020 }
            r1 = 16
            r0 = r2 & 2
            if (r0 == r4) goto L_0x0034
            goto L_0x0030
        L_0x0020:
            r2 = move-exception
            boolean r0 = r14.A0F()
            if (r0 != 0) goto L_0x0080
            X.0su r4 = r14.A00
            monitor-enter(r4)
            java.lang.Integer r1 = r4.A00     // Catch:{ all -> 0x002d }
            goto L_0x007b
        L_0x002d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0030:
            r0 = r2 & 16
            if (r0 != r1) goto L_0x009b
        L_0x0034:
            boolean r0 = r14.A0F()
            if (r0 == 0) goto L_0x009a
            r2 = 0
            X.374 r4 = X.AnonymousClass3JH.A00(r16)     // Catch:{ JSONException -> 0x005f }
            r13 = r2
            if (r4 == 0) goto L_0x0064
            X.0si r1 = r14.A02
            java.lang.String r8 = r5.packageName
            java.lang.String r9 = r5.name
            boolean r0 = r5.exported
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r12 = r15.getPackageName()
            org.json.JSONObject r0 = r4.A01
            java.lang.String r13 = r0.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r0 = "Fail-open: allowing non-public component %s/%s: exported=%s, permission=%s for context package %s from intent %s"
            goto L_0x0092
        L_0x005f:
            r0 = move-exception
            java.lang.String r13 = r0.getMessage()
        L_0x0064:
            X.0si r1 = r14.A02
            java.lang.String r8 = r5.packageName
            java.lang.String r9 = r5.name
            boolean r0 = r5.exported
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r12 = r15.getPackageName()
            java.lang.Object[] r4 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r0 = "Fail-open: allowing non-public component %s/%s: exported=%s, permission=%s for context package %s with error in intent parser %s"
            goto L_0x0092
        L_0x007b:
            monitor-exit(r4)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x009a
        L_0x0080:
            X.0si r1 = r14.A02
            java.lang.String r6 = r5.packageName
            java.lang.String r4 = r5.name
            boolean r0 = r5.exported
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r4, r0, r11}
            java.lang.String r0 = "Error checking permission for %s/%s but fail-open: exported=%s, permission=%s."
        L_0x0092:
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r1.Ccw(r3, r0, r2)
            return r7
        L_0x009a:
            return r6
        L_0x009b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EN.A01(android.content.Context, android.content.Intent, android.content.pm.ComponentInfo, java.lang.String):boolean");
    }

    public final Intent A09(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    public final List A0D(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean A0G(Context context, PackageInfo packageInfo) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass0EN(C16350su r1, C16250sj r2, C16240si r3) {
        super(r1, r2, r3);
    }

    private Intent A00(Intent intent, List list, boolean z) {
        if (list.isEmpty()) {
            this.A02.Ccw("AccessibleByAnyAppIntentScope", "No matching public components.", (Throwable) null);
            return null;
        }
        if (z) {
            if (list.size() > 1) {
                C16360sv.A00(intent, this.A02, A0F());
                return C16980u6.A02(C16980u6.A06(intent, list));
            }
            ComponentInfo componentInfo = (ComponentInfo) list.get(0);
            intent.setComponent(new ComponentName(componentInfo.packageName, componentInfo.name));
        }
        C16360sv.A00(intent, this.A02, A0F());
        return intent;
    }

    public final Intent A08(Context context, Intent intent, String str) {
        List A04 = C16980u6.A04(context, intent, 65600);
        if (!A04.isEmpty() || !intent.hasExtra("expect_activity_not_found")) {
            boolean z = false;
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = (ActivityInfo) it.next();
                if (!A01(context, intent, activityInfo, activityInfo.permission)) {
                    z = true;
                    it.remove();
                }
            }
            return A00(intent, A04, z);
        }
        C16360sv.A00(intent, this.A02, A0F());
        return intent;
    }

    public final Intent A0A(Context context, Intent intent, String str) {
        List A05 = C16980u6.A05(context, intent, 65600);
        Iterator it = A05.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ServiceInfo serviceInfo = (ServiceInfo) it.next();
            if (!A01(context, intent, serviceInfo, serviceInfo.permission)) {
                z = true;
                it.remove();
            }
        }
        return A00(intent, A05, z);
    }

    public final Integer A0B() {
        return AnonymousClass006.A0Y;
    }
}
