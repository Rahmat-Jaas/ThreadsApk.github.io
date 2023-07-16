package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0if  reason: invalid class name and case insensitive filesystem */
public final class C10630if implements C08780eH {
    public final UserSession A00;
    public final File A01;
    public final Object A02 = new Object();
    public final AtomicInteger A03 = new AtomicInteger();
    public final AnonymousClass0gW A04;

    public final File A00() {
        return new File(this.A01, String.format(Locale.US, "%s_ViewInfoStore.json", new Object[]{this.A00.getUserId()}));
    }

    public final Set CZ2() {
        HashSet hashSet = new HashSet();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A04.AKp(new C10760it(this, hashSet, countDownLatch));
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
            return hashSet;
        } catch (InterruptedException e) {
            C10450iM.A07("JsonFileStoreAdapter", e);
            return hashSet;
        }
    }

    public C10630if(Context context, AnonymousClass0gW r3, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = context.getCacheDir();
        this.A04 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DBK(java.util.Set r6) {
        /*
            r5 = this;
            X.C63643hy.A01()
            java.io.File r3 = r5.A01
            java.util.Locale r2 = java.util.Locale.US
            com.instagram.service.session.UserSession r0 = r5.A00
            java.lang.String r1 = r0.getUserId()
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A03
            int r0 = r0.getAndIncrement()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "%s_ViewInfoStore.json.%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r3, r0)
            X.MIS r1 = X.C18987Aon.A00     // Catch:{ IOException -> 0x007b }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ IOException -> 0x007b }
            X.MMp r4 = r1.A02(r2, r0)     // Catch:{ IOException -> 0x007b }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0076 }
            r1.<init>(r6)     // Catch:{ all -> 0x0076 }
            X.0ec r0 = new X.0ec     // Catch:{ all -> 0x0076 }
            r0.<init>(r1)     // Catch:{ all -> 0x0076 }
            X.C08970eb.A02(r4, r0)     // Catch:{ all -> 0x0076 }
            r4.flush()     // Catch:{ all -> 0x0076 }
            java.lang.Object r3 = r5.A02     // Catch:{ all -> 0x0076 }
            monitor-enter(r3)     // Catch:{ all -> 0x0076 }
            java.io.File r0 = r5.A00()     // Catch:{ all -> 0x0073 }
            boolean r0 = r2.renameTo(r0)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0050
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            r4.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x0088
        L_0x0050:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r1.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "Unable to rename "
            r1.append(r0)     // Catch:{ all -> 0x0073 }
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x0073 }
            java.io.File r0 = r5.A00()     // Catch:{ all -> 0x0073 }
            r1.append(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0073 }
            r0.<init>(r1)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x007a }
        L_0x007a:
            throw r0     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            r1 = move-exception
            java.lang.String r0 = "JsonFileStoreAdapter"
            X.C10450iM.A07(r0, r1)     // Catch:{ all -> 0x0092 }
            boolean r0 = r2.exists()     // Catch:{ SecurityException -> 0x0091 }
            if (r0 == 0) goto L_0x0091
            goto L_0x008e
        L_0x0088:
            boolean r0 = r2.exists()     // Catch:{ SecurityException -> 0x0091 }
            if (r0 == 0) goto L_0x0091
        L_0x008e:
            r2.delete()     // Catch:{ SecurityException -> 0x0091 }
        L_0x0091:
            return
        L_0x0092:
            r1 = move-exception
            boolean r0 = r2.exists()     // Catch:{ SecurityException -> 0x009c }
            if (r0 == 0) goto L_0x009c
            r2.delete()     // Catch:{ SecurityException -> 0x009c }
        L_0x009c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630if.DBK(java.util.Set):void");
    }
}
