package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;

/* renamed from: X.0jC  reason: invalid class name and case insensitive filesystem */
public final class C10930jC implements AnonymousClass0WP {
    public boolean A00 = true;
    public final /* synthetic */ C10940jD A01;

    public C10930jC(C10940jD r2) {
        this.A01 = r2;
    }

    public final void DAn(String str, String str2, int i) {
        if (this.A00) {
            this.A00 = false;
        } else {
            this.A01.A02.append(BasicHeaderValueParser.ELEM_DELIMITER);
        }
        StringBuilder sb = this.A01.A02;
        sb.append('\"');
        sb.append(AnonymousClass01V.A08(str));
        sb.append("\":\"");
        sb.append(AnonymousClass01V.A08(str2));
        sb.append('\"');
    }
}
