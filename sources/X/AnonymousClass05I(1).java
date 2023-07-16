package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.05I  reason: invalid class name */
public final class AnonymousClass05I {
    public AnonymousClass05B A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();

    public final Fragment A00(String str) {
        Fragment findFragmentByWho;
        for (AnonymousClass05H r0 : this.A02.values()) {
            if (r0 != null && (findFragmentByWho = r0.A02.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final List A02() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A02.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final List A03() {
        Fragment fragment;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass05H r0 : this.A02.values()) {
            if (r0 != null) {
                fragment = r0.A02;
            } else {
                fragment = null;
            }
            arrayList.add(fragment);
        }
        return arrayList;
    }

    public final List A04() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A01;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public final void A05(Fragment fragment) {
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(fragment)) {
            synchronized (arrayList) {
                arrayList.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    public final void A07(AnonymousClass05H r4) {
        Fragment fragment = r4.A02;
        String str = fragment.mWho;
        HashMap hashMap = this.A02;
        if (hashMap.get(str) == null) {
            hashMap.put(fragment.mWho, r4);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                boolean z = fragment.mRetainInstance;
                AnonymousClass05B r0 = this.A00;
                if (z) {
                    r0.A06(fragment);
                } else {
                    r0.A07(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            C12560m7.A0E(2);
        }
    }

    public final void A08(AnonymousClass05H r4) {
        Fragment fragment = r4.A02;
        if (fragment.mRetainInstance) {
            this.A00.A07(fragment);
        }
        if (this.A02.put(fragment.mWho, (Object) null) != null) {
            C12560m7.A0E(2);
        }
    }

    public final AnonymousClass05B A01() {
        return this.A00;
    }

    public final void A06(AnonymousClass05B r1) {
        this.A00 = r1;
    }
}
