package X;

import org.json.JSONObject;

/* renamed from: X.0Lr  reason: invalid class name and case insensitive filesystem */
public final class C03960Lr {
    public static JSONObject A00(C03920Li r4, C03100Ei r5, C03090Eh r6, C03080Eg r7, C03070Ef r8, C03040Ec r9, C03020Ea r10, AnonymousClass0EX r11, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(r7.A00, r7.A01(z2, z));
        if (r9 != null) {
            jSONObject.putOpt(r9.A00, r9.A01(z2, z));
        }
        if (r5 != null) {
            jSONObject.putOpt(r5.A00, r5.A01(z2, z));
        }
        if (r8 != null) {
            jSONObject.putOpt(r8.A00, r8.A01(z2, z));
        }
        if (r4 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ssr", r4.A03);
            jSONObject2.putOpt("mcd", Long.valueOf(r4.A00));
            jSONObject2.putOpt("mfcl", Long.valueOf(r4.A02));
            jSONObject2.putOpt("mcg", Long.valueOf(r4.A01));
            jSONObject.putOpt("ss", jSONObject2);
        }
        if (r6 != null) {
            jSONObject.putOpt(r6.A03, r6.A02(z));
        }
        if (r11 != null) {
            jSONObject.putOpt(r11.A03, r11.A02(z));
        }
        if (r10 != null) {
            jSONObject.putOpt(r10.A03, r10.A02(z));
        }
        return jSONObject;
    }
}
