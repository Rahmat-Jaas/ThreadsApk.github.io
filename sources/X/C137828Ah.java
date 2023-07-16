package X;

import com.facebook.forker.Process;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.effectcollection.EffectCollectionService", f = "EffectCollectionService.kt", i = {0, 0, 0, 0}, l = {360, 363}, m = "addCollection", n = {"this", "effectCollection", "override", "fromServer"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
/* renamed from: X.8Ah  reason: invalid class name and case insensitive filesystem */
public final class C137828Ah extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ EffectCollectionService A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137828Ah(EffectCollectionService effectCollectionService, C146958n9 r2) {
        super(r2);
        this.A06 = effectCollectionService;
    }

    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return this.A06.A09((C113756s5) null, this, false, false);
    }
}
