package X;

/* renamed from: X.0St  reason: invalid class name and case insensitive filesystem */
public enum C05330St {
    A05("system_running_critical", 0),
    A06("system_running_low", 2),
    A07("system_running_low_bg", 3),
    A03("java_heap_almost_full", 4),
    A04("on_app_backgrounded", 5);
    
    public Integer A00;
    public String A01;

    /* access modifiers changed from: public */
    C05330St(String str, int i) {
        this.A01 = str;
        this.A00 = r1;
    }
}
