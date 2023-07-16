package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {451}, m = "animateSnap", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
/* renamed from: X.8Ac  reason: invalid class name and case insensitive filesystem */
public final class C137788Ac extends C27236EjA {
    public float A00;
    public float A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;

    public C137788Ac(C146958n9 r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A02 |= Process.WAIT_RESULT_TIMEOUT;
        return SnapFlingBehaviorKt.A01((C142638fL) null, (AnonymousClass7WW) null, (C142718fT) null, this, (AnonymousClass0YY) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
