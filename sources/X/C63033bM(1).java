package X;

import com.facebook.common.callercontext.CallerContext;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5;

/* renamed from: X.3bM  reason: invalid class name and case insensitive filesystem */
public final class C63033bM {
    public static final C70424Ek A00 = C70424Ek.A00(41);
    public static final C70424Ek A01 = C70424Ek.A00(42);
    public static final C70424Ek A02;
    public static final C70424Ek A03 = C70424Ek.A00(44);
    public static final C70424Ek A04 = C70424Ek.A00(45);
    public static final C70424Ek A05 = C70424Ek.A00(46);
    public static final C70424Ek A06 = C70424Ek.A00(47);
    public static final C70424Ek A07 = C70424Ek.A00(48);
    public static final C70424Ek A08 = C70424Ek.A00(49);
    public static final C70424Ek A09 = A00(0);
    public static final C70424Ek A0A = A00(1);
    public static final C70424Ek A0B = A00(2);
    public static final C70424Ek A0C = A00(3);
    public static final C70424Ek A0D = A00(4);
    public static final C70424Ek A0E = A00(5);
    public static final C70424Ek A0F = A00(6);
    public static final C70424Ek A0G = A00(7);
    public static final C70424Ek A0H = A00(8);
    public static final C63033bM A0I = new C63033bM();
    public static final AnonymousClass0ZU A0J = C76364du.A00;

    public static C70424Ek A00(int i) {
        return new C70424Ek(new C70414Ej(new KtSLambdaShape16S0100000_I2_5(i, (C146958n9) null)));
    }

    static {
        C70424Ek A002 = C70424Ek.A00(43);
        A002.A00.A00 = "user";
        A02 = A002;
    }

    public static final String A02(C10300i6 r3) {
        String A0q = C18220wO.A0q(A0I);
        if (C62433Zv.A02(CallerContext.A01(A0q), r3, "ig_android_growth_fx_access_fbig_log_sso_error")) {
            return C62433Zv.A01(CallerContext.A01(A0q), r3, "ig_android_growth_fx_access_fbig_log_sso_error");
        }
        return null;
    }

    public static final Integer A01(Integer num) {
        switch (num.intValue()) {
            case 0:
            case 9:
                return AnonymousClass006.A00;
            case 1:
            case 8:
                return AnonymousClass006.A01;
            case 2:
            case 3:
            case 4:
                return AnonymousClass006.A0Y;
            case 5:
                return AnonymousClass006.A0N;
            case 6:
            case 7:
                return AnonymousClass006.A0C;
            default:
                throw AnonymousClass4VZ.A00();
        }
    }
}
