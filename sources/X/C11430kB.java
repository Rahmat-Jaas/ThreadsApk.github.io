package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.0kB  reason: invalid class name and case insensitive filesystem */
public final class C11430kB implements AnonymousClass055 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ C12560m7 A03;

    public C11430kB(C12560m7 r1, String str, int i, int i2) {
        this.A03 = r1;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean ANg(ArrayList arrayList, ArrayList arrayList2) {
        C12560m7 r2 = this.A03;
        Fragment fragment = r2.A06;
        if (fragment != null && this.A01 < 0 && this.A02 == null && fragment.getChildFragmentManager().A16()) {
            return false;
        }
        return r2.A1D(this.A02, arrayList, arrayList2, this.A01, this.A00);
    }
}
