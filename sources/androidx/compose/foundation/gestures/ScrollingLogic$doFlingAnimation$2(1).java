package androidx.compose.foundation.gestures;

import X.AnonymousClass0MQ;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass7UY;
import X.C142708fS;
import X.C146958n9;
import X.C18220wO;
import X.C18240wQ;
import X.C39142Kno;
import X.C86104wH;
import X.C86164wN;
import X.C967266l;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollingLogic$doFlingAnimation$2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ ScrollingLogic A06;
    public final /* synthetic */ AnonymousClass0MQ A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, C146958n9 r3, AnonymousClass0MQ r4, long j) {
        super(2, r3);
        this.A06 = scrollingLogic;
        this.A07 = r4;
        this.A05 = j;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.A06, r8, this.A07, this.A05);
        scrollingLogic$doFlingAnimation$2.A04 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        AnonymousClass0MQ r8;
        long j;
        float intBitsToFloat;
        ScrollingLogic scrollingLogic2;
        long A0C;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            j = this.A01;
            r8 = (AnonymousClass0MQ) this.A03;
            scrollingLogic = (ScrollingLogic) this.A02;
            scrollingLogic2 = (ScrollingLogic) this.A04;
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            Object obj2 = this.A04;
            scrollingLogic = this.A06;
            AnonymousClass7UY r11 = new AnonymousClass7UY(scrollingLogic, C86164wN.A10(obj2, scrollingLogic, 24));
            r8 = this.A07;
            long j2 = this.A05;
            C142708fS r4 = scrollingLogic.A01;
            j = r8.A00;
            if (scrollingLogic.A02 == C967266l.Horizontal) {
                intBitsToFloat = C86104wH.A00(j2);
            } else {
                intBitsToFloat = Float.intBitsToFloat(C86104wH.A08(j2));
            }
            if (scrollingLogic.A06) {
                intBitsToFloat *= (float) -1;
            }
            this.A04 = scrollingLogic;
            this.A02 = scrollingLogic;
            this.A03 = r8;
            this.A01 = j;
            this.A00 = 1;
            obj = r4.CWZ(r11, this, intBitsToFloat);
            if (obj == d0e) {
                return d0e;
            }
            scrollingLogic2 = scrollingLogic;
        }
        float A002 = C18240wQ.A00(obj);
        if (scrollingLogic2.A06) {
            A002 *= (float) -1;
        }
        if (scrollingLogic.A02 == C967266l.Horizontal) {
            A0C = C86104wH.A0C(A002, Float.intBitsToFloat(C86104wH.A08(j)));
        } else {
            A0C = C86104wH.A0C(C86104wH.A00(j), A002);
        }
        r8.A00 = A0C;
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
