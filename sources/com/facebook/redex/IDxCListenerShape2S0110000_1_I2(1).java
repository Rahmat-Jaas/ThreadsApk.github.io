package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1aM;
import X.AnonymousClass1bI;
import X.AnonymousClass1c0;
import X.AnonymousClass1oT;
import X.AnonymousClass1wr;
import X.AnonymousClass1x2;
import X.AnonymousClass253;
import X.AnonymousClass2A0;
import X.AnonymousClass2A1;
import X.AnonymousClass2A3;
import X.AnonymousClass2AB;
import X.AnonymousClass2AH;
import X.AnonymousClass2MW;
import X.AnonymousClass2O0;
import X.AnonymousClass2O3;
import X.AnonymousClass3C6;
import X.AnonymousClass3F8;
import X.AnonymousClass3J5;
import X.AnonymousClass3YR;
import X.AnonymousClass47D;
import X.AnonymousClass4A9;
import X.C04220Ms;
import X.C04530Oa;
import X.C130667qT;
import X.C13330nS;
import X.C14030oh;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C19370zl;
import X.C195210b;
import X.C22771Zk;
import X.C22981bi;
import X.C25237DiI;
import X.C25786Drz;
import X.C27952Ew2;
import X.C29161xC;
import X.C303820v;
import X.C30938GbW;
import X.C34640IcN;
import X.C37032Jj9;
import X.C37383Jqm;
import X.C37408JrQ;
import X.C40326Lcg;
import X.C58753Hb;
import X.C59713Ma;
import X.C60113Ns;
import X.C62423Zt;
import X.C62653aT;
import X.C62793ak;
import X.C63173fJ;
import X.C63203gz;
import X.C63213h0;
import X.C63263h8;
import X.C63813iO;
import X.C63843iR;
import X.C67333zN;
import X.C695048u;
import X.IVw;
import X.K9R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.service.session.UserSession;
import com.instagram.universalcreationsheet.UniversalCreationMenuFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S2201000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1201000_I2_1;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IDxCListenerShape2S0110000_1_I2 implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxCListenerShape2S0110000_1_I2(C58753Hb r2) {
        this.A02 = 7;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        AnonymousClass2AB r0;
        int A05;
        int i;
        String str;
        String str2;
        String obj;
        switch (this.A02) {
            case 0:
                A05 = C14030oh.A05(1910455701);
                C22981bi r4 = (C22981bi) this.A00;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r4.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Be5(new C37408JrQ("create_post", r4.A02, "continue", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
                }
                if (this.A01) {
                    AnonymousClass3C6 r5 = new AnonymousClass3C6(r4, r4.A01);
                    Bundle A06 = C18180wK.A06();
                    UserSession userSession = r5.A04;
                    C18190wL.A13(A06, userSession.token);
                    A06.putBoolean("show_only_main_options", true);
                    boolean A062 = C67333zN.A06(userSession, 36315808208522043L, true);
                    boolean A063 = C67333zN.A06(userSession, 36315808208587580L, true);
                    A06.putBoolean("hide_reels", !A062);
                    A06.putBoolean("hide_stories", !A063);
                    UniversalCreationMenuFragment universalCreationMenuFragment = new UniversalCreationMenuFragment();
                    universalCreationMenuFragment.setArguments(A06);
                    universalCreationMenuFragment.A02 = r5.A03;
                    C37032Jj9 A0Y = C18200wM.A0Y(userSession, false);
                    C18250wR.A1A(A0Y, r5, 0);
                    C34640IcN icN = r5.A02;
                    r5.A00 = C37383Jqm.A00(icN.requireActivity(), universalCreationMenuFragment, C18230wP.A0X(icN, A0Y, 2131837287));
                } else {
                    Intent A04 = C18250wR.A04(r4.getContext(), MediaCaptureActivity.class);
                    C18230wP.A12(A04, r4.A01);
                    C18230wP.A0O().A0B(A04, r4, 100);
                }
                i = 1416790599;
                break;
            case 1:
                A05 = C14030oh.A05(988759346);
                AnonymousClass1bI r6 = (AnonymousClass1bI) this.A00;
                C19370zl r42 = r6.A02;
                boolean z = this.A01;
                if (z) {
                    str2 = "professional";
                } else {
                    str2 = "personal";
                }
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("selected_account_type", str2);
                r42.A00.Be5(new C37408JrQ("personal_or_professional_account_selection", r42.A01, "continue", (String) null, (String) null, (Map) null, A0y, (Map) null));
                if (z) {
                    AnonymousClass0wJ.A0R(r6.A01).A0J = true;
                    ((BusinessConversionActivity) r6.A01).Bel((Bundle) null);
                    C19370zl r2 = r6.A02;
                    r2.A00.BcE(new C37408JrQ("personal_or_professional_account_selection", r2.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
                } else {
                    UserSession userSession2 = r6.A03;
                    AnonymousClass3YR.A00.A03(r6.A00, userSession2.multipleAccountHelper.A0C(r6.A00, userSession2, "settings", true).A00, r6.A03, false);
                }
                i = -516312222;
                break;
            case 2:
                A05 = C14030oh.A05(830789054);
                C29161xC r1 = (C29161xC) this.A00;
                C195210b A0C = C29161xC.A0C(r1);
                FragmentActivity requireActivity = r1.requireActivity();
                boolean z2 = this.A01;
                AnonymousClass1oT r22 = A0C.A05;
                if (z2) {
                    str = "RESET_PIN_CLICK";
                } else {
                    str = "CREATE_PIN_CLICK";
                }
                r22.A02(str);
                AnonymousClass2MW.A00(A0C.A07).A01(requireActivity, C303820v.FULLSCREEN_MODAL, AnonymousClass006.A0u, AnonymousClass006.A0j);
                i = 964033587;
                break;
            case 3:
                A05 = C14030oh.A05(-363216285);
                C22771Zk r3 = (C22771Zk) this.A00;
                boolean z3 = this.A01;
                C25786Drz A0Q = C18180wK.A0Q(r3.requireActivity(), AnonymousClass0wJ.A0U(r3.A07));
                AnonymousClass2O0.A00().A00();
                String A0j = C18220wO.A0j(r3);
                AnonymousClass253 r43 = AnonymousClass253.INVITED;
                AnonymousClass1aM r32 = new AnonymousClass1aM();
                Bundle A064 = C18180wK.A06();
                A064.putString("event_id", A0j);
                A064.putSerializable("response_page_type", r43);
                A064.putBoolean("is_private", z3);
                C18180wK.A0x(A064, r32, A0Q);
                i = -243109684;
                break;
            case 4:
                A05 = C14030oh.A05(2123828582);
                AnonymousClass1aM r33 = (AnonymousClass1aM) this.A00;
                boolean z4 = this.A01;
                C04530Oa r12 = r33.A04;
                if (z4) {
                    C62793ak A0N = C18200wM.A0N(r12);
                    String string = r33.requireArguments().getString("event_id");
                    String A002 = AnonymousClass2O3.A00(AnonymousClass253.INVITED);
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S2201000_I2((Object) A0N, A002, string, (C146958n9) null, 9), AnonymousClass3J5.A00(A0N), 3);
                } else {
                    C62793ak A0N2 = C18200wM.A0N(r12);
                    String string2 = r33.requireArguments().getString("event_id");
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1201000_I2_1(A0N2, string2, (C146958n9) null, 7), AnonymousClass3J5.A00(A0N2), 3);
                }
                i = 336425045;
                break;
            case 5:
                A05 = C14030oh.A05(330019102);
                if (this.A01) {
                    AnonymousClass1wr r44 = (AnonymousClass1wr) this.A00;
                    C18180wK.A0x(C62653aT.A00(r44), new AnonymousClass1c0(), C18180wK.A0Q(r44.requireActivity(), AnonymousClass0wJ.A0U(r44.A02)));
                } else {
                    Fragment fragment = (Fragment) this.A00;
                    C63813iO.A0B(fragment.requireContext(), fragment.getString(2131837102));
                }
                i = 1078116847;
                break;
            case 6:
                C14030oh.A05(-341625262);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A00;
                UserSession userSession3 = editProfileFieldsController.A06;
                C695048u r23 = (C695048u) userSession3.A01(C695048u.class, new KtLambdaShape95S0100000_I2_75(userSession3, 5));
                boolean z5 = this.A01;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r23.A02, "instagram_ibc_pinned_channel_settings_actions"), 1831);
                boolean A1U = AnonymousClass0wJ.A1U(A0I);
                if (z5) {
                    if (A1U) {
                        r23.A00 = C18180wK.A0e();
                        AnonymousClass2AH.A02(A0I);
                        AnonymousClass2A3.A00(C40326Lcg.A03, A0I, "source");
                        r0 = AnonymousClass2AB.A0J;
                    }
                    C60113Ns.A01(editProfileFieldsController.A03(), userSession3);
                    throw null;
                }
                if (A1U) {
                    r23.A00 = C18180wK.A0e();
                    AnonymousClass2AH.A02(A0I);
                    AnonymousClass2A3.A00(C40326Lcg.A03, A0I, "source");
                    r0 = AnonymousClass2AB.A0A;
                }
                C60113Ns.A01(editProfileFieldsController.A03(), userSession3);
                throw null;
                C18220wO.A1D(r0, A0I);
                A0I.A0T("actor_id", r23.A03.getUserId());
                A0I.A0S("profile_user_igid", Long.valueOf(r23.A01));
                A0I.A0Q("is_test_user", C18190wL.A0Z(A0I, "consistent_thread_fbid", "", false));
                A0I.A0T(C63213h0.A01(106, 10, 104), r23.A00);
                A0I.Bb4();
                C60113Ns.A01(editProfileFieldsController.A03(), userSession3);
                throw null;
            default:
                A05 = C14030oh.A05(-1736676081);
                if (!this.A01) {
                    C58753Hb r45 = (C58753Hb) this.A00;
                    UserSession userSession4 = r45.A05;
                    C62423Zt.A02(userSession4);
                    AnonymousClass2A1 r8 = AnonymousClass2A1.A02;
                    AnonymousClass2A0 r52 = AnonymousClass2A0.A02;
                    String userId = userSession4.getUserId();
                    if (!(userId == null || userId.length() == 0)) {
                        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession4), "fxcal_settings_product"), 694);
                        A0I2.A0S("viewer_account_id", AnonymousClass0wJ.A0d(userSession4.getUserId()));
                        C18220wO.A1D(r8, A0I2);
                        A0I2.A0O(r52, "entry_point");
                        A0I2.Bb4();
                    }
                    C59713Ma.A01(userSession4, true);
                    this.A01 = true;
                    AnonymousClass01V r24 = ((AnonymousClass3F8) r45.A09.getValue()).A00;
                    r24.markerStart(857808852);
                    r24.markerAnnotate(857808852, "node_identifier", (String) null);
                    AnonymousClass1x2 r34 = r45.A06;
                    C130667qT A022 = C130667qT.A02(r34, userSession4, (C30938GbW) null);
                    K9R k9r = K9R.A00;
                    IVw iVw = new IVw(k9r);
                    iVw.A04("entrypoint", "app_settings");
                    iVw.A03("cds_client_value", C59713Ma.A00(userSession4));
                    if (C63173fJ.A05(AnonymousClass0TJ.A05, 18308457740377607L)) {
                        Context context = r45.A01;
                        IgFragmentActivity igFragmentActivity = r45.A03;
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        A0v.addAll(C63843iR.A0B(userSession4, ""));
                        A0v.addAll(C63843iR.A01(context, igFragmentActivity, userSession4, ""));
                        C04220Ms.A0B(igFragmentActivity, 2);
                        "".equals("active_account");
                        A0v.addAll(C63843iR.A03(context, userSession4, "ig_android_access_library_fx_fetch_active_msgr_token"));
                        "".equals("active_account");
                        A0v.addAll(C63843iR.A04(context, userSession4, "ig_android_access_library_fx_fetch_active_twilight_token"));
                        JSONArray A0i = C18250wR.A0i();
                        for (Object next : A0v) {
                            C04220Ms.A0C(next, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) next;
                            JSONObject A0y2 = C18230wP.A0y();
                            try {
                                Iterator A0z = AnonymousClass0wJ.A0z(map);
                                while (A0z.hasNext()) {
                                    Map.Entry A0o = C18180wK.A0o(A0z);
                                    A0y2.put(C18200wM.A0p(A0o), A0o.getValue());
                                }
                                A0i.put(A0y2);
                            } catch (JSONException unused) {
                                obj = C18250wR.A0i().toString();
                            }
                        }
                        obj = A0i.toString();
                        iVw.A04("native_auth_tokens", obj);
                    }
                    AnonymousClass4A9 A003 = C63263h8.A00(userSession4, "com.bloks.www.fxcal.settings.async", C63203gz.A03("params", C18180wK.A0M(k9r, iVw).toString()));
                    AnonymousClass4A9.A02(A003, A022, this, r45, 8);
                    r34.registerLifecycleListener(new AnonymousClass47D(this, r45, r34.scheduleAndGetLoaderId(A003)));
                    i = 602190768;
                    break;
                } else {
                    i = -1715034220;
                    break;
                }
        }
        C14030oh.A0C(i, A05);
    }

    public IDxCListenerShape2S0110000_1_I2(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }
}
