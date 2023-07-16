package X;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;

/* renamed from: X.1bu  reason: invalid class name and case insensitive filesystem */
public class C23091bu extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBaseFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public IgImageView A05;
    public QuickPromotionSlot A06;
    public C28291u0 A07;
    public C28321u4 A08;
    public UserSession A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Handler A0E = AnonymousClass0wJ.A0F();

    public String getModuleName() {
        return "quick promotion";
    }

    public final void A01() {
        C12560m7 r0 = this.mFragmentManager;
        if (r0 != null) {
            r0.A0d();
        }
        FragmentActivity activity = getActivity();
        if (this.A0D && activity != null) {
            activity.finish();
        }
    }

    public final void A02(C28291u0 r5) {
        IgImageView igImageView;
        ImageUrl imageUrl;
        TextView textView;
        C28321u4 r0 = this.A08;
        if (r0 != null) {
            r0.CEB(r5);
        }
        C28221tt r2 = r5.A08;
        C04220Ms.A06(r2);
        TextView textView2 = this.A04;
        if (textView2 != null) {
            textView2.setText(r2.A09.A00);
        }
        C28231tu r02 = r2.A03;
        if (!(r02 == null || (textView = this.A01) == null)) {
            textView.setText(r02.A00);
        }
        AnonymousClass3CQ r03 = r2.A01;
        if (r03 != null) {
            TextView textView3 = this.A02;
            if (textView3 != null) {
                textView3.setText(r03.A00.A00);
            }
            TextView textView4 = this.A02;
            if (textView4 != null) {
                AnonymousClass0wJ.A18(textView4, 163, this, r5);
            }
        }
        AnonymousClass3CQ r04 = r2.A02;
        if (r04 != null) {
            TextView textView5 = this.A03;
            if (textView5 != null) {
                textView5.setText(r04.A00.A00);
            }
            TextView textView6 = this.A03;
            if (textView6 != null) {
                AnonymousClass0wJ.A18(textView6, 164, this, r5);
            }
        }
        AnonymousClass3TA r3 = r2.A06;
        AnonymousClass3TA r22 = r2.A07;
        if (C34822La.A00(requireContext()) && r3 != null) {
            igImageView = this.A05;
            if (igImageView != null) {
                imageUrl = r3.A00;
            } else {
                return;
            }
        } else if (r22 != null && (igImageView = this.A05) != null) {
            imageUrl = r22.A00;
        } else {
            return;
        }
        C04220Ms.A06(imageUrl);
        igImageView.setUrl(imageUrl, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C28401uD
            r1 = 0
            if (r0 == 0) goto L_0x0013
            X.C04220Ms.A0B(r4, r1)
        L_0x0008:
            r4.CtO(r1)
        L_0x000b:
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0012
            r0.requestLayout()
        L_0x0012:
            return
        L_0x0013:
            X.C04220Ms.A0B(r4, r1)
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0008
            r0 = 1
            r4.CtO(r0)
            r4.CtT(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.3Hc r1 = new X.3Hc
            r1.<init>(r0)
            r0 = -1
            r1.A01(r0)
            r0 = 2131233204(0x7f0809b4, float:1.8082539E38)
            r1.A01 = r0
            X.DYo r0 = r1.A00()
            r4.Cro(r0)
            android.view.View r2 = r3.A00
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r3)
            r0 = 2131165488(0x7f070130, float:1.7945195E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r4.AOg()
            int r1 = r1 - r0
            X.C09860go.A0X(r2, r1)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23091bu.configureActionBar(X.4u2):void");
    }

    public final C10300i6 getSession() {
        return this.A09;
    }

    public final boolean onBackPressed() {
        if (this instanceof C28421uF) {
            return false;
        }
        return !this.A0C;
    }

    public static View A00(View view, C23091bu r2) {
        r2.A02 = (TextView) view.findViewById(R.id.primary_button);
        r2.A03 = (TextView) view.findViewById(R.id.secondary_button);
        r2.A01 = (TextView) view.findViewById(R.id.content);
        r2.A04 = (TextView) view.findViewById(R.id.title);
        return view.findViewById(R.id.image);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        if (r1 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r5.length() == 0) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r0 = 704059827(0x29f719b3, float:1.09734616E-13)
            int r3 = X.C14030oh.A02(r0)
            r4 = r23
            r0 = r24
            super.onCreate(r0)
            X.C24731jw.A00(r4)
            android.os.Bundle r7 = r4.requireArguments()
            java.lang.String r6 = "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"
            java.lang.String r0 = r7.getString(r6)
            if (r0 == 0) goto L_0x00c0
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r4.A06 = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL"
            boolean r0 = r7.getBoolean(r0)
            r4.A0D = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION"
            java.lang.String r5 = r7.getString(r0)
            if (r5 == 0) goto L_0x003a
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            r2 = 0
            if (r0 != 0) goto L_0x004e
            X.MMo r0 = X.C18180wK.A0L(r5)     // Catch:{ IOException -> 0x0047 }
            X.1u0 r2 = X.AnonymousClass3WT.parseFromJson(r0)     // Catch:{ IOException -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "Error parsing fullscreen interstitial promotion"
            X.C10450iM.A03(r1, r0)
        L_0x004e:
            r4.A07 = r2
            com.instagram.service.session.UserSession r2 = X.C18180wK.A0V(r7)
            r4.A09 = r2
            boolean r0 = r4 instanceof X.C28421uF
            if (r0 == 0) goto L_0x008e
            android.os.Bundle r0 = r4.requireArguments()
            com.instagram.service.session.UserSession r10 = X.C18180wK.A0V(r0)
            java.lang.String r0 = r0.getString(r6)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r6 = 0
            X.1u3 r5 = new X.1u3
            r8 = r4
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0072:
            r4.A08 = r5
            X.1u0 r0 = r4.A07
            if (r0 == 0) goto L_0x0081
            X.1tt r0 = r0.A08
            if (r0 == 0) goto L_0x0081
            X.3CQ r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r4.A0C = r0
            r4.registerLifecycleListener(r5)
            r0 = 711494062(0x2a6889ae, float:2.0653507E-13)
            X.C14030oh.A09(r0, r3)
            return
        L_0x008e:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r4.A06
            if (r2 == 0) goto L_0x00be
            if (r1 == 0) goto L_0x00be
            X.3Vz r17 = X.C36622Sa.A00()
            X.C36622Sa.A00()
            r5 = 0
            r0 = 2
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
            r18 = r4
            r19 = r4
            r21 = r1
            r22 = r2
            X.1u4 r5 = r17.A04(r18, r19, r20, r21, r22)
            goto L_0x0072
        L_0x00be:
            r5 = 0
            goto L_0x0072
        L_0x00c0:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = -1555595260(0xffffffffa3478004, float:-1.081492E-17)
            X.C14030oh.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23091bu.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-627831487);
        unregisterLifecycleListener(this.A08);
        super.onDestroy();
        C14030oh.A09(-1433477533, A022);
    }

    public void onResume() {
        int A022 = C14030oh.A02(-1387924602);
        super.onResume();
        C28291u0 r1 = this.A07;
        if (r1 == null || this.A0B) {
            A01();
            this.A0A = true;
        } else {
            A02(r1);
        }
        C14030oh.A09(-499705806, A022);
    }
}
