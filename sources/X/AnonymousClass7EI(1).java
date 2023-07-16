package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2620000_I2;
import com.instagram.service.session.UserSession;
import com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110;

/* renamed from: X.7EI  reason: invalid class name */
public final class AnonymousClass7EI {
    public final AnonymousClass3V6 A00 = new AnonymousClass3V6(AnonymousClass1k7.A00);
    public final UserSession A01;
    public final C106546fD A02;
    public final C112286pK A03;
    public final HashMap A04 = AnonymousClass0wJ.A0y();

    public AnonymousClass7EI(UserSession userSession) {
        C106546fD r2 = new C106546fD(userSession);
        C112286pK r1 = (C112286pK) userSession.A01(C112286pK.class, new KtLambdaShape130S0100000_I2_110(userSession, 26));
        C04220Ms.A0B(r1, 2);
        this.A02 = r2;
        this.A03 = r1;
        this.A01 = userSession;
    }

    public static final C86074wE A00(AnonymousClass7EI r1, String str) {
        HashMap hashMap = r1.A04;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = C18190wL.A0z(C102366Ux.A00(new ShoppingHomeFeedEndpoint.SearchFeedEndpoint(str)));
            hashMap.put(str, obj);
        }
        return (C86074wE) obj;
    }

    public final Object A02(KtCSuperShape0S2620000_I2 ktCSuperShape0S2620000_I2, C146958n9 r7) {
        return C86164wN.A0U(this.A00.A00(((ShoppingHomeFeedEndpoint.SearchFeedEndpoint) ktCSuperShape0S2620000_I2.A00).A02, r7, new KtSLambdaShape26S0201000_I2(this, ktCSuperShape0S2620000_I2, (C146958n9) null, 5)));
    }

    public static final void A01(AnonymousClass7EI r2, String str, AnonymousClass0YY r4) {
        Object value = A00(r2, str).getValue();
        Object invoke = r4.invoke(value);
        if (!C04220Ms.A0I(invoke, value)) {
            A00(r2, str).CrC(invoke);
        }
    }
}
