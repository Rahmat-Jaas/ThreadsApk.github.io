package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape0S1901000_I2;
import kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3;

/* renamed from: X.8Ta  reason: invalid class name */
public final class AnonymousClass8Ta extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ C147368pE A02;
    public final /* synthetic */ AnonymousClass06E A03;
    public final /* synthetic */ C10300i6 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ AnonymousClass0YP A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Ta(C147368pE r2, C147368pE r3, AnonymousClass06E r4, C10300i6 r5, String str, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0YY r9, AnonymousClass0YY r10, AnonymousClass0YP r11, int i, boolean z) {
        super(2);
        this.A04 = r5;
        this.A01 = r2;
        this.A0B = z;
        this.A06 = r7;
        this.A03 = r4;
        this.A02 = r3;
        this.A0A = r11;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
        this.A05 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r15 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r15.BCM()) {
            AnonymousClass59F A002 = AnonymousClass6ND.A00(r15);
            C10300i6 r7 = this.A04;
            C884958x A003 = AnonymousClass6NC.A00(r15, r7, new C114586tX[]{A002});
            C147368pE r3 = this.A01;
            Object value = r3.getValue();
            if (value != null) {
                r15.Cvb(529963555);
                AnonymousClass7K5.A05(r15, Unit.A00, new KtSLambdaShape1S0300000_I2(r3, value, A003, (C146958n9) null, 12));
            } else {
                r15.Cvb(529963683);
                if (r7.isLoggedIn() && !this.A0B) {
                    AnonymousClass6O5.A00(r15, new KtLambdaShape19S0200000_I2_3(33, A003, this.A06), 0);
                }
            }
            AnonymousClass7W3.A0z(r15, false);
            AnonymousClass06E r4 = this.A03;
            C147368pE r32 = this.A02;
            AnonymousClass0YP r12 = this.A0A;
            AnonymousClass0YY r10 = this.A08;
            AnonymousClass0YY r11 = this.A09;
            AnonymousClass59F r18 = A002;
            AnonymousClass6NE.A00(r15, (Modifier) null, (C142918fo) null, r18, AnonymousClass7JR.A00(r15, new KtLambdaShape0S1901000_I2(r32, r4, A003, A002, r7, this.A05, this.A07, r10, r11, r12, this.A00, 1), -952940360), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 12582920, 126, 0, 0, 0);
        } else {
            r15.CuJ();
        }
        return Unit.A00;
    }
}
