package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2G3  reason: invalid class name */
public final class AnonymousClass2G3 {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        Map A00;
        AnonymousClass601 r5 = r8;
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        String A0E = C63893iY.A0E(r9, 0);
        List list = r9.A00;
        Map map = (Map) list.get(A1Z ? 1 : 0);
        C109326jp A0R = C18190wL.A0R(list, 2);
        C109326jp A0R2 = C18190wL.A0R(list, 3);
        if (map == null) {
            C30967GcS.A02("BKBloksActionBloksAsyncLoadV2Impl", AnonymousClass00U.A0L("params map should not be null when loading: ", A0E));
        }
        if (A0R == null) {
            C30967GcS.A02("BKBloksActionBloksAsyncLoadV2Impl", AnonymousClass00U.A0L("onSuccess expression should not be null when loading: ", A0E));
        }
        if (A0R2 == null) {
            C30967GcS.A02("BKBloksActionBloksAsyncLoadV2Impl", AnonymousClass00U.A0L("onFailure expression should not be null when loading: ", A0E));
        }
        C130667qT A08 = C63913ic.A08(r5);
        C145538kf A0H = C63913ic.A0H(r5);
        C10300i6 A0F = C63913ic.A0F(r5);
        if (map != null) {
            A00 = C63913ic.A0N(map);
        } else {
            A00 = AnonymousClass4To.A00();
        }
        AnonymousClass4A9 A01 = C63263h8.A01(A0F, A0E, A00);
        A01.A00 = new AnonymousClass1eV(A08, r5, A0R, A0R2, A0E);
        A0H.schedule(A01);
        return null;
    }
}
