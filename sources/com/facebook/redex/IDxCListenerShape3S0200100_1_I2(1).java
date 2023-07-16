package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass1wP;
import X.C04220Ms;
import X.C29071wf;
import X.C62563aI;
import X.C62803am;
import X.C63043bN;
import X.C63583hq;
import X.C696349j;
import android.widget.RadioGroup;
import com.instagram.service.session.UserSession;
import java.util.List;

public class IDxCListenerShape3S0200100_1_I2 implements RadioGroup.OnCheckedChangeListener {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape3S0200100_1_I2(int i, long j, Object obj, Object obj2) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = j;
        this.A02 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        long j;
        long j2;
        String str;
        UserSession userSession;
        long j3;
        long j4;
        if (this.A03 != 0) {
            String A002 = C62563aI.A00((List) this.A02, i);
            if (!A002.equals("off")) {
                j4 = (long) Integer.parseInt(A002);
            } else {
                j4 = 0;
            }
            long j5 = j4 * this.A00;
            C29071wf r5 = (C29071wf) this.A01;
            C696349j.A03(r5.A00);
            j2 = C696349j.A00();
            UserSession userSession2 = r5.A00;
            C62803am r3 = C63043bN.A01;
            j = r3.A05(userSession2);
            AnonymousClass0wJ.A12(C62803am.A00(r3, r5.A00), "TAKE_A_BREAK", j5);
            int i2 = (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1));
            userSession = r5.A00;
            str = "take_break";
            if (i2 <= 0) {
                C04220Ms.A0B(userSession, 0);
            }
            C63583hq.A06(userSession, str, j2, j);
            return;
        }
        String A003 = C62563aI.A00((List) this.A01, i);
        if (!C04220Ms.A0I(A003, "off")) {
            C04220Ms.A06(A003);
            j3 = (long) Integer.parseInt(A003);
        } else {
            j3 = 0;
        }
        long j6 = j3 * this.A00;
        AnonymousClass1wP r52 = (AnonymousClass1wP) this.A02;
        UserSession userSession3 = r52.A00;
        if (userSession3 != null) {
            C696349j.A03(userSession3);
            j2 = C696349j.A00();
            C62803am r32 = C63043bN.A01;
            UserSession userSession4 = r52.A00;
            if (userSession4 != null) {
                j = r32.A04(userSession4);
                UserSession userSession5 = r52.A00;
                if (userSession5 != null) {
                    AnonymousClass0wJ.A12(r32.A06(userSession5).edit(), "DAILY_QUOTA", j6);
                    int i3 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
                    userSession = r52.A00;
                    if (i3 > 0) {
                        if (userSession != null) {
                            str = "daily_limit";
                            C63583hq.A06(userSession, str, j2, j);
                            return;
                        }
                    } else if (userSession != null) {
                        str = "daily_limit";
                    }
                }
            }
        }
        C04220Ms.A0E("userSession");
        throw null;
        C63583hq.A03(userSession, AnonymousClass006.A15, (Integer) null, Long.valueOf(j), Long.valueOf(j2), (Long) null, str);
    }
}
