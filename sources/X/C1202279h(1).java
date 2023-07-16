package X;

/* renamed from: X.79h  reason: invalid class name and case insensitive filesystem */
public abstract class C1202279h {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final int A01(AnonymousClass67E r3) {
        int A04 = C18230wP.A04(r3, 0);
        if (A04 == 0) {
            throw C18190wL.A0a("Cannot get presentedItems for loadType: REFRESH");
        } else if (A04 == 1) {
            return this.A03;
        } else {
            if (A04 == 2) {
                return this.A02;
            }
            throw AnonymousClass4VZ.A00();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1202279h)) {
            return false;
        }
        C1202279h r4 = (C1202279h) obj;
        return this.A03 == r4.A03 && this.A02 == r4.A02 && this.A00 == r4.A00 && this.A01 == r4.A01;
    }

    public static void A00(C1202279h r1, StringBuilder sb) {
        sb.append(r1.A03);
        sb.append(",\n            |    presentedItemsAfter=");
        sb.append(r1.A02);
        sb.append(",\n            |    originalPageOffsetFirst=");
        sb.append(r1.A00);
        sb.append(",\n            |    originalPageOffsetLast=");
        sb.append(r1.A01);
    }

    public int hashCode() {
        return this.A03 + this.A02 + this.A00 + this.A01;
    }

    public C1202279h(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
