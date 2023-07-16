package X;

/* renamed from: X.40L  reason: invalid class name */
public final class AnonymousClass40L implements C83324rC {
    public final String DB3() {
        return "client_enabled_time";
    }

    public final AnonymousClass3DC A8q(AnonymousClass3DQ r10, C81224nO r11) {
        boolean z;
        AnonymousClass0wJ.A1N(r11, r10);
        C28291u0 r2 = ((AnonymousClass18L) r11).A01;
        C04220Ms.A06(r2.A0D);
        long j = r2.A04 * 1000;
        long j2 = r2.A02 * 1000;
        long j3 = r10.A00;
        if ((j == 0 || j3 > j) && (j2 == 0 || j3 < j2)) {
            z = true;
        } else {
            z = false;
        }
        C677040a r22 = new C677040a(j, j2, j3);
        if (z) {
            return AnonymousClass3W5.A02(r22);
        }
        return AnonymousClass3W5.A01(r22);
    }
}
