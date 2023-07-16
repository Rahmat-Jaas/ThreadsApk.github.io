package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.7ss  reason: invalid class name and case insensitive filesystem */
public final class C131827ss implements C41882MfV {
    public final KtCSuperShape0S3310000_I2 A00;
    public final C109516k8 A01;

    public C131827ss(C11630kW r12, ImageUrl imageUrl, String str, String str2, String str3, List list, List list2, AnonymousClass0ZU r19, AnonymousClass0YY r20, boolean z) {
        List list3 = list;
        List list4 = list2;
        AnonymousClass0wJ.A1R(list3, list4);
        KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I2 = new KtCSuperShape0S3310000_I2(imageUrl, str, str2, str3, list3, list4, z);
        C109516k8 r0 = new C109516k8(r12, r19, r20);
        this.A00 = ktCSuperShape0S3310000_I2;
        this.A01 = r0;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "checker_tile";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I2;
        C131827ss r3 = (C131827ss) obj;
        KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I22 = this.A00;
        if (r3 != null) {
            ktCSuperShape0S3310000_I2 = r3.A00;
        } else {
            ktCSuperShape0S3310000_I2 = null;
        }
        return C04220Ms.A0I(ktCSuperShape0S3310000_I22, ktCSuperShape0S3310000_I2);
    }
}
