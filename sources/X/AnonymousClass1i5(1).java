package X;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.wellbeing.viewergeogating.impl.ViewerGeoGatingPluginImpl$IXTScreenExitCallback;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1i5  reason: invalid class name */
public final class AnonymousClass1i5 extends C63873iU {
    public final /* synthetic */ C156909Pv A00;

    public AnonymousClass1i5(C156909Pv r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r14) {
        int i;
        int A03 = C14030oh.A03(-2023324266);
        Object obj = r14.A00;
        if (obj != null && ((AnonymousClass1j3) obj).getErrorMessage().equals("geoblock_required")) {
            C156909Pv r6 = this.A00;
            if (C63803iN.A0E(AnonymousClass0TJ.A05, r6.A02, 36318904879944496L)) {
                AnonymousClass1U0 r5 = (AnonymousClass1U0) obj;
                String str = r5.A07;
                String str2 = r5.A01;
                String str3 = r5.A06;
                String str4 = r5.A00;
                String str5 = r5.A03;
                C683843o r10 = new C683843o(r6);
                C25786Drz A0Q = C18180wK.A0Q(r6.requireActivity(), r6.A02);
                HashMap A0y = AnonymousClass0wJ.A0y();
                if (str5 == null) {
                    str5 = "";
                }
                A0y.put("media_id", str5);
                if (str == null) {
                    str = "";
                }
                A0y.put(DialogModule.KEY_TITLE, str);
                if (str2 == null) {
                    str2 = "";
                }
                A0y.put(DevServerEntity.COLUMN_DESCRIPTION, str2);
                if (str3 == null) {
                    str3 = "";
                }
                A0y.put(C61983Wp.A00(), str3);
                if (str4 == null) {
                    str4 = "";
                }
                A0y.put("blocks_logging_data", str4);
                UserSession userSession = r6.A02;
                C04220Ms.A0B(userSession, 1);
                AnonymousClass01V.A0p.markerStart(291191452, 0);
                AnonymousClass01V.A0p.markerAnnotate(291191452, "analytics_module", r10.getModuleName());
                C63743iE A02 = C63743iE.A02("com.bloks.www.instagram.igwb.exp.geogating_viewer", A0y);
                IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
                A0N.A0S = "";
                A0N.A04 = ViewerGeoGatingPluginImpl$IXTScreenExitCallback.A00;
                AnonymousClass1c8 A022 = C62853b1.A02(A0N, A02);
                A0Q.A0B(r6);
                A0Q.A03 = A022;
                A0Q.A05();
                i = 1568082994;
                C14030oh.A0A(i, A03);
            }
        }
        C156909Pv r7 = this.A00;
        if (r7.isVisible()) {
            if (r7.A0H() != null) {
                r7.A0H().setVisibility(8);
            }
            FragmentActivity activity = r7.getActivity();
            String string = r7.requireArguments().getString("com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL");
            if (string == null) {
                string = "";
            }
            Uri A01 = C15430rJ.A01(string);
            List<String> pathSegments = A01.getPathSegments();
            if (pathSegments.size() == 3) {
                pathSegments.get(0);
                r7.A0D.post(new AnonymousClass4QL(this));
                C63733iD A023 = C63733iD.A02();
                A023.A0E = "short_url_feed_post_unavailable";
                C63733iD.A07(r7.requireContext(), A023, 2131832718);
                A023.A0C();
                C63733iD.A0A(A023);
            } else {
                List<String> pathSegments2 = A01.getPathSegments();
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r7, r7.A02), "oembed_fail_redirect_to_web"), 2446);
                boolean z = true;
                if (pathSegments2.size() <= 2 || !"p".equals(pathSegments2.get(1))) {
                    z = false;
                }
                A0I.A0Q("has_username_in_url", Boolean.valueOf(z));
                A0I.A0T("url", A01.toString());
                A0I.Bb4();
                UserSession userSession2 = r7.A02;
                Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
                makeMainSelectorActivity.setData(A01);
                if (!C10650ih.A0B(activity, makeMainSelectorActivity)) {
                    C63753iH.A03(activity, userSession2, C171209wF.A0r, A01.toString(), "feed_short_url");
                }
                if (activity != null && !activity.isFinishing()) {
                    activity.finish();
                }
            }
        }
        i = 1556622501;
        C14030oh.A0A(i, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(1264917177);
        C156909Pv r2 = this.A00;
        r2.A06 = false;
        if (r2.A0H() != null) {
            ((RefreshableListView) r2.A0H()).setIsLoading(false);
        }
        C14030oh.A0A(-725484658, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-846114381);
        C156909Pv r2 = this.A00;
        r2.A06 = true;
        if (r2.A0H() != null) {
            ((RefreshableListView) r2.A0H()).setIsLoading(true);
        }
        C14030oh.A0A(-141704152, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1156280709);
        AnonymousClass1U0 r5 = (AnonymousClass1U0) obj;
        int A032 = C14030oh.A03(-1464700946);
        if (r5 != null) {
            if (r5.A08) {
                C156909Pv r1 = this.A00;
                r1.A03 = r5.A02;
                C156909Pv.A02(r1);
            } else {
                this.A00.A0D.post(new AnonymousClass4QL(this));
            }
        }
        C14030oh.A0A(638410078, A032);
        C14030oh.A0A(428314186, A03);
    }
}
