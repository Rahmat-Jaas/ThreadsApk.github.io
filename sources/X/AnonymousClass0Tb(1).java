package X;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: X.0Tb  reason: invalid class name */
public final class AnonymousClass0Tb {
    public final int A00;
    public final AnonymousClass09Y A01;
    public final C05410Tn A02;
    public final C05410Tn A03;
    public final AnonymousClass0Te A04;
    public final AnonymousClass09J A05 = new AnonymousClass09J();
    public final AnonymousClass0Ta A06;
    public final int[] A07 = new int[4];
    public final short[] A08;
    public final short[] A09;
    public final short[] A0A;
    public final short[] A0B;
    public final short[] A0C;
    public final short[][] A0D;
    public final short[][] A0E;
    public final short[][] A0F;
    public final short[][] A0G;

    public AnonymousClass0Tb(AnonymousClass09Y r15, AnonymousClass0Ta r16, int i, int i2, int i3) {
        Class<short> cls = short.class;
        this.A0F = (short[][]) Array.newInstance(cls, new int[]{12, 16});
        this.A09 = new short[12];
        this.A0A = new short[12];
        this.A0B = new short[12];
        this.A0C = new short[12];
        this.A0G = (short[][]) Array.newInstance(cls, new int[]{12, 16});
        this.A0D = (short[][]) Array.newInstance(cls, new int[]{4, 64});
        this.A0E = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.A08 = new short[16];
        this.A00 = (1 << i3) - 1;
        this.A02 = new C05410Tn(this);
        this.A03 = new C05410Tn(this);
        this.A01 = r15;
        this.A06 = r16;
        this.A04 = new AnonymousClass0Te(this, i, i2);
        A00();
    }

    public final void A00() {
        int[] iArr = this.A07;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.A05.A00 = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.A0F;
            if (i2 >= sArr.length) {
                break;
            }
            Arrays.fill(sArr[i2], 1024);
            i2++;
        }
        Arrays.fill(this.A09, 1024);
        Arrays.fill(this.A0A, 1024);
        Arrays.fill(this.A0B, 1024);
        Arrays.fill(this.A0C, 1024);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.A0G;
            if (i3 >= sArr2.length) {
                break;
            }
            Arrays.fill(sArr2[i3], 1024);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.A0D;
            if (i4 >= sArr3.length) {
                break;
            }
            Arrays.fill(sArr3[i4], 1024);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.A0E;
            if (i >= sArr4.length) {
                break;
            }
            Arrays.fill(sArr4[i], 1024);
            i++;
        }
        Arrays.fill(this.A08, 1024);
        AnonymousClass0Te r3 = this.A04;
        int i5 = 0;
        while (true) {
            AnonymousClass0Ti[] r1 = r3.A00;
            if (i5 < r1.length) {
                Arrays.fill(r1[i5].A00, 1024);
                i5++;
            } else {
                this.A02.A01();
                this.A03.A01();
                return;
            }
        }
    }
}
