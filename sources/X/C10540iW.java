package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0iW  reason: invalid class name and case insensitive filesystem */
public final class C10540iW implements C08780eH {
    public final UserSession A00;
    public final SharedPreferences A01;

    public final Set CZ2() {
        HashSet hashSet = new HashSet();
        Map<String, ?> all = this.A01.getAll();
        for (String next : all.keySet()) {
            Object obj = all.get(next);
            if (!(obj instanceof String)) {
                StringBuilder sb = new StringBuilder("Unknown type in view info store: ");
                sb.append(obj);
                sb.append(" for key ");
                sb.append(next);
                C10450iM.A07("PreferencesStoreAdapter", new IllegalArgumentException(sb.toString()));
            }
            try {
                hashSet.add(C08880eS.A02((String) obj));
            } catch (IOException e) {
                C10450iM.A07("PreferencesStoreAdapter", e);
            }
        }
        return hashSet;
    }

    public final void DBK(Set set) {
        SharedPreferences.Editor edit = this.A01.edit();
        edit.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C08890eT r0 = (C08890eT) it.next();
            try {
                edit.putString(r0.A03, C08880eS.A03(r0));
            } catch (IOException e) {
                C10450iM.A07("PreferencesStoreAdapter", e);
            }
        }
        edit.commit();
    }

    public C10540iW(Context context, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = context.getSharedPreferences(AnonymousClass00U.A0V(userSession.getUserId(), "_", "ViewInfoStore"), 0);
    }
}
