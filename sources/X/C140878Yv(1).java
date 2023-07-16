package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8Yv  reason: invalid class name and case insensitive filesystem */
public final class C140878Yv extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C81784oM A01;
    public final /* synthetic */ C970867w A02;
    public final /* synthetic */ C304621k A03;
    public final /* synthetic */ AnonymousClass0ZU A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140878Yv(C81784oM r2, C970867w r3, C304621k r4, AnonymousClass0ZU r5, int i, boolean z) {
        super(3);
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = z;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i;
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(obj, 0);
        C123327Wm r8 = Modifier.A00;
        boolean z = true;
        AnonymousClass54z r7 = AnonymousClass7Kq.A02;
        Modifier A002 = AnonymousClass6EV.A00(r8.Cx6(r7), C18240wQ.A00(this.A01.getValue()));
        AnonymousClass0ZU r20 = this.A04;
        boolean z2 = this.A05;
        C304621k r9 = this.A03;
        C970867w r6 = this.A02;
        int i2 = this.A00;
        C146288ly A052 = AnonymousClass7KV.A05(A0H);
        Object A0p = C147188nY.A0p(A0H);
        Object A0n = C147188nY.A0n(A0H);
        Object A0m = C147188nY.A0m(A0H);
        AnonymousClass0ZU r11 = AnonymousClass74X.A00;
        AnonymousClass0YM A003 = C98236Es.A00(A002);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) A0H;
        C147188nY.A0w(A0H, r4, r11);
        AnonymousClass7W3.A0a(A0H, r4, A052, A0p);
        AnonymousClass7KP.A07(A0H, A0n, A0m, A003);
        A0H.Cvb(-1776430569);
        C147188nY r12 = A0H;
        AnonymousClass70V.A01(r12, (Modifier) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 7, 0);
        if (z2) {
            int ordinal = r9.ordinal();
            if (ordinal == 0) {
                i = 2131821947;
            } else if (ordinal == 1) {
                i = 2131821954;
            } else if (ordinal == 2) {
                i = 2131821927;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            str = AnonymousClass7JS.A01(A0H, i);
        } else {
            str = "";
        }
        Modifier A08 = AnonymousClass7K4.A08(AnonymousClass7Kq.A07(r8.Cx6(r7), (float) 44), 24);
        if (!(r6 == C970867w.Loading || r6 == C970867w.Success)) {
            z = false;
        }
        AnonymousClass6M6.A00((C147258p3) null, r12, A08, (C966466d) null, (C146458mH) null, str, r20, (i2 & 14) | 384, 120, false, z);
        AnonymousClass7W3.A0f(r4);
        return Unit.A00;
    }
}
