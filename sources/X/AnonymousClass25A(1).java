package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.login.delegate.IDxBActionShape54S0000000_1_I2;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.25A  reason: invalid class name */
public enum AnonymousClass25A {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I2;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I22;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I23;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I24;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I25;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I26;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I27;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I28;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I29;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I210;
        IDxBActionShape54S0000000_1_I2 iDxBActionShape54S0000000_1_I211;
        EnumMap enumMap = new EnumMap(C307922z.class);
        A01 = enumMap;
        enumMap.put(C307922z.SEND_PASSWORD_RESET_EMAIL, iDxBActionShape54S0000000_1_I2);
        enumMap.put(C307922z.SEND_PASSWORD_RESET_SMS, iDxBActionShape54S0000000_1_I22);
        enumMap.put(C307922z.LOGIN_WITH_FACEBOOK, iDxBActionShape54S0000000_1_I23);
        enumMap.put(C307922z.FORGOT_PASSWORD_FLOW, iDxBActionShape54S0000000_1_I24);
        enumMap.put(C307922z.SEND_ONE_CLICK_LOGIN_EMAIL, iDxBActionShape54S0000000_1_I25);
        enumMap.put(C307922z.SWITCH_TO_SIGNUP_FLOW, iDxBActionShape54S0000000_1_I26);
        enumMap.put(C307922z.STOP_ACCOUNT_DELETION, iDxBActionShape54S0000000_1_I27);
        enumMap.put(C307922z.GO_TO_HELPER_URL, iDxBActionShape54S0000000_1_I28);
        enumMap.put(C307922z.SHOW_RECOVERY_CHALLENGE, iDxBActionShape54S0000000_1_I29);
        enumMap.put(C307922z.DISMISS, iDxBActionShape54S0000000_1_I210);
        enumMap.put(C307922z.DEFAULT, iDxBActionShape54S0000000_1_I211);
    }

    public final void A00(C07530bf r7) {
        USLEBaseShape0S0000000 A0I;
        String str = this.A00;
        if (str.equals("retry")) {
            double A002 = C18200wM.A00();
            double A003 = AnonymousClass269.A00();
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "retry_tapped"), 2642);
            AnonymousClass269.A05(A0I);
            AnonymousClass0wJ.A1A(A0I, A002, A003);
            C18190wL.A1I(A0I, "access_dialog");
            C18210wN.A17(A0I);
            AnonymousClass0wJ.A1D(A0I, A003, A002);
        } else {
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "recovery_tapped"), 2572);
            if (AnonymousClass0wJ.A1U(A0I)) {
                C18190wL.A1G(A0I, System.currentTimeMillis(), AnonymousClass269.A01());
                AnonymousClass269.A05(A0I);
                C18190wL.A1I(A0I, "access_dialog");
                A0I.A0T("type", str);
                C18210wN.A17(A0I);
                C18200wM.A1K(A0I, AnonymousClass269.A00());
            } else {
                return;
            }
        }
        C63683i7.A0A(A0I, r7);
    }

    /* access modifiers changed from: public */
    AnonymousClass25A(String str) {
        this.A00 = str;
    }
}
