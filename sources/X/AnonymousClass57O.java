package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.57O  reason: invalid class name */
public final class AnonymousClass57O extends C62793ak {
    public final AnonymousClass37V A00;
    public final C11630kW A01;
    public final UserSession A02;
    public final User A03;
    public final C86074wE A04;
    public final C86094wG A05;

    public /* synthetic */ AnonymousClass57O(C11630kW r11, UserSession userSession, boolean z) {
        Object value;
        AnonymousClass37V r0 = new AnonymousClass37V(userSession);
        this.A02 = userSession;
        this.A01 = r11;
        this.A00 = r0;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0120000_I2((List) null, (DefaultConstructorMarker) null, 7, 0, false, false));
        this.A04 = A0z;
        this.A05 = A0z;
        this.A03 = AnonymousClass0wJ.A0Y(userSession);
        List A18 = C06750aI.A18(AnonymousClass68L.PRIVATE_PROFILE, AnonymousClass68L.MENTIONS, AnonymousClass68L.MUTED_PROFILES);
        if (z) {
            A18.add(AnonymousClass68L.HIDDEN_WORDS);
        }
        A18.add(AnonymousClass68L.PROFILES_YOU_FOLLOW);
        A18.add(AnonymousClass68L.OTHER_SETTINGS);
        A18.add(AnonymousClass68L.BLOCKED_PROFILES);
        A18.add(AnonymousClass68L.HIDE_LIKES);
        do {
            value = A0z.getValue();
        } while (!A0z.ADi(value, new KtCSuperShape0S0120000_I2(A18, 0, C18180wK.A1Z(this.A03.A0e(), C169839tz.PrivacyStatusPrivate), ((KtCSuperShape0S0120000_I2) value).A02)));
    }
}
