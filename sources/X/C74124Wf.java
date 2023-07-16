package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.4Wf  reason: invalid class name and case insensitive filesystem */
public final class C74124Wf extends C39142Kno implements AnonymousClass0YP {
    public /* synthetic */ int A00;

    public C74124Wf(C146958n9 r2) {
        super(2, r2);
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        C74124Wf r1 = new C74124Wf(r4);
        r1.A00 = AnonymousClass0wJ.A04(obj);
        return r1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C74124Wf) create(Integer.valueOf(AnonymousClass0wJ.A04(obj)), (C146958n9) obj2)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        return Boolean.valueOf(C18180wK.A1X(this.A00));
    }
}
