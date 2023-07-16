package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.impls.CardVerificationFieldsImpl;
import com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebook.redex.IDxObserverShape24S1200000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormDisplayEvent;
import com.facebookpay.form.fragment.model.FormLoggingEvents;
import com.facebookpay.form.fragment.model.FormMutationEvent;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.fragment.model.ListCellParams;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.58U  reason: invalid class name */
public final class AnonymousClass58U extends C62793ak implements C146618mX {
    public static final C969667k A0M = C969667k.SELECT;
    public AnonymousClass79R A00;
    public ECPPaymentRequest A01;
    public LoggingContext A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public SparseArray A07;
    public final C880756q A08;
    public final C880756q A09;
    public final C880856r A0A;
    public final C880856r A0B;
    public final C880856r A0C;
    public final C880856r A0D = C880856r.A03();
    public final C880856r A0E;
    public final C143158gC A0F;
    public final AnonymousClass587 A0G;
    public final C128167j4 A0H = AnonymousClass7Kz.A05().A0B;
    public final Map A0I;
    public final Map A0J;
    public final C04530Oa A0K = AnonymousClass0OY.A02(AnonymousClass8HB.A00);
    public final C143158gC A0L;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A02(java.lang.Boolean r16, java.lang.String r17, java.util.List r18, java.util.List r19, java.util.List r20) {
        /*
            r15 = this;
            r6 = 1
            r2 = r17
            r0 = r18
            java.util.List r5 = r15.A03(r2, r0, r6)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            if (r20 == 0) goto L_0x007b
            X.56r r1 = r15.A0A
            com.google.common.collect.ImmutableList r0 = X.AnonymousClass7Fc.A01(r20)
            X.AnonymousClass7Kx.A0I(r1, r0)
            java.util.Iterator r8 = r20.iterator()
        L_0x0020:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r7 = r8.next()
            com.facebook.graphql.impls.PaymentMethodComponentImpl$NewPaymentCredentialOptions r7 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.NewPaymentCredentialOptions) r7
            com.facebook.graphql.impls.NewCreditCardOptionImpl r0 = r7.A00()
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0052
            com.facebook.graphql.impls.NewCreditCardOptionImpl r0 = r7.A00()
            if (r0 == 0) goto L_0x006c
            java.lang.String r14 = X.C86164wN.A0g(r0)
            if (r14 == 0) goto L_0x0067
            r12 = 0
            r0 = 3
        L_0x0042:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.69U r10 = X.AnonymousClass69U.A0g
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r9 = new com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14)
            X.AnonymousClass7Kx.A0N(r9, r3)
            goto L_0x0020
        L_0x0052:
            com.facebook.graphql.impls.NewPaypalBillingAgreementImpl r0 = r7.A01()
            if (r0 == 0) goto L_0x0020
            com.facebook.graphql.impls.NewPaypalBillingAgreementImpl r0 = r7.A01()
            if (r0 == 0) goto L_0x0076
            java.lang.String r14 = X.C86164wN.A0g(r0)
            if (r14 == 0) goto L_0x0071
            r12 = 0
            r0 = 7
            goto L_0x0042
        L_0x0067:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x006c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0071:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0076:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x007b:
            boolean r0 = A0D(r15)
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00b2
            com.facebookpay.form.fragment.model.FormParams r3 = A00(r15, r6)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r15.A01
            java.lang.String r0 = "ecpPaymentRequest"
            if (r2 != 0) goto L_0x0096
            X.C04220Ms.A0E(r0)
            throw r1
        L_0x0096:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r2.A05
            if (r0 == 0) goto L_0x00ad
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x00a2
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x00ad
        L_0x00a2:
            X.69U r1 = X.AnonymousClass69U.A03
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r3, r2)
            X.AnonymousClass7Kx.A0N(r0, r4)
            return r4
        L_0x00ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00b2:
            android.util.SparseArray r0 = X.C86154wM.A0D()
            r15.A07 = r0
            X.587 r8 = r15.A0G
            X.69P r0 = X.AnonymousClass69P.PAYMENT_METHOD
            r7 = 0
            com.facebookpay.otc.models.OtcInput r0 = r8.A02(r0, r6)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r1 = r0.A01
        L_0x00c5:
            int r0 = r5.size()
            if (r0 != r6) goto L_0x00d6
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = "CARD"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d6
            return r4
        L_0x00d6:
            r0 = r19
            java.util.List r2 = r15.A03(r2, r0, r7)
            boolean r0 = r15.A0B()
            if (r0 == 0) goto L_0x00ee
            r0 = 2131826414(0x7f1116ee, float:1.9285712E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.AnonymousClass7Kx.A0M(r1, r0, r4)
        L_0x00ee:
            r0 = r16
            boolean r0 = X.C18190wL.A1Z(r0, r6)
            if (r0 == 0) goto L_0x0101
            r4.addAll(r3)
            r15.A0A(r4, r5, r2)
        L_0x00fc:
            java.util.List r0 = X.AnonymousClass00J.A0N(r4)
            return r0
        L_0x0101:
            r15.A0A(r4, r5, r2)
            r4.addAll(r3)
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.A02(java.lang.Boolean, java.lang.String, java.util.List, java.util.List, java.util.List):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A03(java.lang.String r13, java.util.List r14, boolean r15) {
        /*
            r12 = this;
            r3 = 0
            if (r14 == 0) goto L_0x002b
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x000b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.next()
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r0 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.Aal()
        L_0x0021:
            r2.add(r0)
            goto L_0x000b
        L_0x0025:
            r0 = r3
            goto L_0x0021
        L_0x0027:
            java.util.Set r3 = X.AnonymousClass00J.A0c(r2)
        L_0x002b:
            java.util.Map r4 = r12.A0J
            java.util.Iterator r2 = X.C86154wM.A0s(r4)
        L_0x0031:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r2.next()
            if (r3 == 0) goto L_0x0031
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0031
            r4.remove(r1)
            goto L_0x0031
        L_0x0047:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            if (r14 == 0) goto L_0x015e
            java.util.Iterator r11 = r14.iterator()
        L_0x0051:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r7 = r11.next()
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            java.lang.Object r6 = X.AnonymousClass7Kx.A0D(r7)
            com.facebookpay.paymentmethod.model.PaymentMethod r6 = (com.facebookpay.paymentmethod.model.PaymentMethod) r6
            java.lang.Integer r5 = r12.A0F(r6)
            if (r6 == 0) goto L_0x0159
            boolean r0 = r12.A0B()
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r2 = X.AnonymousClass7Fc.A00(r6, r5, r0)
            r2.A06 = r15
            A06(r2, r12)
            boolean r9 = r6 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r9 == 0) goto L_0x00be
            r8 = r6
            com.facebookpay.paymentmethod.model.CreditCard r8 = (com.facebookpay.paymentmethod.model.CreditCard) r8
            if (r8 == 0) goto L_0x00be
            java.lang.String r0 = r8.Aal()
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x00be
            com.facebook.graphql.impls.CardVerificationFieldsImpl r10 = r8.A01
            if (r10 == 0) goto L_0x00be
            X.67M r1 = X.AnonymousClass67M.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r1 = r10.getEnumList(r0, r1)
            if (r1 == 0) goto L_0x00be
            X.67M r0 = X.AnonymousClass67M.ADDRESS
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00be
            X.8rA r10 = r8.A00
            X.56r r0 = r12.A0B
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0154
            java.lang.Object r1 = r0.A01
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r1 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r1
            if (r1 == 0) goto L_0x0154
            java.lang.String r0 = r8.A03
            boolean r0 = X.AnonymousClass6IZ.A00(r1, r10, r0)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = r8.Aal()
            r4.remove(r0)
        L_0x00be:
            r0 = 26
            X.7Kx r0 = X.AnonymousClass7Kx.A06(r7, r2, r0)
            r3.add(r0)
            r1 = 0
            if (r9 == 0) goto L_0x0151
            r0 = r6
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
        L_0x00cd:
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L_0x00e4
            com.facebook.graphql.impls.CardVerificationFieldsImpl r2 = r0.A01
            if (r2 == 0) goto L_0x00e4
            java.lang.String r0 = "error_msg"
            java.lang.String r0 = r2.getStringValue(r0)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = X.AnonymousClass8bQ.A0m(r0)
            if (r0 != r7) goto L_0x00e4
            r8 = 1
        L_0x00e4:
            if (r9 == 0) goto L_0x014f
            r0 = r6
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
        L_0x00e9:
            boolean r0 = A0C(r0, r12, r5)
            if (r0 != 0) goto L_0x014d
            if (r5 == 0) goto L_0x00f7
            int r0 = r5.intValue()
            if (r0 != 0) goto L_0x00f9
        L_0x00f7:
            if (r8 == 0) goto L_0x014d
        L_0x00f9:
            X.88h r7 = new X.88h
            r7.<init>(r5, r1, r1)
        L_0x00fe:
            java.util.Map r2 = r12.A0I
            java.lang.String r0 = r6.Aal()
            r2.put(r0, r7)
            X.56q r5 = r12.A08
            X.7Kx r0 = X.C86104wH.A0R(r5)
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto L_0x014b
            java.lang.String r2 = r0.Aal()
        L_0x011f:
            java.lang.String r0 = r6.Aal()
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0051
            X.7Kx r0 = X.C86104wH.A0R(r5)
            if (r7 == 0) goto L_0x013c
            if (r0 == 0) goto L_0x0133
            java.lang.Object r1 = r0.A01
        L_0x0133:
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r1, r7)
        L_0x0137:
            r5.A0H(r0)
            goto L_0x0051
        L_0x013c:
            if (r0 == 0) goto L_0x0146
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0146
            java.lang.Integer r1 = r0.A00
        L_0x0146:
            X.7Kx r0 = X.AnonymousClass7Kx.A08(r1, r6, r13)
            goto L_0x0137
        L_0x014b:
            r2 = r1
            goto L_0x011f
        L_0x014d:
            r7 = r1
            goto L_0x00fe
        L_0x014f:
            r0 = r1
            goto L_0x00e9
        L_0x0151:
            r0 = r1
            goto L_0x00cd
        L_0x0154:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0159:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x015e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.A03(java.lang.String, java.util.List, boolean):java.util.List");
    }

    public static final void A09(AnonymousClass58U r12, AnonymousClass7Kx r13) {
        Object A082;
        List list;
        List list2;
        List list3;
        String str;
        Boolean bool;
        List list4;
        List list5;
        List list6;
        String str2;
        Boolean bool2;
        Object obj;
        String str3;
        String str4;
        AnonymousClass58U r8 = r12;
        C880856r r5 = r12.A0D;
        AnonymousClass7Kx.A0E(AnonymousClass7TN.A00, r5, r13);
        C880856r r3 = r12.A0E;
        Object obj2 = null;
        if (AnonymousClass7Kx.A0R(r13)) {
            r12.A0B.A0H(AnonymousClass7Kx.A03(AnonymousClass7TO.A00, r13));
            C880756q r4 = r12.A09;
            AnonymousClass7Kx A0R = C86104wH.A0R(r5);
            if (A0R != null) {
                list4 = (List) A0R.A01;
            } else {
                list4 = null;
            }
            Object obj3 = r13.A01;
            C1203179r r52 = (C1203179r) obj3;
            if (r52 != null) {
                list5 = r52.A04;
                list6 = r52.A03;
                str2 = r52.A06;
                bool2 = Boolean.valueOf(r52.A08);
            } else {
                list5 = null;
                list6 = null;
                str2 = null;
                bool2 = null;
            }
            AnonymousClass7Kx.A0I(r4, r8.A02(bool2, str2, list4, list5, list6));
            obj3.getClass();
            Iterator it = r52.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Object obj4 = ((AnonymousClass7Kx) obj).A01;
                if (obj4 != null) {
                    PaymentMethod paymentMethod = (PaymentMethod) obj4;
                    if (paymentMethod != null) {
                        str3 = paymentMethod.Aal();
                    } else {
                        str3 = null;
                    }
                    if (C04220Ms.A0I(str3, r52.A05)) {
                        break;
                    }
                    if (paymentMethod != null) {
                        str4 = paymentMethod.Aal();
                    } else {
                        str4 = null;
                    }
                    if (C04220Ms.A0I(str4, r8.A03)) {
                        break;
                    }
                }
            }
            AnonymousClass7Kx r6 = (AnonymousClass7Kx) obj;
            if (r6 != null) {
                r8.A03 = null;
                C128167j4 r42 = r8.A0H;
                String str5 = r8.A04;
                if (str5 == null) {
                    C04220Ms.A0E("productId");
                    throw null;
                }
                r42.A09(AnonymousClass79R.A00(AnonymousClass69P.PAYMENT_METHOD, r8.A0G, str5));
                A082 = AnonymousClass7Kx.A08(AnonymousClass006.A00, AnonymousClass7Kx.A0D(r6), r52.A06);
            }
            A082 = r3.A08();
        } else if (AnonymousClass7Kx.A0O(r13)) {
            C880756q r43 = r12.A09;
            Throwable th = r13.A02;
            AnonymousClass7Kx A0R2 = C86104wH.A0R(r5);
            if (A0R2 != null) {
                list = (List) A0R2.A01;
            } else {
                list = null;
            }
            C1203179r r0 = (C1203179r) r13.A01;
            if (r0 != null) {
                list2 = r0.A04;
                list3 = r0.A03;
                str = r0.A06;
                bool = Boolean.valueOf(r0.A08);
            } else {
                list2 = null;
                list3 = null;
                str = null;
                bool = null;
            }
            AnonymousClass7Kx.A0K(r43, r8.A02(bool, str, list, list2, list3), th);
            AnonymousClass7Kx A0R3 = C86104wH.A0R(r3);
            if (A0R3 != null) {
                obj2 = A0R3.A01;
            }
            A082 = AnonymousClass7Kx.A0B(obj2, th);
        } else {
            AnonymousClass7Kx.A0J(r12.A09, (Object) null);
            A082 = r3.A08();
        }
        r3.A0H(A082);
    }

    public final boolean A0I(CreditCard creditCard) {
        FBPayAddressFormConfigFragmentImpl fBPayAddressFormConfigFragmentImpl;
        if (creditCard == null || this.A0J.containsKey(creditCard.Aal()) || !this.A05) {
            return false;
        }
        C148488rA r2 = creditCard.A00;
        AnonymousClass7Kx A0R = C86104wH.A0R(this.A0B);
        if (A0R != null && (fBPayAddressFormConfigFragmentImpl = (FBPayAddressFormConfigFragmentImpl) A0R.A01) != null) {
            return !AnonymousClass6IZ.A00(fBPayAddressFormConfigFragmentImpl, r2, creditCard.A03);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void BrQ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r43) {
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        FormParams formParams;
        String str;
        Fragment fragment2 = fragment;
        AnonymousClass7Kx r0 = r43;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, fragment2);
        Bundle bundle2 = bundle;
        C04220Ms.A0B(bundle2, 3);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) r0.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionActionViewItem) {
                Integer num = ((SelectionActionViewItem) baseCheckoutItem).A02;
                if (num == null) {
                    return;
                }
                if (num.intValue() == 3) {
                    A07(C40307LcE.A01, "add_card");
                } else if (num.intValue() == 7) {
                    A07(C40307LcE.A06, "add_paypal");
                    String string = bundle2.getString("ECP_CONTENT_FRAGMENT_REQUEST_KEY");
                    if (string != null) {
                        GQLCallInputCInputShape1S0000000 A0L2 = C86154wM.A0L();
                        A0L2.A0C("is_p2p_receiver", false);
                        LoggingContext loggingContext = this.A02;
                        if (loggingContext == null) {
                            C86124wJ.A19();
                            throw null;
                        }
                        A0L2.A0D(loggingContext.A02, "logging_id");
                        A0L2.A0D(C86124wJ.A0y(AnonymousClass73F.A00), "login_ref_id");
                        A0L2.A0D("ECP", "payment_type");
                        ECPPaymentRequest eCPPaymentRequest = this.A01;
                        if (eCPPaymentRequest == null) {
                            C04220Ms.A0E("ecpPaymentRequest");
                            throw null;
                        }
                        PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
                        if (paymentReceiverInfo != null) {
                            str = paymentReceiverInfo.A02;
                        } else {
                            str = null;
                        }
                        A0L2.A0D(str, "receiver_id");
                        ECPPaymentRequest eCPPaymentRequest2 = this.A01;
                        if (eCPPaymentRequest2 == null) {
                            C04220Ms.A0E("ecpPaymentRequest");
                            throw null;
                        }
                        A0L2.A0D(eCPPaymentRequest2.A08, "product_id");
                        Object obj = AnonymousClass7Kz.A05().A0H.get();
                        C04220Ms.A06(obj);
                        AnonymousClass7Kx.A0G(fragment2, ((C111496nm) obj).A00(A0L2), new IDxObserverShape24S1200000_2_I2(this, fragment2, string, A1Z));
                        return;
                    }
                    throw C18180wK.A0a("Required value was null.");
                } else {
                    return;
                }
            } else {
                if (baseCheckoutItem instanceof SelectionPaymentMethodItem) {
                    selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem;
                    Integer num2 = selectionPaymentMethodItem.A0A;
                    if (num2 != null) {
                        if (num2.intValue() != 3) {
                            if (num2.intValue() == 7) {
                                String str2 = selectionPaymentMethodItem.A05;
                                String str3 = selectionPaymentMethodItem.A04;
                                String str4 = selectionPaymentMethodItem.A0C;
                                String str5 = selectionPaymentMethodItem.A0E;
                                List A0n = C18180wK.A0n(new FormDisplayEvent("client_load_credential_success", "edit_paypal", (String) null));
                                FormClickEvent formClickEvent = new FormClickEvent("user_remove_credential_enter", "remove_paypal");
                                FormLoggingEvents formLoggingEvents = new FormLoggingEvents(formClickEvent, new FormClickEvent("user_remove_credential_submit", AnonymousClass000.A00(448)), new FormClickEvent("user_remove_credential_cancel", "remove_paypal_cancel"), new FormMutationEvent("client_remove_credential_success", "edit_paypal"), new FormMutationEvent("client_remove_credential_fail", "edit_paypal"), A0n, (List) null, (List) null, (List) null);
                                LabelCellParams A022 = AnonymousClass7BI.A02(2131826395, 0, 0, 0);
                                ArrayList A0v = AnonymousClass0wJ.A0v();
                                formParams = new FormParams(A022, (FeatureConfiguration) null, formLoggingEvents, new ListCellParams(str2, str3, str4), AnonymousClass697.PRIMARY_LOCK_FILLED_HEADER, (AnonymousClass69W) null, (Integer) null, 2131826537, (Integer) null, (Integer) null, str5, A0v, (List) null, (AnonymousClass0YY) null, 7, 2131826538, 2131826503, 2131826502, 2131826495, 2131826488, 0, false);
                                C04220Ms.A0B(formParams, A1Z ? 1 : 0);
                                bundle2.putParcelable("ECP_FORM_FRAGMENT_PARAMS", formParams);
                                AnonymousClass7H3.A01(bundle2, fragment2, "content_form_fragment", A1Z, false);
                            }
                        }
                    }
                    throw C18240wQ.A0j();
                } else if (baseCheckoutItem instanceof PuxPaymentMethodItem) {
                    PaymentMethod paymentMethod = ((PuxPaymentMethodItem) baseCheckoutItem).A01;
                    if (paymentMethod != null) {
                        selectionPaymentMethodItem = AnonymousClass7Fc.A00(paymentMethod, (Integer) null, false);
                    }
                } else {
                    return;
                }
                A04(bundle2, fragment2, selectionPaymentMethodItem);
                return;
            }
            formParams = A00(this, false);
            C04220Ms.A0B(formParams, A1Z ? 1 : 0);
            bundle2.putParcelable("ECP_FORM_FRAGMENT_PARAMS", formParams);
            AnonymousClass7H3.A01(bundle2, fragment2, "content_form_fragment", A1Z, false);
        }
    }

    public static final String A01(AnonymousClass58U r5) {
        C1203179r r0;
        C108806iy r02;
        String str;
        C108806iy r03;
        C880856r r1 = r5.A0E;
        AnonymousClass7Kx A0R = C86104wH.A0R(r1);
        if (A0R == null || (r02 = (C108806iy) A0R.A01) == null || (str = r02.A02) == null || AnonymousClass8bQ.A0n(str)) {
            C128167j4 r4 = r5.A0H;
            String str2 = r5.A04;
            if (str2 == null) {
                C04220Ms.A0E("productId");
                throw null;
            }
            AnonymousClass7Kx A0R2 = C86104wH.A0R(AnonymousClass7IT.A00(r4.A01, AnonymousClass79R.A00(AnonymousClass69P.PAYMENT_METHOD, r5.A0G, str2)));
            if (A0R2 == null || (r0 = (C1203179r) A0R2.A01) == null) {
                return null;
            }
            return r0.A06;
        }
        AnonymousClass7Kx A0R3 = C86104wH.A0R(r1);
        if (A0R3 == null || (r03 = (C108806iy) A0R3.A01) == null) {
            return null;
        }
        return r03.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        if (r2.A0G.A07() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(android.os.Bundle r46, androidx.fragment.app.Fragment r47, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r48) {
        /*
            r45 = this;
            r0 = r48
            X.8rA r3 = r0.A07
            if (r3 == 0) goto L_0x00d9
            com.facebook.graphql.impls.CardVerificationFieldsImpl r1 = r0.A00
            r4 = 1
            r2 = r45
            if (r1 == 0) goto L_0x0084
            java.lang.String r5 = "error_msg"
            java.lang.String r5 = r1.getStringValue(r5)
            if (r5 == 0) goto L_0x0084
            boolean r5 = X.AnonymousClass8bQ.A0m(r5)
            if (r5 != r4) goto L_0x0084
        L_0x001b:
            r40 = 0
        L_0x001d:
            r32 = 2131826526(0x7f11175e, float:1.9285939E38)
            r33 = 2131826540(0x7f11176c, float:1.9285967E38)
            r5 = 2131826535(0x7f111767, float:1.9285957E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r10 = 0
            java.lang.String r9 = r0.A0H
            java.lang.String r8 = r0.A0D
            java.lang.String r7 = r0.A0B
            java.lang.String r22 = r3.BEK()
            java.lang.String r23 = r3.BEL()
            java.lang.String r24 = r3.APZ()
            java.lang.String r25 = r3.APe()
            java.lang.String r26 = r3.BMp()
            java.lang.String r27 = r3.AaB()
            java.lang.String r6 = r0.A0E
            X.69W r13 = r0.A09
            X.56r r3 = r2.A0B
            X.7Kx r3 = X.C86104wH.A0R(r3)
            java.lang.Object r3 = X.AnonymousClass7Kx.A0D(r3)
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r3 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r3
            com.facebookpay.form.model.AddressFormFieldsConfig r11 = X.AnonymousClass7BH.A00(r3)
            if (r1 == 0) goto L_0x0080
            X.67M r5 = X.AnonymousClass67M.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "fields_to_verify"
            com.google.common.collect.ImmutableList r15 = r1.getEnumList(r3, r5)
            java.lang.String r3 = "error_msg"
            java.lang.String r30 = r1.getStringValue(r3)
        L_0x006d:
            boolean r5 = r2.A06
            X.587 r3 = r2.A0G
            boolean r38 = r3.A07()
            r39 = r40 ^ 1
            r3 = 0
            com.fbpay.logging.LoggingContext r12 = r2.A02
            if (r12 != 0) goto L_0x008f
            X.C86124wJ.A19()
            throw r10
        L_0x0080:
            r15 = r10
            r30 = r10
            goto L_0x006d
        L_0x0084:
            X.587 r5 = r2.A0G
            boolean r5 = r5.A07()
            r40 = 1
            if (r5 == 0) goto L_0x001d
            goto L_0x001b
        L_0x008f:
            boolean r42 = r2.A0B()
            r35 = -704610232(0xffffffffd6008048, float:-3.5322113E13)
            r14 = r10
            r17 = r10
            r20 = r10
            r28 = r6
            r29 = r10
            r31 = r10
            r34 = r3
            r36 = r4
            r37 = r5
            r41 = r3
            r43 = r3
            r44 = r3
            r19 = r8
            r21 = r7
            r18 = r9
            com.facebookpay.form.fragment.model.FormParams r5 = X.C128197j8.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            long r9 = java.lang.Long.parseLong(r6)
            X.LcE r0 = r0.A08
            boolean r11 = r2.A0B()
            r6 = r2
            r7 = r1
            r8 = r0
            r6.A05(r7, r8, r9, r11)
            X.C04220Ms.A0B(r5, r4)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r2 = r46
            r2.putParcelable(r0, r5)
            java.lang.String r0 = "content_form_fragment"
            r1 = r47
            X.AnonymousClass7H3.A01(r2, r1, r0, r4, r3)
            return
        L_0x00d9:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.A04(android.os.Bundle, androidx.fragment.app.Fragment, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(com.facebook.graphql.impls.CardVerificationFieldsImpl r11, X.C40307LcE r12, long r13, boolean r15) {
        /*
            r10 = this;
            X.56r r0 = r10.A0C
            java.lang.Object r3 = r0.A08()
            X.67k r1 = X.C969667k.EDIT
            r0 = 0
            java.lang.String r4 = "user_edit_credential_enter"
            java.lang.String r2 = "edit_card"
            if (r3 == r1) goto L_0x0022
            if (r15 != 0) goto L_0x0022
            java.lang.String r4 = "user_click_credential_atomic"
            java.lang.String r2 = "select_existing_credential "
        L_0x0015:
            r7 = r0
        L_0x0016:
            X.7ke r5 = X.AnonymousClass7JJ.A01()
            com.fbpay.logging.LoggingContext r9 = r10.A02
            if (r9 != 0) goto L_0x0038
            X.C86124wJ.A19()
            throw r0
        L_0x0022:
            r5 = 1
            if (r11 == 0) goto L_0x0015
            X.67M r3 = X.AnonymousClass67M.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "fields_to_verify"
            com.google.common.collect.ImmutableList r1 = r11.getEnumList(r1, r3)
            if (r1 == 0) goto L_0x0015
            boolean r1 = X.C18250wR.A1K(r1)
            if (r1 != r5) goto L_0x0015
            java.lang.String r7 = "need_verification"
            goto L_0x0016
        L_0x0038:
            X.587 r1 = r10.A0G
            X.7DP r8 = r1.A03()
            if (r11 == 0) goto L_0x0048
            X.67M r1 = X.AnonymousClass67M.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r0 = r11.getEnumList(r0, r1)
        L_0x0048:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            X.C86164wN.A1K(r9, r3)
            java.lang.String r0 = "TARGET_NAME"
            r3.put(r0, r2)
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "component_data_id"
            r3.put(r0, r1)
        L_0x0063:
            java.lang.String r0 = "CREDENTIAL_TYPE"
            r3.put(r0, r12)
            java.lang.String r2 = "extra_data"
            java.lang.Object r1 = r3.get(r2)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x007e
            boolean r0 = r1 instanceof X.C03740Kn
            if (r0 == 0) goto L_0x007a
            boolean r0 = r1 instanceof X.AnonymousClass0WC
            if (r0 == 0) goto L_0x007e
        L_0x007a:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0082
        L_0x007e:
            java.util.LinkedHashMap r1 = X.C18220wO.A0y()
        L_0x0082:
            X.AnonymousClass7Kr.A0B(r8, r1)
            r3.put(r2, r1)
            if (r7 == 0) goto L_0x008f
            java.lang.String r0 = "selected_credential_state"
            X.AnonymousClass7Kr.A0D(r7, r0, r3)
        L_0x008f:
            if (r6 == 0) goto L_0x0096
            java.lang.String r0 = "fields_to_verify"
            X.AnonymousClass7Kr.A0D(r6, r0, r3)
        L_0x0096:
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r3)
            X.C04220Ms.A06(r0)
            r5.Bb8(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.A05(com.facebook.graphql.impls.CardVerificationFieldsImpl, X.LcE, long, boolean):void");
    }

    public static final void A06(SelectionPaymentMethodItem selectionPaymentMethodItem, AnonymousClass58U r3) {
        String str;
        C108806iy r0;
        PaymentMethod paymentMethod;
        C969667k r02 = (C969667k) r3.A0C.A08();
        if (r02 == null) {
            return;
        }
        if (r02.ordinal() == 1) {
            selectionPaymentMethodItem.Cpe(AnonymousClass006.A01);
            return;
        }
        AnonymousClass7Kx A0R = C86104wH.A0R(r3.A08);
        if (A0R == null || (r0 = (C108806iy) A0R.A01) == null || (paymentMethod = (PaymentMethod) r0.A01) == null) {
            str = null;
        } else {
            str = paymentMethod.Aal();
        }
        AnonymousClass6I2.A00(selectionPaymentMethodItem, str);
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest == null) {
            C04220Ms.A0E("ecpPaymentRequest");
            throw null;
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return C18190wL.A1Z(checkoutConfiguration.A05, true);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2.contains(X.AnonymousClass67M.A01) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r2.contains(X.AnonymousClass67M.A03) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2.contains(X.AnonymousClass67M.A01) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0C(com.facebookpay.paymentmethod.model.CreditCard r4, X.AnonymousClass58U r5, java.lang.Integer r6) {
        /*
            if (r4 == 0) goto L_0x0051
            com.facebook.graphql.impls.CardVerificationFieldsImpl r2 = r4.A01
            if (r2 == 0) goto L_0x0051
            X.67M r1 = X.AnonymousClass67M.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r2 = r2.getEnumList(r0, r1)
        L_0x000e:
            r3 = 0
            if (r2 == 0) goto L_0x0045
            int r1 = r2.size()
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r0) goto L_0x0048
            r0 = 2
            if (r1 != r0) goto L_0x0046
            X.67M r0 = X.AnonymousClass67M.ADDRESS
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0046
        L_0x0025:
            X.67M r0 = X.AnonymousClass67M.ZIP
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0046
        L_0x002d:
            r2 = 1
        L_0x002e:
            java.util.Map r1 = r5.A0J
            java.lang.String r0 = r4.Aal()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0045
            if (r2 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0044
            int r0 = r6.intValue()
            if (r0 != 0) goto L_0x0045
        L_0x0044:
            r3 = 1
        L_0x0045:
            return r3
        L_0x0046:
            r2 = 0
            goto L_0x002e
        L_0x0048:
            X.67M r0 = X.AnonymousClass67M.ADDRESS
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x0025
        L_0x0051:
            r2 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.A0C(com.facebookpay.paymentmethod.model.CreditCard, X.58U, java.lang.Integer):boolean");
    }

    public static final boolean A0D(AnonymousClass58U r1) {
        ECPPaymentRequest eCPPaymentRequest = r1.A01;
        if (eCPPaymentRequest == null) {
            C04220Ms.A0E("ecpPaymentRequest");
            throw null;
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return C18190wL.A1Z(checkoutConfiguration.A06, true);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.facebookpay.paymentmethod.model.CreditCard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.facebookpay.paymentmethod.model.CreditCard} */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7Kx A0E() {
        /*
            r10 = this;
            X.56q r0 = r10.A09
            X.7Kx r0 = X.C86104wH.A0R(r0)
            r9 = 1
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0104
            boolean r2 = r0.isEmpty()
        L_0x0013:
            X.56q r3 = r10.A08
            X.7Kx r1 = X.C86104wH.A0R(r3)
            X.7SD r0 = new X.7SD
            r0.<init>(r2)
            X.7Kx r5 = X.AnonymousClass7Kx.A02(r0, r1)
            X.7Kx r0 = X.C86104wH.A0R(r3)
            boolean r0 = X.AnonymousClass7Kx.A0P(r0)
            if (r0 != 0) goto L_0x0074
            X.7Kx r0 = X.C86104wH.A0R(r3)
            r2 = 0
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r0.A01
        L_0x003b:
            r4 = 3
            if (r0 != 0) goto L_0x0078
            X.7Kx r0 = X.C86104wH.A0R(r3)
            if (r0 == 0) goto L_0x0046
            java.lang.Throwable r2 = r0.A02
        L_0x0046:
            boolean r0 = r2 instanceof X.AnonymousClass88I
            if (r0 != 0) goto L_0x0074
            boolean r0 = A0D(r10)
            r1 = 2131826418(0x7f1116f2, float:1.928572E38)
            if (r0 == 0) goto L_0x0056
            r1 = 2131826431(0x7f1116ff, float:1.9285746E38)
        L_0x0056:
            boolean r0 = A0D(r10)
            if (r0 == 0) goto L_0x0075
            X.69Q r0 = X.AnonymousClass69Q.A1A
        L_0x005e:
            X.88V r2 = new X.88V
            r2.<init>(r0, r1)
            r6 = 0
        L_0x0064:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            X.69U r5 = X.AnonymousClass69U.A0a
            r8 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r4 = new com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            r4.<init>(r5, r6, r7, r8, r9)
            X.7Kx r5 = X.AnonymousClass7Kx.A0B(r4, r2)
        L_0x0074:
            return r5
        L_0x0075:
            X.69Q r0 = X.AnonymousClass69Q.A0T
            goto L_0x005e
        L_0x0078:
            X.7Kx r0 = X.C86104wH.A0R(r3)
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0107
            java.lang.Object r6 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r6 = (com.facebookpay.paymentmethod.model.PaymentMethod) r6
            if (r6 == 0) goto L_0x0107
            java.lang.Integer r3 = r10.A0F(r6)
            boolean r1 = r6 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r1 == 0) goto L_0x0095
            r2 = r6
            com.facebookpay.paymentmethod.model.CreditCard r2 = (com.facebookpay.paymentmethod.model.CreditCard) r2
        L_0x0095:
            boolean r0 = A0C(r2, r10, r3)
            if (r0 == 0) goto L_0x00a9
            r7 = 0
            X.69U r5 = X.AnonymousClass69U.A0a
            r8 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r4 = new com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem
            r4.<init>(r5, r6, r7, r8, r9)
            X.7Kx r5 = X.AnonymousClass7Kx.A0A(r4)
            return r5
        L_0x00a9:
            if (r1 == 0) goto L_0x00ce
            r0 = r6
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            com.facebook.graphql.impls.CardVerificationFieldsImpl r1 = r0.A01
            if (r1 == 0) goto L_0x00ce
            java.lang.String r0 = "error_msg"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x00ce
            boolean r0 = X.AnonymousClass8bQ.A0m(r0)
            if (r0 != r9) goto L_0x00ce
            r0 = 2131826450(0x7f111712, float:1.9285785E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            X.88h r2 = new X.88h
            r2.<init>(r1, r0, r0)
            goto L_0x0064
        L_0x00ce:
            if (r3 == 0) goto L_0x0074
            int r0 = r3.intValue()
            if (r0 == 0) goto L_0x0074
            X.56r r0 = r10.A0D
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00f2
            int r0 = r0.size()
            if (r0 != r9) goto L_0x00f2
            r0 = 0
            X.88h r2 = new X.88h
            r2.<init>(r3, r0, r0)
            goto L_0x0064
        L_0x00f2:
            r0 = 2131826450(0x7f111712, float:1.9285785E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            X.88h r2 = new X.88h
            r2.<init>(r1, r0, r0)
            goto L_0x0064
        L_0x0101:
            r0 = r2
            goto L_0x003b
        L_0x0104:
            r2 = 1
            goto L_0x0013
        L_0x0107:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.A0E():X.7Kx");
    }

    public final Integer A0F(PaymentMethod paymentMethod) {
        int i;
        if (!(paymentMethod instanceof CreditCard)) {
            return null;
        }
        if ((paymentMethod instanceof TokenizedCard) && C86104wH.A0a(((TokenizedCard) paymentMethod).A01, AnonymousClass67K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "token_status") == AnonymousClass67K.SUSPENDED) {
            i = 2131826544;
        } else if (!A0I((CreditCard) paymentMethod)) {
            return null;
        } else {
            i = 2131826543;
        }
        return Integer.valueOf(i);
    }

    public final void A0G() {
        Iterable<AnonymousClass7Kx> iterable;
        C880756q r4 = this.A09;
        AnonymousClass7Kx A0R = C86104wH.A0R(r4);
        if (A0R != null && (iterable = (Iterable) A0R.A01) != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
            for (AnonymousClass7Kx A072 : iterable) {
                A0w.add(AnonymousClass7Kx.A07(A072, this, 28));
            }
            Object A082 = r4.A08();
            if (A082 != null) {
                r4.A0H(AnonymousClass7Kx.A06((AnonymousClass7Kx) A082, A0w, 27));
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    public final boolean A0H() {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        C108806iy r0;
        Map map = this.A0J;
        AnonymousClass7Kx A0R = C86104wH.A0R(this.A08);
        String str = null;
        if (A0R == null || (r0 = (C108806iy) A0R.A01) == null) {
            paymentMethod = null;
        } else {
            paymentMethod = (PaymentMethod) r0.A01;
        }
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            str = creditCard.Aal();
        }
        return AnonymousClass0wJ.A1W(map.get(str));
    }

    public final void ACT(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r21) {
        String str;
        C1373688h r0;
        Object obj;
        C108806iy r02;
        PaymentMethod paymentMethod;
        AnonymousClass7Kx A0R;
        Iterable iterable;
        Object obj2;
        String str2;
        Iterable iterable2;
        Object obj3;
        C108806iy r03;
        PaymentMethod paymentMethod2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        C18180wK.A1P(fragment2, 1, bundle2);
        Object obj4 = r21.A01;
        C04220Ms.A0C(obj4, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
        SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) obj4;
        String str3 = selectionPaymentMethodItem.A0E;
        A05((CardVerificationFieldsImpl) null, selectionPaymentMethodItem.A08, Long.parseLong(str3), false);
        C880856r r7 = this.A0E;
        AnonymousClass7Kx A0R2 = C86104wH.A0R(r7);
        if (A0R2 == null || (r03 = (C108806iy) A0R2.A01) == null || (paymentMethod2 = (PaymentMethod) r03.A01) == null) {
            str = null;
        } else {
            str = paymentMethod2.Aal();
        }
        if (C04220Ms.A0I(str3, str)) {
            obj = this.A0I.get(str3);
        } else {
            AnonymousClass7Kx A0B2 = AnonymousClass7Kx.A0B((Object) null, C18210wN.A0W("Selected item not in the list"));
            BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) obj4;
            if (!(baseCheckoutItem == null || !(baseCheckoutItem instanceof BaseSelectionCheckoutItem) || (A0R = C86104wH.A0R(this.A0D)) == null || (iterable = (Iterable) A0R.A01) == null)) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    PaymentMethod paymentMethod3 = (PaymentMethod) ((AnonymousClass7Kx) obj2).A01;
                    if (paymentMethod3 != null) {
                        str2 = paymentMethod3.Aal();
                    } else {
                        str2 = null;
                    }
                    if (C04220Ms.A0I(str2, ((BaseSelectionCheckoutItem) baseCheckoutItem).getId())) {
                        break;
                    }
                }
                AnonymousClass7Kx r9 = (AnonymousClass7Kx) obj2;
                if (r9 != null) {
                    A0B2 = AnonymousClass7Kx.A08(AnonymousClass006.A01, AnonymousClass7Kx.A0D(r9), A01(this));
                }
            }
            r7.A0H(A0B2);
            AnonymousClass7Kx A0R3 = C86104wH.A0R(r7);
            if (A0R3 == null || (r02 = (C108806iy) A0R3.A01) == null || (paymentMethod = (PaymentMethod) r02.A01) == null) {
                str3 = null;
            } else {
                str3 = paymentMethod.Aal();
            }
            if (AnonymousClass7Kx.A0R(C86104wH.A0R(r7)) && (r0 = (C1373688h) this.A0I.get(str3)) != null) {
                obj = r0.A01;
            }
            ((C147048nI) fragment2).Brt();
        }
        if (obj != null) {
            AnonymousClass7Kx A0R4 = C86104wH.A0R(this.A09);
            if (A0R4 != null && (iterable2 = (Iterable) A0R4.A01) != null) {
                Iterator it2 = iterable2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    Object obj5 = ((AnonymousClass7Kx) obj3).A01;
                    if (obj5 instanceof SelectionPaymentMethodItem) {
                        C04220Ms.A0C(obj5, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
                        if (C04220Ms.A0I(((SelectionPaymentMethodItem) obj5).A0E, str3)) {
                            break;
                        }
                    }
                }
                AnonymousClass7Kx r6 = (AnonymousClass7Kx) obj3;
                if (r6 != null) {
                    Object obj6 = r6.A01;
                    C04220Ms.A0C(obj6, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
                    A04(bundle2, fragment2, (SelectionPaymentMethodItem) obj6);
                    return;
                }
                return;
            }
            return;
        }
        ((C147048nI) fragment2).Brt();
    }

    public final void AJJ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r5) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) r5.A01;
        if (baseCheckoutItem != null) {
            A04(bundle, fragment, (SelectionPaymentMethodItem) baseCheckoutItem);
        }
    }

    public final M5J Abc() {
        return this.A0C;
    }

    public final void CeZ() {
        C880856r r2 = this.A0C;
        if (r2.A08() != C969667k.NONE) {
            r2.A0H(A0M);
            A0G();
        }
    }

    public final M5J Cgs() {
        return this.A09;
    }

    public final /* synthetic */ boolean Cs9() {
        return true;
    }

    public final void Cwt() {
        C880856r r3 = this.A0C;
        C969667k r2 = (C969667k) r3.A08();
        if (r2 != null) {
            int ordinal = r2.ordinal();
            if (ordinal == 1) {
                r2 = C969667k.SELECT;
            } else if (ordinal == 2) {
                r2 = C969667k.EDIT;
            }
            r3.A0H(r2);
        }
        A0G();
    }

    public final void D9D(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A07 = sparseArray;
        }
    }

    public AnonymousClass58U(AnonymousClass587 r6) {
        this.A0G = r6;
        C880856r A032 = C880856r.A03();
        this.A0E = A032;
        C880756q A012 = C880756q.A01();
        this.A09 = A012;
        this.A0B = C880856r.A03();
        this.A0A = C880856r.A03();
        this.A0I = C18220wO.A0y();
        C880756q A013 = C880756q.A01();
        AnonymousClass7Kx.A0J(A013, (Object) null);
        this.A08 = A013;
        this.A0C = C880856r.A04(A0M);
        this.A0F = C86114wI.A0Q(this, 124);
        IDxObserverShape211S0100000_2_I2 A0Q = C86114wI.A0Q(this, 125);
        this.A0L = A0Q;
        this.A0J = C18220wO.A0y();
        this.A07 = C86154wM.A0D();
        A013.A0K(A032, A0Q);
        A012.A0K(A032, A0Q);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        if (X.C18190wL.A1a(r13) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017a, code lost:
        if (r49 != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (r49 != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0186, code lost:
        if (r49 != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018c, code lost:
        if (r49 != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        if (r49 != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        if (r49 != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019d, code lost:
        if (r49 != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a2, code lost:
        if (r49 != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a7, code lost:
        if (r49 != false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.form.fragment.model.FormParams A00(X.AnonymousClass58U r48, boolean r49) {
        /*
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0v()
            r1 = r48
            X.0Oa r0 = r1.A0K
            java.lang.Object r3 = r0.getValue()
            X.7j3 r3 = (X.C128157j3) r3
            java.lang.String r2 = r1.A04
            r18 = 0
            if (r2 != 0) goto L_0x001a
            java.lang.String r0 = "productId"
            X.C04220Ms.A0E(r0)
            throw r18
        L_0x001a:
            X.587 r12 = r1.A0G
            X.69P r0 = X.AnonymousClass69P.SHIPPING_ADDRESS
            X.79R r2 = X.AnonymousClass79R.A00(r0, r12, r2)
            X.7IT r0 = r3.A00
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r2)
            X.7Kx r2 = X.C86104wH.A0R(r0)
            if (r2 == 0) goto L_0x009e
            boolean r0 = X.AnonymousClass7Kx.A0R(r2)
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r2.A01
            X.6j5 r0 = (X.C108866j5) r0
            if (r0 == 0) goto L_0x009e
            java.util.List r0 = r0.A02
            java.util.Iterator r10 = r0.iterator()
        L_0x0040:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r10.next()
            com.facebookpay.shippingaddress.model.ShippingAddress r2 = (com.facebookpay.shippingaddress.model.ShippingAddress) r2
            java.lang.String r9 = r2.A04
            if (r9 == 0) goto L_0x0099
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0096
            X.69U r16 = X.AnonymousClass69U.A06
        L_0x0058:
            java.lang.String r8 = r2.A00
            java.lang.String r29 = X.AnonymousClass7BE.A02(r2)
            java.lang.String r30 = X.AnonymousClass7BE.A01(r2)
            java.lang.String r7 = r2.A08
            java.lang.String r6 = r2.A09
            java.lang.String r5 = r2.A06
            java.lang.String r4 = r2.A01
            java.lang.String r3 = r2.A07
            java.lang.String r2 = r2.A02
            java.lang.Integer r17 = X.AnonymousClass006.A0N
            r34 = 0
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = new com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            r15 = r0
            r19 = r9
            r20 = r7
            r21 = r6
            r22 = r18
            r23 = r18
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r5
            r28 = r8
            r31 = r18
            r32 = r18
            r33 = r18
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r13.add(r0)
            goto L_0x0040
        L_0x0096:
            X.69U r16 = X.AnonymousClass69U.A0e
            goto L_0x0058
        L_0x0099:
            java.lang.IllegalStateException r18 = X.AnonymousClass0wJ.A0b()
            throw r18
        L_0x009e:
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x00aa
            boolean r0 = X.C18190wL.A1a(r13)
            r46 = 1
            if (r0 != 0) goto L_0x00ac
        L_0x00aa:
            r46 = 0
        L_0x00ac:
            r37 = 2131826516(0x7f111754, float:1.9285919E38)
            r38 = 2131826540(0x7f11176c, float:1.9285967E38)
            r48 = r49
            if (r49 == 0) goto L_0x00bc
            r37 = 2131826414(0x7f1116ee, float:1.9285712E38)
            r38 = 2131826524(0x7f11175c, float:1.9285935E38)
        L_0x00bc:
            X.56r r0 = r1.A0B
            X.7Kx r0 = X.C86104wH.A0R(r0)
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r0)
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r0 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r0
            com.facebookpay.form.model.AddressFormFieldsConfig r16 = X.AnonymousClass7BH.A00(r0)
            if (r49 == 0) goto L_0x0178
            android.util.SparseArray r2 = r1.A07
            r0 = 13
            java.lang.Object r11 = r2.get(r0)
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0178
            java.lang.String r11 = (java.lang.String) r11
        L_0x00dc:
            android.util.SparseArray r2 = r1.A07
            r0 = 14
            java.lang.Object r10 = r2.get(r0)
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L_0x017e
            java.lang.String r10 = (java.lang.String) r10
        L_0x00ea:
            android.util.SparseArray r2 = r1.A07
            r0 = 15
            java.lang.Object r8 = r2.get(r0)
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x0184
            java.lang.String r8 = (java.lang.String) r8
        L_0x00f8:
            android.util.SparseArray r2 = r1.A07
            r0 = 2
            java.lang.Object r7 = r2.get(r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L_0x018a
            java.lang.String r7 = (java.lang.String) r7
        L_0x0105:
            android.util.SparseArray r2 = r1.A07
            r0 = 5
            java.lang.Object r6 = r2.get(r0)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0190
            java.lang.String r6 = (java.lang.String) r6
        L_0x0112:
            android.util.SparseArray r2 = r1.A07
            r0 = 6
            java.lang.Object r5 = r2.get(r0)
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L_0x0196
            java.lang.String r5 = (java.lang.String) r5
        L_0x011f:
            android.util.SparseArray r2 = r1.A07
            r0 = 7
            java.lang.Object r4 = r2.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x019b
            java.lang.String r4 = (java.lang.String) r4
        L_0x012c:
            android.util.SparseArray r2 = r1.A07
            r0 = 8
            java.lang.Object r3 = r2.get(r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x01a0
            java.lang.String r3 = (java.lang.String) r3
        L_0x013a:
            android.util.SparseArray r2 = r1.A07
            r0 = 9
            java.lang.Object r2 = r2.get(r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x01a5
            java.lang.String r2 = (java.lang.String) r2
        L_0x0148:
            android.util.SparseArray r9 = r1.A07
            r0 = 21
            java.lang.Object r0 = r9.get(r0)
            boolean r9 = r0 instanceof java.lang.String
            if (r9 == 0) goto L_0x01aa
            java.lang.String r0 = (java.lang.String) r0
        L_0x0156:
            X.56r r9 = r1.A0A
            X.7Kx r9 = X.C86104wH.A0R(r9)
            if (r9 == 0) goto L_0x0175
            java.lang.Object r9 = r9.A01
            com.google.common.collect.ImmutableList r9 = (com.google.common.collect.ImmutableList) r9
        L_0x0162:
            boolean r14 = r1.A06
            boolean r43 = r12.A07()
            X.AnonymousClass7Kz.A0J()
            X.67I r15 = X.AnonymousClass67I.NONE
            com.fbpay.logging.LoggingContext r12 = r1.A02
            if (r12 != 0) goto L_0x01ad
            X.C86124wJ.A19()
            throw r18
        L_0x0175:
            r9 = r18
            goto L_0x0162
        L_0x0178:
            r11 = r18
            if (r49 == 0) goto L_0x017e
            goto L_0x00dc
        L_0x017e:
            r10 = r18
            if (r49 == 0) goto L_0x0184
            goto L_0x00ea
        L_0x0184:
            r8 = r18
            if (r49 == 0) goto L_0x018a
            goto L_0x00f8
        L_0x018a:
            r7 = r18
            if (r49 == 0) goto L_0x0190
            goto L_0x0105
        L_0x0190:
            r6 = r18
            if (r49 == 0) goto L_0x0196
            goto L_0x0112
        L_0x0196:
            r5 = r18
            if (r49 == 0) goto L_0x019b
            goto L_0x011f
        L_0x019b:
            r4 = r18
            if (r49 == 0) goto L_0x01a0
            goto L_0x012c
        L_0x01a0:
            r3 = r18
            if (r49 == 0) goto L_0x01a5
            goto L_0x013a
        L_0x01a5:
            r2 = r18
            if (r49 == 0) goto L_0x01aa
            goto L_0x0148
        L_0x01aa:
            r0 = r18
            goto L_0x0156
        L_0x01ad:
            r36 = r18
            if (r46 == 0) goto L_0x01b3
            r36 = r13
        L_0x01b3:
            boolean r47 = r1.A0B()
            boolean r1 = r1.A0B()
            r39 = 0
            if (r1 == 0) goto L_0x01c2
            r39 = 2131826386(0x7f1116d2, float:1.9285655E38)
        L_0x01c2:
            r41 = 0
            r40 = 26828820(0x1996014, float:5.634119E-38)
            r20 = r18
            r21 = r18
            r23 = r18
            r27 = r6
            r28 = r5
            r29 = r4
            r30 = r3
            r31 = r2
            r32 = r18
            r33 = r18
            r34 = r0
            r35 = r18
            r42 = r14
            r44 = r41
            r45 = r41
            r19 = r9
            r22 = r11
            r24 = r10
            r25 = r8
            r26 = r7
            r17 = r12
            com.facebookpay.form.fragment.model.FormParams r0 = X.C128197j8.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.A00(X.58U, boolean):com.facebookpay.form.fragment.model.FormParams");
    }

    private final void A07(C40307LcE lcE, String str) {
        Map map;
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext loggingContext = this.A02;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        AnonymousClass7DP A032 = this.A0G.A03();
        LinkedHashMap A0y = C18220wO.A0y();
        C86114wI.A1K(loggingContext, str, A0y);
        A0y.put("CREDENTIAL_TYPE", lcE);
        Object obj = A0y.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
            map = C18220wO.A0y();
        }
        A012.Bb8("user_add_credential_enter", AnonymousClass7Kr.A04(A032, A0y, map));
    }

    private final void A0A(List list, List list2, List list3) {
        if (list3.isEmpty()) {
            list.addAll(list2);
            return;
        }
        Integer num = AnonymousClass006.A00;
        AnonymousClass69U r2 = AnonymousClass69U.A0i;
        list.add(AnonymousClass7Kx.A0A(new SelectionHeaderItem(r2, 2131826384, num, (String) null)));
        list.addAll(list2);
        list.add(AnonymousClass7Kx.A0A(new SelectionHeaderItem(r2, 2131826639, num, (String) null)));
        list.addAll(list3);
    }
}
