package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0ro  reason: invalid class name and case insensitive filesystem */
public final class C15740ro {
    public long A00 = 0;
    public C15780rs A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public Map A04 = new HashMap();

    public final C15710rl A00() {
        if (this.A01 == null || this.A04.isEmpty()) {
            Map map = this.A04;
            if (!map.isEmpty()) {
                this.A01 = new C15780rs(map);
            }
            return new C15710rl(this);
        }
        throw new IllegalArgumentException("TrustedCaller needs to be configured with either a TrustedApp or list of trusted packages");
    }

    public final void A01() {
        this.A00 |= 1;
    }

    public final void A02(C15460rM r3, String str) {
        Set set;
        Map map = this.A04;
        if (!map.containsKey(r3) || (set = (Set) map.get(r3)) == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(str);
            map.put(r3, hashSet);
            return;
        }
        set.add(str);
    }

    public final void A03(C15460rM r3, Set set) {
        Set set2;
        Map map = this.A04;
        if (!map.containsKey(r3) || (set2 = (Set) map.get(r3)) == null) {
            map.put(r3, set);
        } else {
            set2.addAll(set);
        }
    }

    public final void A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A02.add(str);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A03.add(str);
            return;
        }
        throw new IllegalArgumentException();
    }
}
