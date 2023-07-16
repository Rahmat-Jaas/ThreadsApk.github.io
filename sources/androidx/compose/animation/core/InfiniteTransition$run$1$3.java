package androidx.compose.animation.core;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18180wK;
import X.C18240wQ;
import X.C39142Kno;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InfiniteTransition$run$1$3 extends C39142Kno implements AnonymousClass0YP {
    public /* synthetic */ float A00;

    public InfiniteTransition$run$1$3(C146958n9 r2) {
        super(2, r2);
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        InfiniteTransition$run$1$3 infiniteTransition$run$1$3 = new InfiniteTransition$run$1$3(r4);
        infiniteTransition$run$1$3.A00 = C18240wQ.A00(obj);
        return infiniteTransition$run$1$3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InfiniteTransition$run$1$3) create(Float.valueOf(C18240wQ.A00(obj)), (C146958n9) obj2)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        return Boolean.valueOf(C18180wK.A1X((this.A00 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (this.A00 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1))));
    }
}
