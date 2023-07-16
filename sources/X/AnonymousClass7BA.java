package X;

import android.util.Base64;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7BA  reason: invalid class name */
public final class AnonymousClass7BA {
    public static final C114366tB A00(byte[] bArr) {
        byte[] bArr2;
        try {
            JSONArray jSONArray = C18250wR.A0j(new String(bArr, AnonymousClass74V.A05)).getJSONArray("entries");
            ArrayList A0v = AnonymousClass0wJ.A0v();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C04220Ms.A06(jSONObject);
                String string = jSONObject.getString("userId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("features");
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    C04220Ms.A06(jSONObject2);
                    String string2 = jSONObject2.getString("feature");
                    if (jSONObject2.has("backupData")) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("backupData");
                        bArr2 = new byte[jSONArray3.length()];
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            Object obj = jSONArray3.get(i3);
                            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Int");
                            bArr2[i3] = (byte) ((Integer) obj).intValue();
                        }
                    } else {
                        bArr2 = Base64.decode(jSONObject2.getString("bd"), 0);
                        C04220Ms.A06(bArr2);
                    }
                    C04220Ms.A06(string2);
                    A0v2.add(new C114646tf(string2, bArr2));
                }
                C04220Ms.A06(string);
                A0v.add(new C114636te(string, A0v2));
            }
            return new C114366tB(A0v);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final byte[] A01(C114366tB r10) {
        try {
            JSONObject A0y = C18230wP.A0y();
            JSONArray A0i = C18250wR.A0i();
            for (C114636te r9 : r10.A00) {
                JSONObject A0y2 = C18230wP.A0y();
                JSONArray A0i2 = C18250wR.A0i();
                for (C114646tf r3 : r9.A01) {
                    JSONObject A0y3 = C18230wP.A0y();
                    A0y3.put("feature", r3.A00);
                    A0y3.put("bd", Base64.encodeToString(r3.A01, 2));
                    A0i2.put(A0y3);
                }
                A0y2.put("userId", r9.A00);
                A0y2.put("features", A0i2);
                A0i.put(A0y2);
            }
            A0y.put("entries", A0i);
            return AnonymousClass74V.A00(C18190wL.A0n(A0y));
        } catch (Exception unused) {
            return null;
        }
    }
}
