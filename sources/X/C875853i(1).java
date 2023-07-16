package X;

/* renamed from: X.53i  reason: invalid class name and case insensitive filesystem */
public final class C875853i extends AnonymousClass7YG implements C147768ps {
    public float A00;
    public float A01 = 8.0f;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public long A06;
    public long A07;
    public C142918fo A08;
    public AnonymousClass0YY A09;
    public boolean A0A;

    public final /* synthetic */ int BfA(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FQ.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int BfD(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FQ.A01(r2, r3, this, i);
    }

    public final C146098ld Bg3(C147578pZ r5, C147618pd r6, long j) {
        C04220Ms.A0B(r5, 1);
        C123657Xy Bg4 = r5.Bg4(j);
        return C147618pd.A00(r6, C86164wN.A11(this, Bg4, 8), Bg4.A01, Bg4.A00);
    }

    public final /* synthetic */ int BgL(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FQ.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int BgO(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FQ.A03(r2, r3, this, i);
    }

    public C875853i(C142918fo r2, float f, float f2, float f3, float f4, long j, long j2, long j3, boolean z) {
        this.A03 = f;
        this.A04 = f2;
        this.A00 = f3;
        this.A02 = f4;
        this.A07 = j;
        this.A08 = r2;
        this.A0A = z;
        this.A05 = j2;
        this.A06 = j3;
        this.A09 = C86154wM.A10(this, 21);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SimpleGraphicsLayerModifier(scaleX=");
        A0s.append(this.A03);
        A0s.append(", scaleY=");
        A0s.append(this.A04);
        A0s.append(", alpha = ");
        C86104wH.A1U(A0s, this.A00);
        A0s.append(this.A02);
        A0s.append(", cameraDistance=");
        A0s.append(this.A01);
        A0s.append(", transformOrigin=");
        A0s.append(AnonymousClass00U.A0G("TransformOrigin(packedValue=", ')', this.A07));
        A0s.append(", shape=");
        A0s.append(this.A08);
        A0s.append(", clip=");
        A0s.append(this.A0A);
        A0s.append(", renderEffect=");
        A0s.append((Object) null);
        A0s.append(", ambientShadowColor=");
        C86154wM.A18(this.A05, A0s);
        A0s.append(", spotShadowColor=");
        C86154wM.A18(this.A06, A0s);
        A0s.append(", compositingStrategy=");
        A0s.append(AnonymousClass00U.A0E("CompositingStrategy(value=", ')', 0));
        return C86114wI.A0q(A0s, ')');
    }

    public final /* synthetic */ void ANV() {
        C121847Ik.A01(this).ANV();
    }
}
