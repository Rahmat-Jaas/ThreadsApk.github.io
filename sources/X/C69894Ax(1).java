package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5200000_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ax  reason: invalid class name and case insensitive filesystem */
public final class C69894Ax implements C83504rU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C696249i A02;
    public final /* synthetic */ String A03;

    public C69894Ax(Activity activity, Context context, C696249i r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = activity;
        this.A01 = context;
    }

    public final void Bxq() {
        AnonymousClass20N r1;
        String str;
        boolean z;
        Context context = this.A01;
        Drawable drawable = context.getDrawable(R.drawable.instagram_error_pano_outline_24);
        C63733iD A012 = C63733iD.A01();
        C63733iD.A07(context, A012, 2131827404);
        if (drawable != null) {
            A012.A0E(AnonymousClass22b.ICON);
            A012.A0D(drawable, context.getColor(R.color.direct_light_mode_glyph_color_tertiary));
        }
        C63733iD.A09(C38040KHr.A01, A012);
        C320129v r3 = C320129v.DEFAULT_PRIVACY_OPT_IN_MUTATION_FAILURE;
        C696249i r2 = this.A02;
        UserSession userSession = r2.A05;
        C209416t A04 = r2.A04();
        AnonymousClass21z r0 = null;
        if (A04 != null) {
            r1 = A04.A02;
        } else {
            r1 = null;
        }
        String valueOf = String.valueOf(r1);
        C209416t A042 = r2.A04();
        if (A042 != null) {
            str = A042.A04;
        } else {
            str = null;
        }
        String str2 = this.A03;
        boolean A002 = C62183Xq.A00(userSession);
        C209416t A043 = r2.A04();
        if (A043 != null) {
            z = A043.A05;
        } else {
            z = false;
        }
        C209416t A044 = r2.A04();
        if (A044 != null) {
            r0 = A044.A01;
        }
        C59693Lv.A01(r3, userSession, valueOf, str, str2, String.valueOf(r0), false, A002, z);
    }

    public final void onSuccess() {
        String str;
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2;
        AnonymousClass20N r0;
        boolean z;
        C696249i r4 = this.A02;
        UserSession userSession = r4.A05;
        C209416t A012 = C63073bQ.A01(userSession);
        AnonymousClass21z r3 = null;
        if (A012 != null) {
            str = A012.A04;
        } else {
            str = null;
        }
        String str2 = this.A03;
        if (((str2 == null || !str2.equals("share_sheet_share_button")) && ((str2 == null || !str2.equals("video_feed_share_button")) && (str2 == null || !str2.equals("share_later_share_button")))) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36326932173825849L)) {
            Activity activity = this.A00;
            Context context = this.A01;
            KtCSuperShape0S5200000_I2 A032 = r4.A03();
            if (A032 != null) {
                ktCSuperShape0S1200000_I2 = (KtCSuperShape0S1200000_I2) A032.A01;
            } else {
                ktCSuperShape0S1200000_I2 = null;
            }
            SpannableStringBuilder A002 = C63143c0.A00(activity, context, ktCSuperShape0S1200000_I2, userSession);
            C63733iD A013 = C63733iD.A01();
            A013.A0I = false;
            A013.A0A = A002;
            C38040KHr kHr = C38040KHr.A01;
            A013.A0I = false;
            C63733iD.A09(kHr, A013);
        }
        C320129v r5 = C320129v.DEFAULT_PRIVACY_OPT_IN_MUTATION_SUCCESS;
        C209416t A04 = r4.A04();
        if (A04 != null) {
            r0 = A04.A02;
        } else {
            r0 = null;
        }
        String valueOf = String.valueOf(r0);
        boolean A003 = C62183Xq.A00(userSession);
        C209416t A042 = r4.A04();
        if (A042 != null) {
            z = A042.A05;
        } else {
            z = false;
        }
        C209416t A043 = r4.A04();
        if (A043 != null) {
            r3 = A043.A01;
        }
        C59693Lv.A01(r5, userSession, valueOf, str, str2, String.valueOf(r3), true, A003, z);
    }
}
