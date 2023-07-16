package X;

import com.facebook.graphql.impls.IncentiveItemInfoImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: X.588  reason: invalid class name */
public final class AnonymousClass588 extends C62793ak {
    public ECPIncentive A00;
    public ECPIncentive A01;
    public boolean A02 = true;
    public final C880856r A03;
    public final C880856r A04;
    public final C880856r A05;
    public final C880856r A06;
    public final C880856r A07 = C880856r.A03();
    public final C880856r A08 = C880856r.A03();

    public final void A08(PromoCodeList promoCodeList) {
        String str;
        List<String> list = promoCodeList.A00;
        if (list.isEmpty()) {
            C880856r r2 = this.A05;
            AnonymousClass7Kx.A0I(r2, new IncentiveList(AnonymousClass7BJ.A02(r2)));
        }
        for (String next : list) {
            List A022 = AnonymousClass7BJ.A02(this.A05);
            if (!(A022 instanceof Collection) || !A022.isEmpty()) {
                Iterator it = A022.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C04220Ms.A0I(((ECPIncentive) it.next()).getId(), next)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            ECPIncentive eCPIncentive = this.A00;
            if (eCPIncentive != null) {
                str = eCPIncentive.getId();
            } else {
                str = null;
            }
            if (C04220Ms.A0I(str, next)) {
                ECPIncentive eCPIncentive2 = this.A00;
                if (eCPIncentive2 != null) {
                    A00(eCPIncentive2, this);
                }
                this.A00 = null;
            } else {
                A00(new ECPOffsiteOffer((CurrencyAmount) null, false, next, next, (String) null, (String) null, (String) null), this);
            }
        }
        ECPIncentive eCPIncentive3 = this.A01;
        if ((eCPIncentive3 instanceof ECPOffsiteOffer) && eCPIncentive3 != null) {
            C880856r r22 = this.A05;
            AnonymousClass7Kx.A0I(r22, new IncentiveList(AnonymousClass00J.A0U(C18200wM.A0s(AnonymousClass7BJ.A02(r22)), eCPIncentive3)));
            this.A01 = null;
        }
    }

    public static final void A00(ECPIncentive eCPIncentive, AnonymousClass588 r2) {
        C880856r r22 = r2.A05;
        AnonymousClass7Kx.A0I(r22, new IncentiveList(AnonymousClass00J.A0X(eCPIncentive, C18200wM.A0s(AnonymousClass7BJ.A02(r22)))));
    }

    public final Void A01(String str) {
        String str2;
        Object obj;
        ECPIncentive eCPIncentive;
        IncentiveItemInfoImpl incentiveItemInfoImpl;
        Iterator it = AnonymousClass7BJ.A01(this.A04).iterator();
        while (true) {
            str2 = str;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            TreeJNI treeJNI = (TreeJNI) obj;
            Class<IncentiveItemInfoImpl> cls = IncentiveItemInfoImpl.class;
            if (!C04220Ms.A0I(treeJNI.reinterpret(cls).getStringValue("incentive_id"), str)) {
                if (C04220Ms.A0I(treeJNI.reinterpret(cls).getStringValue("promo_code"), str)) {
                    break;
                }
            } else {
                break;
            }
        }
        TreeJNI treeJNI2 = (TreeJNI) obj;
        if (treeJNI2 == null || (incentiveItemInfoImpl = (IncentiveItemInfoImpl) treeJNI2.reinterpret(IncentiveItemInfoImpl.class)) == null || (eCPIncentive = AnonymousClass6IB.A00(incentiveItemInfoImpl)) == null) {
            eCPIncentive = new ECPOffsiteOffer((CurrencyAmount) null, (Boolean) null, str2, str, (String) null, (String) null, (String) null);
        }
        List<ECPIncentive> A022 = AnonymousClass7BJ.A02(this.A05);
        if (!(A022 instanceof Collection) || !A022.isEmpty()) {
            for (ECPIncentive id : A022) {
                if (C04220Ms.A0I(id.getId(), str)) {
                    return null;
                }
            }
        }
        this.A00 = eCPIncentive;
        AnonymousClass7BJ.A00(eCPIncentive).A8v(eCPIncentive, this);
        return null;
    }

    public final Void A02(String str) {
        Object obj;
        Iterator it = AnonymousClass7BJ.A02(this.A05).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C04220Ms.A0I(((ECPIncentive) obj).getId(), str)) {
                break;
            }
        }
        ECPIncentive eCPIncentive = (ECPIncentive) obj;
        if (eCPIncentive != null) {
            this.A01 = eCPIncentive;
            AnonymousClass7BJ.A00(eCPIncentive).Cbm(eCPIncentive, this);
        }
        return null;
    }

    public final List A03() {
        ECPOnsiteOffer eCPOnsiteOffer;
        List<ECPIncentive> A022 = AnonymousClass7BJ.A02(this.A05);
        ArrayList A0w = AnonymousClass0wJ.A0w(A022);
        for (ECPIncentive eCPIncentive : A022) {
            C89375Dj r2 = new C89375Dj();
            r2.A0A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, eCPIncentive.BH2());
            r2.A0A("offer_id", eCPIncentive.getId());
            if ((eCPIncentive instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive) != null) {
                r2.A0A("credential_id", eCPOnsiteOffer.A01);
            }
            A0w.add(r2);
        }
        return A0w;
    }

    public final List A04() {
        List list;
        String str;
        C880856r r9 = this.A04;
        List A012 = AnonymousClass7BJ.A01(r9);
        ArrayList A0w = AnonymousClass0wJ.A0w(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            TreeJNI A0G = C18210wN.A0G(it);
            Class<IncentiveItemInfoImpl> cls = IncentiveItemInfoImpl.class;
            IncentiveItemInfoImpl incentiveItemInfoImpl = (IncentiveItemInfoImpl) A0G.reinterpret(cls);
            C04220Ms.A06(incentiveItemInfoImpl);
            boolean z = AnonymousClass6IB.A00(incentiveItemInfoImpl) instanceof ECPOffsiteOffer;
            TreeJNI reinterpret = A0G.reinterpret(cls);
            if (z) {
                str = "promo_code";
            } else {
                str = "incentive_id";
            }
            Pair A0p = C18180wK.A0p("offer_id", reinterpret.getStringValue(str));
            Pair A0p2 = C18180wK.A0p(DialogModule.KEY_TITLE, C86124wJ.A0u(A0G, cls, DialogModule.KEY_TITLE));
            Pair A0p3 = C18180wK.A0p(DevServerEntity.COLUMN_DESCRIPTION, A0G.reinterpret(cls).getStringValue("subtitle"));
            Pair A0p4 = C18180wK.A0p("expiration_date", A0G.reinterpret(cls).getStringValue("expiration_date_text"));
            String lowerCase = String.valueOf(C86104wH.A0a(A0G.reinterpret(cls), C967866r.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "incentive_type")).toLowerCase();
            C04220Ms.A06(lowerCase);
            A0w.add(AnonymousClass4WJ.A0H(A0p, A0p2, A0p3, A0p4, C18180wK.A0p("incentive_type", lowerCase)));
        }
        List list2 = A0w;
        for (ECPIncentive eCPIncentive : AnonymousClass7BJ.A02(this.A05)) {
            List A013 = AnonymousClass7BJ.A01(r9);
            if (!(A013 instanceof Collection) || !A013.isEmpty()) {
                Iterator it2 = A013.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C04220Ms.A0I(C18210wN.A0G(it2).reinterpret(IncentiveItemInfoImpl.class).getStringValue("promo_code"), eCPIncentive.getId())) {
                            list = list2;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                list2 = list;
            }
            Pair A0p5 = C18180wK.A0p("offer_id", eCPIncentive.getId());
            Pair A0p6 = C18180wK.A0p(DialogModule.KEY_TITLE, eCPIncentive.BH2());
            Pair A0p7 = C18180wK.A0p(DevServerEntity.COLUMN_DESCRIPTION, "");
            Pair A0p8 = C18180wK.A0p("expiration_date", "");
            String lowerCase2 = C967866r.PROMO_CODE.toString().toLowerCase();
            C04220Ms.A06(lowerCase2);
            list = AnonymousClass00J.A0X(AnonymousClass4WJ.A0H(A0p5, A0p6, A0p7, A0p8, C18180wK.A0p("incentive_type", lowerCase2)), list2);
            list2 = list;
        }
        return list2;
    }

    public final List A05() {
        ECPOnsiteOffer eCPOnsiteOffer;
        ECPIncentive eCPIncentive = this.A00;
        if (eCPIncentive == null) {
            return AnonymousClass0ZV.A00;
        }
        C89375Dj r3 = new C89375Dj();
        String BH2 = eCPIncentive.BH2();
        String str = "";
        if (BH2 == null) {
            BH2 = str;
        }
        r3.A0A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, BH2);
        ECPIncentive eCPIncentive2 = this.A00;
        if (eCPIncentive2 != null) {
            str = eCPIncentive2.getId();
        }
        r3.A0A("offer_id", str);
        ECPIncentive eCPIncentive3 = this.A00;
        if ((eCPIncentive3 instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive3) != null) {
            r3.A0A("credential_id", eCPOnsiteOffer.A01);
        }
        return C18180wK.A0n(r3);
    }

    public final List A06() {
        List<ECPIncentive> A022 = AnonymousClass7BJ.A02(this.A05);
        ArrayList A0w = AnonymousClass0wJ.A0w(A022);
        for (ECPIncentive id : A022) {
            A0w.add(id.getId());
        }
        return A0w;
    }

    public final void A07() {
        List A022 = AnonymousClass7BJ.A02(this.A05);
        ArrayList<ECPOffsiteOffer> A0v = AnonymousClass0wJ.A0v();
        for (Object next : A022) {
            if (next instanceof ECPOffsiteOffer) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        for (ECPOffsiteOffer eCPOffsiteOffer : A0v) {
            A0w.add(eCPOffsiteOffer.A00);
        }
        AnonymousClass7Kx.A0I(this.A08, new C108806iy(AnonymousClass006.A01, new PromoCodeList(A0w), (String) null));
    }

    public AnonymousClass588() {
        C880856r A032 = C880856r.A03();
        this.A06 = A032;
        this.A05 = C880856r.A04(AnonymousClass7Kx.A09(new IncentiveList(AnonymousClass0ZV.A00)));
        C880856r A033 = C880856r.A03();
        AnonymousClass7Kx.A0J(A033, (Object) null);
        this.A04 = A033;
        this.A03 = C880856r.A03();
        A032.A0E(C86114wI.A0Q(this, 86));
    }
}
