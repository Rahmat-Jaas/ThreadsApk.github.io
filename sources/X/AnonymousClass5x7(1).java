package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18;

/* renamed from: X.5x7  reason: invalid class name */
public final class AnonymousClass5x7 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentAdDetailsFragment";
    public AnonymousClass4u2 A00;
    public C111036mg A01;
    public AnonymousClass5uD A02;
    public final C04530Oa A03 = C62373Zc.A03(new KtLambdaShape38S0100000_I2_18(this, 36));
    public final C04530Oa A04 = C86154wM.A0v(this, 37);
    public final C04530Oa A05 = C86154wM.A0v(this, 38);
    public final C04530Oa A06 = C86154wM.A0v(this, 39);
    public final C04530Oa A07 = C86154wM.A0v(this, 40);
    public final C04530Oa A08 = C86154wM.A0v(this, 41);
    public final C04530Oa A09 = C86154wM.A0v(this, 42);
    public final C04530Oa A0A = C62373Zc.A03(new KtLambdaShape38S0100000_I2_18(this, 43));

    public static final void A01(AnonymousClass5x7 r5, String str) {
        AnonymousClass5x7 r1 = r5;
        UserSession A0X = AnonymousClass0wJ.A0X(r5.A0A);
        String A0r = C86114wI.A0r(r5.A07);
        AnonymousClass5uD r0 = r5.A02;
        if (r0 == null) {
            C04220Ms.A0E("adInfo");
            throw null;
        } else {
            AnonymousClass3WB.A00(r1, A0X, A0r, r0.A00().getId(), C86114wI.A0r(r5.A05), str);
        }
    }

    public final String getModuleName() {
        return "BrandedContentPartnerPromotionFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18240wQ.A12((RecyclerView) AnonymousClass0wJ.A0J(view, R.id.recycler_view), this.A03);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
        String A0r = C86114wI.A0r(this.A07);
        String A0q = C18200wM.A0q(this.A04);
        C04220Ms.A0B(A0U, 0);
        String A0M = AnonymousClass00U.A0M("business/branded_content/get_sponsor_boost_insights/", C18190wL.A1b(A0r, "_", 0)[0], '/');
        H1T A0P = AnonymousClass0wJ.A0P(A0U);
        if (A0q != null) {
            A0M = AnonymousClass00U.A0M(A0M, A0q, '/');
        }
        A0P.A0J(A0M);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass5uD.class, C118056zg.class);
        A0T.A00 = new IDxACallbackShape112S0100000_2_I2(this, 2);
        schedule(A0T);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0262, code lost:
        if (r2 != 0) goto L_0x0264;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass5x7 r21) {
        /*
            X.3I1 r0 = new X.3I1
            r0.<init>()
            r15 = r21
            X.0Oa r1 = r15.A08
            java.lang.Object r3 = r1.getValue()
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.String r12 = "adInfo"
            if (r3 == 0) goto L_0x003d
            X.0Oa r1 = r15.A07
            java.lang.String r4 = X.C86114wI.A0r(r1)
            X.5uD r1 = r15.A02
            if (r1 == 0) goto L_0x0313
            java.lang.String r5 = r1.A01
            if (r5 == 0) goto L_0x030e
            com.instagram.user.model.User r1 = r1.A00()
            java.lang.String r6 = r1.getId()
            X.6mg r2 = r15.A01
            X.5MP r1 = new X.5MP
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A01(r1)
            java.lang.String r2 = "divider_id"
            X.7so r1 = new X.7so
            r1.<init>(r2)
            r0.A01(r1)
        L_0x003d:
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832097(0x7f112d21, float:1.9297238E38)
            java.lang.String r2 = r2.getString(r1)
            X.7sp r1 = new X.7sp
            r1.<init>(r2)
            r0.A01(r1)
            X.6mg r4 = r15.A01
            if (r4 == 0) goto L_0x00c9
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832157(0x7f112d5d, float:1.929736E38)
            r3 = 2131832157(0x7f112d5d, float:1.929736E38)
            java.lang.String r5 = r2.getString(r1)
            boolean r11 = r4.A07
            java.lang.String r10 = r4.A04
            if (r10 == 0) goto L_0x030b
            java.lang.String r4 = r4.A03
            X.0Oa r1 = r15.A05
            java.lang.Object r9 = X.C18190wL.A0f(r1)
            java.lang.StringBuilder r6 = X.C18200wM.A0r()
            java.lang.String r2 = " | "
            r7 = 1
            android.content.Context r8 = r15.requireContext()
            if (r11 == 0) goto L_0x01c1
            r1 = 2131832145(0x7f112d51, float:1.9297336E38)
            java.lang.String r1 = r8.getString(r1)
            r6.append(r1)
            r6.append(r2)
            android.content.Context r8 = r15.requireContext()
            long r1 = java.lang.Long.parseLong(r10)
            r4 = 2131832156(0x7f112d5c, float:1.9297358E38)
        L_0x0095:
            java.lang.String r1 = X.C63543hm.A03(r8, r4, r1, r7)
            r6.append(r1)
        L_0x009c:
            java.lang.String r2 = X.C18190wL.A0n(r6)
            java.lang.String r4 = "status_info_item_id"
            X.5MN r1 = new X.5MN
            r1.<init>(r2, r4, r5)
            r0.A01(r1)
            X.6mg r1 = r15.A01
            if (r1 != 0) goto L_0x00c9
            android.content.Context r1 = r15.requireContext()
            java.lang.String r3 = r1.getString(r3)
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832154(0x7f112d5a, float:1.9297354E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r2, r1)
            X.5MN r1 = new X.5MN
            r1.<init>(r2, r4, r3)
            r0.A01(r1)
        L_0x00c9:
            X.6mg r3 = r15.A01
            if (r3 == 0) goto L_0x0143
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832149(0x7f112d55, float:1.9297344E38)
            java.lang.String r4 = r2.getString(r1)
            androidx.fragment.app.FragmentActivity r14 = r15.requireActivity()
            X.0Oa r1 = r15.A0A
            com.instagram.service.session.UserSession r7 = X.AnonymousClass0wJ.A0X(r1)
            android.content.Context r8 = r15.requireContext()
            java.lang.String r2 = r3.A01
            java.lang.String r6 = r3.A05
            X.0Oa r1 = r15.A07
            java.lang.String r17 = X.C86114wI.A0r(r1)
            X.5uD r1 = r15.A02
            if (r1 == 0) goto L_0x0313
            com.instagram.user.model.User r1 = r1.A00()
            java.lang.String r5 = r1.getId()
            X.0Oa r1 = r15.A05
            java.lang.String r19 = X.C86114wI.A0r(r1)
            r1 = 1
            X.C86104wH.A1P(r7, r1, r5)
            if (r2 == 0) goto L_0x01b4
            int r1 = r2.length()
            if (r1 == 0) goto L_0x01b4
            if (r6 == 0) goto L_0x01b4
            int r1 = r6.length()
            if (r1 == 0) goto L_0x01b4
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r2)
            java.lang.String r1 = " | "
            android.text.SpannableStringBuilder r1 = r2.append(r1)
            android.text.SpannableStringBuilder r3 = r1.append(r6)
            int r21 = X.C18210wN.A01(r8)
            X.65O r13 = new X.65O
            r16 = r7
            r18 = r5
            r20 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass3Zw.A01(r3, r13, r6)
            X.C04220Ms.A06(r3)
        L_0x0139:
            java.lang.String r2 = "destination_info_item_id"
            X.5MN r1 = new X.5MN
            r1.<init>(r3, r2, r4)
            r0.A01(r1)
        L_0x0143:
            android.content.Context r2 = r15.requireContext()
            r1 = 2131822496(0x7f1107a0, float:1.9277765E38)
            java.lang.String r4 = r2.getString(r1)
            X.0Oa r5 = r15.A0A
            X.0i6 r6 = X.AnonymousClass0wJ.A0U(r5)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36323728128221218(0x810c3d00002022, double:3.0346101599757566E-306)
            boolean r1 = X.C63803iN.A0E(r3, r6, r1)
            if (r1 == 0) goto L_0x0199
            X.5uD r1 = r15.A02
            if (r1 == 0) goto L_0x0313
            com.instagram.user.model.User r1 = r1.A00()
            java.lang.String r3 = r1.BK7()
        L_0x016d:
            java.lang.String r2 = "brand_partner_info_item_id"
            X.5MN r1 = new X.5MN
            r1.<init>(r3, r2, r4)
            r0.A01(r1)
            X.6mg r1 = r15.A01
            if (r1 == 0) goto L_0x0283
            java.util.ArrayList r1 = r1.A06
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0185:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01f3
            java.lang.Object r1 = r2.next()
            X.6jY r1 = (X.C109156jY) r1
            X.68h r1 = r1.A00
            if (r1 == 0) goto L_0x0311
            r3.add(r1)
            goto L_0x0185
        L_0x0199:
            android.content.Context r3 = r15.requireContext()
            r2 = 2131836087(0x7f113cb7, float:1.930533E38)
            X.5uD r1 = r15.A02
            if (r1 == 0) goto L_0x0313
            com.instagram.user.model.User r1 = r1.A00()
            java.lang.String r1 = r1.BK7()
            java.lang.String r3 = X.AnonymousClass0wJ.A0l(r3, r1, r2)
            X.C04220Ms.A06(r3)
            goto L_0x016d
        L_0x01b4:
            r1 = 2131832153(0x7f112d59, float:1.9297352E38)
            java.lang.String r1 = r8.getString(r1)
            android.text.SpannableStringBuilder r3 = X.C18200wM.A0E(r1)
            goto L_0x0139
        L_0x01c1:
            r1 = 2131832154(0x7f112d5a, float:1.9297354E38)
            java.lang.String r1 = r8.getString(r1)
            r6.append(r1)
            if (r4 == 0) goto L_0x009c
            int r1 = r4.length()
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = "0"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x009c
            java.lang.String r1 = "approve_sponsor_boost"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x009c
            r6.append(r2)
            android.content.Context r8 = r15.requireContext()
            long r1 = java.lang.Long.parseLong(r4)
            r4 = 2131832150(0x7f112d56, float:1.9297346E38)
            goto L_0x0095
        L_0x01f3:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r3.iterator()
        L_0x01fb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0230
            java.lang.Object r2 = r3.next()
            X.68h r1 = X.C971968h.FEED
            if (r1 != r2) goto L_0x0218
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832152(0x7f112d58, float:1.929735E38)
        L_0x0210:
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r2, r1)
            r8.add(r1)
            goto L_0x01fb
        L_0x0218:
            X.68h r1 = X.C971968h.STORIES
            if (r1 != r2) goto L_0x0224
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832158(0x7f112d5e, float:1.9297362E38)
            goto L_0x0210
        L_0x0224:
            X.68h r1 = X.C971968h.EXPLORE
            if (r1 != r2) goto L_0x01fb
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832151(0x7f112d57, float:1.9297348E38)
            goto L_0x0210
        L_0x0230:
            java.lang.String r7 = ", "
            java.lang.String r6 = " & "
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0283
            java.lang.StringBuilder r4 = X.C18200wM.A0r()
            int r3 = r8.size()
            r2 = 0
        L_0x0243:
            if (r2 >= r3) goto L_0x0268
            if (r2 <= 0) goto L_0x0262
            int r1 = r3 + -1
            if (r2 != r1) goto L_0x0264
            r4.append(r6)
        L_0x024e:
            java.lang.Object r1 = r8.get(r2)
            if (r1 == 0) goto L_0x025f
            java.lang.Object r1 = r8.get(r2)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
        L_0x025f:
            int r2 = r2 + 1
            goto L_0x0243
        L_0x0262:
            if (r2 == 0) goto L_0x024e
        L_0x0264:
            r4.append(r7)
            goto L_0x024e
        L_0x0268:
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L_0x0283
            android.content.Context r2 = r15.requireContext()
            r1 = 2131832155(0x7f112d5b, float:1.9297356E38)
            java.lang.String r3 = r2.getString(r1)
            java.lang.String r2 = "placements_info_item_id"
            X.5MN r1 = new X.5MN
            r1.<init>(r4, r2, r3)
            r0.A01(r1)
        L_0x0283:
            X.0Oa r3 = r15.A05
            java.lang.Object r2 = r3.getValue()
            java.lang.String r1 = "approve_sponsor_boost"
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 != 0) goto L_0x02a8
            X.6mg r1 = r15.A01
            if (r1 == 0) goto L_0x02a8
            android.content.Context r2 = r15.requireContext()
            r1 = 2131833622(0x7f113316, float:1.9300331E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r2, r1)
            X.199 r1 = new X.199
            r1.<init>(r2)
            r0.A01(r1)
        L_0x02a8:
            androidx.fragment.app.FragmentActivity r14 = r15.requireActivity()
            com.instagram.service.session.UserSession r6 = X.AnonymousClass0wJ.A0X(r5)
            android.content.Context r7 = r15.requireContext()
            X.0Oa r1 = r15.A07
            java.lang.String r17 = X.C86114wI.A0r(r1)
            X.5uD r1 = r15.A02
            if (r1 == 0) goto L_0x0313
            com.instagram.user.model.User r1 = r1.A00()
            java.lang.String r5 = r1.getId()
            java.lang.String r19 = X.C86114wI.A0r(r3)
            r1 = 1
            X.C18190wL.A1S(r6, r1, r5)
            r3 = 2131832148(0x7f112d54, float:1.9297342E38)
            r2 = 2131829580(0x7f11234c, float:1.9292133E38)
            java.lang.String r1 = r7.getString(r2)
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r7, r1, r3)
            android.text.SpannableStringBuilder r4 = X.C18200wM.A0E(r1)
            java.lang.String r1 = r7.getString(r2)
            int r20 = X.C18210wN.A01(r7)
            X.1yA r13 = new X.1yA
            r16 = r6
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.AnonymousClass3Zw.A01(r4, r13, r1)
            java.lang.String r3 = "description_info_item_id"
            r2 = 0
            X.5MN r1 = new X.5MN
            r1.<init>(r4, r3, r2)
            r0.A01(r1)
            X.0Oa r1 = r15.A03
            java.lang.Object r1 = r1.getValue()
            X.8wA r1 = (X.C150388wA) r1
            r1.A04(r0)
            return
        L_0x030b:
            java.lang.String r12 = "timestamp"
            goto L_0x0313
        L_0x030e:
            java.lang.String r12 = "adMediaId"
            goto L_0x0313
        L_0x0311:
            java.lang.String r12 = "placementName"
        L_0x0313:
            X.C04220Ms.A0E(r12)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5x7.A00(X.5x7):void");
    }

    public static final void A02(AnonymousClass5x7 r7, boolean z) {
        C10300i6 A0U = AnonymousClass0wJ.A0U(r7.A0A);
        String A0r = C86114wI.A0r(r7.A07);
        AnonymousClass5uD r0 = r7.A02;
        if (r0 == null) {
            C04220Ms.A0E("adInfo");
            throw null;
        }
        String id = r0.A00().getId();
        String A0r2 = C86114wI.A0r(r7.A05);
        C18180wK.A1P(A0U, 0, id);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r7, A0U), "instagram_bc_partner_promotion_action_complete"), 1710);
        C18210wN.A1A(A0I, "stop_ad");
        A0I.A0Q("is_success", Boolean.valueOf(z));
        A0I.A0T("media_id", A0r);
        A0I.A0T("prior_module", A0r2);
        A0I.A0T("sponsor_igid", id);
        A0I.Bb4();
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        this.A00 = r4;
        if (r4 != null) {
            AnonymousClass4u2.A07(r4, 2131822248);
        }
        C111036mg r0 = this.A01;
        if (r0 != null && r0.A07 && r4 != null) {
            r4.Crj(C86134wK.A0P(this, 100), R.drawable.instagram_more_horizontal_pano_outline_24).setColorFilter(C63393hP.A01(requireContext(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color));
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        User A2Y;
        int A022 = C14030oh.A02(-1956309940);
        super.onCreate(bundle);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
        String A0r = C86114wI.A0r(this.A07);
        BKU bku = (BKU) this.A06.getValue();
        if (bku == null || (A2Y = bku.A2Y()) == null) {
            str = null;
        } else {
            str = A2Y.getId();
        }
        String A0r2 = C86114wI.A0r(this.A05);
        Number number = (Number) this.A09.getValue();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(this, A0U), "instagram_bc_partner_promotion_entry"), 1712);
        A0I.A0T("media_id", A0r);
        A0I.A0T("media_type", "feed");
        A0I.A0T("sponsor_igid", str);
        A0I.A0T("prior_module", A0r2);
        if (number != null) {
            A0I.A0S("notification_type", C86144wL.A0c(number));
        }
        A0I.Bb4();
        C14030oh.A09(-693004537, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1627646838);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.branded_content_partner_promotion, viewGroup, false);
        C14030oh.A09(1559404405, A022);
        return inflate;
    }
}
