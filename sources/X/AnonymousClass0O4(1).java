package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.File;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.0O4  reason: invalid class name */
public final class AnonymousClass0O4 {
    public short A00 = 0;
    public Map A01;
    public boolean A02;
    public final Handler A03;
    public final Properties A04 = new Properties();
    public final File A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String A01(short r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A06     // Catch:{ all -> 0x006f }
            r5 = 0
            if (r0 == 0) goto L_0x006d
            boolean r0 = r6.A02     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x005d
            java.io.File r2 = r6.A05     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "strdict.txt"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006f }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x006f }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0026 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0026 }
            java.util.Properties r0 = r6.A04     // Catch:{ all -> 0x0021 }
            r0.load(r1)     // Catch:{ all -> 0x0021 }
            r1.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x0029
        L_0x0021:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            X.C04790Pd.A00()     // Catch:{ all -> 0x006f }
        L_0x0029:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x006f }
            r0.<init>()     // Catch:{ all -> 0x006f }
            r6.A01 = r0     // Catch:{ all -> 0x006f }
            java.util.Properties r4 = r6.A04     // Catch:{ all -> 0x006f }
            java.util.Set r0 = r4.stringPropertyNames()     // Catch:{ all -> 0x006f }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x006f }
        L_0x003a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x006f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r4.getProperty(r2)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x003a
            java.util.Map r1 = r6.A01     // Catch:{ all -> 0x006f }
            short r0 = java.lang.Short.parseShort(r0)     // Catch:{ all -> 0x006f }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ all -> 0x006f }
            r1.put(r0, r2)     // Catch:{ all -> 0x006f }
            goto L_0x003a
        L_0x005a:
            r0 = 1
            r6.A02 = r0     // Catch:{ all -> 0x006f }
        L_0x005d:
            java.util.Map r1 = r6.A01     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006d
            java.lang.Short r0 = java.lang.Short.valueOf(r7)     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006f }
            monitor-exit(r6)
            return r0
        L_0x006d:
            monitor-exit(r6)
            return r5
        L_0x006f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0O4.A01(short):java.lang.String");
    }

    public final synchronized short A02(String str) {
        short s;
        synchronized (this) {
            Properties properties = this.A04;
            String property = properties.getProperty(str);
            if (TextUtils.isEmpty(property)) {
                short s2 = this.A00;
                if (s2 == 32766) {
                    s = Short.MAX_VALUE;
                } else {
                    short s3 = (short) (s2 + 1);
                    this.A00 = s3;
                    properties.setProperty(str, Short.toString(s3));
                    Handler handler = this.A03;
                    if (handler != null) {
                        handler.post(new AnonymousClass0O3(this));
                    }
                    s = this.A00;
                }
            } else {
                s = Short.parseShort(property);
            }
        }
        return s;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass0O4 r3) {
        /*
            java.io.File r2 = r3.A05
            java.lang.String r1 = "strdict.txt"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002b, AssertionError -> 0x0022 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x002b, AssertionError -> 0x0022 }
            monitor-enter(r3)     // Catch:{ all -> 0x001d }
            java.util.Properties r0 = r3.A04     // Catch:{ all -> 0x001a }
            r0.store(r1, r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ IOException -> 0x002b, AssertionError -> 0x0022 }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0021 }
        L_0x0021:
            throw r0     // Catch:{ IOException -> 0x002b, AssertionError -> 0x0022 }
        L_0x0022:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "StringEncoder"
            java.lang.String r0 = "Error storing properties"
            goto L_0x0033
        L_0x002b:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "StringEncoder"
            java.lang.String r0 = "Error saving string map"
        L_0x0033:
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0O4.A00(X.0O4):void");
    }

    public AnonymousClass0O4(File file, boolean z) {
        this.A05 = file;
        if (!z) {
            HandlerThread handlerThread = new HandlerThread("StringEncoder");
            C13820oM.A00(handlerThread);
            handlerThread.start();
            this.A03 = new Handler(handlerThread.getLooper());
            return;
        }
        this.A06 = true;
    }
}
