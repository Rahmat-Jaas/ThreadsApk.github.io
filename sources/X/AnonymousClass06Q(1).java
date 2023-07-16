package X;

/* renamed from: X.06Q  reason: invalid class name */
public final class AnonymousClass06Q implements C02940Dm {
    public final /* bridge */ /* synthetic */ void Cdb(AnonymousClass0DW r6, C02930Dl r7) {
        AnonymousClass09R r62 = (AnonymousClass09R) r6;
        double d = r62.A03;
        if (d != 0.0d) {
            r7.A5Q("cpu_user_time_s", d);
        }
        double d2 = r62.A02;
        if (d2 != 0.0d) {
            r7.A5Q("cpu_system_time_s", d2);
        }
        double d3 = r62.A01;
        if (d3 != 0.0d) {
            r7.A5Q("child_cpu_user_time_s", d3);
        }
        double d4 = r62.A00;
        if (d4 != 0.0d) {
            r7.A5Q("child_cpu_system_time_s", d4);
        }
    }
}
