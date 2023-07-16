package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: X.3Gm  reason: invalid class name and case insensitive filesystem */
public final class C58623Gm {
    public static C58623Gm A01;
    public final SharedPreferences A00;

    public final C61253Sm A00() {
        SharedPreferences sharedPreferences = this.A00;
        int i = sharedPreferences.getInt("pw_enc_key_id", -1);
        String string = sharedPreferences.getString("pw_enc_public_key", (String) null);
        sharedPreferences.getLong("pw_enc_key_expiry_timestamp_ms", -1);
        String string2 = sharedPreferences.getString("pw_enc_key_state", (String) null);
        if (i == -1 || string == null || string2 == null) {
            return null;
        }
        return new C61253Sm(i, string, string2);
    }

    public C58623Gm(Context context) {
        this.A00 = AnonymousClass3SL.A00(context, "PasswordEncryptionKeyStorePrefs");
    }

    public final void A01(String str, String str2) {
        String str3 = "ENCRYPTION_WITH_TAGGING";
        C61253Sm r0 = new C61253Sm(Integer.parseInt(str2), C18250wR.A0b(Base64.decode(str, 2)), str3);
        int i = r0.A00;
        String str4 = r0.A02;
        if (1 - r0.A01.intValue() == 0) {
            str3 = "PLAINTEXT_WITH_TAGGING";
        }
        C18180wK.A0v(this.A00.edit().putInt("pw_enc_key_id", i).putString("pw_enc_public_key", str4).putLong("pw_enc_key_expiry_timestamp_ms", -1), "pw_enc_key_state", str3);
    }
}
