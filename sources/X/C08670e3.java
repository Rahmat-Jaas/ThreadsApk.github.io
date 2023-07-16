package X;

/* renamed from: X.0e3  reason: invalid class name and case insensitive filesystem */
public final class C08670e3 implements C04560Oe {
    public static final C08670e3 A00 = new C08670e3();

    public final /* bridge */ /* synthetic */ Object get() {
        String A03 = C07960cV.A03(C08960ea.A00(18859557879021582L));
        int hashCode = A03.hashCode();
        if (hashCode != -1924094359) {
            if (hashCode != 2035184) {
                if (hashCode == 62372158 && A03.equals("ALPHA")) {
                    return C10340iB.ALPHA;
                }
            } else if (A03.equals("BETA")) {
                return C10340iB.BETA;
            }
        } else if (A03.equals("PUBLIC")) {
            return C10340iB.PROD;
        }
        return C10340iB.NONE;
    }
}
