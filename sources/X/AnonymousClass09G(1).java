package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.09G  reason: invalid class name */
public final class AnonymousClass09G extends AnonymousClass0DW {
    public float A00;
    public long A01;
    public long A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass09G r8 = (AnonymousClass09G) obj;
            return this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r3) {
        AnonymousClass09G r32 = (AnonymousClass09G) r3;
        this.A00 = r32.A00;
        this.A01 = r32.A01;
        this.A02 = r32.A02;
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        long j;
        AnonymousClass09G r52 = (AnonymousClass09G) r5;
        AnonymousClass09G r62 = (AnonymousClass09G) r6;
        if (r62 == null) {
            r62 = new AnonymousClass09G();
        }
        if (r52 == null) {
            r62.A00 = this.A00;
            r62.A01 = this.A01;
            j = this.A02;
        } else {
            r62.A00 = this.A00 - r52.A00;
            r62.A01 = this.A01 - r52.A01;
            j = this.A02 - r52.A02;
        }
        r62.A02 = j;
        return r62;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        long j;
        AnonymousClass09G r52 = (AnonymousClass09G) r5;
        AnonymousClass09G r62 = (AnonymousClass09G) r6;
        if (r62 == null) {
            r62 = new AnonymousClass09G();
        }
        if (r52 == null) {
            r62.A00 = this.A00;
            r62.A01 = this.A01;
            j = this.A02;
        } else {
            r62.A00 = this.A00 + r52.A00;
            r62.A01 = this.A01 + r52.A01;
            j = this.A02 + r52.A02;
        }
        r62.A02 = j;
        return r62;
    }

    public final int hashCode() {
        int i;
        float f = this.A00;
        if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        long j = this.A01;
        long j2 = this.A02;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceBatteryMetrics{batteryLevelPct=");
        sb.append(this.A00);
        sb.append(", batteryRealtimeMs=");
        sb.append(this.A01);
        sb.append(", chargingRealtimeMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
