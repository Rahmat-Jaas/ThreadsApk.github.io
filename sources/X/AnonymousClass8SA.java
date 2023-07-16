package X;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SA  reason: invalid class name */
public final class AnonymousClass8SA extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1203679w A02;
    public final /* synthetic */ C1203779x A03;
    public final /* synthetic */ MutableTransitionState A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0YM A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SA(C1203679w r2, C1203779x r3, MutableTransitionState mutableTransitionState, Modifier modifier, String str, AnonymousClass0YM r7, int i, int i2) {
        super(2);
        this.A04 = mutableTransitionState;
        this.A05 = modifier;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = str;
        this.A07 = r7;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass7JP.A02(this.A02, this.A03, this.A04, A0H, this.A05, this.A06, this.A07, this.A00 | 1, this.A01);
        return Unit.A00;
    }
}
