package androidx.compose.foundation;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass7Ja;
import X.AnonymousClass7KC;
import X.C146958n9;
import X.C147258p3;
import X.C147368pE;
import X.C147808px;
import X.C39142Kno;
import X.C81784oM;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1", f = "Clickable.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class ClickableKt$clickable$4$gesture$1$1$1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C147258p3 A03;
    public final /* synthetic */ C147368pE A04;
    public final /* synthetic */ C81784oM A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4$gesture$1$1$1(C147258p3 r2, C147368pE r3, C81784oM r4, C146958n9 r5, boolean z) {
        super(3, r5);
        this.A06 = z;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((AnonymousClass7KC) obj2).A00;
        boolean z = this.A06;
        ClickableKt$clickable$4$gesture$1$1$1 clickableKt$clickable$4$gesture$1$1$1 = new ClickableKt$clickable$4$gesture$1$1$1(this.A03, this.A04, this.A05, (C146958n9) obj3, z);
        clickableKt$clickable$4$gesture$1$1$1.A02 = obj;
        clickableKt$clickable$4$gesture$1$1$1.A01 = j;
        return clickableKt$clickable$4$gesture$1$1$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C147808px r4 = (C147808px) this.A02;
            long j = this.A01;
            if (this.A06) {
                C147258p3 r5 = this.A03;
                C147368pE r6 = this.A04;
                C81784oM r7 = this.A05;
                this.A00 = 1;
                if (AnonymousClass7Ja.A00(d0e, this, new ClickableKt$handlePressInteraction$2(r4, r5, r6, r7, (C146958n9) null, j)) == d0e) {
                    return d0e;
                }
            }
        }
        return Unit.A00;
    }
}
