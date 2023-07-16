package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Vp  reason: invalid class name and case insensitive filesystem */
public final class C61793Vp {
    public final SharedPreferences A00;
    public final AnonymousClass39M A01;
    public final String A02;
    public final C10300i6 A03;
    public volatile String A04;

    public static C61793Vp A00(C10300i6 r2) {
        return (C61793Vp) C18180wK.A0c(r2, C61793Vp.class, 28);
    }

    public final String A01() {
        List A0s;
        String str;
        C10300i6 r1 = this.A03;
        if (r1 instanceof UserSession) {
            A0s = C05030Qo.A02(r1).multipleAccountHelper.A0G(this.A02);
        } else {
            A0s = C18200wM.A0s(C18210wN.A0i(C05030Qo.A01(r1)));
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (A0k != null) {
                str = C18250wR.A0W(this.A00, A0k);
            } else {
                str = null;
            }
            A0v.add(str);
        }
        return TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0v);
    }

    public final String A02() {
        return this.A04;
    }

    public final void A03() {
        this.A04 = "";
        if (this.A03 instanceof UserSession) {
            C18180wK.A0u(this.A00.edit(), this.A02);
        }
    }

    public final void A04(String str) {
        AnonymousClass39M r1 = this.A01;
        if (!str.equals(r1.A00)) {
            r1.A00 = str;
            C18180wK.A0v(r1.A01.edit(), "DEVICE_HEADER_ID", r1.A00);
        }
    }

    public final void A05(String str) {
        if (!str.equals(this.A04)) {
            this.A04 = str;
            if (this.A03 instanceof UserSession) {
                C18180wK.A0v(this.A00.edit(), this.A02, str);
            }
        }
    }

    public C61793Vp(SharedPreferences sharedPreferences, C10300i6 r3, AnonymousClass39M r4) {
        String str;
        this.A03 = r3;
        String A042 = C05030Qo.A04(r3);
        this.A02 = A042;
        this.A01 = r4;
        this.A00 = sharedPreferences;
        if (A042 != null) {
            str = C18250wR.A0W(sharedPreferences, A042);
        } else {
            str = null;
        }
        this.A04 = str;
    }
}
