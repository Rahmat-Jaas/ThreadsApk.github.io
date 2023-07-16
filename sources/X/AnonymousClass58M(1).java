package X;

import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxIncentiveItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPromoCodeItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;
import kotlin.jvm.internal.KtLambdaShape3S1400000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1300000_I2;

/* renamed from: X.58M  reason: invalid class name */
public final class AnonymousClass58M extends C62793ak {
    public int A00;
    public M5J A01;
    public M5J A02;
    public C880856r A03;
    public AnonymousClass69U A04;
    public ECPHandler A05;
    public C1198277d A06;
    public LoggingContext A07;
    public AnonymousClass7Kx A08;
    public AnonymousClass7Kx A09;
    public AnonymousClass7Kx A0A;
    public AnonymousClass7Kx A0B;
    public AnonymousClass7Kx A0C;
    public AnonymousClass7Kx A0D;
    public AnonymousClass7Kx A0E;
    public AnonymousClass7Kx A0F;
    public AnonymousClass7Kx A0G;
    public AnonymousClass7Kx A0H;
    public AnonymousClass7Kx A0I;
    public AnonymousClass7Kx A0J;
    public AnonymousClass7Kx A0K;
    public AnonymousClass7Kx A0L;
    public AnonymousClass7Kx A0M;
    public AnonymousClass7Kx A0N;
    public AnonymousClass7Kx A0O;
    public AnonymousClass7Kx A0P;
    public AnonymousClass7Kx A0Q;
    public AnonymousClass7Kx A0R;
    public AnonymousClass7Kx A0S;
    public Boolean A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public List A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public AnonymousClass7Kx A0h;
    public AnonymousClass7Kx A0i;
    public AnonymousClass7Kx A0j;
    public AnonymousClass7Kx A0k;
    public Boolean A0l;
    public Boolean A0m;
    public Map A0n;
    public boolean A0o;
    public final M5J A0p;
    public final M5J A0q;
    public final C880756q A0r;
    public final C880756q A0s;
    public final C880856r A0t;
    public final C880856r A0u;
    public final C880856r A0v;
    public final C880856r A0w;
    public final C880856r A0x;
    public final C880856r A0y;
    public final C880856r A0z = C880856r.A03();
    public final C143158gC A10;
    public final C143158gC A11;
    public final C143158gC A12;
    public final C143158gC A13;
    public final C143158gC A14;
    public final C143158gC A15;
    public final C143158gC A16;
    public final C143158gC A17;
    public final C143158gC A18;
    public final C143158gC A19;
    public final C143158gC A1A;
    public final C143158gC A1B;
    public final C143158gC A1C;
    public final C143158gC A1D;
    public final C143158gC A1E;
    public final C143158gC A1F;
    public final C143158gC A1G;
    public final C143158gC A1H;
    public final C143158gC A1I;
    public final AnonymousClass58V A1J;
    public final AnonymousClass574 A1K;
    public final AnonymousClass78P A1L;
    public final AnonymousClass58S A1M;
    public final AnonymousClass588 A1N;
    public final AnonymousClass587 A1O;
    public final AnonymousClass58U A1P;
    public final C883957w A1Q;
    public final AnonymousClass58R A1R;
    public final AnonymousClass58K A1S;
    public final AnonymousClass58T A1T;
    public final AnonymousClass578 A1U;
    public final LinkedHashMap A1V;
    public final Map A1W;
    public final Map A1X;
    public final List A1Y;
    public final List A1Z;

