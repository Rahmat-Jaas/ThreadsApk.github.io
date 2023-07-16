package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7Dj  reason: invalid class name and case insensitive filesystem */
public final class C120957Dj {
    public final AnonymousClass3V6 A00 = AnonymousClass2LT.A00();
    public final AnonymousClass3V6 A01 = AnonymousClass2LT.A00();
    public final UserSession A02;
    public final List A03;
    public final List A04;
    public final C86094wG A05;
    public final C86074wE A06;

    public C120957Dj(UserSession userSession) {
        Object value;
        KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2;
        this.A02 = userSession;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A03 = A0v;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        this.A04 = A0v2;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0400000_I2((KtCSuperShape0S1200000_I2) null, (KtCSuperShape0S1200000_I2) null, (KtCSuperShape0S1200000_I2) null, (C970767v) null, (DefaultConstructorMarker) null, 15, 6));
        this.A06 = A0z;
        this.A05 = A0z;
        KtCSuperShape0S0302000_I2 ktCSuperShape0S0302000_I2 = (KtCSuperShape0S0302000_I2) ((KtCSuperShape0S0200000_I2) AnonymousClass6NJ.A00(userSession).A09.getValue()).A01;
        if (ktCSuperShape0S0302000_I2 != null) {
            A0v.addAll((Collection) ktCSuperShape0S0302000_I2.A04);
            A0v2.addAll((Collection) ktCSuperShape0S0302000_I2.A02);
            do {
                value = A0z.getValue();
                ktCSuperShape0S0400000_I2 = (KtCSuperShape0S0400000_I2) value;
            } while (!A0z.ADi(value, KtCSuperShape0S0400000_I2.A00(ktCSuperShape0S0400000_I2, (KtCSuperShape0S1200000_I2) null, (KtCSuperShape0S1200000_I2) ktCSuperShape0S0400000_I2.A01, (KtCSuperShape0S1200000_I2) ktCSuperShape0S0400000_I2.A02, (C970767v) ktCSuperShape0S0302000_I2.A03, 1)));
        }
    }

    public static final KtCSuperShape0S1200000_I2 A00(C968466x r1, C120957Dj r2) {
        Object obj;
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            obj = ((KtCSuperShape0S0400000_I2) r2.A05.getValue()).A01;
        } else if (ordinal == 1) {
            obj = ((KtCSuperShape0S0400000_I2) r2.A05.getValue()).A02;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return (KtCSuperShape0S1200000_I2) obj;
    }

    public static final void A01(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, C968466x r11, C120957Dj r12, C970767v r13) {
        Object value;
        Object value2;
        int ordinal = r11.ordinal();
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I22 = ktCSuperShape0S1200000_I2;
        C970767v r7 = r13;
        if (ordinal == 0) {
            C86074wE r2 = r12.A06;
            do {
                value = r2.getValue();
            } while (!r2.ADi(value, KtCSuperShape0S0400000_I2.A00((KtCSuperShape0S0400000_I2) value, (KtCSuperShape0S1200000_I2) null, ktCSuperShape0S1200000_I2, (KtCSuperShape0S1200000_I2) null, r7, 5)));
        } else if (ordinal == 1) {
            C86074wE r22 = r12.A06;
            do {
                value2 = r22.getValue();
            } while (!r22.ADi(value2, KtCSuperShape0S0400000_I2.A00((KtCSuperShape0S0400000_I2) value2, (KtCSuperShape0S1200000_I2) null, (KtCSuperShape0S1200000_I2) null, ktCSuperShape0S1200000_I22, r7, 3)));
        }
    }
}
