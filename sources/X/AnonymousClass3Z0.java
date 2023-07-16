package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.redex.IDxComparatorShape94S0000000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Z0  reason: invalid class name */
public class AnonymousClass3Z0 {
    public static final Comparator A04 = new IDxComparatorShape94S0000000_1_I2(11);
    public SharedPreferences A00;
    public final Map A01 = new HashMap(50);
    public final Context A02;
    public final String A03;

    private void A00() {
        if (this.A00 == null) {
            synchronized (this) {
                SharedPreferences sharedPreferences = this.A02.getSharedPreferences(this.A03, 0);
                this.A00 = sharedPreferences;
                Set<String> stringSet = sharedPreferences.getStringSet("seen_ids", C18200wM.A0u());
                if (stringSet != null) {
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        String[] split = A0k.split("\\|");
                        String str = A0k.split("\\|")[0];
                        long j = 0;
                        if (split.length > 1) {
                            try {
                                j = Long.parseLong(split[1]);
                            } catch (NumberFormatException e) {
                                C10450iM.A06("PreferencesSeenStore", "Error parsing long from SharedPreferences", e);
                            }
                        }
                        this.A01.put(str, Long.valueOf(j));
                    }
                }
            }
        }
    }

    public final synchronized boolean A02(String str) {
        A00();
        return C18220wO.A1U(this.A01.put(str, Long.valueOf(C18190wL.A07())));
    }

    public final synchronized boolean A03(String str) {
        A00();
        return this.A01.containsKey(str);
    }

    public final void A01() {
        HashSet hashSet;
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            synchronized (this) {
                Map map = this.A01;
                hashSet = new HashSet(Math.min(map.size(), 200));
                ArrayList A0s = C18200wM.A0s(map.entrySet());
                Collections.sort(A0s, A04);
                Iterator it = A0s.iterator();
                int i = 0;
                while (it.hasNext() && i < 200) {
                    Map.Entry A0o = C18180wK.A0o(it);
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append(C18200wM.A0p(A0o));
                    A0r.append("|");
                    hashSet.add(C18200wM.A0m(A0o.getValue(), A0r));
                    it.remove();
                    i++;
                }
            }
            C18250wR.A0p(edit, "seen_ids", hashSet);
        }
    }

    public AnonymousClass3Z0(Context context, UserSession userSession, String str) {
        this.A02 = context.getApplicationContext();
        this.A03 = AnonymousClass00U.A0V(userSession.getUserId(), "_", str);
    }
}
