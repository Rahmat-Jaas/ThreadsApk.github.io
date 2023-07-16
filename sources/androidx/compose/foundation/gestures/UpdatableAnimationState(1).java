package androidx.compose.foundation.gestures;

import X.AnonymousClass52a;
import X.AnonymousClass7U0;
import X.AnonymousClass7U1;
import X.AnonymousClass8cW;
import X.C04220Ms;
import X.C103866ar;
import X.C1203479u;
import X.C122777Tu;
import com.facebook.react.uimanager.BaseViewManager;

public final class UpdatableAnimationState {
    public static final AnonymousClass52a A04 = new AnonymousClass52a(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final AnonymousClass7U1 A05;
    public float A00;
    public long A01 = Long.MIN_VALUE;
    public AnonymousClass52a A02 = A04;
    public boolean A03;

    static {
        C1203479u A002;
        C122777Tu r2 = new C122777Tu((Object) null, 1.0f, 1500.0f);
        AnonymousClass8cW r1 = C103866ar.A02;
        C04220Ms.A0B(r1, 0);
        Object obj = r2.A02;
        if (obj == null) {
            A002 = null;
        } else {
            A002 = AnonymousClass7U0.A00(r1, obj);
        }
        A05 = new AnonymousClass7U1(A002, 1.0f, 1500.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (X.C18180wK.A1W((r9 > com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (r9 == com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1))) == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A[SYNTHETIC, Splitter:B:25:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9 A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r13, X.AnonymousClass0ZU r14, X.AnonymousClass0YY r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C137818Ag
            if (r0 == 0) goto L_0x002e
            r7 = r13
            X.8Ag r7 = (X.C137818Ag) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r7.A01 = r2
        L_0x0012:
            java.lang.Object r10 = r7.A05
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A01
            r11 = 0
            r1 = -9223372036854775808
            r8 = 2
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 == r3) goto L_0x0039
            if (r0 != r8) goto L_0x0034
            java.lang.Object r14 = r7.A03
            X.0ZU r14 = (X.AnonymousClass0ZU) r14
            java.lang.Object r4 = r7.A02
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x00c2
        L_0x002e:
            X.8Ag r7 = new X.8Ag
            r7.<init>(r12, r13)
            goto L_0x0012
        L_0x0034:
            java.lang.IllegalStateException r3 = X.AnonymousClass0wJ.A0a()
            throw r3
        L_0x0039:
            float r9 = r7.A00
            java.lang.Object r14 = r7.A04
            X.0ZU r14 = (X.AnonymousClass0ZU) r14
            java.lang.Object r15 = r7.A03
            java.lang.Object r4 = r7.A02
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x008f
        L_0x0046:
            X.AnonymousClass0OU.A00(r10)
            boolean r0 = r12.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00dd
            X.Ew2 r4 = r7.getContext()
            X.864 r0 = X.C148818sE.A00
            X.8sH r0 = r4.AOA(r0)
            X.8sE r0 = (X.C148818sE) r0
            if (r0 == 0) goto L_0x0065
            float r9 = r0.B8n()
        L_0x0061:
            r12.A03 = r3
            r4 = r12
            goto L_0x0068
        L_0x0065:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0061
        L_0x0068:
            float r0 = r4.A00     // Catch:{ all -> 0x00d3 }
            float r10 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00d3 }
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r0 = X.C86124wJ.A1X(r0)
            if (r0 != 0) goto L_0x009f
            kotlin.jvm.internal.KtLambdaShape2S0200001_I2 r0 = new kotlin.jvm.internal.KtLambdaShape2S0200001_I2     // Catch:{ all -> 0x00d3 }
            r0.<init>(r15, r4, r9, r8)     // Catch:{ all -> 0x00d3 }
            r7.A02 = r4     // Catch:{ all -> 0x00d3 }
            r7.A03 = r15     // Catch:{ all -> 0x00d3 }
            r7.A04 = r14     // Catch:{ all -> 0x00d3 }
            r7.A00 = r9     // Catch:{ all -> 0x00d3 }
            r7.A01 = r3     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = X.AnonymousClass6EJ.A00(r7, r0)     // Catch:{ all -> 0x00d3 }
            if (r0 != r6) goto L_0x0092
            goto L_0x009e
        L_0x008f:
            X.AnonymousClass0OU.A00(r10)     // Catch:{ all -> 0x00d3 }
        L_0x0092:
            r14.invoke()     // Catch:{ all -> 0x00d3 }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 == 0) goto L_0x0068
            goto L_0x009f
        L_0x009e:
            return r6
        L_0x009f:
            float r0 = r4.A00     // Catch:{ all -> 0x00d3 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00d3 }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            r3 = 0
        L_0x00aa:
            if (r3 != 0) goto L_0x00c8
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r3 = X.C86164wN.A10(r15, r4, r0)     // Catch:{ all -> 0x00d3 }
            r7.A02 = r4     // Catch:{ all -> 0x00d3 }
            r7.A03 = r14     // Catch:{ all -> 0x00d3 }
            r0 = 0
            r7.A04 = r0     // Catch:{ all -> 0x00d3 }
            r7.A01 = r8     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = X.AnonymousClass6EJ.A00(r7, r3)     // Catch:{ all -> 0x00d3 }
            if (r0 != r6) goto L_0x00c5
            return r6
        L_0x00c2:
            X.AnonymousClass0OU.A00(r10)     // Catch:{ all -> 0x00d3 }
        L_0x00c5:
            r14.invoke()     // Catch:{ all -> 0x00d3 }
        L_0x00c8:
            r4.A01 = r1
            X.52a r0 = A04
            r4.A02 = r0
            r4.A03 = r5
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x00d3:
            r3 = move-exception
            r4.A01 = r1
            X.52a r0 = A04
            r4.A02 = r0
            r4.A03 = r5
            throw r3
        L_0x00dd:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r3 = X.C18180wK.A0a(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.A00(X.8n9, X.0ZU, X.0YY):java.lang.Object");
    }
}
