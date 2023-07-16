package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape29S0201000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape29S0201000_I2(int i, int i2, Object obj, Object obj2) {
        super(0);
        this.A03 = i2;
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        r3 = ((android.view.View) r1).findViewById(r5.A00);
        r0 = (X.AnonymousClass0YY) r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
        X.C04220Ms.A06(r3);
        r0.invoke(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04dc, code lost:
        return new com.facebook.redex.IDxListenerShape20S0201000_2_I2(r4, r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04e9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0271, code lost:
        if (r2 == 2) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02b2, code lost:
        if (r6.A06 != false) goto L_0x02b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x023d;
                case 1: goto L_0x021e;
                case 2: goto L_0x01c5;
                case 3: goto L_0x04d0;
                case 4: goto L_0x04c8;
                case 5: goto L_0x01af;
                case 6: goto L_0x0168;
                case 7: goto L_0x0157;
                case 8: goto L_0x0146;
                case 9: goto L_0x0135;
                case 10: goto L_0x0124;
                case 11: goto L_0x0113;
                case 12: goto L_0x008e;
                case 13: goto L_0x0486;
                case 14: goto L_0x0445;
                case 15: goto L_0x0077;
                case 16: goto L_0x006e;
                case 17: goto L_0x042b;
                case 18: goto L_0x005d;
                case 19: goto L_0x0043;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r6 = r0.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 == 0) goto L_0x0032
            int r4 = r5.A00
            java.lang.Object r2 = r5.A02
            java.util.List r2 = (java.util.List) r2
            boolean r0 = X.C36875JgM.A01
            r3 = 0
            if (r0 == 0) goto L_0x0035
            X.0Oa r0 = X.C36875JgM.A03
            java.lang.Object r2 = r0.getValue()
            X.K2o r2 = (X.C37752K2o) r2
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r0 = 0
            android.view.View r0 = X.C18180wK.A0D(r1, r3, r4, r0)
            r2.A00(r0, r4)
        L_0x0032:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0034:
            return r3
        L_0x0035:
            X.0hk r1 = new X.0hk
            r1.<init>(r6)
            X.7uJ r0 = new X.7uJ
            r0.<init>(r4)
            r1.A01(r0, r2, r4)
            goto L_0x0032
        L_0x0043:
            java.lang.Object r0 = r5.A02
            X.Ar0 r0 = (X.C19123Ar0) r0
            X.9Oz r3 = r0.A08
            java.lang.Object r2 = r5.A01
            com.instagram.model.shopping.Product r2 = (com.instagram.model.shopping.Product) r2
            int r1 = r5.A00
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 164(0xa4, float:2.3E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C156739Oz.A00(r2, r3, r0, r1)
            goto L_0x0032
        L_0x005d:
            java.lang.Object r4 = r5.A01
            X.8lT r4 = (X.C146008lT) r4
            java.lang.Object r3 = r5.A02
            X.5Hw r3 = (X.C89985Hw) r3
            X.9vO r2 = X.C170679vO.SHORTCUT_RIBBON
            int r1 = r5.A00
            r0 = 0
            r4.CKV(r2, r3, r0, r1)
            goto L_0x0032
        L_0x006e:
            java.lang.Object r0 = r5.A02
            X.0Oa r0 = (X.C04530Oa) r0
            java.lang.Object r1 = r0.getValue()
            goto L_0x0079
        L_0x0077:
            java.lang.Object r1 = r5.A02
        L_0x0079:
            android.view.View r1 = (android.view.View) r1
            int r0 = r5.A00
            android.view.View r3 = r1.findViewById(r0)
            java.lang.Object r0 = r5.A01
            X.0YY r0 = (X.AnonymousClass0YY) r0
            if (r0 == 0) goto L_0x0034
            X.C04220Ms.A06(r3)
            r0.invoke(r3)
            return r3
        L_0x008e:
            java.lang.String r4 = "connectivity_prober"
            java.lang.String r1 = "Probe attempt: %d."
            int r6 = r5.A00     // Catch:{ IOException -> 0x00cc }
            java.lang.Object[] r0 = X.C18210wN.A1X(r6)     // Catch:{ IOException -> 0x00cc }
            X.AnonymousClass0LU.A0O(r4, r1, r0)     // Catch:{ IOException -> 0x00cc }
            java.lang.Object r3 = r5.A02     // Catch:{ IOException -> 0x00cc }
            X.6mI r3 = (X.C110796mI) r3     // Catch:{ IOException -> 0x00cc }
            java.lang.String r1 = r3.A05     // Catch:{ IOException -> 0x00cc }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00cc }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00cc }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException -> 0x00cc }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C04220Ms.A0C(r2, r0)     // Catch:{ IOException -> 0x00cc }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x00cc }
            int r0 = r3.A00     // Catch:{ IOException -> 0x00cc }
            r2.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00cc }
            r2.setReadTimeout(r0)     // Catch:{ IOException -> 0x00cc }
            r0 = -1320363971(0xffffffffb14cd83d, float:-2.9808824E-9)
            X.C13770oH.A02(r2, r0)     // Catch:{ IOException -> 0x00cc }
            java.lang.Object r1 = r5.A01     // Catch:{ IOException -> 0x00cc }
            X.8km r1 = (X.C145608km) r1     // Catch:{ IOException -> 0x00cc }
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x00cc }
            r1.CMy(r0, r6)     // Catch:{ IOException -> 0x00cc }
            goto L_0x0032
        L_0x00cc:
            r8 = move-exception
            java.lang.String r0 = r8.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Attempt failed with (%s)."
            X.AnonymousClass0LU.A0O(r4, r0, r1)
            int r7 = r5.A00
            long r3 = (long) r7
            java.lang.Object r6 = r5.A02
            X.6mI r6 = (X.C110796mI) r6
            long r1 = r6.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00f8
            java.lang.Object r1 = r5.A01
            X.8km r1 = (X.C145608km) r1
            java.lang.String r0 = r8.getMessage()
            if (r0 != 0) goto L_0x00f3
            java.lang.String r0 = ""
        L_0x00f3:
            r1.onFailure(r0)
            goto L_0x0032
        L_0x00f8:
            java.lang.Object r5 = r5.A01
            int r4 = r7 + 1
            long r2 = r6.A01
            r1 = 12
            kotlin.jvm.internal.KtLambdaShape29S0201000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape29S0201000_I2
            r0.<init>(r4, r1, r6, r5)
            X.615 r1 = new X.615
            r1.<init>(r0)
            X.0g9 r0 = X.AnonymousClass0g9.A00()
            r0.A01(r1, r2)
            goto L_0x0032
        L_0x0113:
            java.lang.Object r0 = r5.A02
            X.CpF r0 = (X.C23267CpF) r0
            X.H8C r2 = r0.A00
            java.lang.Object r1 = r5.A01
            X.GbS r1 = (X.C30936GbS) r1
            int r0 = r5.A00
            r2.A1Y(r1, r0)
            goto L_0x0032
        L_0x0124:
            java.lang.Object r0 = r5.A02
            X.CpF r0 = (X.C23267CpF) r0
            X.H8C r2 = r0.A00
            java.lang.Object r1 = r5.A01
            X.GbS r1 = (X.C30936GbS) r1
            int r0 = r5.A00
            r2.A1X(r1, r0)
            goto L_0x0032
        L_0x0135:
            java.lang.Object r0 = r5.A02
            X.CpF r0 = (X.C23267CpF) r0
            X.H8C r2 = r0.A00
            java.lang.Object r1 = r5.A01
            com.instagram.pendingmedia.model.PendingMedia r1 = (com.instagram.pendingmedia.model.PendingMedia) r1
            int r0 = r5.A00
            r2.A10(r1, r0)
            goto L_0x0032
        L_0x0146:
            java.lang.Object r0 = r5.A02
            X.CpF r0 = (X.C23267CpF) r0
            X.H8C r2 = r0.A00
            java.lang.Object r1 = r5.A01
            com.instagram.pendingmedia.model.PendingMedia r1 = (com.instagram.pendingmedia.model.PendingMedia) r1
            int r0 = r5.A00
            r2.A0z(r1, r0)
            goto L_0x0032
        L_0x0157:
            java.lang.Object r0 = r5.A02
            X.CpF r0 = (X.C23267CpF) r0
            X.H8C r2 = r0.A00
            java.lang.Object r1 = r5.A01
            com.instagram.pendingmedia.model.PendingMedia r1 = (com.instagram.pendingmedia.model.PendingMedia) r1
            int r0 = r5.A00
            r2.A0y(r1, r0)
            goto L_0x0032
        L_0x0168:
            java.lang.Object r7 = r5.A02
            X.CRg r7 = (X.C22267CRg) r7
            int r6 = r5.A00
            java.lang.Object r0 = r5.A01
            X.Dk3 r0 = (X.C25343Dk3) r0
            boolean r5 = r0.A01
            androidx.recyclerview.widget.RecyclerView r0 = r7.A02
            java.lang.String r4 = "recyclerView"
            if (r0 == 0) goto L_0x04dd
            X.M6x r3 = r0.A0H
            r0 = 2
            java.lang.String r0 = X.I17.A00(r0)
            X.C04220Ms.A0C(r3, r0)
            androidx.recyclerview.widget.RecyclerView r2 = r7.A02
            if (r2 == 0) goto L_0x04dd
            r1 = 1
            boolean r0 = r2.A17()
            if (r0 != 0) goto L_0x0193
            r0 = 2
            r2.A0s(r0, r1)
        L_0x0193:
            X.5AR r1 = new X.5AR
            r1.<init>(r7, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A02
            if (r0 == 0) goto L_0x04dd
            r0.A11(r1)
            android.content.Context r1 = r7.requireContext()
            X.5A1 r0 = new X.5A1
            r0.<init>(r1)
            r0.A00 = r6
            r3.A1O(r0)
            goto L_0x0032
        L_0x01af:
            java.lang.Object r6 = r5.A01
            X.4qz r6 = (X.C83224qz) r6
            java.lang.Object r4 = r5.A02
            int r3 = r5.A00
            r2 = 0
            r0 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2
            r1.<init>(r4, r2, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r6, r0)
            goto L_0x0032
        L_0x01c5:
            java.lang.Object r0 = r5.A02
            X.9Qu r0 = (X.C157089Qu) r0
            X.9K5 r2 = r0.A07
            int r1 = r5.A00
            r0 = 817(0x331, float:1.145E-42)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r2.A0H(r0, r1)
            java.lang.Object r3 = r5.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0220000_I2) r3
            boolean r1 = r3.A02
            r0 = 968(0x3c8, float:1.356E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0J(r0, r1)
            java.lang.Object r0 = r3.A01
            X.ItQ r0 = (X.C35362ItQ) r0
            java.lang.String r1 = r0.name()
            r0 = 970(0x3ca, float:1.359E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0I(r0, r1)
            java.lang.Object r0 = r3.A00
            X.ItQ r0 = (X.C35362ItQ) r0
            java.lang.String r1 = r0.name()
            r0 = 969(0x3c9, float:1.358E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0I(r0, r1)
            boolean r1 = r3.A03
            r0 = 971(0x3cb, float:1.36E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0J(r0, r1)
            X.Dq7 r0 = r2.A00
            if (r0 == 0) goto L_0x0219
            r0.A06()
        L_0x0219:
            r0 = 0
            r2.A00 = r0
            goto L_0x0032
        L_0x021e:
            java.lang.Object r0 = r5.A01
            X.8pE r0 = (X.C147368pE) r0
            int r6 = r5.A00
            X.C147368pE.A03(r0, r6)
            java.lang.Object r4 = r5.A02
            X.3ak r4 = (X.C62793ak) r4
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r2 = 0
            r0 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2
            r1.<init>(r4, r2, r6, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x0032
        L_0x023d:
            java.lang.Object r6 = r5.A02
            X.58J r6 = (X.AnonymousClass58J) r6
            java.util.List r1 = r6.A06()
            int r2 = r5.A00
            if (r2 == 0) goto L_0x02c8
            r0 = 1
            if (r2 == r0) goto L_0x02c8
            r0 = 2
            if (r2 == r0) goto L_0x02c5
            r0 = 5
            if (r2 == r0) goto L_0x02c5
            r0 = 0
        L_0x0253:
            r4 = 0
            X.C04220Ms.A0B(r1, r4)
            int r1 = r1.indexOf(r0)
            r8 = 1
            r10 = 5
            if (r2 == 0) goto L_0x0265
            if (r2 != r8) goto L_0x02c2
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x02c2
        L_0x0265:
            r16 = 1
        L_0x0267:
            boolean r15 = X.AnonymousClass0wJ.A1T(r2, r8)
            r9 = 2
            r3 = 23
            if (r2 == r10) goto L_0x0273
            r12 = 0
            if (r2 != r9) goto L_0x0274
        L_0x0273:
            r12 = 1
        L_0x0274:
            boolean r11 = X.AnonymousClass0wJ.A1T(r2, r9)
            X.56r r0 = r6.A0H
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r0)
            if (r0 == 0) goto L_0x02c0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x02c0
            com.facebookpay.expresscheckout.models.KnownData r7 = r0.A01
        L_0x0286:
            int r2 = r1 + 1
            java.util.List r0 = r6.A06()
            int r1 = r0.size()
        L_0x0290:
            if (r2 >= r1) goto L_0x02cb
            java.util.List r0 = r6.A06()
            java.lang.Object r0 = r0.get(r2)
            X.69P r0 = (X.AnonymousClass69P) r0
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x02ad
            if (r0 != r3) goto L_0x02aa
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x02aa
            r11 = 1
            r12 = 1
        L_0x02aa:
            int r2 = r2 + 1
            goto L_0x0290
        L_0x02ad:
            if (r15 != 0) goto L_0x02b4
            boolean r0 = r6.A06
            r15 = 0
            if (r0 == 0) goto L_0x02b5
        L_0x02b4:
            r15 = 1
        L_0x02b5:
            if (r16 != 0) goto L_0x02bd
            boolean r0 = r6.A08
            r16 = 0
            if (r0 == 0) goto L_0x02aa
        L_0x02bd:
            r16 = 1
            goto L_0x02aa
        L_0x02c0:
            r7 = 0
            goto L_0x0286
        L_0x02c2:
            r16 = 0
            goto L_0x0267
        L_0x02c5:
            X.69P r0 = X.AnonymousClass69P.SHIPPING_ADDRESS
            goto L_0x0253
        L_0x02c8:
            X.69P r0 = X.AnonymousClass69P.CONTACT_INFORMATION
            goto L_0x0253
        L_0x02cb:
            X.57n r1 = r6.A01
            java.lang.String r14 = "formViewModel"
            if (r1 == 0) goto L_0x04e1
            r0 = 11
            X.7Ih r2 = r1.A01(r0)
            java.lang.String r13 = "loggingContext"
            java.lang.String r3 = "null cannot be cast to non-null type com.facebookpay.form.cell.text.TextCellViewModel"
            if (r2 == 0) goto L_0x03ab
            if (r11 == 0) goto L_0x02ef
            X.7Ih r1 = r2.A0F(r9)
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x0428
            java.lang.String r0 = r7.A02
        L_0x02ec:
            r1.A0O(r0)
        L_0x02ef:
            if (r12 == 0) goto L_0x03ab
            X.7ke r11 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r9 = r6.A02
            if (r9 == 0) goto L_0x04e5
            X.6B4 r1 = X.AnonymousClass6B4.SHIPPING_ADDRESS
            X.587 r0 = r6.A0S
            java.util.LinkedHashMap r0 = X.AnonymousClass7Kr.A07(r0)
            r11.A07(r1, r9, r0)
            r0 = 10
            X.7Ih r12 = r2.A0F(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.form.cell.selector.CountrySelectorCellViewModel"
            X.C04220Ms.A0C(r12, r0)
            X.5hO r12 = (X.C91975hO) r12
            if (r7 == 0) goto L_0x0425
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r7.A00
            if (r0 == 0) goto L_0x0425
            java.lang.String r1 = r0.A02
        L_0x0319:
            r11 = 0
        L_0x031a:
            com.google.common.collect.ImmutableList r9 = r12.A02
            int r0 = r9.size()
            if (r11 >= r0) goto L_0x0341
            java.lang.Object r0 = r9.get(r11)
            com.facebookpay.form.model.FormCountry r0 = (com.facebookpay.form.model.FormCountry) r0
            com.facebook.common.locale.Country r0 = r0.A00
            java.lang.String r0 = X.C86164wN.A0f(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0421
            X.56q r1 = r12.A05
            java.lang.Object r0 = r9.get(r11)
            com.facebookpay.form.model.FormCountry r0 = (com.facebookpay.form.model.FormCountry) r0
            com.facebook.common.locale.Country r0 = r0.A00
            r1.A0H(r0)
        L_0x0341:
            X.7Ih r1 = r2.A0F(r10)
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x041e
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r7.A00
            if (r0 == 0) goto L_0x041e
            java.lang.String r0 = r0.A08
        L_0x0352:
            r1.A0O(r0)
            r0 = 6
            X.7Ih r1 = r2.A0F(r0)
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x041b
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r7.A00
            if (r0 == 0) goto L_0x041b
            java.lang.String r0 = r0.A09
        L_0x0367:
            r1.A0O(r0)
            r0 = 7
            X.7Ih r1 = r2.A0F(r0)
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x0418
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r7.A00
            if (r0 == 0) goto L_0x0418
            java.lang.String r0 = r0.A01
        L_0x037c:
            r1.A0O(r0)
            r0 = 8
            X.7Ih r1 = r2.A0F(r0)
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x0415
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r7.A00
            if (r0 == 0) goto L_0x0415
            java.lang.String r0 = r0.A07
        L_0x0392:
            r1.A0O(r0)
            r0 = 9
            X.7Ih r1 = r2.A0F(r0)
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x0413
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r7.A00
            if (r0 == 0) goto L_0x0413
            java.lang.String r0 = r0.A06
        L_0x03a8:
            r1.A0O(r0)
        L_0x03ab:
            X.57n r1 = r6.A01
            if (r1 == 0) goto L_0x04e1
            r0 = 36
            X.7Ih r2 = r1.A01(r0)
            boolean r0 = r2 instanceof X.C92025hT
            if (r0 == 0) goto L_0x0411
            X.5hW r2 = (X.C92055hW) r2
        L_0x03bb:
            if (r15 == 0) goto L_0x03cf
            if (r2 == 0) goto L_0x040f
            X.7Ih r1 = r2.A0L(r8)
        L_0x03c3:
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x040d
            java.lang.String r0 = r7.A01
        L_0x03cc:
            r1.A0O(r0)
        L_0x03cf:
            if (r16 == 0) goto L_0x03e3
            if (r2 == 0) goto L_0x040b
            X.7Ih r1 = r2.A0L(r4)
        L_0x03d7:
            X.C04220Ms.A0C(r1, r3)
            X.5hR r1 = (X.C92005hR) r1
            if (r7 == 0) goto L_0x0409
            java.lang.String r0 = r7.A03
        L_0x03e0:
            r1.A0O(r0)
        L_0x03e3:
            if (r15 != 0) goto L_0x03e7
            if (r16 == 0) goto L_0x03fa
        L_0x03e7:
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r2 = r6.A02
            if (r2 == 0) goto L_0x04e5
            X.6B4 r1 = X.AnonymousClass6B4.CONTACT_INFO
            X.587 r0 = r6.A0S
            java.util.LinkedHashMap r0 = X.AnonymousClass7Kr.A07(r0)
            r3.A07(r1, r2, r0)
        L_0x03fa:
            java.lang.Object r0 = r5.A01
            X.5hR r0 = (X.C92005hR) r0
            X.56r r1 = r0.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.AnonymousClass7JD.A02(r1, r0)
            goto L_0x0032
        L_0x0409:
            r0 = 0
            goto L_0x03e0
        L_0x040b:
            r1 = 0
            goto L_0x03d7
        L_0x040d:
            r0 = 0
            goto L_0x03cc
        L_0x040f:
            r1 = 0
            goto L_0x03c3
        L_0x0411:
            r2 = 0
            goto L_0x03bb
        L_0x0413:
            r0 = 0
            goto L_0x03a8
        L_0x0415:
            r0 = 0
            goto L_0x0392
        L_0x0418:
            r0 = 0
            goto L_0x037c
        L_0x041b:
            r0 = 0
            goto L_0x0367
        L_0x041e:
            r0 = 0
            goto L_0x0352
        L_0x0421:
            int r11 = r11 + 1
            goto L_0x031a
        L_0x0425:
            r1 = 0
            goto L_0x0319
        L_0x0428:
            r0 = 0
            goto L_0x02ec
        L_0x042b:
            java.lang.Object r0 = r5.A02
            X.0Oa r0 = (X.C04530Oa) r0
            android.view.View r1 = X.C86144wL.A0I(r0)
            int r0 = r5.A00
            android.view.View r1 = r1.findViewById(r0)
            java.lang.Object r0 = r5.A01
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.C04220Ms.A06(r1)
            java.lang.Object r3 = r0.invoke(r1)
            return r3
        L_0x0445:
            java.lang.Object r4 = r5.A02
            X.8t1 r4 = (X.C149148t1) r4
            android.content.Context r1 = r4.A08
            int r0 = r4.A06
            X.F10 r3 = X.C86164wN.A0T(r1, r0)
            java.lang.Object r0 = r5.A01
            com.instagram.music.common.model.MusicAssetModel r0 = (com.instagram.music.common.model.MusicAssetModel) r0
            int r2 = r5.A00
            r3.setCallback(r4)
            java.lang.String r0 = r0.A0H
            r3.A0O(r0)
            android.content.res.Resources r1 = r4.A09
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r3.A0B(r0)
            int r0 = r4.A05
            if (r2 != r0) goto L_0x0480
            r0 = -1
        L_0x0471:
            r3.A0H(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r1 = 1
            r3.A0L(r0, r1)
            java.lang.String r0 = "…"
            r3.A0I(r1, r0)
            return r3
        L_0x0480:
            r0 = -1
            int r0 = X.C09760gd.A08(r2, r0)
            goto L_0x0471
        L_0x0486:
            java.lang.Object r4 = r5.A02
            X.8t1 r4 = (X.C149148t1) r4
            android.content.Context r1 = r4.A08
            int r0 = r4.A06
            X.F10 r3 = X.C86164wN.A0T(r1, r0)
            java.lang.Object r0 = r5.A01
            com.instagram.music.common.model.MusicAssetModel r0 = (com.instagram.music.common.model.MusicAssetModel) r0
            int r2 = r5.A00
            r3.setCallback(r4)
            java.lang.String r0 = r0.A0C
            r3.A0O(r0)
            android.content.res.Resources r1 = r4.A09
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r3.A0B(r0)
            int r0 = r4.A05
            if (r2 != r0) goto L_0x04c2
            r0 = -1
        L_0x04b2:
            r3.A0H(r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r0 = 0
            r3.A0L(r1, r0)
            java.lang.String r1 = "…"
            r0 = 1
            r3.A0I(r0, r1)
            return r3
        L_0x04c2:
            r0 = -1
            int r0 = X.C09760gd.A08(r2, r0)
            goto L_0x04b2
        L_0x04c8:
            int r4 = r5.A00
            java.lang.Object r2 = r5.A02
            java.lang.Object r1 = r5.A01
            r0 = 1
            goto L_0x04d7
        L_0x04d0:
            int r4 = r5.A00
            java.lang.Object r2 = r5.A02
            java.lang.Object r1 = r5.A01
            r0 = 0
        L_0x04d7:
            com.facebook.redex.IDxListenerShape20S0201000_2_I2 r3 = new com.facebook.redex.IDxListenerShape20S0201000_2_I2
            r3.<init>(r4, r0, r2, r1)
            return r3
        L_0x04dd:
            X.C04220Ms.A0E(r4)
            goto L_0x04e8
        L_0x04e1:
            X.C04220Ms.A0E(r14)
            goto L_0x04e8
        L_0x04e5:
            X.C04220Ms.A0E(r13)
        L_0x04e8:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape29S0201000_I2.invoke():java.lang.Object");
    }
}
