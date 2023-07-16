package X;

/* renamed from: X.0B7  reason: invalid class name */
public final class AnonymousClass0B7 extends AnonymousClass0DW {
    public long A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass0B7 r7 = (AnonymousClass0B7) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r3) {
        AnonymousClass0B7 r32 = (AnonymousClass0B7) r3;
        this.A01 = r32.A01;
        this.A00 = r32.A00;
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        long j;
        AnonymousClass0B7 r52 = (AnonymousClass0B7) r5;
        AnonymousClass0B7 r62 = (AnonymousClass0B7) r6;
        if (r62 == null) {
            r62 = new AnonymousClass0B7();
        }
        if (r52 == null) {
            r62.A01 = this.A01;
            j = this.A00;
        } else {
            r62.A01 = this.A01 - r52.A01;
            j = this.A00 - r52.A00;
        }
        r62.A00 = j;
        return r62;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        long j;
        AnonymousClass0B7 r52 = (AnonymousClass0B7) r5;
        AnonymousClass0B7 r62 = (AnonymousClass0B7) r6;
        if (r62 == null) {
            r62 = new AnonymousClass0B7();
        }
        if (r52 == null) {
            r62.A01 = this.A01;
            j = this.A00;
        } else {
            r62.A01 = this.A01 + r52.A01;
            j = this.A00 + r52.A00;
        }
        r62.A00 = j;
        return r62;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraMetrics{cameraPreviewTimeMs=");
        sb.append(this.A01);
        sb.append(", cameraOpenTimeMs=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
