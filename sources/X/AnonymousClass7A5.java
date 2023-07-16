package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11;

/* renamed from: X.7A5  reason: invalid class name */
public final class AnonymousClass7A5 {
    public final C142638fL A00;
    public final C142698fR A01 = new AnonymousClass7UN(this);
    public final C147368pE A02;
    public final C147368pE A03;
    public final C147368pE A04;
    public final C147368pE A05;
    public final C147368pE A06;
    public final C81784oM A07;
    public final C81784oM A08;
    public final C81784oM A09;
    public final C105486dV A0A;
    public final C107776hI A0B = new C107776hI();
    public final AnonymousClass0YY A0C;
    public final C81784oM A0D;
    public final AnonymousClass0ZU A0E;
    public final AnonymousClass0YY A0F;

    public static final Object A00(AnonymousClass7A5 r5, Object obj, float f, float f2) {
        boolean z;
        Object A012;
        float A013;
        Map A0t = C86154wM.A0t(r5.A02);
        Float f3 = (Float) A0t.get(obj);
        float A002 = C18240wQ.A00(r5.A0E.invoke());
        if (!C04220Ms.A0G(f3, f) && f3 != null) {
            float floatValue = f3.floatValue();
            if (floatValue < f) {
                z = true;
                if (f2 < A002) {
                    A012 = C117666z3.A01(A0t, f, true);
                    A013 = Math.abs(floatValue + Math.abs(C18240wQ.A00(C86164wN.A0d(r5.A0F, C86124wJ.A01(C18240wQ.A00(AnonymousClass4WJ.A07(A012, A0t)), floatValue)))));
                }
                return C117666z3.A01(A0t, f, z);
            }
            z = false;
            if (f2 > (-A002)) {
                A012 = C117666z3.A01(A0t, f, false);
                A013 = C86124wJ.A01(floatValue, Math.abs(C18240wQ.A00(C86164wN.A0d(r5.A0F, C86124wJ.A01(floatValue, C18240wQ.A00(AnonymousClass4WJ.A07(A012, A0t)))))));
                if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    f = Math.abs(f);
                } else if (f > A013) {
                    return obj;
                } else {
                    return A012;
                }
            }
            return C117666z3.A01(A0t, f, z);
            if (f < A013) {
                return obj;
            }
            return A012;
        }
        return obj;
    }

    public final float A01() {
        Number number = (Number) this.A06.getValue();
        if (number != null) {
            return number.floatValue();
        }
        throw C18180wK.A0a("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final float A02(float f) {
        return AnonymousClass8bI.A01(C86114wI.A00(this.A06) + f, C18240wQ.A00(this.A08.getValue()), C18240wQ.A00(this.A07.getValue()));
    }

    public final Object A03(C146958n9 r3, float f) {
        return C86164wN.A0U(C117666z3.A00(this, A00(this, this.A04.getValue(), A01(), f), r3, f));
    }

    public final boolean A04(Object obj) {
        C107776hI r1 = this.A0B;
        KtLambdaShape18S0200000_I2_2 ktLambdaShape18S0200000_I2_2 = new KtLambdaShape18S0200000_I2_2(36, obj, this);
        C25549Dnh dnh = r1.A01;
        boolean A032 = dnh.A03((Object) null);
        if (A032) {
            try {
                ktLambdaShape18S0200000_I2_2.invoke();
            } finally {
                dnh.A02((Object) null);
            }
        }
        return A032;
    }

    public AnonymousClass7A5(C142638fL r6, Object obj, AnonymousClass0ZU r8, AnonymousClass0YY r9, AnonymousClass0YY r10) {
        this.A0F = r9;
        this.A0E = r8;
        this.A00 = r6;
        this.A0C = r10;
        AnonymousClass7WR r3 = AnonymousClass7WR.A00;
        this.A04 = C86104wH.A0I(r3, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A09 = C123267Wf.A01(new KtLambdaShape31S0100000_I2_11(this, 29));
        this.A06 = C86104wH.A0I(r3, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0D = C123267Wf.A01(new KtLambdaShape31S0100000_I2_11(this, 28));
        this.A05 = C86104wH.A0I(r3, C86124wJ.A0g(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = C123267Wf.A01(new KtLambdaShape31S0100000_I2_11(this, 27));
        this.A07 = C123267Wf.A01(new KtLambdaShape31S0100000_I2_11(this, 26));
        this.A03 = C86104wH.A0I(r3, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = C86104wH.A0I(r3, AnonymousClass4WJ.A0A(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0A = new C105486dV(this);
    }
}
