package X;

/* renamed from: X.046  reason: invalid class name */
public final class AnonymousClass046 implements C02940Dm {
    public final /* bridge */ /* synthetic */ void Cdb(AnonymousClass0DW r8, C02930Dl r9) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AnonymousClass07p r82 = (AnonymousClass07p) r8;
        int i = r82.A04;
        if (i == 0) {
            z = false;
        } else {
            r9.A5R("mqtt_full_power_time_s", i);
            z = true;
        }
        int i2 = r82.A05;
        if (i2 == 0) {
            z2 = false;
        } else {
            r9.A5R("mqtt_low_power_time_s", i2);
            z2 = true;
        }
        boolean z15 = z | z2;
        long j = r82.A0D;
        if (j == 0) {
            z3 = false;
        } else {
            r9.A5S("mqtt_tx_bytes", j);
            z3 = true;
        }
        boolean z16 = z15 | z3;
        long j2 = r82.A0C;
        if (j2 == 0) {
            z4 = false;
        } else {
            r9.A5S("mqtt_rx_bytes", j2);
            z4 = true;
        }
        boolean z17 = z16 | z4;
        int i3 = r82.A06;
        if (i3 == 0) {
            z5 = false;
        } else {
            r9.A5R("mqtt_request_count", i3);
            z5 = true;
        }
        boolean z18 = z17 | z5;
        int i4 = r82.A07;
        if (i4 == 0) {
            z6 = false;
        } else {
            r9.A5R("mqtt_wakeup_count", i4);
            z6 = true;
        }
        boolean z19 = z18 | z6;
        int i5 = r82.A00;
        if (i5 == 0) {
            z7 = false;
        } else {
            r9.A5R("liger_full_power_time_s", i5);
            z7 = true;
        }
        boolean z20 = z19 | z7;
        int i6 = r82.A01;
        if (i6 == 0) {
            z8 = false;
        } else {
            r9.A5R("liger_low_power_time_s", i6);
            z8 = true;
        }
        boolean z21 = z20 | z8;
        long j3 = r82.A0B;
        if (j3 == 0) {
            z9 = false;
        } else {
            r9.A5S("liger_tx_bytes", j3);
            z9 = true;
        }
        boolean z22 = z21 | z9;
        long j4 = r82.A0A;
        if (j4 == 0) {
            z10 = false;
        } else {
            r9.A5S("liger_rx_bytes", j4);
            z10 = true;
        }
        boolean z23 = z22 | z10;
        int i7 = r82.A02;
        if (i7 == 0) {
            z11 = false;
        } else {
            r9.A5R("liger_request_count", i7);
            z11 = true;
        }
        boolean z24 = z23 | z11;
        int i8 = r82.A03;
        if (i8 == 0) {
            z12 = false;
        } else {
            r9.A5R("liger_wakeup_count", i8);
            z12 = true;
        }
        boolean z25 = z24 | z12;
        int i9 = r82.A08;
        if (i9 == 0) {
            z13 = false;
        } else {
            r9.A5R("proxygen_active_radio_time_s", i9);
            z13 = true;
        }
        boolean z26 = z25 | z13;
        int i10 = r82.A09;
        if (i10 == 0) {
            z14 = false;
        } else {
            r9.A5R("proxygen_tail_radio_time_s", i10);
            z14 = true;
        }
        if (z14 || z26) {
            r9.A5R("proxygen_meter_version", 1);
        }
    }
}
