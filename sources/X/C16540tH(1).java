package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.rti.push.client.IDxVWrapperShape31S0000000_I2;

/* renamed from: X.0tH  reason: invalid class name and case insensitive filesystem */
public final class C16540tH implements C16800tl {
    public static final C16800tl A01 = new C16540tH(AnonymousClass006.A01);
    public static final C16800tl A02 = new C16540tH(AnonymousClass006.A07);
    public static final C16800tl A03 = new C16540tH(AnonymousClass006.A0j);
    public final Integer A00;

    public final Bundle AIQ(Context context, Bundle bundle) {
        SharedPreferences A002 = C05340Su.A00(context, this.A00);
        Bundle bundle2 = new Bundle();
        for (String next : bundle.keySet()) {
            try {
                AnonymousClass0tp r0 = (AnonymousClass0tp) Enum.valueOf(AnonymousClass0tp.class, next);
                C16840tq r3 = r0.A00;
                try {
                    r3.A03(bundle2, r3.A01(A002, (Object) null, r0.A01), r0.name());
                } catch (ClassCastException e) {
                    AnonymousClass0LU.A0E("KeyValueWrapper", "sharedPrefsToBundle got ClassCastException", e);
                }
            } catch (IllegalArgumentException e2) {
                AnonymousClass0LU.A0K("SharedPreferencesBasedStateHelper", "aidlBundleKey: %s not exist in FbnsAIDLConstants", e2, next);
            }
        }
        return bundle2;
    }

    public final void AIW(Context context, Bundle bundle) {
        Object string;
        SharedPreferences.Editor edit = C05340Su.A00(context, this.A00).edit();
        for (String next : bundle.keySet()) {
            try {
                AnonymousClass0tp r0 = (AnonymousClass0tp) Enum.valueOf(AnonymousClass0tp.class, next);
                C16840tq r3 = r0.A00;
                String name = r0.name();
                String str = r0.A01;
                try {
                    switch (((IDxVWrapperShape31S0000000_I2) r3).A00) {
                        case 0:
                            string = bundle.getString(name, (String) null);
                            break;
                        case 1:
                            string = Integer.valueOf(bundle.getInt(name, 0));
                            break;
                        case 2:
                            string = Boolean.valueOf(bundle.getBoolean(name, false));
                            break;
                        default:
                            string = Long.valueOf(bundle.getLong(name, Long.MAX_VALUE));
                            break;
                    }
                    r3.A02(edit, string, str);
                } catch (ClassCastException e) {
                    AnonymousClass0LU.A0E("KeyValueWrapper", "bundleToSharedPrefs got ClassCastException", e);
                }
            } catch (IllegalArgumentException e2) {
                AnonymousClass0LU.A0K("SharedPreferencesBasedStateHelper", "aidlBundleKey: %s not exist in FbnsAIDLConstants", e2, next);
            }
        }
        edit.apply();
    }

    public C16540tH(Integer num) {
        this.A00 = num;
    }
}
