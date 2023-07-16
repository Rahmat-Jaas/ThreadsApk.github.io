package com.instagram.encryptedprefs;

import X.AnonymousClass0wJ;
import X.AnonymousClass69G;
import X.C86114wI;
import X.C86124wJ;

public class IDxPTypeShape52S0000000_2_I2 extends AnonymousClass69G {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxPTypeShape52S0000000_2_I2(int r5) {
        /*
            r4 = this;
            r4.A00 = r5
            switch(r5) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0028;
                case 2: goto L_0x0020;
                case 3: goto L_0x0018;
                case 4: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r3 = "BOOLEAN"
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.String r1 = "bool"
            r0 = 5
        L_0x000c:
            r4.<init>(r2, r3, r1, r0)
            return
        L_0x0010:
            java.lang.String r3 = "FLOAT"
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            java.lang.String r1 = "float"
            r0 = 4
            goto L_0x000c
        L_0x0018:
            java.lang.String r3 = "SET_STRINGS"
            java.lang.Class<java.util.Set> r2 = java.util.Set.class
            java.lang.String r1 = "set_strings"
            r0 = 3
            goto L_0x000c
        L_0x0020:
            java.lang.String r3 = "LONG"
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r1 = "long"
            r0 = 2
            goto L_0x000c
        L_0x0028:
            java.lang.String r3 = "INTEGER"
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.String r1 = "int"
            r0 = 1
            goto L_0x000c
        L_0x0030:
            java.lang.String r3 = "STRING"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = "string"
            r0 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.encryptedprefs.IDxPTypeShape52S0000000_2_I2.<init>(int):void");
    }

    public final Object A00(String str) {
        switch (this.A00) {
            case 0:
                return str;
            case 1:
                return C86124wJ.A0h(str);
            case 2:
                return AnonymousClass0wJ.A0d(str);
            case 3:
                return C86114wI.A0t(str.substring(1, str.length() - 1).split(", "));
            case 4:
                return Float.valueOf(Float.parseFloat(str));
            default:
                return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }
}
