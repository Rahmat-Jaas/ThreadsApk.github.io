package com.facebook.redex;

import X.C143158gC;
import X.M5J;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

public class IDxObserverShape99S0200000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape99S0200000_2_I2(M5J m5j, C143158gC r2, int i) {
        this.A02 = i;
        switch (i) {
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
            case 32:
                this.A00 = m5j;
                this.A01 = r2;
                break;
            case 31:
                this.A01 = r2;
                this.A00 = m5j;
                break;
            default:
                this.A01 = m5j;
                this.A00 = r2;
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.7Kx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: X.7Kx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v329, resolved type: X.7Kx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v330, resolved type: X.7Kx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v331, resolved type: X.7Kx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v332, resolved type: X.7Kx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v336, resolved type: X.7Kx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v239, resolved type: android.widget.TextView} */
    /* JADX WARNING: type inference failed for: r2v191, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r10v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v196, types: [java.lang.Enum] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1037:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1067:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1069:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0512, code lost:
        r0 = "LOCKED".equalsIgnoreCase(((X.C104926cb) r0).A00);
        r2 = (android.widget.TextView) r1.A01;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0520, code lost:
        if (r0 == false) goto L_0x170f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0522, code lost:
        r2.setVisibility(0);
        r2.setText(2131827234);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x052c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0562, code lost:
        if (r2 == false) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0567, code lost:
        r2 = X.AnonymousClass7Kx.A0O(r0);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0578, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x057a, code lost:
        ((X.M5J) r1.A00).A0F(r1);
        r1 = r1.A01;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05bd, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05bf, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x061d, code lost:
        X.C13950oZ.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0620, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07d2, code lost:
        if (r1.length() == 0) goto L_0x07d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0b1d, code lost:
        if (r1 == false) goto L_0x0b1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:846:0x15ff, code lost:
        X.AnonymousClass7Kx.A0H(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x1602, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:910:0x16fa, code lost:
        r0 = java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:911:0x16fe, code lost:
        r3.A0G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:912:0x1701, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:914:0x170d, code lost:
        if (r1 == false) goto L_0x170f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:915:0x170f, code lost:
        r0 = 8;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:916:0x1711, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:917:0x1714, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:918:0x1715, code lost:
        r1 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1.A00;
        r1.setPrimaryActionIsLoading(true);
        r1.setSecondaryButtonEnabled(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:919:0x1720, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:924:0x1772, code lost:
        r2.postDelayed(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:925:0x1775, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:956:0x1841, code lost:
        r4.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:957:0x1844, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x185e, code lost:
        r1 = (X.C143158gC) r1;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:965:0x1860, code lost:
        r1.onChanged(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:966:0x1863, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:968:0x1875, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:969:0x1877, code lost:
        ((X.M5J) r0).A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:970:0x187c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r1.A0H(r3);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0710  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x071d  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0aac  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0ae1  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r55) {
        /*
            r54 = this;
            r1 = r54
            r0 = r55
            int r2 = r1.A02
            switch(r2) {
                case 0: goto L_0x002d;
                case 1: goto L_0x008e;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00e9;
                case 4: goto L_0x0ed5;
                case 5: goto L_0x0140;
                case 6: goto L_0x0211;
                case 7: goto L_0x0ffd;
                case 8: goto L_0x02ed;
                case 9: goto L_0x032f;
                case 10: goto L_0x0009;
                case 11: goto L_0x043f;
                case 12: goto L_0x0009;
                case 13: goto L_0x045c;
                case 14: goto L_0x123c;
                case 15: goto L_0x1269;
                case 16: goto L_0x0479;
                case 17: goto L_0x04aa;
                case 18: goto L_0x0f9a;
                case 19: goto L_0x04dc;
                case 20: goto L_0x1702;
                case 21: goto L_0x0512;
                case 22: goto L_0x0506;
                case 23: goto L_0x12a0;
                case 24: goto L_0x179e;
                case 25: goto L_0x17ec;
                case 26: goto L_0x052d;
                case 27: goto L_0x0545;
                case 28: goto L_0x055c;
                case 29: goto L_0x0565;
                case 30: goto L_0x056c;
                case 31: goto L_0x0585;
                case 32: goto L_0x057a;
                case 33: goto L_0x1845;
                case 34: goto L_0x12b7;
                case 35: goto L_0x1864;
                case 36: goto L_0x0fee;
                case 37: goto L_0x059e;
                case 38: goto L_0x0621;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.7Kx r3 = X.C86104wH.A0S(r0)
            boolean r0 = X.AnonymousClass7Kx.A0P(r3)
            if (r0 != 0) goto L_0x002c
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r1.A00
            X.7Et r0 = (X.C121207Et) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass6I5.A00(r0)
            if (r0 != 0) goto L_0x002c
        L_0x0025:
            java.lang.Object r1 = r1.A01
            X.M5J r1 = (X.M5J) r1
        L_0x0029:
            r1.A0H(r3)
        L_0x002c:
            return
        L_0x002d:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            r3 = 0
            X.C04220Ms.A0B(r0, r3)
            boolean r2 = X.AnonymousClass7Kx.A0P(r0)
            if (r2 != 0) goto L_0x1715
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r0.A01
            if (r2 == 0) goto L_0x0059
            java.lang.Object r1 = r1.A01
            X.5EV r1 = (X.AnonymousClass5EV) r1
            r1.A06()
            X.0ZU r0 = r1.A08
            if (r0 == 0) goto L_0x0051
            r0.invoke()
        L_0x0051:
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x002c
            X.0ZU r0 = r1.A07
            goto L_0x05bd
        L_0x0059:
            boolean r0 = X.AnonymousClass7Kx.A0O(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r1.A01
            X.5EV r1 = (X.AnonymousClass5EV) r1
            r1.A06()
            X.0ZU r0 = r1.A05
            if (r0 == 0) goto L_0x006d
            r0.invoke()
        L_0x006d:
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.Luf r2 = new X.Luf
            r2.<init>(r0)
            java.lang.String r0 = "There was a problem"
            r2.A08(r0)
            java.lang.String r1 = "Try again later."
            X.Lpc r0 = r2.A01
            r0.A0C = r1
            java.lang.String r1 = "OK"
            X.7Lh r0 = X.C122197Lh.A00
            r2.A05(r0, r1)
            X.L7u r0 = r2.A00()
            goto L_0x061d
        L_0x008e:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x002c
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x002c
            java.lang.Object r5 = r1.A00
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r4 = r1.A01
            com.instagram.ui.widget.radiogroup.IgRadioGroup r4 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r4
            r4.removeAllViews()
            java.util.Iterator r3 = r0.iterator()
        L_0x00a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1369
            java.lang.Object r2 = r3.next()
            com.fbpay.w3c.CardDetails r2 = (com.fbpay.w3c.CardDetails) r2
            android.content.Context r1 = r5.requireContext()
            X.51w r0 = new X.51w
            r0.<init>(r1)
            r0.A00(r2)
            X.C18200wM.A1C(r0)
            r4.addView(r0)
            goto L_0x00a7
        L_0x00c6:
            java.lang.Object r2 = X.AnonymousClass7JD.A00(r0)
            r0 = 1
            boolean r0 = X.C18190wL.A1Z(r2, r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r3 = r1.A01
            X.6mc r3 = (X.C110996mc) r3
            java.lang.Object r2 = r1.A00
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r2
            java.lang.String r1 = "DEFAULT_VALUE"
            X.6uD r0 = r3.A04
            X.M5J r2 = r0.A02(r2, r1)
            X.066 r1 = r3.A02
            X.8gC r0 = r3.A03
            r2.A0C(r1, r0)
            return
        L_0x00e9:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            r3 = 0
            if (r2 == 0) goto L_0x011d
            java.lang.Object r9 = r0.A01
            if (r9 == 0) goto L_0x011d
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.0Oe r0 = r0.A0H
            java.lang.Object r0 = r0.get()
            X.C04220Ms.A06(r0)
            java.lang.String r5 = "https://www.instagram.com/payments/paypal_close/"
            java.lang.Object r2 = r1.A01
            X.58J r2 = (X.AnonymousClass58J) r2
            X.56r r0 = r2.A0H
            java.lang.Object r6 = r0.A08()
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L_0x13a0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r6 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r6
            com.fbpay.logging.LoggingContext r8 = r2.A02
            if (r8 != 0) goto L_0x1386
            X.C86124wJ.A19()
            throw r3
        L_0x011d:
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.A01
            X.58J r2 = (X.AnonymousClass58J) r2
            X.56r r1 = r2.A0I
            X.7Kx r0 = X.AnonymousClass7Kx.A05(r0, r3)
            r1.A0H(r0)
            X.56q r4 = r2.A0A
            int r0 = X.AnonymousClass58J.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            goto L_0x1841
        L_0x0140:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x0199
            java.lang.Object r2 = r1.A01
            X.58M r2 = (X.AnonymousClass58M) r2
            X.7Kx r3 = r2.A0M
            java.lang.Object r3 = r3.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r3 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r3
            r12 = 0
            if (r3 == 0) goto L_0x0197
            com.facebookpay.paymentmethod.model.PaymentMethod r13 = r3.A01
        L_0x015b:
            java.lang.String r22 = "Required value was null."
            if (r13 == 0) goto L_0x1651
            java.lang.Object r6 = r0.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            if (r6 == 0) goto L_0x13a5
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer> r3 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.class
            java.lang.String r0 = "request_payment_container(input:$input)"
            com.facebook.pando.TreeJNI r4 = r6.getTreeValue(r0, r3)
            if (r4 == 0) goto L_0x13a5
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer$ContainerList> r3 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.ContainerList.class
            java.lang.String r0 = "container_list"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r3)
            if (r0 == 0) goto L_0x13a5
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r0.iterator()
        L_0x0181:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x13a6
            com.facebook.pando.TreeJNI r3 = X.C18210wN.A0G(r4)
            java.lang.String r0 = "container_id"
            java.lang.String r0 = r3.getStringValue(r0)
            if (r0 == 0) goto L_0x0181
            r8.add(r0)
            goto L_0x0181
        L_0x0197:
            r13 = r12
            goto L_0x015b
        L_0x0199:
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 == 0) goto L_0x002c
            java.lang.Throwable r4 = r0.A02
            boolean r2 = r4 instanceof X.C92875kA
            if (r2 == 0) goto L_0x01c5
            java.lang.Object r3 = r1.A01
            X.58M r3 = (X.AnonymousClass58M) r3
            X.56r r2 = r3.A0u
            java.lang.String r1 = "null cannot be cast to non-null type com.fbpay.util.exceptions.PaymentsUserFacingException"
            X.C04220Ms.A0C(r4, r1)
            X.5kA r4 = (X.C92875kA) r4
            X.7JD r1 = X.AnonymousClass7Fb.A00(r4)
            r2.A0H(r1)
            X.56q r4 = r3.A0s
            X.7Su r1 = X.C122537Su.A00
        L_0x01bd:
            X.8fJ r1 = (X.C142618fJ) r1
            X.7Kx r0 = X.AnonymousClass7Kx.A02(r1, r0)
            goto L_0x1841
        L_0x01c5:
            boolean r2 = r4 instanceof X.AnonymousClass88J
            if (r2 == 0) goto L_0x01d2
            java.lang.Object r1 = r1.A01
            X.58M r1 = (X.AnonymousClass58M) r1
            X.56q r4 = r1.A0s
            X.7Sv r1 = X.C122547Sv.A00
            goto L_0x01bd
        L_0x01d2:
            boolean r2 = r4 instanceof X.C1373088b
            if (r2 != 0) goto L_0x0208
            boolean r2 = r4 instanceof X.C92885kB
            if (r2 != 0) goto L_0x0208
            boolean r2 = r4 instanceof X.C1373588g
            if (r2 != 0) goto L_0x0208
            java.lang.Object r3 = r1.A01
            X.58M r3 = (X.AnonymousClass58M) r3
            X.56r r2 = r3.A0u
            r6 = 0
            r1 = 2131826479(0x7f11172f, float:1.9285844E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r1 = 2131826476(0x7f11172c, float:1.9285837E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            X.68y r5 = X.C973368y.A03
            com.facebookpay.common.models.ErrorDialogContent r4 = new com.facebookpay.common.models.ErrorDialogContent
            r7 = r6
            r8 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.AnonymousClass7JD.A02(r2, r4)
            X.56q r4 = r3.A0s
            X.7Sw r1 = X.C122557Sw.A00
            goto L_0x01bd
        L_0x0208:
            java.lang.Object r1 = r1.A01
            X.58M r1 = (X.AnonymousClass58M) r1
            X.56q r4 = r1.A0s
            X.7Sx r1 = X.C122567Sx.A00
            goto L_0x01bd
        L_0x0211:
            java.lang.Object r2 = r1.A00
            X.5hW r2 = (X.C92055hW) r2
            X.56q r6 = r2.A05
            java.lang.Object r5 = r6.A08()
            r5.getClass()
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            java.lang.Object r3 = r1.A01
            X.7Ih r3 = (X.AnonymousClass7Ih) r3
            int r1 = r3.A02
            java.lang.Object r4 = r5.get(r1)
            r5.put(r1, r0)
            r6.A0H(r5)
            boolean r1 = r2 instanceof X.C92035hU
            if (r1 == 0) goto L_0x02b9
            X.5hU r2 = (X.C92035hU) r2
            int r1 = r3.A02
            r3 = 13
            if (r1 != r3) goto L_0x002c
            if (r4 != 0) goto L_0x02b2
            X.69W r1 = X.AnonymousClass69W.EMPTY
        L_0x0240:
            if (r55 != 0) goto L_0x02ab
            X.69W r4 = X.AnonymousClass69W.EMPTY
        L_0x0244:
            if (r1 != r4) goto L_0x024a
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x002c
        L_0x024a:
            android.util.SparseArray r1 = r2.A00
            r0 = 15
            java.lang.Object r8 = X.C86124wJ.A0k(r1, r0)
            X.5hR r8 = (X.C92005hR) r8
            java.lang.Integer r10 = X.AnonymousClass006.A0Y
            java.lang.String r11 = ""
            r9 = 0
            r13 = 2131823160(0x7f110a38, float:1.9279112E38)
            r14 = 2131823165(0x7f110a3d, float:1.9279122E38)
            r12 = r9
            X.6ru r7 = X.C116916xl.A00(r9, r10, r11, r12, r13, r14)
            java.lang.String r6 = r4.A04
            r1 = 2131823161(0x7f110a39, float:1.9279114E38)
            r5 = 0
            X.5hi r0 = new X.5hi
            r0.<init>()
            r0.A02 = r9
            r0.A01 = r1
            r0.A00 = r5
            r0.A00(r6)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r7, r0)
            r8.A00 = r0
            X.56r r1 = r8.A0C
            android.text.InputFilter r0 = X.C92005hR.A00(r8)
            r1.A0H(r0)
            android.util.SparseArray r0 = r2.A00
            java.lang.Object r3 = X.C86124wJ.A0k(r0, r3)
            X.5hd r3 = (X.C92105hd) r3
            X.69W r0 = X.AnonymousClass69W.EMPTY
            if (r4 == r0) goto L_0x1656
            X.69W r0 = X.AnonymousClass69W.UNKNOWN
            if (r4 == r0) goto L_0x1656
            X.56q r2 = r3.A06
            int r1 = r4.A02()
            X.75V r0 = new X.75V
            r0.<init>((int) r1)
            r2.A0H(r0)
            X.56r r0 = r3.A00
            X.C86114wI.A1B(r0, r5)
            return
        L_0x02ab:
            java.lang.String r0 = (java.lang.String) r0
            X.69W r4 = X.AnonymousClass69W.A00(r0)
            goto L_0x0244
        L_0x02b2:
            java.lang.String r4 = (java.lang.String) r4
            X.69W r1 = X.AnonymousClass69W.A00(r4)
            goto L_0x0240
        L_0x02b9:
            boolean r1 = r2 instanceof X.C92025hT
            if (r1 != 0) goto L_0x002c
            boolean r1 = r2 instanceof X.C92015hS
            if (r1 == 0) goto L_0x02cf
            boolean r1 = r3 instanceof X.C91975hO
            if (r1 == 0) goto L_0x002c
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x002c
            r2.A0N()
            return
        L_0x02cf:
            X.5hV r2 = (X.C92045hV) r2
            boolean r1 = r3 instanceof X.C91975hO
            if (r1 != 0) goto L_0x02e1
            boolean r1 = r3 instanceof X.C91945hL
            if (r1 != 0) goto L_0x02e1
            boolean r1 = r3 instanceof X.C91965hN
            if (r1 != 0) goto L_0x02e1
            boolean r1 = r3 instanceof X.C91995hQ
            if (r1 == 0) goto L_0x002c
        L_0x02e1:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x002c
            if (r4 == 0) goto L_0x002c
            r2.A0N()
            return
        L_0x02ed:
            java.lang.Object r5 = X.AnonymousClass7JD.A01(r0)
            X.8e7 r5 = (X.AnonymousClass8e7) r5
            if (r5 == 0) goto L_0x002c
            java.lang.Object r2 = r1.A00
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r1.A01
            X.585 r4 = (X.AnonymousClass585) r4
            boolean r0 = r5 instanceof X.C128367jS
            if (r0 == 0) goto L_0x002c
            X.7jS r5 = (X.C128367jS) r5
            java.lang.String r0 = r5.A01
            java.lang.Object r1 = r2.get(r0)
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L_0x0328
            java.lang.Object r0 = r1.A00
            int r3 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r2 = r1.A01
            com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel r2 = (com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel) r2
            if (r2 == 0) goto L_0x0320
            android.os.Bundle r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.A0A(r1, r0)
        L_0x0320:
            X.56r r4 = r4.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x1841
        L_0x0328:
            int r0 = r2.size()
            int r3 = r0 + -1
            goto L_0x0320
        L_0x032f:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r3 = X.AnonymousClass7Kx.A0R(r0)
            java.lang.String r8 = "Required value was null."
            r12 = 0
            r2 = 0
            if (r3 == 0) goto L_0x03c3
            java.lang.Object r7 = r0.A01
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            if (r7 == 0) goto L_0x166a
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer> r3 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.class
            java.lang.String r0 = "request_payment_container(input:$input)"
            com.facebook.pando.TreeJNI r4 = r7.getTreeValue(r0, r3)
            if (r4 == 0) goto L_0x166a
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer$NonAuthStepUpError> r3 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.NonAuthStepUpError.class
            java.lang.String r0 = "non_auth_step_up_error"
            com.facebook.pando.TreeJNI r6 = r4.getTreeValue(r0, r3)
            if (r6 == 0) goto L_0x166a
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer$NonAuthStepUpError$StepUpRequirements> r5 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.NonAuthStepUpError.StepUpRequirements.class
            java.lang.String r3 = "step_up_requirements"
            com.google.common.collect.ImmutableList r0 = r6.getTreeList(r3, r5)
            if (r0 == 0) goto L_0x166a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x166a
            X.7ke r9 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r1.A00
            X.6mt r0 = (X.C111166mt) r0
            com.fbpay.logging.LoggingContext r11 = r0.A03
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r0.A02
            long r13 = X.C86164wN.A0A(r0)
            X.LcE r10 = r0.Aam()
            java.lang.Object r0 = r1.A01
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x03c1
            X.7DP r4 = X.AnonymousClass7DP.A00(r0)
        L_0x0383:
            com.google.common.collect.ImmutableList r0 = r6.getTreeList(r3, r5)
            if (r0 == 0) goto L_0x1665
            java.lang.Object r1 = r0.get(r12)
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x1665
            java.lang.String r0 = "PAYFBPayMIBToCIBStepUp"
            boolean r0 = r1.isFulfilled(r0)
            if (r0 == 0) goto L_0x03a9
            java.lang.Class<com.facebook.graphql.impls.FBPayNonAuthStepUpImpl> r0 = com.facebook.graphql.impls.FBPayNonAuthStepUpImpl.class
            com.facebook.pando.TreeJNI r3 = r1.reinterpret(r0)
            if (r3 == 0) goto L_0x03a9
            X.20b r1 = X.C302120b.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "step_up_type"
            java.lang.Enum r2 = X.C86104wH.A0a(r3, r1, r0)
        L_0x03a9:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.util.LinkedHashMap r12 = X.C18220wO.A0y()
            if (r4 == 0) goto L_0x03b6
            X.AnonymousClass7Kr.A0B(r4, r12)
        L_0x03b6:
            if (r1 == 0) goto L_0x03bd
            java.lang.String r0 = "non_auth_step_up_type"
            r12.put(r0, r1)
        L_0x03bd:
            r9.A0A(r10, r11, r12, r13)
            return
        L_0x03c1:
            r4 = r2
            goto L_0x0383
        L_0x03c3:
            boolean r3 = X.AnonymousClass7Kx.A0O(r0)
            if (r3 == 0) goto L_0x002c
            java.lang.Throwable r3 = r0.A02
            boolean r0 = r3 instanceof X.C92885kB
            if (r0 == 0) goto L_0x043d
            r0 = r3
            X.5kB r0 = (X.C92885kB) r0
            if (r0 == 0) goto L_0x043d
            X.6tp r0 = r0.A00
            if (r0 == 0) goto L_0x043d
            java.util.List<X.6uL> r4 = r0.A00
        L_0x03da:
            X.7ke r5 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r1.A00
            X.6mt r0 = (X.C111166mt) r0
            com.fbpay.logging.LoggingContext r7 = r0.A03
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r0.A02
            long r9 = X.C86164wN.A0A(r0)
            X.LcE r6 = r0.Aam()
            java.lang.Object r0 = r1.A01
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x043b
            X.7DP r1 = X.AnonymousClass7DP.A00(r0)
        L_0x03f8:
            if (r4 == 0) goto L_0x0424
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0424
            java.lang.Object r0 = r4.get(r12)
            X.6uL r0 = (X.C115006uL) r0
            if (r0 == 0) goto L_0x0424
            java.util.List<X.6v0> r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0424
            java.lang.Object r0 = r4.get(r12)
            X.6uL r0 = (X.C115006uL) r0
            if (r0 == 0) goto L_0x16ec
            java.util.List<X.6v0> r0 = r0.A00
            java.lang.Object r0 = r0.get(r12)
            X.6v0 r0 = (X.C115406v0) r0
            if (r0 == 0) goto L_0x16ec
            java.lang.String r2 = r0.A00
        L_0x0424:
            java.util.LinkedHashMap r8 = X.C18220wO.A0y()
            if (r1 == 0) goto L_0x042d
            X.AnonymousClass7Kr.A0B(r1, r8)
        L_0x042d:
            X.C86114wI.A1P(r3, r8)
            if (r2 == 0) goto L_0x0437
            java.lang.String r0 = "auth_step_up_type"
            r8.put(r0, r2)
        L_0x0437:
            r5.A0A(r6, r7, r8, r9)
            return
        L_0x043b:
            r1 = r2
            goto L_0x03f8
        L_0x043d:
            r4 = r2
            goto L_0x03da
        L_0x043f:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            X.67Q r4 = r0.A00
            X.67Q r3 = X.AnonymousClass67Q.SUCCESS
            if (r4 != r3) goto L_0x002c
            java.lang.Object r0 = r1.A01
            X.57w r0 = (X.C883957w) r0
            X.56q r2 = r0.A04
            boolean r0 = X.C18180wK.A1Z(r4, r3)
            X.C86114wI.A1B(r2, r0)
            java.lang.Object r0 = r1.A00
            X.M5J r0 = (X.M5J) r0
            r2.A0J(r0)
            return
        L_0x045c:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0P(r0)
            if (r2 != 0) goto L_0x046a
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x002c
        L_0x046a:
            java.lang.Object r2 = r1.A00
            X.5gU r2 = (X.C91595gU) r2
            X.C04220Ms.A07(r0)
            java.lang.Object r1 = r1.A01
            X.5Bg r1 = (X.C88935Bg) r1
            r2.A0A(r1, r0)
            return
        L_0x0479:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 == 0) goto L_0x0490
            java.lang.Object r2 = r1.A01
            X.57F r2 = (X.AnonymousClass57F) r2
            java.lang.Throwable r1 = r0.A02
            r1.getClass()
            X.56r r0 = r2.A01
            X.AnonymousClass7JD.A03(r0, r1)
            return
        L_0x0490:
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r1 = r1.A01
            X.57F r1 = (X.AnonymousClass57F) r1
            java.lang.Object r3 = X.AnonymousClass7Kx.A0D(r0)
            X.56r r2 = r1.A02
            r1 = 0
            X.79P r0 = new X.79P
            r0.<init>(r3, r1)
            X.AnonymousClass7JD.A03(r2, r0)
            return
        L_0x04aa:
            java.lang.Object r4 = r1.A01
            X.M5J r4 = (X.M5J) r4
            java.lang.Object r3 = r1.A00
            X.56F r3 = (X.AnonymousClass56F) r3
            X.584 r1 = r3.A01
            X.56q r1 = r1.A06
            java.lang.Object r2 = r1.A08()
            X.79P r1 = new X.79P
            r1.<init>(r0, r2)
            r4.A0G(r1)
            X.584 r0 = r3.A01
            X.56q r0 = r0.A04
            java.lang.Object r1 = r0.A08()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002c
            X.6mw r0 = r3.A00
            android.view.View r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x04dc:
            java.lang.Object r2 = r1.A00
            X.7Ic r2 = (X.AnonymousClass7Ic) r2
            java.lang.Object r3 = r1.A01
            X.M5J r3 = (X.M5J) r3
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r1 = X.AnonymousClass7Kx.A0R(r0)
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.A01
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "REPROCESS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x002c
            X.7k3 r1 = r2.A00
            r1.getClass()
            X.6gT r0 = r1.A00
            if (r0 == 0) goto L_0x16f1
            r0 = 0
            r1.A00(r0)
            return
        L_0x0506:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r0)
        L_0x0512:
            X.6cb r0 = (X.C104926cb) r0
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "LOCKED"
            boolean r0 = r0.equalsIgnoreCase(r2)
            java.lang.Object r2 = r1.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r0 == 0) goto L_0x170f
            r0 = 0
            r2.setVisibility(r0)
            r0 = 2131827234(0x7f111a22, float:1.9287375E38)
            r2.setText(r0)
            return
        L_0x052d:
            java.lang.Object r2 = r1.A00
            X.56m r2 = (X.C880456m) r2
            X.79j r2 = r2.A02
            java.lang.Object r1 = r1.A01
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            X.7Kx r3 = X.AnonymousClass7Kx.A05(r1, r0)
            X.56m r1 = r2.A03
            java.lang.Object r0 = r1.A08()
            if (r0 == r3) goto L_0x002c
            goto L_0x0029
        L_0x0545:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.A00
            X.M5J r2 = (X.M5J) r2
            r2.A0F(r1)
            java.lang.Object r1 = r1.A01
            X.8gC r1 = (X.C143158gC) r1
            java.lang.Object r0 = r0.A01
            goto L_0x1860
        L_0x055c:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 != 0) goto L_0x057a
            goto L_0x0567
        L_0x0565:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
        L_0x0567:
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            goto L_0x0578
        L_0x056c:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 != 0) goto L_0x057a
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
        L_0x0578:
            if (r2 == 0) goto L_0x002c
        L_0x057a:
            java.lang.Object r2 = r1.A00
            X.M5J r2 = (X.M5J) r2
            r2.A0F(r1)
            java.lang.Object r1 = r1.A01
            goto L_0x185e
        L_0x0585:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r2 = r1.A01
            X.8gC r2 = (X.C143158gC) r2
            r2.onChanged(r0)
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 != 0) goto L_0x059a
            boolean r0 = X.AnonymousClass7Kx.A0R(r0)
            if (r0 == 0) goto L_0x002c
        L_0x059a:
            java.lang.Object r0 = r1.A00
            goto L_0x1877
        L_0x059e:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            r3 = 0
            X.C04220Ms.A0B(r0, r3)
            boolean r2 = X.AnonymousClass7Kx.A0P(r0)
            if (r2 != 0) goto L_0x1715
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x05c3
            java.lang.Object r2 = r0.A01
            if (r2 == 0) goto L_0x05c3
            java.lang.Object r0 = r1.A01
            X.5jD r0 = (X.AnonymousClass5jD) r0
            X.AnonymousClass7KT.A02(r0)
            X.0ZU r0 = r0.A0E
        L_0x05bd:
            if (r0 == 0) goto L_0x002c
            r0.invoke()
            return
        L_0x05c3:
            boolean r0 = X.AnonymousClass7Kx.A0O(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r1.A01
            X.5jD r1 = (X.AnonymousClass5jD) r1
            android.content.Context r2 = r1.requireContext()
            com.facebookpay.connect.models.ConnectErrorDialogConfig r7 = r1.A03
            r0 = 34
            kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48 r4 = new kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48
            r4.<init>(r1, r0)
            r3 = 1
            X.C04220Ms.A0B(r7, r3)
            X.77R r1 = X.AnonymousClass7Kz.A0M()
            X.7Ec r6 = X.AnonymousClass7Kz.A0G()
            r5 = 46
            r0 = 41
            android.graphics.drawable.Drawable r5 = r6.A04(r2, r5, r0)
            int r0 = r7.A03
            java.lang.String r11 = r2.getString(r0)
            int r0 = r7.A00
            java.lang.String r12 = r2.getString(r0)
            int r0 = r7.A02
            java.lang.String r13 = r2.getString(r0)
            int r0 = r7.A01
            X.67N r6 = X.AnonymousClass67N.DISMISS_AND_CLOSE
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            com.facebook.redex.IDxPDismissShape737S0100000_2_I2 r9 = new com.facebook.redex.IDxPDismissShape737S0100000_2_I2
            r9.<init>(r4, r3)
            r7 = 0
            r8 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r0
            X.6sZ r0 = X.C117016xz.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.app.Dialog r0 = r1.A01(r2, r0)
        L_0x061d:
            X.C13950oZ.A00(r0)
            return
        L_0x0621:
            X.IM8 r0 = (X.IM8) r0
            java.lang.Object r9 = r1.A01
            X.5x9 r9 = (X.AnonymousClass5x9) r9
            java.lang.Object r10 = r1.A00
            android.view.View r10 = (android.view.View) r10
            r1 = 2131302727(0x7f091947, float:1.8223548E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0I(r10, r1)
            r9.A02 = r1
            r1 = 2131303186(0x7f091b12, float:1.822448E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0I(r10, r1)
            r9.A03 = r1
            boolean r3 = r0.A0l
            java.lang.String r2 = "loadingSpinnerView"
            android.view.View r1 = r9.A02
            if (r3 == 0) goto L_0x065a
            if (r1 == 0) goto L_0x0655
            r8 = 0
            r1.setVisibility(r8)
        L_0x064b:
            java.lang.String r3 = r0.A0b
            if (r3 == 0) goto L_0x002c
            android.view.View r2 = r9.A03
            if (r2 != 0) goto L_0x1721
            java.lang.String r2 = "updateInfoToastView"
        L_0x0655:
            X.C04220Ms.A0E(r2)
        L_0x0658:
            r0 = 0
            throw r0
        L_0x065a:
            if (r1 == 0) goto L_0x0655
            r7 = 8
            r1.setVisibility(r7)
            java.lang.String r1 = r0.A0F
            r9.A05 = r1
            androidx.fragment.app.FragmentActivity r1 = r9.getActivity()
            X.E2V r2 = X.E2V.A03(r1)
            java.lang.String r1 = r9.A05
            r2.setTitle(r1)
            r1 = 2131297882(0x7f09065a, float:1.8213721E38)
            android.view.View r5 = r10.findViewById(r1)
            r2 = 2131298367(0x7f09083f, float:1.8214705E38)
            android.view.View r1 = r5.findViewById(r2)
            r8 = 0
            r1.setPadding(r8, r8, r8, r8)
            boolean r6 = r0.A0i
            android.view.View r2 = r10.findViewById(r2)
            r1 = 1132920832(0x43870000, float:270.0)
            if (r6 == 0) goto L_0x0690
            r1 = 1119092736(0x42b40000, float:90.0)
        L_0x0690:
            r2.setRotation(r1)
            r1 = 2131308582(0x7f093026, float:1.8235424E38)
            android.view.View r3 = r10.findViewById(r1)
            r2 = 8
            r1 = 0
            if (r6 == 0) goto L_0x06a1
            r1 = 8
        L_0x06a1:
            r3.setVisibility(r1)
            r1 = 2131305746(0x7f092512, float:1.8229672E38)
            android.view.View r1 = r10.findViewById(r1)
            if (r6 != 0) goto L_0x06ae
            r2 = 0
        L_0x06ae:
            r1.setVisibility(r2)
            r4 = 2131297883(0x7f09065b, float:1.8213723E38)
            android.view.View r3 = r10.findViewById(r4)
            r1 = 0
            android.content.Context r2 = r9.getContext()
            if (r6 == 0) goto L_0x0717
            if (r2 == 0) goto L_0x06c8
            r1 = 2131832283(0x7f112ddb, float:1.9297615E38)
        L_0x06c4:
            java.lang.String r1 = r2.getString(r1)
        L_0x06c8:
            r3.setContentDescription(r1)
            android.view.View r2 = r5.findViewById(r4)
            r1 = 143(0x8f, float:2.0E-43)
            X.C86104wH.A1C(r2, r1, r9)
            r1 = 2131308582(0x7f093026, float:1.8235424E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r5, r1)
            android.content.Context r3 = r5.getContext()
            r1 = 0
            if (r3 == 0) goto L_0x06f7
            r2 = 2131832281(0x7f112dd9, float:1.9297611E38)
            X.ItO r1 = r0.A03
            if (r1 != 0) goto L_0x06eb
            X.ItO r1 = X.C35360ItO.INDIVIDUAL
        L_0x06eb:
            int r1 = X.C37416Jrb.A00(r1)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r3, r1, r2)
        L_0x06f7:
            r4.setText(r1)
            r1 = 2131305746(0x7f092512, float:1.8229672E38)
            android.widget.TextView r3 = X.C18180wK.A0G(r5, r1)
            java.util.Map r2 = r0.A0g
            java.lang.String r1 = r0.A0L
            java.lang.String r1 = X.C18210wN.A0g(r1, r2)
            r3.setText(r1)
            X.I6I r1 = r9.A04
            if (r1 != 0) goto L_0x071d
            java.lang.String r0 = "viewModel"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0717:
            if (r2 == 0) goto L_0x06c8
            r1 = 2131832282(0x7f112dda, float:1.9297613E38)
            goto L_0x06c4
        L_0x071d:
            X.56r r1 = r1.A0D
            java.lang.Object r1 = r1.A08()
            if (r1 == 0) goto L_0x1799
            X.IM8 r1 = (X.IM8) r1
            boolean r1 = X.C102136Ty.A00(r1)
            if (r1 != 0) goto L_0x0bfa
            r1 = 2131302009(0x7f091679, float:1.8222092E38)
            android.view.View r5 = X.AnonymousClass0wJ.A0K(r10, r1)
            boolean r4 = r0.A0j
            r3 = 2131302010(0x7f09167a, float:1.8222094E38)
            android.content.Context r6 = r5.getContext()
            r1 = 2131832302(0x7f112dee, float:1.9297654E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r6, r1)
            r1 = 2131832301(0x7f112ded, float:1.9297652E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r6, r1)
            X.AnonymousClass5x9.A05(r5, r2, r1, r3, r4)
            r12 = 2131308184(0x7f092e98, float:1.8234616E38)
            android.view.View r2 = r5.requireViewById(r12)
            r1 = 144(0x90, float:2.02E-43)
            X.C86104wH.A1C(r2, r1, r9)
            r1 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r5, r1)
            r1 = 2131832303(0x7f112def, float:1.9297656E38)
            X.C18180wK.A10(r2, r9, r1)
            boolean r1 = X.AnonymousClass5x9.A06(r9)
            if (r1 == 0) goto L_0x079a
            java.util.List r1 = r0.A0d
            java.util.Iterator r3 = r1.iterator()
        L_0x0773:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x079a
            java.lang.Object r1 = r3.next()
            X.8qx r1 = (X.C148398qx) r1
            X.69L r2 = r1.Agi()
            X.69L r1 = X.AnonymousClass69L.A02
            if (r2 != r1) goto L_0x0773
            r1 = 2131300237(0x7f090f8d, float:1.8218498E38)
            X.C18190wL.A18(r5, r1, r8)
            r1 = 2131299989(0x7f090e95, float:1.8217995E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r5, r1)
            r1 = 2131832320(0x7f112e00, float:1.929769E38)
            X.C18180wK.A10(r2, r9, r1)
        L_0x079a:
            r3 = 2131299989(0x7f090e95, float:1.8217995E38)
            android.view.View r2 = r5.requireViewById(r3)
            r1 = 145(0x91, float:2.03E-43)
            X.C86104wH.A1C(r2, r1, r9)
            X.AnonymousClass5x9.A03(r5)
            r1 = 2131303991(0x7f091e37, float:1.8226112E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r5, r1)
            java.lang.String r1 = r0.A0F
            r2.setText(r1)
            r1 = 2131299455(0x7f090c7f, float:1.8216912E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r5, r1)
            java.lang.String r1 = r0.A0V
            r2.setText(r1)
            r2 = 2131296699(0x7f0901bb, float:1.8211322E38)
            java.lang.String r1 = r0.A0B
            X.AnonymousClass5x9.A04(r5, r1, r2)
            java.lang.String r1 = r0.A0D
            if (r1 == 0) goto L_0x07d4
            int r1 = r1.length()
            r2 = 0
            if (r1 != 0) goto L_0x07d5
        L_0x07d4:
            r2 = 1
        L_0x07d5:
            r1 = 2131298386(0x7f090852, float:1.8214744E38)
            android.widget.TextView r11 = X.C18180wK.A0G(r5, r1)
            if (r2 == 0) goto L_0x0be4
            r11.setVisibility(r7)
            android.view.View r1 = r5.findViewById(r3)
            r1.setVisibility(r7)
        L_0x07e8:
            r2 = 2131304186(0x7f091efa, float:1.8226507E38)
            java.lang.String r1 = r0.A0G
            X.AnonymousClass5x9.A04(r5, r1, r2)
            r2 = 2131300084(0x7f090ef4, float:1.8218188E38)
            java.lang.String r1 = r0.A0E
            X.AnonymousClass5x9.A04(r5, r1, r2)
            X.It9 r1 = r0.A06
            if (r1 != 0) goto L_0x0bcd
            r1 = 2131307933(0x7f092d9d, float:1.8234107E38)
            android.view.View r1 = r5.findViewById(r1)
            r1.setVisibility(r7)
        L_0x0806:
            r5.setVisibility(r8)
            r1 = 2131297870(0x7f09064e, float:1.8213697E38)
        L_0x080c:
            android.view.View r1 = r10.findViewById(r1)
            r1.setVisibility(r8)
            java.util.List r1 = r0.A0e
            r40 = r1
            java.util.List r1 = r0.A0d
            r39 = r1
            r1 = 2131304104(0x7f091ea8, float:1.8226341E38)
            android.view.View r15 = r10.findViewById(r1)
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            r15.removeAllViews()
            r31 = 10
            r2 = r40
            r1 = r31
            java.util.ArrayList r30 = X.AnonymousClass0wJ.A0x(r2, r1)
            java.util.Iterator r29 = r40.iterator()
            r11 = 0
        L_0x0836:
            boolean r1 = r29.hasNext()
            if (r1 == 0) goto L_0x0d7a
            java.lang.Object r2 = r29.next()
            int r28 = r11 + 1
            if (r11 >= 0) goto L_0x0849
            X.C06750aI.A1A()
            goto L_0x0658
        L_0x0849:
            X.8r2 r2 = (X.C148428r2) r2
            int r1 = r40.size()
            r3 = 1
            int r1 = r1 - r3
            boolean r27 = X.AnonymousClass0wJ.A1T(r11, r1)
            java.util.List r4 = r0.A0c
            android.view.LayoutInflater r5 = X.C18180wK.A0C(r15)
            r1 = 2131495186(0x7f0c0912, float:1.8613902E38)
            r26 = 0
            android.view.View r6 = X.C18180wK.A0D(r5, r15, r1, r8)
            X.8qW r1 = r2.B0h()
            java.lang.String r25 = "Required value was null."
            if (r1 == 0) goto L_0x1794
            X.8rG r24 = r1.A9g()
            X.C04220Ms.A06(r24)
            boolean r1 = X.C37416Jrb.A0B(r24)
            r38 = r1 ^ 1
            int r1 = r4.size()
            if (r1 <= r11) goto L_0x08c0
            java.lang.Object r1 = r4.get(r11)
            boolean r16 = X.AnonymousClass0wJ.A1X(r1)
            r14 = 2131304103(0x7f091ea7, float:1.822634E38)
            android.content.Context r4 = r6.getContext()
            r5 = 2131832312(0x7f112df8, float:1.9297674E38)
            r1 = r24
            java.lang.String r1 = X.AnonymousClass5x9.A02(r1, r9)
            java.lang.String r5 = X.AnonymousClass0wJ.A0l(r4, r1, r5)
            X.C04220Ms.A06(r5)
            r13 = 2131832311(0x7f112df7, float:1.9297672E38)
            r1 = r24
            java.lang.String r1 = X.AnonymousClass5x9.A02(r1, r9)
            java.lang.String r13 = X.AnonymousClass0wJ.A0l(r4, r1, r13)
            X.C04220Ms.A06(r13)
            r1 = r16
            X.AnonymousClass5x9.A05(r6, r5, r13, r14, r1)
            android.view.View r5 = r6.requireViewById(r12)
            r4 = 2
            com.facebook.redex.IDxCListenerShape7S0101000_2_I2 r1 = new com.facebook.redex.IDxCListenerShape7S0101000_2_I2
            r1.<init>(r9, r11, r4)
            r5.setOnClickListener(r1)
        L_0x08c0:
            r1 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r6, r1)
            r5 = 2131832314(0x7f112dfa, float:1.9297678E38)
            r1 = r24
            java.lang.String r1 = X.AnonymousClass5x9.A02(r1, r9)
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r9, r1, r5)
            r4.setText(r1)
            X.0Mo r16 = new X.0Mo
            r16.<init>()
            boolean r1 = X.AnonymousClass5x9.A06(r9)
            if (r1 == 0) goto L_0x095c
            java.util.LinkedHashSet r5 = X.C86134wK.A0u()
            com.google.common.collect.ImmutableList r13 = r2.Ayb()
            X.C04220Ms.A06(r13)
            r1 = r31
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0x(r13, r1)
            java.util.Iterator r14 = r13.iterator()
        L_0x08f7:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0920
            java.lang.Object r1 = r14.next()
            X.8r1 r1 = (X.AnonymousClass8r1) r1
            java.lang.String r13 = r1.Aya()
            if (r13 == 0) goto L_0x091e
            X.9tJ r1 = X.C169419tJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = com.facebook.graphql.enums.EnumHelper.A00(r13, r1)
            X.C04220Ms.A06(r1)
            boolean r1 = r5.add(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x091a:
            r4.add(r1)
            goto L_0x08f7
        L_0x091e:
            r1 = 0
            goto L_0x091a
        L_0x0920:
            java.util.Iterator r13 = r39.iterator()
        L_0x0924:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0982
            java.lang.Object r4 = r13.next()
            X.8qx r4 = (X.C148398qx) r4
            X.9tJ r1 = r4.AyZ()
            boolean r1 = X.AnonymousClass00J.A0k(r5, r1)
            if (r1 == 0) goto L_0x0924
            X.69L r4 = r4.Agi()
            X.69L r1 = X.AnonymousClass69L.A01
            if (r4 != r1) goto L_0x0924
            r4 = 1
        L_0x0943:
            r1 = r16
            r1.A00 = r4
            if (r4 == 0) goto L_0x095c
            r1 = 2131300237(0x7f090f8d, float:1.8218498E38)
            X.C18190wL.A18(r6, r1, r8)
            r1 = 2131299989(0x7f090e95, float:1.8217995E38)
            android.widget.TextView r4 = X.AnonymousClass0wJ.A0L(r6, r1)
            r1 = 2131832320(0x7f112e00, float:1.929769E38)
            X.C18180wK.A10(r4, r9, r1)
        L_0x095c:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            com.google.common.collect.ImmutableList r1 = r2.Ayb()
            X.C04220Ms.A06(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x096b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0984
            java.lang.Object r1 = r4.next()
            X.8r1 r1 = (X.AnonymousClass8r1) r1
            com.google.common.collect.ImmutableList r1 = r1.BEs()
            X.C04220Ms.A06(r1)
            r5.addAll(r1)
            goto L_0x096b
        L_0x0982:
            r4 = 0
            goto L_0x0943
        L_0x0984:
            r1 = 2131299989(0x7f090e95, float:1.8217995E38)
            android.view.View r4 = r6.findViewById(r1)
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0b96
            r4.setVisibility(r7)
        L_0x0994:
            X.AnonymousClass5x9.A03(r6)
            r1 = 2131304078(0x7f091e8e, float:1.8226288E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r6, r1)
            if (r38 == 0) goto L_0x0b60
            java.lang.String r1 = r24.ASy()
            r4.setText(r1)
            r1 = 2131304079(0x7f091e8f, float:1.822629E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r6, r1)
            java.lang.String r1 = r24.ASv()
            r4.setText(r1)
            r1 = 2131304080(0x7f091e90, float:1.8226292E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r6, r1)
            java.lang.String r1 = r24.ASz()
            if (r1 == 0) goto L_0x0b44
            boolean r1 = X.AnonymousClass8bQ.A0n(r1)
            if (r1 != 0) goto L_0x0b44
            r5 = 2131832276(0x7f112dd4, float:1.9297601E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = r24.ASz()
        L_0x09d1:
            r3[r8] = r1
            java.lang.String r1 = r9.getString(r5, r3)
            r4.setText(r1)
        L_0x09da:
            r1 = 2131304081(0x7f091e91, float:1.8226295E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r6, r1)
            r5 = 2131832275(0x7f112dd3, float:1.92976E38)
            java.lang.String r3 = "*"
            java.lang.String r1 = r24.ASs()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r3, r1)
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r9, r1, r5)
        L_0x09f2:
            r4.setText(r1)
            r1 = 2131302639(0x7f0918ef, float:1.822337E38)
            android.view.View r5 = r6.findViewById(r1)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeAllViews()
            r5.setVisibility(r8)
            com.google.common.collect.ImmutableList r2 = r2.Ayb()
            X.C04220Ms.A06(r2)
            r1 = r31
            java.util.ArrayList r23 = X.AnonymousClass0wJ.A0x(r2, r1)
            java.util.Iterator r22 = r2.iterator()
        L_0x0a15:
            boolean r1 = r22.hasNext()
            if (r1 == 0) goto L_0x0baf
            java.lang.Object r21 = r22.next()
            r1 = r21
            X.8r1 r1 = (X.AnonymousClass8r1) r1
            r21 = r1
            java.util.LinkedHashSet r4 = X.C86134wK.A0u()
            java.util.LinkedHashSet r20 = X.C86134wK.A0u()
            com.google.common.collect.ImmutableList r1 = r21.BEs()
            X.C04220Ms.A06(r1)
            java.util.Iterator r13 = r1.iterator()
        L_0x0a38:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0a63
            java.lang.String r1 = X.C18180wK.A0k(r13)
            java.util.Map r2 = X.C35387Itt.A01
            java.lang.Object r3 = r2.get(r1)
            X.Itt r3 = (X.C35387Itt) r3
            if (r3 == 0) goto L_0x1776
            java.util.Map r1 = X.J6F.A00
            java.lang.Object r2 = r1.get(r3)
            if (r2 == 0) goto L_0x0a38
            boolean r1 = r4.contains(r2)
            if (r1 != 0) goto L_0x0a38
            r1 = r20
            r1.add(r3)
            r4.add(r2)
            goto L_0x0a38
        L_0x0a63:
            java.util.Iterator r19 = r20.iterator()
        L_0x0a67:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x0b3b
            java.lang.Object r4 = r19.next()
            X.Itt r4 = (X.C35387Itt) r4
            java.lang.String r1 = r21.Aya()
            if (r1 == 0) goto L_0x178f
            android.content.Context r2 = r9.requireContext()
            r1 = 0
            com.instagram.igds.components.textcell.IgdsListCell r3 = new com.instagram.igds.components.textcell.IgdsListCell
            r3.<init>(r2, r1)
            android.content.Context r18 = X.C18190wL.A0A(r3)
            X.0Oa r1 = r9.A0C
            r32 = r1
            com.instagram.service.session.UserSession r17 = X.AnonymousClass0wJ.A0X(r32)
            r1 = r17
            X.AnonymousClass0wJ.A1M(r4, r8, r1)
            int r1 = r4.ordinal()
            switch(r1) {
                case 0: goto L_0x0aed;
                case 1: goto L_0x0ae9;
                case 2: goto L_0x0ae9;
                case 3: goto L_0x0b06;
                case 4: goto L_0x0b0a;
                case 5: goto L_0x0b23;
                case 6: goto L_0x0b27;
                case 7: goto L_0x0b27;
                case 8: goto L_0x0b2b;
                case 9: goto L_0x0b1f;
                default: goto L_0x0a9b;
            }
        L_0x0a9b:
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r32)
            int r1 = X.C37416Jrb.A01(r4, r1)
            java.lang.String r1 = X.C18180wK.A0g(r9, r1)
            r3.A0H(r1)
            if (r38 == 0) goto L_0x0ae1
            java.lang.String r16 = r24.ASy()
            if (r16 == 0) goto L_0x178a
            java.lang.String r14 = r24.ASs()
            if (r14 == 0) goto L_0x1785
            r1 = 20
            r13 = r1
            r2 = r18
            r1 = r16
            java.lang.String r1 = X.C37416Jrb.A04(r2, r1, r14, r13)
        L_0x0ac3:
            r3.A0G(r1)
            X.24V r1 = X.AnonymousClass24V.TYPE_CHEVRON
            r3.setTextCellType(r1)
            X.7RH r1 = new X.7RH
            r33 = r1
            r34 = r4
            r35 = r9
            r36 = r20
            r37 = r11
            r33.<init>(r34, r35, r36, r37, r38)
            r3.setOnClickListener(r1)
            r5.addView(r3)
            goto L_0x0a67
        L_0x0ae1:
            r1 = 2131832385(0x7f112e41, float:1.9297822E38)
            java.lang.String r1 = X.C18180wK.A0g(r9, r1)
            goto L_0x0ac3
        L_0x0ae9:
            r2 = 2131232290(0x7f080622, float:1.8080685E38)
            goto L_0x0b2e
        L_0x0aed:
            X.0TJ r16 = X.AnonymousClass0TJ.A05
            r13 = 36319914197390844(0x8108c5000215fc, double:3.0321982147611613E-306)
            r1 = r13
            r14 = r16
            r13 = r17
            boolean r1 = X.C63803iN.A0E(r14, r13, r1)
            r2 = 2131232714(0x7f0807ca, float:1.8081545E38)
            if (r1 == 0) goto L_0x0b2e
            r2 = 2131232449(0x7f0806c1, float:1.8081008E38)
            goto L_0x0b2e
        L_0x0b06:
            r2 = 2131233079(0x7f080937, float:1.8082285E38)
            goto L_0x0b2e
        L_0x0b0a:
            X.0TJ r16 = X.AnonymousClass0TJ.A05
            r13 = 36322280724307217(0x810aec00011d11, double:3.0336948159123146E-306)
            r1 = r13
            r14 = r16
            r13 = r17
            boolean r1 = X.C63803iN.A0E(r14, r13, r1)
            r2 = 2131232401(0x7f080691, float:1.808091E38)
            if (r1 != 0) goto L_0x0b2e
        L_0x0b1f:
            r2 = 2131232631(0x7f080777, float:1.8081377E38)
            goto L_0x0b2e
        L_0x0b23:
            r2 = 2131232518(0x7f080706, float:1.8081148E38)
            goto L_0x0b2e
        L_0x0b27:
            r2 = 2131232509(0x7f0806fd, float:1.808113E38)
            goto L_0x0b2e
        L_0x0b2b:
            r2 = 2131232214(0x7f0805d6, float:1.808053E38)
        L_0x0b2e:
            r1 = r18
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            if (r1 == 0) goto L_0x0a9b
            r3.A08(r1)
            goto L_0x0a9b
        L_0x0b3b:
            kotlin.Unit r2 = kotlin.Unit.A00
            r1 = r23
            r1.add(r2)
            goto L_0x0a15
        L_0x0b44:
            java.lang.String r1 = r24.AT0()
            if (r1 == 0) goto L_0x0b5b
            boolean r1 = X.AnonymousClass8bQ.A0n(r1)
            if (r1 != 0) goto L_0x0b5b
            r5 = 2131832277(0x7f112dd5, float:1.9297603E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = r24.AT0()
            goto L_0x09d1
        L_0x0b5b:
            r4.setVisibility(r7)
            goto L_0x09da
        L_0x0b60:
            r1 = 2131832317(0x7f112dfd, float:1.9297684E38)
            X.C18180wK.A10(r4, r9, r1)
            r1 = 2131304079(0x7f091e8f, float:1.822629E38)
            android.widget.TextView r3 = X.C18180wK.A0G(r6, r1)
            java.lang.String r1 = r24.B0v()
            r3.setText(r1)
            r1 = 2131304080(0x7f091e90, float:1.8226292E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r6, r1)
            r3 = 2131832318(0x7f112dfe, float:1.9297686E38)
            java.lang.String r1 = r24.B0u()
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r9, r1, r3)
            r4.setText(r1)
            r1 = 2131304081(0x7f091e91, float:1.8226295E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r6, r1)
            java.lang.String r1 = r24.B0t()
            goto L_0x09f2
        L_0x0b96:
            r4.setVisibility(r8)
            com.facebook.redex.IDxCListenerShape1S0410000_2_I2 r1 = new com.facebook.redex.IDxCListenerShape1S0410000_2_I2
            r32 = r1
            r33 = r3
            r34 = r24
            r35 = r5
            r36 = r16
            r37 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38)
            r4.setOnClickListener(r1)
            goto L_0x0994
        L_0x0baf:
            r1 = 2131304085(0x7f091e95, float:1.8226303E38)
            android.view.View r2 = r6.findViewById(r1)
            if (r27 == 0) goto L_0x0bba
            r26 = 8
        L_0x0bba:
            r1 = r26
            r2.setVisibility(r1)
            r15.addView(r6)
            kotlin.Unit r2 = kotlin.Unit.A00
            r1 = r30
            r1.add(r2)
            r11 = r28
            goto L_0x0836
        L_0x0bcd:
            r1 = 2131307933(0x7f092d9d, float:1.8234107E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r5, r1)
            r3 = 2131832288(0x7f112de0, float:1.9297626E38)
            X.It9 r2 = r0.A06
            java.lang.String r1 = "**********"
            java.lang.String r1 = X.C18220wO.A0h(r6, r2, r1, r3)
            r4.setText(r1)
            goto L_0x0806
        L_0x0be4:
            r4 = 2131832289(0x7f112de1, float:1.9297628E38)
            java.lang.String r3 = r0.A0D
            java.lang.String r2 = r0.A0I
            java.lang.String r1 = r0.A0K
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1}
            java.lang.String r1 = r6.getString(r4, r1)
            r11.setText(r1)
            goto L_0x07e8
        L_0x0bfa:
            r1 = 2131297871(0x7f09064f, float:1.82137E38)
            android.view.View r11 = X.AnonymousClass0wJ.A0K(r10, r1)
            boolean r4 = r0.A0h
            r3 = 2131297872(0x7f090650, float:1.8213701E38)
            android.content.Context r15 = r11.getContext()
            r1 = 2131832279(0x7f112dd7, float:1.9297607E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r15, r1)
            r1 = 2131832278(0x7f112dd6, float:1.9297605E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r15, r1)
            X.AnonymousClass5x9.A05(r11, r2, r1, r3, r4)
            r12 = 2131308184(0x7f092e98, float:1.8234616E38)
            android.view.View r2 = r11.requireViewById(r12)
            r1 = 146(0x92, float:2.05E-43)
            X.C86104wH.A1C(r2, r1, r9)
            r14 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r11, r14)
            r1 = 2131832280(0x7f112dd8, float:1.929761E38)
            X.C18180wK.A10(r2, r9, r1)
            boolean r1 = X.AnonymousClass5x9.A06(r9)
            if (r1 == 0) goto L_0x0c67
            java.util.List r1 = r0.A0d
            java.util.Iterator r3 = r1.iterator()
        L_0x0c40:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0c67
            java.lang.Object r1 = r3.next()
            X.8qx r1 = (X.C148398qx) r1
            X.69L r2 = r1.Agi()
            X.69L r1 = X.AnonymousClass69L.A02
            if (r2 != r1) goto L_0x0c40
            r1 = 2131300237(0x7f090f8d, float:1.8218498E38)
            X.C18190wL.A18(r11, r1, r8)
            r1 = 2131299989(0x7f090e95, float:1.8217995E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r11, r1)
            r1 = 2131832320(0x7f112e00, float:1.929769E38)
            X.C18180wK.A10(r2, r9, r1)
        L_0x0c67:
            r13 = 2131299989(0x7f090e95, float:1.8217995E38)
            android.view.View r2 = r11.requireViewById(r13)
            r1 = 147(0x93, float:2.06E-43)
            X.C86104wH.A1C(r2, r1, r9)
            X.AnonymousClass5x9.A03(r11)
            r1 = 2131297875(0x7f090653, float:1.8213707E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r11, r1)
            java.lang.String r1 = r0.A0F
            r2.setText(r1)
            r1 = 2131296699(0x7f0901bb, float:1.8211322E38)
            r16 = 2131296699(0x7f0901bb, float:1.8211322E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r11, r1)
            java.lang.String r1 = r0.A0B
            r2.setText(r1)
            r1 = 2131298386(0x7f090852, float:1.8214744E38)
            r5 = 2131298386(0x7f090852, float:1.8214744E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r11, r1)
            r4 = 2131832289(0x7f112de1, float:1.9297628E38)
            java.lang.String r6 = r0.A0D
            java.lang.String r3 = r0.A0I
            java.lang.String r1 = r0.A0K
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r3, r1}
            java.lang.String r1 = r15.getString(r4, r1)
            r2.setText(r1)
            r1 = 2131304186(0x7f091efa, float:1.8226507E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r11, r1)
            java.lang.String r1 = r0.A0G
            r2.setText(r1)
            r1 = 2131300084(0x7f090ef4, float:1.8218188E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r11, r1)
            java.lang.String r1 = r0.A0E
            r2.setText(r1)
            X.It9 r2 = r0.A06
            r1 = 2131307933(0x7f092d9d, float:1.8234107E38)
            android.widget.TextView r6 = X.C18180wK.A0G(r11, r1)
            if (r2 != 0) goto L_0x0d6a
            r6.setVisibility(r7)
        L_0x0cd5:
            r11.setVisibility(r8)
            r1 = 2131297873(0x7f090651, float:1.8213703E38)
            android.view.View r1 = r10.findViewById(r1)
            r1.setVisibility(r8)
            r1 = 2131302568(0x7f0918a8, float:1.8223226E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0I(r10, r1)
            boolean r15 = r0.A0k
            r3 = 2131302569(0x7f0918a9, float:1.8223228E38)
            android.content.Context r11 = r6.getContext()
            r1 = 2131832295(0x7f112de7, float:1.929764E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r11, r1)
            r1 = 2131832294(0x7f112de6, float:1.9297638E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r11, r1)
            X.AnonymousClass5x9.A05(r6, r2, r1, r3, r15)
            android.view.View r2 = r6.requireViewById(r12)
            r1 = 148(0x94, float:2.07E-43)
            X.C86104wH.A1C(r2, r1, r9)
            android.widget.TextView r2 = X.C18180wK.A0G(r6, r14)
            r1 = 2131832297(0x7f112de9, float:1.9297644E38)
            X.C18180wK.A10(r2, r9, r1)
            android.view.View r2 = r6.findViewById(r13)
            r1 = 149(0x95, float:2.09E-43)
            X.C86104wH.A1C(r2, r1, r9)
            X.AnonymousClass5x9.A03(r6)
            r1 = 2131303991(0x7f091e37, float:1.8226112E38)
            android.widget.TextView r13 = X.C18180wK.A0G(r6, r1)
            java.lang.String r3 = r0.A0W
            java.lang.String r2 = r0.A0Y
            java.lang.String r1 = r0.A0X
            java.lang.String r1 = X.C37416Jrb.A06(r3, r2, r1)
            r13.setText(r1)
            r1 = r16
            android.widget.TextView r2 = X.C18180wK.A0G(r6, r1)
            java.lang.String r1 = r0.A0S
            r2.setText(r1)
            r1 = 2131299455(0x7f090c7f, float:1.8216912E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r6, r1)
            java.lang.String r1 = r0.A0V
            r2.setText(r1)
            android.widget.TextView r5 = X.C18180wK.A0G(r6, r5)
            java.lang.String r3 = r0.A0U
            java.lang.String r2 = r0.A0Z
            java.lang.String r1 = r0.A0a
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1}
            java.lang.String r1 = r11.getString(r4, r1)
            r5.setText(r1)
            r6.setVisibility(r8)
            r1 = 2131302570(0x7f0918aa, float:1.822323E38)
            goto L_0x080c
        L_0x0d6a:
            r3 = 2131832288(0x7f112de0, float:1.9297626E38)
            X.It9 r2 = r0.A06
            java.lang.String r1 = "**********"
            java.lang.String r1 = X.C18220wO.A0h(r15, r2, r1, r3)
            r6.setText(r1)
            goto L_0x0cd5
        L_0x0d7a:
            X.I6I r1 = r9.A04
            if (r1 != 0) goto L_0x0d82
            java.lang.String r2 = "viewModel"
            goto L_0x0655
        L_0x0d82:
            X.ItJ r2 = r1.A01
            X.ItJ r1 = X.C35355ItJ.BSC_PRO_DASH
            if (r2 == r1) goto L_0x0e30
            X.8qn r1 = r0.A02
            if (r1 == 0) goto L_0x0e28
            com.google.common.collect.ImmutableList r3 = r1.Aeb()
        L_0x0d90:
            X.0Oa r1 = r9.A0C
            com.instagram.service.session.UserSession r5 = X.AnonymousClass0wJ.A0X(r1)
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36310890471751977(0x810090000c0129, double:3.026491574331515E-306)
            boolean r1 = X.C63803iN.A0E(r4, r5, r1)
            if (r1 == 0) goto L_0x0e30
            if (r3 == 0) goto L_0x0e30
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0e30
            r1 = 2131304105(0x7f091ea9, float:1.8226343E38)
            X.C18190wL.A18(r10, r1, r8)
            r1 = 2131304096(0x7f091ea0, float:1.8226325E38)
            android.view.View r4 = r10.requireViewById(r1)
            r4.setVisibility(r8)
            X.AnonymousClass5x9.A03(r4)
            r1 = 2131308189(0x7f092e9d, float:1.8234627E38)
            X.C18190wL.A18(r4, r1, r7)
            r1 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r4, r1)
            r1 = 2131832310(0x7f112df6, float:1.929767E38)
            X.C18180wK.A10(r2, r9, r1)
            r1 = 2131299985(0x7f090e91, float:1.8217987E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r4, r1)
            r2.setVisibility(r8)
            r1 = 2131832322(0x7f112e02, float:1.9297695E38)
            X.C18180wK.A10(r2, r9, r1)
            r1 = 69
            X.C86104wH.A1D(r2, r1, r0, r9)
            r1 = 2131304097(0x7f091ea1, float:1.8226327E38)
            android.view.View r2 = r10.requireViewById(r1)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r2.setVisibility(r8)
            r2.setNestedScrollingEnabled(r8)
            X.0Oa r1 = r9.A07
            X.C18240wQ.A12(r2, r1)
            java.lang.Object r6 = r1.getValue()
            X.5A4 r6 = (X.AnonymousClass5A4) r6
            r1 = r31
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r3, r1)
            java.util.Iterator r4 = r3.iterator()
        L_0x0e0a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0e2b
            java.lang.Object r3 = r4.next()
            X.8qm r3 = (X.C148288qm) r3
            X.C04220Ms.A04(r3)
            r1 = 70
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r3, r9, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1
            r1.<init>((android.view.View.OnClickListener) r2, (X.C148288qm) r3)
            r5.add(r1)
            goto L_0x0e0a
        L_0x0e28:
            r3 = 0
            goto L_0x0d90
        L_0x0e2b:
            r6.A00 = r5
            r6.notifyDataSetChanged()
        L_0x0e30:
            java.lang.String r2 = r9.A06
            java.lang.String r1 = r0.A0N
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 != 0) goto L_0x0e53
            boolean r1 = X.AnonymousClass7Kz.A0U()
            if (r1 == 0) goto L_0x0e53
            java.lang.String r3 = r0.A0N
            if (r3 == 0) goto L_0x0e53
            X.0Oa r1 = r9.A09
            java.lang.Object r2 = r1.getValue()
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r2 = (com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel) r2
            X.56r r1 = X.C880856r.A04(r3)
            r2.A04(r1)
        L_0x0e53:
            java.util.List r2 = r0.A0d
            r4 = 0
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0e74
            r1 = 2131304108(0x7f091eac, float:1.822635E38)
            android.view.View r1 = r10.requireViewById(r1)
            r4 = 8
            r1.setVisibility(r7)
        L_0x0e68:
            r1 = 2131304107(0x7f091eab, float:1.8226347E38)
            X.C18190wL.A18(r10, r1, r4)
        L_0x0e6e:
            java.lang.String r1 = r0.A0N
            r9.A06 = r1
            goto L_0x064b
        L_0x0e74:
            boolean r1 = X.AnonymousClass5x9.A06(r9)
            if (r1 == 0) goto L_0x0e6e
            java.util.Iterator r7 = r2.iterator()
            r6 = 0
        L_0x0e7f:
            r5 = 0
        L_0x0e80:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0ea4
            java.lang.Object r3 = r7.next()
            X.8qx r3 = (X.C148398qx) r3
            if (r6 != 0) goto L_0x0e98
            X.69L r2 = r3.Agi()
            X.69L r1 = X.AnonymousClass69L.A02
            boolean r6 = X.C18180wK.A1Z(r2, r1)
        L_0x0e98:
            if (r5 != 0) goto L_0x0e80
            X.69L r2 = r3.Agi()
            X.69L r1 = X.AnonymousClass69L.A01
            r5 = 1
            if (r2 == r1) goto L_0x0e80
            goto L_0x0e7f
        L_0x0ea4:
            if (r6 != 0) goto L_0x0ea8
            if (r5 == 0) goto L_0x0e6e
        L_0x0ea8:
            r1 = 2131304108(0x7f091eac, float:1.822635E38)
            android.view.View r2 = r10.requireViewById(r1)
            r2.setVisibility(r8)
            r1 = 2131302319(0x7f0917af, float:1.822272E38)
            android.widget.TextView r3 = X.AnonymousClass0wJ.A0L(r2, r1)
            if (r6 == 0) goto L_0x0ecd
            r2 = 2131832325(0x7f112e05, float:1.92977E38)
            if (r5 == 0) goto L_0x0ec3
            r2 = 2131832324(0x7f112e04, float:1.9297699E38)
        L_0x0ec3:
            X.It9 r1 = r0.A06
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r9, r1, r2)
        L_0x0ec9:
            r3.setText(r1)
            goto L_0x0e68
        L_0x0ecd:
            r1 = 2131832306(0x7f112df2, float:1.9297662E38)
            java.lang.String r1 = r9.getString(r1)
            goto L_0x0ec9
        L_0x0ed5:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r3 = r1.A01
            X.58M r3 = (X.AnonymousClass58M) r3
            X.C04220Ms.A07(r0)
            java.lang.Object r4 = r1.A00
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r4 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r4
            r1 = 7
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r2 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r2.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4)
            boolean r1 = X.AnonymousClass7Kx.A0O(r0)
            if (r1 == 0) goto L_0x0f02
            java.lang.Throwable r6 = r0.A02
            boolean r1 = r6 instanceof X.AnonymousClass88a
            if (r1 == 0) goto L_0x0f87
            java.lang.String r1 = "null cannot be cast to non-null type com.fbpay.util.exceptions.ECPErrorDialogException"
            X.C04220Ms.A0C(r6, r1)
            X.88a r6 = (X.AnonymousClass88a) r6
            X.56r r5 = r3.A0u
            com.facebookpay.common.models.ErrorDialogContent r1 = r6.A00
            X.AnonymousClass7JD.A02(r5, r1)
        L_0x0f02:
            boolean r1 = X.AnonymousClass7Kx.A0R(r0)
            if (r1 == 0) goto L_0x0f96
            java.lang.Object r1 = r0.A01
            boolean r5 = r1 instanceof com.facebookpay.expresscheckout.models.PaymentHandledResponseData
            if (r5 == 0) goto L_0x0f96
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.PaymentHandledResponseData"
            X.C04220Ms.A0C(r1, r0)
            com.facebookpay.expresscheckout.models.PaymentHandledResponseData r1 = (com.facebookpay.expresscheckout.models.PaymentHandledResponseData) r1
            X.7Kx r0 = r3.A0M
            java.lang.Object r5 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r5 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r5
            r0 = 0
            if (r5 == 0) goto L_0x0f20
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r5.A01
        L_0x0f20:
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x0f91
            X.7ke r6 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r8 = r3.A0v()
            long r13 = X.C86164wN.A0A(r0)
            X.7Kx r0 = r3.A0M
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x0f8c
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r0.A01
            if (r0 == 0) goto L_0x0f8c
            X.LcE r7 = r0.Aam()
            java.lang.String r0 = r4.A0A
            java.util.List r11 = X.C18180wK.A0n(r0)
            X.58K r0 = r3.A1S
            java.util.List r5 = r0.A07()
            X.588 r0 = r3.A1N
            java.util.List r0 = r0.A03()
            java.util.List r10 = X.AnonymousClass00J.A0V(r0, r5)
            X.587 r0 = r3.A1O
            java.util.LinkedHashMap r12 = X.AnonymousClass7Kr.A07(r0)
            java.lang.String r9 = "payment_authorization"
            r6.A09(r7, r8, r9, r10, r11, r12, r13)
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.78m r7 = r0.A0C
            java.lang.String r0 = r1.A00
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r6 = X.C122157Kv.A01(r4, r0)
            X.6ci r5 = X.AnonymousClass7Kz.A0C()
            r0 = 12
            com.facebook.redex.IDxFunctionShape152S0200000_2_I2 r1 = new com.facebook.redex.IDxFunctionShape152S0200000_2_I2
            r1.<init>(r0, r6, r7)
            X.7TR r0 = X.AnonymousClass7TR.A00
            X.M5J r6 = X.AnonymousClass5k8.A00(r0, r1, r5)
            r0 = 13
            com.facebook.redex.IDxObserverShape55S0300000_2_I2 r1 = new com.facebook.redex.IDxObserverShape55S0300000_2_I2
            r1.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r2, (java.lang.Object) r4)
            goto L_0x15ff
        L_0x0f87:
            X.AnonymousClass58M.A0T(r3, r6)
            goto L_0x0f02
        L_0x0f8c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x0f91:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x0f96:
            r2.invoke(r0)
            return
        L_0x0f9a:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x0fd6
            java.lang.Object r4 = r1.A00
            X.58D r4 = (X.AnonymousClass58D) r4
            java.lang.Object r3 = r0.A01
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r2 = "AUTH_FLOW_UTIL_PASSWORD_ENTERED"
            r5.putString(r2, r3)
            X.56q r4 = r4.A06
            r3 = 0
            X.79P r2 = new X.79P
            r2.<init>(r3, r5)
            X.7Kx r3 = X.AnonymousClass7Kx.A0A(r2)
            X.7JD r2 = new X.7JD
            r2.<init>(r3)
        L_0x0fc7:
            r4.A0G(r2)
        L_0x0fca:
            java.lang.Object r1 = r1.A00
            X.58D r1 = (X.AnonymousClass58D) r1
            X.56q r3 = r1.A05
            boolean r2 = X.AnonymousClass7Kx.A0P(r0)
            goto L_0x16fa
        L_0x0fd6:
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 == 0) goto L_0x0fca
            java.lang.Object r4 = r1.A00
            X.58D r4 = (X.AnonymousClass58D) r4
            X.56q r3 = r4.A06
            java.lang.Object r2 = r1.A01
            X.M5J r2 = (X.M5J) r2
            r3.A0J(r2)
            X.56q r4 = r4.A07
            java.lang.Throwable r2 = r0.A02
            goto L_0x0fc7
        L_0x0fee:
            java.lang.Object r2 = r1.A01
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r0 = r1.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.removeCallbacks(r0)
            r3 = 500(0x1f4, double:2.47E-321)
            goto L_0x1772
        L_0x0ffd:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r14 = r1.A01
            com.facebookpay.msc.overview.viewmodel.OverviewViewModel r14 = (com.facebookpay.msc.overview.viewmodel.OverviewViewModel) r14
            X.AnonymousClass7Kx.A0L(r14, r0)
            java.lang.Object r4 = r0.A01
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            r16 = 0
            if (r4 == 0) goto L_0x10cc
            java.lang.Class<com.facebook.graphql.impls.OverviewQueryResponseImpl$XfbBusinessPaymentsHub> r3 = com.facebook.graphql.impls.OverviewQueryResponseImpl.XfbBusinessPaymentsHub.class
            java.lang.String r2 = "xfb_business_payments_hub(interface_type:$interface_type,page_id:$page_id)"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r2, r3)
            if (r3 == 0) goto L_0x10cc
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl> r2 = com.facebook.graphql.impls.OverviewFragmentImpl.class
            com.facebook.pando.TreeJNI r5 = r3.reinterpret(r2)
            com.facebook.graphql.impls.OverviewFragmentImpl r5 = (com.facebook.graphql.impls.OverviewFragmentImpl) r5
        L_0x1020:
            r14.A01 = r5
            boolean r3 = X.AnonymousClass7Kx.A0R(r0)
            r2 = 0
            if (r3 == 0) goto L_0x11f5
            if (r5 == 0) goto L_0x10c8
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl$PaymentsHubOverview> r4 = com.facebook.graphql.impls.OverviewFragmentImpl.PaymentsHubOverview.class
            java.lang.String r3 = "payments_hub_overview(fe_id:$fe_id,input:$input,session_id:$session_id)"
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r3, r4)
            if (r5 == 0) goto L_0x10c8
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl$PaymentsHubOverview$EarningsSummary> r4 = com.facebook.graphql.impls.OverviewFragmentImpl.PaymentsHubOverview.EarningsSummary.class
            java.lang.String r3 = "earnings_summary"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x10c8
            java.lang.Class<com.facebook.graphql.impls.EarningsSummaryFragmentImpl> r3 = com.facebook.graphql.impls.EarningsSummaryFragmentImpl.class
            com.facebook.pando.TreeJNI r5 = r4.reinterpret(r3)
        L_0x1045:
            com.facebook.graphql.impls.OverviewFragmentImpl r6 = r14.A01
            if (r6 == 0) goto L_0x10c5
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl$PaymentsHubOverview> r4 = com.facebook.graphql.impls.OverviewFragmentImpl.PaymentsHubOverview.class
            java.lang.String r3 = "payments_hub_overview(fe_id:$fe_id,input:$input,session_id:$session_id)"
            com.facebook.pando.TreeJNI r6 = r6.getTreeValue(r3, r4)
            if (r6 == 0) goto L_0x10c5
            java.lang.Class<com.facebook.graphql.impls.OverviewFragmentImpl$PaymentsHubOverview$PayoutsSummary> r4 = com.facebook.graphql.impls.OverviewFragmentImpl.PaymentsHubOverview.PayoutsSummary.class
            java.lang.String r3 = "payouts_summary"
            com.facebook.pando.TreeJNI r4 = r6.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x10c5
            java.lang.Class<com.facebook.graphql.impls.PayoutsSummaryFragmentImpl> r3 = com.facebook.graphql.impls.PayoutsSummaryFragmentImpl.class
            com.facebook.pando.TreeJNI r8 = r4.reinterpret(r3)
        L_0x1063:
            r22 = 0
            if (r5 == 0) goto L_0x1133
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.lang.Class<com.facebook.graphql.impls.EarningsSummaryFragmentImpl$LastTotalEarnings> r3 = com.facebook.graphql.impls.EarningsSummaryFragmentImpl.LastTotalEarnings.class
            java.lang.String r4 = "last_total_earnings"
            com.facebook.pando.TreeJNI r3 = r5.getTreeValue(r4, r3)
            if (r3 == 0) goto L_0x107e
            java.lang.String r3 = X.C86154wM.A0k(r3)
            if (r3 == 0) goto L_0x107e
            r6.put(r4, r3)
        L_0x107e:
            java.lang.String r4 = "last_total_earnings_date_delta_text"
            java.lang.String r3 = r5.getStringValue(r4)
            if (r3 == 0) goto L_0x1089
            r6.put(r4, r3)
        L_0x1089:
            java.lang.String r4 = "last_total_earnings_percentage_delta_text"
            java.lang.String r3 = r5.getStringValue(r4)
            if (r3 == 0) goto L_0x1094
            r6.put(r4, r3)
        L_0x1094:
            java.lang.String r7 = "last_total_earnings_percentage_delta"
            double r3 = r5.getDoubleValue(r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.put(r7, r3)
            java.lang.Class<com.facebook.graphql.impls.EarningsSummaryFragmentImpl$BalanceInfo> r4 = com.facebook.graphql.impls.EarningsSummaryFragmentImpl.BalanceInfo.class
            java.lang.String r3 = "balance_info"
            com.google.common.collect.ImmutableList r3 = X.C18230wP.A0P(r5, r4, r3)
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r7 = r3.iterator()
        L_0x10b1:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x10d0
            com.facebook.pando.TreeJNI r4 = X.C18210wN.A0G(r7)
            java.lang.Class<com.facebook.graphql.impls.BalanceInfoFragmentImpl> r3 = com.facebook.graphql.impls.BalanceInfoFragmentImpl.class
            com.facebook.pando.TreeJNI r3 = r4.reinterpret(r3)
            r9.add(r3)
            goto L_0x10b1
        L_0x10c5:
            r8 = r16
            goto L_0x1063
        L_0x10c8:
            r5 = r16
            goto L_0x1045
        L_0x10cc:
            r5 = r16
            goto L_0x1020
        L_0x10d0:
            java.util.Iterator r13 = r9.iterator()
        L_0x10d4:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x1135
            com.facebook.pando.TreeJNI r12 = X.C18210wN.A0G(r13)
            java.lang.Class<com.facebook.graphql.impls.BalanceInfoFragmentImpl$BalanceAmount> r3 = com.facebook.graphql.impls.BalanceInfoFragmentImpl.BalanceAmount.class
            java.lang.String r11 = "balance_amount"
            com.facebook.pando.TreeJNI r3 = r12.getTreeValue(r11, r3)
            if (r3 == 0) goto L_0x1130
            java.lang.String r7 = X.C86154wM.A0k(r3)
        L_0x10ec:
            java.lang.String r4 = ""
            if (r7 != 0) goto L_0x10f1
            r7 = r4
        L_0x10f1:
            java.lang.String r10 = "balance_status_text"
            java.lang.String r3 = r12.getStringValue(r10)
            if (r3 == 0) goto L_0x10fa
            r4 = r3
        L_0x10fa:
            X.1zn r9 = X.C30081zn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "balance_type"
            java.lang.Enum r3 = X.C86104wH.A0a(r12, r9, r3)
            X.1zn r3 = (X.C30081zn) r3
            if (r3 == 0) goto L_0x10d4
            int r9 = r3.ordinal()
            r3 = 3
            if (r9 == r3) goto L_0x1125
            r3 = 1
            if (r9 == r3) goto L_0x111e
            r3 = 2
            if (r9 != r3) goto L_0x10d4
            java.lang.String r3 = "next_payout_balance_amount"
            r6.put(r3, r7)
            java.lang.String r3 = "next_payout_balance_status_text"
            r6.put(r3, r4)
            goto L_0x10d4
        L_0x111e:
            r6.put(r11, r7)
            r6.put(r10, r4)
            goto L_0x10d4
        L_0x1125:
            java.lang.String r3 = "pending_balance_amount"
            r6.put(r3, r7)
            java.lang.String r3 = "pending_balance_status_text"
            r6.put(r3, r4)
            goto L_0x10d4
        L_0x1130:
            r7 = r16
            goto L_0x10ec
        L_0x1133:
            r6 = r16
        L_0x1135:
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            if (r5 == 0) goto L_0x118f
            java.lang.Class<com.facebook.graphql.impls.EarningsSummaryFragmentImpl$EarningsBreakdownBySource> r4 = com.facebook.graphql.impls.EarningsSummaryFragmentImpl.EarningsBreakdownBySource.class
            java.lang.String r3 = "earnings_breakdown_by_source"
            com.google.common.collect.ImmutableList r3 = r5.getTreeList(r3, r4)
            if (r3 == 0) goto L_0x118f
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r5 = r3.iterator()
        L_0x114d:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x1161
            com.facebook.pando.TreeJNI r4 = X.C18210wN.A0G(r5)
            java.lang.Class<com.facebook.graphql.impls.EarningsBreakdownFragmentImpl> r3 = com.facebook.graphql.impls.EarningsBreakdownFragmentImpl.class
            com.facebook.pando.TreeJNI r3 = r4.reinterpret(r3)
            r7.add(r3)
            goto L_0x114d
        L_0x1161:
            java.util.Iterator r11 = r7.iterator()
        L_0x1165:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x118f
            com.facebook.pando.TreeJNI r10 = X.C18210wN.A0G(r11)
            java.lang.String r3 = "source_name"
            java.lang.String r7 = r10.getStringValue(r3)
            java.lang.String r5 = ""
            if (r7 != 0) goto L_0x117a
            r7 = r5
        L_0x117a:
            java.lang.Class<com.facebook.graphql.impls.EarningsBreakdownFragmentImpl$AggregatedPayoutAmount> r4 = com.facebook.graphql.impls.EarningsBreakdownFragmentImpl.AggregatedPayoutAmount.class
            java.lang.String r3 = "aggregated_payout_amount"
            com.facebook.pando.TreeJNI r3 = r10.getTreeValue(r3, r4)
            if (r3 == 0) goto L_0x118b
            java.lang.String r3 = X.C86154wM.A0k(r3)
            if (r3 == 0) goto L_0x118b
            r5 = r3
        L_0x118b:
            r9.put(r7, r5)
            goto L_0x1165
        L_0x118f:
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L_0x1197
            r22 = r9
        L_0x1197:
            if (r8 == 0) goto L_0x123a
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.lang.Class<com.facebook.graphql.impls.PayoutsSummaryFragmentImpl$LastPayoutTotalAmount> r3 = com.facebook.graphql.impls.PayoutsSummaryFragmentImpl.LastPayoutTotalAmount.class
            java.lang.String r4 = "last_payout_total_amount"
            com.facebook.pando.TreeJNI r3 = r8.getTreeValue(r4, r3)
            if (r3 == 0) goto L_0x11b0
            java.lang.String r3 = X.C86154wM.A0k(r3)
            if (r3 == 0) goto L_0x11b0
            r5.put(r4, r3)
        L_0x11b0:
            java.lang.String r4 = "last_total_payouts_percentage_delta_text"
            java.lang.String r3 = r8.getStringValue(r4)
            if (r3 == 0) goto L_0x11bb
            r5.put(r4, r3)
        L_0x11bb:
            java.lang.String r7 = "last_total_payouts_percentage_delta"
            double r3 = r8.getDoubleValue(r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.put(r7, r3)
            java.lang.String r4 = "last_payout_paid_date"
            java.lang.String r3 = r8.getStringValue(r4)
            if (r3 == 0) goto L_0x11d3
            r5.put(r4, r3)
        L_0x11d3:
            r24 = 58
            java.lang.String r15 = "client_fetch_payouthub_success"
            java.lang.String r17 = "BSC_PAYOUT_HUB_OVERVIEW"
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r6
            r23 = r5
            com.facebookpay.msc.overview.viewmodel.OverviewViewModel.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r1.A00
            X.0Mo r4 = (X.C04180Mo) r4
            boolean r3 = r4.A00
            if (r3 == 0) goto L_0x11f5
            java.lang.String r3 = "fetch_success"
            com.facebookpay.msc.overview.viewmodel.OverviewViewModel.A01(r14, r3)
            r4.A00 = r2
        L_0x11f5:
            boolean r3 = X.AnonymousClass7Kx.A0O(r0)
            if (r3 == 0) goto L_0x1233
            X.C86154wM.A1N(r14, r2)
            r5 = 0
            java.lang.Throwable r0 = r0.A02
            if (r0 == 0) goto L_0x1237
            java.lang.String r7 = r0.getMessage()
            java.lang.String r8 = X.AnonymousClass721.A00(r0)
            java.lang.Class r0 = r0.getClass()
            if (r0 == 0) goto L_0x1215
            java.lang.String r16 = r0.getSimpleName()
        L_0x1215:
            r13 = 450(0x1c2, float:6.3E-43)
            java.lang.String r4 = "client_fetch_payouthub_fail"
            java.lang.String r6 = "BSC_PAYOUT_HUB_OVERVIEW"
            r3 = r14
            r9 = r16
            r10 = r5
            r11 = r5
            r12 = r5
            com.facebookpay.msc.overview.viewmodel.OverviewViewModel.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = r1.A00
            X.0Mo r1 = (X.C04180Mo) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x1233
            java.lang.String r0 = "fetch_fail"
            com.facebookpay.msc.overview.viewmodel.OverviewViewModel.A01(r14, r0)
            r1.A00 = r2
        L_0x1233:
            com.facebookpay.msc.overview.viewmodel.OverviewViewModel.A00(r14)
            return
        L_0x1237:
            r7 = r5
            r8 = r5
            goto L_0x1215
        L_0x123a:
            r5 = 0
            goto L_0x11d3
        L_0x123c:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 != 0) goto L_0x124a
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x125b
        L_0x124a:
            java.lang.Object r2 = r1.A00
            com.facebook.redex.IDxACallbackShape2S2200000_2_I2 r2 = (com.facebook.redex.IDxACallbackShape2S2200000_2_I2) r2
            java.lang.Object r2 = r2.A00
            X.583 r2 = (X.AnonymousClass583) r2
            X.56q r3 = r2.A03
            java.lang.Object r2 = r1.A01
            X.M5J r2 = (X.M5J) r2
            r3.A0J(r2)
        L_0x125b:
            java.lang.Object r1 = r1.A00
            com.facebook.redex.IDxACallbackShape2S2200000_2_I2 r1 = (com.facebook.redex.IDxACallbackShape2S2200000_2_I2) r1
            java.lang.Object r1 = r1.A00
            X.583 r1 = (X.AnonymousClass583) r1
            X.56q r1 = r1.A03
            r1.A0G(r0)
            return
        L_0x1269:
            X.6kE r0 = (X.C109576kE) r0
            java.lang.Object r2 = r1.A01
            X.M5J r2 = (X.M5J) r2
            r2.A0F(r1)
            java.lang.Object r3 = r1.A00
            X.839 r3 = (X.AnonymousClass839) r3
            X.583 r7 = r3.A02
            X.8kM r2 = r3.A03
            X.7Gy r6 = r3.A01
            X.7Dk r1 = r3.A05
            X.6gT r5 = r3.A04
            X.52T r4 = new X.52T
            r4.<init>(r7, r2, r5, r1)
            X.56r r3 = r7.A05
            X.6ci r1 = r7.A09
            X.85p r1 = r1.A00
            java.util.concurrent.Executor r2 = r1.A03
            r0.getClass()
            r11 = 0
            X.6sP r1 = new X.6sP
            r7 = r1
            r8 = r4
            r9 = r6
            r10 = r0
            r12 = r5
            r13 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7JD.A03(r3, r1)
            return
        L_0x12a0:
            java.lang.Object r5 = r1.A00
            X.M5J[] r5 = (X.M5J[]) r5
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L_0x12a7:
            if (r3 >= r4) goto L_0x16f6
            r0 = r5[r3]
            X.7Kx r0 = X.C86104wH.A0R(r0)
            boolean r0 = X.AnonymousClass7Kx.A0P(r0)
            r2 = r2 | r0
            int r3 = r3 + 1
            goto L_0x12a7
        L_0x12b7:
            com.fbpay.w3c.models.W3CCardDetail r0 = (com.fbpay.w3c.models.W3CCardDetail) r0
            java.lang.Object r6 = r1.A01
            X.56X r6 = (X.AnonymousClass56X) r6
            X.56q r7 = r6.A05
            java.lang.Object r1 = r1.A00
            X.M5J r1 = (X.M5J) r1
            r7.A0J(r1)
            if (r0 == 0) goto L_0x135a
            com.fbpay.w3c.CardDetails r10 = r0.A00
            java.lang.String r2 = r10.A04
            java.lang.String r9 = ""
            if (r2 == 0) goto L_0x133a
            java.util.Locale r1 = java.util.Locale.getDefault()
            X.C04220Ms.A06(r1)
            java.lang.String r8 = X.C18190wL.A0r(r1, r2)
            java.util.Locale r12 = java.util.Locale.getDefault()
            X.C04220Ms.A06(r12)
            r11 = 0
            r5 = 1
            int r1 = r8.length()
            if (r1 <= 0) goto L_0x1310
            char r4 = r8.charAt(r11)
            boolean r1 = java.lang.Character.isLowerCase(r4)
            if (r1 == 0) goto L_0x1310
            java.lang.StringBuilder r3 = X.C18200wM.A0r()
            char r2 = java.lang.Character.toTitleCase(r4)
            char r1 = java.lang.Character.toUpperCase(r4)
            if (r2 == r1) goto L_0x132e
            r3.append(r2)
        L_0x1305:
            java.lang.String r1 = X.C86134wK.A0q(r8, r5)
            java.lang.String r8 = X.C18180wK.A0i(r1, r3)
            X.C04220Ms.A06(r8)
        L_0x1310:
            r6.A02 = r8
            java.lang.String r1 = r10.A09
            if (r1 == 0) goto L_0x1317
            r9 = r1
        L_0x1317:
            r6.A03 = r9
            X.69W[] r5 = X.AnonymousClass69W.values()
            int r4 = r5.length
            r3 = 0
        L_0x131f:
            if (r3 >= r4) goto L_0x133c
            r2 = r5[r3]
            java.lang.String r1 = r2.A02
            boolean r1 = r1.equalsIgnoreCase(r8)
            if (r1 != 0) goto L_0x133e
            int r3 = r3 + 1
            goto L_0x131f
        L_0x132e:
            java.lang.String r1 = X.C18230wP.A0s(r8, r11, r5)
            java.lang.String r1 = X.C18220wO.A0u(r12, r1)
            r3.append(r1)
            goto L_0x1305
        L_0x133a:
            r8 = r9
            goto L_0x1310
        L_0x133c:
            X.69W r2 = X.AnonymousClass69W.EMPTY
        L_0x133e:
            X.C04220Ms.A06(r2)
            r6.A00 = r2
            X.56r r1 = r6.A07
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x1357
            X.67R r0 = X.AnonymousClass67R.A01
        L_0x134b:
            r1.A0H(r0)
            X.67n r0 = X.C969967n.InvalidInput
            r7.A0H(r0)
            X.AnonymousClass56X.A01(r6)
            return
        L_0x1357:
            X.67R r0 = X.AnonymousClass67R.A03
            goto L_0x134b
        L_0x135a:
            java.lang.String r2 = "Card associated with "
            java.lang.String r1 = r6.A0B
            java.lang.String r0 = " could not be found"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x1369:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            int r0 = r2.getId()
            r4.A02(r0)
            int r1 = r4.getChildCount()
            r0 = 1
            if (r1 != r0) goto L_0x1382
            r0 = 2131305269(0x7f092335, float:1.8228704E38)
            X.C18200wM.A1D(r2, r0)
        L_0x1382:
            r4.invalidate()
            return
        L_0x1386:
            java.lang.String r9 = (java.lang.String) r9
            r4 = 1
            r3 = 0
            java.lang.String[] r11 = new java.lang.String[]{r5}
            java.lang.String r10 = "nuxFormContentRequestKey"
            X.69R r7 = X.AnonymousClass69R.A0Z
            android.os.Bundle r2 = X.AnonymousClass7I8.A01(r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "ecp_container_fragment"
            X.AnonymousClass7H3.A01(r2, r1, r0, r4, r3)
            return
        L_0x13a0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x13a5:
            r8 = r12
        L_0x13a6:
            X.7ke r31 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r33 = r2.A0v()
            long r38 = X.C86164wN.A0A(r13)
            X.LcE r32 = r13.Aam()
            X.58K r9 = r2.A1S
            java.util.List r3 = r9.A07()
            X.588 r0 = r2.A1N
            java.util.List r0 = r0.A03()
            java.util.List r35 = X.AnonymousClass00J.A0V(r0, r3)
            X.587 r11 = r2.A1O
            X.7DP r7 = r11.A03()
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r29 = 0
            r30 = 0
            r3 = 0
            r0 = 0
            r15 = 0
            java.util.LinkedHashMap r4 = X.C18220wO.A0y()
            X.AnonymousClass7Kr.A0B(r7, r4)
            java.lang.String r34 = "checkout"
            r36 = r8
            r37 = r4
            r31.A09(r32, r33, r34, r35, r36, r37, r38)
            r10 = 0
            if (r6 == 0) goto L_0x164c
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer> r7 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.class
            java.lang.String r4 = "request_payment_container(input:$input)"
            com.facebook.pando.TreeJNI r7 = r6.getTreeValue(r4, r7)
            if (r7 == 0) goto L_0x164c
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer$ContainerList> r6 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.ContainerList.class
            java.lang.String r4 = "container_list"
            com.google.common.collect.ImmutableList r4 = r7.getTreeList(r4, r6)
            if (r4 == 0) goto L_0x164c
            java.lang.Object r5 = r4.get(r5)
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            if (r5 == 0) goto L_0x164c
            X.6uB r6 = X.AnonymousClass58M.A00(r2)
            boolean r4 = X.AnonymousClass58M.A0n(r2)
            if (r4 == 0) goto L_0x141e
            if (r6 == 0) goto L_0x141e
            java.lang.String r4 = r6.A02
            r21 = r4
        L_0x141e:
            boolean r4 = X.AnonymousClass58M.A0m(r2)
            if (r4 == 0) goto L_0x142e
            if (r6 == 0) goto L_0x142e
            X.6uv r4 = r6.A00
            if (r4 == 0) goto L_0x142e
            java.lang.String r4 = r4.A02
            r20 = r4
        L_0x142e:
            boolean r4 = X.AnonymousClass58M.A0o(r2)
            if (r4 == 0) goto L_0x143e
            if (r6 == 0) goto L_0x143e
            X.6uq r4 = r6.A01
            if (r4 == 0) goto L_0x143e
            java.lang.String r4 = r4.A03
            r19 = r4
        L_0x143e:
            java.util.List r6 = r2.A0w()
            X.69P r4 = X.AnonymousClass69P.PICKUP_CONTACT_INFO
            boolean r4 = X.AnonymousClass7BG.A02(r4, r6)
            if (r4 == 0) goto L_0x161c
            boolean r4 = X.AnonymousClass58M.A0q(r2)
            if (r4 != 0) goto L_0x145c
            boolean r4 = X.AnonymousClass58M.A0r(r2)
            if (r4 != 0) goto L_0x145c
            boolean r4 = X.AnonymousClass58M.A0p(r2)
            if (r4 == 0) goto L_0x161c
        L_0x145c:
            r4 = 1
        L_0x145d:
            r6 = 0
            if (r4 == 0) goto L_0x1474
            X.58R r4 = r2.A1R
            X.56r r4 = r4.A06
            X.7Kx r4 = X.C86104wH.A0R(r4)
            if (r4 == 0) goto L_0x1474
            java.lang.Object r4 = r4.A01
            X.6iy r4 = (X.C108806iy) r4
            if (r4 == 0) goto L_0x1474
            java.lang.Object r6 = r4.A01
            com.facebookpay.expresscheckout.models.PickupInfo r6 = (com.facebookpay.expresscheckout.models.PickupInfo) r6
        L_0x1474:
            boolean r4 = X.AnonymousClass58M.A0q(r2)
            if (r4 == 0) goto L_0x1480
            if (r6 == 0) goto L_0x1480
            java.lang.String r4 = r6.A01
            r18 = r4
        L_0x1480:
            boolean r4 = X.AnonymousClass58M.A0p(r2)
            if (r4 == 0) goto L_0x148c
            if (r6 == 0) goto L_0x148c
            java.lang.String r4 = r6.A00
            r17 = r4
        L_0x148c:
            boolean r4 = X.AnonymousClass58M.A0r(r2)
            if (r4 == 0) goto L_0x1498
            if (r6 == 0) goto L_0x1498
            java.lang.String r4 = r6.A03
            r16 = r4
        L_0x1498:
            boolean r4 = X.AnonymousClass58M.A0s(r2)
            if (r4 == 0) goto L_0x14a2
            com.facebookpay.shippingaddress.model.ShippingAddress r29 = X.AnonymousClass58M.A02(r2)
        L_0x14a2:
            boolean r4 = X.AnonymousClass58M.A0l(r2)
            if (r4 == 0) goto L_0x14b4
            X.58U r4 = r2.A1P
            boolean r4 = r4.A0H()
            if (r4 == 0) goto L_0x1616
            com.facebookpay.shippingaddress.model.ShippingAddress r30 = X.AnonymousClass58M.A02(r2)
        L_0x14b4:
            X.58S r4 = r2.A1M
            X.56q r4 = r4.A05
            X.7Kx r4 = X.C86104wH.A0R(r4)
            if (r4 == 0) goto L_0x1613
            java.lang.Object r4 = r4.A01
            X.6iy r4 = (X.C108806iy) r4
            if (r4 == 0) goto L_0x1613
            java.lang.Object r4 = r4.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r4 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r4
            if (r4 == 0) goto L_0x1613
            java.lang.String r4 = r4.A02()
        L_0x14ce:
            X.56r r6 = r9.A09
            X.7Kx r6 = X.C86104wH.A0R(r6)
            if (r6 == 0) goto L_0x160f
            java.lang.Object r6 = r6.A01
            com.facebookpay.expresscheckout.models.OffersList r6 = (com.facebookpay.expresscheckout.models.OffersList) r6
            if (r6 == 0) goto L_0x160f
            java.util.List<com.facebookpay.expresscheckout.models.ECPOffer> r8 = r6.A00
        L_0x14de:
            java.lang.Object r6 = X.AnonymousClass58M.A07(r2)
            if (r6 == 0) goto L_0x1647
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r6 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r6
            java.lang.String r6 = r6.A0A
            r25 = r6
            java.lang.Object r1 = r1.A00
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            int r6 = r1.A00
            r24 = r6
            java.lang.String r6 = r1.A09
            r23 = r6
            java.lang.String r6 = "container_external_id"
            java.lang.String r34 = r5.getStringValue(r6)
            if (r34 == 0) goto L_0x1642
            java.lang.String r6 = "container_id"
            java.lang.String r35 = r5.getStringValue(r6)
            if (r35 == 0) goto L_0x163d
            java.lang.String r6 = "description"
            java.lang.String r36 = r5.getStringValue(r6)
            if (r36 == 0) goto L_0x1638
            java.lang.String r6 = "container_data"
            java.lang.String r37 = r5.getStringValue(r6)
            X.66Y r7 = X.AnonymousClass66Y.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r6 = "payment_mode"
            java.lang.Enum r6 = X.C86104wH.A0a(r5, r7, r6)
            if (r6 == 0) goto L_0x1633
            java.lang.String r38 = r6.toString()
            if (r4 == 0) goto L_0x1580
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r2)
            if (r0 == 0) goto L_0x160c
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r0.A03
            if (r0 == 0) goto L_0x160c
            boolean r3 = X.AnonymousClass58M.A0s(r2)
            if (r3 == 0) goto L_0x160c
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r0 = r0.A01
            java.util.Iterator r6 = r0.iterator()
        L_0x153a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x1609
            java.lang.Object r3 = r6.next()
            r0 = r3
            com.facebookpay.expresscheckout.models.ShippingOption r0 = (com.facebookpay.expresscheckout.models.ShippingOption) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x153a
        L_0x154f:
            com.facebookpay.expresscheckout.models.ShippingOption r3 = (com.facebookpay.expresscheckout.models.ShippingOption) r3
        L_0x1551:
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.AnonymousClass7Kx.A00(r2)
            if (r0 == 0) goto L_0x1606
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x1606
            boolean r6 = X.AnonymousClass58M.A0s(r2)
            if (r6 == 0) goto L_0x1606
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r0 = r0.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x1567:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1603
            java.lang.Object r0 = r7.next()
            r6 = r0
            com.facebookpay.expresscheckout.models.FulfillmentOption r6 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r6
            java.lang.String r6 = r6.A00()
            boolean r6 = X.C04220Ms.A0I(r6, r4)
            if (r6 == 0) goto L_0x1567
        L_0x157e:
            com.facebookpay.expresscheckout.models.FulfillmentOption r0 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r0
        L_0x1580:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r1.A01
            if (r4 == 0) goto L_0x1586
            java.util.Set<X.68F> r15 = r4.A0C
        L_0x1586:
            X.56r r4 = r2.A03
            X.7Kx r4 = X.C86104wH.A0R(r4)
            if (r4 == 0) goto L_0x162e
            java.lang.Object r4 = r4.A01
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x162e
            java.lang.String r6 = r2.A0W
            if (r6 == 0) goto L_0x1629
            java.lang.String r14 = r2.A0X
            java.lang.String r9 = r1.A08
            r1 = 1
            com.facebookpay.otc.models.OtcInput r28 = r11.A02(r12, r1)
            X.7Kx r1 = r2.A0S
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x1624
            com.facebookpay.expresscheckout.models.TransactionInfo r1 = (com.facebookpay.expresscheckout.models.TransactionInfo) r1
            java.lang.String r7 = "container_type"
            java.lang.String r49 = r5.getStringValue(r7)
            X.7Kx r5 = r2.A0A
            java.lang.Object r5 = r5.A01
            com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem r5 = (com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem) r5
            if (r5 == 0) goto L_0x15b9
            boolean r10 = r5.A00
        L_0x15b9:
            X.LcE r27 = r13.Aam()
            java.lang.String r5 = r13.Aal()
            java.lang.Long r31 = X.AnonymousClass0wJ.A0d(r5)
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r5 = new com.facebookpay.expresscheckout.models.ECPPaymentResponseParams
            r32 = r25
            r33 = r23
            r39 = r21
            r40 = r20
            r41 = r19
            r42 = r18
            r43 = r17
            r44 = r16
            r45 = r4
            r46 = r6
            r47 = r14
            r48 = r9
            r50 = r8
            r51 = r15
            r52 = r24
            r53 = r10
            r23 = r5
            r24 = r0
            r25 = r3
            r26 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r2.A05
            if (r0 == 0) goto L_0x161f
            X.M5J r6 = r0.BNU(r5)
            r0 = 4
            com.facebook.redex.IDxObserverShape99S0200000_2_I2 r1 = X.C86164wN.A0O(r2, r5, r0)
        L_0x15ff:
            X.AnonymousClass7Kx.A0H(r6, r1)
            return
        L_0x1603:
            r0 = 0
            goto L_0x157e
        L_0x1606:
            r0 = r12
            goto L_0x1580
        L_0x1609:
            r3 = 0
            goto L_0x154f
        L_0x160c:
            r3 = r12
            goto L_0x1551
        L_0x160f:
            X.0ZV r8 = X.AnonymousClass0ZV.A00
            goto L_0x14de
        L_0x1613:
            r4 = r12
            goto L_0x14ce
        L_0x1616:
            com.facebookpay.shippingaddress.model.ShippingAddress r30 = X.AnonymousClass58M.A01(r2)
            goto L_0x14b4
        L_0x161c:
            r4 = 0
            goto L_0x145d
        L_0x161f:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1624:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1629:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x162e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1633:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1638:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x163d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1642:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1647:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x164c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1651:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x1656:
            com.fbpay.theme.FBPayIcon r1 = r3.A0K
            X.56q r0 = r3.A06
            if (r1 == 0) goto L_0x1661
            X.75V r9 = new X.75V
            r9.<init>((com.fbpay.theme.FBPayIcon) r1)
        L_0x1661:
            r0.A0H(r9)
            return
        L_0x1665:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        L_0x166a:
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r1.A00
            X.6mt r0 = (X.C111166mt) r0
            com.fbpay.logging.LoggingContext r9 = r0.A03
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r0.A02
            long r13 = X.C86164wN.A0A(r0)
            X.LcE r8 = r0.Aam()
            if (r7 == 0) goto L_0x16b2
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer> r4 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.class
            java.lang.String r0 = "request_payment_container(input:$input)"
            com.facebook.pando.TreeJNI r5 = r7.getTreeValue(r0, r4)
            if (r5 == 0) goto L_0x16b2
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer$ContainerList> r4 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.ContainerList.class
            java.lang.String r0 = "container_list"
            com.google.common.collect.ImmutableList r0 = r5.getTreeList(r0, r4)
            if (r0 == 0) goto L_0x16b2
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r5 = r0.iterator()
        L_0x169c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x16b4
            com.facebook.pando.TreeJNI r4 = X.C18210wN.A0G(r5)
            java.lang.String r0 = "container_id"
            java.lang.String r0 = r4.getStringValue(r0)
            if (r0 == 0) goto L_0x169c
            r10.add(r0)
            goto L_0x169c
        L_0x16b2:
            X.0ZV r10 = X.AnonymousClass0ZV.A00
        L_0x16b4:
            java.lang.Object r0 = r1.A01
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x16be
            X.7DP r2 = X.AnonymousClass7DP.A00(r0)
        L_0x16be:
            java.util.LinkedHashMap r11 = X.C18220wO.A0y()
            if (r2 == 0) goto L_0x16c7
            X.AnonymousClass7Kr.A0B(r2, r11)
        L_0x16c7:
            r0 = 2
            X.C04220Ms.A0B(r8, r0)
            X.09x r1 = r3.A00
            java.lang.String r0 = "client_add_ecppaymentcontainer_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 187(0xbb, float:2.62E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.IDxLambdaShape0S0400100_2_I2 r7 = new kotlin.jvm.internal.IDxLambdaShape0S0400100_2_I2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.C128957ke.A04(r0, r9, r7)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r3.A01
            r1 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONTAINER_CREATION_WITHOUT_NONAUTH_ERROR_SUCCESS"
            r2.markerPoint(r1, r0)
            return
        L_0x16ec:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        L_0x16f1:
            java.lang.Object r0 = r3.A08()
            goto L_0x16fe
        L_0x16f6:
            java.lang.Object r3 = r1.A01
            X.M5J r3 = (X.M5J) r3
        L_0x16fa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x16fe:
            r3.A0G(r0)
            return
        L_0x1702:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 != 0) goto L_0x1711
        L_0x170f:
            r0 = 8
        L_0x1711:
            r2.setVisibility(r0)
            return
        L_0x1715:
            java.lang.Object r1 = r1.A00
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1
            r0 = 1
            r1.setPrimaryActionIsLoading(r0)
            r1.setSecondaryButtonEnabled(r3)
            return
        L_0x1721:
            android.graphics.drawable.Drawable r0 = r9.A01
            if (r0 != 0) goto L_0x173f
            android.content.Context r4 = r2.getContext()
            r0 = 2131232445(0x7f0806bd, float:1.8081E38)
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r0)
            r9.A01 = r1
            X.C04220Ms.A0A(r1)
            r0 = 2131099740(0x7f06005c, float:1.7811842E38)
            int r0 = r4.getColor(r0)
            r1.setTint(r0)
        L_0x173f:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131100117(0x7f0601d5, float:1.7812606E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
            r0 = 2131301509(0x7f091485, float:1.8221078E38)
            android.widget.ImageView r1 = X.C18200wM.A0J(r2, r0)
            android.graphics.drawable.Drawable r0 = r9.A01
            r1.setImageDrawable(r0)
            r0 = 2131303126(0x7f091ad6, float:1.8224358E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r2, r0)
            r0.setText(r3)
            r2.setVisibility(r8)
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            X.80A r0 = new X.80A
            r0.<init>(r9)
            r3 = 2000(0x7d0, double:9.88E-321)
        L_0x1772:
            r2.postDelayed(r0, r3)
            return
        L_0x1776:
            r0 = 24
            java.lang.String r0 = X.I17.A00(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x1785:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r25)
            throw r0
        L_0x178a:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r25)
            throw r0
        L_0x178f:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r25)
            throw r0
        L_0x1794:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r25)
            throw r0
        L_0x1799:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x179e:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r5 = X.AnonymousClass7Kx.A0P(r0)
            if (r5 != 0) goto L_0x17e1
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 == 0) goto L_0x17da
            java.lang.Object r4 = r1.A00
            X.5jy r4 = (X.C92855jy) r4
            java.lang.Object r0 = r0.A01
            r0.getClass()
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = (com.fbpay.hub.paymentmethods.api.FbPayShopPay) r0
            r4.A01 = r0
            X.56q r2 = r4.A03
            com.google.common.collect.ImmutableList r0 = X.C92855jy.A00(r4)
            r2.A0H(r0)
            com.fbpay.logging.FBPayLoggerData r0 = r4.A02
            java.util.Map r3 = X.C122037Js.A05(r0)
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = r4.A01
            java.lang.String r0 = r0.A00
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            X.C86164wN.A1J(r0, r3)
            X.8h9 r2 = r4.A07
            java.lang.String r0 = "client_edit_credential_success"
            r2.Bb8(r0, r3)
        L_0x17da:
            java.lang.Object r0 = r1.A01
            X.M5J r0 = (X.M5J) r0
            r0.A0F(r1)
        L_0x17e1:
            java.lang.Object r0 = r1.A00
            X.57m r0 = (X.C882957m) r0
            X.56q r4 = r0.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x1841
        L_0x17ec:
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r2 = X.AnonymousClass7Kx.A0P(r0)
            if (r2 != 0) goto L_0x1837
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            java.lang.Object r4 = r1.A00
            X.5jw r4 = (X.C92835jw) r4
            if (r2 == 0) goto L_0x182c
            java.lang.Object r0 = r0.A01
            r0.getClass()
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = (com.fbpay.hub.paymentmethods.api.FbPayShopPay) r0
            java.lang.String r2 = r0.A00
            com.fbpay.logging.FBPayLoggerData r0 = r4.A06
            java.util.Map r3 = X.C122037Js.A06(r0)
            if (r2 == 0) goto L_0x1816
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r2)
            X.C86164wN.A1J(r0, r3)
        L_0x1816:
            java.lang.String r2 = "credential_type"
            java.lang.String r0 = "shop_pay"
            r3.put(r2, r0)
            X.8h9 r2 = r4.A0E
            java.lang.String r0 = "client_add_credential_success"
        L_0x1821:
            r2.Bb8(r0, r3)
            X.6q3 r2 = r4.A05
            java.util.Set r0 = r4.A0G
            r2.A00(r0)
            goto L_0x1875
        L_0x182c:
            com.fbpay.logging.FBPayLoggerData r0 = r4.A06
            java.util.Map r3 = X.C122037Js.A05(r0)
            X.8h9 r2 = r4.A0E
            java.lang.String r0 = "client_add_credential_fail"
            goto L_0x1821
        L_0x1837:
            java.lang.Object r0 = r1.A00
            X.57m r0 = (X.C882957m) r0
            X.56q r4 = r0.A03
            java.lang.Boolean r0 = X.C18180wK.A0Y()
        L_0x1841:
            r4.A0H(r0)
            return
        L_0x1845:
            X.7Kx r0 = X.C86104wH.A0S(r0)
            boolean r2 = X.AnonymousClass7Kx.A0R(r0)
            if (r2 != 0) goto L_0x1855
            boolean r2 = X.AnonymousClass7Kx.A0O(r0)
            if (r2 == 0) goto L_0x185c
        L_0x1855:
            java.lang.Object r2 = r1.A01
            X.M5J r2 = (X.M5J) r2
            r2.A0F(r1)
        L_0x185c:
            java.lang.Object r1 = r1.A00
        L_0x185e:
            X.8gC r1 = (X.C143158gC) r1
        L_0x1860:
            r1.onChanged(r0)
            return
        L_0x1864:
            java.util.Collection r0 = (java.util.Collection) r0
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            java.lang.Object r2 = r1.A00
            org.chromium.IsReadyToPayServiceCallback r2 = (org.chromium.IsReadyToPayServiceCallback) r2
            boolean r0 = X.C18190wL.A1a(r0)
            r2.BNM(r0)
        L_0x1875:
            java.lang.Object r0 = r1.A01
        L_0x1877:
            X.M5J r0 = (X.M5J) r0
            r0.A0F(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape99S0200000_2_I2.onChanged(java.lang.Object):void");
    }

    public IDxObserverShape99S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }
}
