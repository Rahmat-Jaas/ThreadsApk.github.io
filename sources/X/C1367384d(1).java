package X;

import java.util.concurrent.Callable;

/* renamed from: X.84d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1367384d implements Callable {
    public final C134627y4 A00;

    public C1367384d(C134627y4 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C102976Xh.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0069, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            X.7y4 r2 = r8.A00
            java.net.URL r5 = r2.A01
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String.valueOf(r0)
            java.lang.String r4 = "FirebaseMessaging"
            java.net.URLConnection r1 = r5.openConnection()     // Catch:{ IOException -> 0x006a }
            r0 = -1639484572(0xffffffff9e477364, float:-1.05588345E-20)
            java.io.InputStream r6 = X.C13770oH.A00(r1, r0)     // Catch:{ IOException -> 0x006a }
            X.Fcv r7 = new X.Fcv     // Catch:{ all -> 0x005c }
            r7.<init>(r6)     // Catch:{ all -> 0x005c }
            r2.A02 = r6     // Catch:{ all -> 0x004e }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x002f
            X.C86114wI.A1N(r4, r5)     // Catch:{ all -> 0x004e }
            r7.close()     // Catch:{ all -> 0x005c }
            r6.close()     // Catch:{ IOException -> 0x006a }
            return r0
        L_0x002f:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x004e }
            int r0 = X.C86104wH.A0A(r2)     // Catch:{ all -> 0x004e }
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "Failed to decode image: "
            r1.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = X.C18180wK.A0i(r2, r1)     // Catch:{ all -> 0x004e }
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x004e }
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0055 }
            goto L_0x005b
        L_0x0055:
            r1 = move-exception
            X.6no r0 = X.C102976Xh.A00     // Catch:{ all -> 0x005c }
            r0.A00(r3, r1)     // Catch:{ all -> 0x005c }
        L_0x005b:
            throw r2     // Catch:{ all -> 0x005c }
        L_0x005c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x005e }
        L_0x005e:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r1 = move-exception
            X.6no r0 = X.C102976Xh.A00     // Catch:{ IOException -> 0x006a }
            r0.A00(r3, r1)     // Catch:{ IOException -> 0x006a }
        L_0x0069:
            throw r2     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            r3 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = X.C86104wH.A0A(r2)
            int r0 = r0 + 26
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Failed to download image: "
            r1.append(r0)
            java.lang.String r0 = X.C18180wK.A0i(r2, r1)
            android.util.Log.w(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1367384d.call():java.lang.Object");
    }
}
