package X;

import android.util.SparseArray;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.OffersList;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.fbpay.logging.LoggingContext;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;

/* renamed from: X.58K  reason: invalid class name */
public final class AnonymousClass58K extends C62793ak {
    public ECPOffer A00;
    public ECPOffer A01;
    public C883057n A02;
    public LoggingContext A03;
    public final C880756q A04;
    public final C880856r A05 = C880856r.A04(AnonymousClass7Kx.A0A(C18180wK.A0X()));
    public final C880856r A06;
    public final C880856r A07;
    public final C880856r A08;
    public final C880856r A09;
    public final C880856r A0A;
    public final C880856r A0B;
    public final AnonymousClass587 A0C;
    public final C143158gC A0D;
    public final C143158gC A0E;
    public final C143158gC A0F;

    public static final String A00(AnonymousClass58K r2) {
        SparseArray A0E2;
        C883057n r0 = r2.A02;
        Object obj = null;
        if (r0 == null) {
            C04220Ms.A0E("formViewModel");
            throw null;
        }
        AnonymousClass7Ih A012 = r0.A01(23);
        if (!(A012 == null || (A0E2 = A012.A0E()) == null)) {
            obj = A0E2.get(23);
        }
        C18240wQ.A1I(obj);
        return (String) obj;
    }

    public static final void A01(ECPOffer eCPOffer, AnonymousClass58K r5) {
        Collection collection;
        OffersList offersList;
        C880856r r3 = r5.A09;
        AnonymousClass7Kx A0R = C86104wH.A0R(r3);
        if (A0R == null || (offersList = (OffersList) A0R.A01) == null) {
            collection = AnonymousClass0ZV.A00;
        } else {
            collection = AnonymousClass00J.A0N(offersList.A00);
        }
        ArrayList A0s = C18200wM.A0s(collection);
        if (A0s.isEmpty()) {
            A0s.add(eCPOffer);
        } else {
            A0s.set(0, eCPOffer);
        }
        AnonymousClass7Kx.A0I(r3, new OffersList(AnonymousClass00J.A0N(A0s)));
    }

    public static final void A02(ECPOffer eCPOffer, AnonymousClass58K r5) {
        Collection collection;
        String str = eCPOffer.A00;
        r5.A06(str, eCPOffer.A01);
        if (str.length() > 0) {
            List A012 = C116956xt.A01(r5.A0A);
            if (A012 != null) {
                collection = AnonymousClass00J.A0N(A012);
            } else {
                collection = AnonymousClass0ZV.A00;
            }
            ArrayList A0s = C18200wM.A0s(collection);
            if (A0s.isEmpty()) {
                A0s.add(str);
            } else {
                A0s.set(0, str);
            }
            A03(new PromoCodeList(AnonymousClass00J.A0N(A0s)), r5);
            return;
        }
        A01(eCPOffer, r5);
    }

    public static final void A03(PromoCodeList promoCodeList, AnonymousClass58K r6) {
        AnonymousClass67Q r1;
        C880856r r4 = r6.A05;
        AnonymousClass7Kx A0R = C86104wH.A0R(r4);
        if (A0R != null) {
            r1 = A0R.A00;
        } else {
            r1 = null;
        }
        if (r1 != AnonymousClass67Q.LOADING) {
            AnonymousClass7Kx.A0I(r6.A07, new C108806iy(AnonymousClass006.A01, promoCodeList, (String) null));
            AnonymousClass7Kx.A0J(r4, (Object) null);
            return;
        }
        throw C18180wK.A0a("UI seems to be waiting for previous event response. Promo codes are handled one at a time. Check for bugs that are triggering concurrent events");
    }

