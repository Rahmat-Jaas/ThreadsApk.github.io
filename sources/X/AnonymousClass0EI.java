package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0EI  reason: invalid class name */
public abstract class AnonymousClass0EI extends C16980u6 {
    public final String A00;
    public final C15780rs A01;

    public abstract Integer A0B();

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent A00(android.content.Context r10, android.content.Intent r11, java.lang.String r12, java.util.List r13) {
        /*
            r9 = this;
            X.0si r6 = r9.A02
            X.AnonymousClass0sB.A02(r10, r11, r6, r12)
            int r0 = r13.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r13.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.next()
            android.content.pm.ComponentInfo r1 = (android.content.pm.ComponentInfo) r1
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo
            boolean r0 = r9.A01(r10, r0)
            if (r0 == 0) goto L_0x0012
            r3.add(r1)
            goto L_0x0012
        L_0x002a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r9.A00
            java.lang.String r1 = "No matching packages available."
            r0 = 0
            r6.Ccw(r2, r1, r0)
            return r0
        L_0x0039:
            java.lang.Integer r7 = r9.A03
            r1 = 1
            r0 = 0
            java.lang.Object r5 = r3.get(r0)
            android.content.pm.ComponentInfo r5 = (android.content.pm.ComponentInfo) r5
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x007a
            java.util.Iterator r8 = r3.iterator()
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r4 = r8.next()
            android.content.pm.ComponentInfo r4 = (android.content.pm.ComponentInfo) r4
            java.lang.String r0 = r4.packageName     // Catch:{ SecurityException -> 0x0064 }
            boolean r0 = X.C15980sH.A06(r10, r0)     // Catch:{ SecurityException -> 0x0064 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0072
            goto L_0x0075
        L_0x0064:
            r3 = move-exception
            java.lang.String r2 = r9.A00
            java.lang.String r1 = "Error verifying the signature for "
            java.lang.String r0 = r4.packageName
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r6.Ccw(r2, r0, r3)
        L_0x0072:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x0077
        L_0x0075:
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x0077:
            if (r7 != r0) goto L_0x004d
            r5 = r4
        L_0x007a:
            java.lang.String r2 = r5.packageName
            java.lang.String r1 = r5.name
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            r11.setComponent(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EI.A00(android.content.Context, android.content.Intent, java.lang.String, java.util.List):android.content.Intent");
    }

    private boolean A01(Context context, ApplicationInfo applicationInfo) {
        String str = applicationInfo.packageName;
        C15780rs r2 = this.A01;
        boolean z = true;
        if (!TextUtils.isEmpty(str) && r2.A01.isEmpty()) {
            Iterator it = r2.A00.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Set) it.next()).contains(str)) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            if (A0F()) {
                this.A02.Ccw(this.A00, AnonymousClass00U.A0L(str, " is not an app matching the targeted app filter, but fail-open."), (Throwable) null);
            }
            return false;
        }
        try {
            if (!r2.A06(C15780rs.A00(context, applicationInfo.uid), C15980sH.A04(context))) {
                if (A0F()) {
                    this.A02.Ccw(this.A00, AnonymousClass00U.A0L(str, " is not an app matching the targeted app filter, but fail-open."), (Throwable) null);
                    return true;
                }
                return false;
            }
        } catch (SecurityException e) {
            this.A02.Ccw(this.A00, AnonymousClass00U.A0L("Unexpected exception in checking trusted app for ", str), e);
            return !A0E();
        }
        return true;
    }

    public final List A0D(Context context, Intent intent, String str) {
        C16240si r4 = this.A02;
        AnonymousClass0sB.A02(context, intent, r4, str);
        List A0C = A0C(context, intent);
        if (A0C.isEmpty()) {
            r4.Ccw(this.A00, "No matching packages available.", (Throwable) null);
        }
        return A0C;
    }

    public final boolean A0G(Context context, PackageInfo packageInfo) {
        return A01(context, packageInfo.applicationInfo);
    }

    public AnonymousClass0EI(C16350su r1, C16250sj r2, C16240si r3, C15780rs r4, String str) {
        super(r1, r2, r3);
        this.A00 = str;
        this.A01 = r4;
    }

    public final Intent A08(Context context, Intent intent, String str) {
        return A00(context, intent, str, C16980u6.A04(context, intent, 65600));
    }

    public final Intent A09(Context context, Intent intent, String str) {
        int i;
        int i2 = context.getApplicationInfo().uid;
        C16050sO A002 = AnonymousClass0sB.A00(context, intent);
        if (A002 == null) {
            i = -1;
        } else {
            i = A002.A00;
        }
        if (this.A01.A06(A002, C15980sH.A04(context))) {
            return intent;
        }
        String format = String.format("Access denied. Process %d cannot receive broadcasts from %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)});
        this.A02.Ccw(this.A00, format, new SecurityException(format));
        return null;
    }

    public final Intent A0A(Context context, Intent intent, String str) {
        return A00(context, intent, str, C16980u6.A05(context, intent, 65600));
    }
}
