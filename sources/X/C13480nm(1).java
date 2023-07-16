package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.0nm  reason: invalid class name and case insensitive filesystem */
public final class C13480nm {
    public boolean A00 = false;
    public final Context A01;
    public final C13560nu A02;
    public final GHO A03;
    public final C16590tM A04;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|(3:12|13|14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b A[Catch:{ IOException -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[SYNTHETIC, Splitter:B:21:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Set A00() {
        /*
            r16 = this;
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r2 = r16
            X.GHO r1 = r2.A03
            java.lang.String r0 = "AppModules::Uninstall"
            X.Gh4 r4 = r1.A00(r0)
            int r0 = r4.A06()
            if (r0 <= 0) goto L_0x019f
            X.0np r3 = X.C13510np.A00()
            android.content.Context r7 = r2.A01
            monitor-enter(r3)
            boolean r0 = r3.A00     // Catch:{ all -> 0x019c }
            r6 = 1
            if (r0 != 0) goto L_0x0184
            java.lang.Class<X.0o6> r2 = X.C13670o6.class
            monitor-enter(r2)     // Catch:{ all -> 0x019c }
            java.lang.Boolean r0 = X.C13670o6.A00     // Catch:{ all -> 0x0181 }
            if (r0 != 0) goto L_0x0042
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0042 }
            X.C13670o6.A00 = r0     // Catch:{ IOException -> 0x0042 }
            android.content.res.AssetManager r1 = r7.getAssets()     // Catch:{ IOException -> 0x0042 }
            java.lang.String r0 = "app_modules.json"
            java.io.InputStream r0 = r1.open(r0)     // Catch:{ IOException -> 0x0042 }
            r0.close()     // Catch:{ IOException -> 0x0042 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x0042 }
            X.C13670o6.A00 = r0     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            java.lang.Boolean r0 = X.C13670o6.A00     // Catch:{ all -> 0x0181 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0181 }
            monitor-exit(r2)     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x004f
            r3.A00 = r6     // Catch:{ all -> 0x019c }
            goto L_0x0184
        L_0x004f:
            android.content.res.AssetManager r1 = r7.getAssets()     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = "app_modules.json"
            java.io.InputStream r7 = r1.open(r0)     // Catch:{ FileNotFoundException -> 0x015b }
            java.lang.String r2 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x015b }
            r0.<init>(r7, r2)     // Catch:{ FileNotFoundException -> 0x015b }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ FileNotFoundException -> 0x015b }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x015b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0156 }
            r7.<init>()     // Catch:{ all -> 0x0156 }
            r2.beginArray()     // Catch:{ all -> 0x0156 }
        L_0x006d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x011a
            android.util.JsonToken r8 = r2.peek()     // Catch:{ all -> 0x0156 }
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ all -> 0x0156 }
            if (r8 != r0) goto L_0x011a
            r2.beginObject()     // Catch:{ all -> 0x0156 }
            r8 = 0
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
        L_0x0084:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0156 }
            r15 = 0
            if (r0 == 0) goto L_0x0107
            java.lang.String r9 = r2.nextName()     // Catch:{ all -> 0x0156 }
            int r0 = r9.hashCode()     // Catch:{ all -> 0x0156 }
            switch(r0) {
                case 3355: goto L_0x00a2;
                case 3195150: goto L_0x00b2;
                case 3373707: goto L_0x00c2;
                case 3433509: goto L_0x00d2;
                case 270940796: goto L_0x00e2;
                case 1109408053: goto L_0x00f6;
                default: goto L_0x0096;
            }     // Catch:{ all -> 0x0156 }
        L_0x0096:
            java.lang.String r0 = "Unexpected name: "
            java.lang.String r6 = X.AnonymousClass00U.A0L(r0, r9)     // Catch:{ all -> 0x0156 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0156 }
            r0.<init>(r6)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x00a2:
            java.lang.String r0 = "id"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0096
            X.C13490nn.A00(r12, r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r12 = r2.nextString()     // Catch:{ all -> 0x0156 }
            goto L_0x0084
        L_0x00b2:
            java.lang.String r0 = "hash"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0096
            X.C13490nn.A00(r11, r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r11 = r2.nextString()     // Catch:{ all -> 0x0156 }
            goto L_0x0084
        L_0x00c2:
            java.lang.String r0 = "name"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0096
            X.C13490nn.A00(r10, r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r10 = r2.nextString()     // Catch:{ all -> 0x0156 }
            goto L_0x0084
        L_0x00d2:
            java.lang.String r0 = "path"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0096
            X.C13490nn.A00(r14, r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r14 = r2.nextString()     // Catch:{ all -> 0x0156 }
            goto L_0x0084
        L_0x00e2:
            java.lang.String r0 = "disabled"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0096
            X.C13490nn.A00(r8, r9)     // Catch:{ all -> 0x0156 }
            boolean r0 = r2.nextBoolean()     // Catch:{ all -> 0x0156 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0156 }
            goto L_0x0084
        L_0x00f6:
            java.lang.String r0 = "download_uri"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0096
            X.C13490nn.A00(r13, r9)     // Catch:{ all -> 0x0156 }
            java.lang.String r13 = r2.nextString()     // Catch:{ all -> 0x0156 }
            goto L_0x0084
        L_0x0107:
            r2.endObject()     // Catch:{ all -> 0x0156 }
            if (r8 == 0) goto L_0x0110
            boolean r15 = r8.booleanValue()     // Catch:{ all -> 0x0156 }
        L_0x0110:
            X.0nl r9 = new X.0nl     // Catch:{ all -> 0x0156 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0156 }
            r7.add(r9)     // Catch:{ all -> 0x0156 }
            goto L_0x006d
        L_0x011a:
            r2.endArray()     // Catch:{ all -> 0x0156 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x015b }
            java.util.Iterator r10 = r7.iterator()     // Catch:{ IOException -> 0x0178 }
        L_0x0124:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x0178 }
            if (r0 == 0) goto L_0x0153
            r10.next()     // Catch:{ IOException -> 0x0178 }
            r0 = -2
            java.lang.String r9 = "MODULE_NAME_NON_MODULAR_BUILD"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0151 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r8}     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = "AppModuleIndexUtil"
            java.lang.String r2 = "Checking index for %s (%d)"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)     // Catch:{ all -> 0x0151 }
            X.AnonymousClass0LU.A0D(r7, r0)     // Catch:{ all -> 0x0151 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r8}     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)     // Catch:{ all -> 0x0151 }
            X.AnonymousClass0LU.A0D(r7, r0)     // Catch:{ all -> 0x0151 }
            goto L_0x0124
        L_0x0151:
            r1 = move-exception
            goto L_0x0177
        L_0x0153:
            r3.A00 = r6     // Catch:{ IOException -> 0x0178 }
            goto L_0x0184
        L_0x0156:
            r0 = move-exception
            r2.close()     // Catch:{ FileNotFoundException -> 0x015b }
            throw r0     // Catch:{ FileNotFoundException -> 0x015b }
        L_0x015b:
            r6 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = ""
            java.lang.String[] r0 = r1.list(r0)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ IOException -> 0x0178 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = "app_modules.json not found, assets = %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ IOException -> 0x0178 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0178 }
            r1.<init>(r0, r6)     // Catch:{ IOException -> 0x0178 }
        L_0x0177:
            throw r1     // Catch:{ IOException -> 0x0178 }
        L_0x0178:
            r2 = move-exception
            java.lang.String r1 = "AppModuleStateCache"
            java.lang.String r0 = "Error loading downloadable module metadata"
            X.AnonymousClass0LU.A0J(r1, r0, r2)     // Catch:{ all -> 0x019c }
            goto L_0x0184
        L_0x0181:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019c }
            throw r0     // Catch:{ all -> 0x019c }
        L_0x0184:
            monitor-exit(r3)
            int r3 = com.facebook.voltron.metadata.VoltronModuleMetadata.getModuleCount()
            r2 = 0
        L_0x018a:
            if (r2 >= r3) goto L_0x019f
            java.lang.String r1 = com.facebook.voltron.metadata.VoltronModuleMetadata.getModuleName(r2)
            boolean r0 = r4.A0E(r1)
            if (r0 == 0) goto L_0x0199
            r5.add(r1)
        L_0x0199:
            int r2 = r2 + 1
            goto L_0x018a
        L_0x019c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x019f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13480nm.A00():java.util.Set");
    }

    public C13480nm(Context context, GHO gho, C13560nu r4, C16590tM r5) {
        this.A01 = context;
        this.A03 = gho;
        this.A02 = r4;
        this.A04 = r5;
    }

    public final void A01() {
        Set<String> A002 = A00();
        A002.removeAll(C13450nj.A00(this.A01));
        if (!A002.isEmpty()) {
            GHO gho = this.A03;
            C31029Gdw A09 = gho.A00("AppModules::Uninstall").A09();
            C31029Gdw A092 = gho.A00("AppModules::UninstallInitialRequestTime").A09();
            C31029Gdw A093 = gho.A00("AppModules::UninstallLastFinishTime").A09();
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : A002) {
                A093.A09(str, currentTimeMillis);
                A09.A07(str);
                A092.A07(str);
            }
            A093.A05();
            A09.A05();
            A092.A05();
        }
    }
}
