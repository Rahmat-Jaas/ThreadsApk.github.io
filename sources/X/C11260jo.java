package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0jo  reason: invalid class name and case insensitive filesystem */
public final class C11260jo extends AnonymousClass0gG {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ WeakReference A02;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = r5.A01     // Catch:{ IOException -> 0x0028, all -> 0x0024 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028, all -> 0x0024 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0028, all -> 0x0024 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0021, all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0021, all -> 0x0049 }
            java.lang.String r1 = r5.A00     // Catch:{ IOException -> 0x001f }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x001f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x001f }
            boolean r1 = X.AnonymousClass0hL.A09(r0, r3)     // Catch:{ IOException -> 0x001f }
            com.google.common.io.Closeables.A01(r4)
            com.google.common.io.Closeables.A01(r3)
            goto L_0x0039
        L_0x001f:
            r2 = move-exception
            goto L_0x002b
        L_0x0021:
            r2 = move-exception
            r3 = r1
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r3 = r1
            r4 = r1
            goto L_0x004b
        L_0x0028:
            r2 = move-exception
            r3 = r1
            r4 = r1
        L_0x002b:
            java.lang.String r1 = "PhotoFileUtil"
            java.lang.String r0 = "Photo copy error"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x0047 }
            com.google.common.io.Closeables.A01(r4)
            com.google.common.io.Closeables.A01(r3)
            r1 = 0
        L_0x0039:
            java.lang.ref.WeakReference r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.0fR r0 = (X.C09440fR) r0
            if (r0 == 0) goto L_0x0046
            r0.CAs(r1)
        L_0x0046:
            return
        L_0x0047:
            r0 = move-exception
            goto L_0x004b
        L_0x0049:
            r0 = move-exception
            r3 = r1
        L_0x004b:
            com.google.common.io.Closeables.A01(r4)
            com.google.common.io.Closeables.A01(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11260jo.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11260jo(String str, String str2, WeakReference weakReference) {
        super(74, 3, true, false);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = weakReference;
    }
}
