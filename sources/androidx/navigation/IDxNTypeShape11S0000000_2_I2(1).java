package androidx.navigation;

import X.AnonymousClass0wJ;
import X.AnonymousClass725;
import X.AnonymousClass7A8;
import X.C04220Ms;
import X.C18170wI;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C86134wK;
import android.os.Bundle;
import com.instagram.react.modules.base.IgNetworkingModule;

public class IDxNTypeShape11S0000000_2_I2 extends AnonymousClass7A8 {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxNTypeShape11S0000000_2_I2(int r2) {
        /*
            r1 = this;
            r1.A00 = r2
            switch(r2) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0005;
                case 2: goto L_0x000a;
                case 3: goto L_0x0005;
                case 4: goto L_0x000a;
                case 5: goto L_0x0005;
                case 6: goto L_0x000a;
                case 7: goto L_0x0005;
                case 8: goto L_0x000a;
                case 9: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
        L_0x0006:
            r1.<init>(r0)
            return
        L_0x000a:
            r0 = 1
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.IDxNTypeShape11S0000000_2_I2.<init>(int):void");
    }

    public final /* bridge */ /* synthetic */ Object A00(Bundle bundle, String str) {
        int i = this.A00;
        AnonymousClass0wJ.A1N(bundle, str);
        Object obj = bundle.get(str);
        switch (i) {
            case 3:
                if (obj == null) {
                    throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Float");
                }
                break;
            case 5:
                if (obj == null) {
                    throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Int");
                }
                break;
            case 7:
                if (obj == null) {
                    throw C18210wN.A0W(C18170wI.A00(29));
                }
                break;
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object A01(String str) {
        boolean z;
        int parseInt;
        String str2;
        long parseLong;
        switch (this.A00) {
            case 0:
                throw C86134wK.A0s("Arrays don't support default values.");
            case 1:
                C04220Ms.A0B(str, 0);
                if (str.equals("true")) {
                    z = true;
                } else if (str.equals("false")) {
                    z = false;
                } else {
                    throw C18190wL.A0a("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z);
            case 2:
                throw C86134wK.A0s("Arrays don't support default values.");
            case 3:
                C04220Ms.A0B(str, 0);
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                throw C86134wK.A0s("Arrays don't support default values.");
            case 5:
                C04220Ms.A0B(str, 0);
                if (C18220wO.A1V("0x", 1, str)) {
                    String A0q = C86134wK.A0q(str, 2);
                    AnonymousClass725.A00(16);
                    parseInt = Integer.parseInt(A0q, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 6:
                throw C86134wK.A0s("Arrays don't support default values.");
            case 7:
                C04220Ms.A0B(str, 0);
                if (str.endsWith("L")) {
                    str2 = C18230wP.A0s(str, 0, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (C18220wO.A1V("0x", 1, str)) {
                    String A0q2 = C86134wK.A0q(str2, 2);
                    AnonymousClass725.A00(16);
                    parseLong = Long.parseLong(A0q2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            case 8:
                throw C86134wK.A0s("Arrays don't support default values.");
            default:
                C04220Ms.A0B(str, 0);
                return str;
        }
    }

    public final String A02() {
        switch (this.A00) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "string[]";
            default:
                return IgNetworkingModule.REQUEST_BODY_KEY_STRING;
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Bundle bundle, Object obj, String str) {
        switch (this.A00) {
            case 0:
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putBooleanArray(str, (boolean[]) obj);
                return;
            case 1:
                boolean A1X = AnonymousClass0wJ.A1X(obj);
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putBoolean(str, A1X);
                return;
            case 2:
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putFloatArray(str, (float[]) obj);
                return;
            case 3:
                float A002 = C18240wQ.A00(obj);
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putFloat(str, A002);
                return;
            case 4:
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putIntArray(str, (int[]) obj);
                return;
            case 5:
                int A04 = AnonymousClass0wJ.A04(obj);
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putInt(str, A04);
                return;
            case 6:
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putLongArray(str, (long[]) obj);
                return;
            case 7:
                long A08 = C18190wL.A08(obj);
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putLong(str, A08);
                return;
            case 8:
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putStringArray(str, (String[]) obj);
                return;
            default:
                AnonymousClass0wJ.A1N(bundle, str);
                bundle.putString(str, (String) obj);
                return;
        }
    }
}
