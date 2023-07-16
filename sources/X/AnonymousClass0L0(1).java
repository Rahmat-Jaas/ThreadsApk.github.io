package X;

import com.facebook.reliability.fssync.NoSync;

/* renamed from: X.0L0  reason: invalid class name */
public final class AnonymousClass0L0 extends C07490bb {
    public final String A09() {
        return "NoSyncFixer";
    }

    public final void A0A() {
        String str;
        if (A03(AnonymousClass0L1.class) == null) {
            return;
        }
        if (!AnonymousClass0FX.A02() || C07960cV.A05(AnonymousClass0e5.A00(36316881952837004L))) {
            AnonymousClass0KX r0 = AnonymousClass0KY.A00().A00;
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = null;
            }
            if (!"videoplayer".equals(str)) {
                AnonymousClass0LU.A0C("Fixie/NoSyncFixer", "Enable NoSync");
                C15020qa.A0A("fssync");
                NoSync.disableFSSync(true);
                A06();
            }
        }
    }

    public AnonymousClass0L0(C05130Ra r1) {
        super(r1);
    }
}
