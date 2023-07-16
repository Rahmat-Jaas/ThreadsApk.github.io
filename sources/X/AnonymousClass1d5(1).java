package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.1d5  reason: invalid class name */
public final class AnonymousClass1d5 extends C34640IcN implements C83724rs {
    public static final String __redex_internal_original_name = "QuickPromotionIGBottomsheetBloksFragment";
    public ViewGroup A00;
    public C121247Ez A01;
    public QuickPromotionSlot A02;
    public C28321u4 A03;
    public boolean A04;
    public C28291u0 A05;
    public final C04530Oa A06 = C80644m9.A00(this);

    public final String getModuleName() {
        return "quick_promotion_ig_bottomsheet_bloks_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C28291u0 r6;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28321u4 r5 = this.A03;
        if (r5 != null && (r6 = this.A05) != null) {
            C130667qT A062 = r5.A06();
            A062.A01.put(R.id.bloks_action_listener, new C57253Ai(requireContext(), A062, r5, r6, this));
        }
    }

    public final void C1l(C121247Ez r3, C57253Ai r4) {
        Context context;
        this.A01 = r3;
        C28291u0 r1 = this.A05;
        if (r1 != null) {
            C28321u4 r0 = this.A03;
            if (r0 != null) {
                r0.CEB(r1);
            }
            View view = this.mView;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            LLF llf = new LLF(context);
            C121247Ez r02 = this.A01;
            if (r02 != null) {
                r02.A06(llf);
            }
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                viewGroup.addView(llf);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A06);
    }

    public final void C54(String str) {
        if (isAdded()) {
            C18190wL.A19(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r2.length() == 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = 721748054(0x2b050056, float:4.725156E-13)
            int r4 = X.C14030oh.A02(r0)
            r5 = r24
            r0 = r25
            super.onCreate(r0)
            X.C24731jw.A00(r5)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "promotion_slot"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0093
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r5.A02 = r0
            java.lang.String r0 = "quick_promotion"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x0032
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            r3 = 0
            if (r0 != 0) goto L_0x0047
            X.MMo r0 = X.C18180wK.A0L(r2)     // Catch:{ IOException -> 0x003f }
            X.1u0 r3 = X.AnonymousClass3WT.parseFromJson(r0)     // Catch:{ IOException -> 0x003f }
            goto L_0x0047
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = "QuickPromotionIGBottomsheetBloksFragment"
            java.lang.String r0 = "Error parsing bloks bottomsheet promotion"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
        L_0x0047:
            r5.A05 = r3
            com.instagram.quickpromotion.intf.QuickPromotionSlot r3 = r5.A02
            X.0Oa r2 = r5.A06
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L_0x0091
            if (r3 == 0) goto L_0x0091
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.3Vz r18 = X.C36622Sa.A00()
            com.instagram.service.session.UserSession r23 = X.AnonymousClass0wJ.A0X(r2)
            X.C36622Sa.A00()
            r6 = 0
            r0 = 0
            com.facebook.redex.IDxPCleanerShape338S0200000_1_I2 r14 = new com.facebook.redex.IDxPCleanerShape338S0200000_1_I2
            r14.<init>(r0, r1, r5)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            X.3GL r21 = X.C61403Th.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r20 = r5
            r19 = r5
            r22 = r3
            X.1u4 r0 = r18.A04(r19, r20, r21, r22, r23)
        L_0x0085:
            r5.A03 = r0
            r5.registerLifecycleListener(r0)
            r0 = 102318143(0x619403f, float:2.8823302E-35)
            X.C14030oh.A09(r0, r4)
            return
        L_0x0091:
            r0 = 0
            goto L_0x0085
        L_0x0093:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = 758803844(0x2d3a6d84, float:1.0597193E-11)
            X.C14030oh.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1d5.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(15275454);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        if (inflate != null) {
            this.A00 = C18240wQ.A0G(inflate, R.id.bloks_container);
        } else {
            inflate = null;
        }
        C14030oh.A09(-1009644830, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1320395000);
        unregisterLifecycleListener(this.A03);
        super.onDestroy();
        C14030oh.A09(2114715946, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-142696513);
        C121247Ez r0 = this.A01;
        if (r0 != null) {
            r0.A04();
        }
        this.A01 = null;
        this.A00 = null;
        super.onDestroyView();
        C14030oh.A09(1945772032, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-420851749);
        super.onResume();
        if (this.A05 == null) {
            if (isAdded()) {
                C18190wL.A19(this);
            }
            this.A04 = true;
        }
        C14030oh.A09(271137863, A022);
    }
}
