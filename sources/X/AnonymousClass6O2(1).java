package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2;
import com.instagram.api.schemas.ThreadContainerType;
import java.util.ArrayList;

/* renamed from: X.6O2  reason: invalid class name */
public final class AnonymousClass6O2 {
    public static final AnonymousClass5HQ A00(KtCSuperShape0S3210000_I2 ktCSuperShape0S3210000_I2) {
        C04220Ms.A0B(ktCSuperShape0S3210000_I2, 0);
        String str = ktCSuperShape0S3210000_I2.A03;
        if (str == null) {
            str = "";
        }
        String str2 = ktCSuperShape0S3210000_I2.A02;
        Iterable<KtCSuperShape0S1420000_I2> iterable = (Iterable) ktCSuperShape0S3210000_I2.A00;
        ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
        for (KtCSuperShape0S1420000_I2 A00 : iterable) {
            A0w.add(AnonymousClass6O3.A00(A00));
        }
        return new AnonymousClass5HQ((ThreadContainerType) ktCSuperShape0S3210000_I2.A01, str, str2, A0w);
    }
}
