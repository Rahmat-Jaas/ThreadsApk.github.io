package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.events.data.EventsRepository;
import com.instagram.model.venue.Venue;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.10I  reason: invalid class name */
public final class AnonymousClass10I extends C62793ak {
    public final EventsRepository A00;
    public final C86064wD A01;
    public final C84714tk A02;
    public final C86074wE A03;
    public final C86074wE A04;
    public final C86094wG A05;
    public final C86094wG A06;

    public AnonymousClass10I(EventsRepository eventsRepository) {
        this.A00 = eventsRepository;
        C27457Enn A0z = C18190wL.A0z(new AnonymousClass17S(new KtCSuperShape0S1200000_I2((C26743EUq) null, (ImageUrl) null, (String) null, (DefaultConstructorMarker) null, 7, 13), (KtCSuperShape1S0200000_I2_1) null, AnonymousClass22M.UNINITIALIZED, (Venue) null, "", "", (String) null, AnonymousClass0ZV.A00, false, false));
        this.A04 = A0z;
        this.A06 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(DIV.A01);
        this.A03 = A0z2;
        this.A05 = A0z2;
        C27442EnY enY = new C27442EnY();
        this.A01 = enY;
        this.A02 = AnonymousClass7C4.A02(enY);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(this, (C146958n9) null, 14), AnonymousClass3J5.A00(this), 3);
    }

    public final void A00(Venue venue) {
        Object value;
        C86074wE r2 = this.A04;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass17S.A00((KtCSuperShape0S1200000_I2) null, (KtCSuperShape1S0200000_I2_1) null, (AnonymousClass22M) null, (AnonymousClass17S) value, venue, (String) null, (String) null, (String) null, (List) null, 1019, false, false)));
    }
}
