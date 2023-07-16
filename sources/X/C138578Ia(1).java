package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8Ia  reason: invalid class name and case insensitive filesystem */
public final class C138578Ia extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138578Ia(float f, long j, long j2) {
        super(1);
        this.A00 = f;
        this.A01 = j;
        this.A02 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C147848q1 r8 = (C147848q1) obj;
        C04220Ms.A0B(r8, 0);
        float CxL = r8.CxL(AnonymousClass73T.A00);
        long BCH = r8.BCH();
        float A022 = AnonymousClass7JK.A02(BCH) / ((float) 2);
        long A0C = C86104wH.A0C(A022, AnonymousClass7JK.A00(BCH) - r8.CxL(this.A00));
        long A0C2 = C86104wH.A0C(A022, C147848q1.A00(r8));
        r8.AJ3((C104136bI) null, (C29) null, CxL + ((float) 1), 1.0f, 0, 3, this.A01, A0C, A0C2);
        long BCH2 = r8.BCH();
        float A023 = AnonymousClass7JK.A02(BCH2);
        float A002 = AnonymousClass7JK.A00(BCH2);
        long j = this.A02;
        C146708mj Ae6 = r8.Ae6();
        AnonymousClass7X9 r5 = (AnonymousClass7X9) Ae6;
        C121167El r3 = r5.A01.A02;
        long A003 = C121167El.A00(r3);
        r5.A00.ADO(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A023, A002, 1);
        C147848q1 r21 = r8;
        r21.AIp((C104136bI) null, C877353x.A00, CxL / 2.0f, 1.0f, 3, j, A0C2);
        C146708mj.A00(r3, Ae6, A003);
        return Unit.A00;
    }
}
