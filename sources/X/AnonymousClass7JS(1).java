package X;

import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import java.util.Arrays;

/* renamed from: X.7JS  reason: invalid class name */
public final class AnonymousClass7JS {
    public static void A05(C147188nY r17, int i) {
        C147188nY r1 = r17;
        AnonymousClass7I9.A02(r1, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, A01(r1, i), 0, 0, 0, 0, 0, 4094, 0, 0, false);
    }

    public static void A06(C147188nY r27, int i) {
        C147188nY r2 = r27;
        String A01 = A01(r2, i);
        long j = C120537Bh.A00(r2).A0m;
        long A03 = AnonymousClass7Hi.A03(17);
        AnonymousClass7I9.A02(r2, (Modifier) null, C120537Bh.A02(r2).A06.A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196607, 0, 0, AnonymousClass7Hi.A03(22))), (C114236su) null, C134817yQ.A05, new C121117Ee(3), A01, 0, 0, 0, 199680, 0, 1938, j, A03, false);
    }

    public static final String A01(C147188nY r1, int i) {
        r1.AEA(AnonymousClass7DA.A00);
        Resources resources = C147188nY.A0T(r1).getResources();
        C04220Ms.A06(resources);
        return C18190wL.A0g(resources, i);
    }

    public static final String A03(C147188nY r1, Object[] objArr, int i) {
        r1.AEA(AnonymousClass7DA.A00);
        Resources resources = C147188nY.A0T(r1).getResources();
        C04220Ms.A06(resources);
        String string = resources.getString(i, Arrays.copyOf(objArr, objArr.length));
        C04220Ms.A06(string);
        return string;
    }

    public static final String A04(C147188nY r1, Object[] objArr, int i, int i2) {
        r1.AEA(AnonymousClass7DA.A00);
        Resources resources = C147188nY.A0T(r1).getResources();
        C04220Ms.A06(resources);
        String quantityString = resources.getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        C04220Ms.A06(quantityString);
        return quantityString;
    }

    public static String A00(C147188nY r1) {
        return A01(r1, R.string.f0nameremoved);
    }

    public static String A02(C147188nY r1, Object obj, int i) {
        return A03(r1, new Object[]{obj}, i);
    }
}
