package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal;
import com.facebook.forker.Process;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", i = {0, 0, 0, 1}, l = {94, 96}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
/* renamed from: X.8Ad  reason: invalid class name and case insensitive filesystem */
public final class C137798Ad extends C27236EjA {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ NestedScrollModifierLocal A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137798Ad(NestedScrollModifierLocal nestedScrollModifierLocal, C146958n9 r2) {
        super(r2);
        this.A05 = nestedScrollModifierLocal;
    }

    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return this.A05.CBn(this, 0, 0);
    }
}
