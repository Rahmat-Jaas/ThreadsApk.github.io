package X;

import android.view.View;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* renamed from: X.5zu  reason: invalid class name and case insensitive filesystem */
public final class C95335zu extends C19819BBt {
    public C11630kW A00;
    public C30938GbW A01;
    public String A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final LinkedHashMap A06 = C18220wO.A0y();

    public C95335zu(C11630kW r2, C30938GbW gbW, UserSession userSession, String str, String str2, String str3) {
        C18230wP.A1R(userSession, 1, gbW);
        this.A03 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = r2;
        this.A01 = gbW;
        this.A02 = str3;
    }

    public final void A00(View view, Product product, Integer num) {
        View view2 = view;
        C04220Ms.A0B(view, 0);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A03, 36310868996129039L)) {
            Integer num2 = num;
            String A0D = AnonymousClass00U.A0D(AnonymousClass6VD.A00(num), Rfc3492Idn.delimiter, view.getId());
            Product product2 = product;
            if (product != null) {
                A0D = AnonymousClass00U.A0N(A0D, product.A00.A0j, Rfc3492Idn.delimiter);
            }
            if (!this.A06.containsKey(A0D)) {
                C132727uP r3 = new C132727uP(view2, product2, this, num2, A0D);
                C30938GbW gbW = this.A01;
                Unit unit = Unit.A00;
                C37021Jix A002 = C37284Jnx.A00(unit, unit, String.valueOf(view.getId()));
                A002.A01(r3);
                gbW.A03(view, A002.A02());
            }
        }
    }

    public final void onDestroyView() {
        Long l;
        UserSession userSession = this.A03;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36310868996129039L)) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this.A00, userSession), AnonymousClass000.A00(1114)), 2719);
            A0I.A0T(AnonymousClass000.A00(1147), "native");
            A0I.A1b(AnonymousClass000.A00(1278));
            A0I.A0T(AnonymousClass000.A00(1172), AnonymousClass000.A00(824));
            A0I.A0T(I17.A00(26), this.A02);
            String str = this.A04;
            if (str != null) {
                l = AnonymousClass0wJ.A0d(str);
            } else {
                l = null;
            }
            A0I.A0l(l);
            A0I.A1e(this.A05);
            Collection values = this.A06.values();
            C04220Ms.A06(values);
            A0I.A0U(AnonymousClass000.A00(841), AnonymousClass00J.A0N(values));
            A0I.Bb4();
        }
        this.A06.clear();
    }
}
