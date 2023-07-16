package X;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.IDxLambdaShape51S1100000_I2;
import kotlin.jvm.internal.IDxLambdaShape52S1100000_I2;

/* renamed from: X.0dI  reason: invalid class name and case insensitive filesystem */
public abstract class C08390dI {
    public static /* synthetic */ C08410dK A00(C08390dI r3, String str) {
        return new C08410dK(new IDxLambdaShape52S1100000_I2(r3, str, 1), new IDxLambdaShape51S1100000_I2(r3, str, 2));
    }

    public final C08410dK A08(String str) {
        return new C08410dK(new IDxLambdaShape52S1100000_I2(this, str, 2), new IDxLambdaShape51S1100000_I2(this, str, 4));
    }

    public final C08410dK A0A(String str, String str2) {
        C04220Ms.A0B(str2, 1);
        return new C08410dK(new AnonymousClass030(this, str, str2), new IDxLambdaShape51S1100000_I2(this, str, 3));
    }

    public abstract SharedPreferences A0C();

    public final C08410dK A09(String str, int i) {
        return new C08410dK(new AnonymousClass038(this, str, i), new IDxLambdaShape51S1100000_I2(this, str, 1));
    }

    public final C08410dK A0B(String str, boolean z) {
        return new C08410dK(new AnonymousClass03A(this, str, z), new IDxLambdaShape51S1100000_I2(this, str, 0));
    }

    public static final Set A01(SharedPreferences sharedPreferences, String str) {
        Set<String> stringSet = sharedPreferences.getStringSet(str, AnonymousClass4WM.A05());
        if (stringSet != null) {
            return stringSet;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
