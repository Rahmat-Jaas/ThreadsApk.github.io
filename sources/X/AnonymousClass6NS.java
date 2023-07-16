package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6NS  reason: invalid class name */
public final class AnonymousClass6NS {
    public static final KtCSuperShape0S3310000_I2 A00(AnonymousClass5Im r8) {
        ImageUrl imageUrl;
        C04220Ms.A0B(r8, 0);
        AnonymousClass6NY r1 = r8.A01;
        if (C04220Ms.A0I(r1, AnonymousClass5wP.A00)) {
            imageUrl = null;
        } else if (r1 instanceof AnonymousClass5wO) {
            imageUrl = AnonymousClass3WG.A00(((AnonymousClass5wO) r1).A00);
        } else if (r1 instanceof AnonymousClass5wM) {
            imageUrl = ((AnonymousClass5wM) r1).A00;
        } else if (r1 instanceof AnonymousClass5wN) {
            imageUrl = ((AnonymousClass5wN) r1).A00;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        String str = r8.A05;
        String str2 = r8.A04;
        String str3 = r8.A03;
        return new KtCSuperShape0S3310000_I2(r8.A00, imageUrl, r8.A02, str, str2, str3, r8.A06);
    }
}
