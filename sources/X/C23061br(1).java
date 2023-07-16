package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1br  reason: invalid class name and case insensitive filesystem */
public final class C23061br extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBulletListFragment";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public QuickPromotionSlot A04;
    public C28321u4 A05;
    public UserSession A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public View A0A;
    public C28291u0 A0B;
    public boolean A0C;
    public final Handler A0D = AnonymousClass0wJ.A0F();
    public final List A0E = AnonymousClass0wJ.A0v();

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtO(false);
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final String getModuleName() {
        return "quick promotion";
    }

    public final C10300i6 getSession() {
        return this.A06;
    }

    public final boolean onBackPressed() {
        return !this.A0C;
    }

    public static void A00(View view, IgLinearLayout igLinearLayout, IgTextView igTextView, List list, int i) {
        list.add(new C57263Aj(igLinearLayout, igTextView, (IgImageView) view.requireViewById(i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0084, code lost:
        if (r1 == null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r0 = -1112479482(0xffffffffbdb0e906, float:-0.08638196)
            int r3 = X.C14030oh.A02(r0)
            r4 = r23
            r0 = r24
            super.onCreate(r0)
            X.C24731jw.A00(r4)
            android.os.Bundle r5 = r4.requireArguments()
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"
            java.lang.String r0 = X.C18190wL.A0j(r5, r0)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r4.A04 = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL"
            boolean r0 = r5.getBoolean(r0)
            r4.A08 = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION"
            java.lang.String r1 = r5.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r0 != 0) goto L_0x0046
            X.MMo r0 = X.C18180wK.A0L(r1)     // Catch:{ IOException -> 0x003f }
            X.1u0 r2 = X.AnonymousClass3WT.parseFromJson(r0)     // Catch:{ IOException -> 0x003f }
            goto L_0x0046
        L_0x003f:
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "Error parsing fullscreen interstitial promotion"
            X.C10450iM.A03(r1, r0)
        L_0x0046:
            r4.A0B = r2
            com.instagram.service.session.UserSession r2 = X.C18180wK.A0V(r5)
            r4.A06 = r2
            X.3Vz r17 = X.C36622Sa.A00()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r4.A04
            X.C36622Sa.A00()
            r5 = 0
            r0 = 3
            com.facebook.redex.IDxPCleanerShape530S0100000_1_I2 r13 = new com.facebook.redex.IDxPCleanerShape530S0100000_1_I2
            r13.<init>(r4, r0)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            X.3GL r20 = X.C61403Th.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r19 = r4
            r18 = r4
            r21 = r1
            r22 = r2
            X.1u4 r2 = r17.A04(r18, r19, r20, r21, r22)
            r4.A05 = r2
            X.1u0 r0 = r4.A0B
            if (r0 == 0) goto L_0x0086
            X.1tt r0 = r0.A08
            X.3CQ r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            r4.A0C = r0
            r4.registerLifecycleListener(r2)
            r0 = 16212264(0xf76128, float:2.271822E-38)
            X.C14030oh.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23061br.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(210068170);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.quick_promotion_fullscreen_bullet_list_fragment);
        this.A02 = AnonymousClass0wJ.A0L(A0H, R.id.primary_button);
        this.A00 = AnonymousClass0wJ.A0L(A0H, R.id.content);
        this.A01 = C18180wK.A0G(A0H, R.id.learn_more_link);
        this.A03 = AnonymousClass0wJ.A0L(A0H, R.id.title);
        this.A0A = A0H.requireViewById(R.id.content_container);
        List list = this.A0E;
        A00(A0H, (IgLinearLayout) A0H.requireViewById(R.id.bullet_item_1), C18250wR.A0L(A0H, R.id.bullet_item_text_1), list, R.id.bullet_item_icon_1);
        A00(A0H, (IgLinearLayout) A0H.requireViewById(R.id.bullet_item_2), C18250wR.A0L(A0H, R.id.bullet_item_text_2), list, R.id.bullet_item_icon_2);
        A00(A0H, (IgLinearLayout) A0H.requireViewById(R.id.bullet_item_3), C18250wR.A0L(A0H, R.id.bullet_item_text_3), list, R.id.bullet_item_icon_3);
        A00(A0H, (IgLinearLayout) A0H.requireViewById(R.id.bullet_item_4), C18250wR.A0L(A0H, R.id.bullet_item_text_4), list, R.id.bullet_item_icon_4);
        A00(A0H, (IgLinearLayout) A0H.requireViewById(R.id.bullet_item_5), C18250wR.A0L(A0H, R.id.bullet_item_text_5), list, R.id.bullet_item_icon_5);
        A00(A0H, (IgLinearLayout) A0H.requireViewById(R.id.bullet_item_6), C18250wR.A0L(A0H, R.id.bullet_item_text_6), list, R.id.bullet_item_icon_6);
        C14030oh.A09(-333584571, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(829558645);
        unregisterLifecycleListener(this.A05);
        super.onDestroy();
        C14030oh.A09(-1172543806, A022);
    }

    public final void onResume() {
        ImmutableList copyOf;
        TextView textView;
        int A022 = C14030oh.A02(1494957487);
        super.onResume();
        C28291u0 r4 = this.A0B;
        if (r4 == null || this.A09) {
            C12560m7 r0 = this.mFragmentManager;
            r0.getClass();
            r0.A0d();
            if (this.A08) {
                C18220wO.A18(this);
            }
            this.A07 = true;
        } else {
            this.A05.CEB(r4);
            C28221tt r3 = r4.A08;
            C28251tw r02 = r3.A09;
            if (r02 != null) {
                this.A03.setText(r02.A00);
            }
            C28231tu r03 = r3.A03;
            if (r03 != null) {
                this.A00.setText(r03.A00);
            }
            AnonymousClass3CQ r2 = r3.A02;
            if (!(r2 == null || (textView = this.A01) == null)) {
                textView.setText(r2.A00.A00);
                AnonymousClass0wJ.A18(this.A01, 165, r2, this);
            }
            AnonymousClass3CQ r04 = r3.A01;
            if (r04 != null) {
                this.A02.setText(r04.A00.A00);
                AnonymousClass0wJ.A18(this.A02, 166, r4, this);
            }
            List list = r3.A0A;
            if (!(list == null || (copyOf = ImmutableList.copyOf((Collection) list)) == null || copyOf.isEmpty())) {
                for (int i = 0; i < copyOf.size(); i++) {
                    C57203Ad r7 = (C57203Ad) copyOf.get(i);
                    List list2 = this.A0E;
                    ((C57263Aj) list2.get(i)).A00.setVisibility(0);
                    if (r7.A00 != null) {
                        ((C57263Aj) list2.get(i)).A02.setUrl(r7.A00.A00, this);
                    }
                    ((C57263Aj) list2.get(i)).A01.setText(r7.A02);
                }
            }
        }
        C14030oh.A09(1535727511, A022);
    }
}
