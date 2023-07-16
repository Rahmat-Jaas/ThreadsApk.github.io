package androidx.compose.ui.viewinterop;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass7HA;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C872050o;
import X.D0E;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {523, 528}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidViewHolder$onNestedFling$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C872050o A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(C872050o r2, C146958n9 r3, long j, boolean z) {
        super(2, r3);
        this.A03 = z;
        this.A02 = r2;
        this.A01 = j;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        return new AndroidViewHolder$onNestedFling$1(this.A02, r8, this.A01, this.A03);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            boolean z = this.A03;
            NestedScrollDispatcher nestedScrollDispatcher = this.A02.A0F;
            if (!z) {
                j = AnonymousClass7HA.A01;
                j2 = this.A01;
                this.A00 = 1;
            } else {
                j = this.A01;
                j2 = AnonymousClass7HA.A01;
                this.A00 = 2;
            }
            if (nestedScrollDispatcher.A01(this, j, j2) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AndroidViewHolder$onNestedFling$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
