package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.6qI  reason: invalid class name and case insensitive filesystem */
public final class C112846qI {
    public C105156cy A00;
    public Boolean A01;
    public final AnonymousClass7oF A02;
    public final boolean A03;
    public final /* synthetic */ FirebaseInstanceId A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        if (r0 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A00() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Boolean r0 = r2.A01     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x000a
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x000a:
            boolean r0 = r2.A03     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0028
            com.google.firebase.iid.FirebaseInstanceId r0 = r2.A04     // Catch:{ all -> 0x002b }
            X.7Id r0 = r0.A02     // Catch:{ all -> 0x002b }
            X.C121787Id.A01(r0)     // Catch:{ all -> 0x002b }
            X.7oM r0 = r0.A03     // Catch:{ all -> 0x002b }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x002b }
            X.6kj r1 = (X.C109856kj) r1     // Catch:{ all -> 0x002b }
            monitor-enter(r1)     // Catch:{ all -> 0x002b }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0022 }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0025
        L_0x0022:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0025:
            r1 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            monitor-exit(r2)
            return r1
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112846qI.A00():boolean");
    }

    public C112846qI(AnonymousClass7oF r8, FirebaseInstanceId firebaseInstanceId) {
        boolean z;
        Boolean bool;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.A04 = firebaseInstanceId;
        this.A02 = r8;
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessaging");
        } catch (ClassNotFoundException unused) {
            C121787Id r0 = firebaseInstanceId.A02;
            C121787Id.A01(r0);
            Context context = r0.A00;
            Intent A05 = C18250wR.A05("com.google.firebase.MESSAGING_EVENT");
            A05.setPackage(context.getPackageName());
            ResolveInfo resolveService = context.getPackageManager().resolveService(A05, 0);
            z = (resolveService == null || resolveService.serviceInfo == null) ? false : z;
        }
        z = true;
        this.A03 = z;
        C121787Id r02 = this.A04.A02;
        C121787Id.A01(r02);
        Context context2 = r02.A00;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = context2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled"))) {
                    bool = C18210wN.A0Q(applicationInfo.metaData, "firebase_messaging_auto_init_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            bool = null;
        }
        this.A01 = bool;
        if (bool == null && z) {
            C105156cy r4 = new C105156cy(this);
            this.A00 = r4;
            Class<C97806Cy> cls = C97806Cy.class;
            Executor executor = r8.A02;
            synchronized (r8) {
                Map map = r8.A01;
                if (!map.containsKey(cls)) {
                    map.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) map.get(cls)).put(r4, executor);
            }
        }
    }
}
