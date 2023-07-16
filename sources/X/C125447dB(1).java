package X;

import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import org.json.JSONObject;

/* renamed from: X.7dB  reason: invalid class name and case insensitive filesystem */
public final class C125447dB implements C39729Kyr {
    public final String A00;
    public final String A01;

    public final boolean BTX(Object obj) {
        String str;
        C125447dB r3 = (C125447dB) obj;
        String str2 = this.A00;
        if (str2 == null || !str2.equals(r3.A00) || (str = this.A01) == null || !str.equals(r3.A01)) {
            return false;
        }
        return true;
    }

    public final int CuF() {
        int i;
        String str = this.A01;
        int i2 = 0;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.length();
        }
        return i + i2;
    }

    public final /* bridge */ /* synthetic */ JSONObject CxI(Object obj, JSONObject jSONObject) {
        JSONObject A0y = C18230wP.A0y();
        A0y.put("s1", this.A00);
        A0y.put("s2", this.A01);
        jSONObject.put(Integer.toString(((Number) obj).intValue()), A0y);
        return jSONObject;
    }

    public C125447dB(Signature signature) {
        this.A00 = C37362JqK.A02(AnonymousClass006.A01, CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getEncoded());
        this.A01 = C37362JqK.A02(AnonymousClass006.A00, CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getEncoded());
    }
}
