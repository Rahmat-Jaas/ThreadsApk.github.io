package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3YL  reason: invalid class name */
public final class AnonymousClass3YL {
    public AnonymousClass36E A00;
    public List A01 = AnonymousClass0wJ.A0v();
    public UserSession A02;
    public AnonymousClass3UW A03;
    public AnonymousClass3SR A04;
    public C57353As A05;
    public C57353As A06;
    public C57353As A07;
    public C57353As A08;
    public AnonymousClass3SS A09;
    public AnonymousClass3ST A0A;
    public Integer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Set A0F = new CopyOnWriteArraySet();

    public static boolean A01(AnonymousClass3YL r2) {
        if (!r2.A07.A02 || !r2.A06.A02 || !r2.A05.A02) {
            return false;
        }
        if (r2.A02() == AnonymousClass006.A00 || r2.A08.A02) {
            return true;
        }
        return false;
    }

    public final Integer A02() {
        Boolean bool = this.A05.A00;
        if (bool == null || !bool.booleanValue()) {
            return AnonymousClass006.A00;
        }
        Boolean bool2 = this.A08.A00;
        if (bool2 == null || !bool2.booleanValue()) {
            return AnonymousClass006.A01;
        }
        return AnonymousClass006.A0C;
    }

    public AnonymousClass3YL(UserSession userSession) {
        this.A02 = userSession;
        this.A0B = null;
        this.A00 = new AnonymousClass36E(userSession);
        this.A09 = new AnonymousClass3SS(userSession);
        this.A04 = new AnonymousClass3SR(userSession);
        this.A03 = new AnonymousClass3UW(userSession);
        this.A0A = new AnonymousClass3ST(userSession);
        this.A07 = new C57353As();
        this.A06 = new C57353As();
        this.A05 = new C57353As();
        this.A08 = new C57353As();
        this.A0C = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36314206185719631L);
        SharedPreferences A012 = AnonymousClass3Zs.A03(userSession).A01(D2R.A10);
        this.A0E = A012.getBoolean("fbpay_enabled", false);
        this.A0D = A012.getBoolean("fbpay_connected", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r13.A08.A01 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r1 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011f, code lost:
        if (r1 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0129, code lost:
        if (r1.booleanValue() == false) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass3YL r13) {
        /*
            boolean r0 = A01(r13)
            if (r0 != 0) goto L_0x000b
            java.lang.Integer r0 = r13.A0B
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            return
        L_0x000b:
            boolean r0 = r13.A0C
            if (r0 == 0) goto L_0x0013
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r13.A0B = r0
        L_0x0013:
            java.lang.Integer r3 = r13.A0B
            if (r3 != 0) goto L_0x003e
            X.3As r2 = r13.A07
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0030
            X.3As r0 = r13.A06
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0030
            X.3As r0 = r13.A05
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0030
            X.3As r0 = r13.A08
            boolean r1 = r0.A01
            r0 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r3 = 0
            if (r0 != 0) goto L_0x003e
            java.lang.Boolean r2 = r2.A00
            X.3As r0 = r13.A06
            java.lang.Boolean r1 = r0.A00
            if (r2 != 0) goto L_0x0119
            if (r1 != 0) goto L_0x0125
        L_0x003e:
            r13.A0B = r3
            java.util.Set r0 = r13.A0F
            java.util.Iterator r5 = r0.iterator()
        L_0x0046:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r2 = r5.next()
            com.instagram.settings.common.PaymentOptionsFragment r2 = (com.instagram.settings.common.PaymentOptionsFragment) r2
            java.lang.Integer r9 = r13.A0B
            if (r9 != 0) goto L_0x0069
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r2.emptyStateView
            if (r1 == 0) goto L_0x005f
            X.9uK r0 = X.C170039uK.EMPTY
            r1.A0N(r0)
        L_0x005f:
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L_0x0046
            X.C62973bE.A01(r0)
            goto L_0x0046
        L_0x0069:
            java.lang.Integer r4 = r13.A02()
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r4 != r0) goto L_0x00ab
            if (r9 == r0) goto L_0x00ab
            androidx.fragment.app.FragmentActivity r7 = r2.getActivity()
            if (r7 == 0) goto L_0x0046
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            X.3Tl r6 = com.instagram.settings.common.PaymentOptionsFragment.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.C04220Ms.A0C(r7, r0)
            com.instagram.base.activity.BaseFragmentActivity r7 = (com.instagram.base.activity.BaseFragmentActivity) r7
            X.0Oa r0 = r2.A03
            com.instagram.service.session.UserSession r8 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r10 = r2.A01
            if (r10 != 0) goto L_0x009b
            java.lang.String r0 = "sessionId"
        L_0x0096:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x009b:
            java.lang.String r11 = "payments"
            r6.A01(r7, r8, r9, r10, r11, r12)
            X.1fC r0 = r2.A00
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "adapter"
            goto L_0x0096
        L_0x00a7:
            r0.setItems(r12)
            goto L_0x0046
        L_0x00ab:
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r2.emptyStateView
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x00bd
            X.9uK r1 = X.C170039uK.ERROR
            java.util.HashMap r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            X.Awh r0 = (X.C19460Awh) r0
            r0.A0C = r3
        L_0x00bd:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r2.emptyStateView
            if (r1 == 0) goto L_0x00c6
            X.9uK r0 = X.C170039uK.ERROR
            r1.A0T(r0, r3)
        L_0x00c6:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r2.emptyStateView
            if (r1 == 0) goto L_0x00cf
            X.9uK r0 = X.C170039uK.ERROR
            r1.A0S(r0, r3)
        L_0x00cf:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r4 != r0) goto L_0x00fc
            r1 = 2131832212(0x7f112d94, float:1.9297471E38)
            r0 = 2131832213(0x7f112d95, float:1.9297473E38)
            com.instagram.settings.common.PaymentOptionsFragment.A01(r2, r1, r0)
            r3 = 2131824339(0x7f110ed3, float:1.9281503E38)
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r2.emptyStateView
            if (r1 == 0) goto L_0x00e8
            X.9uK r0 = X.C170039uK.ERROR
            r1.A0O(r0, r3)
        L_0x00e8:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r2.emptyStateView
            if (r1 == 0) goto L_0x00f1
            X.9uK r0 = X.C170039uK.ERROR
            r1.A0M(r2, r0)
        L_0x00f1:
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r2.emptyStateView
            if (r1 == 0) goto L_0x0046
            X.9uK r0 = X.C170039uK.ERROR
            r1.A0N(r0)
            goto L_0x0046
        L_0x00fc:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r4 != r0) goto L_0x010a
            r1 = 2131837732(0x7f114324, float:1.9308667E38)
            r0 = 2131837733(0x7f114325, float:1.930867E38)
            com.instagram.settings.common.PaymentOptionsFragment.A01(r2, r1, r0)
            goto L_0x00f1
        L_0x010a:
            r1 = 2131832207(0x7f112d8f, float:1.9297461E38)
            r0 = 2131832209(0x7f112d91, float:1.9297465E38)
            com.instagram.settings.common.PaymentOptionsFragment.A01(r2, r1, r0)
            java.lang.String r0 = "settings_not_available"
            com.instagram.settings.common.PaymentOptionsFragment.A02(r2, r0)
            goto L_0x00f1
        L_0x0119:
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x012b
            if (r1 != 0) goto L_0x0125
        L_0x0121:
            java.lang.Integer r3 = X.AnonymousClass006.A00
            goto L_0x003e
        L_0x0125:
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0121
        L_0x012b:
            java.lang.Integer r3 = X.AnonymousClass006.A01
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YL.A00(X.3YL):void");
    }
}
