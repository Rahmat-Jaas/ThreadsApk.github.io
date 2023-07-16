package X;

import androidx.compose.animation.core.MutableTransitionState;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

/* renamed from: X.6vT  reason: invalid class name and case insensitive filesystem */
public final class C115556vT {
    public long A00;
    public final MutableTransitionState A01;
    public final C147368pE A02;
    public final C147368pE A03;
    public final C147368pE A04;
    public final C147368pE A05;
    public final C147368pE A06;
    public final C147368pE A07;
    public final C81784oM A08;
    public final AnonymousClass84D A09 = new AnonymousClass84D();
    public final AnonymousClass84D A0A = new AnonymousClass84D();
    public final String A0B;

    public C115556vT(MutableTransitionState mutableTransitionState, String str) {
        this.A01 = mutableTransitionState;
        this.A0B = str;
        Object value = mutableTransitionState.A00.getValue();
        AnonymousClass7WR r3 = AnonymousClass7WR.A00;
        this.A06 = C86104wH.A0I(r3, value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A04 = C86104wH.A0I(r3, new C122817Ty(MutableTransitionState.A00(this), MutableTransitionState.A00(this)), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = C86104wH.A0I(r3, C18210wN.A0V(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A05 = C86104wH.A0I(r3, Long.MIN_VALUE, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A07 = C86104wH.A0I(r3, true, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = C86104wH.A0I(r3, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = C123267Wf.A01(C86154wM.A12(this, 4));
    }

    public final void A00() {
        this.A05.CrC(Long.MIN_VALUE);
        Object value = this.A06.getValue();
        MutableTransitionState mutableTransitionState = this.A01;
        mutableTransitionState.A00.CrC(value);
        this.A03.CrC(0L);
        C147368pE.A04(mutableTransitionState.A01, false);
    }

    public final void A01(long j, float f) {
        long j2;
        C147368pE r5 = this.A05;
        if (C18190wL.A08(r5.getValue()) == Long.MIN_VALUE) {
            r5.CrC(Long.valueOf(j));
            C147368pE.A04(this.A01.A01, true);
        }
        C147368pE.A04(this.A07, false);
        C147368pE r52 = this.A03;
        r52.CrC(Long.valueOf(j - C18190wL.A08(r5.getValue())));
        boolean z = true;
        Iterator it = this.A09.iterator();
        while (true) {
            float f2 = f;
            if (it.hasNext()) {
                AnonymousClass7WX r6 = (AnonymousClass7WX) it.next();
                C147368pE r4 = r6.A05;
                if (!C86104wH.A1X(r4)) {
                    long A082 = C18190wL.A08(r52.getValue());
                    if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        C147368pE r10 = r6.A07;
                        float A083 = ((float) (A082 - C18190wL.A08(r10.getValue()))) / f;
                        if (!Float.isNaN(A083)) {
                            j2 = (long) A083;
                        } else {
                            StringBuilder A0s = C18190wL.A0s("Duration scale adjusted time is NaN. Duration scale: ");
                            A0s.append(f2);
                            A0s.append(",playTimeNanos: ");
                            A0s.append(A082);
                            A0s.append(", offsetTimeNanos: ");
                            throw C18180wK.A0a(C86154wM.A0n(A0s, C18190wL.A08(r10.getValue())));
                        }
                    } else {
                        j2 = ((C122667Tj) r6.A03.getValue()).A00;
                    }
                    C147368pE r7 = r6.A03;
                    r6.A09.CrC(((C122667Tj) r7.getValue()).BKK(j2));
                    r6.A00 = ((C122667Tj) r7.getValue()).BKY(j2);
                    if (((C122667Tj) r7.getValue()).BUF(j2)) {
                        C147368pE.A04(r4, true);
                        r6.A07.CrC(0L);
                    }
                }
                if (!C86104wH.A1X(r4)) {
                    z = false;
                }
            } else {
                Iterator it2 = this.A0A.iterator();
                while (it2.hasNext()) {
                    C115556vT r42 = (C115556vT) it2.next();
                    C147368pE r3 = r42.A06;
                    Object value = r3.getValue();
                    C147368pE r2 = r42.A01.A00;
                    if (!C86124wJ.A1Y(r2, value)) {
                        r42.A01(C18190wL.A08(r52.getValue()), f2);
                    }
                    if (!C86124wJ.A1Y(r2, r3.getValue())) {
                        z = false;
                    }
                }
                if (z) {
                    A00();
                    return;
                }
                return;
            }
        }
    }

    public final void A04(Object obj, long j, Object obj2) {
        this.A05.CrC(Long.MIN_VALUE);
        MutableTransitionState mutableTransitionState = this.A01;
        C147368pE.A04(mutableTransitionState.A01, false);
        C147368pE r1 = this.A02;
        if (!C86104wH.A1X(r1) || !C04220Ms.A0I(mutableTransitionState.A00.getValue(), obj) || !C04220Ms.A0I(this.A06.getValue(), obj2)) {
            mutableTransitionState.A00.CrC(obj);
            this.A06.CrC(obj2);
            C147368pE.A04(r1, true);
            this.A04.CrC(new C122817Ty(obj, obj2));
        }
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            C115556vT r2 = (C115556vT) it.next();
            C04220Ms.A0C(r2, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (C86104wH.A1X(r2.A02)) {
                r2.A04(MutableTransitionState.A00(r2), j, r2.A06.getValue());
            }
        }
        Iterator it2 = this.A09.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass7WX) it2.next()).A01(j);
        }
        this.A00 = j;
    }

    public final boolean A05() {
        return C18180wK.A1V((C18190wL.A08(this.A05.getValue()) > Long.MIN_VALUE ? 1 : (C18190wL.A08(this.A05.getValue()) == Long.MIN_VALUE ? 0 : -1)));
    }

    public final void A02(C147188nY r5, Object obj, int i) {
        int i2;
        r5.Cvd(-1493585151);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r5, obj) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r5, this);
        }
        if ((i2 & 91) == 18 && r5.BCM()) {
            r5.CuJ();
        } else if (!C86104wH.A1X(this.A02)) {
            A03(r5, obj, (i2 & 14) | (i2 & 112));
            if (!C04220Ms.A0I(obj, MutableTransitionState.A00(this)) || A05() || C86104wH.A1X(this.A07)) {
                boolean A0y = C147188nY.A0y(r5, this);
                AnonymousClass7W3 r3 = (AnonymousClass7W3) r5;
                Object A13 = r3.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtSLambdaShape14S0201000_I2(this, (C146958n9) null, 1);
                    r3.A14(A13);
                }
                AnonymousClass7W3.A0b(r5, r3, A13, this, false);
            }
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, this, obj, i, 0);
        }
    }

    public final void A03(C147188nY r4, Object obj, int i) {
        int i2;
        r4.Cvd(-583974681);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, obj) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r4, this);
        }
        if ((i2 & 91) == 18 && r4.BCM()) {
            r4.CuJ();
        } else if (!C86104wH.A1X(this.A02)) {
            C147368pE r2 = this.A06;
            if (!C04220Ms.A0I(r2.getValue(), obj)) {
                this.A04.CrC(new C122817Ty(r2.getValue(), obj));
                this.A01.A00.CrC(r2.getValue());
                r2.CrC(obj);
                if (!A05()) {
                    C147368pE.A04(this.A07, true);
                }
                Iterator it = this.A09.iterator();
                while (it.hasNext()) {
                    C147368pE.A04(((AnonymousClass7WX) it.next()).A06, true);
                }
            }
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, this, obj, i, 1);
        }
    }
}
