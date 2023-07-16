package X;

import android.content.Context;
import android.provider.Settings;
import org.json.JSONObject;

/* renamed from: X.7dC  reason: invalid class name and case insensitive filesystem */
public final class C125457dC implements C39729Kyr {
    public final String A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r7.A00 != null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r7.A01 != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BTX(java.lang.Object r7) {
        /*
            r6 = this;
            X.7dC r7 = (X.C125457dC) r7
            java.lang.String r5 = r6.A00
            r4 = 1
            if (r5 != 0) goto L_0x000c
            java.lang.String r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            java.lang.String r2 = r6.A01
            if (r2 != 0) goto L_0x0016
            java.lang.String r0 = r7.A01
            r1 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r5 == 0) goto L_0x0021
            java.lang.String r0 = r7.A00
            if (r0 == 0) goto L_0x0021
            boolean r3 = r5.equals(r0)
        L_0x0021:
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x002b
            boolean r1 = r2.equals(r0)
        L_0x002b:
            if (r3 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0030
            return r4
        L_0x0030:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125457dC.BTX(java.lang.Object):boolean");
    }

    public final int CuF() {
        String str;
        String str2 = this.A00;
        if (str2 == null || (str = this.A01) == null) {
            return 0;
        }
        return str2.getBytes().length + str.getBytes().length;
    }

    public final /* bridge */ /* synthetic */ JSONObject CxI(Object obj, JSONObject jSONObject) {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    public C125457dC(Context context, Integer num, String str) {
        String string;
        this.A00 = str;
        int intValue = num.intValue();
        if (intValue == 0) {
            string = Settings.Global.getString(context.getContentResolver(), str);
        } else if (intValue != 1) {
            string = Settings.System.getString(context.getContentResolver(), str);
        } else {
            string = Settings.Secure.getString(context.getContentResolver(), str);
        }
        this.A01 = string;
    }
}
