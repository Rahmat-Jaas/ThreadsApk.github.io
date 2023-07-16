package X;

import android.net.Uri;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.3Eu  reason: invalid class name and case insensitive filesystem */
public final class C58283Eu {
    public final HashMap A00 = AnonymousClass0wJ.A0y();
    public final HashMap A01;

    public final String A00(String str) {
        String str2;
        if (str == null || !C18220wO.A1V("content://com.instagram.android.tam-attachment", 1, str)) {
            return null;
        }
        Uri A012 = C15430rJ.A01(str);
        if (C18240wQ.A03(A012) < 3) {
            str2 = null;
        } else {
            str2 = A012.getPathSegments().get(2);
        }
        HashMap hashMap = this.A00;
        if (hashMap.containsKey(str2)) {
            return C18240wQ.A0f(str2, hashMap);
        }
        KtCSuperShape0S1010000_I2 ktCSuperShape0S1010000_I2 = (KtCSuperShape0S1010000_I2) this.A01.get(str);
        if (ktCSuperShape0S1010000_I2 == null) {
            return null;
        }
        String str3 = ktCSuperShape0S1010000_I2.A00;
        C04220Ms.A0B(str3, 0);
        if (C18220wO.A1V("content://com.instagram.android.tam-attachment", 1, str3)) {
            return null;
        }
        if (!ktCSuperShape0S1010000_I2.A01) {
            AnonymousClass0wJ.A1Y(str3, "file://");
            String str4 = str3;
            if (str3.startsWith("file://")) {
                str4 = str3.substring(7);
                C04220Ms.A06(str4);
            }
            if (!new File(str4).exists()) {
                return null;
            }
        }
        hashMap.remove(str2);
        return str3;
    }

    public C58283Eu(HashMap hashMap) {
        this.A01 = hashMap;
    }
}
