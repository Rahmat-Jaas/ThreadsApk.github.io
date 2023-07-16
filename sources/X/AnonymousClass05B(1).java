package X;

import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxFactoryShape147S0000000_I2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.05B  reason: invalid class name */
public final class AnonymousClass05B extends C62793ak {
    public static final C147138nS A06 = new IDxFactoryShape147S0000000_I2(0);
    public boolean A00 = false;
    public boolean A01 = false;
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final boolean A05;

    public final void A08(Fragment fragment) {
        C12560m7.A0E(3);
        A01(fragment.mWho);
    }

    public final void A09(String str) {
        C12560m7.A0E(3);
        A01(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass05B r5 = (AnonymousClass05B) obj;
            if (!this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public final void onCleared() {
        C12560m7.A0E(3);
        this.A00 = true;
    }

    public static AnonymousClass05B A00(AnonymousClass06B r2) {
        return (AnonymousClass05B) new AnonymousClass7IU(A06, r2).A01(AnonymousClass05B.class);
    }

    private void A01(String str) {
        HashMap hashMap = this.A02;
        AnonymousClass05B r0 = (AnonymousClass05B) hashMap.get(str);
        if (r0 != null) {
            r0.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.A04;
        AnonymousClass06B r02 = (AnonymousClass06B) hashMap2.get(str);
        if (r02 != null) {
            r02.A00();
            hashMap2.remove(str);
        }
    }

    public final Fragment A02(String str) {
        return (Fragment) this.A03.get(str);
    }

    public final AnonymousClass05B A03(Fragment fragment) {
        HashMap hashMap = this.A02;
        AnonymousClass05B r1 = (AnonymousClass05B) hashMap.get(fragment.mWho);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass05B r12 = new AnonymousClass05B(this.A05);
        hashMap.put(fragment.mWho, r12);
        return r12;
    }

    public final AnonymousClass06B A04(Fragment fragment) {
        HashMap hashMap = this.A04;
        AnonymousClass06B r1 = (AnonymousClass06B) hashMap.get(fragment.mWho);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass06B r12 = new AnonymousClass06B();
        hashMap.put(fragment.mWho, r12);
        return r12;
    }

    public final Collection A05() {
        return new ArrayList(this.A03.values());
    }

    public final void A06(Fragment fragment) {
        if (!this.A01) {
            HashMap hashMap = this.A03;
            if (!hashMap.containsKey(fragment.mWho)) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                return;
            }
        }
        C12560m7.A0E(2);
    }

    public final void A07(Fragment fragment) {
        if (this.A01 || this.A03.remove(fragment.mWho) != null) {
            C12560m7.A0E(2);
        }
    }

    public final boolean A0C(Fragment fragment) {
        if (!this.A03.containsKey(fragment.mWho) || !this.A05) {
            return true;
        }
        return this.A00;
    }

    public final int hashCode() {
        return (((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A02.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A04.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass05B(boolean z) {
        this.A05 = z;
    }

    public final boolean A0B() {
        return this.A00;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}
