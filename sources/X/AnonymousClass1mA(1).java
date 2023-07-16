package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1mA  reason: invalid class name */
public final class AnonymousClass1mA extends AnonymousClass0gG {
    public final /* synthetic */ C19472Awv A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mA(C19472Awv awv) {
        super(52, 4, true, false);
        this.A00 = awv;
    }

    public final void run() {
        C19472Awv awv = this.A00;
        synchronized (awv) {
            SharedPreferences.Editor edit = awv.A00.edit();
            Map map = awv.A02;
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                if (A0o.getValue() == awv) {
                    edit.remove(C18200wM.A0p(A0o));
                } else {
                    Object value = A0o.getValue();
                    if (value instanceof Set) {
                        edit.putStringSet(C18200wM.A0p(A0o), (Set) value);
                    } else if (value instanceof Boolean) {
                        edit.putBoolean(C18200wM.A0p(A0o), AnonymousClass0wJ.A1X(value));
                    } else if (value instanceof Long) {
                        edit.putLong(C18200wM.A0p(A0o), ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        edit.putFloat(C18200wM.A0p(A0o), ((Float) value).floatValue());
                    } else if (value instanceof Integer) {
                        edit.putInt(C18200wM.A0p(A0o), ((Integer) value).intValue());
                    } else {
                        StringBuilder A0r = C18200wM.A0r();
                        A0r.append("try to store unsupport value type ");
                        C10450iM.A03("LazyPreferences", C18200wM.A0m(value, A0r));
                    }
                }
            }
            edit.apply();
            map.clear();
        }
    }
}
