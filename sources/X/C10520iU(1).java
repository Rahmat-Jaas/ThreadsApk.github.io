package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0iU  reason: invalid class name and case insensitive filesystem */
public final class C10520iU implements C41779Mbt {
    public static final C142048dj A03 = new C10530iV();
    public final C11660kZ A00;
    public final C10500iS A01 = new C10500iS();
    public final Random A02 = new Random();

    public static boolean A02(StringBuilder sb, Object[] objArr) {
        if (objArr == null) {
            return false;
        }
        C121687Hl.A01(A03, ", ", sb, objArr);
        return true;
    }

    public final void CZS(C33891HwT hwT, M59[] m59Arr, M59[] m59Arr2, M59[] m59Arr3, String[] strArr, int i) {
        String[] strArr2 = strArr;
        this.A01.CZS(hwT, m59Arr, m59Arr2, m59Arr3, strArr2, 10);
        if (this.A02.nextInt(10) == 0) {
            C15730rn A012 = C15730rn.A01("ig_contextual_config_micro_exposure", (String) null);
            A01(hwT, A012);
            StringBuilder sb = new StringBuilder();
            if (A02(sb, hwT.AZk())) {
                A012.A0D("context", sb.toString());
                sb.setLength(0);
            }
            if (A02(sb, m59Arr)) {
                A012.A0D("context_value", sb.toString());
                sb.setLength(0);
            }
            if (A02(sb, strArr2)) {
                A012.A0D("bucket", sb.toString());
                sb.setLength(0);
            }
            if (A02(sb, hwT.AwM())) {
                A012.A0D("monitor", sb.toString());
                sb.setLength(0);
            }
            if (A02(sb, m59Arr2)) {
                A012.A0D("monitor_value", sb.toString());
                sb.setLength(0);
            }
            if (A02(sb, m59Arr3)) {
                A012.A0D("result", sb.toString());
                sb.setLength(0);
            } else {
                A012.A0D("result", "INVALID");
            }
            A00(hwT, A012);
            this.A00.Cd7(A012);
        }
    }

    public final void CZT(C33891HwT hwT, String str, int i) {
        this.A01.CZT(hwT, str, 10);
        if (this.A02.nextInt(10) == 0) {
            C15730rn A012 = C15730rn.A01("ig_contextual_config_micro_exposure_exception", (String) null);
            A01(hwT, A012);
            A012.A0D("exception", str);
            A00(hwT, A012);
            this.A00.Cd7(A012);
        }
    }

    public C10520iU(C11660kZ r2) {
        this.A00 = r2;
    }

    private void A00(C33891HwT hwT, C15730rn r5) {
        GLN B5n = hwT.B5n();
        if (!B5n.A04() && this.A02.nextInt(10) == 0) {
            r5.A0D("json", B5n.A01());
            B5n.A03();
        }
    }

    public static void A01(C33891HwT hwT, C15730rn r4) {
        Map A022 = hwT.B5n().A02();
        if (!A022.isEmpty()) {
            for (Map.Entry entry : A022.entrySet()) {
                r4.A0D((String) entry.getKey(), (String) entry.getValue());
            }
        }
        r4.A08(10, "sample_rate");
        r4.A0D("policy_id", hwT.B23());
        r4.A0D("config_name", hwT.getName());
        r4.A0D(ClientCookie.VERSION_ATTR, hwT.BKd());
        r4.A0C("cfg_ver_timestamp", Long.valueOf(hwT.BD0()));
    }
}
