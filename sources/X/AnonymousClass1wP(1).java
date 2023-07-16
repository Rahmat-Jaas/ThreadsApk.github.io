package X;

import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape3S0200100_1_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.1wP  reason: invalid class name */
public final class AnonymousClass1wP extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "DailyReminderMenuFragment";
    public UserSession A00;
    public long A01;

    public final void configureActionBar(AnonymousClass4u2 r1) {
    }

    public final String getModuleName() {
        return "time_spent";
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-193679784);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        C14030oh.A09(94070202, A02);
    }

    public final void onResume() {
        String str;
        ArrayList A0v;
        C63293hC r1;
        int A02 = C14030oh.A02(327873861);
        super.onResume();
        UserSession userSession = this.A00;
        if (userSession == null) {
            str = "userSession";
        } else {
            AnonymousClass0TJ r9 = AnonymousClass0TJ.A05;
            long A08 = C18240wQ.A08(C63803iN.A05(r9, userSession, 36316134626102240L).booleanValue() ? 1 : 0);
            C62803am r12 = C63043bN.A01;
            UserSession userSession2 = this.A00;
            str = "userSession";
            if (userSession2 != null) {
                this.A01 = r12.A04(userSession2);
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                UserSession userSession3 = this.A00;
                if (userSession3 != null) {
                    String[] split = C63803iN.A0C(r9, userSession3, 36879084579717299L).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    if (split.length > 0) {
                        A0v = C18200wM.A0s(Arrays.asList(split));
                    } else {
                        A0v = AnonymousClass0wJ.A0v();
                    }
                    UserSession userSession4 = this.A00;
                    if (userSession4 != null) {
                        if (AnonymousClass3Zz.A03(userSession4)) {
                            r1 = new C63293hC(2131824725);
                        } else {
                            Resources A0B = AnonymousClass0wJ.A0B(this);
                            C04220Ms.A06(A0B);
                            r1 = new C63293hC((CharSequence) AnonymousClass0wJ.A0o(this, C60653Py.A01(A0B, this.A01), 2131824738));
                        }
                        A0v2.add(r1);
                        ArrayList A0v3 = AnonymousClass0wJ.A0v();
                        Iterator it = A0v.iterator();
                        while (it.hasNext()) {
                            String A0k = C18180wK.A0k(it);
                            C04220Ms.A04(A0k);
                            int parseInt = Integer.parseInt(A0k);
                            if (parseInt > 0) {
                                Resources A0B2 = AnonymousClass0wJ.A0B(this);
                                C04220Ms.A06(A0B2);
                                UserSession userSession5 = this.A00;
                                if (userSession5 != null) {
                                    C62563aI.A01(A0k, C60653Py.A00(A0B2, parseInt, C63803iN.A05(r9, userSession5, 36316134626102240L).booleanValue(), false), A0v3);
                                }
                            }
                        }
                        String str2 = "off";
                        C62563aI.A01(str2, AnonymousClass0wJ.A0B(this).getString(2131831950), A0v3);
                        long j = this.A01;
                        if (j >= 0) {
                            long j2 = j / A08;
                            if (A0v.contains(String.valueOf(j2))) {
                                if (j2 != 0) {
                                    str2 = String.valueOf(j2);
                                }
                                C61353Sw.A00(new IDxCListenerShape3S0200100_1_I2(0, A08, this, A0v3), str2, A0v2, A0v3);
                                setItems(A0v2);
                                C14030oh.A09(1346007920, A02);
                                return;
                            }
                        }
                        str2 = " ";
                        C61353Sw.A00(new IDxCListenerShape3S0200100_1_I2(0, A08, this, A0v3), str2, A0v2, A0v3);
                        setItems(A0v2);
                        C14030oh.A09(1346007920, A02);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
