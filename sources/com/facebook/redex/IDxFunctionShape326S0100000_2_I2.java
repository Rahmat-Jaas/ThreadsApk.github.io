package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass7HL;
import X.C04220Ms;
import X.C142618fJ;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

public class IDxFunctionShape326S0100000_2_I2 implements C142618fJ {
    public Object A00;
    public final int A01;

    public IDxFunctionShape326S0100000_2_I2(int i, AnonymousClass0YY r3) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 25:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 32:
            case 33:
            case LangUtils.HASH_OFFSET /*37*/:
                break;
            default:
                C04220Ms.A0B(r3, 1);
                break;
        }
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v75, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03af, code lost:
        if (r2.A05 == false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06eb, code lost:
        if (r53 == X.AnonymousClass006.A01) goto L_0x06ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0969, code lost:
        if (r0 == null) goto L_0x09b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x096b, code lost:
        r8 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x096f, code lost:
        if (r8 == null) goto L_0x09b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0983, code lost:
        return new com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem(X.AnonymousClass69U.A0e, r8, r8.A00, X.AnonymousClass7BE.A02(r8), X.AnonymousClass7BE.A01(r8), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x09c4, code lost:
        return new com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem(X.AnonymousClass69U.A0e, (com.facebookpay.shippingaddress.model.ShippingAddress) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        r4 = (X.AnonymousClass58V) r2.A00;
        r7 = ((com.facebookpay.common.recyclerview.adapteritems.InlineFormItem) r6).A00;
        r0 = r7.A0I;
        r6 = X.AnonymousClass0wJ.A0v();
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010a, code lost:
        if (r9.hasNext() == false) goto L_0x0cc0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        r1 = (com.facebookpay.form.cell.CellParams) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0114, code lost:
        if ((r1 instanceof com.facebookpay.form.cell.text.TextCellParams) == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0116, code lost:
        if (r1 == null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r2 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011e, code lost:
        if (java.lang.Integer.valueOf(r2) == null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        if (r2 != 2) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0123, code lost:
        r3 = X.C86144wL.A0p(r4.A00, 2);
        r0 = X.C86104wH.A0R(r4.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0cb5, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
        if (r0 == null) goto L_0x0cb1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0cba, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0cbf, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0cc0, code lost:
        r2 = X.C86104wH.A0P(r7, r6);
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0cc8, code lost:
        if (r1 != null) goto L_0x0cce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0cca, code lost:
        X.C04220Ms.A0E("ecpPaymentRequest");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0ccd, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0cce, code lost:
        r0 = r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0cd0, code lost:
        if (r0 == null) goto L_0x0ce2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0cd2, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        r2 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0cd4, code lost:
        if (r1 != null) goto L_0x0cda;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0cd6, code lost:
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0cd8, code lost:
        if (r1 == null) goto L_0x0ce2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0ce1, code lost:
        return new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem(X.AnonymousClass69U.A03, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0ce6, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0135, code lost:
        if (r2 == null) goto L_0x0cb1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0d0b, code lost:
        return X.AnonymousClass7Fb.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0137, code lost:
        r0 = X.C128217jA.A00(r2, r3, "add_name", true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013e, code lost:
        r6.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0143, code lost:
        if (r2 != 1) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0145, code lost:
        r2 = X.C86144wL.A0p(r4.A00, 1);
        r0 = X.C86104wH.A0R(r4.A0E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0151, code lost:
        if (r0 == null) goto L_0x0cb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0153, code lost:
        r1 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0157, code lost:
        if (r1 == null) goto L_0x0cb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0159, code lost:
        r0 = X.C128207j9.A00(r1, r2, "add_email", true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0160, code lost:
        if (r2 != 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0162, code lost:
        r2 = X.C86144wL.A0p(r4.A00, r5);
        r0 = X.C86104wH.A0R(r4.A0G);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016e, code lost:
        if (r0 == null) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0170, code lost:
        r1 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        if (r1 == null) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0176, code lost:
        r0 = X.C128227jB.A00(r1, r2, "add_phone", true, true);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x082b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object apply(java.lang.Object r55) {
        /*
            r54 = this;
            r2 = r54
            r0 = r55
            int r1 = r2.A01
            switch(r1) {
                case 0: goto L_0x0252;
                case 1: goto L_0x000c;
                case 2: goto L_0x0252;
                case 3: goto L_0x005e;
                case 4: goto L_0x025b;
                case 5: goto L_0x0277;
                case 6: goto L_0x0293;
                case 7: goto L_0x02af;
                case 8: goto L_0x0009;
                case 9: goto L_0x00cd;
                case 10: goto L_0x00e6;
                case 11: goto L_0x02cb;
                case 12: goto L_0x017d;
                case 13: goto L_0x02d2;
                case 14: goto L_0x0830;
                case 15: goto L_0x083d;
                case 16: goto L_0x0009;
                case 17: goto L_0x0844;
                case 18: goto L_0x08a5;
                case 19: goto L_0x0844;
                case 20: goto L_0x08a9;
                case 21: goto L_0x0009;
                case 22: goto L_0x0215;
                case 23: goto L_0x09c5;
                case 24: goto L_0x0a20;
                case 25: goto L_0x0a27;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x022f;
                case 29: goto L_0x0252;
                case 30: goto L_0x0ce7;
                case 31: goto L_0x0a32;
                case 32: goto L_0x0252;
                case 33: goto L_0x0252;
                case 34: goto L_0x0009;
                case 35: goto L_0x0009;
                case 36: goto L_0x0c4b;
                case 37: goto L_0x0d0c;
                case 38: goto L_0x0af9;
                case 39: goto L_0x0b08;
                case 40: goto L_0x0b11;
                case 41: goto L_0x0b1e;
                case 42: goto L_0x0b53;
                case 43: goto L_0x0b87;
                case 44: goto L_0x0bbb;
                case 45: goto L_0x0c00;
                case 46: goto L_0x0c05;
                case 47: goto L_0x0c14;
                case 48: goto L_0x0c1c;
                case 49: goto L_0x0c81;
                case 50: goto L_0x0c8a;
                case 51: goto L_0x0c95;
                case 52: goto L_0x0ca2;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r6 = r2.A00
        L_0x000b:
            return r6
        L_0x000c:
            com.facebookpay.confirmation.model.ECPConfirmationParams r0 = (com.facebookpay.confirmation.model.ECPConfirmationParams) r0
            X.C04220Ms.A07(r0)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.lang.String r9 = r0.A03
            java.lang.String r10 = r0.A02
            java.lang.String r11 = r0.A05
            java.lang.String r12 = r0.A04
            java.lang.String r13 = r0.A06
            X.69U r8 = X.AnonymousClass69U.A0A
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem r7 = new com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7Kx.A0N(r7, r6)
            com.facebookpay.confirmation.model.ECPConfirmationUpsellSection r3 = r0.A00
            if (r3 == 0) goto L_0x000b
            java.lang.String r2 = r3.A00
            X.69U r1 = X.AnonymousClass69U.A0B
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem r0 = new com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem
            r0.<init>(r1, r2)
            X.AnonymousClass7Kx.A0N(r0, r6)
            java.util.List r0 = r3.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebookpay.confirmation.model.ECPConfirmationUpsellAction r0 = (com.facebookpay.confirmation.model.ECPConfirmationUpsellAction) r0
            java.lang.String r9 = r0.A01
            java.lang.String r10 = r0.A03
            java.lang.String r11 = r0.A02
            java.lang.String r12 = r0.A00
            X.69U r8 = X.AnonymousClass69U.A0C
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem r7 = new com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem
            r7.<init>(r8, r9, r10, r11, r12)
            X.AnonymousClass7Kx.A0N(r7, r6)
            goto L_0x003f
        L_0x005e:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            r6 = 0
            if (r0 == 0) goto L_0x000b
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r2 = r0.A00()
            if (r2 == 0) goto L_0x000b
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$EmailResponse r1 = r2.A00()
            if (r1 == 0) goto L_0x008b
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl> r0 = com.facebook.graphql.impls.EmailResponseImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            com.facebook.graphql.impls.EmailResponseImpl r1 = (com.facebook.graphql.impls.EmailResponseImpl) r1
            if (r1 == 0) goto L_0x008b
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl$Error> r0 = com.facebook.graphql.impls.EmailResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r1, r0)
            com.facebook.graphql.impls.EmailResponseImpl$Error r0 = (com.facebook.graphql.impls.EmailResponseImpl.Error) r0
            if (r0 == 0) goto L_0x008b
            com.facebook.pando.TreeJNI r0 = X.C86124wJ.A0T(r0)
            com.facebook.graphql.impls.SharedPaymentsErrorImpl r0 = (com.facebook.graphql.impls.SharedPaymentsErrorImpl) r0
            if (r0 != 0) goto L_0x0d07
        L_0x008b:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$PhoneResponse r1 = r2.A01()
            if (r1 == 0) goto L_0x00ad
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl> r0 = com.facebook.graphql.impls.PhoneResponseImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            com.facebook.graphql.impls.PhoneResponseImpl r1 = (com.facebook.graphql.impls.PhoneResponseImpl) r1
            if (r1 == 0) goto L_0x00ad
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl$Error> r0 = com.facebook.graphql.impls.PhoneResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r1, r0)
            com.facebook.graphql.impls.PhoneResponseImpl$Error r0 = (com.facebook.graphql.impls.PhoneResponseImpl.Error) r0
            if (r0 == 0) goto L_0x00ad
            com.facebook.pando.TreeJNI r0 = X.C86124wJ.A0T(r0)
            com.facebook.graphql.impls.SharedPaymentsErrorImpl r0 = (com.facebook.graphql.impls.SharedPaymentsErrorImpl) r0
            if (r0 != 0) goto L_0x0d07
        L_0x00ad:
            com.facebook.pando.TreeJNI r1 = X.C86164wN.A0J(r2)
            if (r1 == 0) goto L_0x000b
            java.lang.Class<com.facebook.graphql.impls.PayerNameResponseImpl> r0 = com.facebook.graphql.impls.PayerNameResponseImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            if (r1 == 0) goto L_0x000b
            java.lang.Class<com.facebook.graphql.impls.PayerNameResponseImpl$Error> r0 = com.facebook.graphql.impls.PayerNameResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r1, r0)
            if (r0 == 0) goto L_0x000b
            com.facebook.pando.TreeJNI r0 = X.C86124wJ.A0T(r0)
            com.facebook.graphql.impls.SharedPaymentsErrorImpl r0 = (com.facebook.graphql.impls.SharedPaymentsErrorImpl) r0
            if (r0 == 0) goto L_0x000b
            goto L_0x0d07
        L_0x00cd:
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            r6 = r0
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            boolean r1 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            if (r1 != 0) goto L_0x00f1
            boolean r1 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
            if (r1 == 0) goto L_0x000b
            java.lang.Object r1 = r2.A00
            X.58V r1 = (X.AnonymousClass58V) r1
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r0
            X.AnonymousClass58V.A01(r0, r1)
            return r6
        L_0x00e6:
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            r6 = r0
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            boolean r0 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            if (r0 == 0) goto L_0x000b
        L_0x00f1:
            java.lang.Object r4 = r2.A00
            X.58V r4 = (X.AnonymousClass58V) r4
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r6 = (com.facebookpay.common.recyclerview.adapteritems.InlineFormItem) r6
            com.facebookpay.form.fragment.model.FormParams r7 = r6.A00
            java.util.ArrayList r0 = r7.A0I
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r9 = r0.iterator()
        L_0x0103:
            boolean r0 = r9.hasNext()
            java.lang.String r8 = "Required value was null."
            r3 = 0
            if (r0 == 0) goto L_0x0cc0
            java.lang.Object r1 = r9.next()
            com.facebookpay.form.cell.CellParams r1 = (com.facebookpay.form.cell.CellParams) r1
            boolean r0 = r1 instanceof com.facebookpay.form.cell.text.TextCellParams
            if (r0 == 0) goto L_0x0103
            if (r1 == 0) goto L_0x0103
            int r2 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0103
            r1 = 2
            if (r2 != r1) goto L_0x0142
            android.util.SparseArray r0 = r4.A00
            java.lang.String r3 = X.C86144wL.A0p(r0, r1)
            X.56r r0 = r4.A0F
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0cb1
            java.lang.Object r2 = r0.A01
            com.facebook.graphql.impls.FBPayFormFieldImpl r2 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r2
            if (r2 == 0) goto L_0x0cb1
            r1 = 1
            java.lang.String r0 = "add_name"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128217jA.A00(r2, r3, r0, r1, r1)
        L_0x013e:
            r6.add(r0)
            goto L_0x0103
        L_0x0142:
            r3 = 1
            if (r2 != r3) goto L_0x0160
            android.util.SparseArray r0 = r4.A00
            java.lang.String r2 = X.C86144wL.A0p(r0, r3)
            X.56r r0 = r4.A0E
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0cb6
            java.lang.Object r1 = r0.A01
            com.facebook.graphql.impls.FBPayFormFieldImpl r1 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r1
            if (r1 == 0) goto L_0x0cb6
            java.lang.String r0 = "add_email"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128207j9.A00(r1, r2, r0, r3, r3)
            goto L_0x013e
        L_0x0160:
            if (r2 != 0) goto L_0x0103
            android.util.SparseArray r0 = r4.A00
            java.lang.String r2 = X.C86144wL.A0p(r0, r5)
            X.56r r0 = r4.A0G
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0cbb
            java.lang.Object r1 = r0.A01
            com.facebook.graphql.impls.FBPayFormFieldImpl r1 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r1
            if (r1 == 0) goto L_0x0cbb
            java.lang.String r0 = "add_phone"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128227jB.A00(r1, r2, r0, r3, r3)
            goto L_0x013e
        L_0x017d:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl r0 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl) r0
            java.lang.Object r1 = r2.A00
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            boolean r1 = X.AnonymousClass7Kx.A0R(r1)
            r6 = 0
            if (r1 == 0) goto L_0x000b
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r1 = r0.A00()
            if (r1 == 0) goto L_0x0213
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r2 = r1.A00()
            if (r2 == 0) goto L_0x0213
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r1 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r11 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayReceiverInfoImpl r11 = (com.facebook.graphql.impls.FBPayReceiverInfoImpl) r11
        L_0x019e:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r1 = r0.A00()
            if (r1 == 0) goto L_0x0211
            com.facebook.pando.TreeJNI r2 = X.C86164wN.A0K(r1)
            if (r2 == 0) goto L_0x0211
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r1 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r8 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r8 = (com.facebook.graphql.impls.FBPayECPAvailabilityImpl) r8
        L_0x01b2:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r3 = r0.A00()
            if (r3 == 0) goto L_0x020f
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$CheckoutScreenConfig> r2 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.CheckoutScreenConfig.class
            java.lang.String r1 = "checkout_screen_config"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x020f
            java.lang.Class<com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl> r1 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class
            com.facebook.pando.TreeJNI r7 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r7 = (com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl) r7
        L_0x01ca:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r3 = r0.A00()
            if (r3 == 0) goto L_0x020d
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$PaymentConfig> r2 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.PaymentConfig.class
            java.lang.String r1 = "payment_config"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x020d
            java.lang.Class<com.facebook.graphql.impls.FBPayPaymentConfigImpl> r1 = com.facebook.graphql.impls.FBPayPaymentConfigImpl.class
            com.facebook.pando.TreeJNI r10 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r10 = (com.facebook.graphql.impls.FBPayPaymentConfigImpl) r10
        L_0x01e2:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r3 = r0.A00()
            if (r3 == 0) goto L_0x020b
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$LoggingPolicy> r2 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.LoggingPolicy.class
            java.lang.String r1 = "logging_policy"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x020b
            java.lang.Class<com.facebook.graphql.impls.FBPayLoggingPolicyImpl> r1 = com.facebook.graphql.impls.FBPayLoggingPolicyImpl.class
            com.facebook.pando.TreeJNI r9 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayLoggingPolicyImpl r9 = (com.facebook.graphql.impls.FBPayLoggingPolicyImpl) r9
        L_0x01fa:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r1 = r0.A00()
            if (r1 == 0) goto L_0x0205
            java.lang.String r0 = "order_id"
            r1.getStringValue(r0)
        L_0x0205:
            X.6lW r6 = new X.6lW
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x020b:
            r9 = r6
            goto L_0x01fa
        L_0x020d:
            r10 = r6
            goto L_0x01e2
        L_0x020f:
            r7 = r6
            goto L_0x01ca
        L_0x0211:
            r8 = r6
            goto L_0x01b2
        L_0x0213:
            r11 = r6
            goto L_0x019e
        L_0x0215:
            r6 = r0
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r6 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            boolean r0 = r6 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem
            if (r0 == 0) goto L_0x000b
            r1 = r6
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r1 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r1
            java.lang.Object r0 = r2.A00
            X.58S r0 = (X.AnonymousClass58S) r0
            java.lang.String r0 = X.AnonymousClass58S.A00(r0)
            X.AnonymousClass6I2.A00(r1, r0)
            return r6
        L_0x022f:
            r6 = r0
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r6 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r6
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            boolean r0 = r6 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            if (r0 == 0) goto L_0x000b
            java.lang.Object r3 = r2.A00
            X.58U r3 = (X.AnonymousClass58U) r3
            java.util.Map r2 = r3.A0I
            r1 = r6
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r1
            java.lang.String r0 = r1.A0E
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x024e
            r0 = 0
            r1.A02 = r0
        L_0x024e:
            X.AnonymousClass58U.A06(r1, r3)
            return r6
        L_0x0252:
            java.lang.Object r1 = r2.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r6 = r1.invoke(r0)
            return r6
        L_0x025b:
            X.6iy r0 = (X.C108806iy) r0
            java.lang.Object r1 = r0.A01
            X.6uB r1 = (X.C114946uB) r1
            java.lang.Object r5 = r2.A00
            X.6uv r5 = (X.C115356uv) r5
            r4 = 0
            java.lang.String r3 = r1.A02
            X.6uq r2 = r1.A01
            X.6uB r1 = new X.6uB
            r1.<init>(r5, r2, r3)
            java.lang.Integer r0 = r0.A00
            X.6iy r6 = new X.6iy
            r6.<init>(r0, r1, r4)
            return r6
        L_0x0277:
            X.6iy r0 = (X.C108806iy) r0
            java.lang.Object r1 = r0.A01
            X.6uB r1 = (X.C114946uB) r1
            java.lang.Object r5 = r2.A00
            X.6uq r5 = (X.C115306uq) r5
            r4 = 0
            java.lang.String r3 = r1.A02
            X.6uv r2 = r1.A00
            X.6uB r1 = new X.6uB
            r1.<init>(r2, r5, r3)
            java.lang.Integer r0 = r0.A00
            X.6iy r6 = new X.6iy
            r6.<init>(r0, r1, r4)
            return r6
        L_0x0293:
            X.6iy r0 = (X.C108806iy) r0
            java.lang.Object r0 = r0.A01
            X.6uB r0 = (X.C114946uB) r0
            java.lang.Object r4 = r2.A00
            X.6uv r4 = (X.C115356uv) r4
            r3 = 0
            java.lang.String r2 = r0.A02
            X.6uq r0 = r0.A01
            X.6uB r1 = new X.6uB
            r1.<init>(r4, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.6iy r6 = new X.6iy
            r6.<init>(r0, r1, r3)
            return r6
        L_0x02af:
            X.6iy r0 = (X.C108806iy) r0
            java.lang.Object r0 = r0.A01
            X.6uB r0 = (X.C114946uB) r0
            java.lang.Object r4 = r2.A00
            X.6uq r4 = (X.C115306uq) r4
            r3 = 0
            java.lang.String r2 = r0.A02
            X.6uv r0 = r0.A00
            X.6uB r1 = new X.6uB
            r1.<init>(r0, r4, r2)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.6iy r6 = new X.6iy
            r6.<init>(r0, r1, r3)
            return r6
        L_0x02cb:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            java.lang.Throwable r6 = X.C120927Dd.A01(r0)
            return r6
        L_0x02d2:
            X.79r r0 = (X.C1203179r) r0
            r9 = 2131826596(0x7f1117a4, float:1.928608E38)
            java.lang.Object r2 = r2.A00
            X.58J r2 = (X.AnonymousClass58J) r2
            X.C04220Ms.A07(r0)
            java.util.List r11 = r0.A03
            java.util.Iterator r6 = r11.iterator()
            r5 = 0
            r4 = 0
        L_0x02e6:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0301
            java.lang.Object r3 = r6.next()
            com.facebook.graphql.impls.PaymentMethodComponentImpl$NewPaymentCredentialOptions r3 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.NewPaymentCredentialOptions) r3
            com.facebook.graphql.impls.NewCreditCardOptionImpl r1 = r3.A00()
            if (r1 == 0) goto L_0x02f9
            r5 = 1
        L_0x02f9:
            com.facebook.graphql.impls.NewPaypalBillingAgreementImpl r1 = r3.A01()
            if (r1 == 0) goto L_0x02e6
            r4 = 1
            goto L_0x02e6
        L_0x0301:
            if (r5 == 0) goto L_0x0322
            if (r4 == 0) goto L_0x0322
            r9 = 2131826581(0x7f111795, float:1.928605E38)
            boolean r1 = X.C18190wL.A1a(r11)
            if (r1 == 0) goto L_0x0322
            X.56r r1 = r2.A0E
            X.AnonymousClass7Kx.A0I(r1, r11)
            X.56r r3 = r2.A0F
            java.lang.Object r1 = r3.A08()
            if (r1 != 0) goto L_0x0322
            java.lang.Object r1 = X.C18240wQ.A0b(r11)
            r3.A0H(r1)
        L_0x0322:
            r20 = 2
            java.lang.Integer r39 = java.lang.Integer.valueOf(r20)
            java.lang.String r37 = "nux_new_full_name_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r3 = X.C116856xf.A01(r37)
            r1 = r39
            kotlin.Pair r6 = X.C18180wK.A0p(r1, r3)
            r8 = 0
            r1 = 13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "nux_new_card_number_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A01(r1)
            kotlin.Pair r5 = X.C18180wK.A0p(r3, r1)
            r7 = 1
            r1 = 15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "nux_new_cvv_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A01(r1)
            kotlin.Pair r4 = X.C18180wK.A0p(r3, r1)
            r1 = 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "nux_new_expiry_date_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A01(r1)
            kotlin.Pair r1 = X.C18180wK.A0p(r3, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r6, r5, r4, r1}
            java.util.Map r5 = X.AnonymousClass4WJ.A0H(r1)
            X.56r r1 = r2.A0H
            r40 = r1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = X.C86124wJ.A0a(r40)
            if (r1 == 0) goto L_0x048e
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x048e
            java.lang.Boolean r1 = r1.A05
            boolean r4 = X.C18190wL.A1Z(r1, r7)
        L_0x0382:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = X.C86124wJ.A0a(r40)
            if (r1 == 0) goto L_0x048b
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x048b
            java.lang.Boolean r1 = r1.A06
            boolean r3 = X.C18190wL.A1Z(r1, r7)
        L_0x0392:
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r1 = r0.A00
            com.facebookpay.form.model.AddressFormFieldsConfig r38 = X.AnonymousClass7BH.A00(r1)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = X.C86124wJ.A0a(r40)
            if (r1 == 0) goto L_0x03b1
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x03b1
            java.util.Set<X.68F> r6 = r1.A0C
            X.68F r1 = X.AnonymousClass68F.REQUEST_BILLING_ADDRESS
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x03b1
            boolean r1 = r2.A05
            r12 = 1
            if (r1 != 0) goto L_0x03b2
        L_0x03b1:
            r12 = 0
        L_0x03b2:
            r19 = 28
            X.5gz r6 = new X.5gz
            r10 = r38
            r1 = r19
            r6.<init>(r10, r1)
            r6.A0W = r12
            r1 = 2131297386(0x7f09046a, float:1.8212715E38)
            r6.A04 = r1
            r1 = 2131297389(0x7f09046d, float:1.8212722E38)
            r6.A07 = r1
            r1 = 2131297390(0x7f09046e, float:1.8212724E38)
            r6.A08 = r1
            r1 = 2131297387(0x7f09046b, float:1.8212717E38)
            r6.A05 = r1
            r1 = 2131297391(0x7f09046f, float:1.8212726E38)
            r6.A09 = r1
            r1 = 2131297384(0x7f090468, float:1.8212711E38)
            r6.A01 = r1
            r1 = 2131297388(0x7f09046c, float:1.821272E38)
            r6.A06 = r1
            r1 = 2131297392(0x7f090470, float:1.8212728E38)
            r6.A0A = r1
            r1 = 2131297385(0x7f090469, float:1.8212713E38)
            r6.A02 = r1
            r6.A0S = r7
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = X.C86124wJ.A0a(r40)
            if (r1 == 0) goto L_0x0488
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x0404
            java.util.Set<X.68F> r10 = r1.A0C
            X.68F r1 = X.AnonymousClass68F.REQUEST_BILLING_ADDRESS
            boolean r1 = r10.contains(r1)
            r1 = r1 ^ 1
            if (r1 != r7) goto L_0x0488
        L_0x0404:
            r1 = 1
        L_0x0405:
            r6.A0T = r1
            r6.A0V = r8
            r12 = 6
            r36 = 5
            java.lang.Integer r35 = java.lang.Integer.valueOf(r36)
            java.lang.String r34 = "nux_new_address1_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r10 = X.C116856xf.A01(r34)
            r1 = r35
            kotlin.Pair r13 = X.C18180wK.A0p(r1, r10)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r12)
            java.lang.String r32 = "nux_new_address2_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r10 = X.C116856xf.A01(r32)
            r1 = r33
            kotlin.Pair r14 = X.C18180wK.A0p(r1, r10)
            r1 = 7
            java.lang.Integer r31 = java.lang.Integer.valueOf(r1)
            java.lang.String r30 = "nux_new_city_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r10 = X.C116856xf.A01(r30)
            r1 = r31
            kotlin.Pair r15 = X.C18180wK.A0p(r1, r10)
            r1 = 8
            java.lang.Integer r29 = java.lang.Integer.valueOf(r1)
            java.lang.String r28 = "nux_new_state_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r10 = X.C116856xf.A01(r28)
            r1 = r29
            kotlin.Pair r16 = X.C18180wK.A0p(r1, r10)
            r1 = 9
            java.lang.Integer r27 = java.lang.Integer.valueOf(r1)
            java.lang.String r26 = "nux_new_zip_code_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r10 = X.C116856xf.A01(r26)
            r1 = r27
            kotlin.Pair r17 = X.C18180wK.A0p(r1, r10)
            r1 = 10
            java.lang.Integer r25 = java.lang.Integer.valueOf(r1)
            java.lang.String r24 = "nux_new_country_picker"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r10 = X.C116856xf.A01(r24)
            r1 = r25
            kotlin.Pair r18 = X.C18180wK.A0p(r1, r10)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r13, r14, r15, r16, r17, r18}
            java.util.Map r1 = X.AnonymousClass4WJ.A0H(r1)
            r6.A0O = r1
            com.fbpay.logging.LoggingContext r10 = r2.A02
            java.lang.String r18 = "loggingContext"
            r1 = 0
            if (r10 != 0) goto L_0x0491
            X.C04220Ms.A0E(r18)
            throw r1
        L_0x0488:
            r1 = 0
            goto L_0x0405
        L_0x048b:
            r3 = 0
            goto L_0x0392
        L_0x048e:
            r4 = 0
            goto L_0x0382
        L_0x0491:
            r6.A0C = r10
            r6.A0Q = r4
            X.587 r10 = r2.A0S
            boolean r10 = r10.A07()
            if (r10 == 0) goto L_0x0582
            java.util.List r10 = r0.A02
            boolean r0 = X.C18190wL.A1a(r10)
            if (r0 == 0) goto L_0x0582
            java.lang.Object r0 = r10.get(r8)
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = r0 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x0582
            java.lang.Object r0 = r10.get(r8)
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r10 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.CreditCard"
            X.C04220Ms.A0C(r10, r0)
            com.facebookpay.paymentmethod.model.CreditCard r10 = (com.facebookpay.paymentmethod.model.CreditCard) r10
            java.lang.String r13 = r10.Aal()
            X.8rA r0 = r10.A00
            java.lang.String r15 = r0.AaB()
            com.facebook.graphql.impls.CreditCardCredentialImpl r12 = r10.A02
            java.lang.String r0 = "last_four_digits"
            r12.getStringValue(r0)
            java.lang.String r17 = r10.A01()
            java.lang.String r0 = r10.A03
            r23 = r0
            X.69W r16 = r10.A00()
            com.google.common.collect.ImmutableList r14 = X.AnonymousClass7Fc.A01(r11)
            r22 = 0
            r21 = 0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r40)
            if (r0 == 0) goto L_0x057f
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x04fb
            java.util.Set<X.68F> r11 = r0.A0C
            X.68F r0 = X.AnonymousClass68F.REQUEST_BILLING_ADDRESS
            boolean r0 = r11.contains(r0)
            r0 = r0 ^ 1
            if (r0 != r7) goto L_0x057f
        L_0x04fb:
            r0 = 1
        L_0x04fc:
            r12 = r0 ^ 1
            X.AnonymousClass7Kz.A0J()
            X.67I r11 = X.AnonymousClass67I.NONE
            if (r3 == 0) goto L_0x050b
            r9 = 2131826414(0x7f1116ee, float:1.9285712E38)
            r8 = 2131826386(0x7f1116d2, float:1.9285655E38)
        L_0x050b:
            X.8rA r0 = r10.A00
            java.lang.String r0 = r0.BMp()
            r6.A0J = r0
            com.facebookpay.form.cell.address.AddressCellParams r10 = new com.facebookpay.form.cell.address.AddressCellParams
            r10.<init>((X.C91875gz) r6)
            r6 = 0
            X.5gy r0 = new X.5gy
            r0.<init>()
            r0.A0D = r13
            r0.A0C = r15
            r0.A0A = r1
            r0.A0F = r1
            r15 = r17
            r0.A0E = r15
            r0.A0G = r1
            r15 = r23
            r0.A0B = r15
            r15 = r16
            r0.A05 = r15
            r0.A06 = r14
            r0.A07 = r1
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            r0.A09 = r14
            r0.A08 = r14
            r0.A0L = r12
            r12 = r20
            r0.A00 = r12
            r0.A04 = r11
            r0.A0J = r4
            r0.A02 = r9
            r0.A01 = r8
            r0.A0I = r3
            r0.A0K = r6
            if (r13 == 0) goto L_0x055a
            int r3 = r13.length()
            if (r3 != 0) goto L_0x055c
        L_0x055a:
            r0.A0H = r5
        L_0x055c:
            r0.A03 = r10
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r5 = new com.facebookpay.form.cell.creditcard.CreditCardCellParams
            r5.<init>((X.C91865gy) r0)
        L_0x0563:
            X.7j6 r47 = X.AnonymousClass6XS.A00
            java.util.List r10 = r2.A07()
            java.lang.Object r8 = r40.A08()
            if (r8 == 0) goto L_0x082b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r8 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r8
            r0 = r19
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r13 = X.C86164wN.A0u(r2, r0)
            com.fbpay.logging.LoggingContext r4 = r2.A02
            if (r4 != 0) goto L_0x05f6
            X.C04220Ms.A0E(r18)
            throw r1
        L_0x057f:
            r0 = 0
            goto L_0x04fc
        L_0x0582:
            com.google.common.collect.ImmutableList r13 = X.AnonymousClass7Fc.A01(r11)
            r22 = 0
            r21 = 0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r40)
            if (r0 == 0) goto L_0x05f4
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x05a0
            java.util.Set<X.68F> r10 = r0.A0C
            X.68F r0 = X.AnonymousClass68F.REQUEST_BILLING_ADDRESS
            boolean r0 = r10.contains(r0)
            r0 = r0 ^ 1
            if (r0 != r7) goto L_0x05f4
        L_0x05a0:
            r0 = 1
        L_0x05a1:
            r0 = r0 ^ 1
            X.AnonymousClass7Kz.A0J()
            X.67I r12 = X.AnonymousClass67I.NONE
            if (r3 == 0) goto L_0x05b0
            r9 = 2131826414(0x7f1116ee, float:1.9285712E38)
            r8 = 2131826386(0x7f1116d2, float:1.9285655E38)
        L_0x05b0:
            com.facebookpay.form.cell.address.AddressCellParams r11 = new com.facebookpay.form.cell.address.AddressCellParams
            r11.<init>((X.C91875gz) r6)
            r6 = 0
            X.5gy r10 = new X.5gy
            r10.<init>()
            r10.A0D = r1
            r10.A0C = r1
            r10.A0A = r1
            r10.A0F = r1
            r10.A0E = r1
            r10.A0G = r1
            r10.A0B = r1
            r10.A05 = r1
            r10.A06 = r13
            r10.A07 = r1
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            r10.A09 = r13
            r10.A08 = r13
            r10.A0L = r0
            r0 = r20
            r10.A00 = r0
            r10.A04 = r12
            r10.A0J = r4
            r10.A02 = r9
            r10.A01 = r8
            r10.A0I = r3
            r10.A0K = r6
            r10.A0H = r5
            r10.A03 = r11
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r5 = new com.facebookpay.form.cell.creditcard.CreditCardCellParams
            r5.<init>((X.C91865gy) r10)
            goto L_0x0563
        L_0x05f4:
            r0 = 0
            goto L_0x05a1
        L_0x05f6:
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r2.A00
            if (r0 == 0) goto L_0x0610
            X.M5J r0 = r0.D7U()
            if (r0 == 0) goto L_0x0610
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0610
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = (com.facebookpay.expresscheckout.models.TransactionInfo) r0
            if (r0 == 0) goto L_0x0610
            java.lang.Integer r3 = r0.A05
            if (r3 != 0) goto L_0x0612
        L_0x0610:
            java.lang.Integer r3 = X.AnonymousClass006.A01
        L_0x0612:
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r2.A00
            if (r0 == 0) goto L_0x0813
            X.M5J r0 = r0.D7U()
            if (r0 == 0) goto L_0x0813
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0813
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = (com.facebookpay.expresscheckout.models.TransactionInfo) r0
            if (r0 == 0) goto L_0x0813
            java.lang.Integer r0 = r0.A04
            r53 = r0
        L_0x062c:
            X.56r r2 = r2.A0G
            X.7Kx r0 = X.C86104wH.A0R(r2)
            if (r0 == 0) goto L_0x080f
            java.lang.Object r0 = r0.A01
            X.6uC r0 = (X.C114956uC) r0
            if (r0 == 0) goto L_0x080f
            X.6tj r0 = r0.A01
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r0.A00
            r23 = r0
        L_0x0640:
            X.7Kx r0 = X.C86104wH.A0R(r2)
            if (r0 == 0) goto L_0x0654
            java.lang.Object r0 = r0.A01
            X.6uC r0 = (X.C114956uC) r0
            if (r0 == 0) goto L_0x0654
            X.6ua r0 = r0.A00
            if (r0 == 0) goto L_0x0654
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r0.A00
            r22 = r0
        L_0x0654:
            X.7Kx r0 = X.C86104wH.A0R(r2)
            if (r0 == 0) goto L_0x0668
            java.lang.Object r0 = r0.A01
            X.6uC r0 = (X.C114956uC) r0
            if (r0 == 0) goto L_0x0668
            X.6ub r0 = r0.A02
            if (r0 == 0) goto L_0x0668
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r0.A00
            r21 = r0
        L_0x0668:
            X.C04220Ms.A0B(r10, r6)
            r20 = 16
            X.C04220Ms.A0B(r8, r7)
            r19 = 27
            r15 = 23
            r14 = 24
            r0 = 6
            X.C04220Ms.A0B(r3, r0)
            com.google.common.collect.ImmutableList$Builder r9 = com.google.common.collect.ImmutableList.builder()
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r2 = r8.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            if (r2 == 0) goto L_0x080b
            java.lang.Boolean r0 = r2.A05
            boolean r12 = X.C04220Ms.A0I(r0, r7)
            java.lang.Boolean r0 = r2.A06
            boolean r0 = X.C04220Ms.A0I(r0, r7)
        L_0x0692:
            java.util.Iterator r18 = r10.iterator()
        L_0x0696:
            boolean r7 = r18.hasNext()
            if (r7 == 0) goto L_0x0826
            java.lang.Object r7 = r18.next()
            X.69P r7 = (X.AnonymousClass69P) r7
            int r8 = r7.ordinal()
            r7 = r20
            if (r8 == r7) goto L_0x07ff
            r7 = r36
            if (r8 == r7) goto L_0x07a5
            r7 = r19
            if (r8 == r7) goto L_0x078a
            if (r8 == r15) goto L_0x06fe
            if (r8 != r14) goto L_0x0696
            X.7ke r7 = X.AnonymousClass7JJ.A00()
            java.lang.String r11 = ""
            java.lang.String r43 = "nux_shipping_option"
            X.09x r8 = X.C128957ke.A00(r7, r11)
            java.lang.String r7 = "client_load_shippingoption_init"
            X.0A2 r8 = X.C86104wH.A0K(r8, r7)
            r7 = 365(0x16d, float:5.11E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r8 = X.C18180wK.A0I(r8, r7)
            r45 = 4
            kotlin.jvm.internal.KtLambdaShape1S2200000_I2 r7 = new kotlin.jvm.internal.KtLambdaShape1S2200000_I2
            r40 = r7
            r41 = r4
            r42 = r1
            r44 = r11
            r40.<init>(r41, r42, r43, r44, r45)
            X.C128957ke.A04(r8, r4, r7)
            java.lang.Integer r7 = X.AnonymousClass006.A0C
            if (r3 == r7) goto L_0x06ed
            java.lang.Integer r11 = X.AnonymousClass006.A01
            r8 = 2131826424(0x7f1116f8, float:1.9285732E38)
            r7 = r53
            if (r7 != r11) goto L_0x06f0
        L_0x06ed:
            r8 = 2131826440(0x7f111708, float:1.9285764E38)
        L_0x06f0:
            X.5gp r7 = new X.5gp
            r7.<init>(r8)
            com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams r8 = new com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams
            r8.<init>((X.C91775gp) r7)
        L_0x06fa:
            r9.add((java.lang.Object) r8)
            goto L_0x0696
        L_0x06fe:
            X.7ke r7 = X.AnonymousClass7JJ.A00()
            java.lang.String r11 = "nux_shipping_address"
            X.09x r8 = r7.A00
            java.lang.String r7 = "client_load_shippingaddress_init"
            X.0A2 r8 = X.C86104wH.A0K(r8, r7)
            r7 = 362(0x16a, float:5.07E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r8 = X.C18180wK.A0I(r8, r7)
            r7 = 49
            X.C128957ke.A03(r8, r4, r1, r11, r7)
            r11 = 11
            X.5gz r7 = new X.5gz
            r8 = r38
            r7.<init>(r8, r11)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r11 = X.C116856xf.A00(r37)
            r8 = r39
            kotlin.Pair r40 = X.C18180wK.A0p(r8, r11)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r11 = X.C116856xf.A00(r34)
            r8 = r35
            kotlin.Pair r41 = X.C18180wK.A0p(r8, r11)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r11 = X.C116856xf.A00(r32)
            r8 = r33
            kotlin.Pair r42 = X.C18180wK.A0p(r8, r11)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r11 = X.C116856xf.A00(r30)
            r8 = r31
            kotlin.Pair r43 = X.C18180wK.A0p(r8, r11)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r11 = X.C116856xf.A00(r28)
            r8 = r29
            kotlin.Pair r44 = X.C18180wK.A0p(r8, r11)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r11 = X.C116856xf.A00(r26)
            r8 = r27
            kotlin.Pair r45 = X.C18180wK.A0p(r8, r11)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r11 = X.C116856xf.A00(r24)
            r8 = r25
            kotlin.Pair r46 = X.C18180wK.A0p(r8, r11)
            kotlin.Pair[] r8 = new kotlin.Pair[]{r40, r41, r42, r43, r44, r45, r46}
            java.util.Map r8 = X.AnonymousClass4WJ.A0H(r8)
            r7.A0O = r8
            r7.A0C = r4
            r7.A0Q = r12
            r8 = 2131826635(0x7f1117cb, float:1.928616E38)
            if (r0 == 0) goto L_0x077c
            r8 = 2131826445(0x7f11170d, float:1.9285775E38)
        L_0x077c:
            r7.A00 = r8
            r7.A0P = r0
            com.facebookpay.form.cell.address.AddressCellParams r8 = new com.facebookpay.form.cell.address.AddressCellParams
            r8.<init>((X.C91875gz) r7)
            r9.add((java.lang.Object) r8)
            goto L_0x0696
        L_0x078a:
            if (r0 != 0) goto L_0x0696
            X.69P r0 = X.AnonymousClass69P.SHIPPING_ADDRESS
            boolean r51 = r10.contains(r0)
            X.69P r0 = X.AnonymousClass69P.CONTACT_INFORMATION
            boolean r52 = r10.contains(r0)
            r0 = 0
            r48 = r4
            r49 = r6
            r50 = r6
            com.facebookpay.form.cell.label.LabelCellParams r8 = r47.A00(r48, r49, r50, r51, r52)
            goto L_0x06fa
        L_0x07a5:
            if (r2 == 0) goto L_0x07f9
            java.util.Set<X.68F> r8 = r2.A0C
            X.68F r7 = X.AnonymousClass68F.REQUEST_PAYER_NAME
            boolean r17 = r8.contains(r7)
            X.68F r7 = X.AnonymousClass68F.REQUEST_PAYER_EMAIL
            boolean r16 = r8.contains(r7)
            X.68F r7 = X.AnonymousClass68F.REQUEST_PAYER_PHONE
            boolean r11 = r8.contains(r7)
        L_0x07bb:
            X.69P r8 = X.AnonymousClass69P.CONTACT_INFORMATION
            java.lang.String r7 = "nux_contact"
            r13.invoke(r8, r7)
            r44 = 2131826455(0x7f111717, float:1.9285795E38)
            if (r0 == 0) goto L_0x07ca
            r44 = 2131826571(0x7f11178b, float:1.928603E38)
        L_0x07ca:
            java.lang.String r7 = "Required value was null."
            if (r17 == 0) goto L_0x07f6
            if (r23 == 0) goto L_0x0821
            r41 = r23
        L_0x07d2:
            if (r16 == 0) goto L_0x07f3
            if (r22 == 0) goto L_0x081c
            r42 = r22
        L_0x07d8:
            if (r11 == 0) goto L_0x07f0
            if (r21 == 0) goto L_0x0817
            r43 = r21
        L_0x07de:
            X.5gx r7 = new X.5gx
            r40 = r7
            r45 = r12
            r46 = r0
            r40.<init>(r41, r42, r43, r44, r45, r46)
            com.facebookpay.form.cell.contactinfo.ContactInfoCellParams r8 = new com.facebookpay.form.cell.contactinfo.ContactInfoCellParams
            r8.<init>((X.C91855gx) r7)
            goto L_0x06fa
        L_0x07f0:
            r43 = r1
            goto L_0x07de
        L_0x07f3:
            r42 = r1
            goto L_0x07d8
        L_0x07f6:
            r41 = r1
            goto L_0x07d2
        L_0x07f9:
            r17 = 0
            r16 = 0
            r11 = 0
            goto L_0x07bb
        L_0x07ff:
            X.69P r8 = X.AnonymousClass69P.PAYMENT_METHOD
            java.lang.String r7 = "nux_credential"
            r13.invoke(r8, r7)
            r9.add((java.lang.Object) r5)
            goto L_0x0696
        L_0x080b:
            r12 = 0
            r0 = 0
            goto L_0x0692
        L_0x080f:
            r23 = r1
            goto L_0x0640
        L_0x0813:
            r53 = r1
            goto L_0x062c
        L_0x0817:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x081c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x0821:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x0826:
            com.google.common.collect.ImmutableList r6 = X.C18250wR.A0F(r9)
            return r6
        L_0x082b:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            throw r1
        L_0x0830:
            java.lang.Object r0 = r2.A00
            X.58J r0 = (X.AnonymousClass58J) r0
            int r0 = X.AnonymousClass58J.A00(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            return r6
        L_0x083d:
            java.lang.Object r0 = r2.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r6 = r0.A00
            return r6
        L_0x0844:
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0897
            r9 = 0
            java.lang.Object r8 = r0.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r8 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r8
            java.lang.Object r3 = r2.A00
            X.58M r3 = (X.AnonymousClass58M) r3
            X.58S r0 = r3.A1M
            X.56r r1 = r0.A06
            X.7Kx r0 = X.C86104wH.A0R(r1)
            if (r0 == 0) goto L_0x0895
            X.67Q r0 = r0.A00
            if (r0 == 0) goto L_0x0895
            int r0 = r0.ordinal()
        L_0x0863:
            r12 = 0
            r2 = 1
            if (r0 != r12) goto L_0x0880
            X.7Kx r0 = X.C86104wH.A0R(r1)
            if (r0 == 0) goto L_0x0880
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0880
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0880
            int r0 = r1.size()
            if (r0 != r2) goto L_0x0880
            r12 = 1
        L_0x0880:
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r3)
            if (r0 == 0) goto L_0x0893
            java.lang.Integer r9 = r0.A05
            java.lang.Integer r10 = r0.A04
        L_0x088a:
            X.69U r7 = X.AnonymousClass69U.A0X
            r11 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem r6 = new com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0893:
            r10 = r9
            goto L_0x088a
        L_0x0895:
            r0 = -1
            goto L_0x0863
        L_0x0897:
            r8 = 0
            X.69U r7 = X.AnonymousClass69U.A0X
            r11 = 0
            java.lang.Integer r9 = X.AnonymousClass006.A00
            com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem r6 = new com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem
            r10 = r8
            r12 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x08a5:
            X.6iy r0 = (X.C108806iy) r0
            goto L_0x0969
        L_0x08a9:
            X.6iy r0 = (X.C108806iy) r0
            java.lang.Object r6 = r2.A00
            X.58M r6 = (X.AnonymousClass58M) r6
            X.7Kx r1 = r6.A0Q
            java.lang.Object r3 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem r3 = (com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem) r3
            r2 = 0
            if (r3 == 0) goto L_0x09b5
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r3.A01
            if (r1 == 0) goto L_0x09b5
            java.lang.String r5 = r1.A04
        L_0x08be:
            if (r0 == 0) goto L_0x09b2
            java.lang.Object r1 = r0.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = (com.facebookpay.shippingaddress.model.ShippingAddress) r1
            if (r1 == 0) goto L_0x09b2
            java.lang.String r4 = r1.A04
        L_0x08c8:
            if (r3 == 0) goto L_0x09af
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r3.A01
            if (r1 == 0) goto L_0x09af
            java.lang.String r3 = r1.A06
        L_0x08d0:
            if (r0 == 0) goto L_0x08da
            java.lang.Object r1 = r0.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = (com.facebookpay.shippingaddress.model.ShippingAddress) r1
            if (r1 == 0) goto L_0x08da
            java.lang.String r2 = r1.A06
        L_0x08da:
            X.58U r9 = r6.A1P
            boolean r1 = r9.A0H()
            if (r1 == 0) goto L_0x0969
            if (r5 == 0) goto L_0x08f2
            if (r4 == 0) goto L_0x08f2
            boolean r1 = r5.equals(r4)
            if (r1 == 0) goto L_0x08f2
            boolean r1 = X.C04220Ms.A0I(r3, r2)
            if (r1 != 0) goto L_0x0969
        L_0x08f2:
            java.util.Map r1 = r9.A0J
            r1.clear()
            X.56q r4 = r9.A08
            X.7Kx r1 = X.C86104wH.A0R(r4)
            r3 = 0
            if (r1 == 0) goto L_0x09ac
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x09ac
            java.lang.Object r5 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r5 = (com.facebookpay.paymentmethod.model.PaymentMethod) r5
        L_0x090a:
            boolean r1 = r5 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r1 == 0) goto L_0x0969
            com.facebookpay.paymentmethod.model.CreditCard r5 = (com.facebookpay.paymentmethod.model.CreditCard) r5
            if (r5 == 0) goto L_0x0969
            java.lang.Integer r8 = r9.A0F(r5)
            com.facebook.graphql.impls.CardVerificationFieldsImpl r7 = r5.A01
            r6 = 0
            r2 = 1
            if (r7 == 0) goto L_0x092b
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r7.getStringValue(r1)
            if (r1 == 0) goto L_0x092b
            boolean r1 = X.AnonymousClass8bQ.A0m(r1)
            if (r1 != r2) goto L_0x092b
            r6 = 1
        L_0x092b:
            if (r8 == 0) goto L_0x0933
            int r1 = r8.intValue()
            if (r1 != 0) goto L_0x09a5
        L_0x0933:
            if (r6 != 0) goto L_0x09a5
            r6 = r3
        L_0x0936:
            java.util.Map r2 = r9.A0I
            java.lang.String r1 = r5.Aal()
            r2.put(r1, r6)
            X.7Kx r1 = X.C86104wH.A0R(r4)
            if (r6 == 0) goto L_0x0986
            if (r1 == 0) goto L_0x0984
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x0984
            java.lang.Integer r2 = r1.A00
        L_0x094f:
            X.7Kx r1 = X.C86104wH.A0R(r4)
            if (r1 == 0) goto L_0x095d
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x095d
            java.lang.String r3 = r1.A02
        L_0x095d:
            X.6iy r1 = new X.6iy
            r1.<init>(r2, r5, r3)
            X.7Kx r1 = X.AnonymousClass7Kx.A0B(r1, r6)
        L_0x0966:
            r4.A0H(r1)
        L_0x0969:
            if (r0 == 0) goto L_0x09b8
            java.lang.Object r8 = r0.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r8 = (com.facebookpay.shippingaddress.model.ShippingAddress) r8
            if (r8 == 0) goto L_0x09b8
            java.lang.String r9 = r8.A00
            java.lang.String r10 = X.AnonymousClass7BE.A02(r8)
            java.lang.String r11 = X.AnonymousClass7BE.A01(r8)
            X.69U r7 = X.AnonymousClass69U.A0e
            r12 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem r6 = new com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0984:
            r2 = r3
            goto L_0x094f
        L_0x0986:
            if (r1 == 0) goto L_0x09a3
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x09a3
            java.lang.Integer r2 = r1.A00
        L_0x0990:
            X.7Kx r1 = X.C86104wH.A0R(r4)
            if (r1 == 0) goto L_0x099e
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x099e
            java.lang.String r3 = r1.A02
        L_0x099e:
            X.7Kx r1 = X.AnonymousClass7Kx.A08(r2, r5, r3)
            goto L_0x0966
        L_0x09a3:
            r2 = r3
            goto L_0x0990
        L_0x09a5:
            r1 = 0
            X.88h r6 = new X.88h
            r6.<init>(r8, r1, r1)
            goto L_0x0936
        L_0x09ac:
            r5 = r3
            goto L_0x090a
        L_0x09af:
            r3 = r2
            goto L_0x08d0
        L_0x09b2:
            r4 = r2
            goto L_0x08c8
        L_0x09b5:
            r5 = r2
            goto L_0x08be
        L_0x09b8:
            r8 = 0
            X.69U r7 = X.AnonymousClass69U.A0e
            r12 = 0
            com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem r6 = new com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem
            r9 = r8
            r10 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x09c5:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            java.lang.Object r1 = r2.A00
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel r1 = (com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel) r1
            X.7Kx r1 = r1.A02
            java.lang.Object r1 = r1.A01
            com.google.common.collect.ImmutableCollection r1 = (com.google.common.collect.ImmutableCollection) r1
            if (r1 == 0) goto L_0x0a13
            java.util.ArrayList r4 = X.C18200wM.A0s(r1)
        L_0x09d7:
            java.lang.Class<com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl$XfbBusinessPaymentsHub> r2 = com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl.XfbBusinessPaymentsHub.class
            java.lang.String r1 = "xfb_business_payments_hub(interface_type:$interface_type)"
            com.facebook.pando.TreeJNI r3 = r0.getTreeValue(r1, r2)
            r1 = 0
            if (r3 == 0) goto L_0x09f4
            java.lang.Class<com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl$XfbBusinessPaymentsHub$PayoutTransactions> r2 = com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl.XfbBusinessPaymentsHub.PayoutTransactions.class
            java.lang.String r0 = "payout_transactions(after:$after,fe_id:$fe_id,filter:{\"filter_type\":$filter_type},first:$first,session_id:$session_id)"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r2)
            if (r2 == 0) goto L_0x09f4
            java.lang.Class<com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl$XfbBusinessPaymentsHub$PayoutTransactions$Edges> r1 = com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl.XfbBusinessPaymentsHub.PayoutTransactions.Edges.class
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r1 = r2.getTreeList(r0, r1)
        L_0x09f4:
            com.google.common.collect.ImmutableList$Builder r3 = X.C86164wN.A0Q()
            r3.addAll((java.lang.Iterable) r4)
            if (r1 == 0) goto L_0x0a16
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r1.iterator()
        L_0x0a05:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0a18
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r2)
            X.C86124wJ.A1L(r1, r0)
            goto L_0x0a05
        L_0x0a13:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
            goto L_0x09d7
        L_0x0a16:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x0a18:
            r3.addAll((java.lang.Iterable) r0)
            com.google.common.collect.ImmutableList r6 = r3.build()
            return r6
        L_0x0a20:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            java.lang.Throwable r6 = X.C128167j4.A03(r0)
            return r6
        L_0x0a27:
            java.lang.Object r1 = r2.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.8N7 r1 = (X.AnonymousClass8N7) r1
            java.lang.Object r6 = r1.invoke(r0)
            return r6
        L_0x0a32:
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            boolean r1 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            if (r1 == 0) goto L_0x0c7b
            java.lang.Object r4 = r2.A00
            X.58R r4 = (X.AnonymousClass58R) r4
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = (com.facebookpay.common.recyclerview.adapteritems.InlineFormItem) r0
            com.facebookpay.form.fragment.model.FormParams r7 = r0.A00
            java.util.ArrayList r0 = r7.A0I
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r9 = r0.iterator()
        L_0x0a4e:
            boolean r0 = r9.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0c60
            java.lang.Object r1 = r9.next()
            com.facebookpay.form.cell.CellParams r1 = (com.facebookpay.form.cell.CellParams) r1
            boolean r0 = r1 instanceof com.facebookpay.form.cell.text.TextCellParams
            if (r0 == 0) goto L_0x0a4e
            if (r1 == 0) goto L_0x0a4e
            int r8 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto L_0x0a4e
            r1 = 2
            if (r8 != r1) goto L_0x0a9c
            android.util.SparseArray r0 = r4.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0a85
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0a85
            r3 = r1
        L_0x0a7b:
            r1 = 0
            r0 = 1
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128217jA.A00(r1, r3, r1, r0, r0)
        L_0x0a81:
            r6.add(r0)
            goto L_0x0a4e
        L_0x0a85:
            X.56r r0 = r4.A06
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0a7b
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0a7b
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.PickupInfo r0 = (com.facebookpay.expresscheckout.models.PickupInfo) r0
            if (r0 == 0) goto L_0x0a7b
            java.lang.String r3 = r0.A01
            goto L_0x0a7b
        L_0x0a9c:
            r2 = 1
            if (r8 != r2) goto L_0x0acb
            android.util.SparseArray r0 = r4.A00
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0ab4
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0ab4
            r3 = r1
        L_0x0aae:
            r0 = 0
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128207j9.A00(r0, r3, r0, r2, r2)
            goto L_0x0a81
        L_0x0ab4:
            X.56r r0 = r4.A06
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0aae
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0aae
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.PickupInfo r0 = (com.facebookpay.expresscheckout.models.PickupInfo) r0
            if (r0 == 0) goto L_0x0aae
            java.lang.String r3 = r0.A00
            goto L_0x0aae
        L_0x0acb:
            if (r8 != 0) goto L_0x0a4e
            android.util.SparseArray r0 = r4.A00
            java.lang.Object r1 = r0.get(r5)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0ae2
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0ae2
            r3 = r1
        L_0x0adc:
            r0 = 0
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128227jB.A00(r0, r3, r0, r2, r2)
            goto L_0x0a81
        L_0x0ae2:
            X.56r r0 = r4.A06
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0adc
            java.lang.Object r0 = r0.A01
            X.6iy r0 = (X.C108806iy) r0
            if (r0 == 0) goto L_0x0adc
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.PickupInfo r0 = (com.facebookpay.expresscheckout.models.PickupInfo) r0
            if (r0 == 0) goto L_0x0adc
            java.lang.String r3 = r0.A03
            goto L_0x0adc
        L_0x0af9:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r1 = X.C18210wN.A0V()
            r1.toString()
            X.6cb r6 = new X.6cb
            r6.<init>(r0)
            return r6
        L_0x0b08:
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0b11:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r2.A00
            X.6jA r1 = (X.C108916jA) r1
            X.6nu r1 = r1.A02
            X.8kQ r6 = r1.A00(r0)
            return r6
        L_0x0b1e:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r2.A00
            X.6kd r1 = (X.C109796kd) r1
            X.34Z r1 = r1.A03
            X.Grx r3 = r1.A00
            r11 = 0
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r2 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            X.8l9 r5 = X.C63233h2.A01()
            java.util.Map r7 = r2.A07()
            java.util.Map r8 = r1.A07()
            java.lang.Class<com.instagram.fbpay.hub.contactinfo.graphql.IGFBPayShareableContactInfoQueryResponseImpl> r9 = com.instagram.fbpay.hub.contactinfo.graphql.IGFBPayShareableContactInfoQueryResponseImpl.class
            java.lang.String r6 = "IGFBPayShareableContactInfoQuery"
            r10 = 0
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r13 = r11
            r14 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.McB r2 = X.C103626Zx.A01
            X.McB r1 = X.C103226Yh.A00
            X.5kG r6 = X.C92935kG.A00(r0, r3, r4, r2, r1)
            return r6
        L_0x0b53:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r2.A00
            X.6kd r1 = (X.C109796kd) r1
            X.34Z r1 = r1.A03
            X.Grx r3 = r1.A00
            r11 = 0
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r2 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            X.8l9 r5 = X.C63233h2.A01()
            java.util.Map r7 = r2.A07()
            java.util.Map r8 = r1.A07()
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IGFBPayOrderInfoSectionQueryResponseImpl> r9 = com.instagram.graphql.instagramschemagraphservices.IGFBPayOrderInfoSectionQueryResponseImpl.class
            java.lang.String r6 = "IGFBPayOrderInfoSectionQuery"
            r10 = 0
            java.lang.String r14 = "fbpay_account_extended"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.McB r1 = X.C103626Zx.A00
            X.5kG r6 = X.AnonymousClass6BW.A00(r0, r3, r4, r1)
            return r6
        L_0x0b87:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r2.A00
            X.6gc r1 = (X.C107356gc) r1
            X.6eW r1 = r1.A01
            X.Grx r3 = r1.A00
            r11 = 0
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r2 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            X.8l9 r5 = X.C63233h2.A01()
            java.util.Map r7 = r2.A07()
            java.util.Map r8 = r1.A07()
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ShowConnectFBPayQueryResponseImpl> r9 = com.instagram.graphql.instagramschemagraphservices.ShowConnectFBPayQueryResponseImpl.class
            java.lang.String r6 = "ShowConnectFBPayQuery"
            r10 = 0
            java.lang.String r14 = "transaction_hub_metadata"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.7nT r1 = X.AnonymousClass7nT.A00
            X.5kG r6 = X.AnonymousClass6BW.A00(r0, r3, r4, r1)
            return r6
        L_0x0bbb:
            X.6sA r0 = (X.C113806sA) r0
            java.lang.Object r1 = r2.A00
            X.6gd r1 = (X.C107366gd) r1
            X.6i2 r5 = r1.A01
            X.Grx r4 = r5.A01
            r13 = 0
            X.3zb r6 = X.C67463zb.A00()
            X.3zb r3 = X.C67463zb.A00()
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "first"
            r6.A04(r1, r2)
            X.8l9 r7 = X.C63233h2.A01()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r3.getParamsCopy()
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayOrdersQueryResponseImpl> r11 = com.instagram.graphql.instagramschemagraphservices.IgFbPayOrdersQueryResponseImpl.class
            java.lang.String r8 = "IgFbPayOrdersQuery"
            r12 = 0
            java.lang.String r16 = "me"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            android.content.Context r3 = r5.A00
            r2 = 8
            com.facebook.redex.IDxFunctionShape362S0100000_2_I2 r1 = new com.facebook.redex.IDxFunctionShape362S0100000_2_I2
            r1.<init>(r3, r2)
            X.5kG r6 = X.AnonymousClass6BW.A00(r0, r4, r6, r1)
            return r6
        L_0x0c00:
            java.lang.Boolean r6 = X.C18180wK.A0Y()
            return r6
        L_0x0c05:
            X.7Dk r0 = (X.C120967Dk) r0
            java.lang.String r1 = "BIO"
            java.util.Map r0 = r0.A08
            boolean r0 = r0.containsKey(r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0c14:
            X.79P r0 = (X.AnonymousClass79P) r0
            java.lang.Object r6 = r0.A00
            r6.getClass()
            return r6
        L_0x0c1c:
            r1 = r0
            X.79P r1 = (X.AnonymousClass79P) r1
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x0c7b
            java.util.Iterator r4 = X.C86144wL.A0y(r1)
        L_0x0c2b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0c7b
            java.lang.Object r3 = r4.next()
            java.lang.Object r1 = r2.A00
            com.facebook.redex.IDxObjectShape133S0200000_2_I2 r1 = (com.facebook.redex.IDxObjectShape133S0200000_2_I2) r1
            java.lang.Object r1 = r1.A01
            X.8fJ r1 = (X.C142618fJ) r1
            java.lang.Object r1 = r1.apply(r3)
            boolean r1 = X.AnonymousClass0wJ.A1X(r1)
            if (r1 == 0) goto L_0x0c2b
            r0.add(r3)
            goto L_0x0c2b
        L_0x0c4b:
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            boolean r1 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem
            if (r1 == 0) goto L_0x0c7b
            java.lang.Object r2 = r2.A00
            X.58T r2 = (X.AnonymousClass58T) r2
            r1 = r0
            com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem r1 = (com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem) r1
            X.AnonymousClass58T.A04(r1, r2)
            return r0
        L_0x0c60:
            com.facebookpay.form.fragment.model.FormParams r3 = X.C86104wH.A0P(r7, r6)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r4.A01
            if (r0 == 0) goto L_0x0c7c
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0c7c
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x0c74
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0c7c
        L_0x0c74:
            X.69U r1 = X.AnonymousClass69U.A03
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r3, r2)
        L_0x0c7b:
            return r0
        L_0x0c7c:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            throw r1
        L_0x0c81:
            X.6gj r0 = (X.C107426gj) r0
            java.util.List r0 = r0.A01
            java.lang.Object r6 = X.C18240wQ.A0b(r0)
            return r6
        L_0x0c8a:
            java.lang.Object r0 = r2.A00
            X.6n9 r0 = (X.C111326n9) r0
            android.text.Editable r0 = r0.A0L
            java.lang.String r6 = r0.toString()
            return r6
        L_0x0c95:
            java.lang.Object r0 = r2.A00
            X.7QF r0 = (X.AnonymousClass7QF) r0
            X.6n9 r0 = r0.A01
            android.text.Editable r0 = r0.A0L
            java.lang.String r6 = r0.toString()
            return r6
        L_0x0ca2:
            X.0Ai r1 = X.C86124wJ.A16(r0)
            java.lang.Object r0 = r2.A00
            boolean r0 = r1.equals(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0cb1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        L_0x0cb6:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        L_0x0cbb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        L_0x0cc0:
            com.facebookpay.form.fragment.model.FormParams r2 = X.C86104wH.A0P(r7, r6)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r4.A02
            java.lang.String r0 = "ecpPaymentRequest"
            if (r1 != 0) goto L_0x0cce
            X.C04220Ms.A0E(r0)
            throw r3
        L_0x0cce:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r1.A05
            if (r0 == 0) goto L_0x0ce2
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x0cda
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0ce2
        L_0x0cda:
            X.69U r0 = X.AnonymousClass69U.A03
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r6 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r6.<init>(r0, r2, r1)
            return r6
        L_0x0ce2:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        L_0x0ce7:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x0d0c
            java.lang.Class<com.facebook.graphql.impls.InitLinkPaypalResponseImpl$InitLinkPaypal> r2 = com.facebook.graphql.impls.InitLinkPaypalResponseImpl.InitLinkPaypal.class
            java.lang.String r1 = "init_link_paypal(input:$input)"
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0d0c
            java.lang.Class<com.facebook.graphql.impls.InitLinkPaypalResponseImpl$InitLinkPaypal$PaymentsError> r1 = com.facebook.graphql.impls.InitLinkPaypalResponseImpl.InitLinkPaypal.PaymentsError.class
            java.lang.String r0 = "payments_error"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x0d0c
            com.facebook.pando.TreeJNI r0 = X.C86124wJ.A0T(r0)
            com.facebook.graphql.impls.SharedPaymentsErrorImpl r0 = (com.facebook.graphql.impls.SharedPaymentsErrorImpl) r0
            if (r0 == 0) goto L_0x0d0c
        L_0x0d07:
            X.5kA r6 = X.AnonymousClass7Fb.A01(r0)
            return r6
        L_0x0d0c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape326S0100000_2_I2.apply(java.lang.Object):java.lang.Object");
    }

    public IDxFunctionShape326S0100000_2_I2(AnonymousClass7HL r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public IDxFunctionShape326S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
