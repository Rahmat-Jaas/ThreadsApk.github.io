package X;

import android.app.Application;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Z8  reason: invalid class name */
public final class AnonymousClass0Z8 {
    public List A00 = new ArrayList();
    public final Application A01;

    public final void A00(AnonymousClass0OC r6, Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "STARTUP";
                break;
            case 1:
                str = "LIFECYCLE";
                break;
            case 2:
                str = "JAVA_DETECT";
                break;
            case 3:
                str = "JAVA_APP_DEATH";
                break;
            case 4:
                str = "NATIVE";
                break;
            case 5:
                str = "ANR_DETECT";
                break;
            case 6:
                str = "ANR_APP_DEATH";
                break;
            case 7:
                str = "JAVASCRIPT";
                break;
            case 8:
                str = "SOFT_ERRORS";
                break;
            case 9:
                str = "UNEXPLAINED";
                break;
            case 10:
                str = "LATE_STARTUP";
                break;
            case 11:
                str = "AFTER_STARTUP";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "MEMORY_SNAPSHOT";
                break;
            case 13:
                str = "CRASH_LOOP";
                break;
            default:
                str = "BACKGROUND";
                break;
        }
        C13810oL.A01(AnonymousClass00U.A0L("MainAddOnConfig.processAddOns.", str), -734362632);
        try {
            for (AnonymousClass0P4 r0 : this.A00) {
                r0.A7n(r6, num);
            }
            C13810oL.A00(1711614192);
        } catch (Throwable th) {
            C13810oL.A00(1600464635);
            throw th;
        }
    }

    public AnonymousClass0Z8(Application application) {
        this.A01 = application;
    }
}
