package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.widget.button.FBPayButton;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.5j3  reason: invalid class name */
public final class AnonymousClass5j3 extends AnonymousClass567 {
    public ContextThemeWrapper A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass58M A09;
    public C92225hp A0A;
    public FormParams A0B;
    public AnonymousClass58G A0C;
    public FormLayout A0D;
    public FBPayButton A0E;
    public ListCell A0F;
    public Boolean A0G;
    public String A0H;
    public AnonymousClass0YY A0I = C78204i3.A00;
    public boolean A0J;
    public boolean A0K;
    public final AnonymousClass0ZU A0L = new KtLambdaShape26S0100000_I2_6(this, 17);

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028a, code lost:
        if (r5.A0K != false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r2 != true) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0395  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r7 = 0
            r8 = r25
            X.C04220Ms.A0B(r8, r7)
            r5 = r24
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.String r1 = "ECP_FORM_FRAGMENT_PARAMS"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            if (r0 == 0) goto L_0x0609
            com.facebookpay.form.fragment.model.FormParams r0 = (com.facebookpay.form.fragment.model.FormParams) r0
            r5.A0B = r0
            java.lang.String r21 = "formParams"
            if (r0 == 0) goto L_0x0604
            com.facebookpay.form.fragment.model.FeatureConfiguration r0 = r0.A08
            r3 = 1
            if (r0 == 0) goto L_0x0026
            boolean r2 = r0.A01
            r0 = 1
            if (r2 == r3) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r5.A0K = r0
            r0 = r26
            super.onViewCreated(r8, r0)
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x0604
            com.facebookpay.form.fragment.model.FeatureConfiguration r0 = r0.A08
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.A00
            if (r0 != r3) goto L_0x0058
        L_0x003a:
            r5.A0J = r3
            r4 = 0
            X.58M r0 = X.C116896xj.A01(r5, r4)
            r5.A09 = r0
            X.7IU r2 = new X.7IU
            r2.<init>(r5)
            java.lang.Class<X.57n> r0 = X.C883057n.class
            X.3ak r13 = r2.A01(r0)
            X.57n r13 = (X.C883057n) r13
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 != 0) goto L_0x005a
            X.C04220Ms.A0E(r21)
            throw r4
        L_0x0058:
            r3 = 0
            goto L_0x003a
        L_0x005a:
            java.lang.Integer r3 = r0.A0D
            com.facebookpay.form.fragment.model.FeatureConfiguration r0 = r0.A08
            if (r0 == 0) goto L_0x007d
            boolean r2 = r0.A01
        L_0x0062:
            X.7bu r0 = new X.7bu
            r0.<init>(r3, r2)
            X.7IU r2 = X.AnonymousClass7IU.A00(r0, r5)
            java.lang.Class<X.58G> r0 = X.AnonymousClass58G.class
            X.3ak r9 = r2.A01(r0)
            X.58G r9 = (X.AnonymousClass58G) r9
            r5.A0C = r9
            java.lang.String r19 = "formFragmentViewModel"
            if (r9 != 0) goto L_0x007f
            X.C04220Ms.A0E(r19)
            throw r4
        L_0x007d:
            r2 = 0
            goto L_0x0062
        L_0x007f:
            android.os.Bundle r2 = r5.requireArguments()
            X.58M r0 = r5.A09
            java.lang.String r20 = "ecpViewModel"
            if (r0 != 0) goto L_0x008d
            X.C04220Ms.A0E(r20)
            throw r4
        L_0x008d:
            X.587 r12 = r0.A1O
            X.77d r10 = r0.A06
            if (r10 != 0) goto L_0x0094
            r10 = r4
        L_0x0094:
            r6 = 1
            X.C04220Ms.A0B(r13, r6)
            r3 = 2
            android.os.Parcelable r0 = r2.getParcelable(r1)
            java.lang.String r22 = "Required value was null."
            if (r0 == 0) goto L_0x05ff
            com.facebookpay.form.fragment.model.FormParams r0 = (com.facebookpay.form.fragment.model.FormParams) r0
            r9.A01 = r0
            java.lang.String r0 = "ECP_SESSION_ID"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x05fa
            r9.A07 = r0
            java.lang.String r0 = "ECP_PRODUCT_ID"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x05f5
            r9.A06 = r0
            java.lang.String r0 = "ECP_CLIENT_RECEIVER_ID"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x05f0
            r9.A05 = r0
            java.lang.String r11 = "logging_context"
            java.lang.Object r1 = r2.get(r11)
            java.lang.String r0 = "null cannot be cast to non-null type com.fbpay.logging.LoggingContext"
            X.C04220Ms.A0C(r1, r0)
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            r9.A04 = r1
            r9.A02 = r13
            r9.A03 = r12
            X.57n r1 = r9.A05()
            com.facebookpay.form.fragment.model.FormParams r0 = r9.A01
            if (r0 != 0) goto L_0x00e3
            X.C04220Ms.A0E(r21)
            r2 = 0
            throw r2
        L_0x00e3:
            java.util.ArrayList r0 = r0.A0I
            com.google.common.collect.ImmutableList r0 = X.C18220wO.A0S(r0)
            r1.A02(r10, r0)
            X.57n r0 = r9.A05()
            X.56q r1 = r0.A03
            X.7aL r0 = X.C124037aL.A00
            r1.A0E(r0)
            X.57n r0 = r9.A05()
            X.56q r0 = r0.A03
            r9.A00 = r0
            java.lang.String r0 = "ECP_FORM_FRAGMENT_ERROR_MESSAGE"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof com.facebookpay.common.models.ErrorDialogContent
            if (r0 == 0) goto L_0x0110
            if (r1 == 0) goto L_0x0110
            X.56r r0 = r9.A0A
            X.AnonymousClass7JD.A02(r0, r1)
        L_0x0110:
            X.6IA r12 = r9.A0E
            java.lang.String r18 = "loggingContext"
            r2 = 0
            if (r12 == 0) goto L_0x0156
            com.fbpay.logging.LoggingContext r11 = r9.A04
            if (r11 == 0) goto L_0x05e8
            com.facebookpay.form.fragment.model.FormParams r0 = r9.A01
            if (r0 == 0) goto L_0x05ec
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L_0x0154
            java.lang.Long r10 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0127:
            X.587 r0 = r9.A06()
            java.util.LinkedHashMap r9 = X.AnonymousClass7Kr.A07(r0)
            boolean r0 = r12 instanceof X.C92255hs
            if (r0 == 0) goto L_0x0144
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.String r0 = "edit_shipping_address"
        L_0x0139:
            r1.A0C(r11, r10, r0, r9)
        L_0x013c:
            X.58G r0 = r5.A0C
            if (r0 != 0) goto L_0x01e7
            X.C04220Ms.A0E(r19)
            throw r4
        L_0x0144:
            X.5ht r12 = (X.C92265ht) r12
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = "add_shipping_address_inline"
            goto L_0x0139
        L_0x0151:
            java.lang.String r0 = "add_shipping_address"
            goto L_0x0139
        L_0x0154:
            r10 = r4
            goto L_0x0127
        L_0x0156:
            com.facebookpay.form.fragment.model.FormParams r0 = r9.A01
            if (r0 == 0) goto L_0x05ec
            com.facebookpay.form.fragment.model.FormLoggingEvents r0 = r0.A09
            if (r0 == 0) goto L_0x013c
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x013c
            java.util.Iterator r17 = r0.iterator()
        L_0x0166:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r12 = r17.next()
            com.facebookpay.form.fragment.model.FormDisplayEvent r12 = (com.facebookpay.form.fragment.model.FormDisplayEvent) r12
            X.7ke r16 = X.AnonymousClass7JJ.A01()
            java.lang.String r0 = r12.A01
            r23 = r0
            com.fbpay.logging.LoggingContext r0 = r9.A04
            if (r0 == 0) goto L_0x05e8
            java.lang.String r15 = r12.A02
            com.facebookpay.form.fragment.model.FormParams r1 = r9.A01
            if (r1 == 0) goto L_0x05ec
            java.lang.String r1 = r1.A0H
            if (r1 == 0) goto L_0x01e5
            java.lang.Long r10 = X.AnonymousClass0wJ.A0d(r1)
        L_0x018c:
            X.587 r1 = r9.A06()
            X.7DP r14 = r1.A03()
            com.facebookpay.form.fragment.model.FormParams r1 = r9.A01
            if (r1 == 0) goto L_0x05ec
            int r1 = r1.A04
            X.LcE r1 = X.AnonymousClass58G.A00(r1)
            java.lang.String r13 = r12.A00
            java.util.LinkedHashMap r12 = X.C18220wO.A0y()
            r12.put(r11, r0)
            java.lang.String r0 = "VIEW_NAME"
            X.C86104wH.A1O(r10, r0, r15, r12)
            X.C86134wK.A1O(r1, r12)
            java.lang.String r10 = "extra_data"
            java.lang.Object r1 = r12.get(r10)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r1 instanceof X.C03740Kn
            if (r0 == 0) goto L_0x01c1
            boolean r0 = r1 instanceof X.AnonymousClass0WC
            if (r0 == 0) goto L_0x01c5
        L_0x01c1:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x01c9
        L_0x01c5:
            java.util.LinkedHashMap r1 = X.C18220wO.A0y()
        L_0x01c9:
            X.AnonymousClass7Kr.A0B(r14, r1)
            r12.put(r10, r1)
            if (r13 == 0) goto L_0x01d6
            java.lang.String r0 = "fields_to_verify"
            X.AnonymousClass7Kr.A0D(r13, r0, r12)
        L_0x01d6:
            com.google.common.collect.ImmutableMap r10 = com.google.common.collect.ImmutableMap.copyOf(r12)
            X.C04220Ms.A06(r10)
            r1 = r16
            r0 = r23
            r1.Bb8(r0, r10)
            goto L_0x0166
        L_0x01e5:
            r10 = r4
            goto L_0x018c
        L_0x01e7:
            X.M5J r1 = r0.A00
            if (r1 == 0) goto L_0x05e2
            r0 = 157(0x9d, float:2.2E-43)
            X.C86104wH.A1F(r5, r1, r0)
            X.58G r0 = r5.A0C
            if (r0 != 0) goto L_0x01f8
            X.C04220Ms.A0E(r19)
            throw r4
        L_0x01f8:
            X.56q r1 = r0.A08
            r0 = 158(0x9e, float:2.21E-43)
            X.C86104wH.A1F(r5, r1, r0)
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 != 0) goto L_0x0207
            X.C04220Ms.A0E(r21)
            throw r4
        L_0x0207:
            com.facebookpay.form.cell.CellParams r1 = r0.A07
            if (r1 == 0) goto L_0x0211
            X.7Ih r0 = r1.A01()
            r1.A00 = r0
        L_0x0211:
            r0 = 2131300772(0x7f0911a4, float:1.8219583E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            com.facebookpay.form.view.FormLayout r0 = (com.facebookpay.form.view.FormLayout) r0
            r5.A0D = r0
            r0 = 2131299022(0x7f090ace, float:1.8216034E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r8, r0)
            r5.A01 = r0
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A08 = r0
            r0 = 2131307619(0x7f092c63, float:1.823347E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A07 = r0
            r0 = 2131308201(0x7f092ea9, float:1.823465E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A04 = r0
            r0 = 2131302648(0x7f0918f8, float:1.8223388E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            r5.A0F = r0
            r0 = 2131305774(0x7f09252e, float:1.8229728E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A06 = r0
            r0 = 2131302730(0x7f09194a, float:1.8223554E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r8, r0)
            r5.A02 = r0
            r0 = 2131300442(0x7f09105a, float:1.8218914E38)
            android.view.View r9 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0342
            r9.setMinimumHeight(r7)
        L_0x0275:
            android.view.View r11 = r5.A01
            java.lang.String r14 = "contentContainer"
            r15 = 0
            if (r11 == 0) goto L_0x05d9
            X.7Ec r9 = X.AnonymousClass7Kz.A0G()
            boolean r0 = r5.A0J
            r10 = 20
            if (r0 == 0) goto L_0x028c
            boolean r1 = r5.A0K
            r0 = 20
            if (r1 == 0) goto L_0x028e
        L_0x028c:
            r0 = 19
        L_0x028e:
            int r0 = r9.A02(r0)
            X.AnonymousClass7Fe.A01(r11, r0)
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            int r1 = r0.A06
            java.lang.String r11 = "titleIcon"
            r9 = 8
            java.lang.String r13 = "title"
            android.widget.TextView r0 = r5.A08
            if (r1 != 0) goto L_0x02fc
            if (r0 == 0) goto L_0x051e
            r0.setVisibility(r9)
            android.widget.ImageView r0 = r5.A04
            if (r0 == 0) goto L_0x0590
            r0.setVisibility(r9)
        L_0x02b1:
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            java.util.List r12 = r0.A0J
            if (r12 == 0) goto L_0x0578
            int r11 = r12.size()
            r1 = 5
            r0 = 2131298191(0x7f09078f, float:1.8214348E38)
            if (r11 <= r1) goto L_0x02c6
            r0 = 2131298192(0x7f090790, float:1.821435E38)
        L_0x02c6:
            android.view.View r11 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r11.setVisibility(r7)
            java.util.Iterator r12 = r12.iterator()
        L_0x02d3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0578
            java.lang.Object r0 = r12.next()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            android.content.Context r0 = r5.requireContext()
            android.graphics.drawable.Drawable r8 = r0.getDrawable(r1)
            android.content.Context r0 = r5.requireContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131494300(0x7f0c059c, float:1.8612104E38)
            android.view.View r0 = r1.inflate(r0, r11, r7)
            X.C86134wK.A14(r8, r0, r11)
            goto L_0x02d3
        L_0x02fc:
            if (r0 == 0) goto L_0x051e
            r0.setText(r1)
            android.widget.TextView r1 = r5.A08
            if (r1 == 0) goto L_0x051e
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0338
            X.69Q r0 = X.AnonymousClass69Q.A0q
        L_0x030b:
            X.AnonymousClass7Fd.A02(r1, r0)
            android.widget.ImageView r1 = r5.A04
            if (r1 == 0) goto L_0x0590
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            X.697 r0 = r0.A0B
            X.C116966xu.A00(r4, r1, r0)
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            java.lang.Integer r0 = r0.A0G
            if (r0 == 0) goto L_0x02b1
            int r11 = r0.intValue()
            android.widget.TextView r1 = r5.A08
            if (r1 == 0) goto L_0x051e
            android.content.Context r0 = X.C18190wL.A0A(r1)
            java.lang.Integer r0 = X.AnonymousClass7IS.A01(r0, r11)
            X.AnonymousClass7IS.A02(r1, r4, r4, r4, r0)
            goto L_0x02b1
        L_0x0338:
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x033f
            X.69Q r0 = X.AnonymousClass69Q.A0u
            goto L_0x030b
        L_0x033f:
            X.69Q r0 = X.AnonymousClass69Q.A0s
            goto L_0x030b
        L_0x0342:
            X.C04220Ms.A0B(r9, r6)
            X.7IJ r0 = new X.7IJ
            r0.<init>(r5, r6)
            X.7k9 r1 = new X.7k9
            r1.<init>(r9)
            java.util.Set r0 = r0.A08
            r0.add(r1)
            java.lang.Object r0 = X.C86144wL.A0h(r5)
            if (r0 == 0) goto L_0x05dd
            X.69R r0 = (X.AnonymousClass69R) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0275
            X.7IS r0 = X.AnonymousClass6XN.A00
            r0.A04(r9)
            goto L_0x0275
        L_0x0367:
            X.AnonymousClass7Fe.A02(r1, r3)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1.setAlpha(r0)
            X.7Ri r0 = X.AnonymousClass7Ri.A00
            r1.setOnTouchListener(r0)
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            int r1 = r0.A04
            if (r1 == 0) goto L_0x059e
            if (r1 == r6) goto L_0x0599
            if (r1 == r3) goto L_0x0594
            r0 = 3
            if (r1 != r0) goto L_0x0391
            r1 = 2131826618(0x7f1117ba, float:1.9286125E38)
        L_0x0387:
            X.4x8 r0 = r5.A00
            if (r0 == 0) goto L_0x05cf
            java.lang.String r0 = r0.getString(r1)
            r5.A0H = r0
        L_0x0391:
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            com.facebookpay.form.fragment.model.ListCellParams r8 = r0.A0A
            if (r8 == 0) goto L_0x03c6
            com.facebookpay.widget.listcell.ListCell r1 = r5.A0F
            java.lang.String r11 = "listCell"
            if (r1 == 0) goto L_0x0590
            java.lang.String r0 = r8.A02
            r1.setPrimaryText(r0)
            com.facebookpay.widget.listcell.ListCell r1 = r5.A0F
            if (r1 == 0) goto L_0x0590
            java.lang.String r0 = r8.A01
            r1.setSecondaryText(r0)
            com.facebookpay.widget.listcell.ListCell r1 = r5.A0F
            if (r1 == 0) goto L_0x0590
            java.lang.String r0 = r8.A00
            r1.setImageUrl(r0)
            com.facebookpay.widget.listcell.ListCell r1 = r5.A0F
            if (r1 == 0) goto L_0x0590
            X.69B r0 = X.AnonymousClass69B.A0F
            r1.setTextStyle(r0)
            com.facebookpay.widget.listcell.ListCell r0 = r5.A0F
            if (r0 == 0) goto L_0x0590
            r0.setVisibility(r7)
        L_0x03c6:
            com.facebookpay.form.view.FormLayout r8 = r5.A0D
            if (r8 == 0) goto L_0x051e
            X.58G r0 = r5.A0C
            if (r0 == 0) goto L_0x05cb
            X.57n r0 = r0.A05()
            r8.A01 = r0
            X.56r r1 = r0.A04
            X.8gC r0 = r8.A04
            r1.A0E(r0)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x052d
            boolean r0 = r5.A0K
            java.lang.String r11 = "viewContext"
            if (r0 != 0) goto L_0x03f2
            X.7Dv r8 = X.AnonymousClass6XX.A00
            android.view.ContextThemeWrapper r1 = r5.A00
            if (r1 == 0) goto L_0x0590
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x05d9
            r8.A02(r1, r0, r10)
        L_0x03f2:
            X.7JJ r10 = X.AnonymousClass7Kz.A05()
            android.view.ContextThemeWrapper r8 = r5.A00
            if (r8 == 0) goto L_0x0590
            X.69U r1 = X.AnonymousClass69U.A0N
            com.facebookpay.form.view.FormLayout r0 = r5.A0D
            if (r0 == 0) goto L_0x051e
            android.view.View r10 = r10.A05(r8, r0, r1)
            java.lang.String r0 = X.C18170wI.A00(r6)
            X.C04220Ms.A0C(r10, r0)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r5.A03 = r10
            java.lang.String r14 = "saveButtonContainer"
            if (r10 == 0) goto L_0x05d9
            X.AnonymousClass7Kz.A0G()
            r8 = 2131886620(0x7f12021c, float:1.9407824E38)
            android.content.Context r1 = r10.getContext()
            int[] r0 = X.C29934Fwk.A0a
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r8, r0)
            java.lang.String r0 = "layout_width"
            int r12 = r8.getLayoutDimension(r7, r0)
            java.lang.String r0 = "layout_height"
            int r6 = r8.getLayoutDimension(r6, r0)
            r1 = 4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r8.getFloat(r1, r0)
            android.widget.TableRow$LayoutParams r11 = new android.widget.TableRow$LayoutParams
            r11.<init>(r12, r6, r0)
            r0 = 5
            int r6 = r8.getDimensionPixelSize(r0, r7)
            int r3 = r8.getDimensionPixelSize(r3, r7)
            r0 = 6
            int r1 = r8.getDimensionPixelSize(r0, r7)
            r0 = 3
            int r0 = r8.getDimensionPixelSize(r0, r7)
            r11.setMargins(r6, r3, r1, r0)
            r10.setLayoutParams(r11)
            r8.recycle()
            android.widget.FrameLayout r1 = r5.A03
            if (r1 == 0) goto L_0x05d9
            r0 = 2131297885(0x7f09065d, float:1.8213728E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r1, r0)
            com.facebookpay.widget.button.FBPayButton r3 = (com.facebookpay.widget.button.FBPayButton) r3
            r5.A0E = r3
            java.lang.String r11 = "saveButton"
            if (r3 == 0) goto L_0x0590
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            java.lang.Integer r0 = r0.A0F
            if (r0 == 0) goto L_0x047e
            int r1 = r0.intValue()
            X.4x8 r0 = r5.A00
            if (r0 == 0) goto L_0x05bf
            java.lang.String r2 = r0.getString(r1)
        L_0x047e:
            r3.setText(r2)
            com.facebookpay.widget.button.FBPayButton r1 = r5.A0E
            if (r1 == 0) goto L_0x0590
            X.69C r0 = X.AnonymousClass69C.A08
            r1.setButtonStyle(r0)
            com.facebookpay.widget.button.FBPayButton r1 = r5.A0E
            if (r1 == 0) goto L_0x0590
            r0 = 38
            X.C86104wH.A1C(r1, r0, r5)
            android.widget.FrameLayout r1 = r5.A03
            if (r1 == 0) goto L_0x05d9
            r0 = 2131304890(0x7f0921ba, float:1.8227935E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r5.A05 = r0
            java.lang.String r11 = "progressIcon"
            if (r0 == 0) goto L_0x0590
            android.graphics.drawable.Drawable r3 = r0.getIndeterminateDrawable()
            if (r3 == 0) goto L_0x04be
            X.7Ec r2 = X.AnonymousClass7Kz.A0G()
            r1 = 7
            android.content.Context r0 = r5.getContext()
            int r1 = r2.A03(r0, r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.setColorFilter(r1, r0)
        L_0x04be:
            android.widget.ProgressBar r0 = r5.A05
            if (r0 == 0) goto L_0x0590
            r0.setVisibility(r9)
            com.facebookpay.form.view.FormLayout r1 = r5.A0D
            if (r1 == 0) goto L_0x051e
            android.widget.FrameLayout r0 = r5.A03
            if (r0 == 0) goto L_0x05d9
            r1.addView(r0)
        L_0x04d0:
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            com.facebookpay.form.cell.CellParams r1 = r0.A07
            if (r1 == 0) goto L_0x04ed
            com.facebookpay.form.view.FormLayout r2 = r5.A0D
            if (r2 == 0) goto L_0x051e
            android.content.Context r0 = r2.getContext()
            X.8gu r1 = r1.A00(r0)
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x05b8
            android.view.View r1 = (android.view.View) r1
            r2.addView(r1)
        L_0x04ed:
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            int r0 = r0.A05
            if (r0 == 0) goto L_0x0514
            android.widget.TextView r0 = r5.A07
            java.lang.String r13 = "subtitle"
            if (r0 == 0) goto L_0x051e
            r0.setVisibility(r7)
            android.widget.TextView r1 = r5.A07
            if (r1 == 0) goto L_0x051e
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            int r0 = r0.A05
            r1.setText(r0)
            android.widget.TextView r1 = r5.A07
            if (r1 == 0) goto L_0x051e
            X.69Q r0 = X.AnonymousClass69Q.A0z
            X.AnonymousClass7Fd.A02(r1, r0)
        L_0x0514:
            android.content.Context r2 = r5.requireContext()
            X.58G r0 = r5.A0C
            if (r0 != 0) goto L_0x0522
            r13 = r19
        L_0x051e:
            X.C04220Ms.A0E(r13)
            throw r15
        L_0x0522:
            X.57n r1 = r0.A05()
            X.58M r0 = r5.A09
            if (r0 != 0) goto L_0x05a3
            r13 = r20
            goto L_0x051e
        L_0x052d:
            com.facebookpay.form.fragment.model.FormParams r0 = r5.A0B
            if (r0 == 0) goto L_0x05d5
            java.lang.Integer r0 = r0.A0E
            if (r0 == 0) goto L_0x04d0
            int r1 = r0.intValue()
            X.4x8 r0 = r5.A00
            if (r0 == 0) goto L_0x05c5
            java.lang.String r2 = r0.getString(r1)
            if (r2 == 0) goto L_0x04d0
            int r0 = r2.length()
            if (r0 == 0) goto L_0x04d0
            android.widget.TextView r1 = r5.A06
            java.lang.String r14 = "removeButton"
            if (r1 == 0) goto L_0x05d9
            X.69Q r0 = X.AnonymousClass69Q.A1C
            X.AnonymousClass7Fd.A02(r1, r0)
            android.widget.TextView r0 = r5.A06
            if (r0 == 0) goto L_0x05d9
            r0.setVisibility(r7)
            android.widget.TextView r0 = r5.A06
            if (r0 == 0) goto L_0x05d9
            r0.setText(r2)
            android.widget.TextView r1 = r5.A06
            if (r1 == 0) goto L_0x05d9
            r0 = 39
            X.C86104wH.A1C(r1, r0, r5)
            android.widget.TextView r2 = r5.A06
            if (r2 == 0) goto L_0x05d9
            java.lang.Integer r1 = X.AnonymousClass006.A01
            java.lang.String r0 = r5.A0H
            X.C116836xd.A01(r2, r1, r0)
            goto L_0x04d0
        L_0x0578:
            X.5hp r1 = new X.5hp
            r1.<init>()
            r5.A0A = r1
            com.facebookpay.form.view.FormLayout r0 = r5.A0D
            java.lang.String r13 = "formLayout"
            if (r0 == 0) goto L_0x051e
            r1.A00 = r0
            r1.A03(r0)
            android.view.View r1 = r5.A02
            if (r1 != 0) goto L_0x0367
            java.lang.String r11 = "loadingOverlay"
        L_0x0590:
            X.C04220Ms.A0E(r11)
            throw r15
        L_0x0594:
            r1 = 2131826622(0x7f1117be, float:1.9286134E38)
            goto L_0x0387
        L_0x0599:
            r1 = 2131826619(0x7f1117bb, float:1.9286128E38)
            goto L_0x0387
        L_0x059e:
            r1 = 2131826620(0x7f1117bc, float:1.928613E38)
            goto L_0x0387
        L_0x05a3:
            X.587 r0 = r0.A1O
            X.AnonymousClass7Fc.A02(r2, r1, r0)
            X.58G r0 = r5.A0C
            if (r0 == 0) goto L_0x05cb
            X.57n r0 = r0.A05()
            X.56q r1 = r0.A02
            r0 = 153(0x99, float:2.14E-43)
            X.C86104wH.A1F(r5, r1, r0)
            return
        L_0x05b8:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r15 = X.C18180wK.A0a(r0)
            throw r15
        L_0x05bf:
            java.lang.String r0 = "contextResourcesWrapper"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x05c5:
            java.lang.String r0 = "contextResourcesWrapper"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x05cb:
            X.C04220Ms.A0E(r19)
            throw r15
        L_0x05cf:
            java.lang.String r0 = "contextResourcesWrapper"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x05d5:
            X.C04220Ms.A0E(r21)
            throw r15
        L_0x05d9:
            X.C04220Ms.A0E(r14)
            throw r15
        L_0x05dd:
            java.lang.IllegalStateException r15 = X.C18180wK.A0a(r22)
            throw r15
        L_0x05e2:
            java.lang.String r0 = "isFormValidLiveData"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x05e8:
            X.C04220Ms.A0E(r18)
            throw r2
        L_0x05ec:
            X.C04220Ms.A0E(r21)
            throw r2
        L_0x05f0:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r22)
            throw r2
        L_0x05f5:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r22)
            throw r2
        L_0x05fa:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r22)
            throw r2
        L_0x05ff:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r22)
            throw r2
        L_0x0604:
            X.C04220Ms.A0E(r21)
            r15 = 0
            throw r15
        L_0x0609:
            java.lang.IllegalStateException r4 = X.AnonymousClass0wJ.A0b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j3.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A03(AnonymousClass5j3 r2) {
        AnonymousClass58G r0 = r2.A0C;
        if (r0 == null) {
            C04220Ms.A0E("formFragmentViewModel");
            throw null;
        } else {
            AnonymousClass7Kx.A0G(r2, C30821GXg.A01(r0.A0B, AnonymousClass8NC.A00), C86114wI.A0Q(r2, 154));
        }
    }

    public static final void A04(AnonymousClass5j3 r3, boolean z) {
        if (r3.A0J || r3.A0K) {
            FBPayButton fBPayButton = r3.A0E;
            if (fBPayButton == null) {
                C04220Ms.A0E("saveButton");
                throw null;
            } else {
                fBPayButton.setEnabled(z);
            }
        } else {
            AnonymousClass5qq A0S = C86134wK.A0S(r3);
            C86124wJ.A1U(A0S, A0S.A0M, AnonymousClass5qq.A0V, 9, z);
        }
    }

    public static final void A05(AnonymousClass5j3 r5, boolean z) {
        ProgressBar progressBar;
        int i;
        String str;
        if (!r5.A0J) {
            AnonymousClass5qq A0S = C86134wK.A0S(r5);
            C86124wJ.A1U(A0S, A0S.A0T, AnonymousClass5qq.A0V, 10, z);
            return;
        }
        String str2 = "saveButton";
        FBPayButton fBPayButton = r5.A0E;
        if (z) {
            if (fBPayButton != null) {
                fBPayButton.setText((CharSequence) null);
                progressBar = r5.A05;
                if (progressBar == null) {
                    C04220Ms.A0E("progressIcon");
                    throw null;
                }
                i = 0;
                progressBar.setVisibility(i);
                return;
            }
        } else if (fBPayButton != null) {
            FormParams formParams = r5.A0B;
            if (formParams == null) {
                str2 = "formParams";
            } else {
                Integer num = formParams.A0F;
                if (num != null) {
                    int intValue = num.intValue();
                    AnonymousClass4x8 r0 = r5.A00;
                    if (r0 != null) {
                        str = r0.getString(intValue);
                    } else {
                        C04220Ms.A0E("contextResourcesWrapper");
                        throw null;
                    }
                } else {
                    str = null;
                }
                fBPayButton.setText(str);
                progressBar = r5.A05;
                if (progressBar == null) {
                    C04220Ms.A0E("progressIcon");
                    throw null;
                }
                i = 8;
                progressBar.setVisibility(i);
                return;
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10101) {
            String str = "formFragmentViewModel";
            if (-1 != i2 || intent == null) {
                AnonymousClass58G r0 = this.A0C;
                if (r0 != null) {
                    C128957ke A002 = AnonymousClass7JJ.A00();
                    LoggingContext loggingContext = r0.A04;
                    if (loggingContext == null) {
                        str = "loggingContext";
                    } else {
                        C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_click_cardscanner_exit"), 2827), loggingContext, AnonymousClass7Kr.A07(r0.A06()), "card_scanner", 11);
                        return;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
            requireContext();
            AnonymousClass7Kz.A0R();
            throw C97396Be.A00("add ig implementation");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1390330287);
        this.A00 = AnonymousClass567.A00(this, layoutInflater);
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(53);
        }
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fbpay_form_fragment, viewGroup, false);
        C14030oh.A09(244903672, A022);
        return inflate;
    }

    public final void onResume() {
        AnonymousClass0ZU r9;
        String str;
        int A022 = C14030oh.A02(1905483893);
        super.onResume();
        if (!this.A0K) {
            ContextThemeWrapper contextThemeWrapper = this.A00;
            String str2 = null;
            if (contextThemeWrapper == null) {
                str = "viewContext";
            } else {
                Object A0h = C86144wL.A0h(this);
                if (A0h != null) {
                    AnonymousClass69R r5 = (AnonymousClass69R) A0h;
                    KtLambdaShape26S0100000_I2_6 ktLambdaShape26S0100000_I2_6 = new KtLambdaShape26S0100000_I2_6(this, 16);
                    boolean z = this.A0J;
                    if (z) {
                        r9 = C74334aH.A00;
                    } else {
                        r9 = this.A0L;
                    }
                    if (!z) {
                        FormParams formParams = this.A0B;
                        if (formParams == null) {
                            str = "formParams";
                        } else {
                            Integer num = formParams.A0F;
                            if (num != null) {
                                int intValue = num.intValue();
                                AnonymousClass4x8 r0 = this.A00;
                                if (r0 != null) {
                                    str2 = r0.getString(intValue);
                                } else {
                                    str = "contextResourcesWrapper";
                                }
                            }
                        }
                    }
                    AnonymousClass3JK.A00(contextThemeWrapper, this, r5, (String) null, str2, ktLambdaShape26S0100000_I2_6, r9, 352, false);
                } else {
                    IllegalStateException A0b = AnonymousClass0wJ.A0b();
                    C14030oh.A09(-764072099, A022);
                    throw A0b;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        AnonymousClass58G r02 = this.A0C;
        if (r02 != null) {
            C86104wH.A1F(this, r02.A0A, 155);
            AnonymousClass58G r03 = this.A0C;
            if (r03 != null) {
                C86104wH.A1F(this, r03.A09, 156);
                C14030oh.A09(-457716686, A022);
                return;
            }
        }
        C04220Ms.A0E("formFragmentViewModel");
        throw null;
    }
}
