package com.facebook.redex;

import X.AnonymousClass0ZV;
import X.AnonymousClass18b;
import X.AnonymousClass3DJ;
import X.AnonymousClass3LY;
import X.AnonymousClass3Ui;
import X.AnonymousClass467;
import X.AnonymousClass469;
import X.AnonymousClass46A;
import X.C10300i6;
import X.C18180wK;
import X.C38039KHq;
import X.C60583Pr;
import X.C63823iP;
import X.C83924sD;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

public class IDxUCallbackShape33S1200000_1_I2 implements C83924sD {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxUCallbackShape33S1200000_1_I2(UserSession userSession, User user, String str, int i) {
        this.A03 = i;
        this.A01 = userSession;
        this.A00 = user;
        this.A02 = str;
    }

    public final void Bwp(Long l, Long l2, long j, long j2, boolean z) {
        AnonymousClass3LY.A00((C10300i6) this.A01).CWx(new AnonymousClass46A());
    }

    public final void CNV(Long l, Long l2, long j, long j2, boolean z) {
        long j3;
        long j4;
        int i = this.A03;
        UserSession userSession = (UserSession) this.A01;
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        if (i != 0) {
            A002.CWx(new AnonymousClass469());
            if (!(l == null || l2 == null)) {
                C63823iP.A0B((User) this.A00, l.longValue(), l2.longValue());
            }
            C63823iP.A0A(userSession);
            long j5 = 0;
            if (l == null || l2 == null) {
                j3 = 0;
            } else {
                j3 = l2.longValue() - l.longValue();
            }
            AnonymousClass3Ui A012 = C60583Pr.A01(userSession);
            AnonymousClass3DJ A06 = C63823iP.A06(userSession, 0);
            String str = this.A02;
            if (l != null) {
                j4 = l.longValue();
            } else {
                j4 = 0;
            }
            if (l2 != null) {
                j5 = l2.longValue();
            }
            AnonymousClass3Ui.A00(A012, A06, (Boolean) null, (Boolean) null, C18180wK.A0Y(), (Long) null, (Long) null, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j3), "ig_quiet_mode_pause_toggled", str, (Map) null, 248);
            return;
        }
        A002.CWx(new AnonymousClass467());
        User user = (User) this.A00;
        user.A2X(false);
        user.A05.Con(C18180wK.A0n(new AnonymousClass18b(Integer.valueOf((int) j2), Integer.valueOf((int) j))));
        user.A2G(AnonymousClass0ZV.A00);
        C63823iP.A0A(userSession);
        AnonymousClass3Ui.A00(C60583Pr.A01(userSession), C63823iP.A05(userSession), false, true, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_toggled", this.A02, (Map) null, 176);
    }
}
