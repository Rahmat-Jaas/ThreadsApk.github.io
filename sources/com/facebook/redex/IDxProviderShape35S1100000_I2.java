package com.facebook.redex;

import X.C04560Oe;
import X.C07950cU;

public class IDxProviderShape35S1100000_I2 implements C04560Oe {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxProviderShape35S1100000_I2(C07950cU r1, String str, int i) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0092 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x006d;
                case 2: goto L_0x0034;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.SharedPreferences r5 = X.C07960cV.A00     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r4 = r7.A01     // Catch:{ ClassCastException -> 0x002e }
            java.lang.Object r3 = r7.A00     // Catch:{ ClassCastException -> 0x002e }
            X.0cU r3 = (X.C07950cU) r3     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r2 = r3.mUniverseName     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r1 = "_"
            java.lang.String r0 = r3.mName     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ ClassCastException -> 0x002e }
            java.lang.Object r0 = r3.getDefaultValue()     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r0 = r5.getString(r1, r0)     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r0 = r5.getString(r4, r0)     // Catch:{ ClassCastException -> 0x002e }
            if (r0 != 0) goto L_0x006c
            java.lang.Object r0 = r3.getDefaultValue()     // Catch:{ ClassCastException -> 0x002e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x002e }
            return r0
        L_0x002e:
            r0 = move-exception
            java.lang.Object r0 = X.AnonymousClass00U.A00(r7, r0)
            return r0
        L_0x0034:
            android.content.SharedPreferences r5 = X.C07960cV.A00     // Catch:{ ClassCastException -> 0x005d }
            java.lang.String r4 = r7.A01     // Catch:{ ClassCastException -> 0x005d }
            java.lang.Object r3 = r7.A00     // Catch:{ ClassCastException -> 0x005d }
            X.0cU r3 = (X.C07950cU) r3     // Catch:{ ClassCastException -> 0x005d }
            java.lang.String r2 = r3.mUniverseName     // Catch:{ ClassCastException -> 0x005d }
            java.lang.String r1 = "_"
            java.lang.String r0 = r3.mName     // Catch:{ ClassCastException -> 0x005d }
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ ClassCastException -> 0x005d }
            java.lang.Object r0 = r3.getDefaultValue()     // Catch:{ ClassCastException -> 0x005d }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ ClassCastException -> 0x005d }
            float r0 = r0.floatValue()     // Catch:{ ClassCastException -> 0x005d }
            float r0 = r5.getFloat(r1, r0)     // Catch:{ ClassCastException -> 0x005d }
            float r0 = r5.getFloat(r4, r0)     // Catch:{ ClassCastException -> 0x005d }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ ClassCastException -> 0x005d }
            return r0
        L_0x005d:
            r0 = move-exception
            java.lang.Object r0 = X.AnonymousClass00U.A00(r7, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x006c:
            return r0
        L_0x006d:
            java.lang.String r4 = r7.A01     // Catch:{ ClassCastException -> 0x00b0 }
            java.lang.Object r6 = r7.A00     // Catch:{ ClassCastException -> 0x00b0 }
            X.0cU r6 = (X.C07950cU) r6     // Catch:{ ClassCastException -> 0x00b0 }
            java.lang.Object r5 = r6.getDefaultValue()     // Catch:{ ClassCastException -> 0x00b0 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ ClassCastException -> 0x00b0 }
            android.content.SharedPreferences r3 = X.C07960cV.A00     // Catch:{ ClassCastException -> 0x0092 }
            java.lang.String r2 = r6.mUniverseName     // Catch:{ ClassCastException -> 0x0092 }
            java.lang.String r1 = "_"
            java.lang.String r0 = r6.mName     // Catch:{ ClassCastException -> 0x0092 }
            java.lang.String r2 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ ClassCastException -> 0x0092 }
            long r0 = r5.longValue()     // Catch:{ ClassCastException -> 0x0092 }
            long r0 = r3.getLong(r2, r0)     // Catch:{ ClassCastException -> 0x0092 }
            long r0 = r3.getLong(r4, r0)     // Catch:{ ClassCastException -> 0x0092 }
            goto L_0x00ab
        L_0x0092:
            android.content.SharedPreferences r3 = X.C07960cV.A00     // Catch:{ ClassCastException -> 0x00b0 }
            java.lang.String r2 = r6.mUniverseName     // Catch:{ ClassCastException -> 0x00b0 }
            java.lang.String r1 = "_"
            java.lang.String r0 = r6.mName     // Catch:{ ClassCastException -> 0x00b0 }
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ ClassCastException -> 0x00b0 }
            int r0 = r5.intValue()     // Catch:{ ClassCastException -> 0x00b0 }
            int r0 = r3.getInt(r1, r0)     // Catch:{ ClassCastException -> 0x00b0 }
            int r0 = r3.getInt(r4, r0)     // Catch:{ ClassCastException -> 0x00b0 }
            long r0 = (long) r0     // Catch:{ ClassCastException -> 0x00b0 }
        L_0x00ab:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ ClassCastException -> 0x00b0 }
            return r0
        L_0x00b0:
            r0 = move-exception
            java.lang.Object r0 = X.AnonymousClass00U.A00(r7, r0)
            return r0
        L_0x00b6:
            android.content.SharedPreferences r5 = X.C07960cV.A00     // Catch:{ ClassCastException -> 0x00e3 }
            if (r5 != 0) goto L_0x00bc
            r0 = 0
            goto L_0x00de
        L_0x00bc:
            java.lang.String r4 = r7.A01     // Catch:{ ClassCastException -> 0x00e3 }
            java.lang.Object r3 = r7.A00     // Catch:{ ClassCastException -> 0x00e3 }
            X.0cU r3 = (X.C07950cU) r3     // Catch:{ ClassCastException -> 0x00e3 }
            java.lang.String r2 = r3.mUniverseName     // Catch:{ ClassCastException -> 0x00e3 }
            java.lang.String r1 = "_"
            java.lang.String r0 = r3.mName     // Catch:{ ClassCastException -> 0x00e3 }
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ ClassCastException -> 0x00e3 }
            java.lang.Object r0 = r3.getDefaultValue()     // Catch:{ ClassCastException -> 0x00e3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x00e3 }
            boolean r0 = r0.booleanValue()     // Catch:{ ClassCastException -> 0x00e3 }
            boolean r0 = r5.getBoolean(r1, r0)     // Catch:{ ClassCastException -> 0x00e3 }
            boolean r0 = r5.getBoolean(r4, r0)     // Catch:{ ClassCastException -> 0x00e3 }
        L_0x00de:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ ClassCastException -> 0x00e3 }
            return r0
        L_0x00e3:
            r0 = move-exception
            java.lang.Object r0 = X.AnonymousClass00U.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxProviderShape35S1100000_I2.get():java.lang.Object");
    }
}
