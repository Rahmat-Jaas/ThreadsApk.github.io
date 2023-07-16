package com.facebook.redex;

import X.AnonymousClass0A2;
import X.AnonymousClass0wJ;
import X.AnonymousClass1wX;
import X.AnonymousClass1x6;
import X.AnonymousClass250;
import X.AnonymousClass3J5;
import X.AnonymousClass3Za;
import X.AnonymousClass4AW;
import X.C04220Ms;
import X.C04530Oa;
import X.C08410dK;
import X.C09120et;
import X.C10300i6;
import X.C13330nS;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C25237DiI;
import X.C27952Ew2;
import X.C28161tl;
import X.C28174Ezk;
import X.C29051wd;
import X.C29091wi;
import X.C31155GhB;
import X.C58133Eb;
import X.C62563aI;
import X.C62793ak;
import X.C82434pc;
import X.C85814vo;
import X.H1T;
import android.widget.RadioGroup;
import com.instagram.api.schemas.UserCallSettings;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1;

public class IDxCListenerShape219S0200000_1_I2 implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape219S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        String str;
        C08410dK r0;
        AnonymousClass0A2 A0M;
        int i2;
        switch (this.A02) {
            case 0:
                boolean equals = "right_side".equals(C62563aI.A00((List) this.A00, i));
                AnonymousClass4AW r2 = (AnonymousClass4AW) this.A01;
                AnonymousClass0wJ.A13(C28161tl.A02(r2.A03), C28174Ezk.A00(89), equals);
                AnonymousClass4AW.A00(r2);
                C82434pc r02 = r2.A00;
                if (r02 != null) {
                    r02.C78();
                    return;
                }
                return;
            case 1:
                String A002 = C62563aI.A00((List) this.A00, i);
                C04220Ms.A06(A002);
                int parseInt = Integer.parseInt(A002);
                int i3 = ((C29051wd) this.A01).A00;
                C09120et A0X = C18190wL.A0X();
                if (i3 == 0) {
                    r0 = A0X.A1b;
                } else {
                    r0 = A0X.A1o;
                }
                C18210wN.A1I(r0, parseInt);
                return;
            case 2:
                C62793ak A0N = C18200wM.A0N(((AnonymousClass1wX) this.A01).A06);
                String A003 = C62563aI.A00((List) this.A00, i);
                C04220Ms.A06(A003);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1101000_I2_1(A0N, A003, (C146958n9) null, 31), AnonymousClass3J5.A00(A0N), 3);
                return;
            case 3:
                AnonymousClass1x6 r22 = (AnonymousClass1x6) this.A01;
                String A004 = C62563aI.A00((List) this.A00, i);
                C04220Ms.A06(A004);
                r22.A01 = A004;
                if (A004.equals(AnonymousClass250.CLOSE_FRIENDS.A01)) {
                    str = "selected_close_friends";
                } else if (A004.equals(AnonymousClass250.RECIPROCAL_FOLLOWS.A01)) {
                    str = "selected_reciprocal_follows";
                } else {
                    str = "selected_off";
                }
                C58133Eb r3 = r22.A00;
                if (r3 == null) {
                    C04220Ms.A0E("birthdayLogger");
                    throw null;
                }
                C04530Oa r1 = r22.A03;
                r3.A00("caa", "visibility", str, C18200wM.A0B(AnonymousClass0wJ.A0X(r1)), C18200wM.A0B(AnonymousClass0wJ.A0X(r1)));
                return;
            default:
                String A005 = C62563aI.A00((List) this.A00, i);
                C29091wi r32 = (C29091wi) this.A01;
                C04220Ms.A06(A005);
                C04530Oa r4 = r32.A02;
                C10300i6 A0U = AnonymousClass0wJ.A0U(r4);
                C04220Ms.A0B(A0U, 0);
                H1T A0O = AnonymousClass0wJ.A0O(A0U);
                A0O.A0J("video_call/change_user_call_settings/");
                A0O.A0O("setting_type", A005);
                C31155GhB.A03(AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class));
                if (A005.equals(UserCallSettings.PEOPLE_YOU_FOLLOW.A00)) {
                    A0M = AnonymousClass0wJ.A0M(C13330nS.A01(r32, AnonymousClass0wJ.A0U(r4)), "call_settings_turn_on_tapped");
                    i2 = 124;
                } else if (A005.equals(UserCallSettings.OFF.A00)) {
                    A0M = AnonymousClass0wJ.A0M(C13330nS.A01(r32, AnonymousClass0wJ.A0U(r4)), "call_settings_turn_off_tapped");
                    i2 = 123;
                } else {
                    return;
                }
                C18180wK.A0I(A0M, i2).Bb4();
                return;
        }
    }
}
