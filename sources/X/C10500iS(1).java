package X;

/* renamed from: X.0iS  reason: invalid class name and case insensitive filesystem */
public final class C10500iS implements C41779Mbt {
    public static final C142048dj A00 = new C10510iT();

    private void A00(C33891HwT hwT, int i) {
        A01(hwT, new StringBuilder("EVENT TYPE: ig_contextual_config_micro_exposure_exception\n"), i);
    }

    private void A02(C33891HwT hwT, M59[] m59Arr, M59[] m59Arr2, M59[] m59Arr3, String[] strArr, int i) {
        StringBuilder sb = new StringBuilder("EVENT TYPE: ig_contextual_config_micro_exposure\n");
        A01(hwT, sb, i);
        sb.append(" - RESULT - ");
        if (!A03(" contexts: ", sb, hwT.AZk())) {
            sb.append(" contexts: none");
        }
        if (!A03(" , buckets: ", sb, strArr)) {
            sb.append(" , buckets: none");
        }
        if (!A03(" , values: ", sb, m59Arr)) {
            sb.append(" , values: none");
        }
        if (!A03(" , monitors: ", sb, hwT.AwM())) {
            sb.append(" , monitors: none");
        }
        if (!A03(" , monitor_values: ", sb, m59Arr2)) {
            sb.append(" , monitor_values: none");
        }
        if (!A03(" , result: ", sb, m59Arr3)) {
            sb.append(" , result: INVALID");
        }
    }

    public static boolean A03(String str, StringBuilder sb, Object[] objArr) {
        if (objArr == null) {
            return false;
        }
        if (str != null) {
            sb.append(str);
        }
        C121687Hl.A01(A00, ", ", sb, objArr);
        return true;
    }

    public static void A01(C33891HwT hwT, StringBuilder sb, int i) {
        sb.append(hwT.getName());
        sb.append(" (policy: ");
        sb.append(hwT.B23());
        sb.append(" , ver: ");
        sb.append(hwT.BKd());
        sb.append(" , ver_timestamp: ");
        sb.append(hwT.BD0());
        sb.append(" , sample_rate: ");
        sb.append(i);
        sb.append(" , ");
        sb.append(hwT.B5n().A00());
        sb.append(")");
    }

    public final void CZT(C33891HwT hwT, String str, int i) {
        A00(hwT, i);
    }

    public final void CZS(C33891HwT hwT, M59[] m59Arr, M59[] m59Arr2, M59[] m59Arr3, String[] strArr, int i) {
        A02(hwT, m59Arr, m59Arr2, m59Arr3, strArr, i);
    }
}
