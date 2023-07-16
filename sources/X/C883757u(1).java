package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S0010000_I2;
import com.instagram.barcelona.share.data.PermalinkRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.57u  reason: invalid class name and case insensitive filesystem */
public final class C883757u extends C62793ak {
    public final C24805DaJ A00;
    public final C105566dd A01 = new C105566dd();
    public final PermalinkRepository A02;
    public final C11630kW A03;
    public final UserSession A04;
    public final User A05;
    public final String A06;
    public final C86074wE A07;
    public final C86094wG A08;

    public /* synthetic */ C883757u(C24805DaJ daJ, C11630kW r15, UserSession userSession, String str) {
        Object value;
        List list;
        List list2;
        boolean z;
        Object value2;
        KtCSuperShape0S0220000_I2 ktCSuperShape0S0220000_I2;
        UserSession userSession2 = userSession;
        PermalinkRepository permalinkRepository = new PermalinkRepository(userSession2);
        String str2 = str;
        this.A06 = str2;
        this.A04 = userSession2;
        this.A03 = r15;
        this.A00 = daJ;
        this.A02 = permalinkRepository;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0220000_I2((List) null, (List) null, (DefaultConstructorMarker) null, 15, 1, false, false));
        this.A07 = A0z;
        this.A08 = C18230wP.A0x((C148838sG) null, A0z);
        User A0P = C18210wN.A0P(userSession2, str2);
        this.A05 = A0P;
        if (A0P != null) {
            List A17 = C06750aI.A17(C302620i.CopyLink, C302620i.ShareProfile);
            List A172 = C06750aI.A17(C06750aI.A17(new KtCSuperShape2S0010000_I2(A0P.A38(), 1), new KtCSuperShape2S0010000_I2(A0P.BXy(), 2)), C06750aI.A17(new KtCSuperShape2S0010000_I2(A0P.BRq(), 0), AnonymousClass7pE.A00));
            do {
                value2 = A0z.getValue();
                ktCSuperShape0S0220000_I2 = (KtCSuperShape0S0220000_I2) value2;
            } while (!A0z.ADi(value2, new KtCSuperShape0S0220000_I2(A17, A172, ktCSuperShape0S0220000_I2.A02, ktCSuperShape0S0220000_I2.A03)));
            return;
        }
        do {
            value = A0z.getValue();
            KtCSuperShape0S0220000_I2 ktCSuperShape0S0220000_I22 = (KtCSuperShape0S0220000_I2) value;
            list = (List) ktCSuperShape0S0220000_I22.A01;
            list2 = (List) ktCSuperShape0S0220000_I22.A00;
            z = ktCSuperShape0S0220000_I22.A03;
            C04220Ms.A0B(list, 0);
            C04220Ms.A0B(list2, 1);
        } while (!A0z.ADi(value, new KtCSuperShape0S0220000_I2(list, list2, true, z)));
    }

    public static final void A00(C883757u r6) {
        Object value;
        List list;
        List list2;
        boolean z;
        C86074wE r62 = r6.A07;
        do {
            value = r62.getValue();
            KtCSuperShape0S0220000_I2 ktCSuperShape0S0220000_I2 = (KtCSuperShape0S0220000_I2) value;
            list = (List) ktCSuperShape0S0220000_I2.A01;
            list2 = (List) ktCSuperShape0S0220000_I2.A00;
            z = ktCSuperShape0S0220000_I2.A03;
            C18210wN.A0n(1, list, list2);
        } while (!r62.ADi(value, new KtCSuperShape0S0220000_I2(list, list2, true, z)));
    }
}