    public AnonymousClass58M(AnonymousClass58V r29, AnonymousClass574 r30, AnonymousClass58S r31, AnonymousClass588 r32, AnonymousClass587 r33, AnonymousClass58U r34, C883957w r35, AnonymousClass58R r36, AnonymousClass58K r37, AnonymousClass58T r38, AnonymousClass578 r39) {
        C883957w r6 = r35;
        C04220Ms.A0B(r6, 1);
        AnonymousClass58S r10 = r31;
        AnonymousClass58T r3 = r38;
        AnonymousClass0wJ.A1Q(r3, r10);
        AnonymousClass58V r12 = r29;
        AnonymousClass58R r5 = r36;
        C18190wL.A1S(r12, 4, r5);
        AnonymousClass58U r7 = r34;
        AnonymousClass58K r4 = r37;
        AnonymousClass578 r1 = r39;
        C18180wK.A1S(r1, r7, r4);
        AnonymousClass574 r11 = r30;
        AnonymousClass588 r9 = r32;
        AnonymousClass587 r8 = r33;
        C86104wH.A1Q(r9, r8, r11);
        this.A1Q = r6;
        this.A1T = r3;
        this.A1M = r10;
        this.A1J = r12;
        this.A1R = r5;
        this.A1U = r1;
        this.A1P = r7;
        this.A1S = r4;
        this.A1N = r9;
        this.A1O = r8;
        this.A1K = r11;
        AnonymousClass78P r13 = new AnonymousClass78P();
        this.A1L = r13;
        this.A0q = r13.A09;
        this.A0r = C880756q.A01();
        this.A0v = C880856r.A03();
        this.A0y = C880856r.A03();
        this.A0u = C880856r.A03();
        this.A0w = C880856r.A03();
        C880856r A032 = C880856r.A03();
        this.A0t = A032;
        this.A0p = A032;
        this.A0x = C880856r.A03();
        AnonymousClass69P r15 = AnonymousClass69P.ITEM_LIST;
        Pair A0p2 = C18180wK.A0p(r15, new C1201078o(false));
        Pair A0p3 = C18180wK.A0p(AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION, new C1201078o(false));
        AnonymousClass69P r14 = AnonymousClass69P.PRICE_TABLE;
        Pair A0p4 = C18180wK.A0p(r14, new C1201078o(false));
        AnonymousClass69P r132 = AnonymousClass69P.PAYMENT_RECEIVER;
        Pair A0p5 = C18180wK.A0p(r132, new C1201078o(false));
        AnonymousClass69P r122 = AnonymousClass69P.ORDER_SUMMARY;
        Pair A0p6 = C18180wK.A0p(r122, new C1201078o(false));
        AnonymousClass69P r112 = AnonymousClass69P.TERMS;
        Pair A0p7 = C18180wK.A0p(r112, new C1201078o(false));
        AnonymousClass69P r102 = AnonymousClass69P.SHIPPING_OPTIONS;
        Pair A0p8 = C18180wK.A0p(r102, new C1201078o(false));
        AnonymousClass69P r92 = AnonymousClass69P.PROMO_CODE;
        Pair A0p9 = C18180wK.A0p(r92, new C1201078o(false));
        AnonymousClass69P r72 = AnonymousClass69P.SHIPPING_ADDRESS;
        Pair A0p10 = C18180wK.A0p(r72, new C1201078o(true));
        AnonymousClass69P r62 = AnonymousClass69P.PAYMENT_METHOD;
        Pair A0p11 = C18180wK.A0p(r62, new C1201078o(true));
        AnonymousClass69P r310 = AnonymousClass69P.CONTACT_INFORMATION;
        this.A1X = AnonymousClass4WJ.A0H(A0p2, A0p3, A0p4, A0p5, A0p6, A0p7, A0p8, A0p9, A0p10, A0p11, C18180wK.A0p(r310, new C1201078o(true)), C18180wK.A0p(AnonymousClass69P.EMAIL_OPTIN, new C1201078o(false)));
        this.A1Z = C06750aI.A17(r72, r62, r310);
        this.A1Y = C06750aI.A17(r102, r112, r132, r14, r15, r92, r122);
        this.A03 = C880856r.A04(AnonymousClass7Kx.A09((Object) null));
        this.A0H = AnonymousClass7Kx.A09((Object) null);
        this.A0P = AnonymousClass7Kx.A09((Object) null);
        this.A0i = AnonymousClass7Kx.A09((Object) null);
        this.A0M = AnonymousClass7Kx.A09(new PuxPaymentMethodItem(AnonymousClass69U.A0a, (PaymentMethod) null, (Integer) null, false, true));
        AnonymousClass69U r311 = AnonymousClass69U.A0V;
        this.A0I = AnonymousClass7Kx.A09(new PuxContactItem(r311, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        this.A0Q = AnonymousClass7Kx.A09(new PuxShippingAddressItem(AnonymousClass69U.A0e, (ShippingAddress) null, (String) null, (String) null, (String) null, false));
        this.A0J = AnonymousClass7Kx.A09(new PuxFulfillmentOptionItem(AnonymousClass69U.A0X, (FulfillmentOptionComponent) null, AnonymousClass006.A00, (Integer) null, false, false));
        this.A0N = AnonymousClass7Kx.A09(new PuxContactItem(r311, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        this.A0O = AnonymousClass7Kx.A09(new PuxPromoCodeItem(AnonymousClass69U.A0c, (String) null, false));
        this.A0L = AnonymousClass7Kx.A09(new PayButtonItem(new CurrencyAmount("", ""), AnonymousClass69U.A0M, (String) null, false));
        this.A0R = AnonymousClass7Kx.A09(new PuxTermsConditionItem((PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A0f, (String) null, (String) null, (List) null, (List) null));
        this.A0n = AnonymousClass4WJ.A0A();
        AnonymousClass0ZV r2 = AnonymousClass0ZV.A00;
        this.A0K = AnonymousClass7Kx.A09(new PuxIncentiveItem(AnonymousClass69U.A0Y, r2));
        AnonymousClass69U r73 = AnonymousClass69U.A0T;
        AnonymousClass7Kx r42 = this.A0Q;
        C04220Ms.A0C(r42, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        AnonymousClass0ZV r103 = r2;
        this.A0F = AnonymousClass7Kx.A09(new PuxAccordionItem(r73, (C108826j0) null, r42, r103, false));
        AnonymousClass69U r74 = AnonymousClass69U.A0R;
        AnonymousClass7Kx r43 = this.A0M;
        C04220Ms.A0C(r43, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0D = AnonymousClass7Kx.A09(new PuxAccordionItem(r74, (C108826j0) null, r43, r103, false));
        AnonymousClass69U r75 = AnonymousClass69U.A0O;
        AnonymousClass7Kx r44 = this.A0I;
        C04220Ms.A0C(r44, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0B = AnonymousClass7Kx.A09(new PuxAccordionItem(r75, (C108826j0) null, r44, r103, false));
        AnonymousClass69U r76 = AnonymousClass69U.A0P;
        AnonymousClass7Kx r45 = this.A0J;
        C04220Ms.A0C(r45, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0C = AnonymousClass7Kx.A09(new PuxAccordionItem(r76, (C108826j0) null, r45, r103, false));
        AnonymousClass69U r77 = AnonymousClass69U.A0S;
        AnonymousClass7Kx r46 = this.A0N;
        C04220Ms.A0C(r46, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0E = AnonymousClass7Kx.A09(new PuxAccordionItem(r77, (C108826j0) null, r46, r103, false));
        AnonymousClass69U r78 = AnonymousClass69U.A0Q;
        AnonymousClass7Kx r47 = this.A0i;
        C04220Ms.A0C(r47, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0h = AnonymousClass7Kx.A09(new PuxAccordionItem(r78, (C108826j0) null, r47, r103, false));
        this.A0G = AnonymousClass7Kx.A09(new AnonCheckoutPuxLink((PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A07));
        this.A08 = AnonymousClass7Kx.A09(new InlineBackButtonItem(AnonymousClass69U.A0F, (String) null));
        this.A0A = AnonymousClass7Kx.A09(new EmailOptInItem((PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A0D, (String) null, false));
        this.A1W = C18220wO.A0y();
        this.A0S = AnonymousClass7Kx.A09((Object) null);
        this.A1V = C18220wO.A0y();
        this.A1F = C86114wI.A0Q(this, 53);
        this.A1E = C86114wI.A0Q(this, 52);
        this.A15 = C86114wI.A0Q(this, 43);
        this.A1G = C86114wI.A0Q(this, 54);
        this.A1D = C86114wI.A0Q(this, 51);
        this.A1C = C86114wI.A0Q(this, 50);
        this.A18 = C86114wI.A0Q(this, 46);
        this.A13 = C86114wI.A0Q(this, 41);
        this.A12 = C86114wI.A0Q(this, 40);
        this.A1A = C86114wI.A0Q(this, 48);
        this.A19 = C86114wI.A0Q(this, 47);
        this.A11 = C86114wI.A0Q(this, 39);
        this.A10 = C86114wI.A0Q(this, 38);
        this.A1B = C86114wI.A0Q(this, 49);
        this.A16 = C86114wI.A0Q(this, 44);
        this.A14 = C86114wI.A0Q(this, 42);
        this.A17 = C86114wI.A0Q(this, 45);
        this.A1H = C86114wI.A0Q(this, 55);
        C880756q A012 = C880756q.A01();
        AnonymousClass7Kx.A0J(A012, new C107256gS(false, false));
        this.A0s = A012;
        this.A1I = C86114wI.A0Q(this, 56);
        if (AnonymousClass7Kz.A0J().A05()) {
            AnonymousClass7JJ.A02().A00.A0E(C86114wI.A0Q(this, 37));
        }
    }

    public static final void A0A(AnonymousClass066 r6, AnonymousClass58M r7) {
        r7.A0U = null;
        C880856r r3 = r7.A0z;
        Object A082 = r3.A08();
        if (A082 != null) {
            AnonymousClass79R r2 = new AnonymousClass79R((OtcInput) null, ((ECPPaymentRequest) A082).A08);
            ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
            A022.A02 = null;
            A022.A04 = false;
            ECPRepositoryImpl A023 = AnonymousClass7JJ.A02();
            A023.A00.A0B(r6);
            A023.A00 = C880856r.A03();
            A0B(r2);
            AnonymousClass7JD.A02(r7.A0w, C18180wK.A0Y());
            AnonymousClass587 r1 = r7.A1O;
            if (r1.A02 || r1.A04) {
                OtcOptionState A042 = r1.A04();
                if (A042 != null) {
                    Object A083 = r3.A08();
                    if (A083 != null) {
                        A0B(new AnonymousClass79R(new OtcInput(A042.A01, A042.A02), ((ECPPaymentRequest) A083).A08));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
            ((C128027iE) AnonymousClass7Kz.A04()).A00.A00.clear();
            return;
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final void A0H(ECPPaymentResponseParams eCPPaymentResponseParams, AnonymousClass58M r12, AnonymousClass7Kx r13, String str) {
        PaymentMethod paymentMethod;
        AnonymousClass58M r3 = r12;
        PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) r12.A0M.A01;
        if (puxPaymentMethodItem == null || (paymentMethod = puxPaymentMethodItem.A01) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        AnonymousClass7Kr.A0C(r13, new KtLambdaShape4S1300000_I2(paymentMethod, eCPPaymentResponseParams, r3, str, 3), new KtLambdaShape3S1400000_I2(r13, paymentMethod, r3, eCPPaymentResponseParams, str, 6));
    }

    public static boolean A0f(AnonymousClass58M r3) {
        AnonymousClass7Kx r1 = r3.A0Q;
        if ((AnonymousClass7Kx.A0O(r1) && (r1.A02 instanceof AnonymousClass88V)) || A0g(r3)) {
            return false;
        }
        AnonymousClass7Kx r12 = r3.A0I;
        if (AnonymousClass7Kx.A0O(r12) && (r12.A02 instanceof AnonymousClass88V)) {
            return false;
        }
        AnonymousClass7Kx r13 = r3.A0N;
        return !AnonymousClass7Kx.A0O(r13) || !(r13.A02 instanceof AnonymousClass88V);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (X.C04220Ms.A0I(r5.A02, r6.A02) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0u(X.AnonymousClass7Kx r5, X.AnonymousClass7Kx r6) {
        /*
            r4 = this;
            r3 = 0
            if (r6 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0027
            boolean r0 = r5.equals(r6)
            if (r0 != 0) goto L_0x0025
            X.67Q r2 = r5.A00
            X.67Q r0 = r6.A00
            if (r2 != r0) goto L_0x0028
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r6.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0028
            java.lang.Throwable r1 = r5.A02
            java.lang.Throwable r0 = r6.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            r3 = 1
        L_0x0026:
            return r3
        L_0x0027:
            r2 = 0
        L_0x0028:
            X.67Q r0 = X.AnonymousClass67Q.LOADING
            if (r2 != r0) goto L_0x0026
            X.67Q r1 = r5.A00
            X.67Q r0 = r6.A00
            if (r1 != r0) goto L_0x0026
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0u(X.7Kx, X.7Kx):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        if (r4 == X.AnonymousClass006.A0C) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0y(android.view.ContextThemeWrapper r23, androidx.fragment.app.Fragment r24, X.AnonymousClass69U r25) {
        /*
            r22 = this;
            r3 = 0
            r13 = r25
            X.C04220Ms.A0B(r13, r3)
            r1 = 1
            r0 = r22
            X.56r r2 = r0.A0z
            java.lang.Object r4 = r2.A08()
            java.lang.String r9 = "Required value was null."
            if (r4 == 0) goto L_0x029d
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
            java.lang.String r8 = r4.A0A
            java.lang.Object r4 = r2.A08()
            if (r4 == 0) goto L_0x0298
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
            java.lang.String r7 = r4.A08
            java.lang.Object r4 = r2.A08()
            if (r4 == 0) goto L_0x0293
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r5 = r4.A05
            r4 = 0
            if (r5 == 0) goto L_0x0032
            java.lang.String r6 = r5.A00
            if (r6 != 0) goto L_0x0040
        L_0x0032:
            java.lang.Object r5 = r2.A08()
            if (r5 == 0) goto L_0x028e
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r5 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r5
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r5 = r5.A05
            if (r5 == 0) goto L_0x0153
            java.lang.String r6 = r5.A02
        L_0x0040:
            com.fbpay.logging.LoggingContext r16 = r0.A0v()
            java.lang.Object r5 = r2.A08()
            if (r5 == 0) goto L_0x0289
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r5 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r5
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r5 = r5.A04
            X.69R r5 = r5.A01
            r21 = 80
            r17 = r8
            r18 = r7
            r19 = r6
            r20 = r4
            r14 = r4
            r15 = r5
            android.os.Bundle r5 = X.AnonymousClass7I8.A02(r14, r15, r16, r17, r18, r19, r20, r21)
            int r6 = r13.ordinal()
            r8 = 1
            r11 = r23
            r12 = r24
            switch(r6) {
                case 2: goto L_0x00eb;
                case 3: goto L_0x010b;
                case 4: goto L_0x0138;
                case 7: goto L_0x0230;
                case 10: goto L_0x0174;
                case 15: goto L_0x01b2;
                default: goto L_0x006c;
            }
        L_0x006c:
            boolean r1 = r0.A0Z
            if (r1 != 0) goto L_0x00e6
            A0F(r13, r0, r4)
            X.7H3 r10 = X.AnonymousClass7H3.A00
            com.fbpay.logging.LoggingContext r16 = r0.A0v()
            java.lang.Object r1 = r2.A08()
            if (r1 == 0) goto L_0x016f
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r5 = r1.A0A
            java.lang.Object r1 = r2.A08()
            if (r1 == 0) goto L_0x016a
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r3 = r1.A08
            java.lang.Object r1 = r2.A08()
            if (r1 == 0) goto L_0x0165
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r1.A05
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r1.A00
            if (r1 != 0) goto L_0x00ab
        L_0x009d:
            java.lang.Object r1 = r2.A08()
            if (r1 == 0) goto L_0x0160
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r1.A05
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = r1.A02
        L_0x00ab:
            java.lang.Object r6 = r2.A08()
            if (r6 == 0) goto L_0x015b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r6 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r6
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r6 = r6.A04
            X.69R r14 = r6.A06
            java.lang.Object r2 = r2.A08()
            if (r2 == 0) goto L_0x0156
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r2
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r2 = r2.A04
            X.69R r15 = r2.A01
            X.7HK r2 = X.AnonymousClass7Kz.A0J()
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x00e7
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.Integer r4 = r0.A05
        L_0x00d5:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r4 != r0) goto L_0x00e7
        L_0x00d9:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r8)
            r19 = r3
            r20 = r1
            r18 = r5
            r10.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00e6:
            return
        L_0x00e7:
            r8 = 0
            goto L_0x00d9
        L_0x00e9:
            r1 = r4
            goto L_0x00ab
        L_0x00eb:
            X.58U r1 = r0.A1P
            X.56q r1 = r1.A08
            X.7Kx r1 = X.C86104wH.A0R(r1)
            if (r1 == 0) goto L_0x0109
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x0109
            java.lang.Object r1 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
        L_0x00ff:
            r10 = r5
            r14 = r0
            r15 = r1
            boolean r1 = A0e(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x006c
            return
        L_0x0109:
            r1 = r4
            goto L_0x00ff
        L_0x010b:
            X.58T r7 = r0.A1T
            X.56q r6 = r7.A06
            X.7Kx r6 = X.C86104wH.A0R(r6)
            if (r6 == 0) goto L_0x0119
            java.lang.Object r6 = r6.A01
            if (r6 != 0) goto L_0x006c
        L_0x0119:
            java.lang.String r2 = "add_shipping_info"
            r0.A0c(r2)
            X.56r r6 = r7.A0A
            boolean r4 = r0.A0Z
            com.facebookpay.form.fragment.model.FeatureConfiguration r2 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r2.<init>(r4, r3)
            com.fbpay.logging.LoggingContext r0 = r0.A0v()
            android.os.Bundle r0 = X.AnonymousClass7I8.A00(r6, r2, r0)
            r5.putAll(r0)
            java.lang.String r0 = "content_form_fragment"
            X.AnonymousClass7H3.A01(r5, r12, r0, r1, r3)
            return
        L_0x0138:
            X.7Kx r1 = r0.A0I
            java.lang.Object r1 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxContactItem r1 = (com.facebookpay.common.recyclerview.adapteritems.PuxContactItem) r1
            if (r1 == 0) goto L_0x006c
            java.lang.Integer r1 = r1.A01
            if (r1 == 0) goto L_0x006c
            java.lang.String r2 = "user_click_contact_atomic"
            java.lang.String r1 = "add_contact_info"
            r0.A0b(r4, r2, r1)
            X.58V r1 = r0.A1J
            X.7Kx r0 = r0.A0I
            r1.BrQ(r5, r11, r12, r0)
            return
        L_0x0153:
            r6 = r4
            goto L_0x0040
        L_0x0156:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x015b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0160:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0165:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x016a:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x016f:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0174:
            X.588 r3 = r0.A1N
            java.util.List r15 = r3.A04()
            java.util.List r16 = r3.A06()
            X.7H3 r10 = X.AnonymousClass7H3.A00
            com.fbpay.logging.LoggingContext r14 = r0.A0v()
            java.lang.Object r1 = r2.A08()
            if (r1 == 0) goto L_0x01ad
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r1 = r1.A04
            X.69R r13 = r1.A01
            r1 = 202(0xca, float:2.83E-43)
            java.lang.String r1 = X.C18170wI.A00(r1)
            X.C04220Ms.A0C(r15, r1)
            r1 = 22
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r17 = X.C86164wN.A0r(r0, r1)
            r1 = 23
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r18 = X.C86164wN.A0r(r0, r1)
            boolean r0 = r3.A02
            r19 = r0
            r10.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x01ad:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x01b2:
            X.7H3 r10 = X.AnonymousClass7H3.A00
            com.fbpay.logging.LoggingContext r16 = r0.A0v()
            java.lang.Object r0 = r2.A08()
            if (r0 == 0) goto L_0x022b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r6 = r0.A0A
            java.lang.Object r0 = r2.A08()
            if (r0 == 0) goto L_0x0226
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r5 = r0.A08
            java.lang.Object r0 = r2.A08()
            if (r0 == 0) goto L_0x0221
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x01dc
            java.lang.String r3 = r0.A00
            if (r3 != 0) goto L_0x01ea
        L_0x01dc:
            java.lang.Object r0 = r2.A08()
            if (r0 == 0) goto L_0x021c
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0210
            java.lang.String r3 = r0.A02
        L_0x01ea:
            java.lang.Object r0 = r2.A08()
            if (r0 == 0) goto L_0x0217
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            X.69R r14 = r0.A06
            java.lang.Object r0 = r2.A08()
            if (r0 == 0) goto L_0x0212
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            X.69R r15 = r0.A01
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r1)
            r19 = r5
            r20 = r3
            r18 = r6
            r10.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0210:
            r3 = r4
            goto L_0x01ea
        L_0x0212:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0217:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x021c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0221:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0226:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x022b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0230:
            X.7ke r5 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r6 = r0.A0v()
            X.58K r4 = r0.A1S
            java.util.List r14 = r4.A07()
            X.587 r4 = r0.A1O
            java.util.LinkedHashMap r15 = X.AnonymousClass7Kr.A07(r4)
            java.lang.String r17 = "edit_applied_offer_and_promo_code"
            X.09x r5 = r5.A00
            java.lang.String r4 = "user_click_promocode_atomic"
            X.0A2 r5 = X.C86104wH.A0K(r5, r4)
            r4 = 2852(0xb24, float:3.997E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r5, r4)
            r18 = 6
            kotlin.jvm.internal.KtLambdaShape3S1300000_I2 r13 = new kotlin.jvm.internal.KtLambdaShape3S1300000_I2
            r16 = r6
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.String) r17, (int) r18)
            X.C128957ke.A04(r4, r6, r13)
            com.fbpay.logging.LoggingContext r5 = r0.A0v()
            java.lang.Object r0 = r2.A08()
            if (r0 == 0) goto L_0x0284
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            X.69R r4 = r0.A01
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "logging_context"
            r2.putParcelable(r0, r5)
            java.lang.String r0 = "ECP_FORM_NAV_BAR_STYLE"
            r2.putSerializable(r0, r4)
            java.lang.String r0 = "content_promo_form_fragment"
            X.AnonymousClass7H3.A01(r2, r12, r0, r1, r3)
            return
        L_0x0284:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0289:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x028e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0293:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0298:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x029d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0y(android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.69U):void");
    }

    public final void A0z(AnonymousClass066 r10, LoggingContext loggingContext, Integer num) {
        String str;
        AnonymousClass0wJ.A1M(num, 1, loggingContext);
        if (num == AnonymousClass006.A00) {
            AnonymousClass7JJ.A00().A0H(loggingContext, "pux_checkout", AnonymousClass7Kr.A07(this.A1O));
        }
        ECPHandler eCPHandler = this.A05;
        if (eCPHandler != null) {
            C880856r r1 = this.A0z;
            Object A082 = r1.A08();
            if (A082 != null) {
                String str2 = ((ECPPaymentRequest) A082).A0A;
                Object A083 = r1.A08();
                if (A083 != null) {
                    String str3 = ((ECPPaymentRequest) A083).A08;
                    AnonymousClass7Kx A0R2 = C86104wH.A0R(this.A03);
                    if (A0R2 != null) {
                        str = (String) A0R2.A01;
                    } else {
                        str = null;
                    }
                    eCPHandler.BN9(new C110326lV(this.A1O.A02((AnonymousClass69P) null, true), str2, str3, str, this.A0W), loggingContext, num);
                    A0A(r10, this);
                    return;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final C114946uB A00(AnonymousClass58M r3) {
        C880756q r2 = r3.A1J.A0A;
        if (!AnonymousClass7BG.A02(AnonymousClass69P.CONTACT_INFORMATION, r3.A0w()) || !AnonymousClass7Kx.A0R(C86104wH.A0R(r2))) {
            return null;
        }
        return (C114946uB) ((C108806iy) AnonymousClass7Kx.A0D(C86104wH.A0R(r2))).A01;
    }

    public static final ShippingAddress A02(AnonymousClass58M r4) {
        CheckoutConfiguration checkoutConfiguration;
        C880756q r3 = r4.A1T.A06;
        Object A072 = A07(r4);
        if (A072 != null) {
            ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) A072;
            if (!AnonymousClass7BG.A02(AnonymousClass69P.SHIPPING_ADDRESS, r4.A0w()) || (checkoutConfiguration = eCPPaymentRequest.A01) == null || !checkoutConfiguration.A0B.contains(AnonymousClass68M.UX_SHIPPING_ADDRESS) || !AnonymousClass7Kx.A0R(C86104wH.A0R(r3))) {
                return null;
            }
            return (ShippingAddress) ((C108806iy) AnonymousClass7Kx.A0D(C86104wH.A0R(r3))).A01;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final AnonymousClass7Kx A04(C108826j0 r15, AnonymousClass58M r16, List list, boolean z) {
        Integer num;
        PuxAccordionItem puxAccordionItem;
        Iterable iterable;
        SelectionFulfillmentPickupOptionItem selectionFulfillmentPickupOptionItem;
        AnonymousClass58M r4 = r16;
        AnonymousClass7Kx r10 = r4.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem = (PuxFulfillmentOptionItem) r10.A01;
        if (puxFulfillmentOptionItem != null) {
            num = puxFulfillmentOptionItem.A02;
        } else {
            num = null;
        }
        C108826j0 r9 = r15;
        boolean z2 = z;
        if (num == AnonymousClass006.A01) {
            AnonymousClass58S r8 = r4.A1M;
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            AnonymousClass7Kx.A0M(2131826440, AnonymousClass006.A0C, A0v2);
            C880856r r1 = r8.A07;
            C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
            AnonymousClass7Kx A0R2 = C86104wH.A0R(r1);
            if (!(A0R2 == null || (iterable = (Iterable) A0R2.A01) == null)) {
                ArrayList A0v3 = AnonymousClass0wJ.A0v();
                for (Object next : iterable) {
                    Object obj = ((AnonymousClass7Kx) next).A01;
                    String str = null;
                    if ((obj instanceof SelectionFulfillmentPickupOptionItem) && (selectionFulfillmentPickupOptionItem = (SelectionFulfillmentPickupOptionItem) obj) != null) {
                        str = selectionFulfillmentPickupOptionItem.A07;
                    }
                    if (C04220Ms.A0I(str, AnonymousClass58S.A00(r8))) {
                        A0v3.add(next);
                    }
                }
                A0v2.addAll(A0v3);
            }
            AnonymousClass7Kx.A0N(new SelectionActionViewItem(AnonymousClass69U.A0g, (Integer) null, 2131826397, (String) null, (String) null), A0v2);
            AnonymousClass69U r82 = AnonymousClass69U.A0P;
            AnonymousClass7Kx r102 = r4.A0J;
            C04220Ms.A0C(r102, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
            puxAccordionItem = new PuxAccordionItem(r82, r9, r102, A0v2, z2);
        } else {
            puxAccordionItem = new PuxAccordionItem(AnonymousClass69U.A0P, r9, r10, list, z2);
        }
        return AnonymousClass7Kx.A0A(puxAccordionItem);
    }

    public static final AnonymousClass7Kx A05(AnonymousClass58M r3) {
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0a2 = C86124wJ.A0a(r3.A0z);
        if (!(A0a2 == null || (checkoutConfiguration = A0a2.A01) == null || !C18190wL.A1Z(checkoutConfiguration.A03, true))) {
            AnonymousClass587 r1 = r3.A1O;
            if ((r1.A02 || r1.A04) && !r1.A07()) {
                z = r3.A0T;
                if (z == null) {
                    return AnonymousClass7Kx.A09((Object) null);
                }
                return AnonymousClass7Kx.A0A(z);
            }
        }
        z = false;
        return AnonymousClass7Kx.A0A(z);
    }

    public static Object A07(AnonymousClass58M r0) {
        return r0.A0z.A08();
    }

    public static final void A0C(AnonymousClass69U r2, AnonymousClass58M r3) {
        Iterator A0s2 = C86154wM.A0s(r3.A1W);
        while (A0s2.hasNext()) {
            AnonymousClass69U r0 = (AnonymousClass69U) A0s2.next();
            if (r0 != r2) {
                A0D(r0, r3);
                A0E(r0, r3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r0 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r2 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r0 == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r2 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        if (r0 == false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(X.AnonymousClass69U r8, X.AnonymousClass58M r9) {
        /*
            X.69U r1 = r9.A04
            boolean r6 = X.C18180wK.A1Z(r1, r8)
            X.69U r0 = X.AnonymousClass69U.A0Q
            java.lang.String r7 = "Required value was null."
            r5 = 0
            if (r8 == r0) goto L_0x0026
            java.util.Map r0 = r9.A1W
            java.lang.Object r2 = r0.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x01ca
            int r1 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r9.A00
            X.6j0 r5 = new X.6j0
            r5.<init>(r2, r1, r0)
        L_0x0026:
            int r0 = r8.ordinal()
            java.lang.String r4 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>"
            switch(r0) {
                case 12: goto L_0x014f;
                case 13: goto L_0x00ea;
                case 14: goto L_0x0092;
                case 15: goto L_0x01a9;
                case 16: goto L_0x0148;
                case 17: goto L_0x003a;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.String r0 = "{ECPViewModel} ItemType is not found for identifier => "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r8)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x003a:
            X.7Kx r1 = r9.A0N
            boolean r0 = X.AnonymousClass7Kx.A0O(r1)
            if (r0 == 0) goto L_0x0049
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.AnonymousClass88V
            r1 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            X.58R r7 = r9.A1R
            X.56q r0 = r7.A05
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r1 == 0) goto L_0x007a
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0082
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0064:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r1 = r3.next()
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            r0 = 31
            X.7Kx r0 = X.AnonymousClass7Kx.A07(r1, r7, r0)
            r2.add(r0)
            goto L_0x0064
        L_0x007a:
            if (r0 == 0) goto L_0x0082
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0084
        L_0x0082:
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x0084:
            X.69U r1 = X.AnonymousClass69U.A0S
            X.7Kx r0 = r9.A0N
            X.C04220Ms.A0C(r0, r4)
            X.7Kx r0 = X.AnonymousClass7Kx.A04(r1, r5, r0, r2, r6)
            r9.A0E = r0
            return
        L_0x0092:
            X.7Kx r1 = r9.A0I
            boolean r0 = X.AnonymousClass7Kx.A0O(r1)
            if (r0 == 0) goto L_0x00a1
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.AnonymousClass88V
            r1 = 1
            if (r0 != 0) goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            X.58V r7 = r9.A1J
            X.56q r0 = r7.A0B
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r1 == 0) goto L_0x00d2
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x00da
            r3 = 10
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r3)
            java.util.Iterator r1 = r0.iterator()
        L_0x00be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r1.next()
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            X.7Kx r0 = X.AnonymousClass7Kx.A07(r0, r7, r3)
            r2.add(r0)
            goto L_0x00be
        L_0x00d2:
            if (r0 == 0) goto L_0x00da
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x00dc
        L_0x00da:
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x00dc:
            X.69U r1 = X.AnonymousClass69U.A0O
            X.7Kx r0 = r9.A0I
            X.C04220Ms.A0C(r0, r4)
            X.7Kx r0 = X.AnonymousClass7Kx.A04(r1, r5, r0, r2, r6)
            r9.A0B = r0
            return
        L_0x00ea:
            X.7Kx r1 = r9.A0Q
            boolean r0 = X.AnonymousClass7Kx.A0O(r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.AnonymousClass88V
            r1 = 1
            if (r0 != 0) goto L_0x00fa
        L_0x00f9:
            r1 = 0
        L_0x00fa:
            X.58T r0 = r9.A1T
            if (r1 == 0) goto L_0x0132
            com.facebookpay.form.fragment.model.FormParams r3 = X.AnonymousClass58T.A00(r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r0.A01
            if (r0 == 0) goto L_0x0143
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0143
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x0112
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0143
        L_0x0112:
            X.69U r1 = X.AnonymousClass69U.A03
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r3, r2)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            X.C04220Ms.A0C(r0, r4)
            java.util.List r0 = X.C18180wK.A0n(r0)
        L_0x0124:
            X.69U r2 = X.AnonymousClass69U.A0T
            X.7Kx r1 = r9.A0Q
            X.C04220Ms.A0C(r1, r4)
            X.7Kx r0 = X.AnonymousClass7Kx.A04(r2, r5, r1, r0, r6)
            r9.A0F = r0
            return
        L_0x0132:
            X.56q r0 = r0.A07
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0140
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0124
        L_0x0140:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            goto L_0x0124
        L_0x0143:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x0148:
            X.7Kx r0 = r9.A03()
            r9.A0h = r0
            return
        L_0x014f:
            boolean r0 = A0g(r9)
            X.58U r1 = r9.A1P
            if (r0 == 0) goto L_0x018b
            r0 = 1
            com.facebookpay.form.fragment.model.FormParams r3 = X.AnonymousClass58U.A00(r1, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r1.A01
            java.lang.String r0 = "ecpPaymentRequest"
            if (r1 != 0) goto L_0x0167
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0167:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r1.A05
            if (r0 == 0) goto L_0x0186
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x0173
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0186
        L_0x0173:
            X.69U r1 = X.AnonymousClass69U.A03
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r3, r2)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            X.C04220Ms.A0C(r0, r4)
            java.util.List r2 = X.C18180wK.A0n(r0)
            goto L_0x019b
        L_0x0186:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x018b:
            X.56q r0 = r1.A09
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0199
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x019b
        L_0x0199:
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x019b:
            X.69U r1 = X.AnonymousClass69U.A0R
            X.7Kx r0 = r9.A0M
            X.C04220Ms.A0C(r0, r4)
            X.7Kx r0 = X.AnonymousClass7Kx.A04(r1, r5, r0, r2, r6)
            r9.A0D = r0
            return
        L_0x01a9:
            X.58S r0 = r9.A1M
            X.56r r1 = r0.A07
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>"
            X.C04220Ms.A0C(r1, r0)
            X.7Kx r0 = X.C86104wH.A0R(r1)
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01c5
            X.7Kx r0 = A04(r5, r9, r0, r6)
            r9.A0C = r0
            return
        L_0x01c5:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x01ca:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0D(X.69U, X.58M):void");
    }

    public static final void A0G(AnonymousClass69U r5, AnonymousClass58M r6, boolean z) {
        int size;
        String A012;
        if (z) {
            AnonymousClass69U r4 = r6.A04;
            if (r5 != r4) {
                LinkedHashMap linkedHashMap = r6.A1V;
                Set keySet = linkedHashMap.keySet();
                C04220Ms.A06(keySet);
                List A0N2 = AnonymousClass00J.A0N(keySet);
                int indexOf = A0N2.indexOf(r5.A01());
                if (r4 == null || (A012 = r4.A01()) == null) {
                    size = linkedHashMap.size();
                } else {
                    size = A0N2.indexOf(A012);
                }
                if (indexOf < size) {
                    AnonymousClass69U r1 = r6.A04;
                    r6.A04 = r5;
                    if (r1 != null && r1 == AnonymousClass69U.A0Q) {
                        A0D(r1, r6);
                        A0E(r1, r6);
                    }
                    A0C((AnonymousClass69U) null, r6);
                }
            }
        } else if (r5 == r6.A04) {
            r6.A0x();
        }
    }

    public static final void A0J(AnonymousClass58M r13) {
        AnonymousClass7JD.A02(r13.A0u, new ErrorDialogContent(C973368y.A04, (C973368y) null, (C108816iz) null, (C108816iz) null, 2131826475, 2131826474, (Integer) null, (Integer) null, (String) null, (String) null));
        r13.A0o = true;
    }

    public static final void A0L(AnonymousClass58M r25) {
        boolean z;
        Object obj;
        Iterable iterable;
        AnonymousClass69U r2;
        AbstractCollection abstractCollection;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl;
        TreeJNI treeValue;
        CheckoutConfiguration checkoutConfiguration;
        CheckoutConfiguration checkoutConfiguration2;
        AnonymousClass58M r0 = r25;
        C880856r r1 = r0.A0z;
        ECPPaymentRequest A0a2 = C86124wJ.A0a(r1);
        boolean z2 = false;
        if (A0a2 == null || (checkoutConfiguration2 = A0a2.A01) == null) {
            z = false;
        } else {
            z = C04220Ms.A0I(checkoutConfiguration2.A06, true);
        }
        r0.A0a = z;
        ECPPaymentRequest A0a3 = C86124wJ.A0a(r1);
        if (!(A0a3 == null || (checkoutConfiguration = A0a3.A01) == null)) {
            z2 = C04220Ms.A0I(checkoutConfiguration.A05, true);
        }
        r0.A0Z = z2;
        if (z2) {
            iterable = C06750aI.A17(AnonymousClass69P.ANON_CHECKOUT_BACK_BUTTON, AnonymousClass69P.BANNER, AnonymousClass69P.ORDER_SUMMARY, AnonymousClass69P.APM, AnonymousClass69P.PAYMENT_RECEIVER, AnonymousClass69P.ITEM_LIST, AnonymousClass69P.INCENTIVES, AnonymousClass69P.PRICE_TABLE, AnonymousClass69P.CONTACT_INFORMATION, AnonymousClass69P.SHIPPING_ADDRESS, AnonymousClass69P.SHIPPING_OPTIONS, AnonymousClass69P.PICKUP_CONTACT_INFO, AnonymousClass69P.PAYMENT_METHOD, AnonymousClass69P.EMAIL_OPTIN, AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION, AnonymousClass69P.PAY_BUTTON, AnonymousClass69P.TERMS);
            obj = r1.A08();
            if (obj == null) {
                throw C18180wK.A0a("Required value was null.");
            }
        } else {
            C110336lW r22 = AnonymousClass7JJ.A02().A01;
            if (r22 == null || (fBPayCheckoutScreenConfigImpl = r22.A00) == null || (treeValue = fBPayCheckoutScreenConfigImpl.getTreeValue("ecp_ordered_components", FBPayCheckoutScreenConfigImpl.EcpOrderedComponents.class)) == null || (abstractCollection = treeValue.getEnumList("pux", AnonymousClass69P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
                List A022 = AnonymousClass7Kz.A0J().A02("PUX");
                abstractCollection = AnonymousClass0wJ.A0w(A022);
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    abstractCollection.add(EnumHelper.A00(C18180wK.A0k(it), AnonymousClass69P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE));
                }
            }
            iterable = abstractCollection;
            obj = r1.A08();
            if (obj == null) {
                throw C18180wK.A0a("Required value was null.");
            }
        }
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) obj;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (Object next : iterable) {
            if (C122157Kv.A0R(eCPPaymentRequest, (AnonymousClass69P) next)) {
                A0v2.add(next);
            }
        }
        r0.A0Y = A0v2;
        if (r0.A0Z) {
            int i = 0;
            for (AnonymousClass69P ordinal : r0.A0w()) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 5) {
                    r2 = AnonymousClass69U.A0O;
                } else if (ordinal2 == 23) {
                    r2 = AnonymousClass69U.A0T;
                } else if (ordinal2 == 24) {
                    r2 = AnonymousClass69U.A0P;
                } else if (ordinal2 == 19) {
                    r2 = AnonymousClass69U.A0S;
                } else if (ordinal2 == 16) {
                    r2 = AnonymousClass69U.A0R;
                }
                C86154wM.A1T(r2, r0.A1W, i);
                i++;
            }
            r0.A00 = i - 1;
        }
        AnonymousClass58S r23 = r0.A1M;
        r23.A03 = r0.A0Z;
        r23.A04 = r0.A0a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0M(X.AnonymousClass58M r12) {
        /*
            java.util.List r8 = r12.A1Z
            boolean r0 = r8 instanceof java.util.Collection
            r5 = 0
            r4 = 1
            r2 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x004a
        L_0x0013:
            r1 = 1
        L_0x0014:
            boolean r0 = r12.A0d
            java.lang.String r11 = "Required value was null."
            java.lang.String r3 = "FULL_PUX"
            java.lang.String r6 = "Failed to load components: "
            java.lang.String r9 = "pux_checkout"
            if (r0 != 0) goto L_0x006d
            if (r1 == 0) goto L_0x013a
            r12.A0d = r4
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r10 = r8.iterator()
        L_0x002c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r8 = r10.next()
            java.util.Map r0 = r12.A1X
            X.78o r0 = X.C86114wI.A0R(r8, r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.C04220Ms.A0I(r0, r7)
            if (r0 == 0) goto L_0x002c
            r1.add(r8)
            goto L_0x002c
        L_0x004a:
            java.util.Iterator r3 = r8.iterator()
        L_0x004e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r1 = r3.next()
            boolean r0 = A0t(r12, r1)
            if (r0 == 0) goto L_0x004e
            java.util.Map r0 = r12.A1X
            X.78o r0 = X.C86114wI.A0R(r1, r0)
            if (r0 == 0) goto L_0x006b
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x006b
            goto L_0x004e
        L_0x006b:
            r1 = 0
            goto L_0x0014
        L_0x006d:
            if (r1 == 0) goto L_0x013a
            goto L_0x0097
        L_0x0070:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f0
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r8 = r12.A0v()
            X.587 r0 = r12.A1O
            java.util.LinkedHashMap r2 = X.AnonymousClass7Kr.A07(r0)
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_ecpcheckouttti_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 282(0x11a, float:3.95E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 29
            X.C128957ke.A03(r1, r8, r2, r9, r0)
        L_0x0097:
            java.util.List r9 = r12.A1Y
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00cf
        L_0x00a3:
            boolean r0 = r12.A0c
            if (r0 != 0) goto L_0x013a
            r12.A0c = r4
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r9.iterator()
        L_0x00b1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r12.A1X
            X.78o r0 = X.C86114wI.A0R(r1, r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.C04220Ms.A0I(r0, r7)
            if (r0 == 0) goto L_0x00b1
            r8.add(r1)
            goto L_0x00b1
        L_0x00cf:
            java.util.Iterator r2 = r9.iterator()
        L_0x00d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r2.next()
            boolean r0 = A0t(r12, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.Map r0 = r12.A1X
            X.78o r0 = X.C86114wI.A0R(r1, r0)
            if (r0 == 0) goto L_0x013a
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x013a
            goto L_0x00d3
        L_0x00f0:
            java.lang.StringBuilder r0 = X.C18200wM.A0r()
            java.lang.String r0 = X.C86104wH.A0x(r1, r6, r0)
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r0)
            java.lang.Object r0 = A07(r12)
            if (r0 == 0) goto L_0x0110
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = A09(r0, r12, r4)
            boolean r0 = X.C86144wL.A1X(r0, r3)
            r12.A11(r1, r2, r0)
            goto L_0x0097
        L_0x0110:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r11)
            throw r0
        L_0x0115:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0127
            java.lang.StringBuilder r0 = X.C18200wM.A0r()
            java.lang.String r0 = X.C86104wH.A0x(r8, r6, r0)
            java.lang.RuntimeException r5 = X.C18250wR.A0V(r0)
        L_0x0127:
            java.lang.Object r0 = A07(r12)
            if (r0 == 0) goto L_0x013b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = A09(r0, r12, r4)
            boolean r0 = X.C86144wL.A1X(r0, r3)
            r12.A11(r5, r1, r0)
        L_0x013a:
            return
        L_0x013b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0M(X.58M):void");
    }

    public static final void A0O(AnonymousClass58M r4) {
        String str = r4.A0X;
        if (str != null && str.length() != 0) {
            AnonymousClass7Kx A0A2 = AnonymousClass7Kx.A0A(new PuxReceiverHeaderItem(AnonymousClass69U.A0d, str, r4.A0V));
            r4.A0P = A0A2;
            A0P(r4, AnonymousClass69P.PAYMENT_RECEIVER, A0A2);
        }
    }

    public static final void A0Q(AnonymousClass58M r13, String str) {
        ErrorDialogContent errorDialogContent;
        C880856r r1 = r13.A0u;
        String str2 = str;
        if (str != null) {
            errorDialogContent = new ErrorDialogContent(C973368y.A03, (C973368y) null, (C108816iz) null, (C108816iz) null, 2131826548, (Integer) null, (Integer) null, (Integer) null, (String) null, str2);
        } else {
            errorDialogContent = new ErrorDialogContent(C973368y.A03, (C973368y) null, (C108816iz) null, (C108816iz) null, 2131826548, 2131826547, (Integer) null, (Integer) null, (String) null, (String) null);
        }
        AnonymousClass7JD.A02(r1, errorDialogContent);
        r13.A1N.A07();
    }

    public static final void A0R(AnonymousClass58M r2, String str) {
        Integer num;
        ECPPaymentRequest A0a2 = C86124wJ.A0a(r2.A0z);
        if (A0a2 != null) {
            num = A0a2.A04.A09.A01;
        } else {
            num = null;
        }
        if (num == AnonymousClass006.A01) {
            str = "Meta";
        }
        r2.A0X = str;
    }

    public static final void A0T(AnonymousClass58M r2, Throwable th) {
        if (r2.A0o) {
            return;
        }
        if (th instanceof C92875kA) {
            C92875kA r3 = (C92875kA) th;
            C04220Ms.A0B(r3, 0);
            if (r3.A01.A00 == AnonymousClass67N.DISMISS_AND_CLOSE) {
                r2.A0o = true;
            }
            r2.A0u.A0H(AnonymousClass7Fb.A00(r3));
            return;
        }
        A0J(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C04220Ms.A0I(r0, true) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0U(X.AnonymousClass58M r3, java.lang.Throwable r4, boolean r5) {
        /*
            java.lang.Boolean r0 = r3.A0l
            r2 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r0 != 0) goto L_0x003a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A0l = r0
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 == 0) goto L_0x002a
        L_0x0015:
            java.util.Map r1 = r3.A1X
            X.69P r0 = X.AnonymousClass69P.PAYMENT_RECEIVER
            X.78o r1 = X.C86114wI.A0R(r0, r1)
            if (r5 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002a
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r0 = X.C86164wN.A0r(r3, r0)
            r1.A01(r0)
        L_0x002a:
            A0M(r3)
            return
        L_0x002e:
            if (r1 == 0) goto L_0x002a
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r0 = X.C86154wM.A11(r4, r3, r0)
            r1.A00(r0)
            goto L_0x002a
        L_0x003a:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0043
            if (r5 != 0) goto L_0x0043
            r2 = 0
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A0l = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0U(X.58M, java.lang.Throwable, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C04220Ms.A0I(r0, true) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0V(X.AnonymousClass58M r3, java.lang.Throwable r4, boolean r5) {
        /*
            java.lang.Boolean r0 = r3.A0m
            r2 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r0 != 0) goto L_0x003a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A0m = r0
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 == 0) goto L_0x002a
        L_0x0015:
            java.util.Map r1 = r3.A1X
            X.69P r0 = X.AnonymousClass69P.ORDER_SUMMARY
            X.78o r1 = X.C86114wI.A0R(r0, r1)
            if (r5 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002a
            r0 = 18
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r0 = X.C86164wN.A0r(r3, r0)
            r1.A01(r0)
        L_0x002a:
            A0M(r3)
            return
        L_0x002e:
            if (r1 == 0) goto L_0x002a
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r0 = X.C86154wM.A11(r4, r3, r0)
            r1.A00(r0)
            goto L_0x002a
        L_0x003a:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0043
            if (r5 != 0) goto L_0x0043
            r2 = 0
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A0m = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0V(X.58M, java.lang.Throwable, boolean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r3.put(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0X(X.AnonymousClass58M r6, java.util.List r7) {
        /*
            java.util.LinkedHashMap r3 = r6.A1V
            r3.clear()
            boolean r0 = r6.A0Z
            r4 = 1
            r2 = 5
            java.util.Iterator r5 = r7.iterator()
            if (r0 == 0) goto L_0x0096
        L_0x000f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r5.next()
            X.69P r0 = (X.AnonymousClass69P) r0
            int r0 = r0.ordinal()
            r2 = 0
            switch(r0) {
                case 1: goto L_0x006e;
                case 2: goto L_0x007c;
                case 3: goto L_0x003d;
                case 4: goto L_0x0023;
                case 5: goto L_0x0024;
                case 6: goto L_0x0087;
                case 7: goto L_0x0023;
                case 8: goto L_0x0023;
                case 9: goto L_0x0023;
                case 10: goto L_0x0023;
                case 11: goto L_0x0023;
                case 12: goto L_0x0023;
                case 13: goto L_0x0023;
                case 14: goto L_0x0053;
                case 15: goto L_0x0042;
                case 16: goto L_0x0038;
                case 17: goto L_0x0023;
                case 18: goto L_0x0049;
                case 19: goto L_0x0033;
                case 20: goto L_0x0023;
                case 21: goto L_0x0023;
                case 22: goto L_0x0023;
                case 23: goto L_0x0029;
                case 24: goto L_0x002e;
                case 25: goto L_0x0023;
                case 26: goto L_0x0023;
                case 27: goto L_0x004e;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x000f
        L_0x0024:
            java.lang.String r1 = "CONTACT_INFORMATION"
            X.7Kx r0 = r6.A0B
            goto L_0x0078
        L_0x0029:
            java.lang.String r1 = "SHIPPING_ADDRESS"
            X.7Kx r0 = r6.A0F
            goto L_0x0078
        L_0x002e:
            java.lang.String r1 = "SHIPPING_OPTIONS"
            X.7Kx r0 = r6.A0C
            goto L_0x0078
        L_0x0033:
            java.lang.String r1 = "PICKUP_CONTACT_INFO"
            X.7Kx r0 = r6.A0E
            goto L_0x0078
        L_0x0038:
            java.lang.String r1 = "PAYMENT_METHOD"
            X.7Kx r0 = r6.A0D
            goto L_0x0078
        L_0x003d:
            java.lang.String r1 = "BANNER"
            X.7Kx r0 = r6.A0H
            goto L_0x0078
        L_0x0042:
            java.lang.String r1 = "ORDER_SUMMARY"
            X.7Kx r0 = r6.A03()
            goto L_0x0078
        L_0x0049:
            X.7Kx r0 = r6.A0L
            r6.A0j = r0
            goto L_0x000f
        L_0x004e:
            X.7Kx r0 = r6.A0R
            r6.A0k = r0
            goto L_0x000f
        L_0x0053:
            X.7Kx r0 = A05(r6)
            boolean r0 = X.AnonymousClass7Kx.A0P(r0)
            if (r0 != 0) goto L_0x0069
            X.7Kx r0 = A05(r6)
            java.lang.Object r0 = r0.A01
            boolean r0 = X.C18190wL.A1Z(r0, r4)
            if (r0 == 0) goto L_0x000f
        L_0x0069:
            java.lang.String r1 = "ONE_TIME_CHECKOUT_OPTION"
            X.7Kx r0 = r6.A0G
            goto L_0x0078
        L_0x006e:
            boolean r0 = A0h(r6)
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = "ANON_CHECKOUT_BACK_BUTTON"
            X.7Kx r0 = r6.A08
        L_0x0078:
            r3.put(r1, r0)
            goto L_0x000f
        L_0x007c:
            java.lang.String r1 = "APM"
            boolean r0 = A0j(r6)
            if (r0 == 0) goto L_0x0091
            X.7Kx r2 = r6.A09
            goto L_0x0091
        L_0x0087:
            java.lang.String r1 = "EMAIL_OPTIN"
            boolean r0 = A0i(r6)
            if (r0 == 0) goto L_0x0091
            X.7Kx r2 = r6.A0A
        L_0x0091:
            r3.put(r1, r2)
            goto L_0x000f
        L_0x0096:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r5.next()
            X.69P r0 = (X.AnonymousClass69P) r0
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0104
            r0 = 23
            if (r1 == r0) goto L_0x00ff
            r0 = 24
            if (r1 == r0) goto L_0x00fa
            r0 = 16
            if (r1 == r0) goto L_0x00f5
            r0 = 3
            if (r1 == r0) goto L_0x00f0
            r0 = 18
            if (r1 == r0) goto L_0x00eb
            r0 = 27
            if (r1 == r0) goto L_0x00e6
            switch(r1) {
                case 10: goto L_0x00e1;
                case 11: goto L_0x00c8;
                case 17: goto L_0x00c3;
                case 20: goto L_0x0109;
                case 21: goto L_0x00dc;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            goto L_0x0096
        L_0x00c3:
            java.lang.String r1 = "PAYMENT_RECEIVER"
            X.7Kx r0 = r6.A0P
            goto L_0x0111
        L_0x00c8:
            java.util.Map r0 = r6.A0n
            java.util.Iterator r1 = X.AnonymousClass0wJ.A0z(r0)
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0096
            java.util.Map$Entry r0 = X.C18180wK.A0o(r1)
            X.C18210wN.A1Q(r3, r0)
            goto L_0x00ce
        L_0x00dc:
            java.lang.String r1 = "PROMO_CODE"
            X.7Kx r0 = r6.A0O
            goto L_0x0111
        L_0x00e1:
            java.lang.String r1 = "INCENTIVES"
            X.7Kx r0 = r6.A0K
            goto L_0x0111
        L_0x00e6:
            X.7Kx r0 = r6.A0R
            r6.A0k = r0
            goto L_0x0096
        L_0x00eb:
            X.7Kx r0 = r6.A0L
            r6.A0j = r0
            goto L_0x0096
        L_0x00f0:
            java.lang.String r1 = "BANNER"
            X.7Kx r0 = r6.A0H
            goto L_0x0111
        L_0x00f5:
            java.lang.String r1 = "PAYMENT_METHOD"
            X.7Kx r0 = r6.A0M
            goto L_0x0111
        L_0x00fa:
            java.lang.String r1 = "SHIPPING_OPTIONS"
            X.7Kx r0 = r6.A0J
            goto L_0x0111
        L_0x00ff:
            java.lang.String r1 = "SHIPPING_ADDRESS"
            X.7Kx r0 = r6.A0Q
            goto L_0x0111
        L_0x0104:
            java.lang.String r1 = "CONTACT_INFORMATION"
            X.7Kx r0 = r6.A0I
            goto L_0x0111
        L_0x0109:
            java.lang.String r1 = "PRICE_TABLE"
            X.7Kx r0 = r6.A0S
            X.7Kx r0 = X.AnonymousClass7BC.A00(r0)
        L_0x0111:
            r3.put(r1, r0)
            goto L_0x0096
        L_0x0115:
            A0W(r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0X(X.58M, java.util.List):void");
    }

    public static final void A0a(AnonymousClass58M r13, boolean z) {
        PuxShippingAddressItem puxShippingAddressItem;
        PuxPaymentMethodItem puxPaymentMethodItem;
        PuxContactItem puxContactItem;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem;
        PuxContactItem puxContactItem2;
        AnonymousClass7Kx r1 = r13.A0Q;
        PuxShippingAddressItem puxShippingAddressItem2 = (PuxShippingAddressItem) r1.A01;
        PuxOrderSummaryItem puxOrderSummaryItem = null;
        boolean z2 = z;
        if (puxShippingAddressItem2 != null) {
            puxShippingAddressItem = new PuxShippingAddressItem(puxShippingAddressItem2.A00, puxShippingAddressItem2.A01, puxShippingAddressItem2.A03, puxShippingAddressItem2.A02, puxShippingAddressItem2.A04, z2);
        } else {
            puxShippingAddressItem = null;
        }
        r13.A0Q = AnonymousClass7Kx.A05(r1, puxShippingAddressItem);
        AnonymousClass7Kx r12 = r13.A0M;
        PuxPaymentMethodItem puxPaymentMethodItem2 = (PuxPaymentMethodItem) r12.A01;
        if (puxPaymentMethodItem2 != null) {
            puxPaymentMethodItem = new PuxPaymentMethodItem(puxPaymentMethodItem2.A00, puxPaymentMethodItem2.A01, puxPaymentMethodItem2.A02, z2, puxPaymentMethodItem2.A04);
        } else {
            puxPaymentMethodItem = null;
        }
        r13.A0M = AnonymousClass7Kx.A05(r12, puxPaymentMethodItem);
        AnonymousClass7Kx r14 = r13.A0I;
        PuxContactItem puxContactItem3 = (PuxContactItem) r14.A01;
        if (puxContactItem3 != null) {
            puxContactItem = new PuxContactItem(puxContactItem3.A00, puxContactItem3.A01, puxContactItem3.A03, puxContactItem3.A04, puxContactItem3.A05, puxContactItem3.A06, puxContactItem3.A02, z2);
        } else {
            puxContactItem = null;
        }
        r13.A0I = AnonymousClass7Kx.A05(r14, puxContactItem);
        AnonymousClass7Kx r15 = r13.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem2 = (PuxFulfillmentOptionItem) r15.A01;
        if (puxFulfillmentOptionItem2 != null) {
            puxFulfillmentOptionItem = new PuxFulfillmentOptionItem(puxFulfillmentOptionItem2.A00, puxFulfillmentOptionItem2.A01, puxFulfillmentOptionItem2.A03, puxFulfillmentOptionItem2.A02, z2, puxFulfillmentOptionItem2.A04);
        } else {
            puxFulfillmentOptionItem = null;
        }
        r13.A0J = AnonymousClass7Kx.A05(r15, puxFulfillmentOptionItem);
        AnonymousClass7Kx r16 = r13.A0N;
        PuxContactItem puxContactItem4 = (PuxContactItem) r16.A01;
        if (puxContactItem4 != null) {
            puxContactItem2 = new PuxContactItem(puxContactItem4.A00, puxContactItem4.A01, puxContactItem4.A03, puxContactItem4.A04, puxContactItem4.A05, puxContactItem4.A06, puxContactItem4.A02, z2);
        } else {
            puxContactItem2 = null;
        }
        r13.A0N = AnonymousClass7Kx.A05(r16, puxContactItem2);
        if (r13.A0Z) {
            AnonymousClass7Kx r17 = r13.A0i;
            PuxOrderSummaryItem puxOrderSummaryItem2 = (PuxOrderSummaryItem) r17.A01;
            if (puxOrderSummaryItem2 != null) {
                puxOrderSummaryItem = new PuxOrderSummaryItem(puxOrderSummaryItem2.A02, puxOrderSummaryItem2.A01, puxOrderSummaryItem2.A03, puxOrderSummaryItem2.A04, puxOrderSummaryItem2.A05, puxOrderSummaryItem2.A00, puxOrderSummaryItem2.A08, puxOrderSummaryItem2.A07, z2);
            }
            r13.A0i = AnonymousClass7Kx.A05(r17, puxOrderSummaryItem);
            AnonymousClass69U r0 = AnonymousClass69U.A0Q;
            A0D(r0, r13);
            A0E(r0, r13);
            if (r13.A0w().contains(AnonymousClass69P.SHIPPING_ADDRESS)) {
                AnonymousClass69U r02 = AnonymousClass69U.A0T;
                A0D(r02, r13);
                A0E(r02, r13);
            }
            if (r13.A0w().contains(AnonymousClass69P.PAYMENT_METHOD)) {
                AnonymousClass69U r03 = AnonymousClass69U.A0R;
                A0D(r03, r13);
                A0E(r03, r13);
            }
            if (r13.A0w().contains(AnonymousClass69P.CONTACT_INFORMATION)) {
                AnonymousClass69U r04 = AnonymousClass69U.A0O;
                A0D(r04, r13);
                A0E(r04, r13);
            }
            if (r13.A0w().contains(AnonymousClass69P.SHIPPING_OPTIONS)) {
                AnonymousClass69U r05 = AnonymousClass69U.A0P;
                A0D(r05, r13);
                A0E(r05, r13);
            }
            if (r13.A0w().contains(AnonymousClass69P.PICKUP_CONTACT_INFO)) {
                AnonymousClass69U r06 = AnonymousClass69U.A0S;
                A0D(r06, r13);
                A0E(r06, r13);
                return;
            }
            return;
        }
        A0P(r13, AnonymousClass69P.SHIPPING_ADDRESS, r13.A0Q);
        A0P(r13, AnonymousClass69P.PAYMENT_METHOD, r13.A0M);
        A0P(r13, AnonymousClass69P.CONTACT_INFORMATION, r13.A0I);
        A0P(r13, AnonymousClass69P.SHIPPING_OPTIONS, r13.A0J);
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0e(android.os.Bundle r18, android.view.ContextThemeWrapper r19, androidx.fragment.app.Fragment r20, X.AnonymousClass69U r21, X.AnonymousClass58M r22, com.facebookpay.paymentmethod.model.PaymentMethod r23) {
        /*
            r6 = r22
            X.58U r2 = r6.A1P
            r11 = r23
            java.lang.Integer r0 = r2.A0F(r11)
            r8 = 0
            r5 = 0
            if (r23 == 0) goto L_0x0037
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r0 = X.AnonymousClass7Fc.A00(r11, r0, r8)
        L_0x0012:
            X.7Kx r10 = X.AnonymousClass7Kx.A0A(r0)
            com.facebookpay.shippingaddress.model.ShippingAddress r3 = A02(r6)
            com.facebookpay.shippingaddress.model.ShippingAddress r13 = A01(r6)
            boolean r0 = r6.A0Z
            r15 = 1
            r7 = r18
            r4 = r19
            r1 = r20
            if (r0 != 0) goto L_0x0039
            X.587 r0 = r6.A1O
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0039
            if (r23 == 0) goto L_0x0039
            r2.BrQ(r7, r4, r1, r10)
            return r15
        L_0x0037:
            r0 = r5
            goto L_0x0012
        L_0x0039:
            boolean r0 = r11 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x013e
            r0 = r11
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
        L_0x0040:
            boolean r0 = r2.A0I(r0)
            java.lang.String r9 = "user_click_credential_atomic"
            if (r0 == 0) goto L_0x0141
            if (r3 == 0) goto L_0x0141
            if (r13 == 0) goto L_0x0141
            java.lang.String r12 = r3.A06
            if (r12 == 0) goto L_0x0141
            java.lang.String r0 = r13.A06
            if (r0 == 0) goto L_0x0141
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0141
            boolean r0 = r11 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r0 == 0) goto L_0x006f
            r0 = r11
            com.facebookpay.paymentmethod.model.TokenizedCard r0 = (com.facebookpay.paymentmethod.model.TokenizedCard) r0
            com.facebook.graphql.impls.TokenizedCardCredentialImpl r14 = r0.A01
            X.67K r13 = X.AnonymousClass67K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "token_status"
            java.lang.Enum r13 = X.C86104wH.A0a(r14, r13, r0)
            X.67K r0 = X.AnonymousClass67K.SUSPENDED
            if (r13 == r0) goto L_0x0141
        L_0x006f:
            java.lang.String r0 = "edit_selected_credential_from_alert_dialog"
            A0S(r6, r9, r0)
            if (r23 == 0) goto L_0x007a
            java.lang.String r5 = r11.BH2()
        L_0x007a:
            java.lang.StringBuilder r9 = X.C18200wM.A0r()
            java.lang.String r2 = r3.A08
            java.lang.String r13 = ", "
            if (r2 == 0) goto L_0x0090
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0090
            r9.append(r2)
            r9.append(r13)
        L_0x0090:
            java.lang.String r2 = r3.A09
            if (r2 == 0) goto L_0x00a0
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00a0
            r9.append(r2)
            r9.append(r13)
        L_0x00a0:
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x00b0
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00b0
            r9.append(r2)
            r9.append(r13)
        L_0x00b0:
            java.lang.String r2 = r3.A07
            if (r2 == 0) goto L_0x00c2
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00c2
            r9.append(r2)
            java.lang.String r0 = " "
            r9.append(r0)
        L_0x00c2:
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x00cb
            r9.append(r12)
        L_0x00cb:
            java.lang.String r9 = r9.toString()
            r0 = 20
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r3 = X.C86154wM.A15(r11, r6, r3, r0)
            kotlin.jvm.internal.KtLambdaShape3S0600000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape3S0600000_I2
            r17 = r21
            r23 = r8
            r21 = r7
            r22 = r10
            r19 = r6
            r18 = r4
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0 = 12
            kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5 r1 = new kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5
            r1.<init>(r6, r0)
            X.77R r7 = X.AnonymousClass7Kz.A0M()
            r0 = 2131826631(0x7f1117c7, float:1.9286152E38)
            java.lang.String r6 = X.AnonymousClass0wJ.A0l(r4, r5, r0)
            r0 = 22
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r5 = X.C86154wM.A0N(r3, r0)
            r0 = 23
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r3 = X.C86154wM.A0N(r2, r0)
            r0 = 24
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r2 = X.C86154wM.A0N(r1, r0)
            r0 = 2131826632(0x7f1117c8, float:1.9286154E38)
            X.6n7 r1 = new X.6n7
            r1.<init>()
            r1.A06 = r0
            r1.A04 = r8
            r1.A0B = r5
            if (r6 == 0) goto L_0x011e
            r1.A0I = r6
        L_0x011e:
            if (r9 == 0) goto L_0x0122
            r1.A0F = r9
        L_0x0122:
            r0 = 2131826630(0x7f1117c6, float:1.928615E38)
            r1.A03 = r0
            r0 = 2131826629(0x7f1117c5, float:1.9286148E38)
            r1.A02 = r0
            r1.A01 = r8
            r0 = 2
            r1.A05 = r0
            r1.A0A = r3
            r1.A09 = r2
            X.6sZ r0 = new X.6sZ
            r0.<init>(r1)
            X.AnonymousClass77R.A00(r4, r0, r7)
            return r15
        L_0x013e:
            r0 = r5
            goto L_0x0040
        L_0x0141:
            boolean r0 = r6.A0Z
            if (r0 != 0) goto L_0x01b2
            X.7Kx r0 = r6.A0M
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x01b2
            java.lang.Integer r0 = r0.A02
            if (r0 == 0) goto L_0x01b2
            X.56q r10 = r2.A08
            X.7Kx r0 = X.C86104wH.A0R(r10)
            if (r0 == 0) goto L_0x01b3
            java.lang.Throwable r0 = r0.A02
        L_0x015b:
            boolean r0 = r0 instanceof X.AnonymousClass88I
            if (r0 != 0) goto L_0x01b2
            X.56q r3 = r2.A09
            X.7Kx r0 = X.C86104wH.A0R(r3)
            boolean r0 = X.AnonymousClass7Kx.A0R(r0)
            if (r0 == 0) goto L_0x01ba
            X.7Kx r0 = X.C86104wH.A0R(r3)
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r3 = r3.A08()
            java.lang.String r0 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>"
            X.C04220Ms.A0C(r3, r0)
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x01b5
            java.util.Iterator r11 = X.C86144wL.A0y(r0)
        L_0x0188:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r3 = r11.next()
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x0188
            java.lang.Object r3 = r3.A01
            boolean r0 = r3 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem"
            X.C04220Ms.A0C(r3, r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r3 = (com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem) r3
            java.lang.Integer r0 = r3.A02
            r3 = 7
            if (r0 == 0) goto L_0x0188
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x0188
        L_0x01b2:
            return r8
        L_0x01b3:
            r0 = r5
            goto L_0x015b
        L_0x01b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x01ba:
            X.7Kx r0 = X.C86104wH.A0R(r10)
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r0 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto L_0x01d0
            X.LcE r5 = r0.Aam()
        L_0x01d0:
            java.lang.String r0 = "add_payment_info"
            r6.A0b(r5, r9, r0)
            X.7Kx r0 = r6.A0M
            r2.BrQ(r7, r4, r1, r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0e(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.69U, X.58M, com.facebookpay.paymentmethod.model.PaymentMethod):boolean");
    }

    public static final boolean A0g(AnonymousClass58M r1) {
        AnonymousClass7Kx r12 = r1.A0M;
        if (!AnonymousClass7Kx.A0O(r12) || !(r12.A02 instanceof AnonymousClass88V)) {
            return false;
        }
        return true;
    }

    public static final boolean A0h(AnonymousClass58M r5) {
        Integer num;
        OtcOptionState A042;
        String str;
        ECPPaymentRequest A0a2;
        CheckoutConfiguration checkoutConfiguration;
        AnonymousClass587 r4 = r5.A1O;
        boolean A0d2 = r5.A0d();
        boolean A072 = r4.A07();
        if (A0d2) {
            if (!A072) {
                num = AnonymousClass006.A0C;
            } else {
                if (r4.A07()) {
                    num = AnonymousClass006.A01;
                }
                throw C86134wK.A0s("OTC State is not known");
            }
        } else if (!A072) {
            num = AnonymousClass006.A0Y;
        } else {
            if (r4.A07()) {
                num = AnonymousClass006.A0j;
            }
            throw C86134wK.A0s("OTC State is not known");
        }
        if (num != AnonymousClass006.A0j || (A042 = r4.A04()) == null || !A042.A04) {
            return false;
        }
        OtcOptionState A043 = r4.A04();
        if (A043 != null) {
            str = A043.A02;
        } else {
            str = null;
        }
        if (!C04220Ms.A0I(str, "CARD") || (A0a2 = C86124wJ.A0a(r5.A0z)) == null || (checkoutConfiguration = A0a2.A01) == null || !C18190wL.A1Z(checkoutConfiguration.A03, true)) {
            return false;
        }
        return true;
    }

    public final LoggingContext A0v() {
        LoggingContext loggingContext = this.A07;
        if (loggingContext != null) {
            return loggingContext;
        }
        C86124wJ.A19();
        throw null;
    }

    public final List A0w() {
        List list = this.A0Y;
        if (list != null) {
            return list;
        }
        C04220Ms.A0E("componentTypeList");
        throw null;
    }

    public final void A0x() {
        AnonymousClass69U r3;
        Object obj;
        BaseCheckoutItem baseCheckoutItem;
        AnonymousClass69U r1;
        AnonymousClass69U r12;
        AnonymousClass69U r13;
        AnonymousClass69U r14;
        BaseCheckoutItem baseCheckoutItem2;
        BaseCheckoutItem baseCheckoutItem3;
        BaseCheckoutItem baseCheckoutItem4;
        BaseCheckoutItem baseCheckoutItem5;
        Iterator A0t2 = C86134wK.A0t(this.A1V.values());
        while (true) {
            r3 = null;
            if (!A0t2.hasNext()) {
                obj = null;
                break;
            }
            obj = A0t2.next();
            AnonymousClass7Kx r4 = (AnonymousClass7Kx) obj;
            if (r4 == null || (baseCheckoutItem5 = (BaseCheckoutItem) r4.A01) == null) {
                r1 = null;
            } else {
                r1 = baseCheckoutItem5.AqR();
            }
            if (r1 != this.A04) {
                if (r4 == null || (baseCheckoutItem4 = (BaseCheckoutItem) r4.A01) == null) {
                    r12 = null;
                } else {
                    r12 = baseCheckoutItem4.AqR();
                }
                if (r12 == AnonymousClass69U.A0R && AnonymousClass7Kx.A0O(C86104wH.A0R(this.A1P.A08))) {
                    break;
                }
                if (r4 == null || (baseCheckoutItem3 = (BaseCheckoutItem) r4.A01) == null) {
                    r13 = null;
                } else {
                    r13 = baseCheckoutItem3.AqR();
                }
                if (r13 == AnonymousClass69U.A0T && AnonymousClass7Kx.A0O(C86104wH.A0R(this.A1T.A06))) {
                    break;
                }
                if (r4 == null || (baseCheckoutItem2 = (BaseCheckoutItem) r4.A01) == null) {
                    r14 = null;
                } else {
                    r14 = baseCheckoutItem2.AqR();
                }
                if (r14 == AnonymousClass69U.A0O && AnonymousClass7Kx.A0O(C86104wH.A0R(this.A1J.A0A))) {
                    break;
                }
            }
        }
        AnonymousClass7Kx r2 = (AnonymousClass7Kx) obj;
        if (!(r2 == null || (baseCheckoutItem = (BaseCheckoutItem) r2.A01) == null)) {
            r3 = baseCheckoutItem.AqR();
        }
        if (r3 != null) {
            AnonymousClass69U r15 = this.A04;
            this.A04 = r3;
            if (r15 != null && r15 == AnonymousClass69U.A0Q) {
                A0D(r15, this);
                A0E(r15, this);
            }
            A0C((AnonymousClass69U) null, this);
        } else if (this.A04 != null) {
            this.A04 = null;
            A0C((AnonymousClass69U) null, this);
        }
    }

    public final void A10(ECPHandler eCPHandler) {
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = this.A05;
            if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                if (!C04220Ms.A0I(this.A05, eCPHandler)) {
                    AnonymousClass78P r3 = this.A1L;
                    M5J D7U = eCPHandler.D7U();
                    C04220Ms.A0B(D7U, 0);
                    r3.A09.A0K(D7U, r3.A0B);
                }
                this.A05 = eCPHandler;
                return;
            }
            throw C18180wK.A0a("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        throw C18180wK.A0a("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final void A11(Throwable th, boolean z, boolean z2) {
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext A0v2 = A0v();
        AnonymousClass7DP A032 = this.A1O.A03();
        Boolean valueOf = Boolean.valueOf(z2);
        LinkedHashMap A0y2 = C18220wO.A0y();
        if (z) {
            AnonymousClass7Kr.A0B(A032, A0y2);
            if (valueOf != null) {
                A0y2.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
            }
            C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_ecpcheckout_success"), 278), A0v2, A0y2, "pux_checkout", 28);
            return;
        }
        AnonymousClass7Kr.A0B(A032, A0y2);
        C86114wI.A1P(th, A0y2);
        if (valueOf != null) {
            A0y2.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
        }
        C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_ecpcheckout_fail"), 276), A0v2, A0y2, "pux_checkout", 26);
    }

    public final void A12(boolean z, boolean z2) {
        Object obj = this.A0L.A01;
        if (obj != null) {
            PayButtonItem payButtonItem = (PayButtonItem) obj;
            if (payButtonItem.A03 || z2) {
                AnonymousClass7Kx A0A2 = AnonymousClass7Kx.A0A(new PayButtonItem(payButtonItem.A00, payButtonItem.A01, payButtonItem.A02, z));
                this.A0L = A0A2;
                A0P(this, AnonymousClass69P.PAY_BUTTON, A0A2);
                if (!z) {
                    A0a(this, false);
                }
                AnonymousClass7Kx.A0J(this.A1Q.A03, (Object) null);
                return;
            }
            throw C18180wK.A0a("Pay button was in an incorrect processing state");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public final boolean A13() {
        Integer num;
        OtcOptionState A042;
        String str;
        ECPPaymentRequest A0a2;
        CheckoutConfiguration checkoutConfiguration;
        AnonymousClass587 r4 = this.A1O;
        boolean A0d2 = A0d();
        boolean A072 = r4.A07();
        if (A0d2) {
            if (!A072) {
                num = AnonymousClass006.A0C;
            } else {
                if (r4.A07()) {
                    num = AnonymousClass006.A01;
                }
                throw C86134wK.A0s("OTC State is not known");
            }
        } else if (!A072) {
            num = AnonymousClass006.A0Y;
        } else {
            if (r4.A07()) {
                num = AnonymousClass006.A0j;
            }
            throw C86134wK.A0s("OTC State is not known");
        }
        if (num != AnonymousClass006.A01 || (A042 = r4.A04()) == null || !A042.A04) {
            return false;
        }
        OtcOptionState A043 = r4.A04();
        if (A043 != null) {
            str = A043.A02;
        } else {
            str = null;
        }
        if (!C04220Ms.A0I(str, "CARD") || (A0a2 = C86124wJ.A0a(this.A0z)) == null || (checkoutConfiguration = A0a2.A01) == null || !C18190wL.A1Z(checkoutConfiguration.A03, true)) {
            return false;
        }
        return true;
    }

    public static final ShippingAddress A01(AnonymousClass58M r3) {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        C148488rA r1;
        C108806iy r0;
        if (!AnonymousClass7BG.A02(AnonymousClass69P.PAYMENT_METHOD, r3.A0w()) || !A0l(r3)) {
            return null;
        }
        AnonymousClass7Kx A0R2 = C86104wH.A0R(r3.A1P.A08);
        if (A0R2 == null || (r0 = (C108806iy) A0R2.A01) == null) {
            paymentMethod = null;
        } else {
            paymentMethod = (PaymentMethod) r0.A01;
        }
        if (!(paymentMethod instanceof CreditCard) || (creditCard = (CreditCard) paymentMethod) == null || (r1 = creditCard.A00) == null) {
            return null;
        }
        return C116946xs.A00(r1, creditCard.A03);
    }

    private final AnonymousClass7Kx A03() {
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        AnonymousClass7Kx.A0M(2131826412, AnonymousClass006.A0C, A0v2);
        if (A0w().contains(AnonymousClass69P.ITEM_LIST)) {
            Iterator A0z2 = AnonymousClass0wJ.A0z(this.A0n);
            while (A0z2.hasNext()) {
                Object value = C18180wK.A0o(A0z2).getValue();
                C04220Ms.A0C(value, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
                A0v2.add(value);
            }
        }
        if (A0w().contains(AnonymousClass69P.INCENTIVES)) {
            AnonymousClass7Kx r0 = this.A0K;
            C04220Ms.A0C(r0, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
            A0v2.add(r0);
        }
        AnonymousClass7Kx A002 = AnonymousClass7BC.A00(this.A0S);
        C04220Ms.A0C(A002, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        A0v2.add(A002);
        AnonymousClass69U r2 = AnonymousClass69U.A0Q;
        AnonymousClass7Kx r1 = this.A0i;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        AnonymousClass7Kx A042 = AnonymousClass7Kx.A04(r2, (C108826j0) null, r1, A0v2, C18180wK.A1Z(this.A04, r2));
        this.A0h = A042;
        return A042;
    }

    public static final AnonymousClass7Kx A06(AnonymousClass7Kx r2, int i) {
        if (!AnonymousClass7Kx.A0O(r2) || !(r2.A02 instanceof AnonymousClass88V)) {
            return r2;
        }
        return AnonymousClass7Kx.A0B(r2.A01, new AnonymousClass88V(AnonymousClass69Q.A09, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0162, code lost:
        if (r0 != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x016e, code lost:
        if (r8 != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r4 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r4 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r0 == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r0 != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        if (r8.contains(X.AnonymousClass68F.A02) != true) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        if (r0 == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        if (r0 != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b4, code lost:
        if (r8.contains(X.AnonymousClass68F.A04) != true) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c2, code lost:
        if (r0 == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c8, code lost:
        if (r0 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0133, code lost:
        if (r3 != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x013b, code lost:
        if (r0 != null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r1.A0D == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A09(com.facebookpay.expresscheckout.models.ECPPaymentRequest r16, X.AnonymousClass58M r17, boolean r18) {
        /*
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r2 = X.AnonymousClass7JJ.A02()
            r3 = r16
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r3.A01
            r7 = 0
            if (r1 == 0) goto L_0x0199
            java.util.Set<X.68M> r4 = r1.A0B
            java.util.Set<X.68F> r8 = r1.A0C
        L_0x000f:
            r0 = r17
            X.7Kx r0 = r0.A0M
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x001b
            com.facebookpay.paymentmethod.model.PaymentMethod r7 = r0.A01
        L_0x001b:
            if (r18 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.A0D
            r18 = 1
            if (r0 != 0) goto L_0x0027
        L_0x0025:
            r18 = 0
        L_0x0027:
            java.lang.String r3 = r3.A08
            r1 = 0
            r0 = 0
            X.79R r6 = new X.79R
            r6.<init>(r0, r3)
            if (r4 == 0) goto L_0x0196
            X.68M r0 = X.AnonymousClass68M.UX_SHIPPING_ADDRESS
            boolean r5 = r4.contains(r0)
        L_0x0038:
            X.0Oa r0 = r2.A0D
            java.lang.Object r0 = r0.getValue()
            X.7j3 r0 = (X.C128157j3) r0
            X.7IT r0 = r0.A00
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r6)
            X.7Kx r0 = X.C86104wH.A0R(r0)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r0.A01
            X.6j5 r0 = (X.C108866j5) r0
            if (r0 == 0) goto L_0x005d
            java.util.List r0 = r0.A02
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != r3) goto L_0x005d
            r4 = 1
        L_0x005d:
            r17 = 1
            if (r5 == 0) goto L_0x0065
            r16 = 1
            if (r4 != 0) goto L_0x006c
        L_0x0065:
            r16 = 0
            if (r5 == 0) goto L_0x006c
            r15 = 0
            if (r4 == 0) goto L_0x006d
        L_0x006c:
            r15 = 1
        L_0x006d:
            if (r8 == 0) goto L_0x0193
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_NAME
            boolean r4 = r8.contains(r0)
        L_0x0075:
            X.0Oa r5 = r2.A0B
            X.7j5 r0 = X.C86144wL.A0R(r5)
            boolean r0 = r0.A0B(r6)
            if (r4 == 0) goto L_0x0084
            r14 = 1
            if (r0 != 0) goto L_0x008a
        L_0x0084:
            r14 = 0
            if (r4 == 0) goto L_0x008a
            r13 = 0
            if (r0 == 0) goto L_0x008b
        L_0x008a:
            r13 = 1
        L_0x008b:
            if (r8 == 0) goto L_0x0096
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_EMAIL
            boolean r0 = r8.contains(r0)
            r4 = 1
            if (r0 == r3) goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            X.7j5 r0 = X.C86144wL.A0R(r5)
            boolean r0 = r0.A0A(r6)
            if (r4 == 0) goto L_0x00a4
            r12 = 1
            if (r0 != 0) goto L_0x00aa
        L_0x00a4:
            r12 = 0
            if (r4 == 0) goto L_0x00aa
            r11 = 0
            if (r0 == 0) goto L_0x00ab
        L_0x00aa:
            r11 = 1
        L_0x00ab:
            if (r8 == 0) goto L_0x00b6
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_PHONE
            boolean r0 = r8.contains(r0)
            r4 = 1
            if (r0 == r3) goto L_0x00b7
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            X.7j5 r0 = X.C86144wL.A0R(r5)
            boolean r0 = r0.A0C(r6)
            if (r4 == 0) goto L_0x00c4
            r10 = 1
            if (r0 != 0) goto L_0x00ca
        L_0x00c4:
            r10 = 0
            if (r4 == 0) goto L_0x00ca
            r9 = 0
            if (r0 == 0) goto L_0x00cb
        L_0x00ca:
            r9 = 1
        L_0x00cb:
            if (r7 != 0) goto L_0x00ef
            X.0Oa r0 = r2.A0C
            java.lang.Object r0 = r0.getValue()
            X.7j4 r0 = (X.C128167j4) r0
            X.7IT r0 = r0.A01
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r6)
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = r0.A01
            X.79r r0 = (X.C1203179r) r0
            if (r0 == 0) goto L_0x0190
            java.util.List r0 = r0.A02
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != r3) goto L_0x0190
        L_0x00ef:
            r8 = 1
        L_0x00f0:
            X.0Oa r5 = r2.A0C
            java.lang.Object r0 = r5.getValue()
            X.7j4 r0 = (X.C128167j4) r0
            X.7IT r0 = r0.A01
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r6)
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x018d
            java.lang.Object r0 = r0.A01
            X.79r r0 = (X.C1203179r) r0
            if (r0 == 0) goto L_0x018d
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r4 = r0.A00
        L_0x010c:
            boolean r3 = r7 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r3 == 0) goto L_0x0119
            r0 = r7
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            if (r0 == 0) goto L_0x0119
            X.8rA r2 = r0.A00
            if (r2 != 0) goto L_0x0135
        L_0x0119:
            java.lang.Object r0 = r5.getValue()
            X.7j4 r0 = (X.C128167j4) r0
            X.7Kx r0 = r0.A06(r6)
            if (r0 == 0) goto L_0x0129
            java.lang.Object r1 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
        L_0x0129:
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x018b
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            if (r1 == 0) goto L_0x018b
            X.8rA r2 = r1.A00
        L_0x0133:
            if (r3 == 0) goto L_0x013d
        L_0x0135:
            com.facebookpay.paymentmethod.model.CreditCard r7 = (com.facebookpay.paymentmethod.model.CreditCard) r7
            if (r7 == 0) goto L_0x013d
            java.lang.String r0 = r7.A03
            if (r0 != 0) goto L_0x0157
        L_0x013d:
            java.lang.Object r0 = r5.getValue()
            X.7j4 r0 = (X.C128167j4) r0
            X.7Kx r0 = r0.A06(r6)
            if (r0 == 0) goto L_0x0189
            java.lang.Object r1 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
        L_0x014d:
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x0187
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            if (r1 == 0) goto L_0x0187
            java.lang.String r0 = r1.A03
        L_0x0157:
            if (r4 == 0) goto L_0x0185
            if (r2 == 0) goto L_0x0185
            boolean r0 = X.AnonymousClass6IZ.A00(r4, r2, r0)
        L_0x015f:
            if (r18 == 0) goto L_0x0164
            r1 = 0
            if (r0 == 0) goto L_0x0165
        L_0x0164:
            r1 = 1
        L_0x0165:
            if (r16 != 0) goto L_0x0170
            if (r14 != 0) goto L_0x0170
            if (r12 != 0) goto L_0x0170
            if (r10 != 0) goto L_0x0170
            r0 = 0
            if (r8 == 0) goto L_0x0171
        L_0x0170:
            r0 = 1
        L_0x0171:
            if (r15 == 0) goto L_0x0182
            if (r13 == 0) goto L_0x0182
            if (r11 == 0) goto L_0x0182
            if (r9 == 0) goto L_0x0182
            if (r8 == 0) goto L_0x0182
            if (r1 == 0) goto L_0x0182
        L_0x017d:
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "NUX"
            return r0
        L_0x0182:
            r17 = 0
            goto L_0x017d
        L_0x0185:
            r0 = 0
            goto L_0x015f
        L_0x0187:
            r0 = 0
            goto L_0x0157
        L_0x0189:
            r1 = 0
            goto L_0x014d
        L_0x018b:
            r2 = 0
            goto L_0x0133
        L_0x018d:
            r4 = r1
            goto L_0x010c
        L_0x0190:
            r8 = 0
            goto L_0x00f0
        L_0x0193:
            r4 = 0
            goto L_0x0075
        L_0x0196:
            r5 = 0
            goto L_0x0038
        L_0x0199:
            r4 = r7
            r8 = r7
            goto L_0x000f
        L_0x019d:
            if (r17 == 0) goto L_0x01a2
            java.lang.String r0 = "FULL_PUX"
            return r0
        L_0x01a2:
            if (r8 == 0) goto L_0x01a7
            java.lang.String r0 = "PARTIAL_PUX_WITH_CREDENTIAL"
            return r0
        L_0x01a7:
            java.lang.String r0 = "PARTIAL_PUX_WITHOUT_CREDENTIAL"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A09(com.facebookpay.expresscheckout.models.ECPPaymentRequest, X.58M, boolean):java.lang.String");
    }

    public static void A0B(AnonymousClass79R r1) {
        AnonymousClass7Kz.A05().A0B.A08(r1);
        AnonymousClass7Kz.A05().A0D.A03(r1);
        AnonymousClass7Kz.A05().A01.A06(r1);
        AnonymousClass7Kz.A05().A0E.A01(r1);
        AnonymousClass7Kz.A05().A0C.A02(r1);
    }

    public static final void A0E(AnonymousClass69U r1, AnonymousClass58M r2) {
        AnonymousClass69P r12;
        AnonymousClass7Kx r0;
        switch (r1.ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r12 = AnonymousClass69P.PAYMENT_METHOD;
                r0 = r2.A0D;
                break;
            case 13:
                r12 = AnonymousClass69P.SHIPPING_ADDRESS;
                r0 = r2.A0F;
                break;
            case 14:
                r12 = AnonymousClass69P.CONTACT_INFORMATION;
                r0 = r2.A0B;
                break;
            case 15:
                r12 = AnonymousClass69P.SHIPPING_OPTIONS;
                r0 = r2.A0C;
                break;
            case 16:
                r12 = AnonymousClass69P.ORDER_SUMMARY;
                r0 = r2.A0h;
                break;
            case LangUtils.HASH_SEED /*17*/:
                r12 = AnonymousClass69P.PICKUP_CONTACT_INFO;
                r0 = r2.A0E;
                break;
            default:
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("{ECPViewModel} ItemType is not found for identifier => ", r1));
        }
        A0P(r2, r12, r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.AnonymousClass69U r8, X.AnonymousClass58M r9, java.lang.Boolean r10) {
        /*
            int r0 = r8.ordinal()
            r2 = 0
            switch(r0) {
                case 2: goto L_0x0055;
                case 3: goto L_0x0111;
                case 4: goto L_0x0009;
                case 5: goto L_0x0125;
                case 6: goto L_0x0008;
                case 7: goto L_0x0008;
                case 8: goto L_0x0008;
                case 9: goto L_0x0008;
                case 10: goto L_0x0008;
                case 11: goto L_0x0008;
                case 12: goto L_0x0055;
                case 13: goto L_0x0111;
                case 14: goto L_0x0009;
                case 15: goto L_0x0125;
                case 16: goto L_0x017b;
                default: goto L_0x0008;
            }
        L_0x0008:
            return
        L_0x0009:
            if (r10 == 0) goto L_0x0052
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x004f
            java.lang.String r4 = "expand_contact"
        L_0x0013:
            X.7ke r5 = X.AnonymousClass7JJ.A01()
            com.fbpay.logging.LoggingContext r1 = r9.A0v()
            X.587 r0 = r9.A1O
            X.7DP r3 = r0.A03()
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
            X.C86164wN.A1K(r1, r2)
            java.lang.String r0 = "TARGET_NAME"
            r2.put(r0, r4)
            java.lang.String r0 = "extra_data"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0043
            boolean r0 = r1 instanceof X.C03740Kn
            if (r0 == 0) goto L_0x003f
            boolean r0 = r1 instanceof X.AnonymousClass0WC
            if (r0 == 0) goto L_0x0043
        L_0x003f:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0047
        L_0x0043:
            java.util.LinkedHashMap r1 = X.C18220wO.A0y()
        L_0x0047:
            com.google.common.collect.ImmutableMap r1 = X.AnonymousClass7Kr.A04(r3, r2, r1)
            java.lang.String r0 = "user_click_contact_atomic"
            goto L_0x00e3
        L_0x004f:
            java.lang.String r4 = "collapse_contact"
            goto L_0x0013
        L_0x0052:
            java.lang.String r4 = "edit_selected_contact"
            goto L_0x0013
        L_0x0055:
            if (r10 == 0) goto L_0x00ed
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x00e9
            java.lang.String r7 = "expand_credential"
        L_0x005f:
            r0 = r2
        L_0x0060:
            X.7ke r5 = X.AnonymousClass7JJ.A01()
            com.fbpay.logging.LoggingContext r8 = r9.A0v()
            X.58U r1 = r9.A1P
            X.56q r4 = r1.A08
            X.7Kx r1 = X.C86104wH.A0R(r4)
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
            if (r1 == 0) goto L_0x00e7
            java.lang.String r1 = r1.Aal()
            if (r1 == 0) goto L_0x00e7
            java.lang.Long r3 = X.AnonymousClass0wJ.A0d(r1)
        L_0x0088:
            X.587 r1 = r9.A1O
            X.7DP r6 = r1.A03()
            X.7Kx r1 = X.C86104wH.A0R(r4)
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = (com.facebookpay.paymentmethod.model.PaymentMethod) r1
            if (r1 == 0) goto L_0x00a4
            X.LcE r2 = r1.Aam()
        L_0x00a4:
            java.util.LinkedHashMap r4 = X.C18220wO.A0y()
            X.C86164wN.A1K(r8, r4)
            java.lang.String r1 = "TARGET_NAME"
            X.C86104wH.A1O(r3, r1, r7, r4)
            X.C86134wK.A1O(r2, r4)
            java.lang.String r3 = "extra_data"
            java.lang.Object r2 = r4.get(r3)
            boolean r1 = r2 instanceof java.util.Map
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r2 instanceof X.C03740Kn
            if (r1 == 0) goto L_0x00c5
            boolean r1 = r2 instanceof X.AnonymousClass0WC
            if (r1 == 0) goto L_0x00c9
        L_0x00c5:
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x00cd
        L_0x00c9:
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
        L_0x00cd:
            X.AnonymousClass7Kr.A0B(r6, r2)
            r4.put(r3, r2)
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = "selected_credential_state"
            X.AnonymousClass7Kr.A0D(r0, r1, r4)
        L_0x00da:
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r4)
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "user_click_credential_atomic"
        L_0x00e3:
            r5.Bb8(r0, r1)
            return
        L_0x00e7:
            r3 = r2
            goto L_0x0088
        L_0x00e9:
            java.lang.String r7 = "collapse_credential"
            goto L_0x005f
        L_0x00ed:
            X.7Kx r0 = r9.A0M
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x010d
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = r0.A01
            if (r1 == 0) goto L_0x010d
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x0109
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            com.facebook.graphql.impls.CardVerificationFieldsImpl r0 = r1.A01
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "need_verification"
            java.lang.String r7 = "update_payment_info"
            goto L_0x0060
        L_0x0109:
            java.lang.String r7 = "edit_selected_credential"
            goto L_0x005f
        L_0x010d:
            java.lang.String r7 = "select_payment_info"
            goto L_0x005f
        L_0x0111:
            if (r10 == 0) goto L_0x0122
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "expand_shippingaddress"
        L_0x011b:
            r9.A0c(r0)
            return
        L_0x011f:
            java.lang.String r0 = "collapse_shippingaddress"
            goto L_0x011b
        L_0x0122:
            java.lang.String r0 = "edit_selected_shipping_address"
            goto L_0x011b
        L_0x0125:
            if (r10 == 0) goto L_0x0178
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x0175
            java.lang.String r4 = "expand_shippingoption"
        L_0x012f:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r2 = r9.A0v()
            X.58S r0 = r9.A1M
            X.56q r0 = r0.A05
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0172
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0172
            java.lang.Object r0 = r0.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            if (r0 == 0) goto L_0x0172
            java.lang.String r5 = r0.A02()
        L_0x0151:
            X.587 r0 = r9.A1O
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A07(r0)
            r6 = 1
            X.C04220Ms.A0B(r5, r6)
            X.09x r1 = r1.A00
            java.lang.String r0 = "user_click_shippingoption_atomic"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 2858(0xb2a, float:4.005E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.KtLambdaShape1S2200000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape1S2200000_I2
            r1.<init>(r2, r3, r4, r5, r6)
            X.C128957ke.A04(r0, r2, r1)
            return
        L_0x0172:
            java.lang.String r5 = ""
            goto L_0x0151
        L_0x0175:
            java.lang.String r4 = "collapse_shippingoption"
            goto L_0x012f
        L_0x0178:
            java.lang.String r4 = "edit_selected_shipping_option"
            goto L_0x012f
        L_0x017b:
            if (r10 == 0) goto L_0x01aa
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x01a7
            java.lang.String r4 = "expand_ordersummary"
        L_0x0185:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r3 = r9.A0v()
            X.587 r0 = r9.A1O
            java.util.LinkedHashMap r2 = X.AnonymousClass7Kr.A07(r0)
            X.09x r1 = r1.A00
            java.lang.String r0 = "user_click_ordersummary_atomic"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 2848(0xb20, float:3.991E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 16
            X.C128957ke.A03(r1, r3, r2, r4, r0)
            return
        L_0x01a7:
            java.lang.String r4 = "collapse_ordersummary"
            goto L_0x0185
        L_0x01aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0F(X.69U, X.58M, java.lang.Boolean):void");
    }

    public static final void A0I(ECPPaymentResponseParams eCPPaymentResponseParams, AnonymousClass58M r6, AnonymousClass7Kx r7, AnonymousClass0YY r8) {
        ECPHandler eCPHandler;
        AnonymousClass7Kx A0C2;
        if (AnonymousClass7Kx.A0R(r7)) {
            eCPHandler = r6.A05;
            if (eCPHandler != null) {
                A0C2 = AnonymousClass7Kx.A0A(eCPPaymentResponseParams);
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        } else {
            if (AnonymousClass7Kx.A0O(r7)) {
                Throwable th = r7.A02;
                if (th instanceof AnonymousClass88a) {
                    C04220Ms.A0C(th, "null cannot be cast to non-null type com.fbpay.util.exceptions.ECPErrorDialogException");
                    AnonymousClass7JD.A02(r6.A0u, ((AnonymousClass88a) th).A00);
                } else {
                    A0T(r6, th);
                }
                eCPHandler = r6.A05;
                if (eCPHandler != null) {
                    A0C2 = AnonymousClass7Kx.A0C(th);
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
            r8.invoke(r7);
        }
        eCPHandler.BN6(A0C2);
        A0H(eCPPaymentResponseParams, r6, r7, "payment_authorization");
        r8.invoke(r7);
    }

    public static final void A0K(AnonymousClass58M r2) {
        PromoCodeList promoCodeList;
        TransactionInfo A002 = AnonymousClass7Kx.A00(r2);
        if (A002 == null || (promoCodeList = A002.A02) == null) {
            promoCodeList = new PromoCodeList(AnonymousClass0ZV.A00);
        }
        AnonymousClass7Kx.A0I(r2.A1S.A0B, promoCodeList);
        r2.A1N.A08(promoCodeList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (X.AnonymousClass7Kx.A0R(r11.A0Q) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0N(X.AnonymousClass58M r11) {
        /*
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r11)
            if (r0 == 0) goto L_0x0051
            com.facebookpay.common.models.CurrencyAmount r2 = X.C122157Kv.A03(r0)
            X.7Kx r0 = r11.A0S
            com.facebookpay.common.models.CurrencyAmount r3 = X.C122157Kv.A02(r2, r0)
            java.lang.String r5 = r11.A0X
            X.7Kx r0 = r11.A0i
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem) r0
            if (r0 == 0) goto L_0x0052
            java.util.List r6 = r0.A05
        L_0x001c:
            java.util.Map r0 = r11.A0n
            int r7 = r0.size()
            boolean r0 = A0s(r11)
            if (r0 == 0) goto L_0x0031
            X.7Kx r0 = r11.A0Q
            boolean r0 = X.AnonymousClass7Kx.A0R(r0)
            r8 = 1
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r8 = 0
        L_0x0032:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r9 = X.C86144wL.A1X(r1, r0)
            X.69U r4 = X.AnonymousClass69U.A0Z
            r10 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r1 = new com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r1)
            r11.A0i = r0
            X.69P r1 = X.AnonymousClass69P.ORDER_SUMMARY
            X.7Kx r0 = r11.A03()
            A0P(r11, r1, r0)
        L_0x0051:
            return
        L_0x0052:
            java.util.Map r1 = r11.A0n
            X.56r r0 = r11.A0z
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r0)
            if (r0 == 0) goto L_0x0067
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r0.A01
        L_0x0062:
            java.util.List r6 = X.AnonymousClass7BC.A01(r0, r1)
            goto L_0x001c
        L_0x0067:
            r0 = 0
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0N(X.58M):void");
    }

    public static final void A0P(AnonymousClass58M r3, AnonymousClass69P r4, AnonymousClass7Kx r5) {
        int ordinal = r4.ordinal();
        if (ordinal != 18) {
            if (ordinal != 27) {
                LinkedHashMap linkedHashMap = r3.A1V;
                String name = r4.name();
                if (!r3.A0u(r5, (AnonymousClass7Kx) linkedHashMap.get(name))) {
                    linkedHashMap.put(name, r5);
                } else {
                    return;
                }
            } else if (!r3.A0u(r5, r3.A0k)) {
                r3.A0k = r5;
            } else {
                return;
            }
        } else if (!r3.A0u(r5, r3.A0j)) {
            r3.A0j = r5;
        } else {
            return;
        }
        A0W(r3, r3.A1V);
    }

    public static final void A0S(AnonymousClass58M r5, String str, String str2) {
        Long l;
        C108806iy r0;
        PaymentMethod paymentMethod;
        String Aal;
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext A0v2 = r5.A0v();
        C40307LcE lcE = C40307LcE.A01;
        AnonymousClass7Kx A0R2 = C86104wH.A0R(r5.A1P.A08);
        if (A0R2 == null || (r0 = (C108806iy) A0R2.A01) == null || (paymentMethod = (PaymentMethod) r0.A01) == null || (Aal = paymentMethod.Aal()) == null) {
            l = null;
        } else {
            l = AnonymousClass0wJ.A0d(Aal);
        }
        LinkedHashMap A0y2 = C18220wO.A0y();
        C86114wI.A1K(A0v2, str2, A0y2);
        if (l != null) {
            A0y2.put("component_data_id", Long.valueOf(l.longValue()));
        }
        A0y2.put("CREDENTIAL_TYPE", lcE);
        ImmutableMap copyOf = ImmutableMap.copyOf(A0y2);
        C04220Ms.A06(copyOf);
        A012.Bb8(str, copyOf);
    }

    public static void A0W(AnonymousClass58M r2, AbstractMap abstractMap) {
        Collection values = abstractMap.values();
        C04220Ms.A06(values);
        r2.A0r.A0H(AnonymousClass00J.A0K(AnonymousClass00J.A0N(values)));
        r2.A0v.A0H(r2.A0L);
        r2.A0y.A0H(r2.A0R);
    }

    public static final void A0Y(AnonymousClass58M r3, boolean z) {
        Map map;
        C1201078o A0R2;
        TransactionInfo A002;
        ArrayList<PriceInfo> arrayList;
        List A0w2 = r3.A0w();
        AnonymousClass69P r2 = AnonymousClass69P.ITEM_LIST;
        if (A0w2.contains(r2)) {
            ECPPaymentRequest A0a2 = C86124wJ.A0a(r3.A0z);
            if (A0a2 == null || (A002 = AnonymousClass7Kx.A00(r3)) == null || (arrayList = A002.A08) == null || (map = AnonymousClass7BC.A02(A0a2, arrayList)) == null) {
                map = AnonymousClass4WJ.A0A();
            }
            r3.A0n = map;
            if (C86164wN.A1R(map)) {
                C1201078o A0R3 = C86114wI.A0R(r2, r3.A1X);
                if (A0R3 != null) {
                    A0R3.A01(C86164wN.A0r(r3, 15));
                }
            } else if (!z && (A0R2 = C86114wI.A0R(r2, r3.A1X)) != null) {
                A0R2.A00(new KtLambdaShape25S0100000_I2_5(r3, 11));
            }
            A0M(r3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0Z(X.AnonymousClass58M r19, boolean r20) {
        /*
            X.0MJ r2 = X.C86144wL.A17()
            r3 = r19
            com.facebookpay.expresscheckout.models.TransactionInfo r5 = X.AnonymousClass7Kx.A00(r3)
            if (r5 == 0) goto L_0x004e
            java.lang.Integer r0 = r5.A04
            if (r0 == 0) goto L_0x004e
            int r0 = r0.intValue()
        L_0x0014:
            r4 = 1
            r1 = 10
            if (r0 != r4) goto L_0x00b3
            if (r5 == 0) goto L_0x004c
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r5.A00
            if (r0 == 0) goto L_0x004c
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r0 = r0.A01
        L_0x0021:
            r19 = 0
            if (r0 == 0) goto L_0x0050
            java.util.Iterator r8 = r0.iterator()
        L_0x0029:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r4 = r8.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r4 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r4
            boolean r0 = r4 instanceof com.facebookpay.expresscheckout.models.FulfillmentPickupOption
            if (r0 == 0) goto L_0x0029
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r4 = (com.facebookpay.expresscheckout.models.FulfillmentPickupOption) r4
            com.facebookpay.common.models.CurrencyAmount r0 = r4.A00
            java.lang.String r0 = r0.A01
            double r6 = java.lang.Double.parseDouble(r0)
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            r19 = 1
            goto L_0x0029
        L_0x004c:
            r0 = 0
            goto L_0x0021
        L_0x004e:
            r0 = -1
            goto L_0x0014
        L_0x0050:
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r3)
            if (r0 == 0) goto L_0x0106
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x0106
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r4 = r0.A01
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r4, r1)
            java.util.Iterator r8 = r4.iterator()
        L_0x0064:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0107
            java.lang.Object r6 = r8.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r6 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r6
            java.lang.String r4 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.FulfillmentPickupOption"
            X.C04220Ms.A0C(r6, r4)
            r7 = r6
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r7 = (com.facebookpay.expresscheckout.models.FulfillmentPickupOption) r7
            java.lang.String r14 = r6.A00()
            boolean r4 = r6 instanceof com.facebookpay.expresscheckout.models.FulfillmentPickupOption
            if (r4 == 0) goto L_0x00b0
            java.lang.String r15 = r7.A04
        L_0x0082:
            if (r4 == 0) goto L_0x00ad
            com.facebookpay.common.models.CurrencyAmount r10 = r7.A00
        L_0x0086:
            r16 = 0
            if (r4 == 0) goto L_0x00aa
            java.util.Date r5 = r7.A06
        L_0x008c:
            if (r4 == 0) goto L_0x00a7
            java.util.Date r4 = r7.A05
        L_0x0090:
            boolean r6 = r7.A07
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            com.facebookpay.shippingaddress.model.ShippingAddress r12 = r7.A02
            com.facebookpay.common.models.Distance r11 = r7.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent r9 = new com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent
            r18 = r4
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.add(r9)
            goto L_0x0064
        L_0x00a7:
            java.util.Date r4 = r6.A02
            goto L_0x0090
        L_0x00aa:
            java.util.Date r5 = r6.A03
            goto L_0x008c
        L_0x00ad:
            com.facebookpay.common.models.CurrencyAmount r10 = r6.A00
            goto L_0x0086
        L_0x00b0:
            java.lang.String r15 = r6.A01
            goto L_0x0082
        L_0x00b3:
            if (r5 == 0) goto L_0x0106
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r5.A00
            if (r0 == 0) goto L_0x0106
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r4 = r0.A01
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r4, r1)
            java.util.Iterator r7 = r4.iterator()
        L_0x00c3:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0107
            java.lang.Object r6 = r7.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r6 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r6
            java.lang.String r10 = r6.A00()
            boolean r5 = r6 instanceof com.facebookpay.expresscheckout.models.FulfillmentPickupOption
            if (r5 == 0) goto L_0x0103
            r4 = r6
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r4 = (com.facebookpay.expresscheckout.models.FulfillmentPickupOption) r4
            java.lang.String r11 = r4.A04
        L_0x00dc:
            if (r5 == 0) goto L_0x0100
            r4 = r6
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r4 = (com.facebookpay.expresscheckout.models.FulfillmentPickupOption) r4
            com.facebookpay.common.models.CurrencyAmount r9 = r4.A00
        L_0x00e3:
            r12 = 0
            if (r5 == 0) goto L_0x00fd
            r4 = r6
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r4 = (com.facebookpay.expresscheckout.models.FulfillmentPickupOption) r4
            java.util.Date r13 = r4.A06
        L_0x00eb:
            if (r5 == 0) goto L_0x00fa
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r6 = (com.facebookpay.expresscheckout.models.FulfillmentPickupOption) r6
            java.util.Date r14 = r6.A05
        L_0x00f1:
            com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent r8 = new com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.add(r8)
            goto L_0x00c3
        L_0x00fa:
            java.util.Date r14 = r6.A02
            goto L_0x00f1
        L_0x00fd:
            java.util.Date r13 = r6.A03
            goto L_0x00eb
        L_0x0100:
            com.facebookpay.common.models.CurrencyAmount r9 = r6.A00
            goto L_0x00e3
        L_0x0103:
            java.lang.String r11 = r6.A01
            goto L_0x00dc
        L_0x0106:
            r0 = 0
        L_0x0107:
            r2.A00 = r0
            if (r0 != 0) goto L_0x013f
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r3)
            if (r0 == 0) goto L_0x013c
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r0.A03
            if (r0 == 0) goto L_0x013c
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r4 = r0.A01
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r4, r1)
            java.util.Iterator r8 = r4.iterator()
        L_0x011f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x013d
            java.lang.Object r1 = r8.next()
            com.facebookpay.expresscheckout.models.ShippingOption r1 = (com.facebookpay.expresscheckout.models.ShippingOption) r1
            java.lang.String r7 = r1.A03
            java.lang.String r6 = r1.A04
            com.facebookpay.common.models.CurrencyAmount r5 = r1.A00
            java.lang.String r4 = r1.A02
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r1 = new com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent
            r1.<init>(r5, r7, r6, r4)
            r0.add(r1)
            goto L_0x011f
        L_0x013c:
            r0 = 0
        L_0x013d:
            r2.A00 = r0
        L_0x013f:
            if (r0 == 0) goto L_0x022a
            java.util.Iterator r4 = r0.iterator()
        L_0x0145:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x022a
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            java.lang.String r1 = r0.A02()
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r3)
            if (r0 == 0) goto L_0x0227
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x0227
            java.lang.String r0 = r0.A00
        L_0x0162:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x017a
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r3)
            if (r0 == 0) goto L_0x0224
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r0.A03
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = r0.A00
        L_0x0174:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0145
        L_0x017a:
            X.56r r0 = r3.A0z
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r0)
            if (r0 == 0) goto L_0x01a4
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x01a4
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L_0x01a4
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r3)
            if (r0 == 0) goto L_0x0221
            java.lang.Integer r1 = r0.A05
        L_0x0192:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x01a4
            com.instagram.service.session.UserSession r6 = X.AnonymousClass7HK.A00()
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36317470363029270(0x81068c00210f16, double:3.030652724070371E-306)
            X.C63803iN.A0E(r4, r6, r0)
        L_0x01a4:
            X.58S r4 = r3.A1M
            X.7Kx r1 = r3.A0S
            r0 = 15
            X.7Kx r6 = X.AnonymousClass7Kx.A06(r1, r2, r0)
            X.7Kx r1 = r3.A0S
            r0 = 16
            X.7Kx r2 = X.AnonymousClass7Kx.A06(r1, r5, r0)
            com.fbpay.logging.LoggingContext r0 = r3.A0v()
            r4.A00 = r0
            boolean r0 = X.AnonymousClass7Kx.A0R(r6)
            if (r0 != 0) goto L_0x01c8
            boolean r0 = X.AnonymousClass7Kx.A0O(r6)
            if (r0 == 0) goto L_0x01d8
        L_0x01c8:
            X.56r r0 = r4.A09
            r0.A0H(r6)
            X.56r r1 = r4.A08
            X.7T0 r0 = X.AnonymousClass7T0.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A03(r0, r2)
            r1.A0H(r0)
        L_0x01d8:
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass58S.A01(r4, r0)
            com.facebookpay.expresscheckout.models.TransactionInfo r1 = X.AnonymousClass7Kx.A00(r3)
            if (r1 == 0) goto L_0x021f
            java.lang.Integer r0 = r1.A04
        L_0x01e7:
            r4.A01 = r0
            if (r1 == 0) goto L_0x01ef
            java.lang.Integer r1 = r1.A05
            if (r1 != 0) goto L_0x01f1
        L_0x01ef:
            java.lang.Integer r1 = X.AnonymousClass006.A00
        L_0x01f1:
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r4.A02 = r1
            if (r20 == 0) goto L_0x0216
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0219
            r1 = 2131826615(0x7f1117b7, float:1.928612E38)
            X.69Q r0 = X.AnonymousClass69Q.A1A
        L_0x0202:
            X.56r r4 = r4.A08
            X.88V r3 = new X.88V
            r3.<init>(r0, r1)
            if (r5 == 0) goto L_0x0217
            java.lang.Integer r2 = X.AnonymousClass006.A00
            r1 = 0
            X.6iy r0 = new X.6iy
            r0.<init>(r2, r5, r1)
        L_0x0213:
            X.AnonymousClass7Kx.A0K(r4, r0, r3)
        L_0x0216:
            return
        L_0x0217:
            r0 = 0
            goto L_0x0213
        L_0x0219:
            r1 = 2131826617(0x7f1117b9, float:1.9286123E38)
            X.69Q r0 = X.AnonymousClass69Q.A0c
            goto L_0x0202
        L_0x021f:
            r0 = 0
            goto L_0x01e7
        L_0x0221:
            r1 = 0
            goto L_0x0192
        L_0x0224:
            r0 = 0
            goto L_0x0174
        L_0x0227:
            r0 = 0
            goto L_0x0162
        L_0x022a:
            r5 = 0
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58M.A0Z(X.58M, boolean):void");
    }

    private final void A0b(C40307LcE lcE, String str, String str2) {
        Map map;
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext A0v2 = A0v();
        AnonymousClass7DP A032 = this.A1O.A03();
        LinkedHashMap A0y2 = C18220wO.A0y();
        C86114wI.A1K(A0v2, str2, A0y2);
        C86134wK.A1O(lcE, A0y2);
        Object obj = A0y2.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
            map = C18220wO.A0y();
        }
        A012.Bb8(str, AnonymousClass7Kr.A04(A032, A0y2, map));
    }

    private final void A0c(String str) {
        Long l;
        C108806iy r0;
        ShippingAddress shippingAddress;
        String str2;
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext A0v2 = A0v();
        AnonymousClass7Kx A0R2 = C86104wH.A0R(this.A1T.A06);
        if (A0R2 == null || (r0 = (C108806iy) A0R2.A01) == null || (shippingAddress = (ShippingAddress) r0.A01) == null || (str2 = shippingAddress.A04) == null) {
            l = null;
        } else {
            l = AnonymousClass0wJ.A0d(str2);
        }
        A002.A0B(A0v2, l, str, AnonymousClass7Kr.A07(this.A1O));
    }

    private final boolean A0d() {
        Set set;
        Set set2;
        ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
        C880856r r4 = this.A0z;
        Object A082 = r4.A08();
        if (A082 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A082).A01;
            if (checkoutConfiguration != null) {
                set = checkoutConfiguration.A0B;
            } else {
                set = AnonymousClass84Y.A00;
            }
            Object A083 = r4.A08();
            if (A083 != null) {
                CheckoutConfiguration checkoutConfiguration2 = ((ECPPaymentRequest) A083).A01;
                if (checkoutConfiguration2 != null) {
                    set2 = checkoutConfiguration2.A0C;
                } else {
                    set2 = AnonymousClass84Y.A00;
                }
                Object A084 = r4.A08();
                if (A084 != null) {
                    return A022.A0A(((ECPPaymentRequest) A084).A08, set, set2);
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final boolean A0i(AnonymousClass58M r2) {
        ECPPaymentRequest A0a2;
        CheckoutConfiguration checkoutConfiguration;
        String str;
        if (!A0m(r2) || (A0a2 = C86124wJ.A0a(r2.A0z)) == null || (checkoutConfiguration = A0a2.A01) == null || (str = checkoutConfiguration.A09) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0j(AnonymousClass58M r3) {
        C40307LcE lcE;
        PaymentMethod paymentMethod;
        Object A072 = A07(r3);
        if (A072 != null) {
            String A092 = A09((ECPPaymentRequest) A072, r3, false);
            if (!C04220Ms.A0I(A092, "PARTIAL_PUX_WITHOUT_CREDENTIAL")) {
                if (!C04220Ms.A0I(A092, "PARTIAL_PUX_WITH_CREDENTIAL")) {
                    return false;
                }
                PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) r3.A0M.A01;
                if (puxPaymentMethodItem == null || (paymentMethod = puxPaymentMethodItem.A01) == null) {
                    lcE = null;
                } else {
                    lcE = paymentMethod.Aam();
                }
                if (lcE != C40307LcE.A05) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0k(AnonymousClass58M r1) {
        if (!AnonymousClass7Kz.A0J().A05()) {
            Object A072 = A07(r1);
            if (A072 == null) {
                throw AnonymousClass0wJ.A0b();
            } else if (((ECPPaymentRequest) A072).A07 != null) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0l(AnonymousClass58M r1) {
        Object A072 = A07(r1);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0C.contains(AnonymousClass68F.REQUEST_BILLING_ADDRESS);
            }
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0m(AnonymousClass58M r1) {
        Object A072 = A07(r1);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0C.contains(AnonymousClass68F.REQUEST_PAYER_EMAIL);
            }
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0n(AnonymousClass58M r1) {
        Object A072 = A07(r1);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0C.contains(AnonymousClass68F.REQUEST_PAYER_NAME);
            }
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0o(AnonymousClass58M r1) {
        Object A072 = A07(r1);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0C.contains(AnonymousClass68F.REQUEST_PAYER_PHONE);
            }
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0p(AnonymousClass58M r1) {
        Object A072 = A07(r1);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0C.contains(AnonymousClass68F.REQUEST_PICKUP_EMAIL);
            }
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0q(AnonymousClass58M r1) {
        Object A072 = A07(r1);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0C.contains(AnonymousClass68F.REQUEST_PICKUP_NAME);
            }
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0r(AnonymousClass58M r1) {
        Object A072 = A07(r1);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0C.contains(AnonymousClass68F.REQUEST_PAYER_PHONE);
            }
            return false;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0s(AnonymousClass58M r3) {
        if (!AnonymousClass7BG.A02(AnonymousClass69P.SHIPPING_ADDRESS, r3.A0w())) {
            return false;
        }
        Object A072 = A07(r3);
        if (A072 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A072).A01;
            if (checkoutConfiguration == null || !checkoutConfiguration.A0B.contains(AnonymousClass68M.UX_SHIPPING_ADDRESS)) {
                return false;
            }
            return true;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static boolean A0t(AnonymousClass58M r0, Object obj) {
        return r0.A0w().contains(obj);
    }
}
