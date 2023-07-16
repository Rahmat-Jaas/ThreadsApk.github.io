package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import com.facebook.forker.Process;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {100, 146}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
/* renamed from: X.8Ag  reason: invalid class name and case insensitive filesystem */
public final class C137818Ag extends C27236EjA {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ UpdatableAnimationState A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137818Ag(UpdatableAnimationState updatableAnimationState, C146958n9 r2) {
        super(r2);
        this.A06 = updatableAnimationState;
    }

    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        return this.A06.A00(this, (AnonymousClass0ZU) null, (AnonymousClass0YY) null);
    }
}
