package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44;

/* renamed from: X.1b6  reason: invalid class name */
public final class AnonymousClass1b6 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "ChannelInfoFragment";
    public final C04530Oa A00;
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07 = C80644m9.A00(this);
    public final C04530Oa A08;
    public final C82034oy A09;

    public final String getModuleName() {
        return "direct_interest_based_channel_info";
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r2 = 0
            X.C04220Ms.A0B(r8, r2)
            r0 = 2131299675(0x7f090d5b, float:1.8217358E38)
            android.view.ViewGroup r3 = X.C18220wO.A0J(r8, r0)
            r0 = 371(0x173, float:5.2E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r7, r0)
            X.E2V r1 = new X.E2V
            r1.<init>(r0, r3)
            X.4oy r0 = r7.A09
            r1.A0S(r0)
            X.C18200wM.A1F(r7)
            r0 = 2131299676(0x7f090d5c, float:1.821736E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.0Oa r1 = r7.A08
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 == 0) goto L_0x0345
            r0 = 2131825860(0x7f1114c4, float:1.9284588E38)
        L_0x0036:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x003a:
            if (r0 == 0) goto L_0x004b
            int r0 = r0.intValue()
            r4.setVisibility(r2)
            r4.setText(r0)
            r0 = 370(0x172, float:5.18E-43)
            X.AnonymousClass0wJ.A16(r4, r0, r7)
        L_0x004b:
            r0 = 2131299684(0x7f090d64, float:1.8217376E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 != 0) goto L_0x0340
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 != 0) goto L_0x0340
            X.1oe r3 = (X.C25681oe) r3
            boolean r0 = r3 instanceof X.AnonymousClass1oY
            if (r0 != 0) goto L_0x033b
            boolean r0 = r3 instanceof X.AnonymousClass1oX
            if (r0 != 0) goto L_0x033b
            r0 = 2131231934(0x7f0804be, float:1.8079963E38)
        L_0x006f:
            r4.setImageResource(r0)
            r0 = 2131299683(0x7f090d63, float:1.8217374E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 == 0) goto L_0x031a
            r0 = 2131825863(0x7f1114c7, float:1.9284594E38)
        L_0x0088:
            r4.setText(r0)
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 != 0) goto L_0x00b1
            X.1oe r3 = (X.C25681oe) r3
            boolean r0 = r3 instanceof X.AnonymousClass1oY
            if (r0 == 0) goto L_0x00b1
            r3 = 2131822658(0x7f110842, float:1.9278094E38)
            r0 = 2131299688(0x7f090d68, float:1.8217384E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r3)
            r0.setVisibility(r2)
        L_0x00b1:
            r0 = 2131299677(0x7f090d5d, float:1.8217362E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 == 0) goto L_0x030b
            r0 = 2131825858(0x7f1114c2, float:1.9284584E38)
        L_0x00c7:
            r4.setText(r0)
            r0 = 2131299679(0x7f090d5f, float:1.8217366E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 == 0) goto L_0x02fc
            r0 = 2131825859(0x7f1114c3, float:1.9284586E38)
        L_0x00e0:
            r4.setText(r0)
            r0 = 2131299686(0x7f090d66, float:1.821738E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 == 0) goto L_0x02ee
            r0 = 2131232471(0x7f0806d7, float:1.8081052E38)
        L_0x00f9:
            r4.setImageResource(r0)
            r0 = 2131299685(0x7f090d65, float:1.8217378E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 == 0) goto L_0x02e0
            r0 = 2131825861(0x7f1114c5, float:1.928459E38)
        L_0x0112:
            r4.setText(r0)
            r0 = 2131299687(0x7f090d67, float:1.8217382E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 == 0) goto L_0x02d1
            r0 = 2131825862(0x7f1114c6, float:1.9284592E38)
        L_0x012b:
            r4.setText(r0)
            r0 = 2131299681(0x7f090d61, float:1.821737E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r0 = r1.getValue()
            X.0zo r0 = (X.C19400zo) r0
            boolean r0 = r0 instanceof X.C25671od
            if (r0 == 0) goto L_0x02cc
            r0 = 2131232883(0x7f080873, float:1.8081888E38)
        L_0x0144:
            r3.setImageResource(r0)
            r0 = 2131299680(0x7f090d60, float:1.8217368E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r0 = r1.getValue()
            X.0zo r0 = (X.C19400zo) r0
            boolean r0 = r0 instanceof X.C25671od
            if (r0 == 0) goto L_0x02c7
            r0 = 2131825864(0x7f1114c8, float:1.9284596E38)
        L_0x015d:
            r3.setText(r0)
            r0 = 2131299682(0x7f090d62, float:1.8217372E38)
            android.view.View r5 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r3 = r1.getValue()
            X.0zo r3 = (X.C19400zo) r3
            boolean r0 = r3 instanceof X.C25671od
            if (r0 != 0) goto L_0x017f
            java.lang.Integer r0 = r3.A00
            int r0 = r0.intValue()
            java.lang.String r6 = r7.getString(r0)
            if (r6 != 0) goto L_0x0181
        L_0x017f:
            java.lang.String r6 = ""
        L_0x0181:
            java.lang.Object r0 = r1.getValue()
            X.0zo r0 = (X.C19400zo) r0
            boolean r0 = r0 instanceof X.C25671od
            if (r0 == 0) goto L_0x02c2
            r0 = 2131825865(0x7f1114c9, float:1.9284598E38)
        L_0x018e:
            r1 = 1
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r7, r6, r0)
            android.text.SpannableStringBuilder r4 = X.C18200wM.A0E(r0)
            int r3 = X.C18180wK.A00(r7)
            r0 = 16
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r0 = X.C18730xl.A00(r7, r3, r0)
            X.AnonymousClass3Zw.A00(r4, r0, r6)
            r5.setText(r4)
            X.C18180wK.A0z(r5)
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.AnonymousClass3JA.A01(r0)
            if (r0 == 0) goto L_0x01b9
            r0 = 369(0x171, float:5.17E-43)
            X.AnonymousClass0wJ.A16(r5, r0, r7)
        L_0x01b9:
            X.0Oa r4 = r7.A01
            java.lang.Object r3 = r4.getValue()
            X.20y r0 = X.AnonymousClass20y.Broadcast
            if (r3 != r0) goto L_0x0268
            X.0Oa r3 = r7.A00
            java.lang.Object r2 = r3.getValue()
            X.21t r0 = X.C305421t.Create
            if (r2 != r0) goto L_0x024e
            X.0Oa r0 = r7.A05
            X.49Y r5 = X.C18240wQ.A0P(r0)
            X.0Oa r0 = r7.A04
            java.lang.Object r0 = r0.getValue()
            int r4 = X.AnonymousClass0wJ.A04(r0)
            X.0Oa r0 = r7.A02
            java.lang.Object r6 = r0.getValue()
            X.24S r6 = (X.AnonymousClass24S) r6
            X.0Oa r0 = r7.A03
            java.lang.Object r0 = r0.getValue()
            boolean r3 = X.AnonymousClass0wJ.A1X(r0)
            r0 = 3
            X.C04220Ms.A0B(r6, r1)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.AnonymousClass49Y.A00(r5)
            int r1 = r6.ordinal()
            if (r1 == r0) goto L_0x024b
            r0 = 4
            if (r1 == r0) goto L_0x0248
            r1 = 0
        L_0x0201:
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0231
            X.AnonymousClass49Y.A03(r2, r5)
            X.2AE r0 = X.AnonymousClass2AE.A06
            X.AnonymousClass2A4.A00(r0, r2)
            X.24S r0 = X.AnonymousClass24S.PROFILE
            if (r6 != r0) goto L_0x0235
            X.Lci r0 = X.C40328Lci.A0O
        L_0x0215:
            X.C18230wP.A1D(r0, r2)
            X.2AA r0 = X.AnonymousClass49Y.A01(r6, r3)
            X.AnonymousClass3Zh.A02(r0, r2, r4)
            java.lang.String r0 = r5.A00
            X.C62443a0.A01(r2, r0)
            java.lang.String r0 = "entrypoint"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r0 = X.AnonymousClass4WK.A0O(r0)
        L_0x022e:
            X.C18200wM.A1J(r2, r0)
        L_0x0231:
            super.onViewCreated(r8, r9)
            return
        L_0x0235:
            X.24S r0 = X.AnonymousClass24S.MIMICRY_UPSELL
            if (r6 == r0) goto L_0x0245
            X.24S r0 = X.AnonymousClass24S.MIMICRY_UPSELL_COMPOSER
            if (r6 == r0) goto L_0x0245
            if (r3 == 0) goto L_0x0242
            X.Lci r0 = X.C40328Lci.A0B
            goto L_0x0215
        L_0x0242:
            X.Lci r0 = X.C40328Lci.A09
            goto L_0x0215
        L_0x0245:
            X.Lci r0 = X.C40328Lci.A0F
            goto L_0x0215
        L_0x0248:
            java.lang.String r1 = "mimicry_upsell_composer_banner"
            goto L_0x0201
        L_0x024b:
            java.lang.String r1 = "mimicry_upsell_top_of_thread_banner"
            goto L_0x0201
        L_0x024e:
            java.lang.Object r1 = r3.getValue()
            X.21t r0 = X.C305421t.JoinWaitlist
            if (r1 != r0) goto L_0x0231
            X.0Oa r0 = r7.A05
            X.49Y r1 = X.C18240wQ.A0P(r0)
            android.os.Bundle r0 = r7.requireArguments()
            java.lang.Integer r0 = X.AnonymousClass3M9.A00(r0)
            r1.A08(r0)
            goto L_0x0231
        L_0x0268:
            java.lang.Object r1 = r4.getValue()
            X.20y r0 = X.AnonymousClass20y.Social
            if (r1 != r0) goto L_0x0231
            X.0Oa r0 = r7.A06
            java.lang.Object r5 = r0.getValue()
            X.49W r5 = (X.AnonymousClass49W) r5
            X.0Oa r0 = r7.A02
            java.lang.Object r4 = r0.getValue()
            X.24S r4 = (X.AnonymousClass24S) r4
            X.0Oa r0 = r7.A03
            java.lang.Object r0 = r0.getValue()
            boolean r3 = X.AnonymousClass0wJ.A1X(r0)
            X.C04220Ms.A0B(r4, r2)
            X.0nS r0 = r5.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0231
            X.AnonymousClass49W.A03(r2, r5)
            X.2AB r1 = X.AnonymousClass2AB.A07
            java.lang.String r0 = "event"
            X.AnonymousClass2A3.A00(r1, r2, r0)
            if (r3 == 0) goto L_0x02bf
            X.Lcg r0 = X.C40326Lcg.A08
        L_0x02a7:
            X.C18230wP.A1D(r0, r2)
            X.29r r0 = X.AnonymousClass49W.A00(r4, r3)
            X.AnonymousClass2AH.A01(r0, r2)
            java.lang.String r0 = r5.A00
            X.C62443a0.A01(r2, r0)
            r1 = 0
            java.lang.String r0 = r4.A00
            java.util.Map r0 = X.AnonymousClass49W.A02(r1, r1, r1, r0)
            goto L_0x022e
        L_0x02bf:
            X.Lcg r0 = X.C40326Lcg.A0B
            goto L_0x02a7
        L_0x02c2:
            r0 = 2131825827(0x7f1114a3, float:1.9284521E38)
            goto L_0x018e
        L_0x02c7:
            r0 = 2131825825(0x7f1114a1, float:1.9284517E38)
            goto L_0x015d
        L_0x02cc:
            r0 = 2131232906(0x7f08088a, float:1.8081934E38)
            goto L_0x0144
        L_0x02d1:
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 == 0) goto L_0x02da
            r0 = 2131825857(0x7f1114c1, float:1.9284582E38)
            goto L_0x012b
        L_0x02da:
            X.1oe r3 = (X.C25681oe) r3
            int r0 = r3.A02
            goto L_0x012b
        L_0x02e0:
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 == 0) goto L_0x02e9
            r0 = 2131825856(0x7f1114c0, float:1.928458E38)
            goto L_0x0112
        L_0x02e9:
            r0 = 2131825830(0x7f1114a6, float:1.9284527E38)
            goto L_0x0112
        L_0x02ee:
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 == 0) goto L_0x02f7
            r0 = 2131232931(0x7f0808a3, float:1.8081985E38)
            goto L_0x00f9
        L_0x02f7:
            r0 = 2131232486(0x7f0806e6, float:1.8081083E38)
            goto L_0x00f9
        L_0x02fc:
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 == 0) goto L_0x0305
            r0 = 2131825846(0x7f1114b6, float:1.928456E38)
            goto L_0x00e0
        L_0x0305:
            X.1oe r3 = (X.C25681oe) r3
            int r0 = r3.A01
            goto L_0x00e0
        L_0x030b:
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 == 0) goto L_0x0314
            r0 = 2131825845(0x7f1114b5, float:1.9284558E38)
            goto L_0x00c7
        L_0x0314:
            X.1oe r3 = (X.C25681oe) r3
            int r0 = r3.A00
            goto L_0x00c7
        L_0x031a:
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 == 0) goto L_0x0323
            r0 = 2131825855(0x7f1114bf, float:1.9284578E38)
            goto L_0x0088
        L_0x0323:
            X.1oe r3 = (X.C25681oe) r3
            boolean r0 = r3 instanceof X.AnonymousClass1oY
            if (r0 == 0) goto L_0x032e
            r0 = 2131822659(0x7f110843, float:1.9278096E38)
            goto L_0x0088
        L_0x032e:
            boolean r0 = r3 instanceof X.AnonymousClass1oX
            if (r0 == 0) goto L_0x0337
            r0 = 2131822660(0x7f110844, float:1.9278098E38)
            goto L_0x0088
        L_0x0337:
            int r0 = r3.A03
            goto L_0x0088
        L_0x033b:
            r0 = 2131232053(0x7f080535, float:1.8080204E38)
            goto L_0x006f
        L_0x0340:
            r0 = 2131231935(0x7f0804bf, float:1.8079965E38)
            goto L_0x006f
        L_0x0345:
            boolean r0 = r3 instanceof X.C25661oc
            if (r0 == 0) goto L_0x034e
            r0 = 2131833817(0x7f1133d9, float:1.9300727E38)
            goto L_0x0036
        L_0x034e:
            X.1oe r3 = (X.C25681oe) r3
            boolean r0 = r3 instanceof X.AnonymousClass1oY
            if (r0 != 0) goto L_0x004b
            boolean r0 = r3 instanceof X.AnonymousClass1oX
            if (r0 == 0) goto L_0x035d
            r0 = 2131822657(0x7f110841, float:1.9278092E38)
            goto L_0x0036
        L_0x035d:
            java.lang.Integer r0 = r3.A04
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1b6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final boolean onBackPressed() {
        C04530Oa r2 = this.A01;
        if (r2.getValue() == AnonymousClass20y.Broadcast) {
            C04530Oa r22 = this.A00;
            if (r22.getValue() == C305421t.Create) {
                AnonymousClass49Y A0P = C18240wQ.A0P(this.A05);
                int A042 = AnonymousClass0wJ.A04(this.A04.getValue());
                USLEBaseShape0S0000000 A002 = AnonymousClass49Y.A00(A0P);
                if (!AnonymousClass0wJ.A1U(A002)) {
                    return false;
                }
                AnonymousClass49Y.A03(A002, A0P);
                C18220wO.A1D(AnonymousClass2AE.A08, A002);
                C18220wO.A1E(AnonymousClass2A4.IMPRESSION, A002);
                C18230wP.A1D(C40328Lci.A02, A002);
                AnonymousClass3Zh.A02(AnonymousClass2AA.A02, A002, A042);
                C62443a0.A02(A002, A0P.A00);
                A002.Bb4();
                return false;
            } else if (r22.getValue() != C305421t.JoinWaitlist) {
                return false;
            } else {
                AnonymousClass49Y A0P2 = C18240wQ.A0P(this.A05);
                USLEBaseShape0S0000000 A003 = AnonymousClass49Y.A00(A0P2);
                if (!AnonymousClass0wJ.A1U(A003)) {
                    return false;
                }
                AnonymousClass49Y.A03(A003, A0P2);
                AnonymousClass2A4.A00(AnonymousClass2AE.A09, A003);
                C18230wP.A1D(C40328Lci.A02, A003);
                AnonymousClass2AG.A01(AnonymousClass2AA.A0I, A003);
                return false;
            }
        } else if (r2.getValue() != AnonymousClass20y.Social) {
            return false;
        } else {
            AnonymousClass49W r1 = (AnonymousClass49W) this.A06.getValue();
            AnonymousClass24S r3 = (AnonymousClass24S) this.A02.getValue();
            C04220Ms.A0B(r3, 0);
            USLEBaseShape0S0000000 A0D = USLEBaseShape0S0000000.A0D(r1.A02);
            if (!AnonymousClass0wJ.A1U(A0D)) {
                return false;
            }
            AnonymousClass49W.A03(A0D, r1);
            C18220wO.A1D(AnonymousClass2AB.A0C, A0D);
            C18220wO.A1E(AnonymousClass2A3.IMPRESSION, A0D);
            C18230wP.A1D(C40326Lcg.A02, A0D);
            AnonymousClass2AH.A01(C319729r.PUBLIC_CHAT_CREATOR_NUX, A0D);
            C62443a0.A01(A0D, r1.A00);
            C18200wM.A1J(A0D, AnonymousClass49W.A02((Boolean) null, (Boolean) null, (Boolean) null, r3.A00));
            return false;
        }
    }

    public AnonymousClass1b6() {
        Integer num = AnonymousClass006.A0C;
        this.A01 = C18220wO.A0z(num, this, 1);
        this.A03 = C18220wO.A0z(num, this, 3);
        this.A04 = C18220wO.A0z(num, this, 4);
        this.A00 = C18220wO.A0z(num, this, 0);
        KtLambdaShape64S0100000_I2_44 ktLambdaShape64S0100000_I2_44 = new KtLambdaShape64S0100000_I2_44(this, 10);
        C04530Oa A0z = C18220wO.A0z(num, new KtLambdaShape64S0100000_I2_44(this, 7), 8);
        this.A08 = C18220wO.A0M(new KtLambdaShape64S0100000_I2_44(A0z, 9), ktLambdaShape64S0100000_I2_44, C18250wR.A0d(A0z, (Object) null, 13), C18210wN.A0l(C19400zo.class));
        this.A02 = C18220wO.A0z(num, this, 2);
        this.A05 = C18220wO.A0z(num, this, 5);
        this.A06 = C18220wO.A0z(num, this, 6);
        this.A09 = C679741q.A00;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1130706301);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_interest_channel_info, false);
        C14030oh.A09(-965557323, A022);
        return A0D;
    }
}
