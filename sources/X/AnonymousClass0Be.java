package X;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: X.0Be  reason: invalid class name */
public final class AnonymousClass0Be extends C02690Cl {
    public Object A00 = null;
    public Field A01;
    public Field A02;
    public Field A03;
    public Field A04;
    public final Context A05;

    public static JSONArray A00(AnonymousClass0Be r0, Field field) {
        try {
            int[] iArr = (int[]) field.get(r0.A00);
            if (iArr != null) {
                return new JSONArray(Arrays.asList(new int[][]{iArr}));
            }
            return new JSONArray();
        } catch (Throwable unused) {
            return new JSONArray();
        }
    }

    public AnonymousClass0Be(Context context, boolean z) {
        super(context.getApplicationContext(), z);
        this.A05 = context.getApplicationContext();
    }
}
