package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape5S0500000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.3ht  reason: invalid class name and case insensitive filesystem */
public final class C63603ht {
    public Dialog A00;
    public AnonymousClass3Z9 A01;
    public final Activity A02;
    public final Context A03;
    public final Fragment A04;
    public final C25831Dsp A05;
    public final C28161tl A06;
    public final UserSession A07;
    public final C695949f A08;
    public final AnonymousClass3ZL A09;

    public C63603ht(Activity activity, Fragment fragment, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A04 = fragment;
        this.A07 = userSession;
        this.A02 = activity;
        this.A03 = fragment.requireContext();
        this.A06 = AnonymousClass3WS.A01(userSession);
        this.A05 = C25567Do3.A02(userSession);
        this.A09 = AnonymousClass3Zu.A03(userSession);
        this.A08 = C49252r5.A00(userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.D3Q r25, X.C63603ht r26, boolean r27, boolean r28) {
        /*
            r5 = 2
            r4 = 3
            r8 = 0
            r3 = 1
            r2 = r26
            if (r27 == 0) goto L_0x00f0
            X.49f r1 = r2.A08
            X.4wG r0 = r1.A07
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x00ed
            com.instagram.service.session.UserSession r0 = r2.A07
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r0 = X.C59583Lj.A00(r0, r1)
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r0.A00
            X.24X r0 = (X.AnonymousClass24X) r0
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x00e6
            if (r1 == r5) goto L_0x00df
            if (r1 == r4) goto L_0x00d8
            r0 = 5
            if (r1 != r0) goto L_0x00ed
            android.content.Context r1 = r2.A03
            r0 = 2131823608(0x7f110bf8, float:1.928002E38)
        L_0x0034:
            java.lang.String r9 = r1.getString(r0)
        L_0x0038:
            com.instagram.service.session.UserSession r3 = r2.A07
            r6 = 2131232913(0x7f080891, float:1.8081949E38)
            r5 = 2131100058(0x7f06019a, float:1.7812487E38)
            r1 = 2131100057(0x7f060199, float:1.7812485E38)
            r4 = 0
            com.instagram.ui.primer.ColorTint r0 = new com.instagram.ui.primer.ColorTint
            r0.<init>(r4, r5, r1)
            com.instagram.ui.primer.TitleIcon r11 = new com.instagram.ui.primer.TitleIcon
            r11.<init>(r0, r6)
            android.content.Context r1 = r2.A03
            r0 = 2131823610(0x7f110bfa, float:1.9280025E38)
            java.lang.String r10 = X.AnonymousClass0wJ.A0k(r1, r0)
            r5 = 2131232829(0x7f08083d, float:1.8081778E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r0 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r0.<init>(r5)
            r20 = 0
            java.lang.Integer r7 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r6 = new com.instagram.ui.primer.InfoItem
            r6.<init>(r0, r7, r10, r8)
            r0 = 2131823611(0x7f110bfb, float:1.9280027E38)
            java.lang.String r5 = X.AnonymousClass0wJ.A0k(r1, r0)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            com.instagram.ui.primer.InfoItem r5 = X.C18190wL.A0Y(r7, r5, r0)
            if (r9 == 0) goto L_0x0081
            r0 = 2131232607(0x7f08075f, float:1.8081328E38)
            com.instagram.ui.primer.InfoItem r8 = X.C18190wL.A0Y(r7, r9, r0)
        L_0x0081:
            com.instagram.ui.primer.InfoItem[] r0 = new com.instagram.ui.primer.InfoItem[]{r6, r5, r8}
            java.util.List r15 = X.AnonymousClass8AP.A0A(r0)
            r0 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r13 = X.AnonymousClass0wJ.A0k(r1, r0)
            r0 = 2131823612(0x7f110bfc, float:1.9280029E38)
            java.lang.String r14 = X.AnonymousClass0wJ.A0k(r1, r0)
            java.lang.String r12 = "ClipsPanavisionDialogNuxController"
            r16 = 2131823624(0x7f110c08, float:1.9280053E38)
            com.instagram.ui.primer.PrimerBottomSheetConfig r10 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r18 = r4
            r19 = r4
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r24 = r28
            r22 = r28 ^ 1
            r21 = 60
            X.3Z9 r4 = new X.3Z9
            r19 = r10
            r23 = r22
            r17 = r4
            r18 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r3 = 26
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r5 = r25
            r0.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r4, (java.lang.Object) r2)
            r4.A01 = r0
            r0 = 67
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r2, r5, r0)
            r4.A02 = r0
            r2.A01 = r4
            r4.A03(r1)
            if (r28 != 0) goto L_0x00d7
            A07(r2)
        L_0x00d7:
            return
        L_0x00d8:
            android.content.Context r1 = r2.A03
            r0 = 2131823606(0x7f110bf6, float:1.9280016E38)
            goto L_0x0034
        L_0x00df:
            android.content.Context r1 = r2.A03
            r0 = 2131823607(0x7f110bf7, float:1.9280018E38)
            goto L_0x0034
        L_0x00e6:
            android.content.Context r1 = r2.A03
            r0 = 2131823609(0x7f110bf9, float:1.9280022E38)
            goto L_0x0034
        L_0x00ed:
            r9 = r8
            goto L_0x0038
        L_0x00f0:
            android.content.Context r1 = r2.A03
            r0 = 2131823621(0x7f110c05, float:1.9280047E38)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63603ht.A05(X.D3Q, X.3ht, boolean, boolean):void");
    }

    public static final Boolean A00(C63603ht r3) {
        boolean z;
        AnonymousClass3ZL r2 = r3.A09;
        boolean A1X = C18190wL.A1X(r2.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
        boolean A082 = r2.A08();
        if (!A1X || !AnonymousClass0wJ.A1X(r3.A08.A07.getValue())) {
            UserSession userSession = r3.A07;
            if (!C67343zO.A07(userSession) || !C62183Xq.A00(userSession) || AnonymousClass3Zu.A03(userSession).A08()) {
                if (!A082) {
                    return null;
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    public static void A01(D3Q d3q, C63603ht r5, Boolean bool) {
        A04(d3q, r5, bool, C63803iN.A0C(AnonymousClass0TJ.A05, r5.A07, 36882606452703526L));
    }

    public static final void A02(D3Q d3q, C63603ht r8, Boolean bool) {
        C25831Dsp dsp = r8.A05;
        dsp.A1a(D3P.A1F, d3q, bool);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(dsp.A0W, "ig_camera_clips_open_controls"), 881);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(C171799zz.A0L, "entry_point");
            A0I.A0T("camera_session_id", dsp.A0K);
            A0I.A0O(AnonymousClass6BO.ACTION, "event_type");
            C18240wQ.A15(A0I, "clips_settings");
            C18240wQ.A13(d3q, A0I);
            A0I.A0Q("is_crosspost", bool);
            A0I.Bb4();
        }
        UserSession userSession = r8.A07;
        Class<ModalActivity> cls = ModalActivity.class;
        Fragment fragment = r8.A04;
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString(DialogModule.KEY_TITLE, r8.A03.getResources().getString(2131823368));
        String str = dsp.A0K;
        if (str != null) {
            requireArguments.putString("camera_session_id", str);
        }
        C63863iT A022 = C63863iT.A02(fragment.requireActivity(), requireArguments, userSession, cls, "clips_account_settings");
        A022.A0F();
        A022.A0J(fragment, 9785);
    }

    public static final void A03(D3Q d3q, C63603ht r3, Boolean bool) {
        r3.A05.A1a(D3P.A1E, d3q, bool);
    }

    public static final void A04(D3Q d3q, C63603ht r5, Boolean bool, String str) {
        r5.A05.A1a(D3P.A1D, d3q, bool);
        AnonymousClass3Xr r4 = SimpleWebViewActivity.A01;
        Context context = r5.A03;
        AnonymousClass3Xr.A01(context, r5.A07, r4, new C36941JhV(str), context.getString(2131829574));
    }

    public static final void A06(D3Q d3q, C63603ht r21, boolean z, boolean z2) {
        Context context;
        int i;
        InfoItem infoItem;
        AnonymousClass0MJ r3 = new AnonymousClass0MJ();
        C63603ht r1 = r21;
        if (z) {
            C695949f r4 = r1.A08;
            if (AnonymousClass0wJ.A1X(r4.A07.getValue())) {
                KtCSuperShape0S4110000_I2 A002 = C59583Lj.A00(r1.A07, r4);
                if (A002 != null) {
                    int ordinal = ((AnonymousClass24X) A002.A00).ordinal();
                    if (ordinal == 1) {
                        context = r1.A03;
                        i = 2131823620;
                    } else if (ordinal == 2) {
                        context = r1.A03;
                        i = 2131823618;
                    } else if (ordinal == 3) {
                        context = r1.A03;
                        i = 2131823617;
                    } else if (ordinal != 5) {
                        infoItem = null;
                        r3.A00 = infoItem;
                    } else {
                        context = r1.A03;
                        i = 2131823619;
                    }
                    infoItem = new InfoItem(C18230wP.A0b(), C18230wP.A0e(), AnonymousClass0wJ.A0k(context, i), (String) null);
                    r3.A00 = infoItem;
                }
                UserSession userSession = r1.A07;
                TitleIcon titleIcon = new TitleIcon(new ColorTint(0, R.color.igds_creation_tools_red, R.color.igds_creation_tools_purple), R.drawable.instagram_reels_outline_96);
                Context context2 = r1.A03;
                String A0k = AnonymousClass0wJ.A0k(context2, 2131823601);
                IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
                Integer A0e = C18230wP.A0e();
                AnonymousClass3Z9 r5 = new AnonymousClass3Z9(userSession, new PrimerBottomSheetConfig(titleIcon, "ClipsPanavisionDialogNuxController", AnonymousClass0wJ.A0k(context2, 2131831976), AnonymousClass0wJ.A0k(context2, 2131827999), AnonymousClass8AP.A0A(new InfoItem[]{new InfoItem(simpleIconConfig, A0e, A0k, (String) null), C18190wL.A0Y(A0e, AnonymousClass0wJ.A0k(context2, 2131823602), R.drawable.instagram_user_circle_pano_outline_24), C18190wL.A0Y(A0e, AnonymousClass0wJ.A0k(context2, 2131823616), R.drawable.instagram_remix_pano_outline_24), (InfoItem) r3.A00}), 2131823624, false, false, false), C18180wK.A0B(context2), 284, true, true, false);
                Boolean A003 = A00(r1);
                D3Q d3q2 = d3q;
                r5.A00 = new IDxCListenerShape5S0500000_1_I2(1, d3q2, r3, A003, r1, r5);
                r5.A01 = new IDxCListenerShape15S0400000_1_I2(6, r5, r1, d3q2, A003);
                r5.A02 = new IDxCListenerShape15S0400000_1_I2(7, r5, r1, d3q2, A003);
                r1.A01 = r5;
                r5.A03(context2);
                A07(r1);
            }
        }
        if (z2) {
            context = r1.A03;
            i = 2131823615;
        } else {
            UserSession userSession2 = r1.A07;
            if (C67343zO.A07(userSession2) && C62183Xq.A00(userSession2) && !AnonymousClass3Zu.A03(userSession2).A08()) {
                context = r1.A03;
                i = 2131823621;
            }
            UserSession userSession3 = r1.A07;
            TitleIcon titleIcon2 = new TitleIcon(new ColorTint(0, R.color.igds_creation_tools_red, R.color.igds_creation_tools_purple), R.drawable.instagram_reels_outline_96);
            Context context22 = r1.A03;
            String A0k2 = AnonymousClass0wJ.A0k(context22, 2131823601);
            IconConfig.SimpleIconConfig simpleIconConfig2 = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer A0e2 = C18230wP.A0e();
            AnonymousClass3Z9 r52 = new AnonymousClass3Z9(userSession3, new PrimerBottomSheetConfig(titleIcon2, "ClipsPanavisionDialogNuxController", AnonymousClass0wJ.A0k(context22, 2131831976), AnonymousClass0wJ.A0k(context22, 2131827999), AnonymousClass8AP.A0A(new InfoItem[]{new InfoItem(simpleIconConfig2, A0e2, A0k2, (String) null), C18190wL.A0Y(A0e2, AnonymousClass0wJ.A0k(context22, 2131823602), R.drawable.instagram_user_circle_pano_outline_24), C18190wL.A0Y(A0e2, AnonymousClass0wJ.A0k(context22, 2131823616), R.drawable.instagram_remix_pano_outline_24), (InfoItem) r3.A00}), 2131823624, false, false, false), C18180wK.A0B(context22), 284, true, true, false);
            Boolean A0032 = A00(r1);
            D3Q d3q22 = d3q;
            r52.A00 = new IDxCListenerShape5S0500000_1_I2(1, d3q22, r3, A0032, r1, r52);
            r52.A01 = new IDxCListenerShape15S0400000_1_I2(6, r52, r1, d3q22, A0032);
            r52.A02 = new IDxCListenerShape15S0400000_1_I2(7, r52, r1, d3q22, A0032);
            r1.A01 = r52;
            r52.A03(context22);
            A07(r1);
        }
        infoItem = new InfoItem(C18230wP.A0b(), C18230wP.A0e(), AnonymousClass0wJ.A0k(context, i), (String) null);
        r3.A00 = infoItem;
        UserSession userSession32 = r1.A07;
        TitleIcon titleIcon22 = new TitleIcon(new ColorTint(0, R.color.igds_creation_tools_red, R.color.igds_creation_tools_purple), R.drawable.instagram_reels_outline_96);
        Context context222 = r1.A03;
        String A0k22 = AnonymousClass0wJ.A0k(context222, 2131823601);
        IconConfig.SimpleIconConfig simpleIconConfig22 = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
        Integer A0e22 = C18230wP.A0e();
        AnonymousClass3Z9 r522 = new AnonymousClass3Z9(userSession32, new PrimerBottomSheetConfig(titleIcon22, "ClipsPanavisionDialogNuxController", AnonymousClass0wJ.A0k(context222, 2131831976), AnonymousClass0wJ.A0k(context222, 2131827999), AnonymousClass8AP.A0A(new InfoItem[]{new InfoItem(simpleIconConfig22, A0e22, A0k22, (String) null), C18190wL.A0Y(A0e22, AnonymousClass0wJ.A0k(context222, 2131823602), R.drawable.instagram_user_circle_pano_outline_24), C18190wL.A0Y(A0e22, AnonymousClass0wJ.A0k(context222, 2131823616), R.drawable.instagram_remix_pano_outline_24), (InfoItem) r3.A00}), 2131823624, false, false, false), C18180wK.A0B(context222), 284, true, true, false);
        Boolean A00322 = A00(r1);
        D3Q d3q222 = d3q;
        r522.A00 = new IDxCListenerShape5S0500000_1_I2(1, d3q222, r3, A00322, r1, r522);
        r522.A01 = new IDxCListenerShape15S0400000_1_I2(6, r522, r1, d3q222, A00322);
        r522.A02 = new IDxCListenerShape15S0400000_1_I2(7, r522, r1, d3q222, A00322);
        r1.A01 = r522;
        r522.A03(context222);
        A07(r1);
    }

    public static final void A07(C63603ht r3) {
        AnonymousClass0wJ.A13(C28161tl.A02(r3.A06), "feed_post_new_post_capture_nux", true);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(r3.A09), "PREFERENCE_HAS_SEEN_PANAVISION_POST_CAPTURE_CONTENT_LIQUIDITY_NUX", true);
    }
}
