package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.smartcapture.logging.SCEventNames;
import java.io.StringWriter;

/* renamed from: X.3Ni  reason: invalid class name and case insensitive filesystem */
public final class C60023Ni {
    public static AnonymousClass3T5 parseFromJson(MMo mMo) {
        return (AnonymousClass3T5) AnonymousClass0wJ.A0h(mMo, 105);
    }

    public static String A00(AnonymousClass3T5 r6) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        A0K.A0b(SCEventNames.Params.PERMISSION_ATTEMPTS, r6.A00);
        if (r6.A04 != null) {
            A0K.A0U("remaining_steps");
            A0K.A0I();
            for (C61343Sv r4 : r6.A04) {
                if (r4 != null) {
                    A0K.A0J();
                    String str = r4.A03;
                    if (str != null) {
                        A0K.A0d("title_text", str);
                    }
                    String str2 = r4.A01;
                    if (str2 != null) {
                        A0K.A0d("content_text", str2);
                    }
                    AnonymousClass2AQ r0 = r4.A00;
                    if (r0 != null) {
                        A0K.A0d(OptSvcAnalyticsStore.LOGGING_KEY_STEP, r0.name());
                    }
                    String str3 = r4.A02;
                    if (str3 != null) {
                        A0K.A0d("qualifying_value", str3);
                    }
                    A0K.A0G();
                }
            }
            A0K.A0F();
        }
        Boolean bool = r6.A02;
        if (bool != null) {
            A0K.A0e("is_exposed", bool.booleanValue());
        }
        C313625r r02 = r6.A01;
        if (r02 != null) {
            A0K.A0d("flow_type", r02.A00);
        }
        Integer num = r6.A03;
        if (num != null) {
            A0K.A0b("position", num.intValue());
        }
        return C18180wK.A0h(A0K, A0d);
    }
}
