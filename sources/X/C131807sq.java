package X;

/* renamed from: X.7sq  reason: invalid class name and case insensitive filesystem */
public final class C131807sq implements C41882MfV {
    public final AnonymousClass24V A00;
    public final Integer A01;

    public /* synthetic */ C131807sq(Integer num) {
        AnonymousClass24V r0 = AnonymousClass24V.TYPE_CHEVRON;
        this.A01 = num;
        this.A00 = r0;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C131807sq r4 = (C131807sq) obj;
        C04220Ms.A0B(r4, 0);
        if (!C04220Ms.A0I(this.A01, r4.A01) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(2131821376);
    }
}
