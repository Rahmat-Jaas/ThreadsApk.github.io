package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.HashMap;

/* renamed from: X.0es  reason: invalid class name and case insensitive filesystem */
public final class C09110es implements AnonymousClass0WE {
    public C09280fA A00;
    public final HashMap A01 = new HashMap();
    public final /* synthetic */ Object A02;
    public final /* synthetic */ C15030qb A03;

    public final void DAa(AnonymousClass0WQ r7, AnonymousClass0Jz r8, String str, int i, long j, long j2) {
        if (i <= 7) {
            HashMap hashMap = this.A01;
            Number number = (Number) hashMap.get(str);
            int i2 = 1;
            if (number != null) {
                i2 = number.intValue() + 1;
            }
            hashMap.put(str, Integer.valueOf(i2));
            if (i2 <= 1000) {
                C15030qb r3 = this.A03;
                C15680ri r2 = new C15680ri();
                ((C15560rW) this.A02).A00.add(r2);
                r2.A0C("timeSinceStart", Long.valueOf(j));
                r2.A0D(FXPFAccessLibraryDebugFragment.NAME, str);
                if (r7 != null) {
                    C15680ri r0 = new C15680ri();
                    r2.A07(r0, "data");
                    C09280fA r5 = this.A00;
                    if (r5 == null) {
                        r5 = new C09280fA(r3);
                        this.A00 = r5;
                    }
                    r5.A00 = r0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < r7.A00) {
                        String[] strArr = r7.A02;
                        r5.DAn(strArr[i4], strArr[i4 + 1], r7.A01[i3]);
                        i3++;
                        i4 += 2;
                    }
                    C09280fA r1 = this.A00;
                    r1.A00 = null;
                    r1.A01.clear();
                }
            }
        }
    }

    public C09110es(C15030qb r2, Object obj) {
        this.A03 = r2;
        this.A02 = obj;
    }
}
