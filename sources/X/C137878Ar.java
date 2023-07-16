package X;

import androidx.paging.PageEvent$Insert;
import com.facebook.forker.Process;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0}, l = {128}, m = "map", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", "it", "destination$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$5", "L$7"})
/* renamed from: X.8Ar  reason: invalid class name and case insensitive filesystem */
public final class C137878Ar extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public /* synthetic */ Object A0C;
    public final /* synthetic */ PageEvent$Insert A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137878Ar(PageEvent$Insert pageEvent$Insert, C146958n9 r2) {
        super(r2);
        this.A0D = pageEvent$Insert;
    }

    public final Object invokeSuspend(Object obj) {
        this.A0C = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return this.A0D.A01(this, (AnonymousClass0YP) null);
    }
}
