package X;

import androidx.compose.animation.core.Animatable$runAnimation$2;
import androidx.compose.animation.core.Animatable$snapTo$2;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0701000_I2;

/* renamed from: X.7JH  reason: invalid class name */
public final class AnonymousClass7JH {
    public C1203479u A00;
    public C1203479u A01;
    public Object A02;
    public Object A03;
    public final AnonymousClass7WW A04;
    public final C1203479u A05;
    public final C1203479u A06;
    public final C106696fS A07 = new C106696fS();
    public final AnonymousClass8cW A08;
    public final C147368pE A09;
    public final C147368pE A0A;
    public final C122777Tu A0B;
    public final Object A0C;

    public AnonymousClass7JH(AnonymousClass8cW r12, Object obj, Object obj2, String str) {
        C18180wK.A1Q(r12, 2, str);
        this.A08 = r12;
        this.A0C = obj2;
        this.A04 = new AnonymousClass7WW((C1203479u) null, r12, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A09 = C86104wH.A0I(r2, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0A = C86104wH.A0I(r2, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0B = C122777Tu.A00(obj2);
        C1203479u A002 = AnonymousClass7U0.A00(this.A08, obj);
        int A022 = A002.A02();
        for (int i = 0; i < A022; i++) {
            A002.A04(i, Float.NEGATIVE_INFINITY);
        }
        this.A05 = A002;
        C1203479u A003 = AnonymousClass7U0.A00(this.A08, obj);
        int A023 = A003.A02();
        for (int i2 = 0; i2 < A023; i2++) {
            A003.A04(i2, Float.POSITIVE_INFINITY);
        }
        this.A06 = A003;
        this.A00 = A002;
        this.A01 = A003;
    }

    public static AnonymousClass7JH A00(AnonymousClass8cW r3, Object obj) {
        C04220Ms.A0B(r3, 2);
        return new AnonymousClass7JH(r3, obj, (Object) null, "Animatable");
    }

    public static /* synthetic */ Object A02(AnonymousClass7JH r10, C142638fL r11, Object obj, Object obj2, C146958n9 r14, AnonymousClass0YY r15, int i) {
        AnonymousClass0YY r6 = r15;
        Object obj3 = obj2;
        C142638fL r8 = r11;
        AnonymousClass7JH r2 = r10;
        if ((i & 2) != 0) {
            r8 = r10.A0B;
        }
        if ((i & 4) != 0) {
            obj3 = ((AnonymousClass7U0) r10.A08).A00.invoke(r10.A04.A02);
        }
        if ((i & 8) != 0) {
            r6 = null;
        }
        AnonymousClass7WW r1 = r10.A04;
        Object value = r1.A05.getValue();
        AnonymousClass8cW r102 = r10.A08;
        C04220Ms.A0B(r8, 0);
        C122667Tj r7 = new C122667Tj(r8, (C1203479u) ((AnonymousClass7U0) r102).A01.invoke(obj3), r102, value, obj);
        long j = r1.A01;
        return AnonymousClass7Ja.A01(r14, new KtSLambdaShape1S0701000_I2(AnonymousClass006.A00, r2.A07, new Animatable$runAnimation$2(r2, r7, obj3, (C146958n9) null, r6, j), (C146958n9) null, 0));
    }

    public static Object A01(AnonymousClass7JH r0) {
        return r0.A04.A05.getValue();
    }

    public static final Object A03(AnonymousClass7JH r8, Object obj) {
        if (!C04220Ms.A0I(r8.A00, r8.A05) || !C04220Ms.A0I(r8.A01, r8.A06)) {
            AnonymousClass7U0 r6 = (AnonymousClass7U0) r8.A08;
            C1203479u r5 = (C1203479u) r6.A01.invoke(obj);
            int A022 = r5.A02();
            boolean z = false;
            for (int i = 0; i < A022; i++) {
                float A012 = r5.A01(i);
                C1203479u r7 = r8.A00;
                if (A012 < r7.A01(i) || r5.A01(i) > r8.A01.A01(i)) {
                    r5.A04(i, AnonymousClass8bI.A01(r5.A01(i), r7.A01(i), r8.A01.A01(i)));
                    z = true;
                }
            }
            if (z) {
                return r6.A00.invoke(r5);
            }
        }
        return obj;
    }

    public static final void A04(AnonymousClass7JH r3) {
        AnonymousClass7WW r2 = r3.A04;
        C1203479u r1 = r2.A02;
        if (r1 instanceof AnonymousClass52c) {
            AnonymousClass52c r12 = (AnonymousClass52c) r1;
            r12.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            r12.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            r12.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            r12.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else if (r1 instanceof AnonymousClass52b) {
            AnonymousClass52b r13 = (AnonymousClass52b) r1;
            r13.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            r13.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            ((AnonymousClass52a) r1).A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        r2.A01 = Long.MIN_VALUE;
        C147368pE.A04(r3.A09, false);
    }

    public final Object A05(Object obj, C146958n9 r8) {
        Object A012 = AnonymousClass7Ja.A01(r8, new KtSLambdaShape1S0701000_I2(AnonymousClass006.A00, this.A07, new Animatable$snapTo$2(this, obj, (C146958n9) null), (C146958n9) null, 0));
        if (A012 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A012;
    }
}
