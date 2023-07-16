package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape177S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.facebook.redex.IDxSListenerShape454S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.4Ok  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72504Ok implements Runnable {
    public final /* synthetic */ ESO A00;

    public /* synthetic */ C72504Ok(ESO eso) {
        this.A00 = eso;
    }

    public final void run() {
        Drawable drawable;
        Drawable drawable2;
        C25831Dsp dsp;
        boolean z;
        C63603ht r4 = this.A00.A0o;
        D3Q d3q = D3Q.POST_CAPTURE;
        Dialog dialog = r4.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        AnonymousClass3Z9 r0 = r4.A01;
        if (r0 != null) {
            r0.A02();
        }
        C04620Ok r9 = C06810aP.A01;
        UserSession userSession = r4.A07;
        C169839tz A0a = C18200wM.A0a(userSession, r9);
        C169839tz r8 = C169839tz.PrivacyStatusPublic;
        boolean A1Z = C18180wK.A1Z(A0a, r8);
        if (C67343zO.A06(userSession)) {
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319656499483944L);
            if (C18180wK.A1Z(C18200wM.A0a(userSession, r9), r8)) {
                if (A0E) {
                    C37032Jj9 A0L = C18210wN.A0L(userSession);
                    A0L.A0T = false;
                    A0L.A0U = false;
                    A0L.A0c = true;
                    A0L.A0a = false;
                    C37383Jqm A002 = A0L.A00();
                    Boolean A003 = C63603ht.A00(r4);
                    Bundle A0E2 = AnonymousClass0wJ.A0E(userSession);
                    AnonymousClass1cY r2 = new AnonymousClass1cY();
                    r2.setArguments(A0E2);
                    r2.A04 = C18180wK.A0B(r4.A03);
                    r2.A00 = new IDxCListenerShape41S0300000_1_I2(27, (Object) d3q, (Object) A003, (Object) r4);
                    r2.A01 = new IDxCListenerShape15S0400000_1_I2(5, A003, r4, A002, d3q);
                    r2.A02 = new IDxCListenerShape41S0300000_1_I2(28, (Object) d3q, (Object) A003, (Object) r4);
                    C37383Jqm.A00(r4.A04.requireActivity(), r2, A002);
                } else {
                    C67343zO r7 = C67343zO.A01;
                    if (r7.A09(userSession)) {
                        C63603ht.A06(d3q, r4, C18190wL.A1X(r4.A09.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"), false);
                    } else if (!r7.A09(userSession) && C67343zO.A06(userSession) && C34732Kr.A00(userSession, true)) {
                        C63603ht.A06(d3q, r4, false, r4.A09.A08());
                    }
                }
                dsp = r4.A05;
                z = C63603ht.A00(r4);
            } else if (C67343zO.A01.A09(userSession)) {
                if (C67343zO.A07(userSession)) {
                    C63603ht.A05(d3q, r4, false, A0E);
                } else if (C18190wL.A1X(r4.A09.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED")) {
                    C63603ht.A05(d3q, r4, true, A0E);
                } else {
                    Context context = r4.A03;
                    C25828Dsm A0W = C18190wL.A0W(context);
                    Drawable drawable3 = context.getDrawable(R.drawable.instagram_reels_outline_96);
                    if (drawable3 != null) {
                        drawable2 = C19587Ayn.A05(context, drawable3, context.getColor(R.color.igds_creation_tools_red), context.getColor(R.color.igds_creation_tools_purple));
                    } else {
                        drawable2 = null;
                    }
                    A0W.A0h(drawable2);
                    A0W.A0r(true);
                    A0W.A0M(new IDxCListenerShape177S0200000_1_I2(2, r4, d3q));
                    A0W.A0L(2131823624);
                    A0W.A0K(2131823605);
                    C18190wL.A1R(A0W, d3q, r4, 19, 2131831976);
                    A0W.A0f(new IDxSListenerShape454S0100000_1_I2(r4, 2));
                    A0W.A0N(new IDxCListenerShape77S0200000_1_I2(20, (Object) d3q, (Object) r4), 2131829574);
                    Dialog A0G = A0W.A0G();
                    r4.A00 = A0G;
                    if (!r4.A02.isFinishing()) {
                        C13950oZ.A00(A0G);
                    }
                }
                dsp = r4.A05;
                z = true;
            } else {
                return;
            }
            dsp.A1r(d3q, z, "panavideo_share_sheet");
            return;
        }
        if (A1Z) {
            TitleIcon titleIcon = new TitleIcon(new ColorTint(0, R.color.igds_creation_tools_red, R.color.igds_creation_tools_purple), R.drawable.instagram_reels_outline_96);
            Context context2 = r4.A03;
            String A0k = AnonymousClass0wJ.A0k(context2, 2131823601);
            IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer A0e = C18230wP.A0e();
            UserSession userSession2 = userSession;
            AnonymousClass3Z9 r82 = new AnonymousClass3Z9(userSession2, new PrimerBottomSheetConfig(titleIcon, "ClipsPanavisionDialogNuxController", AnonymousClass0wJ.A0k(context2, 2131831976), AnonymousClass0wJ.A0k(context2, 2131827999), AnonymousClass8AP.A0A(new InfoItem[]{new InfoItem(simpleIconConfig, A0e, A0k, (String) null), C18190wL.A0Y(A0e, AnonymousClass0wJ.A0k(context2, 2131823614), R.drawable.instagram_user_circle_pano_outline_24), C18190wL.A0Y(A0e, AnonymousClass0wJ.A0k(context2, 2131823616), R.drawable.instagram_remix_pano_outline_24)}), 2131823624, false, false, false), context2.getString(2131823613), 284, true, true, false);
            r82.A00 = new IDxCListenerShape41S0300000_1_I2(23, (Object) d3q, (Object) r82, (Object) r4);
            r82.A01 = new IDxCListenerShape41S0300000_1_I2(24, (Object) d3q, (Object) r82, (Object) r4);
            r82.A02 = new IDxCListenerShape41S0300000_1_I2(25, (Object) d3q, (Object) r82, (Object) r4);
            r4.A01 = r82;
            r82.A03(context2);
            r4.A05.A1r(d3q, (Boolean) null, "panavideo_share_sheet");
        } else {
            Context context3 = r4.A03;
            C25828Dsm A0W2 = C18190wL.A0W(context3);
            Drawable drawable4 = context3.getDrawable(R.drawable.instagram_reels_outline_96);
            if (drawable4 != null) {
                drawable = C19587Ayn.A05(context3, drawable4, context3.getColor(R.color.igds_creation_tools_red), context3.getColor(R.color.igds_creation_tools_purple));
            } else {
                drawable = null;
            }
            A0W2.A0h(drawable);
            C18190wL.A1R(A0W2, d3q, r4, 17, 2131831976);
            A0W2.A0r(true);
            A0W2.A0M(new IDxCListenerShape177S0200000_1_I2(1, r4, d3q));
            A0W2.A0L(2131823622);
            A0W2.A0K(2131823605);
            A0W2.A0N(new IDxCListenerShape77S0200000_1_I2(18, (Object) d3q, (Object) r4), 2131829574);
            Dialog A0G2 = A0W2.A0G();
            if (!r4.A02.isFinishing()) {
                r4.A00 = A0G2;
                C13950oZ.A00(A0G2);
                r4.A05.A1r(d3q, (Boolean) null, "panavideo_share_sheet");
            }
        }
        AnonymousClass0wJ.A13(C28161tl.A02(r4.A06), "feed_post_new_post_capture_nux", true);
    }
}
