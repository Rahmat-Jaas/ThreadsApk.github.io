package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2;
import com.instagram.api.schemas.LineType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6O3  reason: invalid class name */
public final class AnonymousClass6O3 {
    public static final AnonymousClass5IF A00(KtCSuperShape0S1420000_I2 ktCSuperShape0S1420000_I2) {
        AnonymousClass7pF r3;
        C04220Ms.A0B(ktCSuperShape0S1420000_I2, 0);
        LineType lineType = (LineType) ktCSuperShape0S1420000_I2.A00;
        KtCSuperShape6S0100000_I2 ktCSuperShape6S0100000_I2 = new KtCSuperShape6S0100000_I2((BKU) ktCSuperShape0S1420000_I2.A01);
        List list = (List) ktCSuperShape0S1420000_I2.A02;
        User user = (User) ktCSuperShape0S1420000_I2.A03;
        String str = ktCSuperShape0S1420000_I2.A04;
        if (str != null) {
            r3 = new AnonymousClass7pF(str);
        } else {
            r3 = null;
        }
        return new AnonymousClass5IF(ktCSuperShape6S0100000_I2, lineType, r3, user, list, ktCSuperShape0S1420000_I2.A06, ktCSuperShape0S1420000_I2.A05, false);
    }
}
