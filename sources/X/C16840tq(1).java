package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.rti.push.client.IDxVWrapperShape31S0000000_I2;

/* renamed from: X.0tq  reason: invalid class name and case insensitive filesystem */
public abstract class C16840tq {
    public static final C16840tq A00 = new IDxVWrapperShape31S0000000_I2(2);
    public static final C16840tq A01 = new IDxVWrapperShape31S0000000_I2(1);
    public static final C16840tq A02 = new IDxVWrapperShape31S0000000_I2(3);
    public static final C16840tq A03 = new IDxVWrapperShape31S0000000_I2(0);

    public abstract Class A00();

    public abstract Object A01(SharedPreferences sharedPreferences, Object obj, String str);

    public abstract void A02(SharedPreferences.Editor editor, Object obj, String str);

    public abstract void A03(Bundle bundle, Object obj, String str);
}
