package androidx.compose.foundation;

import X.AnonymousClass0MQ;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass79V;
import X.AnonymousClass7Aj;
import X.AnonymousClass7FV;
import X.AnonymousClass7HB;
import X.AnonymousClass7UI;
import X.C142688fQ;
import X.C146958n9;
import X.C146968nA;
import X.C147168nV;
import X.C147368pE;
import X.C18220wO;
import X.C18230wP;
import X.C25817DsW;
import X.C39142Kno;
import X.C81784oM;
import X.C83224qz;
import X.C84714tk;
import X.C86084wF;
import X.D0E;
import android.view.View;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape0S0900000_I2;

@DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {365}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
public final class MagnifierKt$magnifier$4$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ AnonymousClass79V A04;
    public final /* synthetic */ C146968nA A05;
    public final /* synthetic */ C147368pE A06;
    public final /* synthetic */ C81784oM A07;
    public final /* synthetic */ C81784oM A08;
    public final /* synthetic */ C81784oM A09;
    public final /* synthetic */ C81784oM A0A;
    public final /* synthetic */ C81784oM A0B;
    public final /* synthetic */ C147168nV A0C;
    public final /* synthetic */ C86084wF A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$1(View view, AnonymousClass79V r3, C146968nA r4, C147368pE r5, C81784oM r6, C81784oM r7, C81784oM r8, C81784oM r9, C81784oM r10, C147168nV r11, C146958n9 r12, C86084wF r13, float f) {
        super(2, r12);
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = view;
        this.A0C = r11;
        this.A02 = f;
        this.A0D = r13;
        this.A0A = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A09 = r9;
        this.A06 = r5;
        this.A0B = r10;
    }

    public final C146958n9 create(Object obj, C146958n9 r16) {
        C146968nA r3 = this.A05;
        AnonymousClass79V r2 = this.A04;
        View view = this.A03;
        C147168nV r10 = this.A0C;
        float f = this.A02;
        C86084wF r12 = this.A0D;
        MagnifierKt$magnifier$4$1 magnifierKt$magnifier$4$1 = new MagnifierKt$magnifier$4$1(view, r2, r3, this.A06, this.A0A, this.A07, this.A08, this.A09, this.A0B, r10, r16, r12, f);
        magnifierKt$magnifier$4$1.A01 = obj;
        return magnifierKt$magnifier$4$1;
    }

    public final Object invokeSuspend(Object obj) {
        C142688fQ r5;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            r5 = (C142688fQ) this.A01;
            try {
                AnonymousClass0OU.A00(obj);
            } catch (Throwable th) {
                ((AnonymousClass7UI) r5).A00.dismiss();
                throw th;
            }
        } else {
            AnonymousClass0OU.A00(obj);
            C83224qz r10 = (C83224qz) this.A01;
            C146968nA r3 = this.A05;
            AnonymousClass79V r2 = this.A04;
            View view = this.A03;
            C147168nV r13 = this.A0C;
            r5 = r3.AFG(view, r2, r13, this.A02);
            AnonymousClass0MQ r9 = new AnonymousClass0MQ();
            Magnifier magnifier = ((AnonymousClass7UI) r5).A00;
            long A002 = AnonymousClass7FV.A00(magnifier.getWidth(), magnifier.getHeight());
            C81784oM r22 = this.A0A;
            AnonymousClass0YY r12 = (AnonymousClass0YY) r22.getValue();
            if (r12 != null) {
                r12.invoke(new AnonymousClass7HB(r13.CxF(AnonymousClass7FV.A02(A002))));
            }
            r9.A00 = A002;
            C18230wP.A1T(new KtSLambdaShape11S0100000_I2(r5, (C146958n9) null, 0), r10, this.A0D);
            C81784oM r14 = this.A07;
            C81784oM r15 = this.A08;
            C81784oM r32 = this.A09;
            C147368pE r1 = this.A06;
            C81784oM r18 = r22;
            AnonymousClass0MQ r17 = r9;
            C81784oM r16 = this.A0B;
            C84714tk A022 = AnonymousClass7Aj.A02(new KtLambdaShape0S0900000_I2(r13, r14, r15, r16, r17, r18, r5, r1, r32, 0));
            this.A01 = r5;
            this.A00 = 1;
            if (C25817DsW.A01(this, A022) == d0e) {
                return d0e;
            }
        }
        ((AnonymousClass7UI) r5).A00.dismiss();
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MagnifierKt$magnifier$4$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
