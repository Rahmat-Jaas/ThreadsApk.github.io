package X;

import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.instagram.barcelona.feed.data.BarcelonaFeedCache;
import com.instagram.barcelona.feed.data.BarcelonaFeedItemDatabase;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S2301000_I2;

/* renamed from: X.7tu  reason: invalid class name and case insensitive filesystem */
public final class C132447tu implements AnonymousClass0i1 {
    public final BarcelonaFeedCache A00;
    public final UserSession A01;
    public final C27952Ew2 A02;

    public final Object A01(Integer num, String str, String str2, List list, C146958n9 r15) {
        Object A002 = C25599DoZ.A00(r15, this.A02.CWl(new AnonymousClass0gZ(742)), new KtSLambdaShape0S2301000_I2(this, list, num, str, str2, (C146958n9) null, 0));
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A002;
    }

    public /* synthetic */ C132447tu(UserSession userSession) {
        AnonymousClass0gQ AHN;
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        C37791K4m.A02();
        int i = C37791K4m.A02().A0A() ? 100 : 200;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new C129907nb(604800, AnonymousClass4WJ.A0A()));
        A0v.add(new AnonymousClass7nW());
        this.A00 = new BarcelonaFeedCache(context, userSession, A0v, i);
        boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36318909175239475L);
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        if (A0E) {
            AHN = A0J.BQy(739, 3);
        } else {
            AHN = A0J.AHN(739, 3);
        }
        this.A02 = AHN;
    }

    public final KtCSuperShape0S2100000_I2 A00() {
        KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2 = (KtCSuperShape0S2100000_I2) AnonymousClass00J.A0D(this.A00.A05);
        if (ktCSuperShape0S2100000_I2 == null) {
            return new KtCSuperShape0S2100000_I2((List) AnonymousClass0ZV.A00, 6, 12);
        }
        return ktCSuperShape0S2100000_I2;
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            BarcelonaFeedCache barcelonaFeedCache = this.A00;
            barcelonaFeedCache.A05.clear();
            C120627Bu.A02(BarcelonaFeedItemDatabase.A00, barcelonaFeedCache.A04);
        }
    }
}
