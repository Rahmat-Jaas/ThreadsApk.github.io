package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3VO;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C109326jp;
import X.C18190wL;
import X.C18210wN;
import X.C34620Ibt;
import X.C37062Jjm;
import X.C37740K2a;
import X.C39669Kxo;
import X.C61043Rr;
import X.C63743iE;
import X.C63893iY;
import X.C680942f;
import X.KFB;
import X.L2D;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public class IDxCallbackShape195S0200000_1_I2 implements C39669Kxo {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallbackShape195S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public final void Bxq() {
        switch (this.A02) {
            case 0:
            case 1:
                C63893iY.A0G((AnonymousClass601) this.A01, (C109326jp) this.A00);
                return;
            default:
                return;
        }
    }

    public final void CNL(String str) {
        C34620Ibt ibt;
        String str2;
        HashMap hashMap;
        String str3;
        switch (this.A02) {
            case 0:
            case 1:
                C04220Ms.A0B(str, 0);
                C61043Rr.A00((AnonymousClass601) this.A01, C63893iY.A05(AnonymousClass3VO.A00(), str, 0), (C109326jp) this.A00);
                return;
            case 2:
                C04220Ms.A0B(str, 0);
                hashMap = AnonymousClass0wJ.A0y();
                ibt = (C34620Ibt) this.A01;
                str2 = AnonymousClass0wJ.A0k(ibt.requireContext(), 2131833751);
                hashMap.put("media_id", ((L2D) this.A00).Ayo());
                hashMap.put("fb_auth_token", str);
                str3 = "com.instagram.ads.awpt_not_delivering_reason_screen.AwPTNotDeliveringReasonScreen";
                break;
            case 3:
                C04220Ms.A0B(str, 0);
                hashMap = AnonymousClass0wJ.A0y();
                ibt = (C34620Ibt) this.A01;
                str2 = AnonymousClass0wJ.A0k(ibt.requireContext(), 2131821013);
                hashMap.put("media_id", ((L2D) this.A00).Ayo());
                hashMap.put("fb_auth_token", str);
                str3 = "com.instagram.ads.rejection_details.RejectionDetailsScreen";
                break;
            case 4:
                C34620Ibt ibt2 = (C34620Ibt) this.A01;
                C37062Jjm jjm = ibt2.A06;
                if (jjm == null) {
                    C04220Ms.A0E("adsManagerLogger");
                    throw null;
                }
                KFB kfb = (KFB) this.A00;
                jjm.A07("promotion_list", "pay_now", kfb.Ayo(), (String) null);
                FragmentActivity requireActivity = ibt2.requireActivity();
                UserSession userSession = ibt2.A0J;
                if (userSession == null) {
                    C18210wN.A0m();
                    throw null;
                }
                C37740K2a.A04(requireActivity, new C680942f(ibt2, kfb), userSession, false);
                C34620Ibt.A07(ibt2);
                return;
            default:
                return;
        }
        C63743iE A022 = C63743iE.A02(str3, hashMap);
        FragmentActivity requireActivity2 = ibt.requireActivity();
        UserSession userSession2 = ibt.A0J;
        if (userSession2 == null) {
            C18210wN.A0m();
            throw null;
        }
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession2);
        A0N.A0S = str2;
        A022.A0C(requireActivity2, A0N);
    }
}
