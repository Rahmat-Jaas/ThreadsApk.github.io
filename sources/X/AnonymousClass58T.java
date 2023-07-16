package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl;
import com.facebook.redex.IDxFunctionShape30S1100000_2_I2;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;

/* renamed from: X.58T  reason: invalid class name */
public final class AnonymousClass58T extends C62793ak implements C146618mX {
    public static final C969667k A0H = C969667k.SELECT;
    public AnonymousClass79R A00;
    public ECPPaymentRequest A01;
    public LoggingContext A02;
    public String A03;
    public String A04;
    public SparseArray A05;
    public final C880756q A06;
    public final C880756q A07;
    public final C880856r A08;
    public final C880856r A09;
    public final C880856r A0A;
    public final C143158gC A0B;
    public final AnonymousClass587 A0C;
    public final Map A0D;
    public final C04530Oa A0E = AnonymousClass0OY.A02(AnonymousClass8HC.A00);
    public final C880856r A0F;
    public final C143158gC A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010d, code lost:
        if (r0.A01 != null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ACT(android.os.Bundle r9, android.view.ContextThemeWrapper r10, androidx.fragment.app.Fragment r11, X.AnonymousClass7Kx r12) {
        /*
            r8 = this;
            r7 = 0
            com.fbpay.logging.LoggingContext r5 = r8.A02
            r3 = 0
            if (r5 != 0) goto L_0x000a
            X.C86124wJ.A19()
            throw r3
        L_0x000a:
            java.lang.Object r6 = r12.A01
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem"
            X.C04220Ms.A0C(r6, r2)
            r0 = r6
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            java.lang.String r4 = r0.A0A
            long r0 = java.lang.Long.parseLong(r4)
            r8.A07(r5, r0, r7)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem"
            X.C04220Ms.A0C(r6, r0)
            r0 = r6
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r0
            java.lang.String r1 = r0.getId()
            X.56q r0 = r8.A06
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r0.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r0.A04
        L_0x003f:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0096
            java.util.Map r0 = r8.A0D
            X.C04220Ms.A0C(r6, r2)
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x0116
            X.C04220Ms.A0C(r6, r2)
        L_0x0053:
            X.56q r0 = r8.A07
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0093
            java.util.Iterator r5 = r0.iterator()
        L_0x0065:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r3 = r5.next()
            r0 = r3
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r1 = r0.A01
            boolean r0 = r1 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            if (r0 == 0) goto L_0x0065
            X.C04220Ms.A0C(r1, r2)
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r1
            java.lang.String r0 = r1.A0A
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x0065
        L_0x0085:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            if (r3 == 0) goto L_0x0093
            java.lang.Object r0 = r3.A01
            X.C04220Ms.A0C(r0, r2)
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            r8.A03(r9, r11, r0)
        L_0x0093:
            return
        L_0x0094:
            r3 = 0
            goto L_0x0085
        L_0x0096:
            java.lang.String r0 = "Selected item not in the list"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r3, r0)
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r6 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r6
            if (r6 == 0) goto L_0x00de
            boolean r1 = r6 instanceof com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
            if (r1 == 0) goto L_0x00de
            X.56r r1 = r8.A09
            X.7Kx r1 = X.C86104wH.A0R(r1)
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = r1.A01
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r1 == 0) goto L_0x00de
            java.util.Iterator r7 = r1.iterator()
        L_0x00ba:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00de
            java.lang.Object r5 = r7.next()
            r1 = r5
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = (com.facebookpay.shippingaddress.model.ShippingAddress) r1
            java.lang.String r4 = r1.A04
            r1 = r6
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r1 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r1
            java.lang.String r1 = r1.getId()
            boolean r1 = X.C04220Ms.A0I(r4, r1)
            if (r1 == 0) goto L_0x00ba
            if (r5 == 0) goto L_0x00de
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.7Kx r0 = X.AnonymousClass7Kx.A08(r0, r5, r3)
        L_0x00de:
            X.56r r1 = r8.A0F
            r1.A0H(r0)
            X.7Kx r0 = X.C86104wH.A0R(r1)
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r0.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            if (r0 == 0) goto L_0x0111
            java.lang.String r4 = r0.A04
        L_0x00f7:
            X.7Kx r0 = X.C86104wH.A0R(r1)
            boolean r0 = X.AnonymousClass7Kx.A0R(r0)
            if (r0 == 0) goto L_0x0116
            java.util.Map r0 = r8.A0D
            java.lang.Object r0 = r0.get(r4)
            X.88h r0 = (X.C1373688h) r0
            if (r0 == 0) goto L_0x0116
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x0116
            goto L_0x0053
        L_0x0111:
            r4 = r3
            goto L_0x00f7
        L_0x0113:
            r0 = r3
            goto L_0x003f
        L_0x0116:
            X.8nI r11 = (X.C147048nI) r11
            r11.Brt()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58T.ACT(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.7Kx):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[LOOP:1: B:36:0x00a6->B:39:0x00ba, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(android.os.Bundle r36, androidx.fragment.app.Fragment r37, com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r38) {
        /*
            r35 = this;
            r18 = 0
            r3 = 0
            r0 = r38
            java.util.List r8 = r0.A06
            r7 = 3
            r2 = 0
            if (r8 == 0) goto L_0x0091
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0091
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x0019:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r4.next()
            X.68q r1 = (X.C972568q) r1
            int r1 = X.C18230wP.A04(r1, r2)
            switch(r1) {
                case 1: goto L_0x0041;
                case 2: goto L_0x0038;
                case 3: goto L_0x003b;
                case 4: goto L_0x0036;
                case 5: goto L_0x003e;
                case 6: goto L_0x0033;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r0 = "Invalid Error Field"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0033:
            r1 = 11
            goto L_0x0042
        L_0x0036:
            r1 = 2
            goto L_0x0042
        L_0x0038:
            r1 = 10
            goto L_0x0042
        L_0x003b:
            r1 = 8
            goto L_0x0042
        L_0x003e:
            r1 = 9
            goto L_0x0042
        L_0x0041:
            r1 = 7
        L_0x0042:
            X.C18200wM.A1U(r5, r1)
            goto L_0x0019
        L_0x0046:
            com.google.common.collect.ImmutableList r18 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            r1 = 2131826471(0x7f111727, float:1.9285827E38)
            r6 = 2131826470(0x7f111726, float:1.9285825E38)
            int r5 = r8.size()
            r4 = 1
            if (r5 != r4) goto L_0x0071
            java.lang.Object r1 = r8.get(r2)
            X.68q r1 = (X.C972568q) r1
            int r5 = r1.ordinal()
            if (r5 == r4) goto L_0x008d
            if (r5 == r7) goto L_0x0089
            r4 = 5
            r1 = 2131826473(0x7f111729, float:1.9285831E38)
            if (r5 == r4) goto L_0x006e
            r1 = 2131826471(0x7f111727, float:1.9285827E38)
        L_0x006e:
            r6 = 2131826469(0x7f111725, float:1.9285823E38)
        L_0x0071:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            X.68y r5 = X.C973368y.A03
            com.facebookpay.common.models.ErrorDialogContent r1 = new com.facebookpay.common.models.ErrorDialogContent
            r4 = r1
            r6 = r3
            r7 = r3
            r8 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0092
        L_0x0089:
            r1 = 2131826472(0x7f111728, float:1.928583E38)
            goto L_0x006e
        L_0x008d:
            r1 = 2131826468(0x7f111724, float:1.9285821E38)
            goto L_0x006e
        L_0x0091:
            r1 = r3
        L_0x0092:
            r7 = r35
            X.56r r4 = r7.A09
            X.7Kx r4 = X.C86104wH.A0R(r4)
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r4.A01
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            if (r4 == 0) goto L_0x00bc
            java.util.Iterator r6 = r4.iterator()
        L_0x00a6:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r6.next()
            com.facebookpay.shippingaddress.model.ShippingAddress r4 = (com.facebookpay.shippingaddress.model.ShippingAddress) r4
            java.lang.String r5 = r4.A04
            java.lang.String r4 = r0.A0A
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 == 0) goto L_0x00a6
        L_0x00bc:
            boolean r4 = r7.A09()
            r29 = 2131826523(0x7f11175b, float:1.9285933E38)
            if (r4 == 0) goto L_0x00c8
            r29 = 2131826515(0x7f111753, float:1.9285917E38)
        L_0x00c8:
            boolean r4 = r7.A09()
            r30 = 2131826532(0x7f111764, float:1.9285951E38)
            if (r4 == 0) goto L_0x00d4
            r30 = 2131826525(0x7f11175d, float:1.9285937E38)
        L_0x00d4:
            r31 = 2131826540(0x7f11176c, float:1.9285967E38)
            X.56r r6 = r7.A0A
            X.7Kx r4 = X.C86104wH.A0R(r6)
            java.lang.Object r4 = X.AnonymousClass7Kx.A0D(r4)
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r4 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r4
            com.facebookpay.form.model.AddressFormFieldsConfig r16 = X.AnonymousClass7BH.A00(r4)
            r4 = 2131826534(0x7f111766, float:1.9285955E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = r0.A0A
            java.lang.String r14 = r0.A03
            java.lang.String r13 = r0.A0E
            java.lang.String r12 = r0.A0F
            java.lang.String r11 = r0.A0B
            java.lang.String r10 = r0.A07
            java.lang.String r9 = r0.A0C
            java.lang.String r8 = r0.A0D
            java.lang.String r4 = r0.A08
            boolean r0 = r7.A09()
            com.facebookpay.form.fragment.model.FeatureConfiguration r15 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r15.<init>(r0, r2)
            com.fbpay.logging.LoggingContext r0 = r7.A02
            if (r0 != 0) goto L_0x0111
            X.C86124wJ.A19()
            throw r3
        L_0x0111:
            boolean r33 = r7.A0C(r5)
            r32 = 524288(0x80000, float:7.34684E-40)
            r28 = r4
            r34 = r2
            r24 = r11
            r25 = r10
            r26 = r9
            r27 = r8
            r20 = r5
            r21 = r14
            r22 = r13
            r23 = r12
            r17 = r0
            com.facebookpay.form.fragment.model.FormParams r4 = X.C128187j7.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            android.os.Bundle r0 = X.AnonymousClass7I8.A00(r6, r3, r3)
            r5 = r36
            r5.putAll(r0)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r5.putParcelable(r0, r4)
            if (r1 == 0) goto L_0x0146
            java.lang.String r0 = "ECP_FORM_FRAGMENT_ERROR_MESSAGE"
            r5.putParcelable(r0, r1)
        L_0x0146:
            java.lang.String r1 = "content_form_fragment"
            r0 = 1
            r3 = r37
            X.AnonymousClass7H3.A01(r5, r3, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58T.A03(android.os.Bundle, androidx.fragment.app.Fragment, com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem):void");
    }

    public static final void A04(BaseSelectionCheckoutItem baseSelectionCheckoutItem, AnonymousClass58T r3) {
        String str;
        C108806iy r0;
        ShippingAddress shippingAddress;
        C969667k r02 = (C969667k) r3.A08.A08();
        if (r02 == null) {
            return;
        }
        if (r02.ordinal() == 1) {
            baseSelectionCheckoutItem.Cpe(AnonymousClass006.A01);
            return;
        }
        AnonymousClass7Kx A0R = C86104wH.A0R(r3.A06);
        if (A0R == null || (r0 = (C108806iy) A0R.A01) == null || (shippingAddress = (ShippingAddress) r0.A01) == null) {
            str = null;
        } else {
            str = shippingAddress.A04;
        }
        AnonymousClass6I2.A00(baseSelectionCheckoutItem, str);
    }

    public static final void A05(AnonymousClass58T r5) {
        Iterable<AnonymousClass7Kx> iterable;
        C880756q r4 = r5.A07;
        AnonymousClass7Kx A0R = C86104wH.A0R(r4);
        if (A0R != null && (iterable = (Iterable) A0R.A01) != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
            for (AnonymousClass7Kx A072 : iterable) {
                A0w.add(AnonymousClass7Kx.A07(A072, r5, 36));
            }
            Object A082 = r4.A08();
            if (A082 != null) {
                r4.A0H(AnonymousClass7Kx.A06((AnonymousClass7Kx) A082, A0w, 35));
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[EDGE_INSN: B:47:0x00ab->B:29:0x00ab ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass58T r9, X.AnonymousClass7Kx r10) {
        /*
            X.56r r4 = r9.A09
            X.7TZ r0 = X.AnonymousClass7TZ.A00
            X.AnonymousClass7Kx.A0E(r0, r4, r10)
            boolean r0 = X.AnonymousClass7Kx.A0R(r10)
            r2 = 0
            if (r0 == 0) goto L_0x0067
            X.56r r1 = r9.A0A
            X.7Ta r0 = X.C122597Ta.A00
            X.AnonymousClass7Kx.A0E(r0, r1, r10)
            java.lang.Object r8 = X.AnonymousClass7Kx.A0D(r10)
            X.6j5 r8 = (X.C108866j5) r8
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.util.List r7 = r8.A02
            java.util.Iterator r3 = r7.iterator()
        L_0x0025:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r6 = r3.next()
            r0 = r6
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r8.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = r9.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0025
        L_0x0045:
            if (r6 == 0) goto L_0x00ab
            r9.A03 = r2
            X.0Oa r0 = r9.A0E
            java.lang.Object r5 = r0.getValue()
            X.7j3 r5 = (X.C128157j3) r5
            java.lang.String r3 = r9.A04
            if (r3 != 0) goto L_0x005b
            java.lang.String r0 = "productID"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x005b:
            X.587 r1 = r9.A0C
            X.69P r0 = X.AnonymousClass69P.SHIPPING_ADDRESS
            X.79R r0 = X.AnonymousClass79R.A00(r0, r1, r3)
            r5.A04(r0)
            goto L_0x00c2
        L_0x0067:
            boolean r0 = X.AnonymousClass7Kx.A0O(r10)
            X.56q r1 = r9.A07
            if (r0 == 0) goto L_0x0093
            java.lang.Throwable r3 = r10.A02
            X.7Kx r0 = X.C86104wH.A0R(r4)
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
        L_0x007b:
            java.util.List r0 = r9.A02(r0)
            X.AnonymousClass7Kx.A0K(r1, r0, r3)
            X.56r r1 = r9.A0F
            X.7Kx r0 = X.C86104wH.A0R(r1)
            if (r0 == 0) goto L_0x008c
            java.lang.Object r2 = r0.A01
        L_0x008c:
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r2, r3)
            goto L_0x00e3
        L_0x0091:
            r0 = r2
            goto L_0x007b
        L_0x0093:
            X.7Kx r0 = X.C86104wH.A0R(r4)
            if (r0 == 0) goto L_0x009d
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
        L_0x009d:
            java.util.List r0 = r9.A02(r2)
            X.AnonymousClass7Kx.A0J(r1, r0)
            X.56r r1 = r9.A0F
            java.lang.Object r0 = r1.A08()
            goto L_0x00e3
        L_0x00ab:
            java.util.Iterator r3 = r7.iterator()
        L_0x00af:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x00af
            r5 = r1
        L_0x00c1:
            r6 = r5
        L_0x00c2:
            X.56r r1 = r9.A0F
            if (r6 == 0) goto L_0x00e7
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A08(r0, r6, r2)
        L_0x00cc:
            r1.A0H(r0)
            X.56q r1 = r9.A07
            X.7Kx r0 = X.C86104wH.A0R(r4)
            if (r0 == 0) goto L_0x00db
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
        L_0x00db:
            java.util.List r0 = r9.A02(r2)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
        L_0x00e3:
            r1.A0H(r0)
            return
        L_0x00e7:
            java.lang.Object r0 = r1.A08()
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58T.A06(X.58T, X.7Kx):void");
    }

    private final void A07(LoggingContext loggingContext, long j, boolean z) {
        LoggingContext loggingContext2 = loggingContext;
        if (this.A08.A08() == C969667k.EDIT || z) {
            C128957ke.A04(C18180wK.A0I(C86104wH.A0K(AnonymousClass7JJ.A00().A00, "user_edit_shippingaddress_enter"), 2875), loggingContext, new KtLambdaShape3S1300000_I2(loggingContext2, Long.valueOf(j), "edit_shipping_address", (Map) AnonymousClass7Kr.A07(this.A0C), 9));
            return;
        }
        AnonymousClass7JJ.A00().A0B(loggingContext, Long.valueOf(j), "select_existing_shipping_address", AnonymousClass7Kr.A07(this.A0C));
    }

    private final boolean A09() {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
            return false;
        }
        return C18190wL.A1Z(checkoutConfiguration.A05, true);
    }

    public final void A0A(C1373688h r9) {
        AnonymousClass7Kx A0A2;
        C108806iy r0;
        ShippingAddress shippingAddress;
        String str;
        Iterable<AnonymousClass7Kx> iterable;
        C880756q r4 = this.A06;
        AnonymousClass7Kx A0R = C86104wH.A0R(r4);
        if (!(A0R == null || (r0 = (C108806iy) A0R.A01) == null || (shippingAddress = (ShippingAddress) r0.A01) == null || (str = shippingAddress.A04) == null)) {
            this.A0D.put(str, r9);
            C880756q r6 = this.A07;
            AnonymousClass7Kx A0R2 = C86104wH.A0R(r6);
            if (!(A0R2 == null || (iterable = (Iterable) A0R2.A01) == null)) {
                ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
                for (AnonymousClass7Kx A032 : iterable) {
                    A0w.add(AnonymousClass7Kx.A03(new IDxFunctionShape30S1100000_2_I2(str, r9, 1), A032));
                }
                Object A082 = r6.A08();
                if (A082 != null) {
                    r6.A0H(AnonymousClass7Kx.A06((AnonymousClass7Kx) A082, A0w, 34));
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
        }
        if (!A0B()) {
            Object obj = null;
            AnonymousClass7Kx A0R3 = C86104wH.A0R(r4);
            if (r9 != null) {
                if (A0R3 != null) {
                    obj = A0R3.A01;
                }
                A0A2 = AnonymousClass7Kx.A0B(obj, r9);
            } else {
                if (A0R3 != null) {
                    obj = A0R3.A01;
                }
                A0A2 = AnonymousClass7Kx.A0A(obj);
            }
            r4.A0H(A0A2);
        }
    }

    public final boolean A0B() {
        List list;
        AnonymousClass7Kx A0R = C86104wH.A0R(this.A09);
        if (A0R == null || (list = (List) A0R.A01) == null) {
            return true;
        }
        return list.isEmpty();
    }

    public final boolean A0C(String str) {
        Iterable iterable;
        Object obj;
        AnonymousClass7Kx A0R = C86104wH.A0R(this.A09);
        if (A0R == null || (iterable = (Iterable) A0R.A01) == null) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C04220Ms.A0I(((ShippingAddress) obj).A04, str)) {
                break;
            }
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        if (shippingAddress != null) {
            return shippingAddress.A0E;
        }
        return false;
    }

    public final void AJJ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r9) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) r9.A01;
        if (baseCheckoutItem != null) {
            LoggingContext loggingContext = this.A02;
            if (loggingContext == null) {
                C86124wJ.A19();
                throw null;
            }
            SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
            A07(loggingContext, Long.parseLong(selectionShippingAddressItem.A0A), A09());
            A03(bundle, fragment, selectionShippingAddressItem);
        }
    }

    public final M5J Abc() {
        return this.A08;
    }

    public final void CeZ() {
        C880856r r2 = this.A08;
        if (r2.A08() != C969667k.NONE) {
            r2.A0H(A0H);
            A05(this);
        }
    }

    public final M5J Cgs() {
        return this.A07;
    }

    public final /* synthetic */ boolean Cs9() {
        return true;
    }

    public final void Cwt() {
        C880856r r3 = this.A08;
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
        A05(this);
    }

    public final void D9D(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A05 = sparseArray;
        }
    }

    public AnonymousClass58T(AnonymousClass587 r6) {
        this.A0C = r6;
        C880756q A012 = C880756q.A01();
        this.A07 = A012;
        this.A09 = C880856r.A03();
        C880856r A032 = C880856r.A03();
        this.A0F = A032;
        this.A08 = C880856r.A04(A0H);
        C880756q A013 = C880756q.A01();
        AnonymousClass7Kx.A0J(A013, (Object) null);
        this.A06 = A013;
        this.A0A = C880856r.A03();
        this.A0D = C18220wO.A0y();
        this.A0B = C86114wI.A0Q(this, 135);
        IDxObserverShape211S0100000_2_I2 A0Q = C86114wI.A0Q(this, 136);
        this.A0G = A0Q;
        this.A05 = C86154wM.A0D();
        A013.A0K(A032, A0Q);
        A012.A0K(A032, A0Q);
    }

    public static final FormParams A00(AnonymousClass58T r22) {
        AnonymousClass58T r2 = r22;
        AddressFormFieldsConfig A002 = AnonymousClass7BH.A00((FBPayAddressFormConfigFragmentImpl) AnonymousClass7Kx.A0D(C86104wH.A0R(r2.A0A)));
        SparseArray sparseArray = r2.A05;
        String A012 = A01(sparseArray, 2);
        String A013 = A01(sparseArray, 5);
        String A014 = A01(sparseArray, 6);
        String A015 = A01(sparseArray, 30);
        sparseArray.get(31);
        String A016 = A01(sparseArray, 7);
        String A017 = A01(sparseArray, 9);
        String A018 = A01(sparseArray, 8);
        String A019 = A01(sparseArray, 21);
        FeatureConfiguration featureConfiguration = new FeatureConfiguration(r2.A09(), true);
        LoggingContext loggingContext = r2.A02;
        if (loggingContext != null) {
            return C128187j7.A00(featureConfiguration, A002, loggingContext, (ImmutableList) null, (Integer) null, (String) null, A012, A013, A014, A015, A016, A017, A018, A019, 2131826445, 0, 2131826524, 393264, false, true);
        }
        C86124wJ.A19();
        throw null;
    }

    public static String A01(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final List A02(List list) {
        boolean z;
        Object selectionActionViewItem;
        AnonymousClass69U r16;
        Integer num;
        PaymentReceiverInfo paymentReceiverInfo;
        String str;
        CheckoutConfiguration checkoutConfiguration;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
            z = false;
        } else {
            z = C18190wL.A1Z(checkoutConfiguration.A06, true);
        }
        if (!z || !A0B() || this.A02 == null) {
            this.A05 = C86154wM.A0D();
            if (A09()) {
                AnonymousClass7Kx.A0M(2131826445, AnonymousClass006.A0C, A0v);
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ShippingAddress shippingAddress = (ShippingAddress) it.next();
                    String str2 = shippingAddress.A04;
                    if (str2 != null) {
                        if (A09()) {
                            r16 = AnonymousClass69U.A06;
                        } else {
                            r16 = AnonymousClass69U.A0e;
                        }
                        String str3 = shippingAddress.A00;
                        String A022 = AnonymousClass7BE.A02(shippingAddress);
                        String A012 = AnonymousClass7BE.A01(shippingAddress);
                        String str4 = shippingAddress.A08;
                        String str5 = shippingAddress.A09;
                        String str6 = shippingAddress.A06;
                        String str7 = shippingAddress.A01;
                        String str8 = shippingAddress.A07;
                        String str9 = shippingAddress.A02;
                        Map map = this.A0D;
                        C1373688h r2 = (C1373688h) map.get(str2);
                        if (r2 != null) {
                            num = r2.A01;
                        } else {
                            num = null;
                        }
                        map.get(str2);
                        String str10 = str4;
                        String str11 = str5;
                        String str12 = str7;
                        Integer num2 = num;
                        String str13 = str2;
                        SelectionShippingAddressItem selectionShippingAddressItem = new SelectionShippingAddressItem(r16, AnonymousClass006.A0N, num2, str13, str10, str11, (String) null, (String) null, str12, str8, str9, str6, str3, A022, A012, (String) null, shippingAddress.A03, (List) null, shippingAddress.A0D);
                        A04(selectionShippingAddressItem, this);
                        AnonymousClass7Kx.A0N(selectionShippingAddressItem, A0v);
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
            }
            if (this.A0C.A01(AnonymousClass69P.SHIPPING_ADDRESS) != AnonymousClass67P.OTC) {
                int i = 2131826372;
                if (A09()) {
                    i = 2131826377;
                }
                selectionActionViewItem = new SelectionActionViewItem(AnonymousClass69U.A0g, (Integer) null, Integer.valueOf(i), (String) null, (String) null);
            }
            return AnonymousClass00J.A0N(A0v);
        }
        if (this.A0A.A08() != null) {
            FormParams A002 = A00(this);
            ECPPaymentRequest eCPPaymentRequest2 = this.A01;
            if (eCPPaymentRequest2 == null || (paymentReceiverInfo = eCPPaymentRequest2.A05) == null || ((str = paymentReceiverInfo.A00) == null && (str = paymentReceiverInfo.A02) == null)) {
                throw C18180wK.A0a("Required value was null.");
            }
            selectionActionViewItem = new InlineFormItem(AnonymousClass69U.A03, A002, str);
        }
        return AnonymousClass00J.A0N(A0v);
        AnonymousClass7Kx.A0N(selectionActionViewItem, A0v);
        return AnonymousClass00J.A0N(A0v);
    }

    public final void BrQ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r12) {
        boolean A1X = C18240wQ.A1X(contextThemeWrapper);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) r12.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionActionViewItem) {
                C128957ke A002 = AnonymousClass7JJ.A00();
                LoggingContext loggingContext = this.A02;
                if (loggingContext != null) {
                    C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_add_shippingaddress_enter"), 2812), loggingContext, AnonymousClass7Kr.A07(this.A0C), "add_shipping_address", 7);
                    C880856r r2 = this.A0A;
                    FeatureConfiguration featureConfiguration = new FeatureConfiguration(A09(), A1X);
                    LoggingContext loggingContext2 = this.A02;
                    if (loggingContext2 != null) {
                        bundle.putAll(AnonymousClass7I8.A00(r2, featureConfiguration, loggingContext2));
                        AnonymousClass7H3.A01(bundle, fragment, "content_form_fragment", true, A1X);
                        return;
                    }
                }
            } else {
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
                LoggingContext loggingContext3 = this.A02;
                if (loggingContext3 != null) {
                    A07(loggingContext3, Long.parseLong(selectionShippingAddressItem.A0A), A1X);
                    A03(bundle, fragment, selectionShippingAddressItem);
                    return;
                }
            }
            C04220Ms.A0E("loggingContext");
            throw null;
        }
    }
}
