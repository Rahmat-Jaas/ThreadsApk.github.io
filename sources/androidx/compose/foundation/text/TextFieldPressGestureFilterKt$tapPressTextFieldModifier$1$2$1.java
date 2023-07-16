package androidx.compose.foundation.text;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass7KC;
import X.C146958n9;
import X.C147258p3;
import X.C147368pE;
import X.C147808px;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C83224qz;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301100_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2;

@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C147258p3 A03;
    public final /* synthetic */ C147368pE A04;
    public final /* synthetic */ C83224qz A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(C147258p3 r2, C147368pE r3, C146958n9 r4, C83224qz r5) {
        super(3, r4);
        this.A05 = r5;
        this.A04 = r3;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((AnonymousClass7KC) obj2).A00;
        C83224qz r5 = this.A05;
        C147368pE r4 = this.A04;
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(this.A03, r4, (C146958n9) obj3, r5);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.A02 = obj;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.A01 = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            long j = this.A01;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0301100_I2(this.A03, this.A04, (C146958n9) null, j), this.A05, 3);
            this.A00 = 1;
            obj = ((C147808px) this.A02).D7p(this);
            if (obj == d0e) {
                return d0e;
            }
        }
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0311000_I2((Object) this.A04, A1X, (Object) this.A03, (C146958n9) null, 0), this.A05, 3);
        return Unit.A00;
    }
}
