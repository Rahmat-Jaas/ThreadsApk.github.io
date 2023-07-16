package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.fbpay.w3c.client.W3CClient$2;
import com.fbpay.w3c.client.W3CClient$3;
import com.fbpay.w3c.client.W3CClient$4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7IX  reason: invalid class name */
public final class AnonymousClass7IX {
    public static final C002301a A0A = new AnonymousClass7ZS();
    public ServiceConnection A00 = null;
    public IBinder A01 = null;
    public final Context A02;
    public final C880856r A03 = new C880556o(this);
    public final C880856r A04 = new C880556o(this);
    public final C880856r A05 = new C880556o(this);
    public final FBPaymentServiceAddressCallback A06 = new W3CClient$4(this);
    public final FBPaymentServiceCardDetailsCallback A07 = new W3CClient$2(this);
    public final FBPaymentServiceContactCallback A08 = new W3CClient$3(this);
    public final ArrayList A09;

    public static synchronized void A02(Context context, ServiceConnection serviceConnection, AnonymousClass7IX r3) {
        synchronized (r3) {
            if (!(serviceConnection == null || context == null)) {
                try {
                    context.unbindService(serviceConnection);
                } catch (IllegalArgumentException e) {
                    AnonymousClass0LU.A0E("W3CClient", "Service is already unbound.", e);
                }
            }
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (X.C15980sH.A06(r6, r4.getPackage()) == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.content.Context r6, X.AnonymousClass7IX r7) {
        /*
            java.lang.String r0 = "org.chromium.intent.action.PAY"
            android.content.Intent r4 = X.C18250wR.A05(r0)
            android.content.pm.PackageManager r3 = r6.getPackageManager()
            r0 = 128(0x80, float:1.794E-43)
            java.util.List r0 = r3.queryIntentActivities(r4, r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0014:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r2 = r5.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r0 = r2.activityInfo
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = r0.name
            r4.setClassName(r1, r0)
            android.content.pm.ActivityInfo r0 = r2.activityInfo
            java.lang.String r0 = r0.packageName
            r4.setPackage(r0)
            java.lang.String r0 = r4.getPackage()
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = r4.getPackage()
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r4.getPackage()
            boolean r1 = X.C15980sH.A06(r6, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x0014
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            android.os.Bundle r1 = r2.metaData
            if (r1 == 0) goto L_0x006f
            java.lang.String r0 = "org.chromium.payment_method_names"
            int r1 = r1.getInt(r0)
            if (r1 == 0) goto L_0x006f
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch:{ NameNotFoundException -> 0x0074 }
            android.content.res.Resources r0 = r3.getResourcesForApplication(r0)     // Catch:{ NameNotFoundException -> 0x0074 }
            java.lang.String[] r0 = r0.getStringArray(r1)     // Catch:{ NameNotFoundException -> 0x0074 }
            java.util.HashSet r1 = X.C86114wI.A0t(r0)     // Catch:{ NameNotFoundException -> 0x0074 }
            goto L_0x0078
        L_0x006f:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0078
        L_0x0074:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0078:
            java.util.ArrayList r0 = r7.A09
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            if (r0 != 0) goto L_0x0014
            return r4
        L_0x0081:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IX.A00(android.content.Context, X.7IX):android.content.Intent");
    }

    public final void A03(C143728hD r6) {
        Context context = this.A02;
        Intent A012 = A01(context, this, "org.chromium.intent.action.IS_READY_TO_PAY");
        C122267Ly r2 = new C122267Ly(r6, this);
        if (A012 == null || !C18230wP.A0O().A0A(context, A012, r2)) {
            r6.C3J(false);
        }
    }

    public final boolean A04() {
        return AnonymousClass0wJ.A1W(A01(this.A02, this, "org.chromium.intent.action.IS_READY_TO_PAY"));
    }

    public AnonymousClass7IX(Context context, List list) {
        this.A09 = C18200wM.A0s(list);
        this.A02 = context;
    }

    public static Intent A01(Context context, AnonymousClass7IX r6, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent A002 = A00(context, r6);
        if (A002 != null) {
            Intent A052 = C18250wR.A05(str);
            A052.setPackage(A002.getPackage());
            for (ResolveInfo resolveInfo : packageManager.queryIntentServices(A052, 128)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                A052.setClassName(serviceInfo.packageName, serviceInfo.name);
                if (A052.getPackage() != null) {
                    if (context.getPackageName().equals(A052.getPackage()) && C15980sH.A06(context, A052.getPackage())) {
                        return A052;
                    }
                }
            }
        }
        return null;
    }
}
