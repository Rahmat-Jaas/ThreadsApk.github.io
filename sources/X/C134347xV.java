package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7xV  reason: invalid class name and case insensitive filesystem */
public final class C134347xV implements C145008je {
    public final /* synthetic */ AnonymousClass5zN A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ C109326jp A03;

    public C134347xV(AnonymousClass5zN r1, AnonymousClass3HX r2, C127397h3 r3, C109326jp r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void CEE(float f, float f2, float f3, float f4) {
        C127397h3 r4 = this.A02;
        float A0G = r4.A0G(36, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        float round = A0G * ((float) Math.round(f / A0G));
        float A0G2 = r4.A0G(36, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        float round2 = A0G2 * ((float) Math.round(f2 / A0G2));
        C109326jp r3 = this.A03;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A03(AnonymousClass3WF.A00((double) round), 0);
        C122047Jt.A03(this.A01, r4, C86154wM.A0S(A002, AnonymousClass3WF.A00((double) round2), 1), r3);
    }
}
