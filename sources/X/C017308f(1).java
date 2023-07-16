package X;

import java.util.Map;

/* renamed from: X.08f  reason: invalid class name and case insensitive filesystem */
public final class C017308f extends AnonymousClass00O {
    public final /* synthetic */ AnonymousClass00X A00;
    public final /* synthetic */ AnonymousClass00R A01;
    public final /* synthetic */ String A02;

    public final void A00(C62233Xw r6, Object obj) {
        AnonymousClass00R r3 = this.A01;
        Map map = r3.A03;
        String str = this.A02;
        Number number = (Number) map.get(str);
        if (number != null) {
            r3.A00.add(str);
            try {
                r3.A03(this.A00, (C62233Xw) null, obj, number.intValue());
            } catch (Exception e) {
                r3.A00.remove(str);
                throw e;
            }
        } else {
            StringBuilder sb = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            sb.append(this.A00);
            sb.append(" and input ");
            sb.append(obj);
            sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(sb.toString());
        }
    }

    public C017308f(AnonymousClass00R r1, AnonymousClass00X r2, String str) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = r2;
    }
}
