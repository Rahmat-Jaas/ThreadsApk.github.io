package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;
import kotlin.jvm.internal.KtLambdaShape3S1210000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.5j7  reason: invalid class name */
public final class AnonymousClass5j7 extends AnonymousClass567 implements C145328kK {
    public ContextThemeWrapper A00;
    public View A01;
    public AnonymousClass5AC A02;
    public AnonymousClass5B5 A03;
    public C91615gW A04;
    public AnonymousClass5B6 A05;
    public C91685gd A06;
    public ECPHandler A07;
    public ECPPaymentRequest A08;
    public AnonymousClass58M A09;
    public LoggingContext A0A;
    public Boolean A0B;
    public final View.OnClickListener A0C = C86134wK.A0P(this, 33);
    public final View.OnClickListener A0D = C86134wK.A0P(this, 35);
    public final C880856r A0E = C880856r.A03();
    public final C143158gC A0F = C86114wI.A0Q(this, 138);
    public final C143158gC A0G = C86114wI.A0Q(this, 139);
    public final C143158gC A0H = C86114wI.A0Q(this, 140);
    public final C143158gC A0I = C86114wI.A0Q(this, 141);
    public final C143158gC A0J = C86114wI.A0Q(this, 142);
    public final C143158gC A0K = C86114wI.A0Q(this, 144);
    public final C143158gC A0L = C86114wI.A0Q(this, 145);
    public final C143158gC A0M = C86114wI.A0Q(this, 146);
    public final C143158gC A0N = C86114wI.A0Q(this, 147);
    public final C143158gC A0O = C86114wI.A0Q(this, 148);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        X.C04220Ms.A0E(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0185, code lost:
        r6 = "loggingContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fc, code lost:
        r6 = "viewContext";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r43, android.os.Bundle r44) {
        /*
            r42 = this;
            r11 = 0
            r9 = r43
            X.C04220Ms.A0B(r9, r11)
            r0 = r42
            r1 = r44
            super.onViewCreated(r9, r1)
            X.58M r1 = r0.A09
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = "ecpViewModel"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0018:
            X.587 r3 = r1.A1O
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r0.A08
            if (r2 != 0) goto L_0x0025
            java.lang.String r0 = "ecpPaymentRequest"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0025:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r3.A01
            boolean r1 = X.C04220Ms.A0I(r1, r2)
            if (r1 != 0) goto L_0x0032
            r3.A01 = r2
            X.AnonymousClass587.A00(r3)
        L_0x0032:
            boolean r2 = r0.A0A()
            r5 = 1
            r1 = 0
            if (r2 == 0) goto L_0x0052
            r2 = 2131299022(0x7f090ace, float:1.8216034E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0K(r9, r2)
            r0.A01 = r4
            X.7IJ r2 = new X.7IJ
            r2.<init>(r0, r5)
            X.7k9 r3 = new X.7k9
            r3.<init>(r4)
            java.util.Set r2 = r2.A08
            r2.add(r3)
        L_0x0052:
            androidx.fragment.app.FragmentActivity r7 = r0.getActivity()
            if (r7 == 0) goto L_0x0501
            r2 = 2131300746(0x7f09118a, float:1.821953E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r9, r2)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeAllViews()
            X.58M r2 = r0.A09
            if (r2 != 0) goto L_0x006e
            java.lang.String r6 = "ecpViewModel"
        L_0x006a:
            X.C04220Ms.A0E(r6)
            throw r1
        L_0x006e:
            java.util.List r2 = r2.A0w()
            java.util.Iterator r13 = r2.iterator()
        L_0x0076:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0189
            java.lang.Object r2 = r13.next()
            X.69P r2 = (X.AnonymousClass69P) r2
            int r3 = r2.ordinal()
            r2 = 18
            if (r3 == r2) goto L_0x0132
            r2 = 27
            if (r3 == r2) goto L_0x0105
            r2 = 14
            if (r3 != r2) goto L_0x0076
            X.58M r2 = r0.A09
            java.lang.String r12 = "ecpViewModel"
            if (r2 == 0) goto L_0x00a4
            X.587 r2 = r2.A1O
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x0076
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r0.A08
            if (r2 != 0) goto L_0x00a8
            java.lang.String r12 = "ecpPaymentRequest"
        L_0x00a4:
            X.C04220Ms.A0E(r12)
            throw r1
        L_0x00a8:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r2 = r2.A01
            if (r2 == 0) goto L_0x00b5
            java.lang.Boolean r2 = r2.A03
            boolean r2 = X.C18190wL.A1Z(r2, r5)
            if (r2 == 0) goto L_0x00b5
            goto L_0x0076
        L_0x00b5:
            X.58M r6 = r0.A09
            if (r6 == 0) goto L_0x00a4
            java.util.Map r3 = r6.A1X
            X.69P r2 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            X.78o r3 = X.C86114wI.A0R(r2, r3)
            if (r3 == 0) goto L_0x00c8
            r2 = 22
            A05(r3, r6, r2)
        L_0x00c8:
            android.view.ContextThemeWrapper r3 = r0.A00
            if (r3 != 0) goto L_0x00cf
            java.lang.String r12 = "viewContext"
            goto L_0x00a4
        L_0x00cf:
            com.fbpay.logging.LoggingContext r2 = r0.A0A
            if (r2 != 0) goto L_0x00d6
            java.lang.String r12 = "loggingContext"
            goto L_0x00a4
        L_0x00d6:
            X.5gV r10 = new X.5gV
            r10.<init>(r3, r2, r11)
            r2 = 34
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r2 = X.C86134wK.A0P(r0, r2)
            r10.A00 = r2
            X.M5O r8 = r10.A08(r4)
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.AnonCheckoutPuxLinkViewBinder.AnonCheckoutPuxLinkViewHolder"
            X.C04220Ms.A0C(r8, r2)
            android.view.View r2 = r8.itemView
            r4.addView(r2)
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x00a4
            X.587 r2 = r2.A1O
            X.M5J r6 = r2.A06
            r3 = 18
            com.facebook.redex.IDxObserverShape55S0300000_2_I2 r2 = new com.facebook.redex.IDxObserverShape55S0300000_2_I2
            r2.<init>((int) r3, (java.lang.Object) r0, (java.lang.Object) r8, (java.lang.Object) r10)
            r6.A0C(r0, r2)
            goto L_0x0076
        L_0x0105:
            r2 = 6
            com.facebook.redex.IDxCListenerShape508S0100000_2_I2 r8 = new com.facebook.redex.IDxCListenerShape508S0100000_2_I2
            r8.<init>(r0, r2)
            r2 = 5
            com.facebook.redex.IDxCListenerShape508S0100000_2_I2 r6 = new com.facebook.redex.IDxCListenerShape508S0100000_2_I2
            r6.<init>(r0, r2)
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            if (r3 == 0) goto L_0x0185
            X.5gW r2 = new X.5gW
            r2.<init>(r8, r6, r3)
            r0.A04 = r2
            X.M5O r3 = r2.A08(r4)
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.PUXTermsConditionViewBinder.PUXTermsConditionViewHolder"
            X.C04220Ms.A0C(r3, r2)
            X.5B5 r3 = (X.AnonymousClass5B5) r3
            r0.A03 = r3
            if (r3 != 0) goto L_0x012f
            java.lang.String r6 = "termsViewHolder"
            goto L_0x006a
        L_0x012f:
            com.facebookpay.widget.disclaimer.DisclaimerLayout r2 = r3.A00
            goto L_0x0179
        L_0x0132:
            android.view.ContextThemeWrapper r10 = r0.A00
            if (r10 == 0) goto L_0x01fc
            com.fbpay.logging.LoggingContext r8 = r0.A0A
            if (r8 == 0) goto L_0x0185
            boolean r6 = A0B(r0)
            r3 = 48
            kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5 r2 = new kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5
            r2.<init>(r0, r3)
            X.5gd r3 = new X.5gd
            r3.<init>(r10, r8, r2, r6)
            android.view.View$OnClickListener r2 = r0.A0D
            X.C04220Ms.A0B(r2, r11)
            r3.A00 = r2
            r0.A06 = r3
            X.M5O r3 = r3.A08(r4)
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.PayButtonViewBinder.PayButtonViewHolder"
            X.C04220Ms.A0C(r3, r2)
            X.5B6 r3 = (X.AnonymousClass5B6) r3
            r0.A05 = r3
            boolean r3 = A0B(r0)
            java.lang.String r6 = "payButtonViewHolder"
            X.5B6 r2 = r0.A05
            if (r3 == 0) goto L_0x017e
            if (r2 == 0) goto L_0x006a
            com.facebookpay.widget.paybutton.FBPayAnimationButton r3 = r2.A00
            r2 = 21
        L_0x0170:
            X.AnonymousClass7Kz.A0T(r3, r2)
            X.5B6 r2 = r0.A05
            if (r2 == 0) goto L_0x006a
            com.facebookpay.widget.paybutton.FBPayAnimationButton r2 = r2.A00
        L_0x0179:
            r4.addView(r2)
            goto L_0x0076
        L_0x017e:
            if (r2 == 0) goto L_0x006a
            com.facebookpay.widget.paybutton.FBPayAnimationButton r3 = r2.A00
            r2 = 12
            goto L_0x0170
        L_0x0185:
            java.lang.String r6 = "loggingContext"
            goto L_0x006a
        L_0x0189:
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r2 = X.AnonymousClass7JJ.A02()
            X.6lW r2 = r2.A01
            if (r2 == 0) goto L_0x01bb
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r2 = r2.A00
            if (r2 == 0) goto L_0x01bb
            com.google.common.collect.ImmutableList r3 = X.AnonymousClass69P.A00(r2)
            if (r3 == 0) goto L_0x01bb
            X.69P r2 = X.AnonymousClass69P.META_BRANDING_FOOTER
            boolean r2 = r3.contains(r2)
            if (r2 != r5) goto L_0x01bb
            android.view.ContextThemeWrapper r2 = r0.A00
            if (r2 == 0) goto L_0x01fc
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r2)
            r2 = 2131233491(0x7f080ad3, float:1.808312E38)
            r3.setImageResource(r2)
            r2 = 2131886617(0x7f120219, float:1.9407818E38)
            X.AnonymousClass7Fe.A01(r3, r2)
            r4.addView(r3)
        L_0x01bb:
            r2 = 2131300750(0x7f09118e, float:1.8219538E38)
            android.view.View r8 = X.AnonymousClass0wJ.A0K(r9, r2)
            android.content.Context r6 = r0.requireContext()
            boolean r4 = A0B(r0)
            boolean r3 = A0B(r0)
            r2 = 19
            if (r3 == 0) goto L_0x01d4
            r2 = 37
        L_0x01d4:
            X.C121047Dv.A00(r6, r8, r2, r4)
            r2 = 2131302644(0x7f0918f4, float:1.822338E38)
            android.view.View r2 = r9.requireViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            X.C18200wM.A1H(r2, r5)
            r2.setItemAnimator(r1)
            boolean r9 = A0B(r0)
            java.lang.Boolean r3 = r0.A0B
            boolean r3 = X.C18190wL.A1Z(r3, r11)
            java.lang.String r15 = "ecpPaymentRequest"
            if (r3 == 0) goto L_0x0216
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A08
            if (r3 != 0) goto L_0x0200
            X.C04220Ms.A0E(r15)
            throw r1
        L_0x01fc:
            java.lang.String r6 = "viewContext"
            goto L_0x006a
        L_0x0200:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x0216
            java.lang.Boolean r3 = r3.A06
            if (r3 == 0) goto L_0x0216
            com.instagram.service.session.UserSession r8 = X.AnonymousClass7HK.A00()
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r3 = 36315735194929910(0x8104f8000d0af6, double:3.0295553967773744E-306)
            X.C63803iN.A0E(r6, r8, r3)
        L_0x0216:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A08
            if (r3 != 0) goto L_0x021e
            X.C04220Ms.A0E(r15)
            throw r1
        L_0x021e:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x0234
            java.lang.Boolean r3 = r3.A03
            if (r3 == 0) goto L_0x0234
            com.instagram.service.session.UserSession r8 = X.AnonymousClass7HK.A00()
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r3 = 36315735195060984(0x8104f8000f0af8, double:3.029555396860266E-306)
            X.C63803iN.A0E(r6, r8, r3)
        L_0x0234:
            X.58M r3 = r0.A09
            java.lang.String r25 = "ecpViewModel"
            if (r3 != 0) goto L_0x023e
            X.C04220Ms.A0E(r25)
            throw r1
        L_0x023e:
            boolean r4 = r3.A13()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A08
            if (r4 == 0) goto L_0x024c
            if (r3 != 0) goto L_0x0257
            X.C04220Ms.A0E(r15)
            throw r1
        L_0x024c:
            if (r3 != 0) goto L_0x0252
            X.C04220Ms.A0E(r15)
            throw r1
        L_0x0252:
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r3 = r3.A04
            X.69R r4 = r3.A04
            goto L_0x025b
        L_0x0257:
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r3 = r3.A04
            X.69R r4 = r3.A03
        L_0x025b:
            if (r9 == 0) goto L_0x0278
            r2.setClipToPadding(r11)
            r4 = 2130969583(0x7f0403ef, float:1.7547852E38)
            android.content.Context r3 = X.C18190wL.A0A(r2)
            java.lang.Integer r3 = X.AnonymousClass7IS.A01(r3, r4)
            X.AnonymousClass7IS.A02(r2, r1, r1, r1, r3)
        L_0x026e:
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            java.lang.String r24 = "loggingContext"
            if (r3 != 0) goto L_0x0288
            X.C04220Ms.A0E(r24)
            throw r1
        L_0x0278:
            boolean r3 = r0.A0A()
            if (r3 != 0) goto L_0x026e
            boolean r3 = r4.A07
            if (r3 == 0) goto L_0x026e
            X.7IS r3 = X.AnonymousClass6XN.A00
            r3.A04(r2)
            goto L_0x026e
        L_0x0288:
            X.5g4 r10 = new X.5g4
            r10.<init>(r3)
            r23 = 4
            r22 = 3
            java.lang.String r21 = "viewContext"
            if (r9 == 0) goto L_0x029d
            com.fbpay.logging.LoggingContext r8 = r0.A0A
            if (r8 != 0) goto L_0x0558
            X.C04220Ms.A0E(r24)
            throw r1
        L_0x029d:
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            if (r3 != 0) goto L_0x02a5
            X.C04220Ms.A0E(r24)
            throw r1
        L_0x02a5:
            r16 = 0
            X.5gP r9 = new X.5gP
            r9.<init>(r3, r11, r11)
            X.69U r3 = r9.A02
            r41 = r3
            r13 = 28
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r3 = X.C86164wN.A0L(r3, r0, r13)
            r9.A00 = r3
            android.view.ContextThemeWrapper r4 = r0.A00
            if (r4 != 0) goto L_0x02c0
            X.C04220Ms.A0E(r21)
            throw r1
        L_0x02c0:
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            if (r3 != 0) goto L_0x02c8
            X.C04220Ms.A0E(r24)
            throw r1
        L_0x02c8:
            X.5gQ r8 = new X.5gQ
            r8.<init>(r4, r3, r11)
            X.69U r3 = r8.A02
            r40 = r3
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r3 = X.C86164wN.A0L(r3, r0, r13)
            r8.A00 = r3
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            if (r3 == 0) goto L_0x0447
            X.5gH r7 = new X.5gH
            r7.<init>(r3, r11)
            X.69U r3 = r7.A02
            r39 = r3
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r3 = X.C86164wN.A0L(r3, r0, r13)
            r7.A00 = r3
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            if (r3 == 0) goto L_0x0447
            X.5gO r4 = new X.5gO
            r4.<init>(r3, r1, r11)
            X.69U r3 = r4.A02
            r38 = r3
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r3 = X.C86164wN.A0L(r3, r0, r13)
            r4.A00 = r3
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            if (r3 == 0) goto L_0x0447
            X.5gI r6 = new X.5gI
            r6.<init>(r3)
            com.fbpay.logging.LoggingContext r5 = r0.A0A
            if (r5 == 0) goto L_0x0447
            X.5gK r20 = new X.5gK
            r3 = r20
            r3.<init>(r5, r11)
            com.fbpay.logging.LoggingContext r5 = r0.A0A
            if (r5 == 0) goto L_0x0447
            X.5gZ r19 = new X.5gZ
            r3 = r19
            r3.<init>(r5, r11)
            android.view.ContextThemeWrapper r12 = r0.A00
            if (r12 == 0) goto L_0x0443
            com.fbpay.logging.LoggingContext r5 = r0.A0A
            if (r5 == 0) goto L_0x0447
            X.5gJ r3 = new X.5gJ
            r3.<init>(r12, r5)
            X.69U r5 = r3.A02
            r37 = r5
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r5 = X.C86164wN.A0L(r5, r0, r13)
            r3.A00 = r5
            android.view.ContextThemeWrapper r14 = r0.A00
            if (r14 == 0) goto L_0x0443
            com.fbpay.logging.LoggingContext r12 = r0.A0A
            if (r12 == 0) goto L_0x0447
            X.5g9 r5 = new X.5g9
            r5.<init>(r14, r12, r11)
            X.69U r12 = r5.A02
            r36 = r12
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r12 = X.C86164wN.A0L(r12, r0, r13)
            r5.A00 = r12
            com.instagram.service.session.UserSession r15 = X.AnonymousClass7HK.A00()
            X.0TJ r14 = X.AnonymousClass0TJ.A05
            r12 = 36323174077439698(0x810bbc00001ed2, double:3.03425977603054E-306)
            boolean r12 = X.C63803iN.A0E(r14, r15, r12)
            if (r12 == 0) goto L_0x03f6
            X.58M r12 = r0.A09
            if (r12 == 0) goto L_0x037e
            X.588 r12 = r12.A1N
            java.util.List r18 = r12.A04()
            X.58M r12 = r0.A09
            if (r12 == 0) goto L_0x037e
            X.588 r12 = r12.A1N
            java.util.List r17 = r12.A06()
            androidx.fragment.app.Fragment r12 = r0.mParentFragment
            r16 = r12
            if (r12 == 0) goto L_0x03f6
            android.view.ContextThemeWrapper r12 = r0.A00
            r15 = r12
            if (r12 != 0) goto L_0x0382
            X.C04220Ms.A0E(r21)
            throw r1
        L_0x037e:
            X.C04220Ms.A0E(r25)
            throw r16
        L_0x0382:
            com.fbpay.logging.LoggingContext r14 = r0.A0A
            if (r14 == 0) goto L_0x0688
            r12 = 202(0xca, float:2.83E-43)
            java.lang.String r13 = X.C18170wI.A00(r12)
            r12 = r18
            X.C04220Ms.A0C(r12, r13)
            r12 = 45
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r28 = X.C86164wN.A0r(r0, r12)
            r12 = 46
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r29 = X.C86164wN.A0r(r0, r12)
            X.58M r12 = r0.A09
            if (r12 == 0) goto L_0x0684
            X.588 r12 = r12.A1N
            boolean r12 = r12.A02
            r30 = r12
            r13 = r23
            r12 = r17
            X.C04220Ms.A0B(r12, r13)
            X.8mp r12 = X.AnonymousClass7Kz.A04()
            java.lang.String r31 = "com.bloks.www.ecp.incentive.offer-selection"
            X.C04220Ms.A0B(r12, r11)
            com.instagram.service.session.UserSession r13 = X.C18230wP.A0Z()
            X.18u r21 = new X.18u
            r12 = r21
            r12.<init>(r13)
            r23 = r15
            r24 = r16
            r25 = r14
            r26 = r18
            r27 = r17
            X.6mD r12 = X.AnonymousClass7H3.A00(r23, r24, r25, r26, r27, r28, r29, r30)
            X.AnonymousClass7Kz.A04()
            r13 = 900(0x384, double:4.447E-321)
            r12.A00 = r13
            java.util.BitSet r13 = r12.A02
            int r13 = r13.nextClearBit(r11)
            r11 = r22
            if (r13 < r11) goto L_0x043c
            android.content.Context r13 = r12.A01
            java.util.Map r11 = r12.A05
            java.util.HashMap r33 = X.C37067Jjv.A02(r11)
            long r11 = r12.A00
            r29 = r13
            r30 = r21
            r32 = r1
            r34 = r11
            X.M4x.A03(r29, r30, r31, r32, r33, r34)
        L_0x03f6:
            X.69U r11 = r10.A02
            kotlin.Pair r11 = X.C18180wK.A0p(r11, r10)
            X.69U r10 = r6.A02
            kotlin.Pair r12 = X.C18180wK.A0p(r10, r6)
            r6 = r41
            kotlin.Pair r13 = X.C18180wK.A0p(r6, r9)
            r6 = r40
            kotlin.Pair r14 = X.C18180wK.A0p(r6, r8)
            r6 = r39
            kotlin.Pair r15 = X.C18180wK.A0p(r6, r7)
            r6 = r20
            X.69U r7 = r6.A02
            kotlin.Pair r16 = X.C18180wK.A0p(r7, r6)
            r6 = r19
            X.69U r7 = r6.A02
            kotlin.Pair r17 = X.C18180wK.A0p(r7, r6)
            r6 = r38
            kotlin.Pair r18 = X.C18180wK.A0p(r6, r4)
            r4 = r37
            kotlin.Pair r19 = X.C18180wK.A0p(r4, r3)
            r3 = r36
            kotlin.Pair r20 = X.C18180wK.A0p(r3, r5)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            goto L_0x04ec
        L_0x043c:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r16 = X.C18180wK.A0a(r0)
            throw r16
        L_0x0443:
            X.C04220Ms.A0E(r21)
            throw r16
        L_0x0447:
            X.C04220Ms.A0E(r24)
            throw r16
        L_0x044b:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x05e4
            java.lang.Boolean r3 = r3.A03
            boolean r3 = X.C18190wL.A1Z(r3, r5)
        L_0x0455:
            X.5gV r6 = new X.5gV
            r6.<init>(r14, r4, r3)
            r3 = 36
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r3 = X.C86134wK.A0P(r0, r3)
            r6.A00 = r3
            android.view.ContextThemeWrapper r4 = r0.A00
            if (r4 == 0) goto L_0x0553
            com.fbpay.logging.LoggingContext r3 = r0.A0A
            if (r3 == 0) goto L_0x0688
            X.5gU r5 = new X.5gU
            r5.<init>(r4, r3)
            android.view.View$OnClickListener r3 = r0.A0C
            X.C04220Ms.A0B(r3, r11)
            r5.A00 = r3
            android.view.ContextThemeWrapper r14 = r0.A00
            if (r14 == 0) goto L_0x0553
            com.fbpay.logging.LoggingContext r11 = r0.A0A
            if (r11 == 0) goto L_0x0688
            r3 = 47
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r3 = X.C86164wN.A0r(r0, r3)
            X.5gX r4 = new X.5gX
            r4.<init>(r14, r7, r11, r3)
            android.view.ContextThemeWrapper r15 = r0.A00
            if (r15 == 0) goto L_0x0553
            com.fbpay.logging.LoggingContext r14 = r0.A0A
            if (r14 == 0) goto L_0x0688
            r3 = 6
            com.facebook.redex.IDxCListenerShape508S0100000_2_I2 r11 = new com.facebook.redex.IDxCListenerShape508S0100000_2_I2
            r11.<init>(r0, r3)
            r3 = 48
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r7 = X.C86164wN.A0r(r0, r3)
            X.5gS r3 = new X.5gS
            r3.<init>(r15, r11, r14, r7)
            X.69U r7 = r10.A02
            kotlin.Pair r10 = X.C18180wK.A0p(r7, r10)
            X.69U r7 = r13.A02
            kotlin.Pair r11 = X.C18180wK.A0p(r7, r13)
            X.69U r7 = r12.A02
            kotlin.Pair r12 = X.C18180wK.A0p(r7, r12)
            X.69U r7 = r9.A02
            kotlin.Pair r13 = X.C18180wK.A0p(r7, r9)
            X.69U r7 = r8.A02
            kotlin.Pair r14 = X.C18180wK.A0p(r7, r8)
            r7 = r17
            X.69U r8 = r7.A02
            kotlin.Pair r15 = X.C18180wK.A0p(r8, r7)
            r7 = r16
            X.69U r8 = r7.A02
            kotlin.Pair r16 = X.C18180wK.A0p(r8, r7)
            X.69U r7 = r6.A02
            kotlin.Pair r17 = X.C18180wK.A0p(r7, r6)
            X.69U r6 = r5.A02
            kotlin.Pair r18 = X.C18180wK.A0p(r6, r5)
            X.69U r5 = r4.A02
            kotlin.Pair r19 = X.C18180wK.A0p(r5, r4)
            X.69U r4 = r3.A02
            kotlin.Pair r20 = X.C18180wK.A0p(r4, r3)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
        L_0x04ec:
            java.util.Map r4 = X.AnonymousClass4WJ.A0H(r3)
            X.5AQ r3 = new X.5AQ
            r3.<init>()
            r2.A0K = r3
            X.5AC r3 = new X.5AC
            r3.<init>(r4)
            r0.A02 = r3
            r2.setAdapter(r3)
        L_0x0501:
            X.58M r2 = r0.A09
            java.lang.String r6 = "ecpViewModel"
            if (r2 == 0) goto L_0x0680
            X.56q r4 = r2.A0r
            X.066 r3 = r0.getViewLifecycleOwner()
            r2 = 143(0x8f, float:2.0E-43)
            X.C86114wI.A1A(r3, r4, r0, r2)
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            java.util.List r2 = r2.A0w()
            java.util.Iterator r5 = r2.iterator()
        L_0x051e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x05e7
            java.lang.Object r2 = r5.next()
            X.69P r2 = (X.AnonymousClass69P) r2
            int r3 = r2.ordinal()
            r2 = 18
            if (r3 == r2) goto L_0x0546
            r2 = 27
            if (r3 != r2) goto L_0x051e
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.56r r4 = r2.A0y
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0O
        L_0x0542:
            r4.A0C(r3, r2)
            goto L_0x051e
        L_0x0546:
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.56r r4 = r2.A0v
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0H
            goto L_0x0542
        L_0x0553:
            X.C04220Ms.A0E(r21)
            goto L_0x05e1
        L_0x0558:
            X.69U r6 = X.AnonymousClass69U.A0Q
            java.util.Map r4 = r0.A04(r1, r6)
            r3 = 32
            X.5gf r13 = X.AnonymousClass567.A01(r6, r8, r0, r4, r3)
            com.fbpay.logging.LoggingContext r8 = r0.A0A
            if (r8 == 0) goto L_0x0688
            X.69U r6 = X.AnonymousClass69U.A0O
            X.58M r3 = r0.A09
            if (r3 == 0) goto L_0x0684
            X.58V r3 = r3.A1J
            java.util.Map r4 = r0.A04(r3, r6)
            r3 = 30
            X.5gf r12 = X.AnonymousClass567.A01(r6, r8, r0, r4, r3)
            com.fbpay.logging.LoggingContext r8 = r0.A0A
            if (r8 == 0) goto L_0x0688
            X.69U r6 = X.AnonymousClass69U.A0T
            X.58M r3 = r0.A09
            if (r3 == 0) goto L_0x0684
            X.58T r3 = r3.A1T
            java.util.Map r4 = r0.A04(r3, r6)
            r3 = 35
            X.5gf r9 = X.AnonymousClass567.A01(r6, r8, r0, r4, r3)
            com.fbpay.logging.LoggingContext r8 = r0.A0A
            if (r8 == 0) goto L_0x0688
            X.69U r6 = X.AnonymousClass69U.A0P
            X.58M r3 = r0.A09
            if (r3 == 0) goto L_0x0684
            X.58S r3 = r3.A1M
            java.util.Map r4 = r0.A04(r3, r6)
            r3 = 31
            X.5gf r8 = X.AnonymousClass567.A01(r6, r8, r0, r4, r3)
            com.fbpay.logging.LoggingContext r14 = r0.A0A
            if (r14 == 0) goto L_0x0688
            X.69U r6 = X.AnonymousClass69U.A0S
            X.58M r3 = r0.A09
            if (r3 == 0) goto L_0x0684
            X.58R r3 = r3.A1R
            java.util.Map r4 = r0.A04(r3, r6)
            r3 = 34
            X.5gf r17 = X.AnonymousClass567.A01(r6, r14, r0, r4, r3)
            com.fbpay.logging.LoggingContext r14 = r0.A0A
            if (r14 == 0) goto L_0x0688
            X.69U r6 = X.AnonymousClass69U.A0R
            X.58M r3 = r0.A09
            if (r3 == 0) goto L_0x0684
            X.58U r3 = r3.A1P
            java.util.Map r4 = r0.A04(r3, r6)
            r3 = 33
            X.5gf r16 = X.AnonymousClass567.A01(r6, r14, r0, r4, r3)
            android.view.ContextThemeWrapper r14 = r0.A00
            if (r14 == 0) goto L_0x0553
            com.fbpay.logging.LoggingContext r4 = r0.A0A
            if (r4 == 0) goto L_0x0688
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A08
            if (r3 != 0) goto L_0x044b
            X.C04220Ms.A0E(r15)
        L_0x05e1:
            r16 = 0
            throw r16
        L_0x05e4:
            r3 = 0
            goto L_0x0455
        L_0x05e7:
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.56r r4 = r2.A0u
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0M
            r4.A0C(r3, r2)
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.56r r4 = r2.A0w
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0J
            r4.A0C(r3, r2)
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.M5J r4 = r2.A01
            if (r4 != 0) goto L_0x0611
            X.56r r4 = X.C880856r.A03()
        L_0x0611:
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0F
            r4.A0C(r3, r2)
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.M5J r4 = r2.A0p
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0L
            r4.A0C(r3, r2)
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.588 r2 = r2.A1N
            X.56r r4 = r2.A03
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0K
            r4.A0C(r3, r2)
            boolean r2 = r0.A0A()
            if (r2 == 0) goto L_0x064f
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.56r r4 = r2.A0x
            X.066 r3 = r0.getViewLifecycleOwner()
            X.8gC r2 = r0.A0N
            r4.A0C(r3, r2)
        L_0x064f:
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0680
            X.587 r2 = r2.A1O
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x0666
            X.56r r5 = r0.A0E
            X.066 r4 = r0.getViewLifecycleOwner()
            X.8gC r3 = r0.A0G
            r2 = 275(0x113, float:3.85E-43)
            X.C86114wI.A1A(r4, r5, r3, r2)
        L_0x0666:
            X.58M r0 = r0.A09
            if (r0 != 0) goto L_0x066e
            X.C04220Ms.A0E(r6)
            throw r1
        L_0x066e:
            X.587 r0 = r0.A1O
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x067f
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = X.AnonymousClass7JJ.A02()
            X.56q r0 = r0.A06
            X.AnonymousClass7Kx.A0J(r0, r1)
        L_0x067f:
            return
        L_0x0680:
            X.C04220Ms.A0E(r6)
            throw r1
        L_0x0684:
            X.C04220Ms.A0E(r25)
            throw r1
        L_0x0688:
            X.C04220Ms.A0E(r24)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j7.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.59v, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.5gc] */
    /* JADX WARNING: type inference failed for: r18v5, types: [X.5ge] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026f, code lost:
        r5[1] = X.C18180wK.A0p(r3.A02, r3);
        r5[2] = X.C18180wK.A0p(r9.A02, r9);
        r5[3] = X.C18180wK.A0p(r1.A02, r1);
        r5[4] = X.C18180wK.A0p(r6.A02, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0294, code lost:
        return X.AnonymousClass4WJ.A0H(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f6, code lost:
        X.C04220Ms.A0E("viewContext");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02fa, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map A04(X.C146618mX r27, X.AnonymousClass69U r28) {
        /*
            r26 = this;
            r8 = r26
            r7 = r27
            if (r27 == 0) goto L_0x0052
            r0 = 10
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r9 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r9.<init>((int) r0, (java.lang.Object) r8, (java.lang.Object) r7)
            r0 = 12
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r6 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r6.<init>((int) r0, (java.lang.Object) r8, (java.lang.Object) r7)
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r5 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r5.<init>((int) r0, (java.lang.Object) r8, (java.lang.Object) r7)
        L_0x001b:
            com.fbpay.logging.LoggingContext r0 = r8.A0A
            java.lang.String r17 = "loggingContext"
            if (r0 == 0) goto L_0x0300
            r2 = 1
            X.5g6 r4 = new X.5g6
            r4.<init>(r0, r2)
            java.lang.String r16 = "Required value was null."
            if (r27 == 0) goto L_0x0050
            X.5gR r3 = new X.5gR
            if (r9 == 0) goto L_0x02fb
            com.fbpay.logging.LoggingContext r1 = r8.A0A
            if (r1 == 0) goto L_0x0300
            r0 = 0
            r3.<init>(r1, r9, r0, r2)
        L_0x0037:
            r11 = r28
            int r1 = r11.ordinal()
            r15 = 2
            r0 = 0
            r14 = 3
            java.lang.String r13 = "viewContext"
            switch(r1) {
                case 12: goto L_0x0153;
                case 13: goto L_0x020d;
                case 14: goto L_0x0093;
                case 15: goto L_0x01be;
                case 16: goto L_0x029f;
                case 17: goto L_0x0056;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r0 = "{ECPBottomSheetContentFragment} ItemType is not found for identifier => "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r11)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0050:
            r3 = 0
            goto L_0x0037
        L_0x0052:
            r9 = 0
            r6 = 0
            r5 = 0
            goto L_0x001b
        L_0x0056:
            X.0m7 r6 = r8.getChildFragmentManager()
            X.C04220Ms.A06(r6)
            r5 = 2131304219(0x7f091f1b, float:1.8226574E38)
            com.fbpay.logging.LoggingContext r1 = r8.A0A
            if (r1 == 0) goto L_0x0300
            r0 = 41
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r0 = X.C86164wN.A0r(r7, r0)
            X.5gT r3 = new X.5gT
            r3.<init>(r6, r1, r0, r5)
            com.fbpay.logging.LoggingContext r0 = r8.A0A
            if (r0 == 0) goto L_0x0300
            X.5gP r1 = new X.5gP
            r1.<init>(r0, r2, r2)
            X.69U r0 = r4.A02
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r4)
            X.69U r0 = r1.A02
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r1)
            X.69U r0 = r3.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r3)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2, r1, r0}
            java.util.Map r0 = X.AnonymousClass4WJ.A0H(r0)
            return r0
        L_0x0093:
            if (r5 == 0) goto L_0x014e
            if (r6 == 0) goto L_0x0149
            com.fbpay.logging.LoggingContext r1 = r8.A0A
            if (r1 == 0) goto L_0x0300
            r12 = 0
            X.5gP r9 = new X.5gP
            r9.<init>(r1, r2, r0)
            com.fbpay.logging.LoggingContext r1 = r8.A0A
            if (r1 == 0) goto L_0x0145
            X.5g7 r0 = new X.5g7
            r0.<init>(r1, r5)
            com.fbpay.logging.LoggingContext r10 = r8.A0A
            if (r10 == 0) goto L_0x0145
            r1 = 43
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r24 = X.C86164wN.A0r(r8, r1)
            r1 = 22
            kotlin.jvm.internal.KtLambdaShape171S0100000_I2 r25 = X.C86164wN.A0w(r8, r1)
            android.view.ContextThemeWrapper r1 = r8.A00
            if (r1 == 0) goto L_0x0141
            X.5gb r2 = new X.5gb
            r20 = r8
            r21 = r10
            r22 = r6
            r23 = r5
            r18 = r2
            r19 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            com.fbpay.logging.LoggingContext r11 = r8.A0A
            if (r11 == 0) goto L_0x0145
            r1 = 42
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r24 = X.C86164wN.A0r(r8, r1)
            r1 = 21
            kotlin.jvm.internal.KtLambdaShape171S0100000_I2 r25 = X.C86164wN.A0w(r8, r1)
            android.view.ContextThemeWrapper r10 = r8.A00
            if (r10 == 0) goto L_0x0141
            X.5ga r1 = new X.5ga
            r18 = r1
            r19 = r10
            r21 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.0m7 r11 = r8.getChildFragmentManager()
            X.C04220Ms.A06(r11)
            r10 = 2131298987(0x7f090aab, float:1.8215963E38)
            com.fbpay.logging.LoggingContext r8 = r8.A0A
            if (r8 == 0) goto L_0x0145
            r5 = 40
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r6 = X.C86164wN.A0r(r7, r5)
            X.5gT r5 = new X.5gT
            r5.<init>(r11, r8, r6, r10)
            X.69U r6 = r4.A02
            kotlin.Pair r6 = X.C18180wK.A0p(r6, r4)
            if (r3 == 0) goto L_0x013c
            X.69U r4 = r3.A02
            kotlin.Pair r7 = X.C18180wK.A0p(r4, r3)
            X.69U r3 = r9.A02
            kotlin.Pair r8 = X.C18180wK.A0p(r3, r9)
            X.69U r3 = r0.A02
            kotlin.Pair r9 = X.C18180wK.A0p(r3, r0)
            X.69U r0 = r2.A02
            kotlin.Pair r10 = X.C18180wK.A0p(r0, r2)
            X.69U r0 = r1.A02
            kotlin.Pair r11 = X.C18180wK.A0p(r0, r1)
            X.69U r0 = r5.A02
            kotlin.Pair r12 = X.C18180wK.A0p(r0, r5)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r6, r7, r8, r9, r10, r11, r12}
            java.util.Map r0 = X.AnonymousClass4WJ.A0H(r0)
            return r0
        L_0x013c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x0141:
            X.C04220Ms.A0E(r13)
            throw r12
        L_0x0145:
            X.C04220Ms.A0E(r17)
            throw r12
        L_0x0149:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x014e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x0153:
            com.fbpay.logging.LoggingContext r10 = r8.A0A
            if (r10 == 0) goto L_0x0300
            kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6 r1 = new kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6
            r1.<init>(r8, r2)
            X.5gO r9 = new X.5gO
            r9.<init>(r10, r1, r2)
            com.fbpay.logging.LoggingContext r12 = r8.A0A
            if (r12 == 0) goto L_0x0300
            if (r6 == 0) goto L_0x01b9
            if (r5 == 0) goto L_0x01b4
            r1 = 29
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r24 = X.C86164wN.A0u(r8, r1)
            r1 = 6
            kotlin.jvm.internal.KtLambdaShape173S0100000_I2 r25 = X.C86164wN.A0x(r8, r1)
            android.view.ContextThemeWrapper r11 = r8.A00
            if (r11 == 0) goto L_0x02f6
            r10 = 5
            X.5ge r1 = new X.5ge
            r20 = r8
            r21 = r12
            r22 = r6
            r23 = r5
            r18 = r1
            r19 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.0m7 r12 = r8.getChildFragmentManager()
            X.C04220Ms.A06(r12)
            r11 = 2131304088(0x7f091e98, float:1.8226309E38)
            com.fbpay.logging.LoggingContext r8 = r8.A0A
            if (r8 == 0) goto L_0x0300
            r5 = 39
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r5 = X.C86164wN.A0r(r7, r5)
            X.5gT r6 = new X.5gT
            r6.<init>(r12, r8, r5, r11)
            kotlin.Pair[] r5 = new kotlin.Pair[r10]
            X.69U r7 = r4.A02
            kotlin.Pair r4 = X.C18180wK.A0p(r7, r4)
            r5[r0] = r4
            if (r3 != 0) goto L_0x026f
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x01b4:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x01b9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x01be:
            com.fbpay.logging.LoggingContext r1 = r8.A0A
            if (r1 == 0) goto L_0x0300
            X.5gH r9 = new X.5gH
            r9.<init>(r1, r2)
            com.fbpay.logging.LoggingContext r1 = r8.A0A
            if (r1 == 0) goto L_0x0300
            if (r6 == 0) goto L_0x0208
            r10 = 0
            X.5gL r7 = new X.5gL
            r7.<init>(r1, r6, r2)
            r1 = 13
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r5 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r5.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r11)
            com.fbpay.logging.LoggingContext r3 = r8.A0A
            if (r3 != 0) goto L_0x01e2
            X.C04220Ms.A0E(r17)
            throw r10
        L_0x01e2:
            X.5gR r1 = new X.5gR
            r1.<init>(r3, r5, r0, r2)
            X.69U r0 = r4.A02
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r4)
            X.69U r0 = r1.A02
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            X.69U r0 = r9.A02
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r9)
            X.69U r0 = r7.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r7)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r2, r1, r0}
            java.util.Map r0 = X.AnonymousClass4WJ.A0H(r0)
            return r0
        L_0x0208:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x020d:
            r10 = 5
            android.view.ContextThemeWrapper r11 = r8.A00
            if (r11 == 0) goto L_0x02f6
            com.fbpay.logging.LoggingContext r1 = r8.A0A
            if (r1 == 0) goto L_0x0300
            X.5gQ r9 = new X.5gQ
            r9.<init>(r11, r1, r2)
            com.fbpay.logging.LoggingContext r12 = r8.A0A
            if (r12 == 0) goto L_0x0300
            if (r6 == 0) goto L_0x029a
            if (r5 == 0) goto L_0x0295
            r1 = 44
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r24 = X.C86164wN.A0r(r8, r1)
            android.view.ContextThemeWrapper r11 = r8.A00
            if (r11 == 0) goto L_0x02f6
            r13 = 0
            X.5gc r1 = new X.5gc
            r18 = r1
            r19 = r11
            r20 = r8
            r21 = r12
            r22 = r6
            r23 = r5
            r25 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.0m7 r12 = r8.getChildFragmentManager()
            X.C04220Ms.A06(r12)
            r11 = 2131307095(0x7f092a57, float:1.8232408E38)
            com.fbpay.logging.LoggingContext r8 = r8.A0A
            if (r8 != 0) goto L_0x0253
            X.C04220Ms.A0E(r17)
            throw r13
        L_0x0253:
            r5 = 38
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r5 = X.C86164wN.A0r(r7, r5)
            X.5gT r6 = new X.5gT
            r6.<init>(r12, r8, r5, r11)
            kotlin.Pair[] r5 = new kotlin.Pair[r10]
            X.69U r7 = r4.A02
            kotlin.Pair r4 = X.C18180wK.A0p(r7, r4)
            r5[r0] = r4
            if (r3 != 0) goto L_0x026f
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x026f:
            X.69U r0 = r3.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r3)
            r5[r2] = r0
            X.69U r0 = r9.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r9)
            r5[r15] = r0
            X.69U r0 = r1.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            r5[r14] = r0
            X.69U r0 = r6.A02
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r6)
            r0 = 4
            r5[r0] = r1
            java.util.Map r0 = X.AnonymousClass4WJ.A0H(r5)
            return r0
        L_0x0295:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x029a:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x029f:
            com.fbpay.logging.LoggingContext r0 = r8.A0A
            if (r0 == 0) goto L_0x0300
            X.5g5 r3 = new X.5g5
            r3.<init>(r0)
            com.fbpay.logging.LoggingContext r0 = r8.A0A
            if (r0 == 0) goto L_0x0300
            X.5gK r7 = new X.5gK
            r7.<init>(r0, r2)
            android.view.ContextThemeWrapper r1 = r8.A00
            if (r1 == 0) goto L_0x02f6
            com.fbpay.logging.LoggingContext r0 = r8.A0A
            if (r0 == 0) goto L_0x0300
            X.5g9 r6 = new X.5g9
            r6.<init>(r1, r0, r2)
            X.69U r1 = r6.A02
            r0 = 28
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r1, r8, r0)
            r6.A00 = r0
            com.fbpay.logging.LoggingContext r0 = r8.A0A
            if (r0 == 0) goto L_0x0300
            X.5gZ r5 = new X.5gZ
            r5.<init>(r0, r2)
            X.69U r0 = r4.A02
            kotlin.Pair r4 = X.C18180wK.A0p(r0, r4)
            X.69U r0 = r3.A02
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r3)
            X.69U r0 = r7.A02
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r7)
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r6)
            X.69U r0 = r5.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r5)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r4, r3, r2, r1, r0}
            java.util.Map r0 = X.AnonymousClass4WJ.A0H(r0)
            return r0
        L_0x02f6:
            X.C04220Ms.A0E(r13)
            r0 = 0
            throw r0
        L_0x02fb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x0300:
            X.C04220Ms.A0E(r17)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j7.A04(X.8mX, X.69U):java.util.Map");
    }

    public static void A05(C1201078o r2, Object obj, int i) {
        KtLambdaShape25S0100000_I2_5 ktLambdaShape25S0100000_I2_5 = new KtLambdaShape25S0100000_I2_5(obj, i);
        if (!r2.A01) {
            r2.A01 = true;
            ktLambdaShape25S0100000_I2_5.invoke();
        }
    }

    public static final void A08(AnonymousClass5j7 r4) {
        AnonymousClass58M r0 = r4.A09;
        if (r0 == null) {
            C04220Ms.A0E("ecpViewModel");
            throw null;
        }
        r0.A1O.A06(false);
        Bundle bundle = new Bundle(r4.requireArguments());
        Fragment fragment = r4.mParentFragment;
        if (fragment != null) {
            AnonymousClass7H3.A01(bundle, fragment, "content_bottom_sheet_fragment", true, true);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A09(AnonymousClass5j7 r3, Integer num) {
        String str;
        AnonymousClass58M r2 = r3.A09;
        if (r2 == null) {
            str = "ecpViewModel";
        } else {
            AnonymousClass066 viewLifecycleOwner = r3.getViewLifecycleOwner();
            LoggingContext loggingContext = r3.A0A;
            if (loggingContext == null) {
                str = "loggingContext";
            } else {
                r2.A0z(viewLifecycleOwner, loggingContext, num);
                AnonymousClass7KT.A02(r3);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    private final boolean A0A() {
        ECPPaymentRequest eCPPaymentRequest = this.A08;
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

    public static final boolean A0B(AnonymousClass5j7 r1) {
        ECPPaymentRequest eCPPaymentRequest = r1.A08;
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

    public final void CkR(ECPHandler eCPHandler) {
        this.A07 = eCPHandler;
        AnonymousClass58M r0 = this.A09;
        if (r0 != null) {
            r0.A10(eCPHandler);
        }
    }

    public static final M5J A03(SparseArray sparseArray, AnonymousClass69P r15, AnonymousClass5j7 r16, int i, boolean z) {
        String str;
        C111466nj r6 = AnonymousClass7Kz.A05().A08;
        AnonymousClass5j7 r4 = r16;
        ECPPaymentRequest eCPPaymentRequest = r4.A08;
        String str2 = "ecpPaymentRequest";
        if (eCPPaymentRequest != null) {
            String str3 = eCPPaymentRequest.A0A;
            String str4 = eCPPaymentRequest.A08;
            PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
            if (paymentReceiverInfo == null || ((str = paymentReceiverInfo.A00) == null && (str = paymentReceiverInfo.A02) == null)) {
                throw AnonymousClass0wJ.A0b();
            }
            LoggingContext loggingContext = r4.A0A;
            if (loggingContext == null) {
                str2 = "loggingContext";
            } else {
                AnonymousClass58M r0 = r4.A09;
                if (r0 != null) {
                    AnonymousClass69P r5 = r15;
                    OtcInput A022 = r0.A1O.A02(r15, z);
                    AnonymousClass58M r02 = r4.A09;
                    if (r02 != null) {
                        return r6.A00(sparseArray, A022, r02.A1O.A02(r5, true), loggingContext, str3, str4, str, i, 1);
                    }
                }
                C04220Ms.A0E("ecpViewModel");
                throw null;
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public static final void A06(C40307LcE lcE, AnonymousClass5j7 r6, Long l, String str, String str2) {
        Map map;
        String str3;
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext loggingContext = r6.A0A;
        if (loggingContext == null) {
            str3 = "loggingContext";
        } else {
            AnonymousClass58M r0 = r6.A09;
            if (r0 == null) {
                str3 = "ecpViewModel";
            } else {
                AnonymousClass7DP A032 = r0.A1O.A03();
                LinkedHashMap A0y = C18220wO.A0y();
                C86164wN.A1K(loggingContext, A0y);
                C86104wH.A1O(l, "TARGET_NAME", str2, A0y);
                C86134wK.A1O(lcE, A0y);
                Object obj = A0y.get("extra_data");
                if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
                    map = C18220wO.A0y();
                }
                A012.Bb8(str, AnonymousClass7Kr.A04(A032, A0y, map));
                return;
            }
        }
        C04220Ms.A0E(str3);
        throw null;
    }

    public static final void A07(AnonymousClass5j7 r11) {
        String str;
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = r11.A0A;
        if (loggingContext != null) {
            AnonymousClass58M r0 = r11.A09;
            str = "ecpViewModel";
            if (r0 != null) {
                boolean z = !r0.A1O.A07();
                AnonymousClass58M r02 = r11.A09;
                if (r02 != null) {
                    C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_click_ecpotc_atomic"), 2840), loggingContext, new KtLambdaShape3S1210000_I2(loggingContext, AnonymousClass7Kr.A07(r02.A1O), "choose_another_way", 3, z));
                    C128957ke A003 = AnonymousClass7JJ.A00();
                    LoggingContext loggingContext2 = r11.A0A;
                    if (loggingContext2 != null) {
                        AnonymousClass58M r03 = r11.A09;
                        if (r03 != null) {
                            A003.A0I(loggingContext2, "nux_checkout", AnonymousClass7Kr.A07(r03.A1O));
                            Bundle bundle = new Bundle(r11.requireArguments());
                            Fragment fragment = r11.mParentFragment;
                            if (fragment != null) {
                                AnonymousClass7H3.A01(bundle, fragment, "content_nux_fragment", true, false);
                                return;
                            }
                            throw AnonymousClass0wJ.A0b();
                        }
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        str = "loggingContext";
        C04220Ms.A0E(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:252:0x063a, code lost:
        if (r4.A0e != false) goto L_0x063c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0685, code lost:
        if (r13.contains(X.AnonymousClass68F.REQUEST_PAYER_NAME) != true) goto L_0x0687;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0688, code lost:
        if (r13 != null) goto L_0x068a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x068a, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0691, code lost:
        if (r13.contains(X.AnonymousClass68F.REQUEST_PAYER_EMAIL) == true) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0693, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0694, code lost:
        if (r13 == null) goto L_0x069f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0696, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x069d, code lost:
        if (r13.contains(X.AnonymousClass68F.REQUEST_PAYER_PHONE) == true) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x069f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06a0, code lost:
        r8.A08 = r14;
        r8.A07 = r11;
        r8.A09 = r0;
        r0 = X.C86104wH.A0R(r8.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06ac, code lost:
        if (r0 == null) goto L_0x093c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06ae, code lost:
        r0 = (X.C114956uC) r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06b2, code lost:
        X.AnonymousClass7Kx.A0I(r56, X.AnonymousClass58V.A00(r0, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06bb, code lost:
        if (r13 == null) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06bd, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06c4, code lost:
        if (r13.contains(X.AnonymousClass68F.REQUEST_PICKUP_NAME) == true) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06c6, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06c7, code lost:
        if (r13 == null) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06c9, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06d0, code lost:
        if (r13.contains(X.AnonymousClass68F.REQUEST_PICKUP_EMAIL) == true) goto L_0x06d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06d2, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06d3, code lost:
        if (r13 == null) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06db, code lost:
        if (r13.contains(X.AnonymousClass68F.REQUEST_PICKUP_PHONE) != true) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06dd, code lost:
        r10.A03 = r11;
        r10.A02 = r1;
        r10.A04 = r12;
        r1 = r4.A0W;
        r39 = r9.A09;
        r36 = r9;
        r13 = X.C122157Kv.A04((com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000) null, r36, (com.facebookpay.otc.models.OtcInput) null, r1, r39, (java.lang.String) null, 28);
        r33 = r4.A0v();
        r0 = X.C63803iN.A0E(r34, X.AnonymousClass7HK.A00(), 36317470364208928L);
        r11 = r4.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x070b, code lost:
        if (r0 != false) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x070d, code lost:
        if (r11 != false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x070f, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0712, code lost:
        if (r4.A0e == false) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0714, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0715, code lost:
        r8.A03 = r33;
        r1 = r59;
        r13 = X.C121207Et.A00(r13, r1.A02(r21, true), (com.google.common.collect.ImmutableList) null, 24575);
        r1 = r1.A01(r21);
        r32 = X.AnonymousClass67P.OTC_AND_NON_OTC;
        r1 = X.C18180wK.A1Z(r1, r32);
        r31 = X.C86144wL.A0R(r57);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0739, code lost:
        if (r11 == false) goto L_0x090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x073b, code lost:
        X.AnonymousClass7j5.A00(r31, r13, r33, "PERSISTENT_UP_TO_DATE", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0745, code lost:
        r4.A0I = r8.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0751, code lost:
        if (X.AnonymousClass58M.A0t(r4, r21) == false) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0755, code lost:
        if (r4.A0Z == false) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0757, code lost:
        X.AnonymousClass58M.A0D(X.AnonymousClass69U.A0O, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x075c, code lost:
        r11 = X.C122157Kv.A04((com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000) null, r36, (com.facebookpay.otc.models.OtcInput) null, r4.A0W, r39, (java.lang.String) null, 28);
        r8 = r4.A0v();
        r0 = X.C63803iN.A0E(r34, X.AnonymousClass7HK.A00(), 36317470364208928L);
        r13 = r4.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0776, code lost:
        if (r0 != false) goto L_0x0780;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0778, code lost:
        if (r13 != false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x077a, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x077d, code lost:
        if (r4.A0e == false) goto L_0x0780;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x077f, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0780, code lost:
        r6.A02 = r8;
        r1 = r49;
        r0 = r20;
        r6 = r1.A01(r0);
        r11 = X.C121207Et.A00(r11, r1.A02(r0, true), (com.google.common.collect.ImmutableList) null, 24575);
        r1 = (X.C128157j3) r47.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0798, code lost:
        if (r13 == false) goto L_0x08ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x079a, code lost:
        X.C128157j3.A01(r11, r1, r8, "PERSISTENT_UP_TO_DATE", X.C18180wK.A1Z(r6, r32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07a5, code lost:
        r4.A0Q = X.AnonymousClass7Kx.A06(X.C86104wH.A0R(r48), r4, 18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07b7, code lost:
        if (X.AnonymousClass58M.A0t(r4, r20) == false) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07bb, code lost:
        if (r4.A0Z == false) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07bd, code lost:
        X.AnonymousClass58M.A0D(X.AnonymousClass69U.A0T, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07c2, code lost:
        r4.A0N = r10.A00();
        r1 = r4.A0w();
        r13 = X.AnonymousClass69P.PICKUP_CONTACT_INFO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07d2, code lost:
        if (r1.contains(r13) == false) goto L_0x07dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07d6, code lost:
        if (r4.A0Z == false) goto L_0x07dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07d8, code lost:
        X.AnonymousClass58M.A0D(X.AnonymousClass69U.A0S, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07dd, code lost:
        r9 = X.C122157Kv.A04((com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000) null, r36, (com.facebookpay.otc.models.OtcInput) null, r4.A0W, r39, (java.lang.String) null, 28);
        r8 = X.AnonymousClass7Kz.A05().A0E;
        r6 = X.C121207Et.A00(r9, r61.A02(r22, true), (com.google.common.collect.ImmutableList) null, 24575);
        X.C1198377e.A00(r6, r8, "PERSISTENT_UP_TO_5_MINS");
        X.AnonymousClass7IT.A00(r8.A00, X.AnonymousClass6IY.A00(r6));
        r4.A0R = X.AnonymousClass7Kx.A02(X.C122507Sr.A00, X.C86104wH.A0R(r60));
        r31 = r45.A04;
        r4.A0O = X.AnonymousClass7Kx.A02(X.C122517Ss.A00, X.C86104wH.A0R(r31));
        r15 = r42.A05;
        r4.A0K = X.AnonymousClass7Kx.A02(X.C122527St.A00, X.C86104wH.A0R(r15));
        X.AnonymousClass58M.A0X(r4, r4.A0w());
        r4.A0b = false;
        r1 = X.C86124wJ.A0a(r62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0844, code lost:
        if (r1 == null) goto L_0x089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0846, code lost:
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0848, code lost:
        if (r1 == null) goto L_0x089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0852, code lost:
        if (r1.A0B.contains(X.AnonymousClass68M.UX_INCENTIVES) != true) goto L_0x089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0854, code lost:
        r8 = r62.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0858, code lost:
        if (r8 == null) goto L_0x0d73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x085a, code lost:
        r8 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r8;
        r6 = r4.A0W;
        r1 = r62.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0862, code lost:
        if (r1 == null) goto L_0x0d6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0864, code lost:
        r10 = X.C122157Kv.A04((com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000) null, r8, (com.facebookpay.otc.models.OtcInput) null, r6, ((com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1).A09, (java.lang.String) null, 28);
        r9 = X.AnonymousClass7Kz.A05().A09;
        X.C30821GXg.A01(X.AnonymousClass5k8.A00(X.AnonymousClass7T2.A00, new com.facebook.redex.IDxFunctionShape152S0200000_2_I2(9, r10, r9), X.C121207Et.A01(r10, "INCENTIVES")), X.AnonymousClass8N0.A00).A0E(X.C86114wI.A0Q(r42, 87));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x089c, code lost:
        r14 = X.AnonymousClass0wJ.A0v();
        r6 = X.C86114wI.A0R(X.AnonymousClass69P.PRICE_TABLE, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08a6, code lost:
        if (r6 == null) goto L_0x08ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x08a8, code lost:
        A05(r6, r4, 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x08ad, code lost:
        r1 = r43;
        X.C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        r14.add(r1);
        r1 = r62.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08bb, code lost:
        if (r1 == null) goto L_0x0d69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x08bd, code lost:
        r8 = ((com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1).A08;
        r6 = r4.A0W;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x08c5, code lost:
        if (r6 == null) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x08c7, code lost:
        r1 = X.AnonymousClass7JJ.A02().A05(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x08cf, code lost:
        if (r1 == null) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x08d1, code lost:
        r8 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x08d3, code lost:
        if (r8 == null) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x08d5, code lost:
        r10 = r8.getEnumList("event_handling_components", X.AnonymousClass69P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x08e1, code lost:
        if (X.AnonymousClass58M.A0k(r4) == false) goto L_0x095b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x08e3, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08e5, code lost:
        if (r1 != null) goto L_0x0964;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x08e7, code lost:
        X.C04220Ms.A0E("preprocessParamFetchLiveData");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08ec, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08ed, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08ef, code lost:
        r14 = X.AnonymousClass6IY.A00(r11);
        r13 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08f9, code lost:
        if (r13.A05(r14) != null) goto L_0x0909;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08fb, code lost:
        X.AnonymousClass7Kx.A0J(X.AnonymousClass7IT.A00(r13, r14), (java.lang.Object) null);
        X.C128157j3.A01(r11, r1, r8, "PERSISTENT_UP_TO_DATE", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0909, code lost:
        X.AnonymousClass7IT.A00(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x090e, code lost:
        r30 = X.AnonymousClass6IY.A00(r13);
        r15 = r31.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x091c, code lost:
        if (r15.A05(r30) != null) goto L_0x0932;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x091e, code lost:
        X.AnonymousClass7Kx.A0J(X.AnonymousClass7IT.A00(r15, r30), (java.lang.Object) null);
        r0 = r31;
        X.AnonymousClass7j5.A00(r0, r13, r33, "PERSISTENT_UP_TO_DATE", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0932, code lost:
        X.AnonymousClass7IT.A00(r15, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0939, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x093c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x095b, code lost:
        r1 = r4.A03;
        X.C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        r14.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0964, code lost:
        r14.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x096d, code lost:
        if (X.AnonymousClass58M.A0t(r4, r21) == false) goto L_0x0998;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x096f, code lost:
        r6 = X.C86114wI.A0R(r21, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0975, code lost:
        if (r6 == null) goto L_0x097c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0977, code lost:
        A05(r6, r4, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x097c, code lost:
        r6 = r4.A0r;
        r6.A0K(r58, r4.A13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0987, code lost:
        if (r4.A0Z == false) goto L_0x0990;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0989, code lost:
        r6.A0K(r56, r4.A12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0990, code lost:
        r1 = r58;
        X.C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        r14.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x099e, code lost:
        if (X.AnonymousClass58M.A0t(r4, r20) == false) goto L_0x09d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x09a0, code lost:
        r6 = X.C86114wI.A0R(r20, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x09a6, code lost:
        if (r6 == null) goto L_0x09ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x09a8, code lost:
        A05(r6, r4, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x09ad, code lost:
        r6 = r4.A0r;
        r1 = r48;
        r6.A0K(r1, r4.A1F);
        r14.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09bb, code lost:
        if (r4.A0Z == false) goto L_0x09c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x09bd, code lost:
        r6.A0K(r46, r4.A1E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x09c4, code lost:
        if (r10 == null) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x09cc, code lost:
        if (r10.contains(r20) == false) goto L_0x09d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x09ce, code lost:
        r5.A01(r48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x09d3, code lost:
        r1 = r4.A0w();
        r9 = X.AnonymousClass69P.SHIPPING_OPTIONS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x09dd, code lost:
        if (r1.contains(r9) == false) goto L_0x0a0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x09df, code lost:
        r1 = X.C86114wI.A0R(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x09e3, code lost:
        if (r1 == null) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x09e5, code lost:
        A05(r1, r4, 18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x09e8, code lost:
        r8 = r4.A0r;
        r1 = r4.A1M;
        r6 = r1.A05;
        r8.A0K(r6, r4.A15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x09f5, code lost:
        if (r4.A0Z == false) goto L_0x0a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x09f7, code lost:
        r1 = r1.A07;
        X.C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
        r8.A0K(r1, r4.A1G);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a03, code lost:
        if (r10 == null) goto L_0x0a0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a09, code lost:
        if (r10.contains(r9) == false) goto L_0x0a0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a0b, code lost:
        r5.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a12, code lost:
        if (X.AnonymousClass58M.A0t(r4, r13) == false) goto L_0x0a2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0a14, code lost:
        r6 = r4.A0r;
        r6.A0K(r50, r4.A1A);
        r6.A0K(r51, r4.A19);
        r0 = r50;
        X.C04220Ms.A0C(r0, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        r14.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0a32, code lost:
        if (X.AnonymousClass58M.A0t(r4, r19) == false) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0a34, code lost:
        r1 = X.C86114wI.A0R(r19, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0a3a, code lost:
        if (r1 == null) goto L_0x0a41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0a3c, code lost:
        A05(r1, r4, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a41, code lost:
        r6 = r4.A0r;
        r6.A0K(r54, r4.A1C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0a4c, code lost:
        if (r4.A0Z == false) goto L_0x0a55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a4e, code lost:
        r6.A0K(r52, r4.A18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a55, code lost:
        r0 = r54;
        X.C04220Ms.A0C(r0, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        r14.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0a5d, code lost:
        if (r10 == null) goto L_0x0ad0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a5f, code lost:
        r1 = r10.contains(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0a67, code lost:
        if (X.AnonymousClass58M.A0l(r4) == false) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0a69, code lost:
        if (r1 == false) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0a6b, code lost:
        r5.A01(r54);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0a70, code lost:
        r0 = r4.A0w();
        r9 = X.AnonymousClass69P.PAY_BUTTON;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0a7a, code lost:
        if (r0.contains(r9) == false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0a7c, code lost:
        r8 = r4.A0r;
        r6 = r4.A1Q;
        r1 = r62.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0a84, code lost:
        if (r1 == null) goto L_0x0ad2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a86, code lost:
        r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1;
        r13 = r4.A0W;
        r0 = X.C86124wJ.A0a(r62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a8e, code lost:
        if (r0 == null) goto L_0x0ace;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a90, code lost:
        r0 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a92, code lost:
        r1 = X.C122157Kv.A04((com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000) null, r1, (com.facebookpay.otc.models.OtcInput) null, r13, r0, (java.lang.String) null, 28);
        r13 = X.C30821GXg.A01(r43, X.C139188Mz.A00);
        r9 = X.C121207Et.A00(r1, r6.A0B.A02(r9, true), (com.google.common.collect.ImmutableList) null, 24575);
        r12 = r6.A0D;
        r12.clear();
        r18 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0abb, code lost:
        if (r18.hasNext() == false) goto L_0x0ad7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0abd, code lost:
        r14 = (X.M5J) r18.next();
        r6.A05.A0K(r14, r6.A08);
        r12.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0ace, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0ad0, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0ad6, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0ad7, code lost:
        r9 = X.C1200978m.A00(X.AnonymousClass6I0.A00("PERSISTENT_UP_TO_5_MINS"), r9, X.AnonymousClass7Kz.A05().A0C);
        r1 = r6.A05;
        r1.A0K(r9, r6.A07);
        X.C04220Ms.A0C(r9, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        r12.add(r9);
        r1.A0K(r13, r6.A09);
        X.C883957w.A00(r6);
        r8.A0K(r1, r4.A17);
        r8.A0K(r4.A03, X.C124027aK.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0b06, code lost:
        r0 = r4.A0w();
        r8 = X.AnonymousClass69P.PROMO_CODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0b10, code lost:
        if (r0.contains(r8) == false) goto L_0x0b35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0b12, code lost:
        r4.A0r.A0K(r31, r4.A1B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0b1b, code lost:
        if (r10 == null) goto L_0x0b23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0b21, code lost:
        if (r10.contains(r8) == false) goto L_0x0b2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0b23, code lost:
        r5.A01(r45.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0b2a, code lost:
        r1 = X.C86114wI.A0R(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0b2e, code lost:
        if (r1 == null) goto L_0x0b35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0b30, code lost:
        A05(r1, r4, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0b3b, code lost:
        if (X.AnonymousClass58M.A0t(r4, r22) == false) goto L_0x0b6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0b3d, code lost:
        r0 = X.AnonymousClass7JJ.A00();
        r8 = r4.A0v();
        X.C128957ke.A04(X.C18180wK.A0I(X.C86104wH.A0K(r0.A00, "client_load_terms_init"), 372), r8, new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1(X.AnonymousClass7Kr.A07(r63), r8, "pux_checkout", 1));
        r4.A0r.A0K(r60, r4.A1D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0b6a, code lost:
        r1 = r4.A0w();
        r0 = X.AnonymousClass69P.ITEM_LIST;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0b74, code lost:
        if (r1.contains(r0) == false) goto L_0x0b81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0b76, code lost:
        r1 = X.C86114wI.A0R(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0b7a, code lost:
        if (r1 == null) goto L_0x0b81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0b7c, code lost:
        A05(r1, r4, 21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0b81, code lost:
        r0 = r4.A0w();
        r6 = X.AnonymousClass69P.INCENTIVES;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0b8b, code lost:
        if (r0.contains(r6) == false) goto L_0x0baa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0b8d, code lost:
        r4.A0r.A0K(r15, r4.A16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0b94, code lost:
        if (r10 == null) goto L_0x0b9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0b9a, code lost:
        if (r10.contains(r6) == false) goto L_0x0baa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0b9c, code lost:
        r5.A01(r42.A07);
        r5.A01(r42.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0bac, code lost:
        if (r4.A0Z == false) goto L_0x0bc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0bae, code lost:
        r0 = r4.A0w();
        r1 = X.AnonymousClass69P.ORDER_SUMMARY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0bb8, code lost:
        if (r0.contains(r1) == false) goto L_0x0bc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0bba, code lost:
        r1 = X.C86114wI.A0R(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0bbe, code lost:
        if (r1 == null) goto L_0x0bc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0bc0, code lost:
        A05(r1, r4, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0bcf, code lost:
        if (r4.A0w().contains(X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION) == false) goto L_0x0bea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0bdd, code lost:
        if (X.C18190wL.A1Z(X.AnonymousClass58M.A05(r4).A01, false) != false) goto L_0x0bea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0bdf, code lost:
        r4.A0r.A0K(r63.A06, r4.A11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0bf4, code lost:
        if (r4.A0w().contains(X.AnonymousClass69P.ANON_CHECKOUT_BACK_BUTTON) == false) goto L_0x0c07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0bfa, code lost:
        if (X.AnonymousClass58M.A0h(r4) == false) goto L_0x0c07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0bfc, code lost:
        r4.A0r.A0K(r63.A05, r4.A10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0c11, code lost:
        if (r4.A0w().contains(X.AnonymousClass69P.APM) == false) goto L_0x0c74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0c13, code lost:
        r0 = X.C86124wJ.A0a(r62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0c17, code lost:
        if (r0 == null) goto L_0x0d52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0c19, code lost:
        r0 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0c1b, code lost:
        if (r0 == null) goto L_0x0d52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0c1d, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0c1f, code lost:
        r1 = X.C86124wJ.A0a(r62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0c23, code lost:
        if (r1 == null) goto L_0x0d4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0c25, code lost:
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0c27, code lost:
        if (r1 == null) goto L_0x0d4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0c29, code lost:
        r9 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0c2f, code lost:
        if (r63.A04 == false) goto L_0x0c74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0c31, code lost:
        if (r0 == null) goto L_0x0c74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0c33, code lost:
        if (r9 == null) goto L_0x0c74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0c35, code lost:
        r8 = r4.A0v().A02;
        r1 = X.AnonymousClass73F.A00;
        r32 = X.C86124wJ.A0y(r1);
        r33 = X.C86124wJ.A0y(r1);
        r1 = r63.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0c4c, code lost:
        if (r1 == null) goto L_0x0d64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0c4e, code lost:
        r4.A09 = X.AnonymousClass7Kx.A09(new com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem(new com.facebookpay.bloks.nativeprops.APMBloksNativeProps(r8, r32, r33, r1.A01, r0.A01, r0.A00), X.AnonymousClass69U.A09, r9, 2131826585));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0c74, code lost:
        r0 = r4.A0w();
        r1 = X.AnonymousClass69P.EMAIL_OPTIN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0c7e, code lost:
        if (r0.contains(r1) == false) goto L_0x0ce9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0c84, code lost:
        if (X.AnonymousClass58M.A0i(r4) == false) goto L_0x0ce9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0c86, code lost:
        r5 = X.C86114wI.A0R(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0c8a, code lost:
        if (r5 == null) goto L_0x0c91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0c8c, code lost:
        A05(r5, r4, 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0c91, code lost:
        r5 = r4.A0r;
        r6 = r62.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0c97, code lost:
        if (r6 == null) goto L_0x0d5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0c99, code lost:
        r6 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r6;
        r0 = r62.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0c9f, code lost:
        if (r0 == null) goto L_0x0d5a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0ca1, code lost:
        r0 = ((com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0).A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0ca5, code lost:
        if (r0 == null) goto L_0x0cab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0ca7, code lost:
        r17 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0cab, code lost:
        r7 = X.C122157Kv.A04((com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000) null, r6, (com.facebookpay.otc.models.OtcInput) null, r17, (java.lang.String) null, (java.lang.String) null, 30);
        r6 = X.AnonymousClass7Kz.A05().A02;
        r7 = X.C121207Et.A00(r7, r44.A01.A02(r1, true), (com.google.common.collect.ImmutableList) null, 24575);
        r5.A0K(X.C30821GXg.A01(X.AnonymousClass5k8.A00(X.AnonymousClass7Sg.A00, new com.facebook.redex.IDxFunctionShape152S0200000_2_I2(2, r7, r6), X.C121207Et.A01(r7, "EMAIL_OPTIN")), X.C139168Mx.A00), r4.A14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0ce9, code lost:
        X.AnonymousClass58M.A0X(r4, r4.A0w());
        r1 = X.AnonymousClass7JJ.A02();
        r0 = X.C86124wJ.A0a(r62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0cf8, code lost:
        if (r0 == null) goto L_0x0cfc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0cfa, code lost:
        r2 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0cfc, code lost:
        r0 = X.C86124wJ.A0a(r62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0d00, code lost:
        if (r0 == null) goto L_0x0d0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0d02, code lost:
        r0 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0d04, code lost:
        if (r0 == null) goto L_0x0d0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0d06, code lost:
        r16 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0d0a, code lost:
        r1 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0d0c, code lost:
        if (r2 == null) goto L_0x0d55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0d18, code lost:
        if (X.C122157Kv.A09(r1.A00(r2, r16)) == null) goto L_0x0d1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0d1a, code lost:
        X.AnonymousClass58M.A0J(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0d1d, code lost:
        r4.A0d = false;
        r4.A0c = false;
        r1 = requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        X.C04220Ms.A0C(r1, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest");
        r64.A08 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1;
        r64.A0B = X.C18210wN.A0Q(requireArguments(), "ECP_NUX_FLOW");
        X.C14030oh.A09(-6698281, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0d4e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0d4f, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0d52, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0d59, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0d5e, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0d63, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0d68, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0d6d, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0d72, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0d77, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x021f, code lost:
        if (r0 == null) goto L_0x0222;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r66) {
        /*
            r65 = this;
            r0 = -73802451(0xfffffffffb99dd2d, float:-1.5978148E36)
            int r29 = X.C14030oh.A02(r0)
            r64 = r65
            r1 = r66
            r0 = r64
            super.onCreate(r1)
            android.os.Bundle r0 = r64.requireArguments()
            java.lang.String r7 = "logging_context"
            android.os.Parcelable r1 = r0.getParcelable(r7)
            java.lang.String r3 = "null cannot be cast to non-null type com.fbpay.logging.LoggingContext"
            X.C04220Ms.A0C(r1, r3)
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            r0 = r64
            r0.A0A = r1
            r2 = 0
            X.58M r4 = X.C116896xj.A01(r0, r2)
            r0.A09 = r4
            java.lang.String r8 = "ecpViewModel"
            if (r4 != 0) goto L_0x0034
            X.C04220Ms.A0E(r8)
            throw r2
        L_0x0034:
            com.fbpay.logging.LoggingContext r6 = r0.A0A
            if (r6 != 0) goto L_0x003c
            X.C86124wJ.A19()
            throw r2
        L_0x003c:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            X.587 r0 = r4.A1O
            java.util.LinkedHashMap r5 = X.AnonymousClass7Kr.A07(r0)
            java.lang.String r24 = "pux_checkout"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_ecpcheckout_display"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 275(0x113, float:3.85E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            r17 = 25
            r1 = r24
            r0 = r17
            X.C128957ke.A03(r4, r6, r5, r1, r0)
            r0 = r64
            com.facebookpay.expresscheckout.handler.ECPHandler r1 = r0.A07
            if (r1 == 0) goto L_0x0070
            X.58M r0 = r0.A09
            if (r0 != 0) goto L_0x006d
            X.C04220Ms.A0E(r8)
            throw r2
        L_0x006d:
            r0.A10(r1)
        L_0x0070:
            r0 = r64
            X.58M r4 = r0.A09
            if (r4 != 0) goto L_0x007a
            X.C04220Ms.A0E(r8)
            throw r2
        L_0x007a:
            android.os.Bundle r1 = r64.requireArguments()
            java.lang.Object r5 = r1.get(r7)
            X.C04220Ms.A0C(r5, r3)
            com.fbpay.logging.LoggingContext r5 = (com.fbpay.logging.LoggingContext) r5
            r23 = 0
            r0 = r23
            X.C04220Ms.A0B(r5, r0)
            r4.A07 = r5
            com.fbpay.logging.LoggingContext r5 = r4.A0v()
            X.587 r0 = r4.A1O
            r63 = r0
            X.77d r3 = new X.77d
            r3.<init>(r0, r5)
            r4.A06 = r3
            java.lang.String r28 = "ECP_NUX_FLOW"
            r0 = r28
            boolean r0 = r1.getBoolean(r0)
            r4.A0e = r0
            java.lang.String r3 = "ECP_FORCE_DATA_REFRESH"
            r0 = r23
            boolean r0 = r1.getBoolean(r3, r0)
            r4.A0b = r0
            X.7HK r0 = X.AnonymousClass7Kz.A0J()
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x00d0
            X.56r r5 = r4.A0z
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest"
            X.C04220Ms.A0C(r3, r0)
            r5.A0H(r3)
            X.AnonymousClass58M.A0L(r4)
        L_0x00d0:
            X.56r r0 = r4.A0z
            r62 = r0
            java.lang.Object r3 = r62.A08()
            java.lang.String r27 = "Required value was null."
            if (r3 == 0) goto L_0x0de0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r6 = r3.A0A
            java.lang.String r0 = "ECP_SESSION_ID"
            r5.putString(r0, r6)
            java.lang.String r0 = r3.A08
            java.lang.String r12 = "ECP_PRODUCT_ID"
            r5.putString(r12, r0)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r3.A05
            if (r0 == 0) goto L_0x0192
            java.lang.String r6 = r0.A00
            if (r6 != 0) goto L_0x00fa
            java.lang.String r6 = r0.A02
        L_0x00fa:
            java.lang.String r0 = "ECP_CLIENT_RECEIVER_ID"
            r5.putString(r0, r6)
            com.fbpay.logging.LoggingContext r0 = r4.A0v()
            r5.putParcelable(r7, r0)
            java.lang.String r25 = "ECP_LAUNCH_PARAMS"
            r0 = r25
            r5.putParcelable(r0, r3)
            java.lang.String r9 = "ECP_PRESELECTED_FBPAY_DATA"
            android.os.Parcelable r0 = r1.getParcelable(r9)
            r5.putParcelable(r9, r0)
            X.578 r8 = r4.A1U
            java.lang.String r1 = r5.getString(r12)
            if (r1 == 0) goto L_0x0ddb
            X.587 r0 = r8.A02
            r61 = r0
            X.69P r22 = X.AnonymousClass69P.TERMS
            r3 = 1
            r6 = r22
            X.79R r6 = X.AnonymousClass79R.A00(r6, r0, r1)
            X.56q r0 = r8.A00
            r60 = r0
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.77e r0 = r0.A0E
            X.7IT r0 = r0.A00
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r6)
            java.lang.Object r1 = r0.A08()
            r0 = r60
            r0.A0H(r1)
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.77e r0 = r0.A0E
            X.7IT r0 = r0.A00
            X.56q r1 = X.AnonymousClass7IT.A00(r0, r6)
            X.8gC r6 = r8.A01
            r0 = r60
            r0.A0K(r1, r6)
            X.58V r8 = r4.A1J
            r0 = r25
            android.os.Parcelable r0 = r5.getParcelable(r0)
            java.lang.String r26 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest"
            r1 = r26
            X.C04220Ms.A0C(r0, r1)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            r8.A02 = r0
            java.lang.String r0 = r5.getString(r12)
            if (r0 == 0) goto L_0x0dd6
            r8.A06 = r0
            android.os.Parcelable r1 = r5.getParcelable(r9)
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            r16 = 0
            if (r0 == 0) goto L_0x0188
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r1 = (com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData) r1
            if (r1 == 0) goto L_0x0188
            java.lang.String r0 = r1.A01
            r8.A04 = r0
            java.lang.String r0 = r1.A02
            r8.A05 = r0
        L_0x0188:
            java.lang.String r1 = r8.A06
            if (r1 != 0) goto L_0x0195
            java.lang.String r0 = "productID"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0192:
            r6 = 0
            goto L_0x00fa
        L_0x0195:
            X.587 r0 = r8.A0K
            r59 = r0
            X.69P r21 = X.AnonymousClass69P.CONTACT_INFORMATION
            r6 = r21
            X.79R r0 = X.AnonymousClass79R.A00(r6, r0, r1)
            r8.A01 = r0
            X.56q r0 = r8.A0A
            r58 = r0
            X.0Oa r0 = r8.A0L
            r57 = r0
            X.7j5 r0 = X.C86144wL.A0R(r57)
            X.79R r1 = r8.A01
            java.lang.String r18 = "productComponent"
            if (r1 != 0) goto L_0x01b9
            X.C04220Ms.A0E(r18)
            throw r2
        L_0x01b9:
            X.7IT r0 = r0.A01
            X.56q r1 = X.AnonymousClass7IT.A00(r0, r1)
            X.8gC r15 = r8.A0I
            r0 = r58
            r0.A0K(r1, r15)
            X.56r r14 = r8.A0H
            X.8gC r13 = r8.A0J
            r0.A0K(r14, r13)
            X.7j5 r0 = X.C86144wL.A0R(r57)
            X.79R r1 = r8.A01
            if (r1 != 0) goto L_0x01d9
            X.C04220Ms.A0E(r18)
            throw r2
        L_0x01d9:
            X.7IT r0 = r0.A01
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r1)
            X.7Kx r11 = X.C86104wH.A0R(r0)
            if (r11 == 0) goto L_0x0234
            java.lang.Object r0 = r11.A01
            X.6uC r0 = (X.C114956uC) r0
            if (r0 == 0) goto L_0x021d
            X.6tj r1 = r0.A01
            java.lang.String r10 = r1.A01
            X.6ua r1 = r0.A00
            if (r1 == 0) goto L_0x021e
            java.util.List r1 = r1.A03
            java.lang.Object r6 = X.AnonymousClass00J.A0D(r1)
            X.6uv r6 = (X.C115356uv) r6
        L_0x01fb:
            X.6ub r0 = r0.A02
            if (r0 == 0) goto L_0x0222
            java.util.List r0 = r0.A03
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r0)
            X.6uq r1 = (X.C115306uq) r1
        L_0x0207:
            X.6uB r0 = new X.6uB
            r0.<init>(r6, r1, r10)
            java.lang.Integer r6 = X.AnonymousClass006.A00
            X.6iy r1 = new X.6iy
            r1.<init>(r6, r0, r2)
            java.lang.String r0 = r8.A06
            if (r0 != 0) goto L_0x0224
            java.lang.String r0 = "productID"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x021d:
            r10 = r2
        L_0x021e:
            r6 = r2
            if (r0 == 0) goto L_0x0222
            goto L_0x01fb
        L_0x0222:
            r1 = r2
            goto L_0x0207
        L_0x0224:
            boolean r0 = r8.A0G(r0)
            if (r0 != 0) goto L_0x0244
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r1)
        L_0x022e:
            r14.A0H(r0)
            X.AnonymousClass58V.A06(r8, r11)
        L_0x0234:
            X.56q r0 = r8.A0B
            r56 = r0
            X.7j5 r0 = X.C86144wL.A0R(r57)
            X.79R r1 = r8.A01
            if (r1 != 0) goto L_0x0249
            X.C04220Ms.A0E(r18)
            throw r2
        L_0x0244:
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r1, r2)
            goto L_0x022e
        L_0x0249:
            X.7IT r0 = r0.A01
            X.56q r1 = X.AnonymousClass7IT.A00(r0, r1)
            r0 = r56
            r0.A0K(r1, r15)
            r0.A0K(r14, r13)
            X.58U r11 = r4.A1P
            r0 = r25
            android.os.Parcelable r1 = r5.getParcelable(r0)
            r0 = r26
            X.C04220Ms.A0C(r1, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            r11.A01 = r1
            java.lang.String r6 = "ecpPaymentRequest"
            if (r1 == 0) goto L_0x02aa
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x0562
            boolean r0 = r1.A0D
        L_0x0272:
            r11.A05 = r0
            if (r1 == 0) goto L_0x055f
            java.util.Set<X.68F> r1 = r1.A0C
            X.68F r0 = X.AnonymousClass68F.REQUEST_BILLING_ADDRESS
            boolean r0 = r1.contains(r0)
        L_0x027e:
            r0 = r0 ^ 1
            r11.A06 = r0
            android.os.Parcelable r0 = r5.getParcelable(r7)
            if (r0 == 0) goto L_0x0dd1
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            r11.A02 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r11.A01
            if (r0 == 0) goto L_0x02aa
            java.lang.String r0 = r0.A08
            r11.A04 = r0
            android.os.Parcelable r1 = r5.getParcelable(r9)
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            if (r0 == 0) goto L_0x055c
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r1 = (com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData) r1
            if (r1 == 0) goto L_0x055c
            java.lang.String r0 = r1.A00
        L_0x02a2:
            r11.A03 = r0
            java.lang.String r1 = r11.A04
            if (r1 != 0) goto L_0x02ae
            java.lang.String r6 = "productId"
        L_0x02aa:
            X.C04220Ms.A0E(r6)
            throw r16
        L_0x02ae:
            X.587 r0 = r11.A0G
            r55 = r0
            X.69P r19 = X.AnonymousClass69P.PAYMENT_METHOD
            r6 = r19
            X.79R r0 = X.AnonymousClass79R.A00(r6, r0, r1)
            r11.A00 = r0
            X.56q r1 = r11.A08
            r54 = r1
            X.7j4 r1 = r11.A0H
            r53 = r1
            X.7IT r10 = r1.A01
            X.56q r6 = X.AnonymousClass7IT.A00(r10, r0)
            X.8gC r1 = r11.A0F
            r0 = r54
            r0.A0K(r6, r1)
            X.79R r0 = r11.A00
            if (r0 == 0) goto L_0x0dcd
            X.56q r0 = X.AnonymousClass7IT.A00(r10, r0)
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x02e2
            X.AnonymousClass58U.A09(r11, r0)
        L_0x02e2:
            X.56q r0 = r11.A09
            r52 = r0
            X.79R r0 = r11.A00
            if (r0 == 0) goto L_0x0dcd
            X.56q r6 = X.AnonymousClass7IT.A00(r10, r0)
            r0 = r52
            r0.A0K(r6, r1)
            X.58R r10 = r4.A1R
            r0 = r25
            android.os.Parcelable r1 = r5.getParcelable(r0)
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.ECPPaymentRequest
            if (r0 == 0) goto L_0x0348
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
        L_0x0301:
            r10.A01 = r1
            X.56q r0 = r10.A05
            r51 = r0
            X.56r r0 = r10.A06
            r50 = r0
            X.8gC r6 = r10.A07
            r1 = r51
            r1.A0K(r0, r6)
            X.58T r6 = r4.A1T
            r0 = r25
            android.os.Parcelable r1 = r5.getParcelable(r0)
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.ECPPaymentRequest
            if (r0 == 0) goto L_0x0346
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
        L_0x0320:
            r6.A01 = r1
            java.lang.String r0 = r5.getString(r12)
            if (r0 == 0) goto L_0x0dc8
            r6.A04 = r0
            android.os.Parcelable r1 = r5.getParcelable(r9)
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            if (r0 == 0) goto L_0x0344
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r1 = (com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData) r1
            if (r1 == 0) goto L_0x0344
            java.lang.String r0 = r1.A03
        L_0x0338:
            r6.A03 = r0
            java.lang.String r1 = r6.A04
            if (r1 != 0) goto L_0x034a
            java.lang.String r0 = "productID"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0344:
            r0 = r2
            goto L_0x0338
        L_0x0346:
            r1 = r2
            goto L_0x0320
        L_0x0348:
            r1 = 0
            goto L_0x0301
        L_0x034a:
            X.587 r0 = r6.A0C
            r49 = r0
            X.69P r20 = X.AnonymousClass69P.SHIPPING_ADDRESS
            r9 = r20
            X.79R r0 = X.AnonymousClass79R.A00(r9, r0, r1)
            r6.A00 = r0
            X.56q r0 = r6.A06
            r48 = r0
            X.0Oa r0 = r6.A0E
            r47 = r0
            java.lang.Object r0 = r47.getValue()
            X.7j3 r0 = (X.C128157j3) r0
            X.79R r1 = r6.A00
            if (r1 != 0) goto L_0x036e
            X.C04220Ms.A0E(r18)
            throw r2
        L_0x036e:
            X.7IT r0 = r0.A00
            X.56q r9 = X.AnonymousClass7IT.A00(r0, r1)
            X.8gC r1 = r6.A0B
            r0 = r48
            r0.A0K(r9, r1)
            java.lang.Object r0 = r47.getValue()
            X.7j3 r0 = (X.C128157j3) r0
            X.79R r9 = r6.A00
            if (r9 != 0) goto L_0x0389
            X.C04220Ms.A0E(r18)
            throw r2
        L_0x0389:
            X.7IT r0 = r0.A00
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r9)
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0398
            X.AnonymousClass58T.A06(r6, r0)
        L_0x0398:
            X.56q r0 = r6.A07
            r46 = r0
            java.lang.Object r0 = r47.getValue()
            X.7j3 r0 = (X.C128157j3) r0
            X.79R r9 = r6.A00
            if (r9 != 0) goto L_0x03aa
            X.C04220Ms.A0E(r18)
            throw r2
        L_0x03aa:
            X.7IT r0 = r0.A00
            X.56q r9 = X.AnonymousClass7IT.A00(r0, r9)
            r0 = r46
            r0.A0K(r9, r1)
            X.58K r0 = r4.A1S
            r45 = r0
            android.os.Parcelable r1 = r5.getParcelable(r7)
            if (r1 == 0) goto L_0x0dc3
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            r0.A03 = r1
            X.574 r0 = r4.A1K
            r44 = r0
            android.os.Parcelable r1 = r5.getParcelable(r7)
            if (r1 == 0) goto L_0x0dbe
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            r0.A00 = r1
            X.78P r5 = r4.A1L
            X.56q r0 = r5.A0A
            r43 = r0
            X.8gC r1 = r4.A1I
            r0.A0E(r1)
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0db9
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0558
            java.util.Set<X.68M> r13 = r0.A0B
        L_0x03ea:
            com.fbpay.logging.LoggingContext r12 = r4.A0v()
            X.588 r0 = r4.A1N
            r42 = r0
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0db4
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0daf
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0daa
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r9 = r0.A07
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0da5
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            r1 = 0
            if (r0 == 0) goto L_0x0555
            java.lang.String r7 = r0.A02
        L_0x0417:
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0da0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x0425
            java.util.ArrayList<java.lang.String> r1 = r0.A05
        L_0x0425:
            r5.A08 = r13
            r5.A06 = r12
            r0 = r63
            r5.A04 = r0
            r0 = r45
            r5.A05 = r0
            r0 = r42
            r5.A03 = r0
            if (r1 != 0) goto L_0x0439
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x0439:
            java.util.Map r41 = X.AnonymousClass4WJ.A0A()
            X.0ZV r40 = X.AnonymousClass0ZV.A00
            X.6mv r0 = new X.6mv
            r30 = r0
            r31 = r2
            r32 = r2
            r33 = r12
            r34 = r2
            r35 = r2
            r36 = r9
            r37 = r7
            r38 = r2
            r39 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r5.A02 = r0
            java.lang.Object r9 = r62.A08()
            if (r9 == 0) goto L_0x0d9b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r9 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r9
            java.lang.String r12 = X.AnonymousClass58M.A09(r9, r4, r3)
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r9.A01
            if (r0 == 0) goto L_0x0552
            X.67l r7 = r0.A02
        L_0x046c:
            X.69U r1 = X.AnonymousClass69U.A0U
            com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem r0 = new com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem
            r0.<init>(r1, r7, r12)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            r4.A0H = r0
            java.lang.String r7 = r4.A0X
            r18 = 0
            X.69U r1 = X.AnonymousClass69U.A0d
            com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem r0 = new com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem
            r0.<init>(r1, r7, r2)
            X.7Kx r0 = X.AnonymousClass7Kx.A09(r0)
            r4.A0P = r0
            boolean r0 = X.AnonymousClass58M.A0k(r4)
            if (r0 == 0) goto L_0x053a
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r12 = X.AnonymousClass7JJ.A02()
            java.lang.Object r7 = r62.A08()
            if (r7 == 0) goto L_0x0d96
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r7 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r7
            com.fbpay.logging.LoggingContext r1 = r4.A0v()
            r0 = r23
            X.C04220Ms.A0B(r7, r0)
            X.7ke r0 = X.AnonymousClass7JJ.A00()
            X.09x r13 = r0.A00
            java.lang.String r0 = "client_add_ecppreprocessing_init"
            X.0A2 r13 = X.C86104wH.A0K(r13, r0)
            r0 = 189(0xbd, float:2.65E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r14 = X.C18180wK.A0I(r13, r0)
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r13 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r0 = r23
            r13.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r2)
            X.C128957ke.A04(r14, r1, r13)
            X.56q r14 = X.C880756q.A01()
            X.AnonymousClass7Kx.A0J(r14, r2)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r13 = X.C86154wM.A0L()
            java.lang.String r15 = r7.A0A
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r13.A0D(r15, r0)
            java.lang.String r15 = r7.A08
            java.lang.String r0 = "payment_product_id"
            r13.A0D(r15, r0)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r15 = r7.A05
            if (r15 == 0) goto L_0x0550
            java.lang.String r0 = r15.A00
            if (r0 != 0) goto L_0x04e6
            java.lang.String r0 = r15.A02
        L_0x04e6:
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r15 = X.C06750aI.A14(r0)
            java.lang.String r0 = "receiver_ids"
            r13.A0A(r0, r15)
            X.AnonymousClass73F.A00(r13)
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r7.A03
            if (r0 == 0) goto L_0x04fe
            java.lang.String r0 = r0.A04
            r18 = r0
        L_0x04fe:
            java.lang.String r15 = "security_origin"
            r0 = r18
            r13.A0D(r0, r15)
            boolean r0 = r7.A0B
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "disable_logging"
            r13.A0C(r0, r7)
            X.79j r15 = r12.A02
            if (r15 != 0) goto L_0x0527
            X.6ci r7 = X.AnonymousClass7Kz.A0C()
            r15 = 4
            com.facebook.redex.IDxFunctionShape152S0200000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape152S0200000_2_I2
            r0.<init>(r15, r13, r12)
            X.7Sk r13 = X.AnonymousClass7Sk.A00
            X.5k8 r15 = new X.5k8
            r15.<init>(r13, r0, r7)
            r12.A02 = r15
        L_0x0527:
            X.M5J r13 = r15.A03()
            X.C04220Ms.A06(r13)
            r7 = 11
            com.facebook.redex.IDxObserverShape55S0300000_2_I2 r0 = new com.facebook.redex.IDxObserverShape55S0300000_2_I2
            r0.<init>((int) r7, (java.lang.Object) r12, (java.lang.Object) r1, (java.lang.Object) r14)
            r14.A0K(r13, r0)
            r4.A02 = r14
        L_0x053a:
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0d91
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            boolean r1 = X.AnonymousClass58M.A0k(r4)
            if (r1 == 0) goto L_0x0565
            X.M5J r1 = r4.A02
            if (r1 != 0) goto L_0x056c
            java.lang.String r6 = "preprocessParamFetchLiveData"
            goto L_0x02aa
        L_0x0550:
            r0 = r2
            goto L_0x04e6
        L_0x0552:
            r7 = r2
            goto L_0x046c
        L_0x0555:
            r7 = r2
            goto L_0x0417
        L_0x0558:
            X.84Y r13 = X.AnonymousClass84Y.A00
            goto L_0x03ea
        L_0x055c:
            r0 = r2
            goto L_0x02a2
        L_0x055f:
            r0 = 0
            goto L_0x027e
        L_0x0562:
            r0 = 0
            goto L_0x0272
        L_0x0565:
            com.fbpay.logging.LoggingPolicy r0 = r0.A06
            X.56r r0 = X.C880856r.A04(r0)
            goto L_0x0572
        L_0x056c:
            r0 = 24
            X.M5J r0 = X.C86134wK.A0K(r1, r4, r0)
        L_0x0572:
            r4.A01 = r0
            java.util.Map r7 = r4.A1X
            X.69P r0 = X.AnonymousClass69P.PAYMENT_RECEIVER
            X.78o r1 = X.C86114wI.A0R(r0, r7)
            if (r1 == 0) goto L_0x0583
            r0 = 23
            A05(r1, r4, r0)
        L_0x0583:
            boolean r0 = X.AnonymousClass58M.A0k(r4)
            if (r0 == 0) goto L_0x05a3
            X.M5J r1 = r4.A02
            if (r1 != 0) goto L_0x0593
            java.lang.String r0 = "preprocessParamFetchLiveData"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0593:
            r0 = r17
            X.M5J r1 = X.C86134wK.A0K(r1, r4, r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.fbpay.util.resource.FBPayResource<kotlin.String>>"
            X.C04220Ms.A0C(r1, r0)
            X.56r r1 = (X.C880856r) r1
            r4.A03 = r1
            goto L_0x0602
        L_0x05a3:
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0d8c
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0958
            java.lang.String r0 = r0.A02
        L_0x05b1:
            r4.A0W = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r62)
            if (r0 == 0) goto L_0x0955
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0955
            java.lang.String r0 = r0.A03
        L_0x05bf:
            X.AnonymousClass58M.A0R(r4, r0)
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0d87
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0952
            java.lang.String r0 = r0.A01
        L_0x05d0:
            r4.A0V = r0
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0d82
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x05f2
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0d7d
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = r0.A07
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            X.56r r0 = X.C880856r.A04(r0)
            r4.A03 = r0
        L_0x05f2:
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x094d
            X.AnonymousClass58M.A0N(r4)
        L_0x05f9:
            java.lang.String r0 = r4.A0X
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            X.AnonymousClass58M.A0U(r4, r2, r0)
        L_0x0602:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r9.A03
            if (r0 == 0) goto L_0x0949
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00
            if (r0 == 0) goto L_0x0949
            java.lang.String r35 = "REGULAR"
        L_0x060c:
            java.lang.String r0 = r4.A0W
            r36 = 14
            r30 = r2
            r31 = r9
            r33 = r0
            X.7Et r13 = X.C122157Kv.A04(r30, r31, r32, r33, r34, r35, r36)
            com.fbpay.logging.LoggingContext r12 = r4.A0v()
            com.instagram.service.session.UserSession r15 = X.AnonymousClass7HK.A00()
            X.0TJ r34 = X.AnonymousClass0TJ.A05
            r17 = 36317470364208928(0x81068c00330f20, double:3.030652724816391E-306)
            r14 = r34
            r0 = r17
            boolean r0 = X.C63803iN.A0E(r14, r15, r0)
            boolean r14 = r4.A0b
            if (r0 != 0) goto L_0x063d
            if (r14 != 0) goto L_0x063c
            boolean r0 = r4.A0e
            r14 = 0
            if (r0 == 0) goto L_0x063d
        L_0x063c:
            r14 = 1
        L_0x063d:
            r11.A02 = r12
            r1 = r55
            r0 = r19
            com.facebookpay.otc.models.OtcInput r1 = r1.A02(r0, r3)
            r0 = 24575(0x5fff, float:3.4437E-41)
            X.7Et r1 = X.C121207Et.A00(r13, r1, r2, r0)
            if (r14 == 0) goto L_0x0942
            java.lang.String r13 = "PERSISTENT_UP_TO_DATE"
            r0 = r53
            X.C128167j4.A01(r1, r0, r12, r13)
        L_0x0656:
            X.7Kx r0 = r11.A0E()
            r4.A0M = r0
            r0 = r19
            boolean r0 = X.AnonymousClass58M.A0t(r4, r0)
            if (r0 == 0) goto L_0x066d
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x066d
            X.69U r0 = X.AnonymousClass69U.A0R
            X.AnonymousClass58M.A0D(r0, r4)
        L_0x066d:
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0d78
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x093f
            java.util.Set<X.68F> r13 = r0.A0C
        L_0x067b:
            r12 = 1
            if (r13 == 0) goto L_0x0687
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_NAME
            boolean r0 = r13.contains(r0)
            r14 = 1
            if (r0 == r3) goto L_0x068a
        L_0x0687:
            r14 = 0
            if (r13 == 0) goto L_0x0693
        L_0x068a:
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_EMAIL
            boolean r0 = r13.contains(r0)
            r11 = 1
            if (r0 == r3) goto L_0x0696
        L_0x0693:
            r11 = 0
            if (r13 == 0) goto L_0x069f
        L_0x0696:
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_PHONE
            boolean r1 = r13.contains(r0)
            r0 = 1
            if (r1 == r3) goto L_0x06a0
        L_0x069f:
            r0 = 0
        L_0x06a0:
            r8.A08 = r14
            r8.A07 = r11
            r8.A09 = r0
            X.56r r0 = r8.A0D
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x093c
            java.lang.Object r0 = r0.A01
            X.6uC r0 = (X.C114956uC) r0
        L_0x06b2:
            java.util.List r1 = X.AnonymousClass58V.A00(r0, r8)
            r0 = r56
            X.AnonymousClass7Kx.A0I(r0, r1)
            if (r13 == 0) goto L_0x06c6
            X.68F r0 = X.AnonymousClass68F.REQUEST_PICKUP_NAME
            boolean r0 = r13.contains(r0)
            r11 = 1
            if (r0 == r3) goto L_0x06c9
        L_0x06c6:
            r11 = 0
            if (r13 == 0) goto L_0x06d2
        L_0x06c9:
            X.68F r0 = X.AnonymousClass68F.REQUEST_PICKUP_EMAIL
            boolean r0 = r13.contains(r0)
            r1 = 1
            if (r0 == r3) goto L_0x06d5
        L_0x06d2:
            r1 = 0
            if (r13 == 0) goto L_0x0939
        L_0x06d5:
            X.68F r0 = X.AnonymousClass68F.REQUEST_PICKUP_PHONE
            boolean r0 = r13.contains(r0)
            if (r0 != r3) goto L_0x0939
        L_0x06dd:
            r10.A03 = r11
            r10.A02 = r1
            r10.A04 = r12
            java.lang.String r1 = r4.A0W
            java.lang.String r0 = r9.A09
            r39 = r0
            r41 = 28
            r35 = r2
            r36 = r9
            r37 = r2
            r38 = r1
            r40 = r2
            X.7Et r13 = X.C122157Kv.A04(r35, r36, r37, r38, r39, r40, r41)
            com.fbpay.logging.LoggingContext r33 = r4.A0v()
            com.instagram.service.session.UserSession r12 = X.AnonymousClass7HK.A00()
            r11 = r34
            r0 = r17
            boolean r0 = X.C63803iN.A0E(r11, r12, r0)
            boolean r11 = r4.A0b
            if (r0 != 0) goto L_0x0715
            if (r11 != 0) goto L_0x0714
            boolean r0 = r4.A0e
            r11 = 0
            if (r0 == 0) goto L_0x0715
        L_0x0714:
            r11 = 1
        L_0x0715:
            r0 = r33
            r8.A03 = r0
            r1 = r59
            r0 = r21
            com.facebookpay.otc.models.OtcInput r0 = r1.A02(r0, r3)
            r12 = 24575(0x5fff, float:3.4437E-41)
            X.7Et r13 = X.C121207Et.A00(r13, r0, r2, r12)
            r0 = r21
            X.67P r1 = r1.A01(r0)
            X.67P r32 = X.AnonymousClass67P.OTC_AND_NON_OTC
            r0 = r32
            boolean r1 = X.C18180wK.A1Z(r1, r0)
            X.7j5 r31 = X.C86144wL.A0R(r57)
            if (r11 == 0) goto L_0x090e
            java.lang.String r14 = "PERSISTENT_UP_TO_DATE"
            r11 = r1
            r1 = r33
            r0 = r31
            X.AnonymousClass7j5.A00(r0, r13, r1, r14, r11)
        L_0x0745:
            X.7Kx r0 = r8.A0F()
            r4.A0I = r0
            r0 = r21
            boolean r0 = X.AnonymousClass58M.A0t(r4, r0)
            if (r0 == 0) goto L_0x075c
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x075c
            X.69U r0 = X.AnonymousClass69U.A0O
            X.AnonymousClass58M.A0D(r0, r4)
        L_0x075c:
            java.lang.String r0 = r4.A0W
            r38 = r0
            X.7Et r11 = X.C122157Kv.A04(r35, r36, r37, r38, r39, r40, r41)
            com.fbpay.logging.LoggingContext r8 = r4.A0v()
            com.instagram.service.session.UserSession r14 = X.AnonymousClass7HK.A00()
            r13 = r34
            r0 = r17
            boolean r0 = X.C63803iN.A0E(r13, r14, r0)
            boolean r13 = r4.A0b
            if (r0 != 0) goto L_0x0780
            if (r13 != 0) goto L_0x077f
            boolean r0 = r4.A0e
            r13 = 0
            if (r0 == 0) goto L_0x0780
        L_0x077f:
            r13 = 1
        L_0x0780:
            r6.A02 = r8
            r1 = r49
            r0 = r20
            X.67P r6 = r1.A01(r0)
            com.facebookpay.otc.models.OtcInput r0 = r1.A02(r0, r3)
            X.7Et r11 = X.C121207Et.A00(r11, r0, r2, r12)
            java.lang.Object r1 = r47.getValue()
            X.7j3 r1 = (X.C128157j3) r1
            if (r13 == 0) goto L_0x08ef
            r0 = r32
            boolean r6 = X.C18180wK.A1Z(r6, r0)
            java.lang.String r0 = "PERSISTENT_UP_TO_DATE"
            X.C128157j3.A01(r11, r1, r8, r0, r6)
        L_0x07a5:
            X.7Kx r1 = X.C86104wH.A0R(r48)
            r0 = 18
            X.7Kx r1 = X.AnonymousClass7Kx.A06(r1, r4, r0)
            r4.A0Q = r1
            r1 = r20
            boolean r1 = X.AnonymousClass58M.A0t(r4, r1)
            if (r1 == 0) goto L_0x07c2
            boolean r1 = r4.A0Z
            if (r1 == 0) goto L_0x07c2
            X.69U r1 = X.AnonymousClass69U.A0T
            X.AnonymousClass58M.A0D(r1, r4)
        L_0x07c2:
            X.7Kx r1 = r10.A00()
            r4.A0N = r1
            java.util.List r1 = r4.A0w()
            X.69P r13 = X.AnonymousClass69P.PICKUP_CONTACT_INFO
            boolean r1 = r1.contains(r13)
            if (r1 == 0) goto L_0x07dd
            boolean r1 = r4.A0Z
            if (r1 == 0) goto L_0x07dd
            X.69U r1 = X.AnonymousClass69U.A0S
            X.AnonymousClass58M.A0D(r1, r4)
        L_0x07dd:
            java.lang.String r1 = r4.A0W
            r38 = r1
            X.7Et r9 = X.C122157Kv.A04(r35, r36, r37, r38, r39, r40, r41)
            X.7JJ r1 = X.AnonymousClass7Kz.A05()
            X.77e r8 = r1.A0E
            r6 = r61
            r1 = r22
            com.facebookpay.otc.models.OtcInput r1 = r6.A02(r1, r3)
            X.7Et r6 = X.C121207Et.A00(r9, r1, r2, r12)
            java.lang.String r30 = "PERSISTENT_UP_TO_5_MINS"
            r1 = r30
            X.C1198377e.A00(r6, r8, r1)
            X.79R r1 = X.AnonymousClass6IY.A00(r6)
            X.7IT r6 = r8.A00
            X.AnonymousClass7IT.A00(r6, r1)
            X.7Kx r6 = X.C86104wH.A0R(r60)
            X.7Sr r1 = X.C122507Sr.A00
            X.7Kx r1 = X.AnonymousClass7Kx.A02(r1, r6)
            r4.A0R = r1
            r1 = r45
            X.56q r1 = r1.A04
            r31 = r1
            X.7Kx r6 = X.C86104wH.A0R(r31)
            X.7Ss r1 = X.C122517Ss.A00
            X.7Kx r1 = X.AnonymousClass7Kx.A02(r1, r6)
            r4.A0O = r1
            r1 = r42
            X.56r r15 = r1.A05
            X.7Kx r6 = X.C86104wH.A0R(r15)
            X.7St r1 = X.C122527St.A00
            X.7Kx r1 = X.AnonymousClass7Kx.A02(r1, r6)
            r4.A0K = r1
            java.util.List r1 = r4.A0w()
            X.AnonymousClass58M.A0X(r4, r1)
            r1 = r23
            r4.A0b = r1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = X.C86124wJ.A0a(r62)
            if (r1 == 0) goto L_0x089c
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x089c
            java.util.Set<X.68M> r6 = r1.A0B
            X.68M r1 = X.AnonymousClass68M.UX_INCENTIVES
            boolean r1 = r6.contains(r1)
            if (r1 != r3) goto L_0x089c
            java.lang.Object r8 = r62.A08()
            if (r8 == 0) goto L_0x0d73
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r8 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r8
            java.lang.String r6 = r4.A0W
            java.lang.Object r1 = r62.A08()
            if (r1 == 0) goto L_0x0d6e
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r1 = r1.A09
            r36 = r8
            r38 = r6
            r39 = r1
            X.7Et r10 = X.C122157Kv.A04(r35, r36, r37, r38, r39, r40, r41)
            X.7JJ r1 = X.AnonymousClass7Kz.A05()
            X.6cY r9 = r1.A09
            java.lang.String r1 = "INCENTIVES"
            X.6ci r8 = X.C121207Et.A01(r10, r1)
            r1 = 9
            com.facebook.redex.IDxFunctionShape152S0200000_2_I2 r6 = new com.facebook.redex.IDxFunctionShape152S0200000_2_I2
            r6.<init>(r1, r10, r9)
            X.7T2 r1 = X.AnonymousClass7T2.A00
            X.M5J r6 = X.AnonymousClass5k8.A00(r1, r6, r8)
            X.8N0 r1 = X.AnonymousClass8N0.A00
            X.M5J r8 = X.C30821GXg.A01(r6, r1)
            r6 = 87
            r1 = r42
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r1 = X.C86114wI.A0Q(r1, r6)
            r8.A0E(r1)
        L_0x089c:
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0v()
            X.69P r1 = X.AnonymousClass69P.PRICE_TABLE
            X.78o r6 = X.C86114wI.A0R(r1, r7)
            if (r6 == 0) goto L_0x08ad
            r1 = 15
            A05(r6, r4, r1)
        L_0x08ad:
            java.lang.String r11 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>"
            r1 = r43
            X.C04220Ms.A0C(r1, r11)
            r14.add(r1)
            java.lang.Object r1 = r62.A08()
            if (r1 == 0) goto L_0x0d69
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r8 = r1.A08
            java.lang.String r6 = r4.A0W
            r17 = 0
            if (r6 == 0) goto L_0x08ed
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r1 = X.AnonymousClass7JJ.A02()
            X.6lW r1 = r1.A05(r8, r6)
            if (r1 == 0) goto L_0x08ed
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r8 = r1.A00
            if (r8 == 0) goto L_0x08ed
            X.69P r6 = X.AnonymousClass69P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "event_handling_components"
            com.google.common.collect.ImmutableList r10 = r8.getEnumList(r1, r6)
        L_0x08dd:
            boolean r1 = X.AnonymousClass58M.A0k(r4)
            if (r1 == 0) goto L_0x095b
            X.M5J r1 = r4.A02
            if (r1 != 0) goto L_0x0964
            java.lang.String r0 = "preprocessParamFetchLiveData"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x08ed:
            r10 = r2
            goto L_0x08dd
        L_0x08ef:
            X.79R r14 = X.AnonymousClass6IY.A00(r11)
            X.7IT r13 = r1.A00
            X.56q r0 = r13.A05(r14)
            if (r0 != 0) goto L_0x0909
            X.56q r0 = X.AnonymousClass7IT.A00(r13, r14)
            X.AnonymousClass7Kx.A0J(r0, r2)
            java.lang.String r6 = "PERSISTENT_UP_TO_DATE"
            r0 = r23
            X.C128157j3.A01(r11, r1, r8, r6, r0)
        L_0x0909:
            X.AnonymousClass7IT.A00(r13, r14)
            goto L_0x07a5
        L_0x090e:
            X.79R r30 = X.AnonymousClass6IY.A00(r13)
            r0 = r31
            X.7IT r15 = r0.A01
            r0 = r30
            X.56q r0 = r15.A05(r0)
            if (r0 != 0) goto L_0x0932
            r0 = r30
            X.56q r0 = X.AnonymousClass7IT.A00(r15, r0)
            X.AnonymousClass7Kx.A0J(r0, r2)
            java.lang.String r0 = "PERSISTENT_UP_TO_DATE"
            r14 = r0
            r11 = r1
            r1 = r33
            r0 = r31
            X.AnonymousClass7j5.A00(r0, r13, r1, r14, r11)
        L_0x0932:
            r0 = r30
            X.AnonymousClass7IT.A00(r15, r0)
            goto L_0x0745
        L_0x0939:
            r12 = 0
            goto L_0x06dd
        L_0x093c:
            r0 = 0
            goto L_0x06b2
        L_0x093f:
            r13 = 0
            goto L_0x067b
        L_0x0942:
            r0 = r53
            r0.A05(r1, r12)
            goto L_0x0656
        L_0x0949:
            java.lang.String r35 = "PRE_FETCH"
            goto L_0x060c
        L_0x094d:
            X.AnonymousClass58M.A0O(r4)
            goto L_0x05f9
        L_0x0952:
            r0 = r2
            goto L_0x05d0
        L_0x0955:
            r0 = r2
            goto L_0x05bf
        L_0x0958:
            r0 = r2
            goto L_0x05b1
        L_0x095b:
            X.56r r1 = r4.A03
            X.C04220Ms.A0C(r1, r11)
            r14.add(r1)
            goto L_0x0967
        L_0x0964:
            r14.add(r1)
        L_0x0967:
            r1 = r21
            boolean r1 = X.AnonymousClass58M.A0t(r4, r1)
            if (r1 == 0) goto L_0x0998
            r1 = r21
            X.78o r6 = X.C86114wI.A0R(r1, r7)
            if (r6 == 0) goto L_0x097c
            r1 = 16
            A05(r6, r4, r1)
        L_0x097c:
            X.56q r6 = r4.A0r
            X.8gC r8 = r4.A13
            r1 = r58
            r6.A0K(r1, r8)
            boolean r1 = r4.A0Z
            if (r1 == 0) goto L_0x0990
            X.8gC r8 = r4.A12
            r1 = r56
            r6.A0K(r1, r8)
        L_0x0990:
            r1 = r58
            X.C04220Ms.A0C(r1, r11)
            r14.add(r1)
        L_0x0998:
            r1 = r20
            boolean r1 = X.AnonymousClass58M.A0t(r4, r1)
            if (r1 == 0) goto L_0x09d3
            r1 = r20
            X.78o r6 = X.C86114wI.A0R(r1, r7)
            if (r6 == 0) goto L_0x09ad
            r1 = 17
            A05(r6, r4, r1)
        L_0x09ad:
            X.56q r6 = r4.A0r
            X.8gC r8 = r4.A1F
            r1 = r48
            r6.A0K(r1, r8)
            r14.add(r1)
            boolean r1 = r4.A0Z
            if (r1 == 0) goto L_0x09c4
            X.8gC r8 = r4.A1E
            r1 = r46
            r6.A0K(r1, r8)
        L_0x09c4:
            if (r10 == 0) goto L_0x09ce
            r1 = r20
            boolean r1 = r10.contains(r1)
            if (r1 == 0) goto L_0x09d3
        L_0x09ce:
            r1 = r48
            r5.A01(r1)
        L_0x09d3:
            java.util.List r1 = r4.A0w()
            X.69P r9 = X.AnonymousClass69P.SHIPPING_OPTIONS
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0a0e
            X.78o r1 = X.C86114wI.A0R(r9, r7)
            if (r1 == 0) goto L_0x09e8
            A05(r1, r4, r0)
        L_0x09e8:
            X.56q r8 = r4.A0r
            X.58S r1 = r4.A1M
            X.56q r6 = r1.A05
            X.8gC r0 = r4.A15
            r8.A0K(r6, r0)
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x0a03
            X.56r r1 = r1.A07
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>"
            X.C04220Ms.A0C(r1, r0)
            X.8gC r0 = r4.A1G
            r8.A0K(r1, r0)
        L_0x0a03:
            if (r10 == 0) goto L_0x0a0b
            boolean r0 = r10.contains(r9)
            if (r0 == 0) goto L_0x0a0e
        L_0x0a0b:
            r5.A01(r6)
        L_0x0a0e:
            boolean r0 = X.AnonymousClass58M.A0t(r4, r13)
            if (r0 == 0) goto L_0x0a2c
            X.56q r6 = r4.A0r
            X.8gC r1 = r4.A1A
            r0 = r50
            r6.A0K(r0, r1)
            X.8gC r1 = r4.A19
            r0 = r51
            r6.A0K(r0, r1)
            r0 = r50
            X.C04220Ms.A0C(r0, r11)
            r14.add(r0)
        L_0x0a2c:
            r0 = r19
            boolean r0 = X.AnonymousClass58M.A0t(r4, r0)
            if (r0 == 0) goto L_0x0a70
            r0 = r19
            X.78o r1 = X.C86114wI.A0R(r0, r7)
            if (r1 == 0) goto L_0x0a41
            r0 = 19
            A05(r1, r4, r0)
        L_0x0a41:
            X.56q r6 = r4.A0r
            X.8gC r1 = r4.A1C
            r0 = r54
            r6.A0K(r0, r1)
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x0a55
            X.8gC r1 = r4.A18
            r0 = r52
            r6.A0K(r0, r1)
        L_0x0a55:
            r0 = r54
            X.C04220Ms.A0C(r0, r11)
            r14.add(r0)
            if (r10 == 0) goto L_0x0ad0
            boolean r1 = r10.contains(r9)
        L_0x0a63:
            boolean r0 = X.AnonymousClass58M.A0l(r4)
            if (r0 == 0) goto L_0x0a70
            if (r1 == 0) goto L_0x0a70
            r0 = r54
            r5.A01(r0)
        L_0x0a70:
            java.util.List r0 = r4.A0w()
            X.69P r9 = X.AnonymousClass69P.PAY_BUTTON
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0b06
            X.56q r8 = r4.A0r
            X.57w r6 = r4.A1Q
            java.lang.Object r1 = r62.A08()
            if (r1 == 0) goto L_0x0ad2
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r13 = r4.A0W
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r62)
            if (r0 == 0) goto L_0x0ace
            java.lang.String r0 = r0.A09
        L_0x0a92:
            r36 = r1
            r38 = r13
            r39 = r0
            X.7Et r1 = X.C122157Kv.A04(r35, r36, r37, r38, r39, r40, r41)
            X.8Mz r13 = X.C139188Mz.A00
            r0 = r43
            X.M5J r13 = X.C30821GXg.A01(r0, r13)
            X.587 r0 = r6.A0B
            com.facebookpay.otc.models.OtcInput r0 = r0.A02(r9, r3)
            X.7Et r9 = X.C121207Et.A00(r1, r0, r2, r12)
            java.util.List r12 = r6.A0D
            r12.clear()
            java.util.Iterator r18 = r14.iterator()
        L_0x0ab7:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0ad7
            java.lang.Object r14 = r18.next()
            X.M5J r14 = (X.M5J) r14
            X.56q r1 = r6.A05
            X.8gC r0 = r6.A08
            r1.A0K(r14, r0)
            r12.add(r14)
            goto L_0x0ab7
        L_0x0ace:
            r0 = r2
            goto L_0x0a92
        L_0x0ad0:
            r1 = 1
            goto L_0x0a63
        L_0x0ad2:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0ad7:
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.78m r1 = r0.A0C
            X.6p4 r0 = X.AnonymousClass6I0.A00(r30)
            X.M5J r9 = X.C1200978m.A00(r0, r9, r1)
            X.56q r1 = r6.A05
            X.8gC r0 = r6.A07
            r1.A0K(r9, r0)
            X.C04220Ms.A0C(r9, r11)
            r12.add(r9)
            X.8gC r0 = r6.A09
            r1.A0K(r13, r0)
            X.C883957w.A00(r6)
            X.8gC r0 = r4.A17
            r8.A0K(r1, r0)
            X.56r r1 = r4.A03
            X.7aK r0 = X.C124027aK.A00
            r8.A0K(r1, r0)
        L_0x0b06:
            java.util.List r0 = r4.A0w()
            X.69P r8 = X.AnonymousClass69P.PROMO_CODE
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0b35
            X.56q r6 = r4.A0r
            X.8gC r1 = r4.A1B
            r0 = r31
            r6.A0K(r0, r1)
            if (r10 == 0) goto L_0x0b23
            boolean r0 = r10.contains(r8)
            if (r0 == 0) goto L_0x0b2a
        L_0x0b23:
            r0 = r45
            X.56r r0 = r0.A07
            r5.A01(r0)
        L_0x0b2a:
            X.78o r1 = X.C86114wI.A0R(r8, r7)
            if (r1 == 0) goto L_0x0b35
            r0 = 20
            A05(r1, r4, r0)
        L_0x0b35:
            r0 = r22
            boolean r0 = X.AnonymousClass58M.A0t(r4, r0)
            if (r0 == 0) goto L_0x0b6a
            X.7ke r0 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r8 = r4.A0v()
            java.util.LinkedHashMap r6 = X.AnonymousClass7Kr.A07(r63)
            X.09x r1 = r0.A00
            java.lang.String r0 = "client_load_terms_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 372(0x174, float:5.21E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r0 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r9 = r24
            r0.<init>(r6, r8, r9, r3)
            X.C128957ke.A04(r1, r8, r0)
            X.56q r6 = r4.A0r
            X.8gC r1 = r4.A1D
            r0 = r60
            r6.A0K(r0, r1)
        L_0x0b6a:
            java.util.List r1 = r4.A0w()
            X.69P r0 = X.AnonymousClass69P.ITEM_LIST
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0b81
            X.78o r1 = X.C86114wI.A0R(r0, r7)
            if (r1 == 0) goto L_0x0b81
            r0 = 21
            A05(r1, r4, r0)
        L_0x0b81:
            java.util.List r0 = r4.A0w()
            X.69P r6 = X.AnonymousClass69P.INCENTIVES
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0baa
            X.56q r1 = r4.A0r
            X.8gC r0 = r4.A16
            r1.A0K(r15, r0)
            if (r10 == 0) goto L_0x0b9c
            boolean r0 = r10.contains(r6)
            if (r0 == 0) goto L_0x0baa
        L_0x0b9c:
            r0 = r42
            X.56r r0 = r0.A07
            r5.A01(r0)
            r0 = r42
            X.56r r0 = r0.A08
            r5.A01(r0)
        L_0x0baa:
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x0bc5
            java.util.List r0 = r4.A0w()
            X.69P r1 = X.AnonymousClass69P.ORDER_SUMMARY
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0bc5
            X.78o r1 = X.C86114wI.A0R(r1, r7)
            if (r1 == 0) goto L_0x0bc5
            r0 = 13
            A05(r1, r4, r0)
        L_0x0bc5:
            java.util.List r1 = r4.A0w()
            X.69P r0 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0bea
            X.7Kx r0 = X.AnonymousClass58M.A05(r4)
            java.lang.Object r1 = r0.A01
            r0 = r23
            boolean r0 = X.C18190wL.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0bea
            X.56q r5 = r4.A0r
            r0 = r63
            X.M5J r1 = r0.A06
            X.8gC r0 = r4.A11
            r5.A0K(r1, r0)
        L_0x0bea:
            java.util.List r1 = r4.A0w()
            X.69P r0 = X.AnonymousClass69P.ANON_CHECKOUT_BACK_BUTTON
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0c07
            boolean r0 = X.AnonymousClass58M.A0h(r4)
            if (r0 == 0) goto L_0x0c07
            X.56q r5 = r4.A0r
            r0 = r63
            X.M5J r1 = r0.A05
            X.8gC r0 = r4.A10
            r5.A0K(r1, r0)
        L_0x0c07:
            java.util.List r1 = r4.A0w()
            X.69P r0 = X.AnonymousClass69P.APM
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0c74
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r62)
            if (r0 == 0) goto L_0x0d52
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x0d52
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00
        L_0x0c1f:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = X.C86124wJ.A0a(r62)
            if (r1 == 0) goto L_0x0d4f
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x0d4f
            com.facebookpay.expresscheckout.models.APMConfiguration r9 = r1.A00
        L_0x0c2b:
            r1 = r63
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x0c74
            if (r0 == 0) goto L_0x0c74
            if (r9 == 0) goto L_0x0c74
            r10 = 2131826585(0x7f111799, float:1.9286059E38)
            com.fbpay.logging.LoggingContext r1 = r4.A0v()
            java.lang.String r8 = r1.A02
            java.util.concurrent.atomic.AtomicLong r1 = X.AnonymousClass73F.A00
            java.lang.String r32 = X.C86124wJ.A0y(r1)
            java.lang.String r33 = X.C86124wJ.A0y(r1)
            com.facebookpay.otc.models.OtcOptionState r1 = r63.A04()
            if (r1 == 0) goto L_0x0d64
            java.lang.String r6 = r1.A01
            java.lang.String r5 = r0.A01
            java.lang.String r1 = r0.A00
            com.facebookpay.bloks.nativeprops.APMBloksNativeProps r0 = new com.facebookpay.bloks.nativeprops.APMBloksNativeProps
            r30 = r0
            r31 = r8
            r34 = r6
            r35 = r5
            r36 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            X.69U r5 = X.AnonymousClass69U.A09
            com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem r1 = new com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem
            r1.<init>(r0, r5, r9, r6)
            X.7Kx r0 = X.AnonymousClass7Kx.A09(r1)
            r4.A09 = r0
        L_0x0c74:
            java.util.List r0 = r4.A0w()
            X.69P r1 = X.AnonymousClass69P.EMAIL_OPTIN
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0ce9
            boolean r0 = X.AnonymousClass58M.A0i(r4)
            if (r0 == 0) goto L_0x0ce9
            X.78o r5 = X.C86114wI.A0R(r1, r7)
            if (r5 == 0) goto L_0x0c91
            r0 = 14
            A05(r5, r4, r0)
        L_0x0c91:
            X.56q r5 = r4.A0r
            java.lang.Object r6 = r62.A08()
            if (r6 == 0) goto L_0x0d5f
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r6 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r6
            java.lang.Object r0 = r62.A08()
            if (r0 == 0) goto L_0x0d5a
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0cab
            java.lang.String r0 = r0.A02
            r17 = r0
        L_0x0cab:
            r13 = 30
            r7 = r2
            r8 = r6
            r9 = r2
            r10 = r17
            r11 = r2
            r12 = r2
            X.7Et r7 = X.C122157Kv.A04(r7, r8, r9, r10, r11, r12, r13)
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.6cT r6 = r0.A02
            r0 = r44
            X.587 r0 = r0.A01
            com.facebookpay.otc.models.OtcInput r1 = r0.A02(r1, r3)
            r0 = 24575(0x5fff, float:3.4437E-41)
            X.7Et r7 = X.C121207Et.A00(r7, r1, r2, r0)
            java.lang.String r0 = "EMAIL_OPTIN"
            X.6ci r3 = X.C121207Et.A01(r7, r0)
            r0 = 2
            com.facebook.redex.IDxFunctionShape152S0200000_2_I2 r1 = new com.facebook.redex.IDxFunctionShape152S0200000_2_I2
            r1.<init>(r0, r7, r6)
            X.7Sg r0 = X.AnonymousClass7Sg.A00
            X.M5J r1 = X.AnonymousClass5k8.A00(r0, r1, r3)
            X.8Mx r0 = X.C139168Mx.A00
            X.M5J r1 = X.C30821GXg.A01(r1, r0)
            X.8gC r0 = r4.A14
            r5.A0K(r1, r0)
        L_0x0ce9:
            java.util.List r0 = r4.A0w()
            X.AnonymousClass58M.A0X(r4, r0)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r1 = X.AnonymousClass7JJ.A02()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r62)
            if (r0 == 0) goto L_0x0cfc
            java.lang.String r2 = r0.A08
        L_0x0cfc:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r62)
            if (r0 == 0) goto L_0x0d0a
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0d0a
            java.lang.String r0 = r0.A02
            r16 = r0
        L_0x0d0a:
            X.77W r1 = r1.A09
            if (r2 == 0) goto L_0x0d55
            r0 = r16
            X.6ly r0 = r1.A00(r2, r0)
            com.facebookpay.expresscheckout.models.CheckoutResponse r0 = X.C122157Kv.A09(r0)
            if (r0 == 0) goto L_0x0d1d
            X.AnonymousClass58M.A0J(r4)
        L_0x0d1d:
            r0 = r23
            r4.A0d = r0
            r4.A0c = r0
            android.os.Bundle r1 = r64.requireArguments()
            r0 = r25
            android.os.Parcelable r1 = r1.getParcelable(r0)
            r0 = r26
            X.C04220Ms.A0C(r1, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            r0 = r64
            r0.A08 = r1
            android.os.Bundle r1 = r64.requireArguments()
            r0 = r28
            java.lang.Boolean r1 = X.C18210wN.A0Q(r1, r0)
            r0 = r64
            r0.A0B = r1
            r1 = -6698281(0xffffffffff99cad7, float:NaN)
            r0 = r29
            X.C14030oh.A09(r1, r0)
            return
        L_0x0d4f:
            r9 = r2
            goto L_0x0c2b
        L_0x0d52:
            r0 = r2
            goto L_0x0c1f
        L_0x0d55:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d5a:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d5f:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d64:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d69:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d6e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d73:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d78:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d7d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d82:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d87:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d8c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d91:
            java.lang.IllegalStateException r16 = X.C18180wK.A0a(r27)
            throw r16
        L_0x0d96:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0d9b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0da0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0da5:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0daa:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0daf:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0db4:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0db9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0dbe:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0dc3:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0dc8:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0dcd:
            X.C04220Ms.A0E(r18)
            throw r16
        L_0x0dd1:
            java.lang.IllegalStateException r16 = X.C18180wK.A0a(r27)
            throw r16
        L_0x0dd6:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0ddb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        L_0x0de0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j7.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-682622000);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_bottom_sheet_content_fragment, viewGroup, false);
        C14030oh.A09(1631864635, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        int A022 = C14030oh.A02(897636820);
        super.onDestroy();
        AnonymousClass58M r6 = this.A09;
        if (r6 == null) {
            str = "ecpViewModel";
        } else {
            AnonymousClass58U r4 = r6.A1P;
            C880756q r2 = r4.A08;
            C128167j4 r3 = r4.A0H;
            AnonymousClass79R r1 = r4.A00;
            str = "productComponent";
            if (r1 != null) {
                r2.A0J(AnonymousClass7IT.A00(r3.A01, r1));
                C880756q r22 = r4.A09;
                AnonymousClass79R r12 = r4.A00;
                if (r12 != null) {
                    r22.A0J(AnonymousClass7IT.A00(r3.A01, r12));
                    AnonymousClass58T r42 = r6.A1T;
                    C880756q r23 = r42.A06;
                    C04530Oa r32 = r42.A0E;
                    C128157j3 r0 = (C128157j3) r32.getValue();
                    AnonymousClass79R r13 = r42.A00;
                    if (r13 != null) {
                        r23.A0J(AnonymousClass7IT.A00(r0.A00, r13));
                        C880756q r24 = r42.A07;
                        C128157j3 r02 = (C128157j3) r32.getValue();
                        AnonymousClass79R r14 = r42.A00;
                        if (r14 != null) {
                            r24.A0J(AnonymousClass7IT.A00(r02.A00, r14));
                            AnonymousClass58V r43 = r6.A1J;
                            C880756q r25 = r43.A0A;
                            C04530Oa r33 = r43.A0L;
                            AnonymousClass7j5 A0R = C86144wL.A0R(r33);
                            AnonymousClass79R r15 = r43.A01;
                            if (r15 != null) {
                                r25.A0J(AnonymousClass7IT.A00(A0R.A01, r15));
                                C880756q r26 = r43.A0B;
                                AnonymousClass7j5 A0R2 = C86144wL.A0R(r33);
                                AnonymousClass79R r16 = r43.A01;
                                if (r16 != null) {
                                    r26.A0J(AnonymousClass7IT.A00(A0R2.A01, r16));
                                    C14030oh.A09(-2106695977, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onResume() {
        String str;
        AnonymousClass69R r6;
        int A022 = C14030oh.A02(-534717005);
        super.onResume();
        AnonymousClass58M r0 = this.A09;
        if (r0 == null) {
            str = "ecpViewModel";
        } else {
            boolean A13 = r0.A13();
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper == null) {
                str = "viewContext";
            } else {
                str = "ecpPaymentRequest";
                ECPPaymentRequest eCPPaymentRequest = this.A08;
                if (A13) {
                    if (eCPPaymentRequest != null) {
                        r6 = eCPPaymentRequest.A04.A03;
                    }
                } else if (eCPPaymentRequest != null) {
                    r6 = eCPPaymentRequest.A04.A04;
                }
                AnonymousClass3JK.A00(contextThemeWrapper, this, r6, (String) null, (String) null, new KtLambdaShape26S0100000_I2_6(this, 3), new KtLambdaShape4S0110000_I2(4, this, A13), 224, A0B(this));
                C14030oh.A09(-126992053, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* synthetic */ boolean Bnq(LoggingContext loggingContext, Integer num) {
        return false;
    }
}
