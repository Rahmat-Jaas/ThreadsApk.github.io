package com.instagram.common.accessibility;

import X.AnonymousClass0TJ;
import X.AnonymousClass9SC;
import X.C008103m;
import X.C171209wF;
import X.C18230wP;
import X.C18240wQ;
import X.C19000yP;
import X.C209016o;
import X.C209416t;
import X.C23006Ck6;
import X.C320129v;
import X.C37350Jpy;
import X.C59693Lv;
import X.C62183Xq;
import X.C63073bQ;
import X.C63143c0;
import X.C63803iN;
import android.app.Activity;
import android.view.View;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;

public class IDxCSpanShape14S0300000_1_I2 extends AnonymousClass9SC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape14S0300000_1_I2(C008103m r1, Integer num, Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(r1, num, str, i);
        this.A03 = i2;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        String A05;
        switch (this.A03) {
            case 0:
                String str = ((C209016o) this.A01).A02;
                C18240wQ.A1I(str);
                C37350Jpy A0Y = C18230wP.A0Y((Activity) this.A00, (UserSession) this.A02, C171209wF.A26, str);
                A0Y.A07("fb_to_ig_feed_default_audience_consent");
                A0Y.A04();
                return;
            case 1:
                C320129v r4 = C320129v.DEFAULT_PRIVACY_INSTRUCTION_VIEW_CLICK;
                UserSession userSession = (UserSession) this.A01;
                C209416t r1 = (C209416t) this.A00;
                boolean z = r1.A00;
                String valueOf = String.valueOf(r1.A02);
                C23006Ck6 ck6 = (C23006Ck6) this.A02;
                C59693Lv.A01(r4, userSession, valueOf, C63143c0.A05(ck6.requireContext(), Integer.valueOf(C63073bQ.A00(userSession).A00)), "video_feed", String.valueOf(r1.A01), z, C62183Xq.A00(userSession), r1.A05);
                C23006Ck6.A07(r1, ck6, false);
                return;
            default:
                C209416t r12 = (C209416t) this.A01;
                String obj = r12.A02.toString();
                C19000yP r11 = (C19000yP) this.A00;
                if (r12.A00) {
                    A05 = r12.A04;
                } else {
                    A05 = C63143c0.A05(view.getContext(), Integer.valueOf(C63803iN.A02(AnonymousClass0TJ.A05, r11.A0P)));
                }
                C320129v r2 = C320129v.DEFAULT_PRIVACY_INSTRUCTION_VIEW_CLICK;
                UserSession userSession2 = r11.A0P;
                String str2 = r11.A0S;
                C59693Lv.A01(r2, userSession2, obj, A05, str2, r12.A01.toString(), false, C62183Xq.A00(userSession2), r12.A05);
                if (C63073bQ.A00(userSession2).A03() != null) {
                    r11.A04(r12, (IgSwitch) this.A02, A05, str2, false);
                    return;
                }
                return;
        }
    }
}
