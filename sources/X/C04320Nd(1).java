package X;

import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Nd  reason: invalid class name and case insensitive filesystem */
public final class C04320Nd {
    public final Context A00;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final C06090Xp A03;
    public final File A04;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        X.C04790Pd.A00();
        X.AnonymousClass0LU.A0O("lacrima", "Cannot delete report dir: %s", r8.getName(), r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C04320Nd r11, java.lang.String r12, int r13, long r14) {
        /*
            java.io.File r0 = r11.A04
            java.lang.String r4 = "reports"
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r4)
            X.0Nb r0 = new X.0Nb
            r0.<init>(r11, r12)
            java.io.File[] r5 = r1.listFiles(r0)
            if (r5 == 0) goto L_0x0053
            r1 = 0
            com.facebook.redex.IDxComparatorShape301S0100000_I2 r0 = new com.facebook.redex.IDxComparatorShape301S0100000_I2
            r0.<init>(r11, r1)
            java.util.Arrays.sort(r5, r0)
            long r9 = java.lang.System.currentTimeMillis()
            r3 = 0
        L_0x0022:
            int r0 = r5.length
            if (r3 >= r0) goto L_0x0053
            r8 = r5[r3]
            int r0 = r0 - r13
            if (r3 < r0) goto L_0x0034
            long r6 = r8.lastModified()     // Catch:{ IOException -> 0x003d }
            long r1 = r9 - r14
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0050
        L_0x0034:
            monitor-enter(r11)     // Catch:{ IOException -> 0x003d }
            r11.A03(r8, r4)     // Catch:{ all -> 0x003a }
            monitor-exit(r11)     // Catch:{ IOException -> 0x003d }
            goto L_0x0050
        L_0x003a:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ IOException -> 0x003d }
            throw r0     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r1 = move-exception
            X.C04790Pd.A00()
            java.lang.String r0 = r8.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Cannot delete report dir: %s"
            X.AnonymousClass0LU.A0O(r1, r0, r2)
        L_0x0050:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04320Nd.A00(X.0Nd, java.lang.String, int, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r8 = this;
            java.lang.Object r4 = r8.A01
            monitor-enter(r4)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0087 }
            r3.<init>()     // Catch:{ all -> 0x0087 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0087 }
            r2.<init>()     // Catch:{ all -> 0x0087 }
            java.io.File r1 = r8.A04     // Catch:{ all -> 0x0087 }
            r6 = 1
            com.facebook.redex.IDxFFilterShape519S0100000_I2 r0 = new com.facebook.redex.IDxFFilterShape519S0100000_I2     // Catch:{ all -> 0x0087 }
            r0.<init>(r8, r6)     // Catch:{ all -> 0x0087 }
            r8.A01(r1, r0, r3, r2)     // Catch:{ all -> 0x0087 }
            java.util.Map r5 = r8.A02     // Catch:{ all -> 0x0087 }
            r5.clear()     // Catch:{ all -> 0x0087 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x0087 }
        L_0x0021:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0087 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0087 }
            java.util.Properties r3 = new java.util.Properties     // Catch:{ all -> 0x0087 }
            r3.<init>()     // Catch:{ all -> 0x0087 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IllegalArgumentException -> 0x0043 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0043 }
            r3.load(r1)     // Catch:{ all -> 0x003e }
            r1.close()     // Catch:{ IllegalArgumentException -> 0x0043 }
            goto L_0x004d
        L_0x003e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0043 }
        L_0x0043:
            X.C04790Pd.A00()     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "malformed Unicode present in input, ignoring it."
            X.AnonymousClass0LU.A0C(r1, r0)     // Catch:{ all -> 0x0087 }
        L_0x004d:
            java.util.Set r0 = r3.stringPropertyNames()     // Catch:{ all -> 0x0087 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0087 }
        L_0x0055:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r3.getProperty(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0075
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0083 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0055
        L_0x0075:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0083 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0083 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0055
        L_0x0083:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r4)     // Catch:{ all -> 0x0087 }
            return
        L_0x0087:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0087 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04320Nd.A02():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.io.File r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.Object r4 = r12.A01
            monitor-enter(r4)
            java.io.File[] r7 = r13.listFiles()     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x00f4
            int r6 = r7.length     // Catch:{ all -> 0x00f6 }
            r5 = 0
        L_0x000b:
            if (r5 >= r6) goto L_0x00f1
            r3 = r7[r5]     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "_attach.txt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x0099
            java.util.Properties r9 = new java.util.Properties     // Catch:{ all -> 0x00f6 }
            r9.<init>()     // Catch:{ all -> 0x00f6 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IllegalArgumentException -> 0x008f }
            r1.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x008f }
            r9.load(r1)     // Catch:{ all -> 0x008a }
            r1.close()     // Catch:{ IllegalArgumentException -> 0x008f }
            java.util.Set r0 = r9.stringPropertyNames()     // Catch:{ all -> 0x00f6 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x00f6 }
        L_0x0033:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r8 = r9.getProperty(r0)     // Catch:{ all -> 0x00f6 }
            java.util.Map r2 = r12.A02     // Catch:{ all -> 0x00ec }
            java.lang.Object r0 = r2.get(r8)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r2.get(r8)     // Catch:{ all -> 0x00ec }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00ec }
            int r1 = r0.intValue()     // Catch:{ all -> 0x00ec }
            r0 = 1
            if (r1 != r0) goto L_0x006e
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x00ec }
            r10.<init>(r8)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = r10.getPath()     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "/system/"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00ec }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006e
            r10.delete()     // Catch:{ all -> 0x00ec }
        L_0x006e:
            java.lang.Object r0 = r2.get(r8)     // Catch:{ all -> 0x00ea }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0033
            int r1 = r0.intValue()     // Catch:{ all -> 0x00ea }
            r0 = 1
            if (r1 != r0) goto L_0x0081
            r2.remove(r8)     // Catch:{ all -> 0x00ea }
            goto L_0x0033
        L_0x0081:
            int r1 = r1 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00ea }
            r2.put(r8, r0)     // Catch:{ all -> 0x00ea }
            goto L_0x0033
        L_0x008a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0     // Catch:{ IllegalArgumentException -> 0x008f }
        L_0x008f:
            X.C04790Pd.A00()     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "malformed Unicode present in input, ignoring it."
            X.AnonymousClass0LU.A0C(r1, r0)     // Catch:{ all -> 0x00f6 }
        L_0x0099:
            if (r14 != 0) goto L_0x009f
            r3.delete()     // Catch:{ all -> 0x00f6 }
            goto L_0x00e6
        L_0x009f:
            X.0Nh r9 = X.C04360Nh.A00(r14)     // Catch:{ all -> 0x00f6 }
            java.lang.Object r2 = r9.A03     // Catch:{ all -> 0x00f6 }
            monitor-enter(r2)     // Catch:{ all -> 0x00f6 }
            java.io.File r1 = r9.A02     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "Did you call FixedLengthFiles.init()?"
            X.C002801h.A02(r1, r0)     // Catch:{ all -> 0x00ee }
            long r10 = r3.length()     // Catch:{ all -> 0x00ee }
            int r0 = r9.A01     // Catch:{ all -> 0x00ee }
            long r0 = (long) r0     // Catch:{ all -> 0x00ee }
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x00e2
            java.io.File r0 = r9.A02     // Catch:{ all -> 0x00ee }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e2
            int r1 = r0.length     // Catch:{ all -> 0x00ee }
            int r0 = r9.A00     // Catch:{ all -> 0x00ee }
            if (r1 >= r0) goto L_0x00e2
            java.io.File r8 = r9.A02     // Catch:{ all -> 0x00ee }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "_prop.txt"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x00ee }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00ee }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x00ee }
            boolean r0 = r3.renameTo(r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e2
        L_0x00e0:
            monitor-exit(r2)     // Catch:{ all -> 0x00ee }
            goto L_0x00e6
        L_0x00e2:
            r3.delete()     // Catch:{ all -> 0x00ee }
            goto L_0x00e0
        L_0x00e6:
            int r5 = r5 + 1
            goto L_0x000b
        L_0x00ea:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f0
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ee }
        L_0x00f0:
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f1:
            r13.delete()     // Catch:{ all -> 0x00f6 }
        L_0x00f4:
            monitor-exit(r4)     // Catch:{ all -> 0x00f6 }
            return
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04320Nd.A03(java.io.File, java.lang.String):void");
    }

    public C04320Nd(Context context, C06090Xp r3, File file) {
        this.A00 = context;
        this.A04 = file;
        this.A03 = r3;
    }

    private void A01(File file, FileFilter fileFilter, List list, Set set) {
        File[] listFiles = file.listFiles(fileFilter);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    if (!file2.isDirectory()) {
                        list.add(file2);
                    } else if (!set.contains(canonicalPath)) {
                        set.add(canonicalPath);
                        A01(file2, fileFilter, list, set);
                    }
                } catch (IOException unused) {
                    C04790Pd.A00();
                }
            }
        }
    }
}
