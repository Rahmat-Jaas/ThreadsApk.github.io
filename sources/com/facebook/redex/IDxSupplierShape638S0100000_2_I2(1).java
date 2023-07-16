package com.facebook.redex;

import X.C143978hc;

public class IDxSupplierShape638S0100000_2_I2 implements C143978hc {
    public Object A00;
    public final int A01;

    public IDxSupplierShape638S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.C102596Vu.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0191, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0072
            java.lang.Object r5 = r1.A00
            java.lang.String[] r0 = java.util.Locale.getISOCountries()     // Catch:{ RuntimeException -> 0x0050 }
            java.util.List r2 = java.util.Arrays.asList(r0)     // Catch:{ RuntimeException -> 0x0050 }
            r1 = 1
            com.facebook.redex.IDxFunctionShape362S0100000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape362S0100000_2_I2     // Catch:{ RuntimeException -> 0x0050 }
            r0.<init>(r5, r1)     // Catch:{ RuntimeException -> 0x0050 }
            java.util.List r1 = X.C37074Jk6.A01(r0, r2)     // Catch:{ RuntimeException -> 0x0050 }
            r0 = 0
            com.facebook.redex.IDxFunctionShape362S0100000_2_I2 r4 = new com.facebook.redex.IDxFunctionShape362S0100000_2_I2     // Catch:{ RuntimeException -> 0x0050 }
            r4.<init>(r5, r0)     // Catch:{ RuntimeException -> 0x0050 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ RuntimeException -> 0x0050 }
            com.google.common.collect.ImmutableMap$Builder r2 = new com.google.common.collect.ImmutableMap$Builder     // Catch:{ RuntimeException -> 0x0050 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0050 }
        L_0x0029:
            boolean r0 = r3.hasNext()     // Catch:{ RuntimeException -> 0x0050 }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r3.next()     // Catch:{ RuntimeException -> 0x0050 }
            java.lang.Object r0 = r4.apply(r1)     // Catch:{ RuntimeException -> 0x0050 }
            r2.put(r0, r1)     // Catch:{ RuntimeException -> 0x0050 }
            goto L_0x0029
        L_0x003b:
            com.google.common.collect.ImmutableMap r10 = r2.build()     // Catch:{ IllegalArgumentException -> 0x0040 }
            return r10
        L_0x0040:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ RuntimeException -> 0x0050 }
            java.lang.String r0 = ". To index multiple values under a key, use Multimaps.index."
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ RuntimeException -> 0x0050 }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ RuntimeException -> 0x0050 }
            throw r0     // Catch:{ RuntimeException -> 0x0050 }
        L_0x0050:
            r4 = move-exception
            java.lang.String r0 = "Failed to construct a unique ISO3 index of items: "
            java.lang.StringBuilder r3 = X.C18190wL.A0s(r0)
            java.lang.String[] r0 = java.util.Locale.getISOCountries()
            java.util.List r2 = java.util.Arrays.asList(r0)
            r1 = 1
            com.facebook.redex.IDxFunctionShape362S0100000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape362S0100000_2_I2
            r0.<init>(r5, r1)
            java.util.List r0 = X.C37074Jk6.A01(r0, r2)
            java.lang.String r0 = X.C18200wM.A0m(r0, r3)
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r4)
            throw r0
        L_0x0072:
            java.lang.Object r7 = r1.A00
            X.6ip r7 = (X.C108716ip) r7
            java.lang.String r3 = "Failed to parse manifest file"
            java.lang.String r9 = "dev_dod_folder"
            r5 = 0
            android.content.Context r0 = r7.A00     // Catch:{ IOException -> 0x00ab }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x00ab }
            java.lang.String[] r8 = r0.list(r9)     // Catch:{ IOException -> 0x00ab }
            if (r8 == 0) goto L_0x00b3
            int r6 = r8.length     // Catch:{ IOException -> 0x00ab }
            r4 = 0
        L_0x0089:
            if (r4 >= r6) goto L_0x00b3
            r2 = r8[r4]     // Catch:{ IOException -> 0x00ab }
            X.C04220Ms.A03(r2)     // Catch:{ IOException -> 0x00ab }
            java.lang.String r1 = "manifest"
            r0 = 1
            boolean r0 = X.C18220wO.A1V(r1, r0, r2)     // Catch:{ IOException -> 0x00ab }
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = ".json"
            boolean r0 = r2.endsWith(r0)     // Catch:{ IOException -> 0x00ab }
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = java.io.File.separator     // Catch:{ IOException -> 0x00ab }
            java.lang.String r5 = X.AnonymousClass00U.A0V(r9, r0, r2)     // Catch:{ IOException -> 0x00ab }
            goto L_0x00b3
        L_0x00a8:
            int r4 = r4 + 1
            goto L_0x0089
        L_0x00ab:
            r2 = move-exception
            java.lang.String r1 = "DebugDeveloperOverrides"
            java.lang.String r0 = "Failed to list APK assets"
            X.AnonymousClass0LU.A0H(r1, r0, r2)
        L_0x00b3:
            r10 = 0
            java.lang.String r2 = "DebugDeveloperOverrides"
            if (r5 != 0) goto L_0x00be
            java.lang.String r0 = "Manifest file is missing in APK assets"
            X.AnonymousClass0LU.A0C(r2, r0)
            return r10
        L_0x00be:
            android.content.Context r12 = r7.A00
            java.io.File r0 = r12.getFilesDir()
            java.io.File r1 = X.C86154wM.A0U(r0, r5)
            java.lang.String r0 = "file"
            java.io.File r4 = X.C86154wM.A0U(r1, r0)
            java.io.File r13 = r4.getParentFile()
            if (r13 == 0) goto L_0x0197
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()
            java.util.concurrent.Executor r16 = X.AnonymousClass0FK.A07
            java.lang.String r14 = r4.getName()
            java.lang.String r1 = r4.getName()
            X.0Em r0 = new X.0Em
            r0.<init>(r5, r1)
            r15.add(r0)
            r1 = 0
        L_0x00eb:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x00f6
            int r1 = X.C86124wJ.A0D(r13, r15, r1)
            goto L_0x00eb
        L_0x00f6:
            X.0FK r11 = new X.0FK
            r11.<init>(r12, r13, r14, r15, r16)
            r11.A03()
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()     // Catch:{ IOException | JSONException -> 0x0192 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException | JSONException -> 0x0192 }
            r0.<init>(r4)     // Catch:{ IOException | JSONException -> 0x0192 }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ IOException | JSONException -> 0x0192 }
            r4.<init>(r0)     // Catch:{ IOException | JSONException -> 0x0192 }
            r4.beginArray()     // Catch:{ all -> 0x018b }
        L_0x010f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x018b }
            r7 = 0
            if (r0 == 0) goto L_0x017f
            r4.beginObject()     // Catch:{ all -> 0x018b }
            r5 = r10
            r1 = r10
        L_0x011b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0165
            java.lang.String r9 = r4.nextName()     // Catch:{ all -> 0x018b }
            if (r9 == 0) goto L_0x0161
            int r8 = r9.hashCode()     // Catch:{ all -> 0x018b }
            r0 = -1272046946(0xffffffffb42e1a9e, float:-1.6214696E-7)
            if (r8 == r0) goto L_0x0154
            r0 = -341064690(0xffffffffebabc40e, float:-4.153043E26)
            if (r8 == r0) goto L_0x0147
            r0 = 1901043637(0x714f9fb5, float:1.0281035E30)
            if (r8 != r0) goto L_0x0161
            java.lang.String r0 = "location"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0161
            java.lang.String r1 = r4.nextString()     // Catch:{ all -> 0x018b }
            goto L_0x011b
        L_0x0147:
            java.lang.String r0 = "resource"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0161
            java.lang.String r7 = r4.nextString()     // Catch:{ all -> 0x018b }
            goto L_0x011b
        L_0x0154:
            java.lang.String r0 = "flavor"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0161
            java.lang.String r5 = r4.nextString()     // Catch:{ all -> 0x018b }
            goto L_0x011b
        L_0x0161:
            r4.skipValue()     // Catch:{ all -> 0x018b }
            goto L_0x011b
        L_0x0165:
            r4.endObject()     // Catch:{ all -> 0x018b }
            if (r7 == 0) goto L_0x0177
            if (r5 == 0) goto L_0x0177
            if (r1 == 0) goto L_0x0177
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x018b }
            r0.<init>(r7, r5)     // Catch:{ all -> 0x018b }
            r6.put(r0, r1)     // Catch:{ all -> 0x018b }
            goto L_0x010f
        L_0x0177:
            java.lang.String r1 = "Manifest file is missing required fields"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ all -> 0x018b }
            r0.<init>(r1)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x017f:
            r4.endArray()     // Catch:{ all -> 0x018b }
            r4.close()     // Catch:{ IOException | JSONException -> 0x0192 }
            X.6bm r0 = new X.6bm     // Catch:{ IOException | JSONException -> 0x0192 }
            r0.<init>(r6)     // Catch:{ IOException | JSONException -> 0x0192 }
            return r0
        L_0x018b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            X.C102596Vu.A00(r4, r1)     // Catch:{ IOException | JSONException -> 0x0192 }
            throw r0     // Catch:{ IOException | JSONException -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            X.AnonymousClass0LU.A0H(r2, r3, r0)
            return r10
        L_0x0197:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSupplierShape638S0100000_2_I2.get():java.lang.Object");
    }
}
