package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import java.util.Map;

/* renamed from: X.7gW  reason: invalid class name and case insensitive filesystem */
public final class C127077gW implements C145238k9 {
    public final /* synthetic */ Map A00;
    public final /* synthetic */ AnonymousClass8s9 A01;

    public final void CDt(C40289Lbs lbs) {
        String str;
        String str2;
        C04220Ms.A0B(lbs, 0);
        Map map = this.A00;
        map.put("purchase_product_status", "FAILURE");
        C107876hS r3 = (C107876hS) C40560Lit.A00.get(lbs);
        String str3 = "";
        if (r3 == null || (str = r3.A00) == null) {
            str = str3;
        }
        map.put("purchase_product_status_error_code", str);
        if (!(r3 == null || (str2 = r3.A01) == null)) {
            str3 = str2;
        }
        map.put("purchase_product_status_error_description", str3);
        AnonymousClass8s9 r1 = this.A01;
        if (((C27420EnC) r1)._state instanceof C142598fH) {
            r1.resumeWith(false);
        }
    }

    public final void CDw(KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2) {
        String str;
        String str2;
        C04220Ms.A0B(ktCSuperShape0S3100000_I2, 0);
        Map map = this.A00;
        map.put("purchase_product_status", "SUCCESS");
        C107876hS r3 = (C107876hS) C40560Lit.A00.get(C40289Lbs.SUCCESSFUL);
        String str3 = "";
        if (r3 == null || (str = r3.A00) == null) {
            str = str3;
        }
        map.put("purchase_product_status_error_code", str);
        if (r3 == null || (str2 = r3.A01) == null) {
            str2 = str3;
        }
        map.put("purchase_product_status_error_description", str2);
        String str4 = ktCSuperShape0S3100000_I2.A01;
        if (str4 == null) {
            str4 = str3;
        }
        map.put(AnonymousClass000.A00(948), str4);
        String str5 = ktCSuperShape0S3100000_I2.A03;
        if (str5 != null) {
            str3 = str5;
        }
        map.put(AnonymousClass000.A00(880), str3);
        AnonymousClass8s9 r1 = this.A01;
        if (((C27420EnC) r1)._state instanceof C142598fH) {
            r1.resumeWith(C18180wK.A0Y());
        }
    }

    public C127077gW(Map map, AnonymousClass8s9 r2) {
        this.A00 = map;
        this.A01 = r2;
    }
}
