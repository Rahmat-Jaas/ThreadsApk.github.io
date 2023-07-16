package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass15C;
import X.AnonymousClass1YS;
import X.AnonymousClass1dU;
import X.AnonymousClass25l;
import X.AnonymousClass2QD;
import X.AnonymousClass3iG;
import X.AnonymousClass49Y;
import X.AnonymousClass7Ko;
import X.BKU;
import X.C04220Ms;
import X.C10300i6;
import X.C11630kW;
import X.C13330nS;
import X.C14030oh;
import X.C15680ri;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C20066BMj;
import X.C25791Ds4;
import X.C25828Dsm;
import X.C307522u;
import X.C31155GhB;
import X.C32165H8c;
import X.C34832Lb;
import X.C36928JhH;
import X.C61713Va;
import X.C62423Zt;
import X.C62733ac;
import X.C62853b1;
import X.C63203gz;
import X.C63533hk;
import X.C63723iC;
import X.C63743iE;
import X.C63813iO;
import X.C63863iT;
import X.C67033yl;
import X.C67243zD;
import X.C67463zb;
import X.C67473zc;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.modal.ModalActivity;
import com.instagram.model.venue.Venue;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

public class IDxCListenerShape5S1300000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxCListenerShape5S1300000_1_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A03 = str;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A04) {
            case 0:
                A05 = C14030oh.A05(-2129147193);
                Context context = (Context) this.A00;
                C10300i6 r10 = (C10300i6) this.A02;
                Object obj = this.A01;
                String str = this.A03;
                IDxACallbackShape15S0300000_1_I2 iDxACallbackShape15S0300000_1_I2 = new IDxACallbackShape15S0300000_1_I2(3, obj, (Object) r10, (Object) context);
                C67463zb A002 = C67463zb.A00();
                GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
                GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, C18180wK.A0e(), "client_mutation_id");
                GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, str, "unpublished_content_id");
                C67463zb.A01(gQLCallInputCInputShape1S0000000, A002);
                AnonymousClass7Ko.A0B(true);
                C32165H8c A012 = C67473zc.A01(A002, iDxACallbackShape15S0300000_1_I2, r10, AnonymousClass15C.class, "ContentSchedulingPublishMutation");
                C63813iO.A03(context, (String) null, 2131824391, 0);
                C31155GhB.A03(A012);
                i = -713384579;
                break;
            case 1:
                A05 = C14030oh.A05(190128060);
                C67243zD.A03((C10300i6) this.A02, this.A03, "claim_page", "not_now");
                Fragment fragment = (Fragment) this.A01;
                if (fragment instanceof DialogInterface.OnCancelListener) {
                    ((DialogInterface.OnCancelListener) fragment).onCancel((Dialog) this.A00);
                }
                C18250wR.A1C(this.A00);
                i = -1537018704;
                break;
            case 2:
                A05 = C14030oh.A05(1737246984);
                AnonymousClass1dU r5 = (AnonymousClass1dU) this.A02;
                AnonymousClass49Y r4 = r5.A00;
                if (r4 != null) {
                    r4.A06(C307522u.UNSPECIFIED, this.A03, 0);
                    IgdsButton igdsButton = (IgdsButton) this.A00;
                    igdsButton.setLoading(true);
                    FragmentActivity requireActivity = r5.requireActivity();
                    UserSession A0X = AnonymousClass0wJ.A0X(r5.A04);
                    User user = (User) this.A01;
                    C25791Ds4.A00(requireActivity, (C15680ri) null, new IDxACallbackShape15S0300000_1_I2(7, (Object) user, (Object) r5, (Object) igdsButton), (BKU) null, (C20066BMj) null, A0X, user);
                    i = 229845070;
                    break;
                } else {
                    C04220Ms.A0E("broadcastLogger");
                    throw null;
                }
            case 3:
                A05 = C14030oh.A05(-1809375788);
                HashMap A0y = AnonymousClass0wJ.A0y();
                C18250wR.A1E(this.A03, A0y);
                A0y.put("referrer", "map_profile_action");
                C63743iE A022 = C63743iE.A02("com.bloks.www.bloks.ig.menu", A0y);
                C10300i6 r52 = (C10300i6) this.A02;
                IgBloksScreenConfig A0N = C18190wL.A0N(r52);
                A0N.A0e = true;
                Bundle A003 = C62853b1.A00(A0N, A022);
                C63863iT.A08((Activity) this.A01, A003, r52, ModalActivity.class, "bloks");
                i = 453159215;
                break;
            case 4:
                A05 = C14030oh.A05(-1874989464);
                HashMap A0y2 = AnonymousClass0wJ.A0y();
                C18250wR.A1E(this.A03, A0y2);
                C63743iE A023 = C63743iE.A02("com.bloks.www.bloks.crowdsourcing.suggestedits", A0y2);
                UserSession userSession = ((C67033yl) this.A00).A02;
                IgBloksScreenConfig A0N2 = C18190wL.A0N(userSession);
                A0N2.A0S = ((Venue) this.A02).A00.A0K;
                A0N2.A0e = true;
                Bundle A004 = C62853b1.A00(A0N2, A023);
                C63863iT.A08((Activity) this.A01, A004, userSession, ModalActivity.class, "bloks");
                i = -1237817908;
                break;
            case 5:
                A05 = C14030oh.A05(2072997786);
                Context context2 = (Context) this.A00;
                C25828Dsm A0W = C18190wL.A0W(context2);
                A0W.A0L(2131837631);
                A0W.A0p(C18190wL.A0h(context2.getResources(), this.A03, 2131837629));
                A0W.A0R(C18250wR.A0E(context2, this.A01, this.A02, 19), AnonymousClass25l.RED, 2131834607);
                A0W.A0S((DialogInterface.OnClickListener) null, AnonymousClass25l.DEFAULT, 2131823054);
                AnonymousClass0wJ.A1K(A0W);
                i = 1799503440;
                break;
            case 6:
                A05 = C14030oh.A05(-1404262987);
                C36928JhH jhH = (C36928JhH) this.A02;
                Fragment fragment2 = (Fragment) this.A01;
                String str2 = this.A03;
                C11630kW r7 = (C11630kW) this.A00;
                if (fragment2.isAdded()) {
                    HashMap A032 = C63203gz.A03("url", str2);
                    String str3 = jhH.A05;
                    if (str3 != null) {
                        A032.put("media_id", str3);
                    }
                    Bundle A06 = C18180wK.A06();
                    A06.putString("android.intent.extra.TEXT", str2);
                    AnonymousClass3iG.A03(fragment2.requireActivity(), A06, r7, jhH.A04, "share_to_system_sheet", A032);
                }
                i = -936570709;
                break;
            case 7:
                A05 = C14030oh.A05(-1021459207);
                boolean z = ((AnonymousClass1YS) this.A01).A00;
                if (!z) {
                    C63533hk r42 = (C63533hk) this.A02;
                    String str4 = this.A03;
                    C62733ac A033 = C63533hk.A03(r42, str4);
                    A033.A09 = true;
                    r42.A00.put(str4, A033);
                    r42.A0C((C11630kW) null, (C10300i6) null, (Iterable) null, false);
                }
                C63723iC r2 = (C63723iC) this.A00;
                UserSession userSession2 = r2.A08;
                C63533hk.A02(userSession2).A0B(r2.A03, userSession2, AnonymousClass006.A0u, this.A03, z);
                r2.A0D(AnonymousClass006.A00, z);
                i = -665410557;
                break;
            default:
                A05 = C14030oh.A05(-1606533495);
                C61713Va r53 = (C61713Va) this.A00;
                UserSession userSession3 = r53.A04;
                C62423Zt.A02(userSession3);
                C11630kW r22 = r53.A03;
                boolean A005 = C34832Lb.A00(r53.A02, userSession3);
                Integer num = (Integer) this.A02;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r22, userSession3), "options_invite_tapped"), 2465);
                A0I.A0Q(RealtimeConstants.MQTT_CONNECTED, Boolean.valueOf(A005));
                A0I.A0T("invite_flow", AnonymousClass2QD.A00(num));
                A0I.Bb4();
                ((Runnable) this.A01).run();
                C61713Va.A00(r53, (Object) null, AnonymousClass2QD.A00(num));
                i = 649512770;
                break;
        }
        C14030oh.A0C(i, A05);
    }
}
