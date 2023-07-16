package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Pair;

/* renamed from: X.53U  reason: invalid class name */
public final class AnonymousClass53U extends C113516rY {
    public static final Object A03 = C86144wL.A0d();
    public int A00;
    public AnonymousClass7EA A01;
    public Object A02 = A03;

    public final int A03(C147358pD r12, Snapshot snapshot) {
        AnonymousClass7EA r8;
        IllegalStateException illegalStateException;
        C113516rY A032;
        synchronized (C122127Kl.A04) {
            r8 = this.A01;
        }
        int i = 7;
        if (r8 != null) {
            AnonymousClass84X r5 = (AnonymousClass84X) C1191373q.A01.A00();
            int i2 = 0;
            if (r5 == null) {
                r5 = AnonymousClass84X.A01(new Pair[0]);
            }
            int i3 = r5.A00;
            if (i3 > 0) {
                Object[] objArr = r5.A01;
                int i4 = 0;
                do {
                    C86134wK.A1L(((Pair) objArr[i4]).A00, r12);
                    i4++;
                } while (i4 < i3);
            }
            try {
                int i5 = r8.A00;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = r8.A01[i6];
                    C04220Ms.A0C(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    C145738l0 r2 = (C145738l0) obj;
                    if (AnonymousClass0wJ.A04(r8.A02[i6]) == 1) {
                        if (r2 instanceof C123267Wf) {
                            C123267Wf r22 = (C123267Wf) r2;
                            AnonymousClass53U r0 = r22.A00;
                            C04220Ms.A0B(r0, 0);
                            C113516rY A033 = Snapshot.A03(snapshot, r0);
                            if (A033 != null) {
                                A032 = C123267Wf.A00((AnonymousClass53U) A033, r22, snapshot, r22.A01, false);
                            } else {
                                illegalStateException = C18180wK.A0a("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                throw illegalStateException;
                            }
                        } else {
                            C113516rY Ail = r2.Ail();
                            C04220Ms.A0B(Ail, 0);
                            A032 = Snapshot.A03(snapshot, Ail);
                            if (A032 == null) {
                                illegalStateException = C18180wK.A0a("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                throw illegalStateException;
                            }
                        }
                        i = (((i * 31) + System.identityHashCode(A032)) * 31) + A032.A00;
                    }
                }
                int i7 = r5.A00;
                if (i7 > 0) {
                    Object[] objArr2 = r5.A01;
                    do {
                        C86134wK.A1L(((Pair) objArr2[i2]).A01, r12);
                        i2++;
                    } while (i2 < i7);
                }
            } catch (Throwable th) {
                int i8 = r5.A00;
                if (i8 > 0) {
                    Object[] objArr3 = r5.A01;
                    do {
                        C86134wK.A1L(((Pair) objArr3[i2]).A01, r12);
                        i2++;
                    } while (i2 < i8);
                }
                throw th;
            }
        }
        return i;
    }
}
