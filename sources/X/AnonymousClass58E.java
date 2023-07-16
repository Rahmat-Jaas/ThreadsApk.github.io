package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0250000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2;
import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.58E  reason: invalid class name */
public final class AnonymousClass58E extends C62793ak {
    public boolean A00;
    public final AnonymousClass7JF A01;
    public final AnonymousClass6LS A02;
    public final AppreciationGiftFeedRepository A03;
    public final C86064wD A04;
    public final C84714tk A05;
    public final C86074wE A06;
    public final C86094wG A07;

    public final void setViewStateForTest(C142288ec r2) {
        C04220Ms.A0B(r2, 0);
        this.A06.CrC(r2);
    }

    public static final KtCSuperShape0S0250000_I2 A00(AnonymousClass58E r1) {
        C142288ec r12 = (C142288ec) r1.A06.getValue();
        if (r12 instanceof AnonymousClass5LQ) {
            return ((AnonymousClass5LQ) r12).A00;
        }
        return null;
    }

    public static final List A01(KtCSuperShape0S0250000_I2 ktCSuperShape0S0250000_I2) {
        Iterable<KtCSuperShape0S1321100_I2> iterable;
        if (ktCSuperShape0S0250000_I2 == null || (iterable = (Iterable) ktCSuperShape0S0250000_I2.A01) == null) {
            return null;
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
        for (KtCSuperShape0S1321100_I2 ktCSuperShape0S1321100_I2 : iterable) {
            A0w.add(ktCSuperShape0S1321100_I2.A05);
        }
        return A0w;
    }

    public static final boolean A02(KtCSuperShape0S0250000_I2 ktCSuperShape0S0250000_I2) {
        if (!((List) ktCSuperShape0S0250000_I2.A01).isEmpty()) {
            return false;
        }
        Collection<AnonymousClass5HS> collection = (Collection) ktCSuperShape0S0250000_I2.A00;
        if (collection != null && collection.isEmpty()) {
            return true;
        }
        for (AnonymousClass5HS r0 : collection) {
            if (r0.A00 != -1) {
                return false;
            }
        }
        return true;
    }

    public final Long A03() {
        long j = this.A03.A00;
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    public AnonymousClass58E(AnonymousClass7JF r5, AnonymousClass6LS r6, AppreciationGiftFeedRepository appreciationGiftFeedRepository) {
        this.A03 = appreciationGiftFeedRepository;
        this.A02 = r6;
        this.A01 = r5;
        C27457Enn A0z = C18190wL.A0z(C130107oi.A00);
        this.A06 = A0z;
        this.A07 = C18230wP.A0x((C148838sG) null, A0z);
        C27442EnY enY = new C27442EnY();
        this.A04 = enY;
        this.A05 = AnonymousClass7C4.A02(enY);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 43), AnonymousClass3J5.A00(this), 3);
    }
}
