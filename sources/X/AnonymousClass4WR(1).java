package X;

import com.facebook.forker.Process;
import com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel", f = "DogfoodingAssistantViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1, 2}, l = {81, 92, 104, 104}, m = "updateUiStateWithGkAndQe", n = {"this", "data", "destination$iv$iv", "this", "data", "updatedGks", "destination$iv$iv", "updatedQes"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* renamed from: X.4WR  reason: invalid class name */
public final class AnonymousClass4WR extends C27236EjA {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ DogfoodingAssistantViewModel A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WR(DogfoodingAssistantViewModel dogfoodingAssistantViewModel, C146958n9 r2) {
        super(r2);
        this.A09 = dogfoodingAssistantViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.A08 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        return DogfoodingAssistantViewModel.A02((AnonymousClass19K) null, this.A09, this);
    }
}
