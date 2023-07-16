package X;

import com.facebook.forker.Process;
import com.instagram.compose.core.SwipeableState;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.core.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {153, 177, 180}, m = "processNewAnchors$fbandroid_java_com_instagram_compose_core_core", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* renamed from: X.8Ae  reason: invalid class name and case insensitive filesystem */
public final class C137808Ae extends C27236EjA {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ SwipeableState A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137808Ae(SwipeableState swipeableState, C146958n9 r2) {
        super(r2);
        this.A05 = swipeableState;
    }

    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        return this.A05.A02((Map) null, (Map) null, this);
    }
}
