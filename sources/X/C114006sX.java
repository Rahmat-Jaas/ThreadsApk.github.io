package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape4S0100100_I2;

/* renamed from: X.6sX  reason: invalid class name and case insensitive filesystem */
public final class C114006sX {
    public final AnonymousClass4x8 A00;
    public final UserSession A01;
    public final C04530Oa A02 = C86104wH.A16(this, 12);
    public final C04530Oa A03 = C86104wH.A16(this, 13);
    public final C04530Oa A04 = C86104wH.A16(this, 14);
    public final C04530Oa A05 = C86104wH.A16(this, 15);
    public final C04530Oa A06 = C86104wH.A16(this, 16);
    public final C04530Oa A07 = C86104wH.A16(this, 17);
    public final C04530Oa A08 = C86104wH.A16(this, 18);
    public final C04530Oa A09 = C86104wH.A16(this, 19);

    public C114006sX(Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A00 = AnonymousClass4x8.A00(context);
        this.A01 = userSession;
    }

    public final List A00() {
        String A0h = C18200wM.A0h(C86154wM.A0B(this.A09), "proactive_checkout_session_list");
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (A0h == null) {
            return A0v;
        }
        Object A072 = new Gson().A07(A0h, new AnonymousClass5s6().type);
        C04220Ms.A06(A072);
        return (List) A072;
    }

    public final void A01(C112156p5 r12, long j) {
        List<C112156p5> A002 = A00();
        C000300e.A0v(new KtLambdaShape4S0100100_I2(j, this, 6), A002);
        A002.add(r12);
        C04530Oa r3 = this.A09;
        SharedPreferences.Editor edit = C86154wM.A0B(r3).edit();
        String A082 = new Gson().A08(A002);
        C04220Ms.A06(A082);
        C18180wK.A0v(edit, "proactive_checkout_session_list", A082);
        Integer num = r12.A01;
        if (num == null) {
            int i = 0;
            for (C112156p5 r2 : A002) {
                long j2 = j - r2.A00;
                if (r2.A01 == null && j2 < C18190wL.A08(this.A08.getValue())) {
                    i++;
                }
                if (!C18190wL.A1X(C86154wM.A0B(r3), "proactive_checkout_should_stop_showing_banner") && i >= AnonymousClass0wJ.A04(this.A07.getValue())) {
                    AnonymousClass0wJ.A13(C86154wM.A0B(r3).edit(), "proactive_checkout_should_stop_showing_banner", true);
                }
            }
            return;
        }
        Integer num2 = AnonymousClass006.A00;
        if (num == num2) {
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            for (C112156p5 r22 : A002) {
                long j3 = j - r22.A00;
                if (r22.A01 == num2) {
                    if (j3 < C18190wL.A08(this.A03.getValue())) {
                        i2++;
                    }
                    if (j3 < C18190wL.A08(this.A06.getValue())) {
                        i3++;
                    }
                }
            }
            boolean A1U = C86114wI.A1U(i2, AnonymousClass0wJ.A04(this.A02.getValue()));
            if (i3 >= AnonymousClass0wJ.A04(this.A05.getValue())) {
                z = true;
            }
            if (A1U || z) {
                AnonymousClass0wJ.A12(C86154wM.A0B(r3).edit(), "proactive_checkout_cooldown_start_time_ms", j);
            }
        }
    }
}
