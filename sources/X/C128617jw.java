package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7jw  reason: invalid class name and case insensitive filesystem */
public final class C128617jw implements C145868lF {
    public static final Set A04;
    public C120967Dk A00;
    public final Bundle A01;
    public final AnonymousClass57F A02;
    public final AnonymousClass583 A03;

    public static void A00(C128617jw r5, C104926cb r6) {
        Bundle bundle;
        String str;
        String str2;
        String str3 = r6.A00;
        if ("ACTIVE".equalsIgnoreCase(str3) || "DISABLED".equalsIgnoreCase(str3)) {
            bundle = r5.A01;
            AnonymousClass7Hq.A04(bundle, "VERIFY_PIN");
            str = "verify_pin_display";
        } else if ("LOCKED".equalsIgnoreCase(str3)) {
            bundle = r5.A01;
            String A002 = AnonymousClass7Hq.A00(bundle);
            if ("VERIFY_PIN_TO_PAY".equalsIgnoreCase(A002)) {
                str2 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_TO_PAY";
            } else {
                if ("VERIFY_PIN_TO_DISABLE_BIO_HUB".equalsIgnoreCase(A002) || "VERIFY_PIN_TO_DISABLE_PIN_HUB".equalsIgnoreCase(A002) || "VERIFY_PIN_TO_ENABLE_BIO_HUB".equalsIgnoreCase(A002) || "VERIFY_PIN_TO_ENABLE_PIN_HUB".equalsIgnoreCase(A002)) {
                    str2 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB";
                }
                bundle.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
                AnonymousClass7Hq.A04(bundle, "RECOVER_PIN");
                str = "forget_pin_display";
            }
            AnonymousClass7Hq.A03(bundle, str2);
            bundle.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
            AnonymousClass7Hq.A04(bundle, "RECOVER_PIN");
            str = "forget_pin_display";
        } else if ("DELETED".equalsIgnoreCase(str3)) {
            bundle = r5.A01;
            AnonymousClass7Hq.A04(bundle, "CREATE_PIN");
            AnonymousClass7BO.A02(bundle, "CREATE_AUTH_TICKET_BASED_FACTOR");
            AnonymousClass7Kz.A0J();
            bundle.putBoolean("AUTH_FLOW_UTIL_ASKED_FOR_BIO_SETUP", false);
            str = "create_pin_display";
        } else {
            throw C18250wR.A0V("Should not be called");
        }
        bundle.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str);
        AnonymousClass7JD.A03(r5.A02.A00, new AnonymousClass79P("AUTH_EDIT_TEXT_SCREEN", new Bundle(bundle)));
    }

    public final C120967Dk ArH() {
        return this.A00;
    }

    public final void BzY(Bundle bundle, C120967Dk r12) {
        String str;
        String str2;
        String str3;
        Bundle bundle2 = this.A01;
        if (!C18240wQ.A1T(bundle2, AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 2))) {
            String A012 = AnonymousClass7Hq.A01(bundle2);
            str = "AUTH_EDIT_TEXT_SCREEN";
            if ("RECOVER_PIN".equalsIgnoreCase(A012)) {
                bundle2.putString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_STEP", "#", 2), "CREATE_PIN");
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PASSWORD_ENTERED", C18190wL.A0j(bundle, "AUTH_FLOW_UTIL_PASSWORD_ENTERED"));
                str2 = "reset_pin_screen_display";
            } else if ("CREATE_PIN".equalsIgnoreCase(A012)) {
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PIN_ENTERED", C18190wL.A0j(bundle, "AUTH_FLOW_UTIL_PIN_ENTERED"));
                bundle2.putString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_STEP", "#", 2), "CONFIRM_PIN");
                str2 = "reset_pin_confirm_display";
            } else if ("CONFIRM_PIN".equalsIgnoreCase(A012)) {
                r12.getClass();
                AnonymousClass7JD.A03(this.A02.A02, new AnonymousClass79P(r12, (Object) null));
                return;
            } else {
                return;
            }
        } else {
            String A022 = AnonymousClass7Hq.A02(bundle2);
            A022.getClass();
            str = "AUTH_EDIT_TEXT_SCREEN";
            if (A022.equalsIgnoreCase("CREATE_PIN")) {
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PIN_ENTERED", C18190wL.A0j(bundle, "AUTH_FLOW_UTIL_PIN_ENTERED"));
                AnonymousClass7Hq.A04(bundle2, "CONFIRM_PIN");
                str2 = "confirm_pin_display";
            } else if (A022.equalsIgnoreCase("CONFIRM_PIN") || "CONFIRM_PIN".equalsIgnoreCase(AnonymousClass7Hq.A01(bundle2))) {
                r12.getClass();
                AnonymousClass7Kz.A0J();
                AnonymousClass7JD.A03(this.A02.A02, new AnonymousClass79P(r12, (Object) null));
                return;
            } else {
                str2 = "reset_pin_screen_display";
                if (A022.equalsIgnoreCase("VERIFY_PIN")) {
                    if (r12 != null) {
                        if ("CHANGE_PIN_USING_OLD_PIN".equalsIgnoreCase(AnonymousClass7Hq.A00(bundle2))) {
                            this.A00 = r12;
                            String[] strArr = {r12.A01};
                            HashSet A0u = C18200wM.A0u();
                            String[] stringArray = bundle2.getStringArray("PTT_UTIL_AUTH_AT_ALIASES");
                            if (stringArray != null) {
                                Collections.addAll(A0u, stringArray);
                            }
                            Collections.addAll(A0u, strArr);
                            bundle2.putStringArray("PTT_UTIL_AUTH_AT_ALIASES", (String[]) A0u.toArray(new String[0]));
                            AnonymousClass7Hq.A04(bundle2, "CREATE_PIN");
                            bundle2.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str2);
                            ArrayList A0v = AnonymousClass0wJ.A0v();
                            String[] stringArray2 = bundle2.getStringArray("PTT_UTIL_CAP_NAMES");
                            if (stringArray2 != null) {
                                Collections.addAll(A0v, stringArray2);
                            }
                            A0v.remove("RESET_FBPAY_PIN");
                            bundle2.putStringArray("PTT_UTIL_CAP_NAMES", (String[]) A0v.toArray(new String[0]));
                            AnonymousClass7BO.A02(bundle2, "CREATE_FBPAY_PIN");
                            AnonymousClass7JD.A03(this.A02.A00, new AnonymousClass79P(str, new Bundle(bundle2)));
                        }
                        AnonymousClass7JD.A03(this.A02.A02, new AnonymousClass79P(r12, (Object) null));
                        return;
                    }
                    str2 = "forget_pin_display";
                    if (bundle != null) {
                        if (bundle.getBoolean("AUTH_FLOW_UTIL_PIN_LOCKED")) {
                            if (!A04.contains(AnonymousClass7Hq.A00(bundle2))) {
                                bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
                                str3 = "PIN_LOCKED";
                            } else {
                                AnonymousClass57F r0 = this.A02;
                                AnonymousClass7JD.A03(r0.A01, new AnonymousClass88L());
                                return;
                            }
                        } else if (bundle.getBoolean("AUTH_FLOW_UTIL_PIN_FORGOT")) {
                            bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_FORGOT", true);
                            str3 = "FORGOT_PIN";
                        } else {
                            return;
                        }
                        bundle2.putString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 2), str3);
                        bundle2.putString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_STEP", "#", 2), "RECOVER_PIN");
                    } else {
                        return;
                    }
                } else if (A022.equalsIgnoreCase("RECOVER_PIN")) {
                    AnonymousClass7Hq.A04(bundle2, "CREATE_PIN");
                    bundle.getClass();
                    bundle2.putString("AUTH_FLOW_UTIL_PASSWORD_ENTERED", C18190wL.A0j(bundle, "AUTH_FLOW_UTIL_PASSWORD_ENTERED"));
                } else {
                    return;
                }
            }
        }
        bundle2.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str2);
        AnonymousClass7JD.A03(this.A02.A00, new AnonymousClass79P(str, new Bundle(bundle2)));
    }

    public final void BzZ(Throwable th) {
        throw C18250wR.A0V(C28174Ezk.A00(141));
    }

    static {
        HashSet A0u = C18200wM.A0u();
        A0u.add("CONNECT_FROM_CHECKOUT_PIN_VERIFICATION");
        A0u.add("CONNECT_FROM_CHECKOUT_CVV_VERIFICATION");
        A0u.add("CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION");
        A0u.add("CONNECT_FROM_HUB_PIN_VERIFICATION");
        A0u.add("CONNECT_FROM_HUB_CVV_VERIFICATION");
        A0u.add("CONNECT_FROM_HUB_PAYPAL_VERIFICATION");
        A04 = Collections.unmodifiableSet(A0u);
    }

    public C128617jw(Bundle bundle, AnonymousClass583 r5, AnonymousClass57F r6) {
        this.A02 = r6;
        this.A03 = r5;
        Bundle bundle2 = new Bundle(bundle);
        this.A01 = bundle2;
        if (!A04.contains(AnonymousClass7Hq.A00(bundle2))) {
            AnonymousClass7Kx.A0H(r6.A03.A02(), C86114wI.A0Q(this, 182));
            return;
        }
        bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE", false);
        C18210wN.A0V().toString();
        A00(this, new C104926cb("ACTIVE"));
    }
}
