package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.3Bt  reason: invalid class name and case insensitive filesystem */
public final class C57613Bt {
    public long A00;
    public long A01;
    public long A02;
    public Date A03;

    public C57613Bt(String str, long j, long j2) {
        C04220Ms.A0B(str, 1);
        this.A01 = j;
        this.A00 = j2;
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        C18190wL.A1W(instance);
        Date time = instance.getTime();
        C04220Ms.A06(time);
        this.A03 = time;
    }
}
