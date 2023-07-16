package X;

import androidx.compose.foundation.pager.PagerState;
import com.facebook.forker.Process;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {292, 317, 329}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction", "this", "animationSpec", "pageOffsetFraction", "targetPage", "preJumpPosition", "this"}, s = {"L$0", "L$1", "I$0", "F$0", "L$0", "L$1", "F$0", "I$0", "I$1", "L$0"})
/* renamed from: X.8Ai  reason: invalid class name and case insensitive filesystem */
public final class C137838Ai extends C27236EjA {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ PagerState A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137838Ai(PagerState pagerState, C146958n9 r2) {
        super(r2);
        this.A07 = pagerState;
    }

    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A03 |= Process.WAIT_RESULT_TIMEOUT;
        return this.A07.A08((C142638fL) null, this, 0);
    }
}