    public static final void A05(AnonymousClass58K r6, String str, String str2) {
        String str3;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        r6.A01 = new ECPOffer(str3, "", "", str, "");
        C89375Dj r2 = new C89375Dj();
        r2.A0A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str);
        if (str2 != null) {
            r2.A0A("offer_id", str2);
        }
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = r6.A03;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_remove_promocode_init"), 390), loggingContext, new KtLambdaShape3S1300000_I2((Object) r2, (Object) AnonymousClass7Kr.A07(r6.A0C), (Object) loggingContext, "add_promocode", 20));
    }

    private final void A06(String str, String str2) {
        String str3;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        this.A00 = new ECPOffer(str3, "", "", str, "");
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_add_promocode_init"), 195), loggingContext, new KtLambdaShape3S1300000_I2((Object) C89375Dj.A00(str, str2), (Object) AnonymousClass7Kr.A07(this.A0C), (Object) loggingContext, "add_promocode", 3));
    }

    public final List A07() {
        ECPOffer eCPOffer;
        ECPOffer eCPOffer2;
        C880756q r4 = this.A04;
        AnonymousClass7Kx A0R = C86104wH.A0R(r4);
        String str = null;
        if (A0R == null || A0R.A01 == null) {
            return AnonymousClass0ZV.A00;
        }
        C89375Dj r3 = new C89375Dj();
        AnonymousClass7Kx A0R2 = C86104wH.A0R(r4);
        if (!(A0R2 == null || (eCPOffer2 = (ECPOffer) A0R2.A01) == null)) {
            str = eCPOffer2.A00;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        r3.A0A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str);
        AnonymousClass7Kx A0R3 = C86104wH.A0R(r4);
        if (!(A0R3 == null || (eCPOffer = (ECPOffer) A0R3.A01) == null)) {
            str2 = eCPOffer.A01;
        }
        r3.A0A("offer_id", str2);
        return C18180wK.A0n(r3);
    }

    public final List A08() {
        ECPOffer eCPOffer = this.A00;
        if (eCPOffer == null) {
            return AnonymousClass0ZV.A00;
        }
        C89375Dj r2 = new C89375Dj();
        r2.A0A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, eCPOffer.A00);
        ECPOffer eCPOffer2 = this.A00;
        if (eCPOffer2 != null) {
            r2.A0A("offer_id", eCPOffer2.A01);
        }
        return C18180wK.A0n(r2);
    }

    public AnonymousClass58K(AnonymousClass587 r9) {
        this.A0C = r9;
        C880856r A032 = C880856r.A03();
        this.A0B = A032;
        C880756q A012 = C880756q.A01();
        this.A04 = A012;
        C880856r A033 = C880856r.A03();
        AnonymousClass7Kx.A0I(A033, (Object) null);
        this.A09 = A033;
        C880856r A034 = C880856r.A03();
        new PromoCodeList(AnonymousClass0ZV.A00);
        this.A0A = A034;
        C880856r A035 = C880856r.A03();
        AnonymousClass7Kx.A0J(A035, (Object) null);
        this.A08 = A035;
        this.A06 = C880856r.A03();
        this.A07 = C880856r.A03();
        IDxObserverShape211S0100000_2_I2 A0Q = C86114wI.A0Q(this, 134);
        this.A0F = A0Q;
        IDxObserverShape211S0100000_2_I2 A0Q2 = C86114wI.A0Q(this, 132);
        this.A0E = A0Q2;
        IDxObserverShape211S0100000_2_I2 A0Q3 = C86114wI.A0Q(this, 131);
        this.A0D = A0Q3;
        AnonymousClass7Kx.A0I(A012, (Object) null);
        A012.A0K(A032, A0Q);
        A012.A0K(A034, A0Q2);
        A012.A0K(A033, A0Q3);
    }

    public static final void A04(AnonymousClass58K r4) {
        Collection collection;
        r4.A06(A00(r4), (String) null);
        String A002 = A00(r4);
        C880856r r2 = r4.A0A;
        List A012 = C116956xt.A01(r2);
        if (A012 == null || !A012.contains(A002)) {
            List A013 = C116956xt.A01(r2);
            if (A013 != null) {
                collection = AnonymousClass00J.A0N(A013);
            } else {
                collection = AnonymousClass0ZV.A00;
            }
            ArrayList A0s = C18200wM.A0s(collection);
            if (A0s.isEmpty()) {
                A0s.add(A002);
            } else {
                A0s.set(0, A002);
            }
            A03(new PromoCodeList(AnonymousClass00J.A0N(A0s)), r4);
        }
    }
}
