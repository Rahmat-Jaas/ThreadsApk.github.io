package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7HJ  reason: invalid class name */
public final class AnonymousClass7HJ {
    public static AnonymousClass7HJ A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public final GoogleSignInAccount A02() {
        String A04;
        Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String A042 = A04("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A042) && (A04 = A04(A01("googleSignInAccount", A042))) != null) {
            try {
                String str6 = null;
                if (!TextUtils.isEmpty(A04)) {
                    JSONObject A0j = C18250wR.A0j(A04);
                    String optString = A0j.optString("photoUrl");
                    if (!TextUtils.isEmpty(optString)) {
                        uri = Uri.parse(optString);
                    } else {
                        uri = null;
                    }
                    long parseLong = Long.parseLong(A0j.getString("expirationTime"));
                    HashSet A0u = C18200wM.A0u();
                    JSONArray jSONArray = A0j.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A0u.add(new Scope(1, jSONArray.getString(i)));
                    }
                    String optString2 = A0j.optString("id");
                    if (A0j.has("tokenId")) {
                        str = A0j.optString("tokenId");
                    } else {
                        str = null;
                    }
                    if (A0j.has("email")) {
                        str2 = A0j.optString("email");
                    } else {
                        str2 = null;
                    }
                    if (A0j.has("displayName")) {
                        str3 = A0j.optString("displayName");
                    } else {
                        str3 = null;
                    }
                    if (A0j.has("givenName")) {
                        str4 = A0j.optString("givenName");
                    } else {
                        str4 = null;
                    }
                    if (A0j.has("familyName")) {
                        str5 = A0j.optString("familyName");
                    } else {
                        str5 = null;
                    }
                    String string = A0j.getString("obfuscatedIdentifier");
                    C13320nQ.A03(string);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(uri, optString2, str, str2, str3, (String) null, string, str4, str5, C18200wM.A0s(A0u), 3, parseLong);
                    if (A0j.has("serverAuthCode")) {
                        str6 = A0j.optString("serverAuthCode");
                    }
                    googleSignInAccount.A06 = str6;
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions A03() {
        String A04;
        String str;
        Account account;
        String str2;
        String A042 = A04("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A042) && (A04 = A04(A01("googleSignInOptions", A042))) != null) {
            try {
                String str3 = null;
                if (!TextUtils.isEmpty(A04)) {
                    JSONObject A0j = C18250wR.A0j(A04);
                    HashSet A0u = C18200wM.A0u();
                    JSONArray jSONArray = A0j.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A0u.add(new Scope(1, jSONArray.getString(i)));
                    }
                    if (A0j.has("accountName")) {
                        str = A0j.optString("accountName");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        account = new Account(str, "com.google");
                    } else {
                        account = null;
                    }
                    ArrayList A0s = C18200wM.A0s(A0u);
                    boolean z = A0j.getBoolean("idTokenRequested");
                    boolean z2 = A0j.getBoolean("serverAuthRequested");
                    boolean z3 = A0j.getBoolean("forceCodeForRefreshToken");
                    if (A0j.has("serverClientId")) {
                        str2 = A0j.optString("serverClientId");
                    } else {
                        str2 = null;
                    }
                    if (A0j.has("hostedDomain")) {
                        str3 = A0j.optString("hostedDomain");
                    }
                    return new GoogleSignInOptions(account, str2, str3, (String) null, A0s, AnonymousClass0wJ.A0y(), 3, z, z2, z3);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String A04(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            return this.A00.getString(str, (String) null);
        } finally {
            lock.unlock();
        }
    }

    public final void A05(String str, String str2) {
        Lock lock = this.A01;
        lock.lock();
        try {
            C18180wK.A0v(this.A00.edit(), str, str2);
        } finally {
            lock.unlock();
        }
    }

    public AnonymousClass7HJ(Context context) {
        this.A00 = C86164wN.A0C(context, "com.google.android.gms.signin");
    }

    public static AnonymousClass7HJ A00(Context context) {
        C13320nQ.A01(context);
        Lock lock = A03;
        lock.lock();
        try {
            AnonymousClass7HJ r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass7HJ(context.getApplicationContext());
                A02 = r1;
            }
            return r1;
        } finally {
            lock.unlock();
        }
    }

    public static final String A01(String str, String str2) {
        StringBuilder A0s = C86114wI.A0s(str.length() + 1 + C86104wH.A0A(str2));
        A0s.append(str);
        A0s.append(":");
        return C18180wK.A0i(str2, A0s);
    }
}
