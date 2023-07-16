package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass4n2;
import X.BKU;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import X.C18230wP;
import X.C18240wQ;
import X.C19359Av2;
import X.C20134BPz;
import X.C21659By5;
import X.C307422s;
import X.C60853Qu;
import X.C684743y;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.user.model.User;

public class IDxDListenerShape104S0300000_1_I2 implements C21659By5 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxDListenerShape104S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj2;
        this.A00 = obj;
        this.A01 = obj3;
    }

    public final void Bmo() {
        if (this.A03 != 0) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(((C684743y) this.A02).A01, "comments_from_facebook_exit_flow"), 426);
            String A33 = ((BKU) this.A00).A33();
            C04220Ms.A06(A33);
            C18210wN.A18(A0I, AnonymousClass4n2.A00(A33));
            A0I.A0Q("is_exit_to_fb", C18180wK.A0X());
            A0I.Bb4();
            C18240wQ.A1G(this.A01);
            return;
        }
        C20134BPz bPz = (C20134BPz) this.A00;
        C307422s r1 = bPz.A01;
        if (r1 != null) {
            if (r1 == C307422s.VIEW_PROFILE) {
                User user = (User) this.A01;
                USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(bPz.A05, "view_profile_tapped"), 2920);
                A0I2.A0T("target_id", user.getId());
                A0I2.A0T("radio_type", (String) null);
                A0I2.A0T("reason", (String) null);
                A0I2.A0T("group_name", (String) null);
                A0I2.A0S("entity_user_type", C18230wP.A0f(user.Apb()));
                A0I2.Bb4();
                if (user.Apb() == 1) {
                    C60853Qu.A00(bPz.A04.requireContext(), bPz.A06, bPz.A09, AnonymousClass0wJ.A0d(user.getId()), "ig_reel_dashboard");
                } else {
                    bPz.A03(user.getId());
                }
            } else if (r1 == C307422s.BLOCK) {
                bPz.Bme((C19359Av2) this.A02);
            }
            bPz.A01 = null;
            return;
        }
        User user2 = (User) this.A01;
        USLEBaseShape0S0000000 A0I3 = C18180wK.A0I(AnonymousClass0wJ.A0M(bPz.A05, "reel_viewer_dashboard_overflow_cancel"), 2604);
        A0I3.A0T("target_id", user2.getId());
        A0I3.A0T("radio_type", (String) null);
        A0I3.A0T("reason", (String) null);
        A0I3.A0T("group_name", (String) null);
        A0I3.A0T("entity_user_type", String.valueOf(user2.Apb()));
        A0I3.Bb4();
    }

    public final void Bmq() {
    }
}
